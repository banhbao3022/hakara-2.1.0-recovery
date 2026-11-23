package p636z0.p641a0;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.Objects;
import java.util.concurrent.Callable;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p641a0.p643b0.CopyLock;
import p636z0.p641a0.p643b0.DBUtil;
import p636z0.p660c0.p661a.SupportSQLiteDatabase;
import p636z0.p660c0.p661a.SupportSQLiteOpenHelper;
import p636z0.p660c0.p661a.p662g.FrameworkSQLiteOpenHelper;
import p636z0.p660c0.p661a.p662g.FrameworkSQLiteOpenHelperFactory;

/* JADX INFO: renamed from: z0.a0.w, reason: use source file name */
/* JADX INFO: compiled from: SQLiteCopyOpenHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class SQLiteCopyOpenHelper2 implements SupportSQLiteOpenHelper, DelegatingOpenHelper {

    /* JADX INFO: renamed from: f */
    public final Context f34357f;

    /* JADX INFO: renamed from: g */
    public final String f34358g;

    /* JADX INFO: renamed from: h */
    public final File f34359h;

    /* JADX INFO: renamed from: i */
    public final Callable<InputStream> f34360i;

    /* JADX INFO: renamed from: j */
    public final int f34361j;

    /* JADX INFO: renamed from: k */
    public final SupportSQLiteOpenHelper f34362k;

    /* JADX INFO: renamed from: l */
    public DatabaseConfiguration f34363l;

    /* JADX INFO: renamed from: m */
    public boolean f34364m;

    @Override // p636z0.p641a0.DelegatingOpenHelper
    /* JADX INFO: renamed from: a */
    public SupportSQLiteOpenHelper mo14508a() {
        return this.f34362k;
    }

    /* JADX INFO: renamed from: c */
    public final void m14557c(File file, boolean z) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.f34358g != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.f34357f.getAssets().open(this.f34358g));
        } else if (this.f34359h != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f34359h).getChannel();
        } else {
            Callable<InputStream> callable = this.f34360i;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
            } catch (Exception e) {
                throw new IOException("inputStreamCallable exception on call", e);
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f34357f.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream inputStreamNewInputStream = Channels.newInputStream(readableByteChannelNewChannel);
                OutputStream outputStreamNewOutputStream = Channels.newOutputStream(channel);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStreamNewInputStream.read(bArr);
                    if (i <= 0) {
                        break;
                    } else {
                        outputStreamNewOutputStream.write(bArr, 0, i);
                    }
                }
            } else {
                channel.transferFrom(readableByteChannelNewChannel, 0L, Long.MAX_VALUE);
            }
            channel.force(false);
            readableByteChannelNewChannel.close();
            channel.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                StringBuilder sbM1556G = outline.m1556G("Failed to create directories for ");
                sbM1556G.append(file.getAbsolutePath());
                throw new IOException(sbM1556G.toString());
            }
            DatabaseConfiguration databaseConfiguration = this.f34363l;
            if (databaseConfiguration != null && databaseConfiguration.f34247f != null) {
                String name = fileCreateTempFile.getName();
                try {
                    int iM14504c = DBUtil.m14504c(fileCreateTempFile);
                    new FrameworkSQLiteOpenHelperFactory();
                    Context context = this.f34357f;
                    SQLiteCopyOpenHelper sQLiteCopyOpenHelper = new SQLiteCopyOpenHelper(this, iM14504c);
                    if (context == null) {
                        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                    }
                    FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper = new FrameworkSQLiteOpenHelper(context, name, sQLiteCopyOpenHelper, false);
                    try {
                        if (z) {
                            frameworkSQLiteOpenHelper.mo14509e();
                        } else {
                            frameworkSQLiteOpenHelper.m15055c();
                        }
                        Objects.requireNonNull(this.f34363l.f34247f);
                        frameworkSQLiteOpenHelper.close();
                    } catch (Throwable th) {
                        frameworkSQLiteOpenHelper.close();
                        throw th;
                    }
                } catch (IOException e2) {
                    throw new RuntimeException("Malformed database file, unable to read version.", e2);
                }
            }
            if (fileCreateTempFile.renameTo(file)) {
                return;
            }
            StringBuilder sbM1556G2 = outline.m1556G("Failed to move intermediate file (");
            sbM1556G2.append(fileCreateTempFile.getAbsolutePath());
            sbM1556G2.append(") to destination (");
            sbM1556G2.append(file.getAbsolutePath());
            sbM1556G2.append(").");
            throw new IOException(sbM1556G2.toString());
        } catch (Throwable th2) {
            readableByteChannelNewChannel.close();
            channel.close();
            throw th2;
        }
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f34362k.close();
        this.f34364m = false;
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteOpenHelper
    /* JADX INFO: renamed from: e */
    public synchronized SupportSQLiteDatabase mo14509e() {
        if (!this.f34364m) {
            m14558f(true);
            this.f34364m = true;
        }
        return this.f34362k.mo14509e();
    }

    /* JADX INFO: renamed from: f */
    public final void m14558f(boolean z) {
        String databaseName = getDatabaseName();
        File databasePath = this.f34357f.getDatabasePath(databaseName);
        DatabaseConfiguration databaseConfiguration = this.f34363l;
        CopyLock copyLock = new CopyLock(databaseName, this.f34357f.getFilesDir(), databaseConfiguration == null || databaseConfiguration.f34253l);
        try {
            copyLock.f34203c.lock();
            if (copyLock.f34204d) {
                try {
                    FileChannel channel = new FileOutputStream(copyLock.f34202b).getChannel();
                    copyLock.f34205e = channel;
                    channel.lock();
                } catch (IOException e) {
                    throw new IllegalStateException("Unable to grab copy lock.", e);
                }
            }
            if (!databasePath.exists()) {
                try {
                    m14557c(databasePath, z);
                    copyLock.m14501a();
                    return;
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to copy database file.", e2);
                }
            }
            if (this.f34363l == null) {
                copyLock.m14501a();
                return;
            }
            try {
                int iM14504c = DBUtil.m14504c(databasePath);
                int i = this.f34361j;
                if (iM14504c == i) {
                    copyLock.m14501a();
                    return;
                }
                if (this.f34363l.m14512a(iM14504c, i)) {
                    copyLock.m14501a();
                    return;
                }
                if (this.f34357f.deleteDatabase(databaseName)) {
                    try {
                        m14557c(databasePath, z);
                    } catch (IOException e3) {
                        Log.w("ROOM", "Unable to copy database file.", e3);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                copyLock.m14501a();
                return;
            } catch (IOException e4) {
                Log.w("ROOM", "Unable to read database version.", e4);
                copyLock.m14501a();
                return;
            }
        } catch (Throwable th) {
            copyLock.m14501a();
            throw th;
        }
        copyLock.m14501a();
        throw th;
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return this.f34362k.getDatabaseName();
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f34362k.setWriteAheadLoggingEnabled(z);
    }
}
