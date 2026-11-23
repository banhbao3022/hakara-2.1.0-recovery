package p636z0.p637a;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: z0.a.b, reason: use source file name */
/* JADX INFO: compiled from: OnBackPressedCallback.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class OnBackPressedCallback {

    /* JADX INFO: renamed from: a */
    public boolean f34167a;

    /* JADX INFO: renamed from: b */
    public CopyOnWriteArrayList<Cancellable> f34168b = new CopyOnWriteArrayList<>();

    public OnBackPressedCallback(boolean z) {
        this.f34167a = z;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo455a();

    /* JADX INFO: renamed from: b */
    public final void m14490b() {
        Iterator<Cancellable> it = this.f34168b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
