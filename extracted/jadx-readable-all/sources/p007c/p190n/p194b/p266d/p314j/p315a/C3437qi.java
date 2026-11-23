package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.qi */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3437qi extends AbstractC2767a {
    public static final Parcelable.Creator<C3437qi> CREATOR = new C3474ri();

    /* JADX INFO: renamed from: f */
    public final Bundle f18295f;

    /* JADX INFO: renamed from: g */
    public final C3702xn f18296g;

    /* JADX INFO: renamed from: h */
    public final ApplicationInfo f18297h;

    /* JADX INFO: renamed from: i */
    public final String f18298i;

    /* JADX INFO: renamed from: j */
    public final List<String> f18299j;

    /* JADX INFO: renamed from: k */
    public final PackageInfo f18300k;

    /* JADX INFO: renamed from: l */
    public final String f18301l;

    /* JADX INFO: renamed from: m */
    public final String f18302m;

    /* JADX INFO: renamed from: n */
    public sj1 f18303n;

    /* JADX INFO: renamed from: o */
    public String f18304o;

    public C3437qi(Bundle bundle, C3702xn c3702xn, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, String str3, sj1 sj1Var, String str4) {
        this.f18295f = bundle;
        this.f18296g = c3702xn;
        this.f18298i = str;
        this.f18297h = applicationInfo;
        this.f18299j = list;
        this.f18300k = packageInfo;
        this.f18301l = str2;
        this.f18302m = str3;
        this.f18303n = sj1Var;
        this.f18304o = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5295P(parcel, 1, this.f18295f, false);
        C2622l.m5311T(parcel, 2, this.f18296g, i, false);
        C2622l.m5311T(parcel, 3, this.f18297h, i, false);
        C2622l.m5315U(parcel, 4, this.f18298i, false);
        C2622l.m5323W(parcel, 5, this.f18299j, false);
        C2622l.m5311T(parcel, 6, this.f18300k, i, false);
        C2622l.m5315U(parcel, 7, this.f18301l, false);
        C2622l.m5315U(parcel, 9, this.f18302m, false);
        C2622l.m5311T(parcel, 10, this.f18303n, i, false);
        C2622l.m5315U(parcel, 11, this.f18304o, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
