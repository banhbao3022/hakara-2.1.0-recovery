package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p325k.C4177h;
import p007c.p190n.p194b.p266d.p314j.p325k.C4205j;
import p007c.p190n.p194b.p266d.p314j.p325k.C4247m;
import p007c.p190n.p194b.p266d.p314j.p325k.C4275o;
import p007c.p190n.p194b.p266d.p314j.p325k.C4303q;
import p007c.p190n.p194b.p266d.p314j.p325k.C4317r;

/* JADX INFO: renamed from: c.n.b.d.j.a.fu */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3042fu extends hg2 implements InterfaceC3079gu {
    public AbstractBinderC3042fu() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                ((BinderC2988ed) this).f13556f.f23687a.m9636a((Bundle) ig2.m7250a(parcel, Bundle.CREATOR), false);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundleM9636a = ((BinderC2988ed) this).f13556f.f23687a.m9636a((Bundle) ig2.m7250a(parcel, Bundle.CREATOR), true);
                parcel2.writeNoException();
                ig2.m7252c(parcel2, bundleM9636a);
                return true;
            case 3:
                ((BinderC2988ed) this).f13556f.f23687a.m9639e(parcel.readString(), parcel.readString(), (Bundle) ig2.m7250a(parcel, Bundle.CREATOR), true, true, null);
                parcel2.writeNoException();
                return true;
            case 4:
                String string = parcel.readString();
                String string2 = parcel.readString();
                InterfaceC2799a interfaceC2799aM5638i1 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                ((BinderC2988ed) this).f13556f.m10371b(string, string2, interfaceC2799aM5638i1 != null ? BinderC2800b.m5639T1(interfaceC2799aM5638i1) : null);
                parcel2.writeNoException();
                return true;
            case 5:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                ClassLoader classLoader = ig2.f15182a;
                Map<String, Object> mapM9637c = ((BinderC2988ed) this).f13556f.f23687a.m9637c(string3, string4, parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeMap(mapM9637c);
                return true;
            case 6:
                int iM9641i = ((BinderC2988ed) this).f13556f.f23687a.m9641i(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iM9641i);
                return true;
            case 7:
                Bundle bundle = (Bundle) ig2.m7250a(parcel, Bundle.CREATOR);
                C4177h c4177h = ((BinderC2988ed) this).f13556f.f23687a;
                Objects.requireNonNull(c4177h);
                c4177h.f23198e.execute(new C4205j(c4177h, bundle));
                parcel2.writeNoException();
                return true;
            case 8:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                Bundle bundle2 = (Bundle) ig2.m7250a(parcel, Bundle.CREATOR);
                C4177h c4177h2 = ((BinderC2988ed) this).f13556f.f23687a;
                Objects.requireNonNull(c4177h2);
                c4177h2.f23198e.execute(new C4247m(c4177h2, string5, string6, bundle2));
                parcel2.writeNoException();
                return true;
            case 9:
                List<Bundle> listM9640f = ((BinderC2988ed) this).f13556f.f23687a.m9640f(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(listM9640f);
                return true;
            case 10:
                String strMo6623k = ((BinderC2988ed) this).mo6623k();
                parcel2.writeNoException();
                parcel2.writeString(strMo6623k);
                return true;
            case 11:
                String strMo6622j = ((BinderC2988ed) this).mo6622j();
                parcel2.writeNoException();
                parcel2.writeString(strMo6622j);
                return true;
            case 12:
                long jM9642j = ((BinderC2988ed) this).f13556f.f23687a.m9642j();
                parcel2.writeNoException();
                parcel2.writeLong(jM9642j);
                return true;
            case 13:
                String string7 = parcel.readString();
                C4177h c4177h3 = ((BinderC2988ed) this).f13556f.f23687a;
                Objects.requireNonNull(c4177h3);
                c4177h3.f23198e.execute(new C4317r(c4177h3, string7));
                parcel2.writeNoException();
                return true;
            case 14:
                String string8 = parcel.readString();
                C4177h c4177h4 = ((BinderC2988ed) this).f13556f.f23687a;
                Objects.requireNonNull(c4177h4);
                c4177h4.f23198e.execute(new C4303q(c4177h4, string8));
                parcel2.writeNoException();
                return true;
            case 15:
                ((BinderC2988ed) this).mo6620M2(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                String strMo6628z = ((BinderC2988ed) this).mo6628z();
                parcel2.writeNoException();
                parcel2.writeString(strMo6628z);
                return true;
            case 17:
                String strMo6626q = ((BinderC2988ed) this).mo6626q();
                parcel2.writeNoException();
                parcel2.writeString(strMo6626q);
                return true;
            case 18:
                String str = ((BinderC2988ed) this).f13556f.f23687a.f23203j;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 19:
                Bundle bundle3 = (Bundle) ig2.m7250a(parcel, Bundle.CREATOR);
                C4177h c4177h5 = ((BinderC2988ed) this).f13556f.f23687a;
                Objects.requireNonNull(c4177h5);
                c4177h5.f23198e.execute(new C4275o(c4177h5, bundle3));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
