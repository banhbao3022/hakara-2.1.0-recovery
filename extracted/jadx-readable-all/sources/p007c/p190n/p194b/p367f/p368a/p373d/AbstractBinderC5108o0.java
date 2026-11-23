package p007c.p190n.p194b.p367f.p368a.p373d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p007c.p190n.p194b.p367f.p368a.p370b.BinderC5010i;
import p007c.p190n.p194b.p367f.p368a.p370b.C5030n;

/* JADX INFO: renamed from: c.n.b.f.a.d.o0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC5108o0 extends BinderC5098j0 implements InterfaceC5110p0 {
    public AbstractBinderC5108o0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.BinderC5098j0
    /* JADX INFO: renamed from: E0 */
    public final boolean mo11528E0(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                int i2 = parcel.readInt();
                ((BinderC5010i) this).f25824g.f25881e.m11549b();
                C5030n.f25877a.m11533b(4, "onStartDownload(%d)", new Object[]{Integer.valueOf(i2)});
                return true;
            case 3:
                int i3 = parcel.readInt();
                ((BinderC5010i) this).f25824g.f25881e.m11549b();
                C5030n.f25877a.m11533b(4, "onCancelDownload(%d)", new Object[]{Integer.valueOf(i3)});
                return true;
            case 4:
                int i4 = parcel.readInt();
                ((BinderC5010i) this).f25824g.f25881e.m11549b();
                C5030n.f25877a.m11533b(4, "onGetSession(%d)", new Object[]{Integer.valueOf(i4)});
                return true;
            case 5:
                mo11452M5(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) C5100k0.m11539a(parcel, creator);
                ((BinderC5010i) this).f25824g.f25881e.m11549b();
                C5030n.f25877a.m11533b(4, "onNotifyChunkTransferred(%s, %s, %d, session=%d)", new Object[]{bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id"))});
                return true;
            case 7:
                mo11453s5((Bundle) C5100k0.m11539a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) C5100k0.m11539a(parcel, creator2);
                ((BinderC5010i) this).f25824g.f25881e.m11549b();
                C5030n.f25877a.m11533b(4, "onNotifyModuleCompleted(%s, sessionId=%d)", new Object[]{bundle2.getString("module_name"), Integer.valueOf(bundle2.getInt("session_id"))});
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) C5100k0.m11539a(parcel, creator3);
                ((BinderC5010i) this).f25824g.f25881e.m11549b();
                C5030n.f25877a.m11533b(4, "onNotifySessionFailed(%d)", new Object[]{Integer.valueOf(bundle3.getInt("session_id"))});
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                mo11451H4((Bundle) C5100k0.m11539a(parcel, creator4), (Bundle) C5100k0.m11539a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                mo11454t5((Bundle) C5100k0.m11539a(parcel, creator5), (Bundle) C5100k0.m11539a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                ((BinderC5010i) this).f25824g.f25881e.m11549b();
                C5030n.f25877a.m11533b(4, "onRequestDownloadInfo()", new Object[0]);
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                ((BinderC5010i) this).f25824g.f25881e.m11549b();
                C5030n.f25877a.m11533b(4, "onRemoveModule()", new Object[0]);
                return true;
            case 15:
                ((BinderC5010i) this).f25824g.f25881e.m11549b();
                C5030n.f25877a.m11533b(4, "onCancelDownloads()", new Object[0]);
                return true;
        }
    }
}
