package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.k.b.q3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4640q3 extends AbstractC4675t5 {

    /* JADX INFO: renamed from: c */
    public static final AtomicReference<String[]> f24280c = new AtomicReference<>();

    /* JADX INFO: renamed from: d */
    public static final AtomicReference<String[]> f24281d = new AtomicReference<>();

    /* JADX INFO: renamed from: e */
    public static final AtomicReference<String[]> f24282e = new AtomicReference<>();

    public C4640q3(C4707w4 c4707w4) {
        super(c4707w4);
    }

    /* JADX INFO: renamed from: v */
    public static String m10715v(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Objects.requireNonNull(atomicReference, "null reference");
        C2622l.m5339a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C4723x9.m10864q0(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4675t5
    /* JADX INFO: renamed from: r */
    public final boolean mo10533r() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final String m10716s(Bundle bundle) {
        String strM10719w;
        if (bundle == null) {
            return null;
        }
        if (!m10722z()) {
            return bundle.toString();
        }
        StringBuilder sbM1556G = outline.m1556G("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbM1556G.length() != 8) {
                sbM1556G.append(", ");
            }
            sbM1556G.append(m10720x(str));
            sbM1556G.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strM10719w = m10719w(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strM10719w = m10719w((Object[]) obj);
            } else {
                strM10719w = obj instanceof ArrayList ? m10719w(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbM1556G.append(strM10719w);
        }
        sbM1556G.append("}]");
        return sbM1556G.toString();
    }

    /* JADX INFO: renamed from: t */
    public final String m10717t(C4625p c4625p) {
        String string;
        if (!m10722z()) {
            return c4625p.toString();
        }
        StringBuilder sbM1556G = outline.m1556G("origin=");
        sbM1556G.append(c4625p.f24251h);
        sbM1556G.append(",name=");
        sbM1556G.append(m10718u(c4625p.f24249f));
        sbM1556G.append(",params=");
        C4613o c4613o = c4625p.f24250g;
        if (c4613o == null) {
            string = null;
        } else {
            string = !m10722z() ? c4613o.toString() : m10716s(c4613o.m10702K());
        }
        sbM1556G.append(string);
        return sbM1556G.toString();
    }

    /* JADX INFO: renamed from: u */
    public final String m10718u(String str) {
        if (str == null) {
            return null;
        }
        return !m10722z() ? str : m10715v(str, C4719x5.f24579c, C4719x5.f24577a, f24280c);
    }

    /* JADX INFO: renamed from: w */
    public final String m10719w(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbM1556G = outline.m1556G("[");
        for (Object obj : objArr) {
            String strM10716s = obj instanceof Bundle ? m10716s((Bundle) obj) : String.valueOf(obj);
            if (strM10716s != null) {
                if (sbM1556G.length() != 1) {
                    sbM1556G.append(", ");
                }
                sbM1556G.append(strM10716s);
            }
        }
        sbM1556G.append("]");
        return sbM1556G.toString();
    }

    /* JADX INFO: renamed from: x */
    public final String m10720x(String str) {
        if (str == null) {
            return null;
        }
        return !m10722z() ? str : m10715v(str, C4708w5.f24554b, C4708w5.f24553a, f24281d);
    }

    /* JADX INFO: renamed from: y */
    public final String m10721y(String str) {
        if (str == null) {
            return null;
        }
        if (!m10722z()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m10715v(str, C4741z5.f24623b, C4741z5.f24622a, f24282e);
        }
        return "experiment_id(" + str + ")";
    }

    /* JADX INFO: renamed from: z */
    public final boolean m10722z() {
        return this.f24476a.m10839v() && this.f24476a.mo10684l().m10750x(3);
    }
}
