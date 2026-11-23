package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-base@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class m62 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap<l62, List<Throwable>> f16688a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* JADX INFO: renamed from: b */
    public final ReferenceQueue<Throwable> f16689b = new ReferenceQueue<>();

    /* JADX INFO: renamed from: a */
    public final List<Throwable> m7659a(Throwable th, boolean z) {
        ReferenceQueue<Throwable> referenceQueue = this.f16689b;
        while (true) {
            Reference<? extends Throwable> referencePoll = referenceQueue.poll();
            if (referencePoll == null) {
                break;
            }
            this.f16688a.remove(referencePoll);
            referenceQueue = this.f16689b;
        }
        List<Throwable> list = this.f16688a.get(new l62(th, null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> listPutIfAbsent = this.f16688a.putIfAbsent(new l62(th, this.f16689b), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}
