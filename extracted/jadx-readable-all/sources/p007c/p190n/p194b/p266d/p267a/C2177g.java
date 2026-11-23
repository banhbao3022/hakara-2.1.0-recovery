package p007c.p190n.p194b.p266d.p267a;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.annotation.RecentlyNonNull;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p314j.p315a.C3331nn;
import p007c.p190n.p194b.p266d.p314j.p315a.gx2;
import p007c.p190n.p194b.p266d.p314j.p315a.jw2;

/* JADX INFO: renamed from: c.n.b.d.a.g */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2177g {

    /* JADX INFO: renamed from: a */
    @RecentlyNonNull
    public static final C2177g f10556a = new C2177g(320, 50, "320x50_mb");

    /* JADX INFO: renamed from: b */
    @RecentlyNonNull
    public static final C2177g f10557b = new C2177g(468, 60, "468x60_as");

    /* JADX INFO: renamed from: c */
    @RecentlyNonNull
    public static final C2177g f10558c = new C2177g(320, 100, "320x100_as");

    /* JADX INFO: renamed from: d */
    @RecentlyNonNull
    public static final C2177g f10559d = new C2177g(728, 90, "728x90_as");

    /* JADX INFO: renamed from: e */
    @RecentlyNonNull
    public static final C2177g f10560e = new C2177g(300, 250, "300x250_as");

    /* JADX INFO: renamed from: f */
    @RecentlyNonNull
    public static final C2177g f10561f = new C2177g(160, 600, "160x600_as");

    /* JADX INFO: renamed from: g */
    @RecentlyNonNull
    @Deprecated
    public static final C2177g f10562g = new C2177g(-1, -2, "smart_banner");

    /* JADX INFO: renamed from: h */
    @RecentlyNonNull
    public static final C2177g f10563h = new C2177g(-3, -4, "fluid");

    /* JADX INFO: renamed from: i */
    @RecentlyNonNull
    public static final C2177g f10564i = new C2177g(0, 0, "invalid");

    /* JADX INFO: renamed from: j */
    @RecentlyNonNull
    public static final C2177g f10565j = new C2177g(50, 50, "50x50_mb");

    /* JADX INFO: renamed from: k */
    public final int f10566k;

    /* JADX INFO: renamed from: l */
    public final int f10567l;

    /* JADX INFO: renamed from: m */
    public final String f10568m;

    /* JADX INFO: renamed from: n */
    public boolean f10569n;

    /* JADX INFO: renamed from: o */
    public int f10570o;

    /* JADX INFO: renamed from: p */
    public boolean f10571p;

    /* JADX INFO: renamed from: q */
    public int f10572q;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2177g(int i, int i2) {
        String strValueOf = i == -1 ? "FULL" : String.valueOf(i);
        String strValueOf2 = i2 == -2 ? "AUTO" : String.valueOf(i2);
        this(i, i2, outline.m1553D(new StringBuilder(String.valueOf(strValueOf).length() + 4 + String.valueOf(strValueOf2).length()), strValueOf, "x", strValueOf2, "_as"));
    }

    /* JADX INFO: renamed from: a */
    public int m4627a(@RecentlyNonNull Context context) {
        int i = this.f10567l;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i != -2) {
            C3331nn c3331nn = gx2.f14692a.f14693b;
            return C3331nn.m7886d(context.getResources().getDisplayMetrics(), i);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (jw2.m7418L(displayMetrics) * displayMetrics.density);
    }

    /* JADX INFO: renamed from: b */
    public int m4628b(@RecentlyNonNull Context context) {
        int i = this.f10566k;
        if (i == -3) {
            return -1;
        }
        if (i != -1) {
            C3331nn c3331nn = gx2.f14692a.f14693b;
            return C3331nn.m7886d(context.getResources().getDisplayMetrics(), i);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<jw2> creator = jw2.CREATOR;
        return displayMetrics.widthPixels;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2177g)) {
            return false;
        }
        C2177g c2177g = (C2177g) obj;
        return this.f10566k == c2177g.f10566k && this.f10567l == c2177g.f10567l && this.f10568m.equals(c2177g.f10568m);
    }

    public int hashCode() {
        return this.f10568m.hashCode();
    }

    @RecentlyNonNull
    public String toString() {
        return this.f10568m;
    }

    public C2177g(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException(outline.m1585g(37, "Invalid width for AdSize: ", i));
        }
        if (i2 < 0 && i2 != -2 && i2 != -4) {
            throw new IllegalArgumentException(outline.m1585g(38, "Invalid height for AdSize: ", i2));
        }
        this.f10566k = i;
        this.f10567l = i2;
        this.f10568m = str;
    }
}
