package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2312c;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vk0 {

    /* JADX INFO: renamed from: b */
    public final C2312c f20812b;

    /* JADX INFO: renamed from: c */
    public final Context f20813c;

    /* JADX INFO: renamed from: d */
    public final po0 f20814d;

    /* JADX INFO: renamed from: e */
    public final im1 f20815e;

    /* JADX INFO: renamed from: f */
    public final Executor f20816f;

    /* JADX INFO: renamed from: g */
    public final rd2 f20817g;

    /* JADX INFO: renamed from: h */
    public final C3702xn f20818h;

    /* JADX INFO: renamed from: j */
    public final pw0 f20820j;

    /* JADX INFO: renamed from: k */
    public final bn1 f20821k;

    /* JADX INFO: renamed from: l */
    public kv1<InterfaceC3410ps> f20822l;

    /* JADX INFO: renamed from: a */
    public final qk0 f20811a = new qk0();

    /* JADX INFO: renamed from: i */
    public final C3021f9 f20819i = new C3021f9();

    public vk0(tk0 tk0Var) {
        this.f20813c = tk0Var.f19862c;
        this.f20816f = tk0Var.f19866g;
        this.f20817g = tk0Var.f19867h;
        this.f20818h = tk0Var.f19868i;
        this.f20812b = tk0Var.f19860a;
        this.f20820j = tk0Var.f19865f;
        this.f20821k = tk0Var.f19869j;
        this.f20814d = tk0Var.f19863d;
        this.f20815e = tk0Var.f19864e;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized kv1<JSONObject> m8561a(final String str, final JSONObject jSONObject) {
        kv1<InterfaceC3410ps> kv1Var = this.f20822l;
        if (kv1Var == null) {
            return cw0.m6231a(null);
        }
        return cw0.m6249s(kv1Var, new qu1(this, str, jSONObject) { // from class: c.n.b.d.j.a.kk0

            /* JADX INFO: renamed from: a */
            public final vk0 f15967a;

            /* JADX INFO: renamed from: b */
            public final String f15968b;

            /* JADX INFO: renamed from: c */
            public final JSONObject f15969c;

            {
                this.f15967a = this;
                this.f15968b = str;
                this.f15969c = jSONObject;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                vk0 vk0Var = this.f15967a;
                String str2 = this.f15968b;
                JSONObject jSONObject2 = this.f15969c;
                InterfaceC3410ps interfaceC3410ps = (InterfaceC3410ps) obj;
                C3021f9 c3021f9 = vk0Var.f20819i;
                Objects.requireNonNull(c3021f9);
                C3147io c3147io = new C3147io();
                C2267h1 c2267h1 = C2330u.f10884a.f10889d;
                String string = UUID.randomUUID().toString();
                c3021f9.m6782b(string, new C2947d9(c3147io));
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", string);
                    jSONObject3.put("args", jSONObject2);
                    interfaceC3410ps.mo6507u0(str2, jSONObject3);
                } catch (Exception e) {
                    c3147io.m7287b(e);
                }
                return c3147io;
            }
        }, this.f20816f);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m8562b(String str, InterfaceC3464r8<Object> interfaceC3464r8) {
        kv1<InterfaceC3410ps> kv1Var = this.f20822l;
        if (kv1Var == null) {
            return;
        }
        mk0 mk0Var = new mk0(str, interfaceC3464r8);
        kv1Var.mo6230f(new ev1(kv1Var, mk0Var), this.f20816f);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m8563c(String str, InterfaceC3464r8<Object> interfaceC3464r8) {
        kv1<InterfaceC3410ps> kv1Var = this.f20822l;
        if (kv1Var == null) {
            return;
        }
        nk0 nk0Var = new nk0(str, interfaceC3464r8);
        kv1Var.mo6230f(new ev1(kv1Var, nk0Var), this.f20816f);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m8564d(String str, Map<String, ?> map) {
        kv1<InterfaceC3410ps> kv1Var = this.f20822l;
        if (kv1Var == null) {
            return;
        }
        ok0 ok0Var = new ok0(map);
        kv1Var.mo6230f(new ev1(kv1Var, ok0Var), this.f20816f);
    }
}
