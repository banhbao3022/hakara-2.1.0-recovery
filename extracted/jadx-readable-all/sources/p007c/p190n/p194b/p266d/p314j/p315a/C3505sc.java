package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.UUID;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.sc */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3505sc implements InterfaceC3295mo<InterfaceC2987ec> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3690xb f19520a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f19521b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3147io f19522c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3617vc f19523d;

    public C3505sc(C3617vc c3617vc, C3690xb c3690xb, Object obj, C3147io c3147io) {
        this.f19523d = c3617vc;
        this.f19520a = c3690xb;
        this.f19521b = obj;
        this.f19522c = c3147io;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3295mo
    /* JADX INFO: renamed from: a */
    public final void mo5960a(InterfaceC2987ec interfaceC2987ec) {
        InterfaceC2987ec interfaceC2987ec2 = interfaceC2987ec;
        C3617vc c3617vc = this.f19523d;
        C3690xb c3690xb = this.f19520a;
        Object obj = this.f19521b;
        C3147io c3147io = this.f19522c;
        try {
            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
            String string = UUID.randomUUID().toString();
            C3427q8.f18227p.m6782b(string, new C3579uc(c3617vc, c3690xb, c3147io));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", c3617vc.f20732b.mo7491b((I) obj));
            interfaceC2987ec2.mo6507u0(c3617vc.f20734d, jSONObject);
        } catch (Exception e) {
            try {
                c3147io.m7287b(e);
                C2622l.m5438t3("Unable to invokeJavascript", e);
            } finally {
                c3690xb.m8731d();
            }
        }
    }
}
