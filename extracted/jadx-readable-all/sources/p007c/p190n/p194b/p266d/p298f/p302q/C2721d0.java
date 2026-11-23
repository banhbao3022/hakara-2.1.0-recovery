package p007c.p190n.p194b.p266d.p298f.p302q;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2634g;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k;
import p007c.p190n.p194b.p266d.p333n.C4782j;

/* JADX INFO: renamed from: c.n.b.d.f.q.d0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2721d0 implements AbstractC2634g.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC2634g f11839a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4782j f11840b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2755r.a f11841c;

    public C2721d0(AbstractC2634g abstractC2634g, C4782j c4782j, C2755r.a aVar, C2755r.b bVar) {
        this.f11839a = abstractC2634g;
        this.f11840b = c4782j;
        this.f11841c = aVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2634g.a
    /* JADX INFO: renamed from: a */
    public final void mo5495a(Status status) {
        if (!status.m12654H()) {
            C4782j c4782j = this.f11840b;
            c4782j.f24683a.m10943p(C2714b.m5564a(status));
        } else {
            InterfaceC2638k interfaceC2638kMo5492b = this.f11839a.mo5492b(0L, TimeUnit.MILLISECONDS);
            this.f11840b.f24683a.m10944q((TResult) this.f11841c.mo5592a(interfaceC2638kMo5492b));
        }
    }
}
