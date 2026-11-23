package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import p007c.p190n.p194b.p266d.p310g.AbstractC2801c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class cw2 extends AbstractC2801c<C3492s> {
    public cw2() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // p007c.p190n.p194b.p266d.p310g.AbstractC2801c
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ C3492s mo5640a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof C3492s ? (C3492s) iInterfaceQueryLocalInterface : new C3492s(iBinder);
    }
}
