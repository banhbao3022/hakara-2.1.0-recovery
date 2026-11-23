package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import p007c.p190n.p194b.p266d.p310g.AbstractC2801c;

/* JADX INFO: renamed from: c.n.b.d.j.a.l7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3241l7 extends AbstractC2801c<C2832a6> {
    public C3241l7() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // p007c.p190n.p194b.p266d.p310g.AbstractC2801c
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ C2832a6 mo5640a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof C2832a6 ? (C2832a6) iInterfaceQueryLocalInterface : new C2832a6(iBinder);
    }
}
