package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p290d.p295s.C2544o;
import p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2546q;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.u */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2493u implements InterfaceC2546q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2458h.g f11359a;

    public C2493u(C2458h.g gVar, C2458h c2458h) {
        this.f11359a = gVar;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2546q
    /* JADX INFO: renamed from: a */
    public final void mo5105a(long j2) {
        try {
            C2458h.g gVar = this.f11359a;
            Status status = new Status(2103);
            Objects.requireNonNull(gVar);
            gVar.mo4931a(new C2494v(status));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestReplaced", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2546q
    /* JADX INFO: renamed from: b */
    public final void mo5106b(long j2, int i, Object obj) {
        C2544o c2544o = obj instanceof C2544o ? (C2544o) obj : null;
        try {
            this.f11359a.mo4931a(new C2458h.h(new Status(i), c2544o != null ? c2544o.f11457a : null, c2544o != null ? c2544o.f11458b : null));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestCompleted", e);
        }
    }
}
