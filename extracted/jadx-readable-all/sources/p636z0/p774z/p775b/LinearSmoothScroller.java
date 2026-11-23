package p636z0.p774z.p775b;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: z0.z.b.r, reason: use source file name */
/* JADX INFO: compiled from: LinearSmoothScroller.java */
/* JADX INFO: loaded from: classes.dex */
public class LinearSmoothScroller extends RecyclerView.AbstractC0171x {

    /* JADX INFO: renamed from: k */
    public PointF f39331k;

    /* JADX INFO: renamed from: l */
    public final DisplayMetrics f39332l;

    /* JADX INFO: renamed from: n */
    public float f39334n;

    /* JADX INFO: renamed from: i */
    public final LinearInterpolator f39329i = new LinearInterpolator();

    /* JADX INFO: renamed from: j */
    public final DecelerateInterpolator f39330j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: m */
    public boolean f39333m = false;

    /* JADX INFO: renamed from: o */
    public int f39335o = 0;

    /* JADX INFO: renamed from: p */
    public int f39336p = 0;

    public LinearSmoothScroller(Context context) {
        this.f39332l = context.getResources().getDisplayMetrics();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0171x
    /* JADX INFO: renamed from: c */
    public void mo801c(int i, int i2, RecyclerView.C0172y c0172y, RecyclerView.AbstractC0171x.a aVar) {
        if (this.f1080b.f987x.m764y() == 0) {
            m805g();
            return;
        }
        int i3 = this.f39335o;
        int i4 = i3 - i;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.f39335o = i4;
        int i5 = this.f39336p;
        int i6 = i5 - i2;
        int i7 = i5 * i6 > 0 ? i6 : 0;
        this.f39336p = i7;
        if (i4 == 0 && i7 == 0) {
            PointF pointFM799a = m799a(this.f1079a);
            if (pointFM799a != null) {
                float f = pointFM799a.x;
                if (f != 0.0f || pointFM799a.y != 0.0f) {
                    float f2 = pointFM799a.y;
                    float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
                    float f3 = pointFM799a.x / fSqrt;
                    pointFM799a.x = f3;
                    float f4 = pointFM799a.y / fSqrt;
                    pointFM799a.y = f4;
                    this.f39331k = pointFM799a;
                    this.f39335o = (int) (f3 * 10000.0f);
                    this.f39336p = (int) (f4 * 10000.0f);
                    aVar.m807b((int) (this.f39335o * 1.2f), (int) (this.f39336p * 1.2f), (int) (mo17057k(10000) * 1.2f), this.f39329i);
                    return;
                }
            }
            aVar.f1090d = this.f1079a;
            m805g();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0171x
    /* JADX INFO: renamed from: d */
    public void mo802d() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0171x
    /* JADX INFO: renamed from: e */
    public void mo803e() {
        this.f39336p = 0;
        this.f39335o = 0;
        this.f39331k = null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0171x
    /* JADX INFO: renamed from: f */
    public void mo804f(View view, RecyclerView.C0172y c0172y, RecyclerView.AbstractC0171x.a aVar) {
        int i;
        int iM17055h;
        int i2;
        PointF pointF = this.f39331k;
        int iM17055h2 = 0;
        if (pointF != null) {
            float f = pointF.x;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = f > 0.0f ? 1 : -1;
            }
        } else {
            i = 0;
        }
        RecyclerView.AbstractC0160m abstractC0160m = this.f1081c;
        if (abstractC0160m == null || !abstractC0160m.mo531e()) {
            iM17055h = 0;
        } else {
            RecyclerView.C0161n c0161n = (RecyclerView.C0161n) view.getLayoutParams();
            iM17055h = m17055h(abstractC0160m.m710D(view) - ((ViewGroup.MarginLayoutParams) c0161n).leftMargin, abstractC0160m.m716G(view) + ((ViewGroup.MarginLayoutParams) c0161n).rightMargin, abstractC0160m.m730O(), abstractC0160m.f1050p - abstractC0160m.m731P(), i);
        }
        PointF pointF2 = this.f39331k;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 == 0.0f) {
                i2 = 0;
            } else {
                i2 = f2 > 0.0f ? 1 : -1;
            }
        } else {
            i2 = 0;
        }
        RecyclerView.AbstractC0160m abstractC0160m2 = this.f1081c;
        if (abstractC0160m2 != null && abstractC0160m2.mo533f()) {
            RecyclerView.C0161n c0161n2 = (RecyclerView.C0161n) view.getLayoutParams();
            iM17055h2 = m17055h(abstractC0160m2.m718H(view) - ((ViewGroup.MarginLayoutParams) c0161n2).topMargin, abstractC0160m2.m707B(view) + ((ViewGroup.MarginLayoutParams) c0161n2).bottomMargin, abstractC0160m2.m733Q(), abstractC0160m2.f1051q - abstractC0160m2.m729N(), i2);
        }
        int iM17056j = m17056j((int) Math.sqrt((iM17055h2 * iM17055h2) + (iM17055h * iM17055h)));
        if (iM17056j > 0) {
            aVar.m807b(-iM17055h, -iM17055h2, iM17056j, this.f39330j);
        }
    }

    /* JADX INFO: renamed from: h */
    public int m17055h(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public float mo11250i(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: j */
    public int m17056j(int i) {
        return (int) Math.ceil(((double) mo17057k(i)) / 0.3356d);
    }

    /* JADX INFO: renamed from: k */
    public int mo17057k(int i) {
        float fAbs = Math.abs(i);
        if (!this.f39333m) {
            this.f39334n = mo11250i(this.f39332l);
            this.f39333m = true;
        }
        return (int) Math.ceil(fAbs * this.f39334n);
    }
}
