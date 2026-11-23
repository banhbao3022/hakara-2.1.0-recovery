package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p269b0.AbstractC2124r;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.ce */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2915ce extends hg2 implements InterfaceC2952de {
    public AbstractBinderC2915ce() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String str = ((BinderC3619ve) this).f20741f.f10453a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List listMo5967d = ((BinderC3619ve) this).mo5967d();
                parcel2.writeNoException();
                parcel2.writeList(listMo5967d);
                return true;
            case 4:
                String str2 = ((BinderC3619ve) this).f20741f.f10455c;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 5:
                InterfaceC3610v5 interfaceC3610v5Mo5970g = ((BinderC3619ve) this).mo5970g();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3610v5Mo5970g);
                return true;
            case 6:
                String str3 = ((BinderC3619ve) this).f20741f.f10457e;
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 7:
                String str4 = ((BinderC3619ve) this).f20741f.f10458f;
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case 8:
                Double d = ((BinderC3619ve) this).f20741f.f10459g;
                double dDoubleValue = d != null ? d.doubleValue() : -1.0d;
                parcel2.writeNoException();
                parcel2.writeDouble(dDoubleValue);
                return true;
            case 9:
                String str5 = ((BinderC3619ve) this).f20741f.f10460h;
                parcel2.writeNoException();
                parcel2.writeString(str5);
                return true;
            case 10:
                String str6 = ((BinderC3619ve) this).f20741f.f10461i;
                parcel2.writeNoException();
                parcel2.writeString(str6);
                return true;
            case 11:
                InterfaceC3087h1 interfaceC3087h1Mo5979p = ((BinderC3619ve) this).mo5979p();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3087h1Mo5979p);
                return true;
            case 12:
                parcel2.writeNoException();
                ig2.m7253d(parcel2, null);
                return true;
            case 13:
                Objects.requireNonNull(((BinderC3619ve) this).f20741f);
                parcel2.writeNoException();
                ig2.m7253d(parcel2, null);
                return true;
            case 14:
                ((BinderC3619ve) this).mo5975l();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, null);
                return true;
            case 15:
                Object obj = ((BinderC3619ve) this).f20741f.f10463k;
                BinderC2800b binderC2800b = obj != null ? new BinderC2800b(obj) : null;
                parcel2.writeNoException();
                ig2.m7253d(parcel2, binderC2800b);
                return true;
            case 16:
                Bundle bundle = ((BinderC3619ve) this).f20741f.f10464l;
                parcel2.writeNoException();
                ig2.m7252c(parcel2, bundle);
                return true;
            case 17:
                boolean z = ((BinderC3619ve) this).f20741f.f10465m;
                parcel2.writeNoException();
                ClassLoader classLoader = ig2.f15182a;
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 18:
                boolean z2 = ((BinderC3619ve) this).f20741f.f10466n;
                parcel2.writeNoException();
                ClassLoader classLoader2 = ig2.f15182a;
                parcel2.writeInt(z2 ? 1 : 0);
                return true;
            case 19:
                Objects.requireNonNull(((BinderC3619ve) this).f20741f);
                parcel2.writeNoException();
                return true;
            case 20:
                InterfaceC2799a interfaceC2799aM5638i1 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                AbstractC2124r abstractC2124r = ((BinderC3619ve) this).f20741f;
                Objects.requireNonNull(abstractC2124r);
                parcel2.writeNoException();
                return true;
            case 21:
                ((BinderC3619ve) this).mo5963G1(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                InterfaceC2799a interfaceC2799aM5638i2 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                AbstractC2124r abstractC2124r2 = ((BinderC3619ve) this).f20741f;
                Objects.requireNonNull(abstractC2124r2);
                parcel2.writeNoException();
                return true;
            case 23:
                Objects.requireNonNull(((BinderC3619ve) this).f20741f);
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 24:
                Objects.requireNonNull(((BinderC3619ve) this).f20741f);
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 25:
                Objects.requireNonNull(((BinderC3619ve) this).f20741f);
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            default:
                return false;
        }
    }
}
