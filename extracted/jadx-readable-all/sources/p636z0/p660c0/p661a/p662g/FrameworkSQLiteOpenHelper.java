package p636z0.p660c0.p661a.p662g;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p636z0.p660c0.p661a.SupportSQLiteDatabase;
import p636z0.p660c0.p661a.SupportSQLiteOpenHelper;

/* JADX INFO: renamed from: z0.c0.a.g.b, reason: use source file name */
/* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {

    /* JADX INFO: renamed from: f */
    public final Context f35335f;

    /* JADX INFO: renamed from: g */
    public final String f35336g;

    /* JADX INFO: renamed from: h */
    public final SupportSQLiteOpenHelper.a f35337h;

    /* JADX INFO: renamed from: i */
    public final boolean f35338i;

    /* JADX INFO: renamed from: j */
    public final Object f35339j = new Object();

    /* JADX INFO: renamed from: k */
    public a f35340k;

    /* JADX INFO: renamed from: l */
    public boolean f35341l;

    /* JADX INFO: renamed from: z0.c0.a.g.b$a */
    /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.java */
    public static class a extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: f */
        public final FrameworkSQLiteDatabase[] f35342f;

        /* JADX INFO: renamed from: g */
        public final SupportSQLiteOpenHelper.a f35343g;

        /* JADX INFO: renamed from: h */
        public boolean f35344h;

        /* JADX INFO: renamed from: z0.c0.a.g.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.java */
        public class C8562a implements DatabaseErrorHandler {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ SupportSQLiteOpenHelper.a f35345a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ FrameworkSQLiteDatabase[] f35346b;

            public C8562a(SupportSQLiteOpenHelper.a aVar, FrameworkSQLiteDatabase[] frameworkSQLiteDatabaseArr) {
                this.f35345a = aVar;
                this.f35346b = frameworkSQLiteDatabaseArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                SupportSQLiteOpenHelper.a aVar = this.f35345a;
                FrameworkSQLiteDatabase frameworkSQLiteDatabaseM15056f = a.m15056f(this.f35346b, sQLiteDatabase);
                Objects.requireNonNull(aVar);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + frameworkSQLiteDatabaseM15056f.m15053c());
                if (!frameworkSQLiteDatabaseM15056f.isOpen()) {
                    aVar.m15048a(frameworkSQLiteDatabaseM15056f.m15053c());
                    return;
                }
                List<Pair<String, String>> listM15052a = null;
                try {
                    try {
                        listM15052a = frameworkSQLiteDatabaseM15056f.m15052a();
                    } finally {
                        if (listM15052a != null) {
                            Iterator<Pair<String, String>> it = listM15052a.iterator();
                            while (it.hasNext()) {
                                aVar.m15048a((String) it.next().second);
                            }
                        } else {
                            aVar.m15048a(frameworkSQLiteDatabaseM15056f.m15053c());
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    frameworkSQLiteDatabaseM15056f.close();
                } catch (IOException unused2) {
                }
            }
        }

        public a(Context context, String str, FrameworkSQLiteDatabase[] frameworkSQLiteDatabaseArr, SupportSQLiteOpenHelper.a aVar) {
            super(context, str, null, aVar.f35326a, new C8562a(aVar, frameworkSQLiteDatabaseArr));
            this.f35343g = aVar;
            this.f35342f = frameworkSQLiteDatabaseArr;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x000e  */
        /* JADX INFO: renamed from: f */
        public static FrameworkSQLiteDatabase m15056f(FrameworkSQLiteDatabase[] frameworkSQLiteDatabaseArr, SQLiteDatabase sQLiteDatabase) {
            FrameworkSQLiteDatabase frameworkSQLiteDatabase = frameworkSQLiteDatabaseArr[0];
            if (frameworkSQLiteDatabase == null) {
                frameworkSQLiteDatabaseArr[0] = new FrameworkSQLiteDatabase(sQLiteDatabase);
            } else {
                if (!(frameworkSQLiteDatabase.f35332g == sQLiteDatabase)) {
                    frameworkSQLiteDatabaseArr[0] = new FrameworkSQLiteDatabase(sQLiteDatabase);
                }
            }
            return frameworkSQLiteDatabaseArr[0];
        }

        /* JADX INFO: renamed from: a */
        public synchronized SupportSQLiteDatabase m15057a() {
            this.f35344h = false;
            SQLiteDatabase readableDatabase = getReadableDatabase();
            if (!this.f35344h) {
                return m15058c(readableDatabase);
            }
            close();
            return m15057a();
        }

        /* JADX INFO: renamed from: c */
        public FrameworkSQLiteDatabase m15058c(SQLiteDatabase sQLiteDatabase) {
            return m15056f(this.f35342f, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f35342f[0] = null;
        }

        /* JADX INFO: renamed from: h */
        public synchronized SupportSQLiteDatabase m15059h() {
            this.f35344h = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!this.f35344h) {
                return m15058c(writableDatabase);
            }
            close();
            return m15059h();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f35343g.mo14542b(m15056f(this.f35342f, sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f35343g.mo14543c(m15056f(this.f35342f, sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f35344h = true;
            this.f35343g.mo14544d(m15056f(this.f35342f, sQLiteDatabase), i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f35344h) {
                return;
            }
            this.f35343g.mo14545e(m15056f(this.f35342f, sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f35344h = true;
            this.f35343g.mo14546f(m15056f(this.f35342f, sQLiteDatabase), i, i2);
        }
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.a aVar, boolean z) {
        this.f35335f = context;
        this.f35336g = str;
        this.f35337h = aVar;
        this.f35338i = z;
    }

    /* JADX INFO: renamed from: a */
    public final a m15054a() {
        a aVar;
        synchronized (this.f35339j) {
            if (this.f35340k == null) {
                FrameworkSQLiteDatabase[] frameworkSQLiteDatabaseArr = new FrameworkSQLiteDatabase[1];
                if (Build.VERSION.SDK_INT < 23 || this.f35336g == null || !this.f35338i) {
                    this.f35340k = new a(this.f35335f, this.f35336g, frameworkSQLiteDatabaseArr, this.f35337h);
                } else {
                    this.f35340k = new a(this.f35335f, new File(this.f35335f.getNoBackupFilesDir(), this.f35336g).getAbsolutePath(), frameworkSQLiteDatabaseArr, this.f35337h);
                }
                this.f35340k.setWriteAheadLoggingEnabled(this.f35341l);
            }
            aVar = this.f35340k;
        }
        return aVar;
    }

    /* JADX INFO: renamed from: c */
    public SupportSQLiteDatabase m15055c() {
        return m15054a().m15057a();
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m15054a().close();
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteOpenHelper
    /* JADX INFO: renamed from: e */
    public SupportSQLiteDatabase mo14509e() {
        return m15054a().m15059h();
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return this.f35336g;
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f35339j) {
            a aVar = this.f35340k;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.f35341l = z;
        }
    }
}
