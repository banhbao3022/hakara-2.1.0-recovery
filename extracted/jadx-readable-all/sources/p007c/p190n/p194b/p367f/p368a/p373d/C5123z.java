package p007c.p190n.p194b.p367f.p368a.p373d;

import java.lang.ref.Reference;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

/* JADX INFO: renamed from: c.n.b.f.a.d.z */
/* JADX INFO: loaded from: classes.dex */
public final class C5123z extends AbstractC5120w {

    /* JADX INFO: renamed from: a */
    public final C5122y f26075a = new C5122y();

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.AbstractC5120w
    /* JADX INFO: renamed from: a */
    public final void mo11527a(Throwable th, Throwable th2) {
        List<Throwable> listPutIfAbsent;
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
        C5122y c5122y = this.f26075a;
        while (true) {
            Reference<? extends Throwable> referencePoll = c5122y.f26074b.poll();
            if (referencePoll == null) {
                break;
            } else {
                c5122y.f26073a.remove(referencePoll);
            }
        }
        List<Throwable> vector = c5122y.f26073a.get(new C5121x(th, null));
        if (vector == null && (listPutIfAbsent = c5122y.f26073a.putIfAbsent(new C5121x(th, c5122y.f26074b), (vector = new Vector<>(2)))) != null) {
            vector = listPutIfAbsent;
        }
        vector.add(th2);
    }
}
