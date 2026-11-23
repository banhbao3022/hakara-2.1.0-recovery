package p007c.p190n.p194b.p266d.p314j.p315a;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gw2 implements Parcelable.Creator<ew2> {
    @Override // android.os.Parcelable.Creator
    public final ew2 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        Bundle bundleM5404n = null;
        ArrayList<String> arrayListM5439u = null;
        String strM5429s = null;
        C3199k2 c3199k2 = null;
        Location location = null;
        String strM5429s2 = null;
        Bundle bundleM5404n2 = null;
        Bundle bundleM5404n3 = null;
        ArrayList<String> arrayListM5439u2 = null;
        String strM5429s3 = null;
        String strM5429s4 = null;
        wv2 wv2Var = null;
        String strM5429s5 = null;
        ArrayList<String> arrayListM5439u3 = null;
        long jM5272K = 0;
        int iM5267J = 0;
        int iM5267J2 = 0;
        boolean zM5247F = false;
        int iM5267J3 = 0;
        boolean zM5247F2 = false;
        boolean zM5247F3 = false;
        int iM5267J4 = 0;
        int iM5267J5 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case 2:
                    jM5272K = C2622l.m5272K(parcel, i);
                    break;
                case 3:
                    bundleM5404n = C2622l.m5404n(parcel, i);
                    break;
                case 4:
                    iM5267J2 = C2622l.m5267J(parcel, i);
                    break;
                case 5:
                    arrayListM5439u = C2622l.m5439u(parcel, i);
                    break;
                case 6:
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case 7:
                    iM5267J3 = C2622l.m5267J(parcel, i);
                    break;
                case '\b':
                    zM5247F2 = C2622l.m5247F(parcel, i);
                    break;
                case '\t':
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case '\n':
                    c3199k2 = (C3199k2) C2622l.m5424r(parcel, i, C3199k2.CREATOR);
                    break;
                case 11:
                    location = (Location) C2622l.m5424r(parcel, i, Location.CREATOR);
                    break;
                case '\f':
                    strM5429s2 = C2622l.m5429s(parcel, i);
                    break;
                case '\r':
                    bundleM5404n2 = C2622l.m5404n(parcel, i);
                    break;
                case 14:
                    bundleM5404n3 = C2622l.m5404n(parcel, i);
                    break;
                case 15:
                    arrayListM5439u2 = C2622l.m5439u(parcel, i);
                    break;
                case 16:
                    strM5429s3 = C2622l.m5429s(parcel, i);
                    break;
                case 17:
                    strM5429s4 = C2622l.m5429s(parcel, i);
                    break;
                case 18:
                    zM5247F3 = C2622l.m5247F(parcel, i);
                    break;
                case 19:
                    wv2Var = (wv2) C2622l.m5424r(parcel, i, wv2.CREATOR);
                    break;
                case 20:
                    iM5267J4 = C2622l.m5267J(parcel, i);
                    break;
                case 21:
                    strM5429s5 = C2622l.m5429s(parcel, i);
                    break;
                case 22:
                    arrayListM5439u3 = C2622l.m5439u(parcel, i);
                    break;
                case 23:
                    iM5267J5 = C2622l.m5267J(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new ew2(iM5267J, jM5272K, bundleM5404n, iM5267J2, arrayListM5439u, zM5247F, iM5267J3, zM5247F2, strM5429s, c3199k2, location, strM5429s2, bundleM5404n2, bundleM5404n3, arrayListM5439u2, strM5429s3, strM5429s4, zM5247F3, wv2Var, iM5267J4, strM5429s5, arrayListM5439u3, iM5267J5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ew2[] newArray(int i) {
        return new ew2[i];
    }
}
