package p636z0.p667e.p668a.p670e.p671w1.p673p;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p636z0.p667e.p676b.p677v1.Quirk;

/* JADX INFO: renamed from: z0.e.a.e.w1.p.g, reason: use source file name */
/* JADX INFO: compiled from: JpegHalCorruptImageQuirk.java */
/* JADX INFO: loaded from: classes.dex */
public final class JpegHalCorruptImageQuirk implements Quirk {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f35820a = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo"));

    /* JADX INFO: renamed from: b */
    public static final Set<Integer> f35821b;

    static {
        HashSet hashSet = new HashSet();
        f35821b = hashSet;
        hashSet.add(1);
        if (Build.VERSION.SDK_INT >= 24) {
            hashSet.add(3);
        }
    }
}
