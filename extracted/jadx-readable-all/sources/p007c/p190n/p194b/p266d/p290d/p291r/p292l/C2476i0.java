package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import com.google.android.gms.common.api.Status;
import java.util.Objects;
import java.util.TimerTask;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2634g;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2639l;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.i0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2476i0 extends TimerTask {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2450d f11340f;

    public C2476i0(C2450d c2450d) {
        this.f11340f = c2450d;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        AbstractC2634g<C2458h.c> abstractC2634gM5060q;
        final C2450d c2450d = this.f11340f;
        if (c2450d.f11220h.isEmpty() || c2450d.f11223k != null || c2450d.f11214b == 0) {
            return;
        }
        C2458h c2458h = c2450d.f11215c;
        int[] iArrM5115e = C2516a.m5115e(c2450d.f11220h);
        Objects.requireNonNull(c2458h);
        C2622l.m5354d("Must be called from the main thread.");
        if (c2458h.m5079v()) {
            C2487o c2487o = new C2487o(c2458h, iArrM5115e);
            C2458h.m5059p(c2487o);
            abstractC2634gM5060q = c2487o;
        } else {
            abstractC2634gM5060q = C2458h.m5060q(17, null);
        }
        c2450d.f11223k = abstractC2634gM5060q;
        abstractC2634gM5060q.mo5494d(new InterfaceC2639l(c2450d) { // from class: c.n.b.d.d.r.l.f0

            /* JADX INFO: renamed from: a */
            public final C2450d f11235a;

            {
                this.f11235a = c2450d;
            }

            @Override // p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2639l
            /* JADX INFO: renamed from: a */
            public final void mo5012a(InterfaceC2638k interfaceC2638k) {
                C2450d c2450d2 = this.f11235a;
                Objects.requireNonNull(c2450d2);
                Status statusMo4909B = ((C2458h.c) interfaceC2638k).mo4909B();
                int i = statusMo4909B.f28654l;
                if (i != 0) {
                    c2450d2.f11213a.m5122d(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", Integer.valueOf(i), statusMo4909B.f28655m), new Object[0]);
                }
                c2450d2.f11223k = null;
                if (c2450d2.f11220h.isEmpty()) {
                    return;
                }
                c2450d2.f11221i.removeCallbacks(c2450d2.f11222j);
                c2450d2.f11221i.postDelayed(c2450d2.f11222j, 500L);
            }
        });
        c2450d.f11220h.clear();
    }
}
