package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p307u.C2785e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class br1 {

    /* JADX INFO: renamed from: a */
    public final File f12800a;

    /* JADX INFO: renamed from: b */
    public final File f12801b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f12802c;

    /* JADX INFO: renamed from: d */
    public final zf2 f12803d;

    public br1(Context context, zf2 zf2Var) {
        this.f12802c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        C2622l.m5290N2(dir, false);
        this.f12800a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        C2622l.m5290N2(dir2, true);
        this.f12801b = dir2;
        this.f12803d = zf2Var;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x018d  */
    /* JADX INFO: renamed from: a */
    public final boolean m6082a(cg2 cg2Var, c72 c72Var) {
        boolean z;
        boolean zM7378a;
        String strM6810v = cg2Var.m6178v().m6810v();
        byte[] bArrM6948O = cg2Var.m6179x().m6948O();
        byte[] bArrM6948O2 = cg2Var.m6180y().m6948O();
        if (!TextUtils.isEmpty(strM6810v) && bArrM6948O2 != null && bArrM6948O2.length != 0) {
            C2622l.m5373g3(this.f12801b);
            this.f12801b.mkdirs();
            C2622l.m5422q2(strM6810v, this.f12801b).mkdirs();
            File fileM5228B0 = C2622l.m5228B0(strM6810v, "pcam.jar", this.f12801b);
            if ((bArrM6948O == null || bArrM6948O.length <= 0 || C2622l.m5325W1(fileM5228B0, bArrM6948O)) && C2622l.m5325W1(C2622l.m5228B0(strM6810v, "pcbc", this.f12801b), bArrM6948O2)) {
                File fileM5228B1 = C2622l.m5228B0(cg2Var.m6178v().m6810v(), "pcam.jar", this.f12801b);
                if (fileM5228B1.exists() && c72Var != null) {
                    try {
                        zM7378a = c72Var.f12953a.m7378a(fileM5228B1);
                    } catch (GeneralSecurityException unused) {
                        zM7378a = false;
                    }
                    if (!zM7378a) {
                        return false;
                    }
                }
                String strM6810v2 = cg2Var.m6178v().m6810v();
                if (TextUtils.isEmpty(strM6810v2)) {
                    z = false;
                } else {
                    File fileM5228B2 = C2622l.m5228B0(strM6810v2, "pcam.jar", this.f12801b);
                    File fileM5228B3 = C2622l.m5228B0(strM6810v2, "pcbc", this.f12801b);
                    File fileM5228B4 = C2622l.m5228B0(strM6810v2, "pcam.jar", m6084c());
                    File fileM5228B5 = C2622l.m5228B0(strM6810v2, "pcbc", m6084c());
                    if ((!fileM5228B2.exists() || fileM5228B2.renameTo(fileM5228B4)) && fileM5228B3.exists() && fileM5228B3.renameTo(fileM5228B5)) {
                        eg2 eg2VarM6801D = fg2.m6801D();
                        String strM6810v3 = cg2Var.m6178v().m6810v();
                        if (eg2VarM6801D.f13191h) {
                            eg2VarM6801D.m6298m();
                            eg2VarM6801D.f13191h = false;
                        }
                        fg2.m6804G((fg2) eg2VarM6801D.f13190g, strM6810v3);
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
                        fg2 fg2VarM6300o = eg2VarM6801D.m6300o();
                        fg2 fg2VarM6083b = m6083b(1);
                        SharedPreferences.Editor editorEdit = this.f12802c.edit();
                        if (fg2VarM6083b != null && !fg2VarM6300o.m6810v().equals(fg2VarM6083b.m6810v())) {
                            editorEdit.putString(m6085d(), C2785e.m5626a(fg2VarM6083b.mo7573b().m6948O()));
                        }
                        editorEdit.putString(m6086e(), C2785e.m5626a(fg2VarM6300o.mo7573b().m6948O()));
                        if (editorEdit.commit()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
                HashSet hashSet = new HashSet();
                fg2 fg2VarM6083b2 = m6083b(1);
                if (fg2VarM6083b2 != null) {
                    hashSet.add(fg2VarM6083b2.m6810v());
                }
                fg2 fg2VarM6083b3 = m6083b(2);
                if (fg2VarM6083b3 != null) {
                    hashSet.add(fg2VarM6083b3.m6810v());
                }
                for (File file : m6084c().listFiles()) {
                    String name = file.getName();
                    if (!hashSet.contains(name)) {
                        C2622l.m5373g3(C2622l.m5422q2(name, m6084c()));
                    }
                }
                return z;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final fg2 m6083b(int i) {
        String string = i == 1 ? this.f12802c.getString(m6086e(), null) : this.f12802c.getString(m6085d(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] bArrM5627b = C2785e.m5627b(string);
                g72 g72Var = g72.f14513f;
                fg2 fg2VarM6799B = fg2.m6799B(g72.m6939G(bArrM5627b, 0, bArrM5627b.length));
                String strM6810v = fg2VarM6799B.m6810v();
                File fileM5228B0 = C2622l.m5228B0(strM6810v, "pcam.jar", m6084c());
                if (!fileM5228B0.exists()) {
                    fileM5228B0 = C2622l.m5228B0(strM6810v, "pcam", m6084c());
                }
                File fileM5228B1 = C2622l.m5228B0(strM6810v, "pcbc", m6084c());
                if (fileM5228B0.exists() && fileM5228B1.exists()) {
                    return fg2VarM6799B;
                }
            } catch (r82 unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final File m6084c() {
        File file = new File(this.f12800a, Integer.toString(this.f12803d.f22263m));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* JADX INFO: renamed from: d */
    public final String m6085d() {
        return outline.m1585g(17, "FBAMTD", this.f12803d.f22263m);
    }

    /* JADX INFO: renamed from: e */
    public final String m6086e() {
        return outline.m1585g(17, "LATMTD", this.f12803d.f22263m);
    }
}
