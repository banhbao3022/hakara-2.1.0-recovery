package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.d.j.a.mh */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3288mh extends gg2 implements InterfaceC3362oh {
    public C3288mh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3362oh
    /* JADX INFO: renamed from: S */
    public final void mo7698S(String str) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        m7002T1(2, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3362oh
    /* JADX INFO: renamed from: y5 */
    public final void mo7699y5(List<Uri> list) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeTypedList(list);
        m7002T1(1, parcelM7001E0);
    }
}
