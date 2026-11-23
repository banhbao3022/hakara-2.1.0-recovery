package p007c.p190n.p194b.p209b;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: renamed from: c.n.b.b.l0, reason: use source file name */
/* JADX INFO: compiled from: ExoPlayerLibraryInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class ExoPlayerLibraryInfo {

    /* JADX INFO: renamed from: a */
    public static final HashSet<String> f6741a;

    /* JADX INFO: renamed from: b */
    public static String f6742b;

    static {
        String str = Build.VERSION.RELEASE;
        f6741a = new HashSet<>();
        f6742b = "goog.exo.core";
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m3455a(String str) {
        if (f6741a.add(str)) {
            f6742b += ", " + str;
        }
    }
}
