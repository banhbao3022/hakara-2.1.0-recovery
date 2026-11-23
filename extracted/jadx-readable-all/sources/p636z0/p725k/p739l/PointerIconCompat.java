package p636z0.p725k.p739l;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* JADX INFO: renamed from: z0.k.l.p, reason: use source file name */
/* JADX INFO: compiled from: PointerIconCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class PointerIconCompat {

    /* JADX INFO: renamed from: a */
    public Object f38072a;

    public PointerIconCompat(Object obj) {
        this.f38072a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static PointerIconCompat m16306a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? new PointerIconCompat(PointerIcon.getSystemIcon(context, i)) : new PointerIconCompat(null);
    }
}
