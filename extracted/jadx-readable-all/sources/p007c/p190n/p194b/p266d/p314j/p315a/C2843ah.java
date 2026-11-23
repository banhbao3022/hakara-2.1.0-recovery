package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import p007c.p190n.p194b.p266d.p310g.AbstractC2801c;

/* JADX INFO: renamed from: c.n.b.d.j.a.ah */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2843ah extends AbstractC2801c<C2992eh> {
    public C2843ah() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // p007c.p190n.p194b.p266d.p310g.AbstractC2801c
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ C2992eh mo5640a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof C2992eh ? (C2992eh) iInterfaceQueryLocalInterface : new C2992eh(iBinder);
    }
}
