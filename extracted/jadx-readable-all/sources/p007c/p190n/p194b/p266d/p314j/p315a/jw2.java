package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import p007c.p190n.p194b.p266d.p267a.C2177g;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class jw2 extends AbstractC2767a {
    public static final Parcelable.Creator<jw2> CREATOR = new kw2();

    /* JADX INFO: renamed from: f */
    public final String f15835f;

    /* JADX INFO: renamed from: g */
    public final int f15836g;

    /* JADX INFO: renamed from: h */
    public final int f15837h;

    /* JADX INFO: renamed from: i */
    public final boolean f15838i;

    /* JADX INFO: renamed from: j */
    public final int f15839j;

    /* JADX INFO: renamed from: k */
    public final int f15840k;

    /* JADX INFO: renamed from: l */
    public final jw2[] f15841l;

    /* JADX INFO: renamed from: m */
    public final boolean f15842m;

    /* JADX INFO: renamed from: n */
    public final boolean f15843n;

    /* JADX INFO: renamed from: o */
    public boolean f15844o;

    /* JADX INFO: renamed from: p */
    public boolean f15845p;

    /* JADX INFO: renamed from: q */
    public boolean f15846q;

    /* JADX INFO: renamed from: r */
    public boolean f15847r;

    /* JADX INFO: renamed from: s */
    public boolean f15848s;

    /* JADX INFO: renamed from: t */
    public boolean f15849t;

    public jw2() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    /* JADX INFO: renamed from: H */
    public static jw2 m7416H() {
        return new jw2("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    /* JADX INFO: renamed from: K */
    public static jw2 m7417K() {
        return new jw2("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    /* JADX INFO: renamed from: L */
    public static int m7418L(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f15835f, false);
        int i2 = this.f15836g;
        parcel.writeInt(262147);
        parcel.writeInt(i2);
        int i3 = this.f15837h;
        parcel.writeInt(262148);
        parcel.writeInt(i3);
        boolean z = this.f15838i;
        parcel.writeInt(262149);
        parcel.writeInt(z ? 1 : 0);
        int i4 = this.f15839j;
        parcel.writeInt(262150);
        parcel.writeInt(i4);
        int i5 = this.f15840k;
        parcel.writeInt(262151);
        parcel.writeInt(i5);
        C2622l.m5327X(parcel, 8, this.f15841l, i, false);
        boolean z2 = this.f15842m;
        parcel.writeInt(262153);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.f15843n;
        parcel.writeInt(262154);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.f15844o;
        parcel.writeInt(262155);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.f15845p;
        parcel.writeInt(262156);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = this.f15846q;
        parcel.writeInt(262157);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z7 = this.f15847r;
        parcel.writeInt(262158);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.f15848s;
        parcel.writeInt(262159);
        parcel.writeInt(z8 ? 1 : 0);
        boolean z9 = this.f15849t;
        parcel.writeInt(262160);
        parcel.writeInt(z9 ? 1 : 0);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public jw2(Context context, C2177g c2177g) {
        this(context, new C2177g[]{c2177g});
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    public jw2(Context context, C2177g[] c2177gArr) {
        int i;
        int i2;
        int iM7418L;
        String string;
        int dimensionPixelSize;
        C2177g c2177g = c2177gArr[0];
        this.f15838i = false;
        int i3 = c2177g.f10566k;
        boolean z = i3 == -3 && c2177g.f10567l == -4;
        this.f15843n = z;
        this.f15847r = false;
        boolean z2 = c2177g.f10569n;
        this.f15848s = z2;
        boolean z3 = c2177g.f10571p;
        this.f15849t = z3;
        if (z) {
            C2177g c2177g2 = C2177g.f10556a;
            this.f15839j = c2177g2.f10566k;
            i = c2177g2.f10567l;
            this.f15836g = i;
        } else if (z2) {
            this.f15839j = i3;
            i = c2177g.f10570o;
            this.f15836g = i;
        } else if (z3) {
            this.f15839j = i3;
            i = c2177g.f10572q;
            this.f15836g = i;
        } else {
            this.f15839j = i3;
            i = c2177g.f10567l;
            this.f15836g = i;
        }
        int i4 = this.f15839j;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (i4 == -1) {
            gx2 gx2Var = gx2.f14692a;
            C3331nn c3331nn = gx2Var.f14693b;
            if (context.getResources().getConfiguration().orientation == 2) {
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (((int) (displayMetrics2.heightPixels / displayMetrics2.density)) < 600) {
                    C3331nn c3331nn2 = gx2Var.f14693b;
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i5 = displayMetrics3.heightPixels;
                        int i6 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i7 = displayMetrics3.heightPixels;
                        int i8 = displayMetrics3.widthPixels;
                        if (i7 == i5 && i8 == i6) {
                            int i9 = displayMetrics.widthPixels;
                            C3331nn c3331nn3 = gx2Var.f14693b;
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            dimensionPixelSize = i9 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.f15840k = dimensionPixelSize;
                        } else {
                            dimensionPixelSize = displayMetrics.widthPixels;
                            this.f15840k = dimensionPixelSize;
                        }
                    } else {
                        dimensionPixelSize = displayMetrics.widthPixels;
                        this.f15840k = dimensionPixelSize;
                    }
                } else {
                    dimensionPixelSize = displayMetrics.widthPixels;
                    this.f15840k = dimensionPixelSize;
                }
            } else {
                dimensionPixelSize = displayMetrics.widthPixels;
                this.f15840k = dimensionPixelSize;
            }
            double d = dimensionPixelSize / displayMetrics.density;
            i2 = (int) d;
            if (d - ((double) i2) >= 0.01d) {
                i2++;
            }
        } else {
            i2 = this.f15839j;
            C3331nn c3331nn4 = gx2.f14692a.f14693b;
            this.f15840k = C3331nn.m7886d(displayMetrics, i2);
        }
        if (i == -2) {
            iM7418L = m7418L(displayMetrics);
        } else {
            iM7418L = this.f15836g;
        }
        C3331nn c3331nn5 = gx2.f14692a.f14693b;
        this.f15837h = C3331nn.m7886d(displayMetrics, iM7418L);
        if (i4 != -1 && i != -2) {
            if (this.f15848s || this.f15849t) {
                int i10 = this.f15839j;
                int i11 = this.f15836g;
                StringBuilder sb = new StringBuilder(26);
                sb.append(i10);
                sb.append("x");
                sb.append(i11);
                sb.append("_as");
                string = sb.toString();
            } else if (z) {
                string = "320x50_mb";
            } else {
                this.f15835f = c2177g.f10568m;
            }
            this.f15835f = string;
        } else {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append(i2);
            sb2.append("x");
            sb2.append(iM7418L);
            sb2.append("_as");
            this.f15835f = sb2.toString();
        }
        int length = c2177gArr.length;
        if (length > 1) {
            this.f15841l = new jw2[length];
            for (int i12 = 0; i12 < c2177gArr.length; i12++) {
                this.f15841l[i12] = new jw2(context, c2177gArr[i12]);
            }
        } else {
            this.f15841l = null;
        }
        this.f15842m = false;
        this.f15844o = false;
    }

    public jw2(String str, int i, int i2, boolean z, int i3, int i4, jw2[] jw2VarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f15835f = str;
        this.f15836g = i;
        this.f15837h = i2;
        this.f15838i = z;
        this.f15839j = i3;
        this.f15840k = i4;
        this.f15841l = jw2VarArr;
        this.f15842m = z2;
        this.f15843n = z3;
        this.f15844o = z4;
        this.f15845p = z5;
        this.f15846q = z6;
        this.f15847r = z7;
        this.f15848s = z8;
        this.f15849t = z9;
    }
}
