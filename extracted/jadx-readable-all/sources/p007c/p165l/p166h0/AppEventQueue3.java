package p007c.p165l.p166h0;

/* JADX INFO: renamed from: c.l.h0.h, reason: use source file name */
/* JADX INFO: compiled from: AppEventQueue.java */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventQueue3 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f4801f;

    public AppEventQueue3(int i) {
        this.f4801f = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        AppEventQueue.m2329a(this.f4801f);
    }
}
