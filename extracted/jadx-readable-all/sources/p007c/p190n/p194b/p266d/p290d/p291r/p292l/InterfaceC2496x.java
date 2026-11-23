package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p290d.C2395i;
import p007c.p190n.p194b.p266d.p298f.p301p.C2708a;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a;
import p007c.p190n.p194b.p266d.p314j.p320f.C4016v;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.x */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2496x extends IInterface {

    /* JADX INFO: renamed from: c.n.b.d.d.r.l.x$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public static abstract class a extends BinderC3808a implements InterfaceC2496x {
        public a() {
            super("com.google.android.gms.cast.framework.media.IImagePicker");
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.BinderC3808a
        /* JADX INFO: renamed from: E0 */
        public final boolean mo5103E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                C2395i c2395i = (C2395i) C4016v.m9267a(parcel, C2395i.CREATOR);
                parcel.readInt();
                C2708a c2708aM5039a = C2448c.this.m5039a(c2395i);
                parcel2.writeNoException();
                C4016v.m9270d(parcel2, c2708aM5039a);
            } else if (i == 2) {
                BinderC2800b binderC2800b = new BinderC2800b(C2448c.this);
                parcel2.writeNoException();
                C4016v.m9268b(parcel2, binderC2800b);
            } else if (i == 3) {
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
            } else {
                if (i != 4) {
                    return false;
                }
                C2395i c2395i2 = (C2395i) C4016v.m9267a(parcel, C2395i.CREATOR);
                C2446b c2446b = (C2446b) C4016v.m9267a(parcel, C2446b.CREATOR);
                C2448c c2448c = C2448c.this;
                Objects.requireNonNull(c2448c);
                int i3 = c2446b.f11208f;
                C2708a c2708aM5039a2 = c2448c.m5039a(c2395i2);
                parcel2.writeNoException();
                C4016v.m9270d(parcel2, c2708aM5039a2);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: r0 */
    InterfaceC2799a mo5040r0() throws RemoteException;
}
