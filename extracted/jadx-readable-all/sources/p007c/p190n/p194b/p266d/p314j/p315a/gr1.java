package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p307u.C2785e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gr1 {

    /* JADX INFO: renamed from: a */
    public static final Object f14650a = new Object();

    /* JADX INFO: renamed from: b */
    public final Context f14651b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f14652c;

    /* JADX INFO: renamed from: d */
    public final String f14653d;

    /* JADX INFO: renamed from: e */
    public final pq1 f14654e;

    /* JADX INFO: renamed from: f */
    public boolean f14655f;

    public gr1(Context context, zf2 zf2Var, pq1 pq1Var, boolean z) {
        this.f14655f = false;
        this.f14651b = context;
        this.f14653d = Integer.toString(zf2Var.f22263m);
        this.f14652c = context.getSharedPreferences("pcvmspf", 0);
        this.f14654e = pq1Var;
        this.f14655f = z;
    }

    /* JADX INFO: renamed from: f */
    public static String m7020f(cg2 cg2Var) {
        eg2 eg2VarM6801D = fg2.m6801D();
        String strM6810v = cg2Var.m6178v().m6810v();
        if (eg2VarM6801D.f13191h) {
            eg2VarM6801D.m6298m();
            eg2VarM6801D.f13191h = false;
        }
        fg2.m6804G((fg2) eg2VarM6801D.f13190g, strM6810v);
        String strM6811x = cg2Var.m6178v().m6811x();
        if (eg2VarM6801D.f13191h) {
            eg2VarM6801D.m6298m();
            eg2VarM6801D.f13191h = false;
        }
        fg2.m6805H((fg2) eg2VarM6801D.f13190g, strM6811x);
        long jM6813z = cg2Var.m6178v().m6813z();
        if (eg2VarM6801D.f13191h) {
            eg2VarM6801D.m6298m();
            eg2VarM6801D.f13191h = false;
        }
        fg2.m6807J((fg2) eg2VarM6801D.f13190g, jM6813z);
        long jM6809A = cg2Var.m6178v().m6809A();
        if (eg2VarM6801D.f13191h) {
            eg2VarM6801D.m6298m();
            eg2VarM6801D.f13191h = false;
        }
        fg2.m6808K((fg2) eg2VarM6801D.f13190g, jM6809A);
        long jM6812y = cg2Var.m6178v().m6812y();
        if (eg2VarM6801D.f13191h) {
            eg2VarM6801D.m6298m();
            eg2VarM6801D.f13191h = false;
        }
        fg2.m6806I((fg2) eg2VarM6801D.f13190g, jM6812y);
        return C2785e.m5626a(eg2VarM6801D.m6300o().mo7573b().m6948O());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7021a(cg2 cg2Var, c72 c72Var) {
        boolean zM7378a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f14650a) {
            fg2 fg2VarM7027h = m7027h(1);
            String strM6810v = cg2Var.m6178v().m6810v();
            if (fg2VarM7027h != null && fg2VarM7027h.m6810v().equals(strM6810v)) {
                m7026g(4014, jCurrentTimeMillis);
                return false;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            File fileM7023c = m7023c(strM6810v);
            if (fileM7023c.exists()) {
                String str = true != fileM7023c.isDirectory() ? "0" : "1";
                String str2 = true != fileM7023c.isFile() ? "0" : "1";
                StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length());
                sb.append("d:");
                sb.append(str);
                sb.append(",f:");
                sb.append(str2);
                String string = sb.toString();
                pq1 pq1Var = this.f14654e;
                if (pq1Var != null) {
                    pq1Var.mo4849a(4023, jCurrentTimeMillis2, string);
                }
                m7026g(4015, jCurrentTimeMillis2);
            } else if (!fileM7023c.mkdirs()) {
                String str3 = true != fileM7023c.canWrite() ? "0" : "1";
                String strConcat = str3.length() != 0 ? "cw:".concat(str3) : new String("cw:");
                pq1 pq1Var2 = this.f14654e;
                if (pq1Var2 != null) {
                    pq1Var2.mo4849a(4024, jCurrentTimeMillis2, strConcat);
                }
                m7026g(4015, jCurrentTimeMillis2);
                return false;
            }
            File fileM7023c2 = m7023c(strM6810v);
            File file = new File(fileM7023c2, "pcam.jar");
            File file2 = new File(fileM7023c2, "pcbc");
            if (!C2622l.m5325W1(file, cg2Var.m6179x().m6948O())) {
                m7026g(4016, jCurrentTimeMillis);
                return false;
            }
            if (!C2622l.m5325W1(file2, cg2Var.m6180y().m6948O())) {
                m7026g(4017, jCurrentTimeMillis);
                return false;
            }
            if (c72Var != null) {
                try {
                    zM7378a = c72Var.f12953a.m7378a(file);
                } catch (GeneralSecurityException unused) {
                    zM7378a = false;
                }
                if (!zM7378a) {
                    m7026g(4018, jCurrentTimeMillis);
                    C2622l.m5373g3(fileM7023c2);
                    return false;
                }
            }
            String strM7020f = m7020f(cg2Var);
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            String string2 = this.f14652c.getString(m7025e(), null);
            SharedPreferences.Editor editorEdit = this.f14652c.edit();
            editorEdit.putString(m7025e(), strM7020f);
            if (string2 != null) {
                editorEdit.putString(m7024d(), string2);
            }
            if (!editorEdit.commit()) {
                m7026g(4019, jCurrentTimeMillis3);
                return false;
            }
            HashSet hashSet = new HashSet();
            fg2 fg2VarM7027h2 = m7027h(1);
            if (fg2VarM7027h2 != null) {
                hashSet.add(fg2VarM7027h2.m6810v());
            }
            fg2 fg2VarM7027h3 = m7027h(2);
            if (fg2VarM7027h3 != null) {
                hashSet.add(fg2VarM7027h3.m6810v());
            }
            for (File file3 : new File(this.f14651b.getDir("pccache", 0), this.f14653d).listFiles()) {
                if (!hashSet.contains(file3.getName())) {
                    C2622l.m5373g3(file3);
                }
            }
            m7026g(5014, jCurrentTimeMillis);
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7022b(cg2 cg2Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f14650a) {
            if (!C2622l.m5325W1(new File(m7023c(cg2Var.m6178v().m6810v()), "pcbc"), cg2Var.m6180y().m6948O())) {
                m7026g(4020, jCurrentTimeMillis);
                return false;
            }
            String strM7020f = m7020f(cg2Var);
            SharedPreferences.Editor editorEdit = this.f14652c.edit();
            editorEdit.putString(m7025e(), strM7020f);
            boolean zCommit = editorEdit.commit();
            if (zCommit) {
                m7026g(5015, jCurrentTimeMillis);
            } else {
                m7026g(4021, jCurrentTimeMillis);
            }
            return zCommit;
        }
    }

    /* JADX INFO: renamed from: c */
    public final File m7023c(String str) {
        return new File(new File(this.f14651b.getDir("pccache", 0), this.f14653d), str);
    }

    /* JADX INFO: renamed from: d */
    public final String m7024d() {
        String strValueOf = String.valueOf(this.f14653d);
        return strValueOf.length() != 0 ? "FBAMTD".concat(strValueOf) : new String("FBAMTD");
    }

    /* JADX INFO: renamed from: e */
    public final String m7025e() {
        String strValueOf = String.valueOf(this.f14653d);
        return strValueOf.length() != 0 ? "LATMTD".concat(strValueOf) : new String("LATMTD");
    }

    /* JADX INFO: renamed from: g */
    public final void m7026g(int i, long j2) {
        pq1 pq1Var = this.f14654e;
        if (pq1Var != null) {
            pq1Var.mo4850b(i, j2);
        }
    }

    /* JADX INFO: renamed from: h */
    public final fg2 m7027h(int i) {
        String string = i == 1 ? this.f14652c.getString(m7025e(), null) : this.f14652c.getString(m7024d(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrM5627b = C2785e.m5627b(string);
            g72 g72Var = g72.f14513f;
            return fg2.m6800C(g72.m6939G(bArrM5627b, 0, bArrM5627b.length), this.f14655f ? s72.m8347a() : s72.m8348b());
        } catch (r82 unused) {
            return null;
        } catch (NullPointerException unused2) {
            m7026g(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            m7026g(2032, jCurrentTimeMillis);
            return null;
        }
    }
}
