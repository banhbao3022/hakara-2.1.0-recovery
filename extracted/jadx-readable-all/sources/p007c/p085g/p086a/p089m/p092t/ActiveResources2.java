package p007c.p085g.p086a.p089m.p092t;

import java.util.Objects;

/* JADX INFO: renamed from: c.g.a.m.t.b, reason: use source file name */
/* JADX INFO: compiled from: ActiveResources.java */
/* JADX INFO: loaded from: classes.dex */
public class ActiveResources2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ActiveResources f3096f;

    public ActiveResources2(ActiveResources activeResources) {
        this.f3096f = activeResources;
    }

    @Override // java.lang.Runnable
    public void run() {
        ActiveResources activeResources = this.f3096f;
        Objects.requireNonNull(activeResources);
        while (true) {
            try {
                activeResources.m1733b((ActiveResources.b) activeResources.f3088d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
