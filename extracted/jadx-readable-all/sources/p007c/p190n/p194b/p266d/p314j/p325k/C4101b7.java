package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* JADX INFO: renamed from: c.n.b.d.j.k.b7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4101b7 {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f23089a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC4269n7<?, ?> f23090b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC4269n7<?, ?> f23091c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC4269n7<?, ?> f23092d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f23089a = cls;
        f23090b = m9466e(false);
        f23091c = m9466e(true);
        f23092d = new C4297p7();
    }

    /* JADX INFO: renamed from: A */
    public static int m9442A(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC4238l4.m9944D(i) * size) + m9443B(list);
    }

    /* JADX INFO: renamed from: B */
    public static int m9443B(List<Integer> list) {
        int iM9947H;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4141e5) {
            C4141e5 c4141e5 = (C4141e5) list;
            iM9947H = 0;
            while (i < size) {
                iM9947H += AbstractC4238l4.m9947H(c4141e5.m9554h(i));
                i++;
            }
        } else {
            iM9947H = 0;
            while (i < size) {
                iM9947H += AbstractC4238l4.m9947H(list.get(i).intValue());
                i++;
            }
        }
        return iM9947H;
    }

    /* JADX INFO: renamed from: C */
    public static void m9444C(int i, List<Long> list, InterfaceC4158f8 interfaceC4158f8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
        Objects.requireNonNull(c4266n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c4266n4.f23336a.mo9979g(i, AbstractC4238l4.m9957R(list.get(i2).longValue()));
                i2++;
            }
            return;
        }
        c4266n4.f23336a.mo9978f(i, 2);
        int iM9950K = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM9950K += AbstractC4238l4.m9950K(list.get(i3).longValue());
        }
        c4266n4.f23336a.mo9986r(iM9950K);
        while (i2 < list.size()) {
            c4266n4.f23336a.mo9985m(AbstractC4238l4.m9957R(list.get(i2).longValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: D */
    public static int m9445D(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC4238l4.m9944D(i) * size) + m9446E(list);
    }

    /* JADX INFO: renamed from: E */
    public static int m9446E(List<Integer> list) {
        int iM9951L;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4141e5) {
            C4141e5 c4141e5 = (C4141e5) list;
            iM9951L = 0;
            while (i < size) {
                iM9951L += AbstractC4238l4.m9951L(c4141e5.m9554h(i));
                i++;
            }
        } else {
            iM9951L = 0;
            while (i < size) {
                iM9951L += AbstractC4238l4.m9951L(list.get(i).intValue());
                i++;
            }
        }
        return iM9951L;
    }

    /* JADX INFO: renamed from: F */
    public static void m9447F(int i, List<Long> list, InterfaceC4158f8 interfaceC4158f8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
        Objects.requireNonNull(c4266n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c4266n4.f23336a.mo9990z(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        c4266n4.f23336a.mo9978f(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).longValue();
            Logger logger = AbstractC4238l4.f23285a;
            i3 += 8;
        }
        c4266n4.f23336a.mo9986r(i3);
        while (i2 < list.size()) {
            c4266n4.f23336a.mo9972A(list.get(i2).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: G */
    public static int m9448G(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC4238l4.m9944D(i) * size) + m9449H(list);
    }

    /* JADX INFO: renamed from: H */
    public static int m9449H(List<Integer> list) {
        int iM9954O;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4141e5) {
            C4141e5 c4141e5 = (C4141e5) list;
            iM9954O = 0;
            while (i < size) {
                iM9954O += AbstractC4238l4.m9954O(c4141e5.m9554h(i));
                i++;
            }
        } else {
            iM9954O = 0;
            while (i < size) {
                iM9954O += AbstractC4238l4.m9954O(list.get(i).intValue());
                i++;
            }
        }
        return iM9954O;
    }

    /* JADX INFO: renamed from: I */
    public static void m9450I(int i, List<Long> list, InterfaceC4158f8 interfaceC4158f8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
        Objects.requireNonNull(c4266n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c4266n4.f23336a.mo9990z(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        c4266n4.f23336a.mo9978f(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).longValue();
            Logger logger = AbstractC4238l4.f23285a;
            i3 += 8;
        }
        c4266n4.f23336a.mo9986r(i3);
        while (i2 < list.size()) {
            c4266n4.f23336a.mo9972A(list.get(i2).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: J */
    public static int m9451J(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC4238l4.m9958S(i) * size;
    }

    /* JADX INFO: renamed from: K */
    public static int m9452K(List<?> list) {
        return list.size() << 2;
    }

    /* JADX INFO: renamed from: L */
    public static void m9453L(int i, List<Integer> list, InterfaceC4158f8 interfaceC4158f8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
        Objects.requireNonNull(c4266n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c4266n4.f23336a.mo9987s(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        c4266n4.f23336a.mo9978f(i, 2);
        int iM9947H = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM9947H += AbstractC4238l4.m9947H(list.get(i3).intValue());
        }
        c4266n4.f23336a.mo9986r(iM9947H);
        while (i2 < list.size()) {
            c4266n4.f23336a.mo9977e(list.get(i2).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: M */
    public static int m9454M(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC4238l4.m9953N(i) * size;
    }

    /* JADX INFO: renamed from: N */
    public static int m9455N(List<?> list) {
        return list.size() << 3;
    }

    /* JADX INFO: renamed from: O */
    public static void m9456O(int i, List<Integer> list, InterfaceC4158f8 interfaceC4158f8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
        Objects.requireNonNull(c4266n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c4266n4.f23336a.mo9989y(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        c4266n4.f23336a.mo9978f(i, 2);
        int iM9951L = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM9951L += AbstractC4238l4.m9951L(list.get(i3).intValue());
        }
        c4266n4.f23336a.mo9986r(iM9951L);
        while (i2 < list.size()) {
            c4266n4.f23336a.mo9986r(list.get(i2).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m9457P(int i, List<Integer> list, InterfaceC4158f8 interfaceC4158f8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
        Objects.requireNonNull(c4266n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c4266n4.f23336a.mo9989y(i, AbstractC4238l4.m9961V(list.get(i2).intValue()));
                i2++;
            }
            return;
        }
        c4266n4.f23336a.mo9978f(i, 2);
        int iM9954O = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM9954O += AbstractC4238l4.m9954O(list.get(i3).intValue());
        }
        c4266n4.f23336a.mo9986r(iM9954O);
        while (i2 < list.size()) {
            c4266n4.f23336a.mo9986r(AbstractC4238l4.m9961V(list.get(i2).intValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m9458Q(int i, List<Integer> list, InterfaceC4158f8 interfaceC4158f8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
        Objects.requireNonNull(c4266n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c4266n4.f23336a.mo9974G(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        c4266n4.f23336a.mo9978f(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).intValue();
            Logger logger = AbstractC4238l4.f23285a;
            i3 += 4;
        }
        c4266n4.f23336a.mo9986r(i3);
        while (i2 < list.size()) {
            c4266n4.f23336a.mo9973C(list.get(i2).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m9459R(int i, List<Integer> list, InterfaceC4158f8 interfaceC4158f8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
        Objects.requireNonNull(c4266n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c4266n4.f23336a.mo9974G(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        c4266n4.f23336a.mo9978f(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).intValue();
            Logger logger = AbstractC4238l4.f23285a;
            i3 += 4;
        }
        c4266n4.f23336a.mo9986r(i3);
        while (i2 < list.size()) {
            c4266n4.f23336a.mo9973C(list.get(i2).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m9460S(int i, List<Integer> list, InterfaceC4158f8 interfaceC4158f8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
        Objects.requireNonNull(c4266n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c4266n4.f23336a.mo9987s(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        c4266n4.f23336a.mo9978f(i, 2);
        int iM9947H = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM9947H += AbstractC4238l4.m9947H(list.get(i3).intValue());
        }
        c4266n4.f23336a.mo9986r(iM9947H);
        while (i2 < list.size()) {
            c4266n4.f23336a.mo9977e(list.get(i2).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: T */
    public static void m9461T(int i, List<Boolean> list, InterfaceC4158f8 interfaceC4158f8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
        Objects.requireNonNull(c4266n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c4266n4.f23336a.mo9984l(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        c4266n4.f23336a.mo9978f(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).booleanValue();
            Logger logger = AbstractC4238l4.f23285a;
            i3++;
        }
        c4266n4.f23336a.mo9986r(i3);
        while (i2 < list.size()) {
            c4266n4.f23336a.mo9976d(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m9462a(int i, Object obj, InterfaceC4431z6 interfaceC4431z6) {
        if (!(obj instanceof C4309q5)) {
            return AbstractC4238l4.m9963c((InterfaceC4240l6) obj, interfaceC4431z6) + AbstractC4238l4.m9951L(i << 3);
        }
        int iM9951L = AbstractC4238l4.m9951L(i << 3);
        int iM10168a = ((C4309q5) obj).m10168a();
        return AbstractC4238l4.m9951L(iM10168a) + iM10168a + iM9951L;
    }

    /* JADX INFO: renamed from: b */
    public static int m9463b(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM9944D = AbstractC4238l4.m9944D(i) * size;
        if (list instanceof InterfaceC4337s5) {
            InterfaceC4337s5 interfaceC4337s5 = (InterfaceC4337s5) list;
            while (i2 < size) {
                Object objMo10118A = interfaceC4337s5.mo10118A(i2);
                iM9944D = (objMo10118A instanceof AbstractC4402x3 ? AbstractC4238l4.m9966p((AbstractC4402x3) objMo10118A) : AbstractC4238l4.m9967q((String) objMo10118A)) + iM9944D;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iM9944D = (obj instanceof AbstractC4402x3 ? AbstractC4238l4.m9966p((AbstractC4402x3) obj) : AbstractC4238l4.m9967q((String) obj)) + iM9944D;
                i2++;
            }
        }
        return iM9944D;
    }

    /* JADX INFO: renamed from: c */
    public static int m9464c(int i, List<?> list, InterfaceC4431z6 interfaceC4431z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM9944D = AbstractC4238l4.m9944D(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iM9944D += obj instanceof C4309q5 ? AbstractC4238l4.m9962b((C4309q5) obj) : AbstractC4238l4.m9963c((InterfaceC4240l6) obj, interfaceC4431z6);
        }
        return iM9944D;
    }

    /* JADX INFO: renamed from: d */
    public static int m9465d(List<Long> list) {
        int iM9946F;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4430z5) {
            C4430z5 c4430z5 = (C4430z5) list;
            iM9946F = 0;
            while (i < size) {
                iM9946F += AbstractC4238l4.m9946F(c4430z5.m10344h(i));
                i++;
            }
        } else {
            iM9946F = 0;
            while (i < size) {
                iM9946F += AbstractC4238l4.m9946F(list.get(i).longValue());
                i++;
            }
        }
        return iM9946F;
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC4269n7<?, ?> m9466e(boolean z) {
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
            return (AbstractC4269n7) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static <UT, UB> UB m9467f(int i, int i2, UB ub, AbstractC4269n7<UT, UB> abstractC4269n7) {
        if (ub == null) {
            ub = abstractC4269n7.mo10076a();
        }
        abstractC4269n7.mo10079d(ub, i, i2);
        return ub;
    }

    /* JADX INFO: renamed from: g */
    public static <UT, UB> UB m9468g(int i, List<Integer> list, InterfaceC4183h5 interfaceC4183h5, UB ub, AbstractC4269n7<UT, UB> abstractC4269n7) {
        if (interfaceC4183h5 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = list.get(i3).intValue();
                if (interfaceC4183h5.mo9829b(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    if (ub == null) {
                        ub = abstractC4269n7.mo10076a();
                    }
                    abstractC4269n7.mo10079d(ub, i, iIntValue);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!interfaceC4183h5.mo9829b(iIntValue2)) {
                    if (ub == null) {
                        ub = abstractC4269n7.mo10076a();
                    }
                    abstractC4269n7.mo10079d(ub, i, iIntValue2);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: renamed from: h */
    public static void m9469h(int i, List<String> list, InterfaceC4158f8 interfaceC4158f8) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
        Objects.requireNonNull(c4266n4);
        int i2 = 0;
        if (!(list instanceof InterfaceC4337s5)) {
            while (i2 < list.size()) {
                c4266n4.f23336a.mo9983k(i, list.get(i2));
                i2++;
            }
            return;
        }
        InterfaceC4337s5 interfaceC4337s5 = (InterfaceC4337s5) list;
        while (i2 < list.size()) {
            Object objMo10118A = interfaceC4337s5.mo10118A(i2);
            if (objMo10118A instanceof String) {
                c4266n4.f23336a.mo9983k(i, (String) objMo10118A);
            } else {
                c4266n4.f23336a.mo9980h(i, (AbstractC4402x3) objMo10118A);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m9470i(int i, List<?> list, InterfaceC4158f8 interfaceC4158f8, InterfaceC4431z6 interfaceC4431z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
        Objects.requireNonNull(c4266n4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            c4266n4.f23336a.mo9982j(i, (InterfaceC4240l6) list.get(i2), interfaceC4431z6);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m9471j(int i, List<Double> list, InterfaceC4158f8 interfaceC4158f8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
        Objects.requireNonNull(c4266n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                AbstractC4238l4 abstractC4238l4 = c4266n4.f23336a;
                double dDoubleValue = list.get(i2).doubleValue();
                Objects.requireNonNull(abstractC4238l4);
                abstractC4238l4.mo9990z(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c4266n4.f23336a.mo9978f(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).doubleValue();
            Logger logger = AbstractC4238l4.f23285a;
            i3 += 8;
        }
        c4266n4.f23336a.mo9986r(i3);
        while (i2 < list.size()) {
            AbstractC4238l4 abstractC4238l5 = c4266n4.f23336a;
            double dDoubleValue2 = list.get(i2).doubleValue();
            Objects.requireNonNull(abstractC4238l5);
            abstractC4238l5.mo9972A(Double.doubleToRawLongBits(dDoubleValue2));
            i2++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k */
    public static <T, FT extends InterfaceC4390w4<FT>> void m9472k(AbstractC4308q4<FT> abstractC4308q4, T t, T t2) {
        C4364u4<T> c4364u4Mo10159b = abstractC4308q4.mo10159b(t2);
        if (c4364u4Mo10159b.f23500b.isEmpty()) {
            return;
        }
        C4364u4<T> c4364u4Mo10166i = abstractC4308q4.mo10166i(t);
        Objects.requireNonNull(c4364u4Mo10166i);
        for (int i = 0; i < c4364u4Mo10159b.f23500b.m9350e(); i++) {
            c4364u4Mo10166i.m10275j(c4364u4Mo10159b.f23500b.m9349d(i));
        }
        Iterator<T> it = c4364u4Mo10159b.f23500b.m9352g().iterator();
        while (it.hasNext()) {
            c4364u4Mo10166i.m10275j((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m9473l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static int m9474m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (AbstractC4238l4.m9944D(i) * list.size()) + m9465d(list);
    }

    /* JADX INFO: renamed from: n */
    public static int m9475n(int i, List<AbstractC4402x3> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM9944D = AbstractC4238l4.m9944D(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM9944D += AbstractC4238l4.m9966p(list.get(i2));
        }
        return iM9944D;
    }

    /* JADX INFO: renamed from: o */
    public static int m9476o(int i, List<InterfaceC4240l6> list, InterfaceC4431z6 interfaceC4431z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM9971x = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM9971x += AbstractC4238l4.m9971x(i, list.get(i2), interfaceC4431z6);
        }
        return iM9971x;
    }

    /* JADX INFO: renamed from: p */
    public static int m9477p(List<Long> list) {
        int iM9946F;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4430z5) {
            C4430z5 c4430z5 = (C4430z5) list;
            iM9946F = 0;
            while (i < size) {
                iM9946F += AbstractC4238l4.m9946F(c4430z5.m10344h(i));
                i++;
            }
        } else {
            iM9946F = 0;
            while (i < size) {
                iM9946F += AbstractC4238l4.m9946F(list.get(i).longValue());
                i++;
            }
        }
        return iM9946F;
    }

    /* JADX INFO: renamed from: q */
    public static void m9478q(int i, List<AbstractC4402x3> list, InterfaceC4158f8 interfaceC4158f8) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
        Objects.requireNonNull(c4266n4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            c4266n4.f23336a.mo9980h(i, list.get(i2));
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m9479r(int i, List<?> list, InterfaceC4158f8 interfaceC4158f8, InterfaceC4431z6 interfaceC4431z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
        Objects.requireNonNull(c4266n4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            c4266n4.m10030e(i, list.get(i2), interfaceC4431z6);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m9480s(int i, List<Float> list, InterfaceC4158f8 interfaceC4158f8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
        Objects.requireNonNull(c4266n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                AbstractC4238l4 abstractC4238l4 = c4266n4.f23336a;
                float fFloatValue = list.get(i2).floatValue();
                Objects.requireNonNull(abstractC4238l4);
                abstractC4238l4.mo9974G(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c4266n4.f23336a.mo9978f(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).floatValue();
            Logger logger = AbstractC4238l4.f23285a;
            i3 += 4;
        }
        c4266n4.f23336a.mo9986r(i3);
        while (i2 < list.size()) {
            AbstractC4238l4 abstractC4238l5 = c4266n4.f23336a;
            float fFloatValue2 = list.get(i2).floatValue();
            Objects.requireNonNull(abstractC4238l5);
            abstractC4238l5.mo9973C(Float.floatToRawIntBits(fFloatValue2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: t */
    public static int m9481t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC4238l4.m9944D(i) * size) + m9477p(list);
    }

    /* JADX INFO: renamed from: u */
    public static int m9482u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC4238l4.m9944D(i) * size) + m9483v(list);
    }

    /* JADX INFO: renamed from: v */
    public static int m9483v(List<Long> list) {
        int iM9950K;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4430z5) {
            C4430z5 c4430z5 = (C4430z5) list;
            iM9950K = 0;
            while (i < size) {
                iM9950K += AbstractC4238l4.m9950K(c4430z5.m10344h(i));
                i++;
            }
        } else {
            iM9950K = 0;
            while (i < size) {
                iM9950K += AbstractC4238l4.m9950K(list.get(i).longValue());
                i++;
            }
        }
        return iM9950K;
    }

    /* JADX INFO: renamed from: w */
    public static void m9484w(int i, List<Long> list, InterfaceC4158f8 interfaceC4158f8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
        Objects.requireNonNull(c4266n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c4266n4.f23336a.mo9979g(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        c4266n4.f23336a.mo9978f(i, 2);
        int iM9946F = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM9946F += AbstractC4238l4.m9946F(list.get(i3).longValue());
        }
        c4266n4.f23336a.mo9986r(iM9946F);
        while (i2 < list.size()) {
            c4266n4.f23336a.mo9985m(list.get(i2).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static int m9485x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC4238l4.m9944D(i) * size) + m9486y(list);
    }

    /* JADX INFO: renamed from: y */
    public static int m9486y(List<Integer> list) {
        int iM9947H;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4141e5) {
            C4141e5 c4141e5 = (C4141e5) list;
            iM9947H = 0;
            while (i < size) {
                iM9947H += AbstractC4238l4.m9947H(c4141e5.m9554h(i));
                i++;
            }
        } else {
            iM9947H = 0;
            while (i < size) {
                iM9947H += AbstractC4238l4.m9947H(list.get(i).intValue());
                i++;
            }
        }
        return iM9947H;
    }

    /* JADX INFO: renamed from: z */
    public static void m9487z(int i, List<Long> list, InterfaceC4158f8 interfaceC4158f8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C4266n4 c4266n4 = (C4266n4) interfaceC4158f8;
        Objects.requireNonNull(c4266n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c4266n4.f23336a.mo9979g(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        c4266n4.f23336a.mo9978f(i, 2);
        int iM9946F = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM9946F += AbstractC4238l4.m9946F(list.get(i3).longValue());
        }
        c4266n4.f23336a.mo9986r(iM9946F);
        while (i2 < list.size()) {
            c4266n4.f23336a.mo9985m(list.get(i2).longValue());
            i2++;
        }
    }
}
