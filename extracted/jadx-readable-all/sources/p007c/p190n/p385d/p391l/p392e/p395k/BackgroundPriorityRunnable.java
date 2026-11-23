package p007c.p190n.p385d.p391l.p392e.p395k;

import android.os.Process;

/* JADX INFO: renamed from: c.n.d.l.e.k.d, reason: use source file name */
/* JADX INFO: compiled from: BackgroundPriorityRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BackgroundPriorityRunnable implements Runnable {
    /* JADX INFO: renamed from: a */
    public abstract void mo11733a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        mo11733a();
    }
}
