package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p007c.p190n.p194b.p266d.p267a.p282z.AbstractC2314e;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c;

/* JADX INFO: renamed from: c.n.b.d.j.a.l9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3243l9 extends AbstractC2314e<C3502s9> {
    public C3243l9(Context context, Looper looper, AbstractC2717c.a aVar, AbstractC2717c.b bVar) {
        super(C2994ej.m6634a(context), looper, 166, aVar, bVar);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: h */
    public final String mo4923h() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ IInterface mo4924i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return iInterfaceQueryLocalInterface instanceof C3502s9 ? (C3502s9) iInterfaceQueryLocalInterface : new C3502s9(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: n */
    public final String mo4926n() {
        return "com.google.android.gms.ads.service.HTTP";
    }
}
