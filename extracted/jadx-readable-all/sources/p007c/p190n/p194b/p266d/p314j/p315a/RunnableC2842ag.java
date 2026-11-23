package p007c.p190n.p194b.p266d.p314j.p315a;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzasz;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.C2233p;

/* JADX INFO: renamed from: c.n.b.d.j.a.ag */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2842ag implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AdOverlayInfoParcel f12114f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zzasz f12115g;

    public RunnableC2842ag(zzasz zzaszVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f12115g = zzaszVar;
        this.f12114f = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2233p c2233p = C2330u.f10884a.f10888c;
        C2233p.m4697a(this.f12115g.f28689a, this.f12114f, true);
    }
}
