package p007c.p043b.p044a.p045a.p046a.p049d;

import android.annotation.SuppressLint;
import java.util.Arrays;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.b.a.a.a.d.b, reason: use source file name */
/* JADX INFO: compiled from: TimeUtilities.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TimeUtilities {
    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: a */
    public static final String m1315a(float f) {
        float f2 = 60;
        String str = String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) (f / f2)), Integer.valueOf((int) (f % f2))}, 2));
        Intrinsics2.m13086b(str, "java.lang.String.format(format, *args)");
        return str;
    }
}
