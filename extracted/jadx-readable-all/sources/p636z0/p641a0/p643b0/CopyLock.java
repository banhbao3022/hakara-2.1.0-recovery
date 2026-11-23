package p636z0.p641a0.p643b0;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.a0.b0.a, reason: use source file name */
/* JADX INFO: compiled from: CopyLock.java */
/* JADX INFO: loaded from: classes.dex */
public class CopyLock {

    /* JADX INFO: renamed from: a */
    public static final Map<String, Lock> f34201a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final File f34202b;

    /* JADX INFO: renamed from: c */
    public final Lock f34203c;

    /* JADX INFO: renamed from: d */
    public final boolean f34204d;

    /* JADX INFO: renamed from: e */
    public FileChannel f34205e;

    public CopyLock(String str, File file, boolean z) {
        Lock reentrantLock;
        File file2 = new File(file, outline.m1599u(str, ".lck"));
        this.f34202b = file2;
        String absolutePath = file2.getAbsolutePath();
        Map<String, Lock> map = f34201a;
        synchronized (map) {
            reentrantLock = map.get(absolutePath);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(absolutePath, reentrantLock);
            }
        }
        this.f34203c = reentrantLock;
        this.f34204d = z;
    }

    /* JADX INFO: renamed from: a */
    public void m14501a() {
        FileChannel fileChannel = this.f34205e;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f34203c.unlock();
    }
}
