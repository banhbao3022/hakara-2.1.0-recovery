package p007c.p190n.p194b.p266d.p314j.p325k;

import java.lang.ref.Reference;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

/* JADX INFO: renamed from: c.n.b.d.j.k.n3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4265n3 extends AbstractC4209j3 {

    /* JADX INFO: renamed from: a */
    public final C4251m3 f23335a = new C4251m3();

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4209j3
    /* JADX INFO: renamed from: a */
    public final void mo9860a(Throwable th, Throwable th2) {
        List<Throwable> listPutIfAbsent;
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
        C4251m3 c4251m3 = this.f23335a;
        for (Reference<? extends Throwable> referencePoll = c4251m3.f23313b.poll(); referencePoll != null; referencePoll = c4251m3.f23313b.poll()) {
            c4251m3.f23312a.remove(referencePoll);
        }
        List<Throwable> vector = c4251m3.f23312a.get(new C4237l3(th, null));
        if (vector == null && (listPutIfAbsent = c4251m3.f23312a.putIfAbsent(new C4237l3(th, c4251m3.f23313b), (vector = new Vector<>(2)))) != null) {
            vector = listPutIfAbsent;
        }
        vector.add(th2);
    }
}
