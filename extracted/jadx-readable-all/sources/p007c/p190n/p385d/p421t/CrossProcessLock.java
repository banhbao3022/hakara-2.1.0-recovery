package p007c.p190n.p385d.p421t;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* JADX INFO: renamed from: c.n.d.t.b, reason: use source file name */
/* JADX INFO: compiled from: CrossProcessLock.java */
/* JADX INFO: loaded from: classes.dex */
public class CrossProcessLock {

    /* JADX INFO: renamed from: a */
    public final FileChannel f27124a;

    /* JADX INFO: renamed from: b */
    public final FileLock f27125b;

    public CrossProcessLock(FileChannel fileChannel, FileLock fileLock) {
        this.f27124a = fileChannel;
        this.f27125b = fileLock;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static CrossProcessLock m12096a(Context context, String str) {
        Throwable e;
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new CrossProcessLock(channel, fileLockLock);
                } catch (IOException e2) {
                    e = e2;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e3) {
                    e = e3;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e4) {
                    e = e4;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e5) {
                e = e5;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e6) {
            e = e6;
            channel = null;
            fileLockLock = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m12097b() {
        try {
            this.f27125b.release();
            this.f27124a.close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }
}
