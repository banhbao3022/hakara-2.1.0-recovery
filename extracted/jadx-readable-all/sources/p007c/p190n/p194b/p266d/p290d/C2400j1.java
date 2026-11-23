package p007c.p190n.p194b.p266d.p290d;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p301p.C2708a;

/* JADX INFO: renamed from: c.n.b.d.d.j1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2400j1 implements Parcelable.Creator<C2380d> {
    @Override // android.os.Parcelable.Creator
    public final C2380d createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        String strM5429s2 = null;
        ArrayList<String> arrayListM5439u = null;
        String strM5429s3 = null;
        Uri uri = null;
        String strM5429s4 = null;
        String strM5429s5 = null;
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
                    C2622l.m5449w(parcel, i, C2708a.CREATOR);
                    break;
                case 5:
                    arrayListM5439u = C2622l.m5439u(parcel, i);
                    break;
                case 6:
                    strM5429s3 = C2622l.m5429s(parcel, i);
                    break;
                case 7:
                    uri = (Uri) C2622l.m5424r(parcel, i, Uri.CREATOR);
                    break;
                case '\b':
                    strM5429s4 = C2622l.m5429s(parcel, i);
                    break;
                case '\t':
                    strM5429s5 = C2622l.m5429s(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2380d(strM5429s, strM5429s2, arrayListM5439u, strM5429s3, uri, strM5429s4, strM5429s5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2380d[] newArray(int i) {
        return new C2380d[i];
    }
}
