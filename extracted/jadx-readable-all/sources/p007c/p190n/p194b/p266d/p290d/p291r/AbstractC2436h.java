package p007c.p190n.p194b.p266d.p290d.p291r;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p320f.C3858f;
import p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3878h;

/* JADX INFO: renamed from: c.n.b.d.d.r.h */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2436h {

    /* JADX INFO: renamed from: a */
    public static final C2518b f11187a = new C2518b("Session");

    /* JADX INFO: renamed from: b */
    public final InterfaceC2435g0 f11188b;

    /* JADX INFO: renamed from: c */
    public final a f11189c;

    /* JADX INFO: renamed from: c.n.b.d.d.r.h$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public class a extends AbstractBinderC2503o {
        public a(C2504p c2504p) {
        }
    }

    public AbstractC2436h(Context context, String str, String str2) {
        InterfaceC2435g0 interfaceC2435g0Mo9031H1 = null;
        a aVar = new a(null);
        this.f11189c = aVar;
        try {
            interfaceC2435g0Mo9031H1 = C3858f.m9021a(context).mo9031H1(str, str2, aVar);
        } catch (RemoteException e) {
            C3858f.f22572a.m5120b(e, "Unable to call %s on %s.", "newSessionImpl", InterfaceC3878h.class.getSimpleName());
        }
        this.f11188b = interfaceC2435g0Mo9031H1;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo5004a(boolean z);

    /* JADX INFO: renamed from: b */
    public long mo5005b() {
        C2622l.m5354d("Must be called from the main thread.");
        return 0L;
    }

    /* JADX INFO: renamed from: c */
    public final void m5026c(int i) {
        try {
            this.f11188b.mo5020C2(i);
        } catch (RemoteException e) {
            f11187a.m5120b(e, "Unable to call %s on %s.", "notifySessionEnded", InterfaceC2435g0.class.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo5006d(Bundle bundle) {
    }

    /* JADX INFO: renamed from: e */
    public void mo5007e(Bundle bundle) {
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo5008f(Bundle bundle);

    /* JADX INFO: renamed from: g */
    public abstract void mo5009g(Bundle bundle);

    /* JADX INFO: renamed from: h */
    public final InterfaceC2799a m5027h() {
        try {
            return this.f11188b.mo5022f5();
        } catch (RemoteException e) {
            f11187a.m5120b(e, "Unable to call %s on %s.", "getWrappedObject", InterfaceC2435g0.class.getSimpleName());
            return null;
        }
    }
}
