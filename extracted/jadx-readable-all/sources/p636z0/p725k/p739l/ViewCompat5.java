package p636z0.p725k.p739l;

import android.view.View;

/* JADX INFO: renamed from: z0.k.l.u, reason: use source file name */
/* JADX INFO: compiled from: ViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewCompat5 extends ViewCompat.b<Boolean> {
    public ViewCompat5(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    @Override // p636z0.p725k.p739l.ViewCompat.b
    /* JADX INFO: renamed from: b */
    public Boolean mo16331b(View view) {
        return Boolean.valueOf(view.isAccessibilityHeading());
    }

    /* JADX INFO: renamed from: d */
    public void m16342d(View view, Object obj) {
        view.setAccessibilityHeading(((Boolean) obj).booleanValue());
    }

    /* JADX INFO: renamed from: e */
    public boolean m16343e(Object obj, Object obj2) {
        return !m16330a((Boolean) obj, (Boolean) obj2);
    }
}
