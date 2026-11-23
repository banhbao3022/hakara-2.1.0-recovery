package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class da2 {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f13197a;

    /* JADX INFO: renamed from: b */
    public static final oa2<?, ?> f13198b;

    /* JADX INFO: renamed from: c */
    public static final oa2<?, ?> f13199c;

    /* JADX INFO: renamed from: d */
    public static final oa2<?, ?> f13200d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f13197a = cls;
        f13198b = m6344v(false);
        f13199c = m6344v(true);
        f13200d = new qa2();
    }

    /* JADX INFO: renamed from: A */
    public static int m6303A(List<Long> list) {
        int iM7972v;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b92) {
            b92 b92Var = (b92) list;
            iM7972v = 0;
            while (i < size) {
                long jM5937h = b92Var.m5937h(i);
                iM7972v += o72.m7972v((jM5937h >> 63) ^ (jM5937h + jM5937h));
                i++;
            }
        } else {
            iM7972v = 0;
            while (i < size) {
                long jLongValue = list.get(i).longValue();
                iM7972v += o72.m7972v((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iM7972v;
    }

    /* JADX INFO: renamed from: B */
    public static int m6304B(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o72.m7969s(i) * size) + m6303A(list);
    }

    /* JADX INFO: renamed from: C */
    public static int m6305C(List<Integer> list) {
        int iM7970t;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h82) {
            h82 h82Var = (h82) list;
            iM7970t = 0;
            while (i < size) {
                iM7970t += o72.m7970t(h82Var.m7101h(i));
                i++;
            }
        } else {
            iM7970t = 0;
            while (i < size) {
                iM7970t += o72.m7970t(list.get(i).intValue());
                i++;
            }
        }
        return iM7970t;
    }

    /* JADX INFO: renamed from: D */
    public static int m6306D(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o72.m7969s(i) * size) + m6305C(list);
    }

    /* JADX INFO: renamed from: E */
    public static int m6307E(List<Integer> list) {
        int iM7970t;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h82) {
            h82 h82Var = (h82) list;
            iM7970t = 0;
            while (i < size) {
                iM7970t += o72.m7970t(h82Var.m7101h(i));
                i++;
            }
        } else {
            iM7970t = 0;
            while (i < size) {
                iM7970t += o72.m7970t(list.get(i).intValue());
                i++;
            }
        }
        return iM7970t;
    }

    /* JADX INFO: renamed from: F */
    public static int m6308F(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o72.m7969s(i) * size) + m6307E(list);
    }

    /* JADX INFO: renamed from: G */
    public static int m6309G(List<Integer> list) {
        int iM7971u;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h82) {
            h82 h82Var = (h82) list;
            iM7971u = 0;
            while (i < size) {
                iM7971u += o72.m7971u(h82Var.m7101h(i));
                i++;
            }
        } else {
            iM7971u = 0;
            while (i < size) {
                iM7971u += o72.m7971u(list.get(i).intValue());
                i++;
            }
        }
        return iM7971u;
    }

    /* JADX INFO: renamed from: H */
    public static int m6310H(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o72.m7969s(i) * size) + m6309G(list);
    }

    /* JADX INFO: renamed from: I */
    public static int m6311I(List<Integer> list) {
        int iM7971u;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h82) {
            h82 h82Var = (h82) list;
            iM7971u = 0;
            while (i < size) {
                int iM7101h = h82Var.m7101h(i);
                iM7971u += o72.m7971u((iM7101h >> 31) ^ (iM7101h + iM7101h));
                i++;
            }
        } else {
            iM7971u = 0;
            while (i < size) {
                int iIntValue = list.get(i).intValue();
                iM7971u += o72.m7971u((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iM7971u;
    }

    /* JADX INFO: renamed from: J */
    public static int m6312J(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o72.m7969s(i) * size) + m6311I(list);
    }

    /* JADX INFO: renamed from: K */
    public static int m6313K(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: L */
    public static int m6314L(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o72.m7971u(i << 3) + 4) * size;
    }

    /* JADX INFO: renamed from: M */
    public static int m6315M(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: N */
    public static int m6316N(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o72.m7971u(i << 3) + 8) * size;
    }

    /* JADX INFO: renamed from: O */
    public static int m6317O(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o72.m7971u(i << 3) + 1) * size;
    }

    /* JADX INFO: renamed from: P */
    public static int m6318P(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM7969s = o72.m7969s(i) * size;
        if (list instanceof w82) {
            w82 w82Var = (w82) list;
            while (i2 < size) {
                Object objMo8411Y = w82Var.mo8411Y(i2);
                iM7969s = (objMo8411Y instanceof g72 ? o72.m7966a((g72) objMo8411Y) : o72.m7973w((String) objMo8411Y)) + iM7969s;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iM7969s = (obj instanceof g72 ? o72.m7966a((g72) obj) : o72.m7973w((String) obj)) + iM7969s;
                i2++;
            }
        }
        return iM7969s;
    }

    /* JADX INFO: renamed from: Q */
    public static int m6319Q(int i, Object obj, ba2 ba2Var) {
        if (!(obj instanceof u82)) {
            return o72.m7967b((l92) obj, ba2Var) + o72.m7971u(i << 3);
        }
        int iM7971u = o72.m7971u(i << 3);
        int iM8477a = ((u82) obj).m8477a();
        return o72.m7971u(iM8477a) + iM8477a + iM7971u;
    }

    /* JADX INFO: renamed from: R */
    public static int m6320R(int i, List<?> list, ba2 ba2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM7969s = o72.m7969s(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof u82) {
                int iM8477a = ((u82) obj).m8477a();
                iM7969s += o72.m7971u(iM8477a) + iM8477a;
            } else {
                iM7969s = o72.m7967b((l92) obj, ba2Var) + iM7969s;
            }
        }
        return iM7969s;
    }

    /* JADX INFO: renamed from: S */
    public static int m6321S(int i, List<g72> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM7969s = o72.m7969s(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM7969s += o72.m7966a(list.get(i2));
        }
        return iM7969s;
    }

    /* JADX INFO: renamed from: T */
    public static int m6322T(int i, List<l92> list, ba2 ba2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM7968c = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM7968c += o72.m7968c(i, list.get(i2), ba2Var);
        }
        return iM7968c;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m6323a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: renamed from: b */
    public static <UT, UB> UB m6324b(int i, List<Integer> list, j82 j82Var, UB ub, oa2<UT, UB> oa2Var) {
        if (j82Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = list.get(i3).intValue();
                if (j82Var.mo5728b(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    if (ub == null) {
                        ub = oa2Var.mo7983g();
                    }
                    oa2Var.mo7978b(ub, i, iIntValue);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!j82Var.mo5728b(iIntValue2)) {
                    if (ub == null) {
                        ub = oa2Var.mo7983g();
                    }
                    oa2Var.mo7978b(ub, i, iIntValue2);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: renamed from: c */
    public static <UT, UB> UB m6325c(int i, int i2, UB ub, oa2<UT, UB> oa2Var) {
        if (ub == null) {
            ub = oa2Var.mo7983g();
        }
        oa2Var.mo7978b(ub, i, i2);
        return ub;
    }

    /* JADX INFO: renamed from: d */
    public static void m6326d(int i, List<Double> list, p72 p72Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(p72Var);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p72Var.f17875a.mo7666i(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        p72Var.f17875a.mo7661d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).doubleValue();
            i3 += 8;
        }
        p72Var.f17875a.mo7672o(i3);
        while (i2 < list.size()) {
            p72Var.f17875a.mo7675r(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m6327e(int i, List<Float> list, p72 p72Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(p72Var);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p72Var.f17875a.mo7664g(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        p72Var.f17875a.mo7661d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).floatValue();
            i3 += 4;
        }
        p72Var.f17875a.mo7672o(i3);
        while (i2 < list.size()) {
            p72Var.f17875a.mo7673p(Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m6328f(int i, List<Long> list, p72 p72Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(p72Var);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p72Var.f17875a.mo7665h(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        p72Var.f17875a.mo7661d(i, 2);
        int iM7972v = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM7972v += o72.m7972v(list.get(i3).longValue());
        }
        p72Var.f17875a.mo7672o(iM7972v);
        while (i2 < list.size()) {
            p72Var.f17875a.mo7674q(list.get(i2).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m6329g(int i, List<Long> list, p72 p72Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(p72Var);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p72Var.f17875a.mo7665h(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        p72Var.f17875a.mo7661d(i, 2);
        int iM7972v = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM7972v += o72.m7972v(list.get(i3).longValue());
        }
        p72Var.f17875a.mo7672o(iM7972v);
        while (i2 < list.size()) {
            p72Var.f17875a.mo7674q(list.get(i2).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m6330h(int i, List<Long> list, p72 p72Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(p72Var);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o72 o72Var = p72Var.f17875a;
                long jLongValue = list.get(i2).longValue();
                o72Var.mo7665h(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        p72Var.f17875a.mo7661d(i, 2);
        int iM7972v = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = list.get(i3).longValue();
            iM7972v += o72.m7972v((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        p72Var.f17875a.mo7672o(iM7972v);
        while (i2 < list.size()) {
            o72 o72Var2 = p72Var.f17875a;
            long jLongValue3 = list.get(i2).longValue();
            o72Var2.mo7674q((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m6331i(int i, List<Long> list, p72 p72Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(p72Var);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p72Var.f17875a.mo7666i(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        p72Var.f17875a.mo7661d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).longValue();
            i3 += 8;
        }
        p72Var.f17875a.mo7672o(i3);
        while (i2 < list.size()) {
            p72Var.f17875a.mo7675r(list.get(i2).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m6332j(int i, List<Long> list, p72 p72Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(p72Var);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p72Var.f17875a.mo7666i(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        p72Var.f17875a.mo7661d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).longValue();
            i3 += 8;
        }
        p72Var.f17875a.mo7672o(i3);
        while (i2 < list.size()) {
            p72Var.f17875a.mo7675r(list.get(i2).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m6333k(int i, List<Integer> list, p72 p72Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(p72Var);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p72Var.f17875a.mo7662e(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        p72Var.f17875a.mo7661d(i, 2);
        int iM7970t = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM7970t += o72.m7970t(list.get(i3).intValue());
        }
        p72Var.f17875a.mo7672o(iM7970t);
        while (i2 < list.size()) {
            p72Var.f17875a.mo7671n(list.get(i2).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m6334l(int i, List<Integer> list, p72 p72Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(p72Var);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p72Var.f17875a.mo7663f(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        p72Var.f17875a.mo7661d(i, 2);
        int iM7971u = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM7971u += o72.m7971u(list.get(i3).intValue());
        }
        p72Var.f17875a.mo7672o(iM7971u);
        while (i2 < list.size()) {
            p72Var.f17875a.mo7672o(list.get(i2).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m6335m(int i, List<Integer> list, p72 p72Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(p72Var);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o72 o72Var = p72Var.f17875a;
                int iIntValue = list.get(i2).intValue();
                o72Var.mo7663f(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return;
        }
        p72Var.f17875a.mo7661d(i, 2);
        int iM7971u = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = list.get(i3).intValue();
            iM7971u += o72.m7971u((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        p72Var.f17875a.mo7672o(iM7971u);
        while (i2 < list.size()) {
            o72 o72Var2 = p72Var.f17875a;
            int iIntValue3 = list.get(i2).intValue();
            o72Var2.mo7672o((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m6336n(int i, List<Integer> list, p72 p72Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(p72Var);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p72Var.f17875a.mo7664g(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        p72Var.f17875a.mo7661d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).intValue();
            i3 += 4;
        }
        p72Var.f17875a.mo7672o(i3);
        while (i2 < list.size()) {
            p72Var.f17875a.mo7673p(list.get(i2).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m6337o(int i, List<Integer> list, p72 p72Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(p72Var);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p72Var.f17875a.mo7664g(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        p72Var.f17875a.mo7661d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).intValue();
            i3 += 4;
        }
        p72Var.f17875a.mo7672o(i3);
        while (i2 < list.size()) {
            p72Var.f17875a.mo7673p(list.get(i2).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m6338p(int i, List<Integer> list, p72 p72Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(p72Var);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p72Var.f17875a.mo7662e(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        p72Var.f17875a.mo7661d(i, 2);
        int iM7970t = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM7970t += o72.m7970t(list.get(i3).intValue());
        }
        p72Var.f17875a.mo7672o(iM7970t);
        while (i2 < list.size()) {
            p72Var.f17875a.mo7671n(list.get(i2).intValue());
            i2++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: q */
    public static void m6339q(int i, List<Boolean> list, p72 p72Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(p72Var);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p72Var.f17875a.mo7667j(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        p72Var.f17875a.mo7661d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).booleanValue();
            i3++;
        }
        p72Var.f17875a.mo7672o(i3);
        while (i2 < list.size()) {
            p72Var.f17875a.mo7670m(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m6340r(int i, List<String> list, p72 p72Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(p72Var);
        int i2 = 0;
        if (!(list instanceof w82)) {
            while (i2 < list.size()) {
                p72Var.f17875a.mo7668k(i, list.get(i2));
                i2++;
            }
            return;
        }
        w82 w82Var = (w82) list;
        while (i2 < list.size()) {
            Object objMo8411Y = w82Var.mo8411Y(i2);
            if (objMo8411Y instanceof String) {
                p72Var.f17875a.mo7668k(i, (String) objMo8411Y);
            } else {
                p72Var.f17875a.mo7669l(i, (g72) objMo8411Y);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m6341s(int i, List<g72> list, p72 p72Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(p72Var);
        for (int i2 = 0; i2 < list.size(); i2++) {
            p72Var.f17875a.mo7669l(i, list.get(i2));
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m6342t(int i, List<?> list, p72 p72Var, ba2 ba2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            p72Var.m8085e(i, list.get(i2), ba2Var);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m6343u(int i, List<?> list, p72 p72Var, ba2 ba2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            p72Var.m8086f(i, list.get(i2), ba2Var);
        }
    }

    /* JADX INFO: renamed from: v */
    public static oa2<?, ?> m6344v(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (oa2) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static int m6345w(List<Long> list) {
        int iM7972v;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b92) {
            b92 b92Var = (b92) list;
            iM7972v = 0;
            while (i < size) {
                iM7972v += o72.m7972v(b92Var.m5937h(i));
                i++;
            }
        } else {
            iM7972v = 0;
            while (i < size) {
                iM7972v += o72.m7972v(list.get(i).longValue());
                i++;
            }
        }
        return iM7972v;
    }

    /* JADX INFO: renamed from: x */
    public static int m6346x(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (o72.m7969s(i) * list.size()) + m6345w(list);
    }

    /* JADX INFO: renamed from: y */
    public static int m6347y(List<Long> list) {
        int iM7972v;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b92) {
            b92 b92Var = (b92) list;
            iM7972v = 0;
            while (i < size) {
                iM7972v += o72.m7972v(b92Var.m5937h(i));
                i++;
            }
        } else {
            iM7972v = 0;
            while (i < size) {
                iM7972v += o72.m7972v(list.get(i).longValue());
                i++;
            }
        }
        return iM7972v;
    }

    /* JADX INFO: renamed from: z */
    public static int m6348z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o72.m7969s(i) * size) + m6347y(list);
    }
}
