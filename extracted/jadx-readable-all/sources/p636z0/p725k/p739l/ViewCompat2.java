package p636z0.p725k.p739l;

import android.view.View;

/* JADX INFO: renamed from: z0.k.l.r, reason: use source file name */
/* JADX INFO: compiled from: ViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewCompat2 extends ViewCompat.b<Boolean> {
    public ViewCompat2(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    @Override // p636z0.p725k.p739l.ViewCompat.b
    /* JADX INFO: renamed from: b */
    public Boolean mo16331b(View view) {
        return Boolean.valueOf(view.isScreenReaderFocusable());
    }
}
