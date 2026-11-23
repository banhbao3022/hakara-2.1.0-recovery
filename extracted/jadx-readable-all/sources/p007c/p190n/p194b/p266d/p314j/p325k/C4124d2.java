package p007c.p190n.p194b.p266d.p314j.p325k;

import android.database.ContentObserver;
import java.util.Iterator;

/* JADX INFO: renamed from: c.n.b.d.j.k.d2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4124d2 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C4096b2 f23110a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4124d2(C4096b2 c4096b2) {
        super(null);
        this.f23110a = c4096b2;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        C4096b2 c4096b2 = this.f23110a;
        synchronized (c4096b2.f23082f) {
            c4096b2.f23083g = null;
            AbstractC4292p2.f23395d.incrementAndGet();
        }
        synchronized (c4096b2) {
            Iterator<InterfaceC4110c2> it = c4096b2.f23084h.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }
}
