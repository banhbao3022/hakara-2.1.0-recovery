package p007c.p190n.p194b.p266d.p290d.p291r;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: renamed from: c.n.b.d.d.r.i */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2438i {

    /* JADX INFO: renamed from: a */
    public static final C2518b f11191a = new C2518b("SessionManager");

    /* JADX INFO: renamed from: b */
    public final InterfaceC2437h0 f11192b;

    /* JADX INFO: renamed from: c */
    public final Context f11193c;

    public C2438i(InterfaceC2437h0 interfaceC2437h0, Context context) {
        this.f11192b = interfaceC2437h0;
        this.f11193c = context;
    }

    /* JADX INFO: renamed from: a */
    public void m5032a(boolean z) {
        C2622l.m5354d("Must be called from the main thread.");
        try {
            C2518b c2518b = f11191a;
            Log.i(c2518b.f11373a, c2518b.m5123e("End session for %s", this.f11193c.getPackageName()));
            this.f11192b.mo5031W0(true, z);
        } catch (RemoteException e) {
            f11191a.m5120b(e, "Unable to call %s on %s.", "endCurrentSession", InterfaceC2437h0.class.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: b */
    public AbstractC2436h m5033b() {
        C2622l.m5354d("Must be called from the main thread.");
        try {
            return (AbstractC2436h) BinderC2800b.m5639T1(this.f11192b.mo5029Q5());
        } catch (RemoteException e) {
            f11191a.m5120b(e, "Unable to call %s on %s.", "getWrappedCurrentSession", InterfaceC2437h0.class.getSimpleName());
            return null;
        }
    }
}
