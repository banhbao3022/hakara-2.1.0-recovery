package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcelable;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class oj1 implements nj1 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap<wj1, mj1> f17659a;

    /* JADX INFO: renamed from: b */
    public final sj1 f17660b;

    /* JADX INFO: renamed from: c */
    public final qj1 f17661c = new qj1();

    public oj1(sj1 sj1Var) {
        this.f17659a = new ConcurrentHashMap<>(sj1Var.f19585k);
        this.f17660b = sj1Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m8035a(wj1 wj1Var, vj1<?> vj1Var) {
        boolean z;
        mj1 mj1Var = this.f17659a.get(wj1Var);
        vj1Var.f20808d = C2330u.f10884a.f10896k.mo5623c();
        if (mj1Var == null) {
            sj1 sj1Var = this.f17660b;
            mj1Var = new mj1(sj1Var.f19585k, sj1Var.f19586l * CloseCodes.NORMAL_CLOSURE);
            int size = this.f17659a.size();
            sj1 sj1Var2 = this.f17660b;
            if (size == sj1Var2.f19584j) {
                int i = sj1Var2.f19592r;
                int i2 = i - 1;
                wj1 key = null;
                if (i == 0) {
                    throw null;
                }
                long j2 = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry<wj1, mj1> entry : this.f17659a.entrySet()) {
                        if (entry.getValue().f16778d.f16377a < j2) {
                            j2 = entry.getValue().f16778d.f16377a;
                            key = entry.getKey();
                        }
                    }
                    if (key != null) {
                        this.f17659a.remove(key);
                    }
                } else if (i2 == 1) {
                    for (Map.Entry<wj1, mj1> entry2 : this.f17659a.entrySet()) {
                        if (entry2.getValue().f16778d.f16379c < j2) {
                            j2 = entry2.getValue().f16778d.f16379c;
                            key = entry2.getKey();
                        }
                    }
                    if (key != null) {
                        this.f17659a.remove(key);
                    }
                } else if (i2 == 2) {
                    int i3 = Integer.MAX_VALUE;
                    for (Map.Entry<wj1, mj1> entry3 : this.f17659a.entrySet()) {
                        if (entry3.getValue().f16778d.f16380d < i3) {
                            i3 = entry3.getValue().f16778d.f16380d;
                            key = entry3.getKey();
                        }
                    }
                    if (key != null) {
                        this.f17659a.remove(key);
                    }
                }
                qj1 qj1Var = this.f17661c;
                qj1Var.f18316c++;
                qj1Var.f18314a.f17997g = true;
            }
            this.f17659a.put(wj1Var, mj1Var);
            qj1 qj1Var2 = this.f17661c;
            qj1Var2.f18315b++;
            qj1Var2.f18314a.f17996f = true;
        }
        lk1 lk1Var = mj1Var.f16778d;
        Objects.requireNonNull(lk1Var);
        lk1Var.f16379c = C2330u.f10884a.f10896k.mo5623c();
        lk1Var.f16380d++;
        mj1Var.m7717c();
        if (mj1Var.f16775a.size() == mj1Var.f16776b) {
            z = false;
        } else {
            mj1Var.f16775a.add(vj1Var);
            z = true;
        }
        qj1 qj1Var3 = this.f17661c;
        qj1Var3.f18319f++;
        pj1 pj1VarM8120a = qj1Var3.f18314a.m8120a();
        pj1 pj1Var = qj1Var3.f18314a;
        pj1Var.f17996f = false;
        pj1Var.f17997g = false;
        lk1 lk1Var2 = mj1Var.f16778d;
        kk1 kk1VarM7511a = lk1Var2.f16378b.m7511a();
        kk1 kk1Var = lk1Var2.f16378b;
        kk1Var.f15970f = false;
        kk1Var.f15971g = 0;
        ls2 ls2VarM8452v = ts2.m8452v();
        js2 js2VarM7546v = ks2.m7546v();
        js2VarM7546v.m7388r(ns2.IN_MEMORY);
        rs2 rs2VarM8364v = ss2.m8364v();
        boolean z2 = pj1VarM8120a.f17996f;
        if (rs2VarM8364v.f13191h) {
            rs2VarM8364v.m6298m();
            rs2VarM8364v.f13191h = false;
        }
        ss2.m8366y((ss2) rs2VarM8364v.f13190g, z2);
        boolean z3 = pj1VarM8120a.f17997g;
        if (rs2VarM8364v.f13191h) {
            rs2VarM8364v.m6298m();
            rs2VarM8364v.f13191h = false;
        }
        ss2.m8367z((ss2) rs2VarM8364v.f13190g, z3);
        int i4 = kk1VarM7511a.f15971g;
        if (rs2VarM8364v.f13191h) {
            rs2VarM8364v.m6298m();
            rs2VarM8364v.f13191h = false;
        }
        ss2.m8363A((ss2) rs2VarM8364v.f13190g, i4);
        if (js2VarM7546v.f13191h) {
            js2VarM7546v.m6298m();
            js2VarM7546v.f13191h = false;
        }
        ks2.m7545A((ks2) js2VarM7546v.f13190g, rs2VarM8364v.m6300o());
        ls2VarM8452v.m7612r(js2VarM7546v);
        vj1Var.f20805a.f18181f.m7108A0(new w90(ls2VarM8452v.m6300o()));
        m8036b();
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final void m8036b() {
        Parcelable.Creator<sj1> creator = sj1.CREATOR;
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14272T3)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f17660b.f19583i);
            sb.append(" PoolCollection");
            qj1 qj1Var = this.f17661c;
            Objects.requireNonNull(qj1Var);
            sb.append("\n\tPool does not exist: " + qj1Var.f18317d + "\n\tNew pools created: " + qj1Var.f18315b + "\n\tPools removed: " + qj1Var.f18316c + "\n\tEntries added: " + qj1Var.f18319f + "\n\tNo entries retrieved: " + qj1Var.f18318e + "\n");
            int i = 0;
            for (Map.Entry<wj1, mj1> entry : this.f17659a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(entry.getKey().hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < entry.getValue().m7716b(); i2++) {
                    sb.append("[O]");
                }
                for (int iM7716b = entry.getValue().m7716b(); iM7716b < this.f17660b.f19585k; iM7716b++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                lk1 lk1Var = entry.getValue().f16778d;
                Objects.requireNonNull(lk1Var);
                sb.append("Created: " + lk1Var.f16377a + " Last accessed: " + lk1Var.f16379c + " Accesses: " + lk1Var.f16380d + "\nEntries retrieved: Valid: " + lk1Var.f16381e + " Stale: " + lk1Var.f16382f);
                sb.append("\n");
            }
            while (i < this.f17660b.f19584j) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            C2622l.m5318U2(sb.toString());
        }
    }
}
