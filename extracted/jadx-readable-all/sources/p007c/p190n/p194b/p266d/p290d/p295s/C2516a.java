package p007c.p190n.p194b.p266d.p290d.p295s;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: c.n.b.d.d.s.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2516a {

    /* JADX INFO: renamed from: a */
    public static final Pattern f11372a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");

    /* JADX INFO: renamed from: a */
    public static double m5111a(long j2) {
        return j2 / 1000.0d;
    }

    /* JADX INFO: renamed from: b */
    public static long m5112b(double d) {
        return (long) (d * 1000.0d);
    }

    /* JADX INFO: renamed from: c */
    public static void m5113c(String str) throws IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Namespace cannot be null or empty");
        }
        if (str.length() > 128) {
            throw new IllegalArgumentException("Invalid namespace length");
        }
        if (!str.startsWith("urn:x-cast:")) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
        }
        if (str.length() == 11) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
        }
    }

    /* JADX INFO: renamed from: d */
    public static <T> boolean m5114d(T t, T t2) {
        if (t == null && t2 == null) {
            return true;
        }
        return (t == null || t2 == null || !t.equals(t2)) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static int[] m5115e(Collection<Integer> collection) {
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: f */
    public static String m5116f(String str) {
        return str.length() != 0 ? "urn:x-cast:".concat(str) : new String("urn:x-cast:");
    }

    /* JADX INFO: renamed from: g */
    public static List<Integer> m5117g(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }
}
