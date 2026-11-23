package p007c.p190n.p194b.p266d.p267a.p273d0.p274a;

import android.os.Binder;
import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C2962do;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.C3437qi;
import p007c.p190n.p194b.p266d.p314j.p315a.ct0;
import p007c.p190n.p194b.p266d.p314j.p315a.cw0;
import p007c.p190n.p194b.p266d.p314j.p315a.gv1;
import p007c.p190n.p194b.p266d.p314j.p315a.kv1;
import p007c.p190n.p194b.p266d.p314j.p315a.ms0;
import p007c.p190n.p194b.p266d.p314j.p315a.ot0;
import p007c.p190n.p194b.p266d.p314j.p315a.qu1;
import p007c.p190n.p194b.p266d.p314j.p315a.zu1;

/* JADX INFO: renamed from: c.n.b.d.a.d0.a.b0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2144b0 implements qu1<C3437qi, C2145c> {

    /* JADX INFO: renamed from: a */
    public final Executor f10490a;

    /* JADX INFO: renamed from: b */
    public final ms0 f10491b;

    public C2144b0(Executor executor, ms0 ms0Var) {
        this.f10490a = executor;
        this.f10491b = ms0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
    /* JADX INFO: renamed from: a */
    public final kv1<C2145c> mo4612a(C3437qi c3437qi) throws Exception {
        kv1 gv1Var;
        final C3437qi c3437qi2 = c3437qi;
        final ms0 ms0Var = this.f10491b;
        Objects.requireNonNull(ms0Var);
        String str = c3437qi2.f18298i;
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        if (C2267h1.m4745d(str)) {
            gv1Var = new gv1(new ot0(1));
        } else {
            final ct0 ct0Var = ms0Var.f16841c;
            synchronized (ct0Var.f12267b) {
                if (ct0Var.f12268c) {
                    gv1Var = ct0Var.f12266a;
                } else {
                    ct0Var.f12268c = true;
                    ct0Var.f12270e = c3437qi2;
                    ct0Var.f12271f.m5578o();
                    ct0Var.f12266a.f15328f.mo6230f(new Runnable(ct0Var) { // from class: c.n.b.d.j.a.bt0

                        /* JADX INFO: renamed from: f */
                        public final ct0 f12859f;

                        {
                            this.f12859f = ct0Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f12859f.m5851a();
                        }
                    }, C2962do.f13335f);
                    gv1Var = ct0Var.f12266a;
                }
            }
        }
        final int callingUid = Binder.getCallingUid();
        return cw0.m6249s(cw0.m6247q((zu1) cw0.m6248r(zu1.m8908s(gv1Var), ((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14377j3)).intValue(), TimeUnit.SECONDS, ms0Var.f16839a), Throwable.class, new qu1(ms0Var, c3437qi2, callingUid) { // from class: c.n.b.d.j.a.ls0

            /* JADX INFO: renamed from: a */
            public final ms0 f16485a;

            /* JADX INFO: renamed from: b */
            public final C3437qi f16486b;

            /* JADX INFO: renamed from: c */
            public final int f16487c;

            {
                this.f16485a = ms0Var;
                this.f16486b = c3437qi2;
                this.f16487c = callingUid;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                ms0 ms0Var2 = this.f16485a;
                return ms0Var2.f16842d.m8545a().m8162I6(this.f16486b, this.f16487c);
            }
        }, ms0Var.f16840b), new qu1(c3437qi2) { // from class: c.n.b.d.a.d0.a.a0

            /* JADX INFO: renamed from: a */
            public final C3437qi f10487a;

            {
                this.f10487a = c3437qi2;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                C3437qi c3437qi3 = this.f10487a;
                C2145c c2145c = new C2145c(new JsonReader(new InputStreamReader((InputStream) obj)));
                try {
                    c2145c.f10493b = C2330u.f10884a.f10889d.m4768D(c3437qi3.f18295f).toString();
                } catch (JSONException unused) {
                    c2145c.f10493b = "{}";
                }
                return cw0.m6231a(c2145c);
            }
        }, this.f10490a);
    }
}
