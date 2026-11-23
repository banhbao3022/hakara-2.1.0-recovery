package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import p007c.p190n.p194b.p266d.p310g.AbstractC2801c;

/* JADX INFO: renamed from: c.n.b.d.j.a.k7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3204k7 extends AbstractC2801c<C3721y5> {
    public C3204k7() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // p007c.p190n.p194b.p266d.p310g.AbstractC2801c
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ C3721y5 mo5640a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof C3721y5 ? (C3721y5) iInterfaceQueryLocalInterface : new C3721y5(iBinder);
    }
}
