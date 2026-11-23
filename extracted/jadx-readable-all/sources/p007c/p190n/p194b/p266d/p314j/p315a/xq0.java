package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xq0 {

    /* JADX INFO: renamed from: a */
    public final lq0 f21656a;

    /* JADX INFO: renamed from: b */
    public final jm0 f21657b;

    /* JADX INFO: renamed from: c */
    public final Object f21658c = new Object();

    /* JADX INFO: renamed from: d */
    public final List<wq0> f21659d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f21660e;

    public xq0(lq0 lq0Var, jm0 jm0Var) {
        this.f21656a = lq0Var;
        this.f21657b = jm0Var;
    }

    /* JADX INFO: renamed from: a */
    public final JSONArray m8748a() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f21658c) {
            if (!this.f21660e) {
                lq0 lq0Var = this.f21656a;
                if (!lq0Var.f16443b) {
                    vq0 vq0Var = new vq0(this);
                    C3147io<Boolean> c3147io = lq0Var.f16446e;
                    c3147io.f15328f.mo6230f(new zp0(lq0Var, vq0Var), lq0Var.f16451j);
                    return jSONArray;
                }
                m8749b(lq0Var.m7603b());
            }
            Iterator<wq0> it = this.f21659d.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m8666a());
            }
            return jSONArray;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8749b(List<C3762z9> list) {
        im0 im0Var;
        C3694xf c3694xf;
        synchronized (this.f21658c) {
            if (this.f21660e) {
                return;
            }
            for (C3762z9 c3762z9 : list) {
                List<wq0> list2 = this.f21659d;
                String str = c3762z9.f22198f;
                jm0 jm0Var = this.f21657b;
                synchronized (jm0Var) {
                    im0Var = jm0Var.f15656a.get(str);
                }
                String string = (im0Var == null || (c3694xf = im0Var.f15300b) == null) ? "" : c3694xf.toString();
                list2.add(new wq0(str, string, c3762z9.f22199g ? 1 : 0, c3762z9.f22201i, c3762z9.f22200h));
            }
            this.f21660e = true;
        }
    }
}
