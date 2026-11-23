package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import android.util.LruCache;
import p007c.p190n.p194b.p266d.p290d.C2404l;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.h0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2459h0 extends LruCache<Integer, C2404l> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2450d f11309a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2459h0(C2450d c2450d, int i) {
        super(i);
        this.f11309a = c2450d;
    }

    @Override // android.util.LruCache
    public final /* synthetic */ void entryRemoved(boolean z, Integer num, C2404l c2404l, C2404l c2404l2) {
        Integer num2 = num;
        if (z) {
            this.f11309a.f11219g.add(num2);
        }
    }
}
