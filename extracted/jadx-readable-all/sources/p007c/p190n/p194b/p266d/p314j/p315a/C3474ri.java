package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.ri */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3474ri implements Parcelable.Creator<C3437qi> {
    @Override // android.os.Parcelable.Creator
    public final C3437qi createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        Bundle bundleM5404n = null;
        C3702xn c3702xn = null;
        ApplicationInfo applicationInfo = null;
        String strM5429s = null;
        ArrayList<String> arrayListM5439u = null;
        PackageInfo packageInfo = null;
        String strM5429s2 = null;
        String strM5429s3 = null;
        sj1 sj1Var = null;
        String strM5429s4 = null;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    bundleM5404n = C2622l.m5404n(parcel, i);
                    break;
                case 2:
                    c3702xn = (C3702xn) C2622l.m5424r(parcel, i, C3702xn.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) C2622l.m5424r(parcel, i, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case 5:
                    arrayListM5439u = C2622l.m5439u(parcel, i);
                    break;
                case 6:
                    packageInfo = (PackageInfo) C2622l.m5424r(parcel, i, PackageInfo.CREATOR);
                    break;
                case 7:
                    strM5429s2 = C2622l.m5429s(parcel, i);
                    break;
                case '\b':
                default:
                    C2622l.m5282M(parcel, i);
                    break;
                case '\t':
                    strM5429s3 = C2622l.m5429s(parcel, i);
                    break;
                case '\n':
                    sj1Var = (sj1) C2622l.m5424r(parcel, i, sj1.CREATOR);
                    break;
                case 11:
                    strM5429s4 = C2622l.m5429s(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C3437qi(bundleM5404n, c3702xn, applicationInfo, strM5429s, arrayListM5439u, packageInfo, strM5429s2, strM5429s3, sj1Var, strM5429s4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3437qi[] newArray(int i) {
        return new C3437qi[i];
    }
}
