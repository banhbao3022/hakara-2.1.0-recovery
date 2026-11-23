package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.k.b.l5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4583l5 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4625p f24113f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4480ca f24114g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ BinderC4463b5 f24115h;

    public RunnableC4583l5(BinderC4463b5 binderC4463b5, C4625p c4625p, C4480ca c4480ca) {
        this.f24115h = binderC4463b5;
        this.f24113f = c4625p;
        this.f24114g = c4480ca;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C4613o c4613o;
        BinderC4463b5 binderC4463b5 = this.f24115h;
        C4625p c4625p = this.f24113f;
        Objects.requireNonNull(binderC4463b5);
        boolean z = false;
        if ("_cmp".equals(c4625p.f24249f) && (c4613o = c4625p.f24250g) != null && c4613o.f24221f.size() != 0) {
            String string = c4625p.f24250g.f24221f.getString("_cis");
            if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                z = true;
            }
        }
        if (z) {
            binderC4463b5.f23726f.mo10684l().f24424l.m10812b("Event has been filtered ", c4625p.toString());
            c4625p = new C4625p("_cmpx", c4625p.f24250g, c4625p.f24251h, c4625p.f24252i);
        }
        this.f24115h.f23726f.m10670R();
        this.f24115h.f23726f.m10679g(c4625p, this.f24114g);
    }
}
