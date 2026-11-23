package p007c.p190n.p194b.p266d.p314j.p325k;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: renamed from: c.n.b.d.j.k.h0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4178h0 extends C4177h.a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Bundle f23211j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Activity f23212k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C4177h.b f23213l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4178h0(C4177h.b bVar, Bundle bundle, Activity activity) {
        super(true);
        this.f23213l = bVar;
        this.f23211j = bundle;
        this.f23212k = activity;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: a */
    public final void mo9336a() throws RemoteException {
        Bundle bundle;
        if (this.f23211j != null) {
            bundle = new Bundle();
            if (this.f23211j.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f23211j.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        C4177h.this.f23204k.onActivityCreated(new BinderC2800b(this.f23212k), bundle, this.f23206g);
    }
}
