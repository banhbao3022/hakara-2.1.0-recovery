package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.al */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2847al implements Parcelable.Creator<C3773zk> {
    @Override // android.os.Parcelable.Creator
    public final C3773zk createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        String strM5429s2 = null;
        ArrayList<String> arrayListM5439u = null;
        ArrayList<String> arrayListM5439u2 = null;
        boolean zM5247F = false;
        boolean zM5247F2 = false;
        boolean zM5247F3 = false;
        boolean zM5247F4 = false;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case 3:
                    strM5429s2 = C2622l.m5429s(parcel, i);
                    break;
                case 4:
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case 5:
                    zM5247F2 = C2622l.m5247F(parcel, i);
                    break;
                case 6:
                    arrayListM5439u = C2622l.m5439u(parcel, i);
                    break;
                case 7:
                    zM5247F3 = C2622l.m5247F(parcel, i);
                    break;
                case '\b':
                    zM5247F4 = C2622l.m5247F(parcel, i);
                    break;
                case '\t':
                    arrayListM5439u2 = C2622l.m5439u(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C3773zk(strM5429s, strM5429s2, zM5247F, zM5247F2, arrayListM5439u, zM5247F3, zM5247F4, arrayListM5439u2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3773zk[] newArray(int i) {
        return new C3773zk[i];
    }
}
