package p007c.p190n.p194b.p266d.p314j.p320f;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

/* JADX INFO: renamed from: c.n.b.d.j.f.b7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3826b7 {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f22526a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC3946n7<?, ?> f22527b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC3946n7<?, ?> f22528c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC3946n7<?, ?> f22529d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f22526a = cls;
        f22527b = m8973M(false);
        f22528c = m8973M(true);
        f22529d = new C3966p7();
    }

    /* JADX INFO: renamed from: A */
    public static int m8961A(List<Integer> list) {
        int iM9075k;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3824b5) {
            C3824b5 c3824b5 = (C3824b5) list;
            iM9075k = 0;
            while (i < size) {
                iM9075k += AbstractC3923l4.m9075k(c3824b5.m8953f(i));
                i++;
            }
        } else {
            iM9075k = 0;
            while (i < size) {
                iM9075k += AbstractC3923l4.m9075k(list.get(i).intValue());
                i++;
            }
        }
        return iM9075k;
    }

    /* JADX INFO: renamed from: B */
    public static void m8962B(int i, List<Integer> list, InterfaceC3887h8 interfaceC3887h8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
        Objects.requireNonNull(c3943n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3943n4.f22821a.mo9089I(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        c3943n4.f22821a.mo9086B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).intValue();
            Logger logger = AbstractC3923l4.f22763a;
            i3 += 4;
        }
        c3943n4.f22821a.mo9098g(i3);
        while (i2 < list.size()) {
            c3943n4.f22821a.mo9099h(list.get(i2).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: C */
    public static int m8963C(List<Integer> list) {
        int iM9076l;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3824b5) {
            C3824b5 c3824b5 = (C3824b5) list;
            iM9076l = 0;
            while (i < size) {
                iM9076l += AbstractC3923l4.m9076l(c3824b5.m8953f(i));
                i++;
            }
        } else {
            iM9076l = 0;
            while (i < size) {
                iM9076l += AbstractC3923l4.m9076l(list.get(i).intValue());
                i++;
            }
        }
        return iM9076l;
    }

    /* JADX INFO: renamed from: D */
    public static void m8964D(int i, List<Integer> list, InterfaceC3887h8 interfaceC3887h8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
        Objects.requireNonNull(c3943n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3943n4.f22821a.mo9089I(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        c3943n4.f22821a.mo9086B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).intValue();
            Logger logger = AbstractC3923l4.f22763a;
            i3 += 4;
        }
        c3943n4.f22821a.mo9098g(i3);
        while (i2 < list.size()) {
            c3943n4.f22821a.mo9099h(list.get(i2).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: E */
    public static int m8965E(List<?> list) {
        return list.size() << 2;
    }

    /* JADX INFO: renamed from: F */
    public static void m8966F(int i, List<Integer> list, InterfaceC3887h8 interfaceC3887h8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
        Objects.requireNonNull(c3943n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3943n4.f22821a.mo9087D(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        c3943n4.f22821a.mo9086B(i, 2);
        int iM9074j = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM9074j += AbstractC3923l4.m9074j(list.get(i3).intValue());
        }
        c3943n4.f22821a.mo9098g(iM9074j);
        while (i2 < list.size()) {
            c3943n4.f22821a.mo9097f(list.get(i2).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: G */
    public static int m8967G(List<?> list) {
        return list.size() << 3;
    }

    /* JADX INFO: renamed from: H */
    public static void m8968H(int i, List<Boolean> list, InterfaceC3887h8 interfaceC3887h8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
        Objects.requireNonNull(c3943n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3943n4.f22821a.mo9102s(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        c3943n4.f22821a.mo9086B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).booleanValue();
            Logger logger = AbstractC3923l4.f22763a;
            i3++;
        }
        c3943n4.f22821a.mo9098g(i3);
        while (i2 < list.size()) {
            c3943n4.f22821a.mo9103y(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: I */
    public static int m8969I(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (AbstractC3923l4.m9073i(i) * list.size()) + m8995q(list);
    }

    /* JADX INFO: renamed from: J */
    public static int m8970J(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC3923l4.m9073i(i) * size) + m8997s(list);
    }

    /* JADX INFO: renamed from: K */
    public static int m8971K(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC3923l4.m9073i(i) * size) + m8999u(list);
    }

    /* JADX INFO: renamed from: L */
    public static int m8972L(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC3923l4.m9073i(i) * size) + m9001w(list);
    }

    /* JADX INFO: renamed from: M */
    public static AbstractC3946n7<?, ?> m8973M(boolean z) {
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
            return (AbstractC3946n7) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: N */
    public static int m8974N(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC3923l4.m9073i(i) * size) + m9003y(list);
    }

    /* JADX INFO: renamed from: O */
    public static int m8975O(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC3923l4.m9073i(i) * size) + m8961A(list);
    }

    /* JADX INFO: renamed from: P */
    public static int m8976P(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC3923l4.m9073i(i) * size) + m8963C(list);
    }

    /* JADX INFO: renamed from: Q */
    public static int m8977Q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC3923l4.m9066N(i) * size;
    }

    /* JADX INFO: renamed from: R */
    public static int m8978R(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC3923l4.m9061G(i) * size;
    }

    /* JADX INFO: renamed from: a */
    public static void m8979a(int i, List<String> list, InterfaceC3887h8 interfaceC3887h8) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
        Objects.requireNonNull(c3943n4);
        int i2 = 0;
        if (!(list instanceof InterfaceC3994s5)) {
            while (i2 < list.size()) {
                c3943n4.f22821a.mo9101r(i, list.get(i2));
                i2++;
            }
            return;
        }
        InterfaceC3994s5 interfaceC3994s5 = (InterfaceC3994s5) list;
        while (i2 < list.size()) {
            Object objMo9179d = interfaceC3994s5.mo9179d(i2);
            if (objMo9179d instanceof String) {
                c3943n4.f22821a.mo9101r(i, (String) objMo9179d);
            } else {
                c3943n4.f22821a.mo9094c(i, (AbstractC3823b4) objMo9179d);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m8980b(int i, List<?> list, InterfaceC3887h8 interfaceC3887h8, InterfaceC4059z6 interfaceC4059z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
        Objects.requireNonNull(c3943n4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            c3943n4.f22821a.mo9096e(i, (InterfaceC3895i6) list.get(i2), interfaceC4059z6);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m8981c(int i, List<Double> list, InterfaceC3887h8 interfaceC3887h8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
        Objects.requireNonNull(c3943n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                AbstractC3923l4 abstractC3923l4 = c3943n4.f22821a;
                double dDoubleValue = list.get(i2).doubleValue();
                Objects.requireNonNull(abstractC3923l4);
                abstractC3923l4.mo9104z(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c3943n4.f22821a.mo9086B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).doubleValue();
            Logger logger = AbstractC3923l4.f22763a;
            i3 += 8;
        }
        c3943n4.f22821a.mo9098g(i3);
        while (i2 < list.size()) {
            AbstractC3923l4 abstractC3923l5 = c3943n4.f22821a;
            double dDoubleValue2 = list.get(i2).doubleValue();
            Objects.requireNonNull(abstractC3923l5);
            abstractC3923l5.mo9092R(Double.doubleToRawLongBits(dDoubleValue2));
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
    /* JADX INFO: renamed from: d */
    public static <T, FT extends InterfaceC3993s4<FT>> void m8982d(AbstractC3963p4<FT> abstractC3963p4, T t, T t2) {
        C3973q4<T> c3973q4Mo9175c = abstractC3963p4.mo9175c(t2);
        if (c3973q4Mo9175c.f22847b.isEmpty()) {
            return;
        }
        C3973q4<T> c3973q4Mo9176d = abstractC3963p4.mo9176d(t);
        Objects.requireNonNull(c3973q4Mo9176d);
        for (int i = 0; i < c3973q4Mo9175c.f22847b.m8937f(); i++) {
            c3973q4Mo9176d.m9198j(c3973q4Mo9175c.f22847b.m8934c(i));
        }
        Iterator<T> it = c3973q4Mo9175c.f22847b.m8938g().iterator();
        while (it.hasNext()) {
            c3973q4Mo9176d.m9198j((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m8983e(int i, List<AbstractC3823b4> list, InterfaceC3887h8 interfaceC3887h8) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
        Objects.requireNonNull(c3943n4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            c3943n4.f22821a.mo9094c(i, list.get(i2));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m8984f(int i, List<?> list, InterfaceC3887h8 interfaceC3887h8, InterfaceC4059z6 interfaceC4059z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
        Objects.requireNonNull(c3943n4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            c3943n4.m9155f(i, list.get(i2), interfaceC4059z6);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m8985g(int i, List<Float> list, InterfaceC3887h8 interfaceC3887h8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
        Objects.requireNonNull(c3943n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                AbstractC3923l4 abstractC3923l4 = c3943n4.f22821a;
                float fFloatValue = list.get(i2).floatValue();
                Objects.requireNonNull(abstractC3923l4);
                abstractC3923l4.mo9089I(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c3943n4.f22821a.mo9086B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).floatValue();
            Logger logger = AbstractC3923l4.f22763a;
            i3 += 4;
        }
        c3943n4.f22821a.mo9098g(i3);
        while (i2 < list.size()) {
            AbstractC3923l4 abstractC3923l5 = c3943n4.f22821a;
            float fFloatValue2 = list.get(i2).floatValue();
            Objects.requireNonNull(abstractC3923l5);
            abstractC3923l5.mo9099h(Float.floatToRawIntBits(fFloatValue2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m8986h(int i, Object obj, InterfaceC4059z6 interfaceC4059z6) {
        if (!(obj instanceof C3974q5)) {
            return AbstractC3923l4.m9072a((InterfaceC3895i6) obj, interfaceC4059z6) + AbstractC3923l4.m9073i(i);
        }
        int iM9073i = AbstractC3923l4.m9073i(i);
        int iM9202c = ((C3974q5) obj).m9202c();
        return AbstractC3923l4.m9075k(iM9202c) + iM9202c + iM9073i;
    }

    /* JADX INFO: renamed from: i */
    public static int m8987i(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM9073i = AbstractC3923l4.m9073i(i) * size;
        if (list instanceof InterfaceC3994s5) {
            InterfaceC3994s5 interfaceC3994s5 = (InterfaceC3994s5) list;
            while (i2 < size) {
                Object objMo9179d = interfaceC3994s5.mo9179d(i2);
                iM9073i = (objMo9179d instanceof AbstractC3823b4 ? AbstractC3923l4.m9080p((AbstractC3823b4) objMo9179d) : AbstractC3923l4.m9077m((String) objMo9179d)) + iM9073i;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iM9073i = (obj instanceof AbstractC3823b4 ? AbstractC3923l4.m9080p((AbstractC3823b4) obj) : AbstractC3923l4.m9077m((String) obj)) + iM9073i;
                i2++;
            }
        }
        return iM9073i;
    }

    /* JADX INFO: renamed from: j */
    public static int m8988j(int i, List<?> list, InterfaceC4059z6 interfaceC4059z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM9073i = AbstractC3923l4.m9073i(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C3974q5) {
                int iM9202c = ((C3974q5) obj).m9202c();
                iM9073i += AbstractC3923l4.m9075k(iM9202c) + iM9202c;
            } else {
                iM9073i = AbstractC3923l4.m9072a((InterfaceC3895i6) obj, interfaceC4059z6) + iM9073i;
            }
        }
        return iM9073i;
    }

    /* JADX INFO: renamed from: k */
    public static void m8989k(int i, List<Long> list, InterfaceC3887h8 interfaceC3887h8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
        Objects.requireNonNull(c3943n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3943n4.f22821a.mo9093b(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        c3943n4.f22821a.mo9086B(i, 2);
        int iM9069S = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM9069S += AbstractC3923l4.m9069S(list.get(i3).longValue());
        }
        c3943n4.f22821a.mo9098g(iM9069S);
        while (i2 < list.size()) {
            c3943n4.f22821a.mo9091O(list.get(i2).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: l */
    public static int m8990l(int i, List<AbstractC3823b4> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM9073i = AbstractC3923l4.m9073i(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM9073i += AbstractC3923l4.m9080p(list.get(i2));
        }
        return iM9073i;
    }

    /* JADX INFO: renamed from: m */
    public static int m8991m(int i, List<InterfaceC3895i6> list, InterfaceC4059z6 interfaceC4059z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM9084w = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM9084w += AbstractC3923l4.m9084w(i, list.get(i2), interfaceC4059z6);
        }
        return iM9084w;
    }

    /* JADX INFO: renamed from: n */
    public static void m8992n(int i, List<Long> list, InterfaceC3887h8 interfaceC3887h8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
        Objects.requireNonNull(c3943n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3943n4.f22821a.mo9093b(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        c3943n4.f22821a.mo9086B(i, 2);
        int iM9069S = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM9069S += AbstractC3923l4.m9069S(list.get(i3).longValue());
        }
        c3943n4.f22821a.mo9098g(iM9069S);
        while (i2 < list.size()) {
            c3943n4.f22821a.mo9091O(list.get(i2).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m8993o(int i, List<Long> list, InterfaceC3887h8 interfaceC3887h8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
        Objects.requireNonNull(c3943n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3943n4.f22821a.mo9093b(i, AbstractC3923l4.m9071U(list.get(i2).longValue()));
                i2++;
            }
            return;
        }
        c3943n4.f22821a.mo9086B(i, 2);
        int iM9070T = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM9070T += AbstractC3923l4.m9070T(list.get(i3).longValue());
        }
        c3943n4.f22821a.mo9098g(iM9070T);
        while (i2 < list.size()) {
            c3943n4.f22821a.mo9091O(AbstractC3923l4.m9071U(list.get(i2).longValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m8994p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static int m8995q(List<Long> list) {
        int iM9069S;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4022v5) {
            C4022v5 c4022v5 = (C4022v5) list;
            iM9069S = 0;
            while (i < size) {
                iM9069S += AbstractC3923l4.m9069S(c4022v5.m9283f(i));
                i++;
            }
        } else {
            iM9069S = 0;
            while (i < size) {
                iM9069S += AbstractC3923l4.m9069S(list.get(i).longValue());
                i++;
            }
        }
        return iM9069S;
    }

    /* JADX INFO: renamed from: r */
    public static void m8996r(int i, List<Long> list, InterfaceC3887h8 interfaceC3887h8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
        Objects.requireNonNull(c3943n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3943n4.f22821a.mo9104z(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        c3943n4.f22821a.mo9086B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).longValue();
            Logger logger = AbstractC3923l4.f22763a;
            i3 += 8;
        }
        c3943n4.f22821a.mo9098g(i3);
        while (i2 < list.size()) {
            c3943n4.f22821a.mo9092R(list.get(i2).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static int m8997s(List<Long> list) {
        int iM9069S;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4022v5) {
            C4022v5 c4022v5 = (C4022v5) list;
            iM9069S = 0;
            while (i < size) {
                iM9069S += AbstractC3923l4.m9069S(c4022v5.m9283f(i));
                i++;
            }
        } else {
            iM9069S = 0;
            while (i < size) {
                iM9069S += AbstractC3923l4.m9069S(list.get(i).longValue());
                i++;
            }
        }
        return iM9069S;
    }

    /* JADX INFO: renamed from: t */
    public static void m8998t(int i, List<Long> list, InterfaceC3887h8 interfaceC3887h8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
        Objects.requireNonNull(c3943n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3943n4.f22821a.mo9104z(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        c3943n4.f22821a.mo9086B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).longValue();
            Logger logger = AbstractC3923l4.f22763a;
            i3 += 8;
        }
        c3943n4.f22821a.mo9098g(i3);
        while (i2 < list.size()) {
            c3943n4.f22821a.mo9092R(list.get(i2).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static int m8999u(List<Long> list) {
        int iM9070T;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4022v5) {
            C4022v5 c4022v5 = (C4022v5) list;
            iM9070T = 0;
            while (i < size) {
                iM9070T += AbstractC3923l4.m9070T(c4022v5.m9283f(i));
                i++;
            }
        } else {
            iM9070T = 0;
            while (i < size) {
                iM9070T += AbstractC3923l4.m9070T(list.get(i).longValue());
                i++;
            }
        }
        return iM9070T;
    }

    /* JADX INFO: renamed from: v */
    public static void m9000v(int i, List<Integer> list, InterfaceC3887h8 interfaceC3887h8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
        Objects.requireNonNull(c3943n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3943n4.f22821a.mo9087D(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        c3943n4.f22821a.mo9086B(i, 2);
        int iM9074j = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM9074j += AbstractC3923l4.m9074j(list.get(i3).intValue());
        }
        c3943n4.f22821a.mo9098g(iM9074j);
        while (i2 < list.size()) {
            c3943n4.f22821a.mo9097f(list.get(i2).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static int m9001w(List<Integer> list) {
        int iM9074j;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3824b5) {
            C3824b5 c3824b5 = (C3824b5) list;
            iM9074j = 0;
            while (i < size) {
                iM9074j += AbstractC3923l4.m9074j(c3824b5.m8953f(i));
                i++;
            }
        } else {
            iM9074j = 0;
            while (i < size) {
                iM9074j += AbstractC3923l4.m9074j(list.get(i).intValue());
                i++;
            }
        }
        return iM9074j;
    }

    /* JADX INFO: renamed from: x */
    public static void m9002x(int i, List<Integer> list, InterfaceC3887h8 interfaceC3887h8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
        Objects.requireNonNull(c3943n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3943n4.f22821a.mo9088F(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        c3943n4.f22821a.mo9086B(i, 2);
        int iM9075k = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM9075k += AbstractC3923l4.m9075k(list.get(i3).intValue());
        }
        c3943n4.f22821a.mo9098g(iM9075k);
        while (i2 < list.size()) {
            c3943n4.f22821a.mo9098g(list.get(i2).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static int m9003y(List<Integer> list) {
        int iM9074j;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3824b5) {
            C3824b5 c3824b5 = (C3824b5) list;
            iM9074j = 0;
            while (i < size) {
                iM9074j += AbstractC3923l4.m9074j(c3824b5.m8953f(i));
                i++;
            }
        } else {
            iM9074j = 0;
            while (i < size) {
                iM9074j += AbstractC3923l4.m9074j(list.get(i).intValue());
                i++;
            }
        }
        return iM9074j;
    }

    /* JADX INFO: renamed from: z */
    public static void m9004z(int i, List<Integer> list, InterfaceC3887h8 interfaceC3887h8, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3943n4 c3943n4 = (C3943n4) interfaceC3887h8;
        Objects.requireNonNull(c3943n4);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3943n4.f22821a.mo9088F(i, AbstractC3923l4.m9078n(list.get(i2).intValue()));
                i2++;
            }
            return;
        }
        c3943n4.f22821a.mo9086B(i, 2);
        int iM9076l = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM9076l += AbstractC3923l4.m9076l(list.get(i3).intValue());
        }
        c3943n4.f22821a.mo9098g(iM9076l);
        while (i2 < list.size()) {
            c3943n4.f22821a.mo9098g(AbstractC3923l4.m9078n(list.get(i2).intValue()));
            i2++;
        }
    }
}
