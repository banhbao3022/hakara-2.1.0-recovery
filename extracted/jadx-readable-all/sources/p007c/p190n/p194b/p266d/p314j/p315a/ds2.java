package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ds2 {

    /* JADX INFO: renamed from: a */
    public lg2 f13376a;

    /* JADX INFO: renamed from: b */
    public boolean f13377b;

    public ds2() {
    }

    public ds2(Context context) {
        C3052g3.m6922a(context);
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14223L2)).booleanValue()) {
            try {
                this.f13376a = (lg2) C2622l.m5233C0(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", cs2.f13116a);
                new BinderC2800b(context);
                this.f13376a.mo7341G4(new BinderC2800b(context), "GMA_SDK");
                this.f13377b = true;
            } catch (RemoteException | C3628vn | NullPointerException unused) {
                C2622l.m5318U2("Cannot dynamite load clearcut");
            }
        }
    }
}
