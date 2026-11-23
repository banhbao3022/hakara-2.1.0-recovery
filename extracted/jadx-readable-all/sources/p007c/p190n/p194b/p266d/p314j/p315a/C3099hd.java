package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p314j.p325k.C4177h;

/* JADX INFO: renamed from: c.n.b.d.j.a.hd */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3099hd {

    /* JADX INFO: renamed from: a */
    public static C3099hd f14812a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f14813b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final Thread m7115a(final Context context, final String str) {
        if (!this.f14813b.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable(this, context, str) { // from class: c.n.b.d.j.a.fd

            /* JADX INFO: renamed from: f */
            public final Context f14014f;

            /* JADX INFO: renamed from: g */
            public final String f14015g;

            {
                this.f14014f = context;
                this.f14015g = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = this.f14014f;
                String str2 = this.f14015g;
                C3052g3.m6922a(context2);
                Bundle bundle = new Bundle();
                AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14304Z;
                C2862b c2862b = C2862b.f12493a;
                bundle.putBoolean("measurementEnabled", ((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue());
                if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14353g0)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((InterfaceC3227ku) C2622l.m5233C0(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", C3062gd.f14533a)).mo7174V2(new BinderC2800b(context2), new BinderC2988ed(C4177h.m9633b(context2, "FA-Ads", "am", str2, bundle).f23199f));
                } catch (RemoteException | C3628vn | NullPointerException e) {
                    C2622l.m5271J3("#007 Could not call remote method.", e);
                }
            }
        });
        thread.start();
        return thread;
    }
}
