package p007c.p190n.p194b.p266d.p314j.p323i;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;

/* JADX INFO: renamed from: c.n.b.d.j.i.h */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4073h extends AbstractC4070e {

    /* JADX INFO: renamed from: a */
    public final C4072g f23017a = new C4072g();

    @Override // p007c.p190n.p194b.p266d.p314j.p323i.AbstractC4070e
    /* JADX INFO: renamed from: a */
    public final void mo9332a(Throwable th, Throwable th2) {
        List<Throwable> listPutIfAbsent;
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        C4072g c4072g = this.f23017a;
        ReferenceQueue<Throwable> referenceQueue = c4072g.f23016b;
        while (true) {
            Reference<? extends Throwable> referencePoll = referenceQueue.poll();
            if (referencePoll == null) {
                break;
            }
            c4072g.f23015a.remove(referencePoll);
            referenceQueue = c4072g.f23016b;
        }
        List<Throwable> vector = c4072g.f23015a.get(new C4071f(th, null));
        if (vector == null && (listPutIfAbsent = c4072g.f23015a.putIfAbsent(new C4071f(th, c4072g.f23016b), (vector = new Vector<>(2)))) != null) {
            vector = listPutIfAbsent;
        }
        vector.add(th2);
    }
}
