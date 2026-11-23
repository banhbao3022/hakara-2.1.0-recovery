package p007c.p190n.p194b.p266d.p290d.p291r;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p290d.C2389g;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2444a;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.r.t */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2508t implements Parcelable.Creator<C2424b> {
    @Override // android.os.Parcelable.Creator
    public final C2424b createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        ArrayList<String> arrayListM5439u = null;
        C2389g c2389g = null;
        C2444a c2444a = null;
        double dM5252G = 0.0d;
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
                    arrayListM5439u = C2622l.m5439u(parcel, i);
                    break;
                case 4:
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case 5:
                    c2389g = (C2389g) C2622l.m5424r(parcel, i, C2389g.CREATOR);
                    break;
                case 6:
                    zM5247F2 = C2622l.m5247F(parcel, i);
                    break;
                case 7:
                    c2444a = (C2444a) C2622l.m5424r(parcel, i, C2444a.CREATOR);
                    break;
                case '\b':
                    zM5247F3 = C2622l.m5247F(parcel, i);
                    break;
                case '\t':
                    dM5252G = C2622l.m5252G(parcel, i);
                    break;
                case '\n':
                    zM5247F4 = C2622l.m5247F(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2424b(strM5429s, arrayListM5439u, zM5247F, c2389g, zM5247F2, c2444a, zM5247F3, dM5252G, zM5247F4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2424b[] newArray(int i) {
        return new C2424b[i];
    }
}
