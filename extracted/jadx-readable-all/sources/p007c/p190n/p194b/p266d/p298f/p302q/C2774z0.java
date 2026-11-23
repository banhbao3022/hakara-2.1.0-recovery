package p007c.p190n.p194b.p266d.p298f.p302q;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p007c.p190n.p194b.p266d.p298f.C2606d;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.f.q.z0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2774z0 implements Parcelable.Creator<C2732h> {
    /* JADX INFO: renamed from: a */
    public static void m5612a(C2732h c2732h, Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = c2732h.f11860f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        int i3 = c2732h.f11861g;
        parcel.writeInt(262146);
        parcel.writeInt(i3);
        int i4 = c2732h.f11862h;
        parcel.writeInt(262147);
        parcel.writeInt(i4);
        C2622l.m5315U(parcel, 4, c2732h.f11863i, false);
        C2622l.m5303R(parcel, 5, c2732h.f11864j, false);
        C2622l.m5327X(parcel, 6, c2732h.f11865k, i, false);
        C2622l.m5295P(parcel, 7, c2732h.f11866l, false);
        C2622l.m5311T(parcel, 8, c2732h.f11867m, i, false);
        C2622l.m5327X(parcel, 10, c2732h.f11868n, i, false);
        C2622l.m5327X(parcel, 11, c2732h.f11869o, i, false);
        boolean z = c2732h.f11870p;
        parcel.writeInt(262156);
        parcel.writeInt(z ? 1 : 0);
        int i5 = c2732h.f11871q;
        parcel.writeInt(262157);
        parcel.writeInt(i5);
        boolean z2 = c2732h.f11872r;
        parcel.writeInt(262158);
        parcel.writeInt(z2 ? 1 : 0);
        C2622l.m5315U(parcel, 15, c2732h.f11873s, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    @Override // android.os.Parcelable.Creator
    public final C2732h createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        IBinder iBinderM5262I = null;
        Scope[] scopeArr = null;
        Bundle bundleM5404n = null;
        Account account = null;
        C2606d[] c2606dArr = null;
        C2606d[] c2606dArr2 = null;
        String strM5429s2 = null;
        int iM5267J = 0;
        int iM5267J2 = 0;
        int iM5267J3 = 0;
        boolean zM5247F = false;
        int iM5267J4 = 0;
        boolean zM5247F2 = false;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case 2:
                    iM5267J2 = C2622l.m5267J(parcel, i);
                    break;
                case 3:
                    iM5267J3 = C2622l.m5267J(parcel, i);
                    break;
                case 4:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case 5:
                    iBinderM5262I = C2622l.m5262I(parcel, i);
                    break;
                case 6:
                    scopeArr = (Scope[]) C2622l.m5444v(parcel, i, Scope.CREATOR);
                    break;
                case 7:
                    bundleM5404n = C2622l.m5404n(parcel, i);
                    break;
                case '\b':
                    account = (Account) C2622l.m5424r(parcel, i, Account.CREATOR);
                    break;
                case '\t':
                default:
                    C2622l.m5282M(parcel, i);
                    break;
                case '\n':
                    c2606dArr = (C2606d[]) C2622l.m5444v(parcel, i, C2606d.CREATOR);
                    break;
                case 11:
                    c2606dArr2 = (C2606d[]) C2622l.m5444v(parcel, i, C2606d.CREATOR);
                    break;
                case '\f':
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case '\r':
                    iM5267J4 = C2622l.m5267J(parcel, i);
                    break;
                case 14:
                    zM5247F2 = C2622l.m5247F(parcel, i);
                    break;
                case 15:
                    strM5429s2 = C2622l.m5429s(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2732h(iM5267J, iM5267J2, iM5267J3, strM5429s, iBinderM5262I, scopeArr, bundleM5404n, account, c2606dArr, c2606dArr2, zM5247F, iM5267J4, zM5247F2, strM5429s2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2732h[] newArray(int i) {
        return new C2732h[i];
    }
}
