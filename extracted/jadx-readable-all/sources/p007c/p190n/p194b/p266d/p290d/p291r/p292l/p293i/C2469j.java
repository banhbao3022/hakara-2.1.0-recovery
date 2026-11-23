package p007c.p190n.p194b.p266d.p290d.p291r.p292l.p293i;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p314j.p320f.C3988s;
import p007c.p190n.p194b.p266d.p314j.p320f.C4016v;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.i.j */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2469j extends C3988s implements InterfaceC2467h {
    public C2469j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.p293i.InterfaceC2467h
    /* JADX INFO: renamed from: K5 */
    public final Bitmap mo5093K5(Uri uri) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        C4016v.m9269c(parcelM9209E0, uri);
        Parcel parcelM9212i1 = m9212i1(1, parcelM9209E0);
        Bitmap bitmap = (Bitmap) C4016v.m9267a(parcelM9212i1, Bitmap.CREATOR);
        parcelM9212i1.recycle();
        return bitmap;
    }
}
