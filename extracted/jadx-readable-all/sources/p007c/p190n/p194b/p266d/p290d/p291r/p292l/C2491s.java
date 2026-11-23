package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import p007c.p190n.p194b.p266d.p290d.p295s.C2539l;
import p007c.p190n.p194b.p266d.p290d.p295s.C2549t;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2639l;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.s */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2491s implements InterfaceC2639l<Status> {

    /* JADX INFO: renamed from: a */
    public final long f11356a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458h.e f11357b;

    public C2491s(C2458h.e eVar, long j2) {
        this.f11357b = eVar;
        this.f11356a = j2;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2639l
    /* JADX INFO: renamed from: a */
    public final void mo5012a(InterfaceC2638k interfaceC2638k) {
        Status status = (Status) interfaceC2638k;
        if (status.m12654H()) {
            return;
        }
        C2539l c2539l = C2458h.this.f11290d;
        long j2 = this.f11356a;
        int i = status.f28654l;
        Iterator<C2549t> it = c2539l.f11471d.iterator();
        while (it.hasNext()) {
            it.next().m5167e(j2, i, null);
        }
    }
}
