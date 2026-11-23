package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.C2768b;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4321r3;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4429z4;
import p007c.p190n.p194b.p266d.p314j.p325k.C4095b1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4096b2;
import p007c.p190n.p194b.p266d.p314j.p325k.C4109c1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4123d1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4151f1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4165g1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4179h1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4207j1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4221k1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4235l1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4239l5;
import p007c.p190n.p194b.p266d.p314j.p325k.C4250m2;
import p007c.p190n.p194b.p266d.p314j.p325k.C4280o4;
import p007c.p190n.p194b.p266d.p314j.p325k.C4290p0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4304q0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4318r0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4332s0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4430z5;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4226k6;

/* JADX INFO: renamed from: c.n.b.d.k.b.t9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4679t9 extends AbstractC4587l9 {
    public C4679t9(C4611n9 c4611n9) {
        super(c4611n9);
    }

    /* JADX INFO: renamed from: A */
    public static String m10782A(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: B */
    public static List<Long> m10783B(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j2 |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    public static List<C4151f1> m10784D(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                C4151f1.a aVarM9571O = C4151f1.m9571O();
                for (String str : bundle.keySet()) {
                    C4151f1.a aVarM9571O2 = C4151f1.m9571O();
                    aVarM9571O2.m9593x(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        aVarM9571O2.m9592w(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        aVarM9571O2.m9594y((String) obj);
                    } else if (obj instanceof Double) {
                        aVarM9571O2.m9591v(((Double) obj).doubleValue());
                    }
                    if (aVarM9571O.f23087h) {
                        aVarM9571O.m9431r();
                        aVarM9571O.f23087h = false;
                    }
                    C4151f1.m9576v((C4151f1) aVarM9571O.f23086g, (C4151f1) ((AbstractC4099b5) aVarM9571O2.m9433t()));
                }
                if (((C4151f1) aVarM9571O.f23086g).m9588N() > 0) {
                    arrayList.add((C4151f1) ((AbstractC4099b5) aVarM9571O.m9433t()));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public static void m10785E(C4123d1.a aVar, String str, Object obj) {
        List<C4151f1> listM9529A = aVar.m9529A();
        int i = 0;
        while (true) {
            if (i >= listM9529A.size()) {
                i = -1;
                break;
            } else if (str.equals(listM9529A.get(i).m9590z())) {
                break;
            } else {
                i++;
            }
        }
        C4151f1.a aVarM9571O = C4151f1.m9571O();
        aVarM9571O.m9593x(str);
        if (obj instanceof Long) {
            aVarM9571O.m9592w(((Long) obj).longValue());
        } else if (obj instanceof String) {
            aVarM9571O.m9594y((String) obj);
        } else if (obj instanceof Double) {
            aVarM9571O.m9591v(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            List<C4151f1> listM10784D = m10784D((Bundle[]) obj);
            if (aVarM9571O.f23087h) {
                aVarM9571O.m9431r();
                aVarM9571O.f23087h = false;
            }
            C4151f1.m9577w((C4151f1) aVarM9571O.f23086g, listM10784D);
        }
        if (i < 0) {
            aVar.m9537x(aVarM9571O);
            return;
        }
        if (aVar.f23087h) {
            aVar.m9431r();
            aVar.f23087h = false;
        }
        C4123d1.m9514w((C4123d1) aVar.f23086g, i, (C4151f1) ((AbstractC4099b5) aVarM9571O.m9433t()));
    }

    /* JADX INFO: renamed from: H */
    public static void m10786H(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m10787J(StringBuilder sb, int i, String str, C4304q0 c4304q0) {
        if (c4304q0 == null) {
            return;
        }
        m10786H(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (c4304q0.m10148s()) {
            m10789L(sb, i, "comparison_type", c4304q0.m10149t().name());
        }
        if (c4304q0.m10150u()) {
            m10789L(sb, i, "match_as_float", Boolean.valueOf(c4304q0.m10151v()));
        }
        if (c4304q0.m10152w()) {
            m10789L(sb, i, "comparison_value", c4304q0.m10153x());
        }
        if (c4304q0.m10154y()) {
            m10789L(sb, i, "min_comparison_value", c4304q0.m10155z());
        }
        if (c4304q0.m10146A()) {
            m10789L(sb, i, "max_comparison_value", c4304q0.m10147B());
        }
        m10786H(sb, i);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: K */
    public static void m10788K(StringBuilder sb, int i, String str, C4207j1 c4207j1) {
        if (c4207j1 == null) {
            return;
        }
        m10786H(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (c4207j1.m9851E() != 0) {
            m10786H(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : c4207j1.m9850C()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (c4207j1.m9858x() != 0) {
            m10786H(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : c4207j1.m9857t()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (c4207j1.m9853H() != 0) {
            m10786H(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (C4109c1 c4109c1 : c4207j1.m9852G()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(c4109c1.m9497u() ? Integer.valueOf(c4109c1.m9498v()) : null);
                sb.append(":");
                sb.append(c4109c1.m9499w() ? Long.valueOf(c4109c1.m9500x()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (c4207j1.m9855J() != 0) {
            m10786H(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (C4221k1 c4221k1 : c4207j1.m9854I()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(c4221k1.m9917v() ? Integer.valueOf(c4221k1.m9918w()) : null);
                sb.append(": [");
                Iterator<Long> it = c4221k1.m9919x().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        m10786H(sb, 3);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: L */
    public static void m10789L(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m10786H(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* JADX INFO: renamed from: O */
    public static boolean m10790O(C4625p c4625p, C4480ca c4480ca) {
        Objects.requireNonNull(c4625p, "null reference");
        return (TextUtils.isEmpty(c4480ca.f23799g) && TextUtils.isEmpty(c4480ca.f23815w)) ? false : true;
    }

    /* JADX INFO: renamed from: P */
    public static boolean m10791P(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m10792Q(List<Long> list, int i) {
        if (i < (((C4430z5) list).f23656i << 6)) {
            return ((1 << (i % 64)) & ((Long) ((C4430z5) list).get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: R */
    public static Object m10793R(C4123d1 c4123d1, String str) {
        C4151f1 c4151f1M10795w = m10795w(c4123d1, str);
        if (c4151f1M10795w == null) {
            return null;
        }
        if (c4151f1M10795w.m9579D()) {
            return c4151f1M10795w.m9580E();
        }
        if (c4151f1M10795w.m9581G()) {
            return Long.valueOf(c4151f1M10795w.m9582H());
        }
        if (c4151f1M10795w.m9585K()) {
            return Double.valueOf(c4151f1M10795w.m9586L());
        }
        if (c4151f1M10795w.m9588N() <= 0) {
            return null;
        }
        List<C4151f1> listM9587M = c4151f1M10795w.m9587M();
        ArrayList arrayList = new ArrayList();
        for (C4151f1 c4151f1 : listM9587M) {
            if (c4151f1 != null) {
                Bundle bundle = new Bundle();
                for (C4151f1 c4151f2 : c4151f1.m9587M()) {
                    if (c4151f2.m9579D()) {
                        bundle.putString(c4151f2.m9590z(), c4151f2.m9580E());
                    } else if (c4151f2.m9581G()) {
                        bundle.putLong(c4151f2.m9590z(), c4151f2.m9582H());
                    } else if (c4151f2.m9585K()) {
                        bundle.putDouble(c4151f2.m9590z(), c4151f2.m9586L());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: renamed from: s */
    public static int m10794s(C4179h1.a aVar, String str) {
        for (int i = 0; i < ((C4179h1) aVar.f23086g).m9721O0(); i++) {
            if (str.equals(((C4179h1) aVar.f23086g).m9740f0(i).m9931B())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: w */
    public static C4151f1 m10795w(C4123d1 c4123d1, String str) {
        for (C4151f1 c4151f1 : c4123d1.m9528t()) {
            if (c4151f1.m9590z().equals(str)) {
                return c4151f1;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static <Builder extends InterfaceC4226k6> Builder m10796x(Builder builder, byte[] bArr) throws C4239l5 {
        C4280o4 c4280o4M10341b = C4280o4.f23379b;
        if (c4280o4M10341b == null) {
            synchronized (C4280o4.class) {
                c4280o4M10341b = C4280o4.f23379b;
                if (c4280o4M10341b == null) {
                    c4280o4M10341b = AbstractC4429z4.m10341b(C4280o4.class);
                    C4280o4.f23379b = c4280o4M10341b;
                }
            }
        }
        if (c4280o4M10341b != null) {
            AbstractC4321r3 abstractC4321r3 = (AbstractC4321r3) builder;
            Objects.requireNonNull(abstractC4321r3);
            return abstractC4321r3.mo9427m(bArr, 0, bArr.length, c4280o4M10341b);
        }
        AbstractC4321r3 abstractC4321r4 = (AbstractC4321r3) builder;
        Objects.requireNonNull(abstractC4321r4);
        return abstractC4321r4.mo9426l(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: C */
    public final List<Long> m10797C(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                mo10684l().f24421i.m10812b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    mo10684l().f24421i.m10813c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX INFO: renamed from: F */
    public final void m10798F(C4151f1.a aVar, Object obj) {
        Objects.requireNonNull(obj, "null reference");
        if (aVar.f23087h) {
            aVar.m9431r();
            aVar.f23087h = false;
        }
        C4151f1.m9573s((C4151f1) aVar.f23086g);
        if (aVar.f23087h) {
            aVar.m9431r();
            aVar.f23087h = false;
        }
        C4151f1.m9567A((C4151f1) aVar.f23086g);
        if (aVar.f23087h) {
            aVar.m9431r();
            aVar.f23087h = false;
        }
        C4151f1.m9569C((C4151f1) aVar.f23086g);
        if (aVar.f23087h) {
            aVar.m9431r();
            aVar.f23087h = false;
        }
        C4151f1.m9570F((C4151f1) aVar.f23086g);
        if (obj instanceof String) {
            aVar.m9594y((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.m9592w(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            aVar.m9591v(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            mo10684l().f24418f.m10812b("Ignoring invalid (type) event param value", obj);
            return;
        }
        List<C4151f1> listM10784D = m10784D((Bundle[]) obj);
        if (aVar.f23087h) {
            aVar.m9431r();
            aVar.f23087h = false;
        }
        C4151f1.m9577w((C4151f1) aVar.f23086g, listM10784D);
    }

    /* JADX INFO: renamed from: G */
    public final void m10799G(C4235l1.a aVar, Object obj) {
        Objects.requireNonNull(obj, "null reference");
        if (aVar.f23087h) {
            aVar.m9431r();
            aVar.f23087h = false;
        }
        C4235l1.m9925s((C4235l1) aVar.f23086g);
        if (aVar.f23087h) {
            aVar.m9431r();
            aVar.f23087h = false;
        }
        C4235l1.m9929y((C4235l1) aVar.f23086g);
        if (aVar.f23087h) {
            aVar.m9431r();
            aVar.f23087h = false;
        }
        C4235l1.m9922C((C4235l1) aVar.f23086g);
        if (obj instanceof String) {
            String str = (String) obj;
            if (aVar.f23087h) {
                aVar.m9431r();
                aVar.f23087h = false;
            }
            C4235l1.m9921A((C4235l1) aVar.f23086g, str);
            return;
        }
        if (obj instanceof Long) {
            aVar.m9942x(((Long) obj).longValue());
            return;
        }
        if (!(obj instanceof Double)) {
            mo10684l().f24418f.m10812b("Ignoring invalid (type) user attribute value", obj);
            return;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if (aVar.f23087h) {
            aVar.m9431r();
            aVar.f23087h = false;
        }
        C4235l1.m9926t((C4235l1) aVar.f23086g, dDoubleValue);
    }

    /* JADX INFO: renamed from: I */
    public final void m10800I(StringBuilder sb, int i, C4290p0 c4290p0) {
        if (c4290p0 == null) {
            return;
        }
        m10786H(sb, i);
        sb.append("filter {\n");
        if (c4290p0.m10131x()) {
            m10789L(sb, i, "complement", Boolean.valueOf(c4290p0.m10132y()));
        }
        if (c4290p0.m10133z()) {
            m10789L(sb, i, "param_name", m10816e().m10720x(c4290p0.m10126A()));
        }
        if (c4290p0.m10127t()) {
            int i2 = i + 1;
            C4332s0 c4332s0M10128u = c4290p0.m10128u();
            if (c4332s0M10128u != null) {
                m10786H(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (c4332s0M10128u.m10193s()) {
                    m10789L(sb, i2, "match_type", c4332s0M10128u.m10194t().name());
                }
                if (c4332s0M10128u.m10195u()) {
                    m10789L(sb, i2, "expression", c4332s0M10128u.m10196v());
                }
                if (c4332s0M10128u.m10197w()) {
                    m10789L(sb, i2, "case_sensitive", Boolean.valueOf(c4332s0M10128u.m10198x()));
                }
                if (c4332s0M10128u.m10200z() > 0) {
                    m10786H(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str : c4332s0M10128u.m10199y()) {
                        m10786H(sb, i2 + 2);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m10786H(sb, i2);
                sb.append("}\n");
            }
        }
        if (c4290p0.m10129v()) {
            m10787J(sb, i + 1, "number_filter", c4290p0.m10130w());
        }
        m10786H(sb, i);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: M */
    public final void m10801M(StringBuilder sb, int i, List<C4151f1> list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        for (C4151f1 c4151f1 : list) {
            if (c4151f1 != null) {
                m10786H(sb, i2);
                sb.append("param {\n");
                m10789L(sb, i2, "name", c4151f1.m9589y() ? m10816e().m10720x(c4151f1.m9590z()) : null);
                m10789L(sb, i2, "string_value", c4151f1.m9579D() ? c4151f1.m9580E() : null);
                m10789L(sb, i2, "int_value", c4151f1.m9581G() ? Long.valueOf(c4151f1.m9582H()) : null);
                m10789L(sb, i2, "double_value", c4151f1.m9585K() ? Double.valueOf(c4151f1.m9586L()) : null);
                if (c4151f1.m9588N() > 0) {
                    m10801M(sb, i2, c4151f1.m9587M());
                }
                m10786H(sb, i2);
                sb.append("}\n");
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final boolean m10802N(long j2, long j3) {
        return j2 == 0 || j3 <= 0 || Math.abs(this.f24476a.f24541o.mo5623c() - j2) > j3;
    }

    /* JADX INFO: renamed from: S */
    public final byte[] m10803S(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i = gZIPInputStream.read(bArr2);
                if (i <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i);
            }
        } catch (IOException e) {
            mo10684l().f24418f.m10812b("Failed to ungzip content", e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: T */
    public final byte[] m10804T(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo10684l().f24418f.m10812b("Failed to gzip content", e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: U */
    public final List<Integer> m10805U() {
        Context context = this.f24132b.f24201k.f24528b;
        List<C4581l3<?>> list = C4647r.f24337a;
        C4096b2 c4096b2M9404a = C4096b2.m9404a(context.getContentResolver(), C4250m2.m10005a("com.google.android.gms.measurement"));
        Map<String, String> mapEmptyMap = c4096b2M9404a == null ? Collections.emptyMap() : c4096b2M9404a.m9406b();
        if (mapEmptyMap == null || mapEmptyMap.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = C4647r.f24326P.m10638a(null).intValue();
        for (Map.Entry<String, String> entry : mapEmptyMap.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int i = Integer.parseInt(entry.getValue());
                    if (i != 0) {
                        arrayList.add(Integer.valueOf(i));
                        if (arrayList.size() >= iIntValue) {
                            mo10684l().f24421i.m10812b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    mo10684l().f24421i.m10812b("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4587l9
    /* JADX INFO: renamed from: p */
    public final boolean mo10577p() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final long m10806t(byte[] bArr) {
        m10817f().mo10381b();
        MessageDigest messageDigestM10869x0 = C4723x9.m10869x0();
        if (messageDigestM10869x0 != null) {
            return C4723x9.m10868w(messageDigestM10869x0.digest(bArr));
        }
        mo10684l().f24418f.m10811a("Failed to get MD5");
        return 0L;
    }

    /* JADX INFO: renamed from: u */
    public final <T extends Parcelable> T m10807u(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (C2768b unused) {
            mo10684l().f24418f.m10811a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: v */
    public final C4123d1 m10808v(C4589m c4589m) {
        C4123d1.a aVarM9510K = C4123d1.m9510K();
        long j2 = c4589m.f24138e;
        if (aVarM9510K.f23087h) {
            aVarM9510K.m9431r();
            aVarM9510K.f23087h = false;
        }
        C4123d1.m9509C((C4123d1) aVarM9510K.f23086g, j2);
        C4613o c4613o = c4589m.f24139f;
        Objects.requireNonNull(c4613o);
        for (String str : c4613o.f24221f.keySet()) {
            C4151f1.a aVarM9571O = C4151f1.m9571O();
            aVarM9571O.m9593x(str);
            m10798F(aVarM9571O, c4589m.f24139f.m10701H(str));
            aVarM9510K.m9537x(aVarM9571O);
        }
        return (C4123d1) ((AbstractC4099b5) aVarM9510K.m9433t());
    }

    /* JADX INFO: renamed from: y */
    public final String m10809y(C4318r0 c4318r0) {
        StringBuilder sbM1556G = outline.m1556G("\nproperty_filter {\n");
        if (c4318r0.m10178t()) {
            m10789L(sbM1556G, 0, "filter_id", Integer.valueOf(c4318r0.m10179u()));
        }
        m10789L(sbM1556G, 0, "property_name", m10816e().m10721y(c4318r0.m10180v()));
        String strM10782A = m10782A(c4318r0.m10182x(), c4318r0.m10183y(), c4318r0.m10177A());
        if (!strM10782A.isEmpty()) {
            m10789L(sbM1556G, 0, "filter_type", strM10782A);
        }
        m10800I(sbM1556G, 1, c4318r0.m10181w());
        sbM1556G.append("}\n");
        return sbM1556G.toString();
    }

    /* JADX INFO: renamed from: z */
    public final String m10810z(C4165g1 c4165g1) {
        StringBuilder sbM1556G = outline.m1556G("\nbatch {\n");
        for (C4179h1 c4179h1 : c4165g1.m9630t()) {
            if (c4179h1 != null) {
                m10786H(sbM1556G, 1);
                sbM1556G.append("bundle {\n");
                if (c4179h1.m9701C()) {
                    m10789L(sbM1556G, 1, "protocol_version", Integer.valueOf(c4179h1.m9739e0()));
                }
                m10789L(sbM1556G, 1, "platform", c4179h1.m9760x1());
                if (c4179h1.m9712H1()) {
                    m10789L(sbM1556G, 1, "gmp_version", Long.valueOf(c4179h1.m9704D()));
                }
                if (c4179h1.m9707F()) {
                    m10789L(sbM1556G, 1, "uploading_gmp_version", Long.valueOf(c4179h1.m9709G()));
                }
                if (c4179h1.m9746n0()) {
                    m10789L(sbM1556G, 1, "dynamite_version", Long.valueOf(c4179h1.m9748o0()));
                }
                if (c4179h1.m9732Y()) {
                    m10789L(sbM1556G, 1, "config_version", Long.valueOf(c4179h1.m9734Z()));
                }
                m10789L(sbM1556G, 1, "gmp_app_id", c4179h1.m9723Q());
                m10789L(sbM1556G, 1, "admob_app_id", c4179h1.m9744m0());
                m10789L(sbM1556G, 1, "app_id", c4179h1.m9708F1());
                m10789L(sbM1556G, 1, "app_version", c4179h1.m9710G1());
                if (c4179h1.m9728V()) {
                    m10789L(sbM1556G, 1, "app_version_major", Integer.valueOf(c4179h1.m9729W()));
                }
                m10789L(sbM1556G, 1, "firebase_instance_id", c4179h1.m9727U());
                if (c4179h1.m9717L()) {
                    m10789L(sbM1556G, 1, "dev_cert_hash", Long.valueOf(c4179h1.m9718M()));
                }
                m10789L(sbM1556G, 1, "app_store", c4179h1.m9706E1());
                if (c4179h1.m9731X0()) {
                    m10789L(sbM1556G, 1, "upload_timestamp_millis", Long.valueOf(c4179h1.m9733Y0()));
                }
                if (c4179h1.m9741f1()) {
                    m10789L(sbM1556G, 1, "start_timestamp_millis", Long.valueOf(c4179h1.m9742g1()));
                }
                if (c4179h1.m9745m1()) {
                    m10789L(sbM1556G, 1, "end_timestamp_millis", Long.valueOf(c4179h1.m9747n1()));
                }
                if (c4179h1.m9752r1()) {
                    m10789L(sbM1556G, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c4179h1.m9754s1()));
                }
                if (c4179h1.m9756u1()) {
                    m10789L(sbM1556G, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c4179h1.m9758v1()));
                }
                m10789L(sbM1556G, 1, "app_instance_id", c4179h1.m9716K());
                m10789L(sbM1556G, 1, "resettable_device_id", c4179h1.m9711H());
                m10789L(sbM1556G, 1, "device_id", c4179h1.m9730X());
                m10789L(sbM1556G, 1, "ds_id", c4179h1.m9737c0());
                if (c4179h1.m9713I()) {
                    m10789L(sbM1556G, 1, "limited_ad_tracking", Boolean.valueOf(c4179h1.m9714J()));
                }
                m10789L(sbM1556G, 1, "os_version", c4179h1.m9761z1());
                m10789L(sbM1556G, 1, "device_model", c4179h1.m9699A1());
                m10789L(sbM1556G, 1, "user_default_language", c4179h1.m9700B1());
                if (c4179h1.m9703C1()) {
                    m10789L(sbM1556G, 1, "time_zone_offset_minutes", Integer.valueOf(c4179h1.m9705D1()));
                }
                if (c4179h1.m9719N()) {
                    m10789L(sbM1556G, 1, "bundle_sequential_index", Integer.valueOf(c4179h1.m9720O()));
                }
                if (c4179h1.m9724R()) {
                    m10789L(sbM1556G, 1, "service_upload", Boolean.valueOf(c4179h1.m9725S()));
                }
                m10789L(sbM1556G, 1, "health_monitor", c4179h1.m9722P());
                if (!this.f24476a.f24534h.m10417k(C4647r.f24386y0) && c4179h1.m9735a0() && c4179h1.m9736b0() != 0) {
                    m10789L(sbM1556G, 1, "android_id", Long.valueOf(c4179h1.m9736b0()));
                }
                if (c4179h1.m9738d0()) {
                    m10789L(sbM1556G, 1, "retry_counter", Integer.valueOf(c4179h1.m9743l0()));
                }
                if (c4179h1.m9750q0()) {
                    m10789L(sbM1556G, 1, "consent_signals", c4179h1.m9751r0());
                }
                List<C4235l1> listM9715J0 = c4179h1.m9715J0();
                if (listM9715J0 != null) {
                    for (C4235l1 c4235l1 : listM9715J0) {
                        if (c4235l1 != null) {
                            m10786H(sbM1556G, 2);
                            sbM1556G.append("user_property {\n");
                            m10789L(sbM1556G, 2, "set_timestamp_millis", c4235l1.m9938w() ? Long.valueOf(c4235l1.m9939x()) : null);
                            m10789L(sbM1556G, 2, "name", m10816e().m10721y(c4235l1.m9931B()));
                            m10789L(sbM1556G, 2, "string_value", c4235l1.m9933E());
                            m10789L(sbM1556G, 2, "int_value", c4235l1.m9934F() ? Long.valueOf(c4235l1.m9935G()) : null);
                            m10789L(sbM1556G, 2, "double_value", c4235l1.m9936H() ? Double.valueOf(c4235l1.m9937I()) : null);
                            m10786H(sbM1556G, 2);
                            sbM1556G.append("}\n");
                        }
                    }
                }
                List<C4095b1> listM9726T = c4179h1.m9726T();
                if (listM9726T != null) {
                    for (C4095b1 c4095b1 : listM9726T) {
                        if (c4095b1 != null) {
                            m10786H(sbM1556G, 2);
                            sbM1556G.append("audience_membership {\n");
                            if (c4095b1.m9400v()) {
                                m10789L(sbM1556G, 2, "audience_id", Integer.valueOf(c4095b1.m9401w()));
                            }
                            if (c4095b1.m9397B()) {
                                m10789L(sbM1556G, 2, "new_audience", Boolean.valueOf(c4095b1.m9398C()));
                            }
                            m10788K(sbM1556G, 2, "current_data", c4095b1.m9402y());
                            if (c4095b1.m9403z()) {
                                m10788K(sbM1556G, 2, "previous_data", c4095b1.m9396A());
                            }
                            m10786H(sbM1556G, 2);
                            sbM1556G.append("}\n");
                        }
                    }
                }
                List<C4123d1> listM9759w0 = c4179h1.m9759w0();
                if (listM9759w0 != null) {
                    for (C4123d1 c4123d1 : listM9759w0) {
                        if (c4123d1 != null) {
                            m10786H(sbM1556G, 2);
                            sbM1556G.append("event {\n");
                            m10789L(sbM1556G, 2, "name", m10816e().m10718u(c4123d1.m9519D()));
                            if (c4123d1.m9520E()) {
                                m10789L(sbM1556G, 2, "timestamp_millis", Long.valueOf(c4123d1.m9521F()));
                            }
                            if (c4123d1.m9522G()) {
                                m10789L(sbM1556G, 2, "previous_timestamp_millis", Long.valueOf(c4123d1.m9523H()));
                            }
                            if (c4123d1.m9524I()) {
                                m10789L(sbM1556G, 2, "count", Integer.valueOf(c4123d1.m9525J()));
                            }
                            if (c4123d1.m9518B() != 0) {
                                m10801M(sbM1556G, 2, c4123d1.m9528t());
                            }
                            m10786H(sbM1556G, 2);
                            sbM1556G.append("}\n");
                        }
                    }
                }
                m10786H(sbM1556G, 1);
                sbM1556G.append("}\n");
            }
        }
        sbM1556G.append("}\n");
        return sbM1556G.toString();
    }
}
