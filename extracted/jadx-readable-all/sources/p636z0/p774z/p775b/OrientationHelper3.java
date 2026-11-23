package p636z0.p774z.p775b;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: z0.z.b.y, reason: use source file name */
/* JADX INFO: compiled from: OrientationHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class OrientationHelper3 {

    /* JADX INFO: renamed from: a */
    public final RecyclerView.AbstractC0160m f39343a;

    /* JADX INFO: renamed from: b */
    public int f39344b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public final Rect f39345c = new Rect();

    public OrientationHelper3(RecyclerView.AbstractC0160m abstractC0160m, OrientationHelper orientationHelper) {
        this.f39343a = abstractC0160m;
    }

    /* JADX INFO: renamed from: a */
    public static OrientationHelper3 m17077a(RecyclerView.AbstractC0160m abstractC0160m, int i) {
        if (i == 0) {
            return new OrientationHelper(abstractC0160m);
        }
        if (i == 1) {
            return new OrientationHelper2(abstractC0160m);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo17063b(View view);

    /* JADX INFO: renamed from: c */
    public abstract int mo17064c(View view);

    /* JADX INFO: renamed from: d */
    public abstract int mo17065d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo17066e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo17067f();

    /* JADX INFO: renamed from: g */
    public abstract int mo17068g();

    /* JADX INFO: renamed from: h */
    public abstract int mo17069h();

    /* JADX INFO: renamed from: i */
    public abstract int mo17070i();

    /* JADX INFO: renamed from: j */
    public abstract int mo17071j();

    /* JADX INFO: renamed from: k */
    public abstract int mo17072k();

    /* JADX INFO: renamed from: l */
    public abstract int mo17073l();

    /* JADX INFO: renamed from: m */
    public int m17078m() {
        if (Integer.MIN_VALUE == this.f39344b) {
            return 0;
        }
        return mo17073l() - this.f39344b;
    }

    /* JADX INFO: renamed from: n */
    public abstract int mo17074n(View view);

    /* JADX INFO: renamed from: o */
    public abstract int mo17075o(View view);

    /* JADX INFO: renamed from: p */
    public abstract void mo17076p(int i);
}
