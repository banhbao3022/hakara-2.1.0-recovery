package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p007c.p190n.p194b.p266d.p267a.C2181h0;
import p007c.p190n.p194b.p266d.p267a.p282z.AbstractC2314e;
import p007c.p190n.p194b.p266d.p298f.C2606d;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c;
import p007c.p190n.p194b.p266d.p298f.p302q.C2766w0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class kr2 extends AbstractC2314e<nr2> {
    public kr2(Context context, Looper looper, AbstractC2717c.a aVar, AbstractC2717c.b bVar) {
        super(C2994ej.m6634a(context), looper, 123, aVar, bVar);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m7542C() {
        C2766w0 c2766w0 = this.f11820v;
        return ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14333d1)).booleanValue() && C2622l.m5394l(c2766w0 == null ? null : c2766w0.f11928g, C2181h0.f10574a);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: h */
    public final String mo4923h() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ IInterface mo4924i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof nr2 ? (nr2) iInterfaceQueryLocalInterface : new nr2(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: n */
    public final String mo4926n() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: q */
    public final C2606d[] mo5118q() {
        return C2181h0.f10575b;
    }
}
