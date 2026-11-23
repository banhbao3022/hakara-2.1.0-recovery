package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Bundle;

/* JADX INFO: renamed from: c.n.b.d.k.b.e9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4503e9 implements Runnable {

    /* JADX INFO: renamed from: f */
    public long f23872f;

    /* JADX INFO: renamed from: g */
    public long f23873g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4455a9 f23874h;

    public RunnableC4503e9(C4455a9 c4455a9, long j2, long j3) {
        this.f23874h = c4455a9;
        this.f23872f = j2;
        this.f23873g = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23874h.f23719b.mo10686n().m10758v(new Runnable(this) { // from class: c.n.b.d.k.b.d9

            /* JADX INFO: renamed from: f */
            public final RunnableC4503e9 f23837f;

            {
                this.f23837f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                RunnableC4503e9 runnableC4503e9 = this.f23837f;
                C4455a9 c4455a9 = runnableC4503e9.f23874h;
                long j2 = runnableC4503e9.f23872f;
                long j3 = runnableC4503e9.f23873g;
                c4455a9.f23719b.mo10381b();
                c4455a9.f23719b.mo10684l().f24425m.m10811a("Application going to the background");
                boolean z = true;
                if (c4455a9.f23719b.f24476a.f24534h.m10417k(C4647r.f24380v0)) {
                    c4455a9.f23719b.m10818g().f23909x.m10593a(true);
                }
                Bundle bundle = new Bundle();
                if (!c4455a9.f23719b.f24476a.f24534h.m10428z().booleanValue()) {
                    c4455a9.f23719b.f24634e.f23951c.m10597c();
                    if (c4455a9.f23719b.f24476a.f24534h.m10417k(C4647r.f24362m0)) {
                        C4527g9 c4527g9 = c4455a9.f23719b.f24634e;
                        long j4 = j3 - c4527g9.f23950b;
                        c4527g9.f23950b = j3;
                        bundle.putLong("_et", j4);
                        C4573k7.m10622A(c4455a9.f23719b.m10386q().m10628w(true), bundle, true);
                    } else {
                        z = false;
                    }
                    c4455a9.f23719b.m10914w(false, z, j3);
                }
                c4455a9.f23719b.m10383i().m10514E("auto", "_ab", j2, bundle);
            }
        });
    }
}
