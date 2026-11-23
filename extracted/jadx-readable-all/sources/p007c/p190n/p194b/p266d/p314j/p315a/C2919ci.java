package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.ci */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2919ci implements Parcelable.Creator<C2881bi> {
    @Override // android.os.Parcelable.Creator
    public final C2881bi createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        long jM5272K = 0;
        long jM5272K2 = 0;
        int iM5267J = 0;
        Bundle bundleM5404n = null;
        ew2 ew2Var = null;
        jw2 jw2Var = null;
        String strM5429s = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strM5429s2 = null;
        String strM5429s3 = null;
        String strM5429s4 = null;
        C3702xn c3702xn = null;
        Bundle bundleM5404n2 = null;
        int iM5267J2 = 0;
        ArrayList<String> arrayListM5439u = null;
        Bundle bundleM5404n3 = null;
        boolean zM5247F = false;
        int iM5267J3 = 0;
        int iM5267J4 = 0;
        float fM5257H = 0.0f;
        String strM5429s5 = null;
        String strM5429s6 = null;
        ArrayList<String> arrayListM5439u2 = null;
        String strM5429s7 = null;
        C3165j5 c3165j5 = null;
        ArrayList<String> arrayListM5439u3 = null;
        String strM5429s8 = null;
        float fM5257H2 = 0.0f;
        boolean zM5247F2 = false;
        int iM5267J5 = 0;
        int iM5267J6 = 0;
        boolean zM5247F3 = false;
        String strM5429s9 = null;
        String strM5429s10 = null;
        boolean zM5247F4 = false;
        int iM5267J7 = 0;
        Bundle bundleM5404n4 = null;
        String strM5429s11 = null;
        C3235l1 c3235l1 = null;
        boolean zM5247F5 = false;
        Bundle bundleM5404n5 = null;
        String strM5429s12 = null;
        String strM5429s13 = null;
        String strM5429s14 = null;
        boolean zM5247F6 = false;
        ArrayList arrayList = null;
        String strM5429s15 = null;
        ArrayList<String> arrayListM5439u4 = null;
        int iM5267J8 = 0;
        boolean zM5247F7 = false;
        boolean zM5247F8 = false;
        boolean zM5247F9 = false;
        ArrayList<String> arrayListM5439u5 = null;
        String strM5429s16 = null;
        C3170ja c3170ja = null;
        String strM5429s17 = null;
        Bundle bundleM5404n6 = null;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case 2:
                    bundleM5404n = C2622l.m5404n(parcel, i);
                    break;
                case 3:
                    ew2Var = (ew2) C2622l.m5424r(parcel, i, ew2.CREATOR);
                    break;
                case 4:
                    jw2Var = (jw2) C2622l.m5424r(parcel, i, jw2.CREATOR);
                    break;
                case 5:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) C2622l.m5424r(parcel, i, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) C2622l.m5424r(parcel, i, PackageInfo.CREATOR);
                    break;
                case '\b':
                    strM5429s2 = C2622l.m5429s(parcel, i);
                    break;
                case '\t':
                    strM5429s3 = C2622l.m5429s(parcel, i);
                    break;
                case '\n':
                    strM5429s4 = C2622l.m5429s(parcel, i);
                    break;
                case 11:
                    c3702xn = (C3702xn) C2622l.m5424r(parcel, i, C3702xn.CREATOR);
                    break;
                case '\f':
                    bundleM5404n2 = C2622l.m5404n(parcel, i);
                    break;
                case '\r':
                    iM5267J2 = C2622l.m5267J(parcel, i);
                    break;
                case 14:
                    arrayListM5439u = C2622l.m5439u(parcel, i);
                    break;
                case 15:
                    bundleM5404n3 = C2622l.m5404n(parcel, i);
                    break;
                case 16:
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case ' ':
                case '&':
                case '>':
                default:
                    C2622l.m5282M(parcel, i);
                    break;
                case 18:
                    iM5267J3 = C2622l.m5267J(parcel, i);
                    break;
                case 19:
                    iM5267J4 = C2622l.m5267J(parcel, i);
                    break;
                case 20:
                    fM5257H = C2622l.m5257H(parcel, i);
                    break;
                case 21:
                    strM5429s5 = C2622l.m5429s(parcel, i);
                    break;
                case 25:
                    jM5272K = C2622l.m5272K(parcel, i);
                    break;
                case 26:
                    strM5429s6 = C2622l.m5429s(parcel, i);
                    break;
                case 27:
                    arrayListM5439u2 = C2622l.m5439u(parcel, i);
                    break;
                case 28:
                    strM5429s7 = C2622l.m5429s(parcel, i);
                    break;
                case 29:
                    c3165j5 = (C3165j5) C2622l.m5424r(parcel, i, C3165j5.CREATOR);
                    break;
                case 30:
                    arrayListM5439u3 = C2622l.m5439u(parcel, i);
                    break;
                case 31:
                    jM5272K2 = C2622l.m5272K(parcel, i);
                    break;
                case '!':
                    strM5429s8 = C2622l.m5429s(parcel, i);
                    break;
                case '\"':
                    fM5257H2 = C2622l.m5257H(parcel, i);
                    break;
                case '#':
                    iM5267J5 = C2622l.m5267J(parcel, i);
                    break;
                case '$':
                    iM5267J6 = C2622l.m5267J(parcel, i);
                    break;
                case '%':
                    zM5247F3 = C2622l.m5247F(parcel, i);
                    break;
                case '\'':
                    strM5429s9 = C2622l.m5429s(parcel, i);
                    break;
                case '(':
                    zM5247F2 = C2622l.m5247F(parcel, i);
                    break;
                case ')':
                    strM5429s10 = C2622l.m5429s(parcel, i);
                    break;
                case '*':
                    zM5247F4 = C2622l.m5247F(parcel, i);
                    break;
                case '+':
                    iM5267J7 = C2622l.m5267J(parcel, i);
                    break;
                case ',':
                    bundleM5404n4 = C2622l.m5404n(parcel, i);
                    break;
                case '-':
                    strM5429s11 = C2622l.m5429s(parcel, i);
                    break;
                case '.':
                    c3235l1 = (C3235l1) C2622l.m5424r(parcel, i, C3235l1.CREATOR);
                    break;
                case '/':
                    zM5247F5 = C2622l.m5247F(parcel, i);
                    break;
                case '0':
                    bundleM5404n5 = C2622l.m5404n(parcel, i);
                    break;
                case '1':
                    strM5429s12 = C2622l.m5429s(parcel, i);
                    break;
                case '2':
                    strM5429s13 = C2622l.m5429s(parcel, i);
                    break;
                case '3':
                    strM5429s14 = C2622l.m5429s(parcel, i);
                    break;
                case '4':
                    zM5247F6 = C2622l.m5247F(parcel, i);
                    break;
                case '5':
                    int iM5277L = C2622l.m5277L(parcel, i);
                    int iDataPosition = parcel.dataPosition();
                    if (iM5277L == 0) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = parcel.readInt();
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add(Integer.valueOf(parcel.readInt()));
                        }
                        parcel.setDataPosition(iDataPosition + iM5277L);
                        arrayList = arrayList2;
                    }
                    break;
                case '6':
                    strM5429s15 = C2622l.m5429s(parcel, i);
                    break;
                case '7':
                    arrayListM5439u4 = C2622l.m5439u(parcel, i);
                    break;
                case '8':
                    iM5267J8 = C2622l.m5267J(parcel, i);
                    break;
                case '9':
                    zM5247F7 = C2622l.m5247F(parcel, i);
                    break;
                case ':':
                    zM5247F8 = C2622l.m5247F(parcel, i);
                    break;
                case ';':
                    zM5247F9 = C2622l.m5247F(parcel, i);
                    break;
                case '<':
                    arrayListM5439u5 = C2622l.m5439u(parcel, i);
                    break;
                case '=':
                    strM5429s16 = C2622l.m5429s(parcel, i);
                    break;
                case '?':
                    c3170ja = (C3170ja) C2622l.m5424r(parcel, i, C3170ja.CREATOR);
                    break;
                case '@':
                    strM5429s17 = C2622l.m5429s(parcel, i);
                    break;
                case 'A':
                    bundleM5404n6 = C2622l.m5404n(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2881bi(iM5267J, bundleM5404n, ew2Var, jw2Var, strM5429s, applicationInfo, packageInfo, strM5429s2, strM5429s3, strM5429s4, c3702xn, bundleM5404n2, iM5267J2, arrayListM5439u, bundleM5404n3, zM5247F, iM5267J3, iM5267J4, fM5257H, strM5429s5, jM5272K, strM5429s6, arrayListM5439u2, strM5429s7, c3165j5, arrayListM5439u3, jM5272K2, strM5429s8, fM5257H2, zM5247F2, iM5267J5, iM5267J6, zM5247F3, strM5429s9, strM5429s10, zM5247F4, iM5267J7, bundleM5404n4, strM5429s11, c3235l1, zM5247F5, bundleM5404n5, strM5429s12, strM5429s13, strM5429s14, zM5247F6, arrayList, strM5429s15, arrayListM5439u4, iM5267J8, zM5247F7, zM5247F8, zM5247F9, arrayListM5439u5, strM5429s16, c3170ja, strM5429s17, bundleM5404n6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2881bi[] newArray(int i) {
        return new C2881bi[i];
    }
}
