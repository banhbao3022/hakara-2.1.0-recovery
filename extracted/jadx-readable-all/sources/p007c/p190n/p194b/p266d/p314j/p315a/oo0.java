package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class oo0 {

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f17700a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ po0 f17701b;

    public oo0(po0 po0Var) {
        this.f17701b = po0Var;
    }

    /* JADX INFO: renamed from: a */
    public final oo0 m8046a(uh1 uh1Var) {
        this.f17700a.put("gqi", uh1Var.f20318b);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m8047b() {
        this.f17701b.f18044b.execute(new Runnable(this) { // from class: c.n.b.d.j.a.no0

            /* JADX INFO: renamed from: f */
            public final oo0 f17185f;

            {
                this.f17185f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                oo0 oo0Var = this.f17185f;
                oo0Var.f17701b.f18043a.m8663a(oo0Var.f17700a);
            }
        });
    }
}
