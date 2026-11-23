package p007c.p190n.p194b.p334e.p339d;

import android.view.View;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: c.n.b.e.d.i, reason: use source file name */
/* JADX INFO: compiled from: ViewOffsetHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewOffsetHelper {

    /* JADX INFO: renamed from: a */
    public final View f24934a;

    /* JADX INFO: renamed from: b */
    public int f24935b;

    /* JADX INFO: renamed from: c */
    public int f24936c;

    /* JADX INFO: renamed from: d */
    public int f24937d;

    /* JADX INFO: renamed from: e */
    public int f24938e;

    /* JADX INFO: renamed from: f */
    public boolean f24939f = true;

    /* JADX INFO: renamed from: g */
    public boolean f24940g = true;

    public ViewOffsetHelper(View view) {
        this.f24934a = view;
    }

    /* JADX INFO: renamed from: a */
    public void m11087a() {
        View view = this.f24934a;
        ViewCompat.m16320n(view, this.f24937d - (view.getTop() - this.f24935b));
        View view2 = this.f24934a;
        ViewCompat.m16319m(view2, this.f24938e - (view2.getLeft() - this.f24936c));
    }

    /* JADX INFO: renamed from: b */
    public boolean m11088b(int i) {
        if (!this.f24939f || this.f24937d == i) {
            return false;
        }
        this.f24937d = i;
        m11087a();
        return true;
    }
}
