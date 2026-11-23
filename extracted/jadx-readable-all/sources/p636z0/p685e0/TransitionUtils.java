package p636z0.p685e0;

import android.os.Build;

/* JADX INFO: renamed from: z0.e0.p, reason: use source file name */
/* JADX INFO: compiled from: TransitionUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class TransitionUtils {

    /* JADX INFO: renamed from: a */
    public static final boolean f36489a;

    /* JADX INFO: renamed from: b */
    public static final boolean f36490b;

    /* JADX INFO: renamed from: c */
    public static final boolean f36491c;

    static {
        int i = Build.VERSION.SDK_INT;
        f36489a = true;
        f36490b = true;
        f36491c = i >= 28;
    }
}
