package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Binder;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rs0 implements nt0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f19055a = Pattern.compile("Received error HTTP response code: (.*)");

    /* JADX INFO: renamed from: b */
    public final sr0 f19056b;

    /* JADX INFO: renamed from: c */
    public final lv1 f19057c;

    /* JADX INFO: renamed from: d */
    public final ii1 f19058d;

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorService f19059e;

    /* JADX INFO: renamed from: f */
    public final tv0 f19060f;

    public rs0(ii1 ii1Var, sr0 sr0Var, lv1 lv1Var, ScheduledExecutorService scheduledExecutorService, tv0 tv0Var) {
        this.f19058d = ii1Var;
        this.f19056b = sr0Var;
        this.f19057c = lv1Var;
        this.f19059e = scheduledExecutorService;
        this.f19060f = tv0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.nt0
    /* JADX INFO: renamed from: a */
    public final kv1<di1> mo7730a(final C3437qi c3437qi) {
        final sr0 sr0Var = this.f19056b;
        Objects.requireNonNull(sr0Var);
        String str = c3437qi.f18298i;
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        kv1 gv1Var = C2267h1.m4745d(str) ? new gv1(new ot0(1)) : cw0.m6247q(sr0Var.f19684a.mo6691u0(new Callable(sr0Var, c3437qi) { // from class: c.n.b.d.j.a.pr0

            /* JADX INFO: renamed from: a */
            public final sr0 f18082a;

            /* JADX INFO: renamed from: b */
            public final C3437qi f18083b;

            {
                this.f18082a = sr0Var;
                this.f18083b = c3437qi;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                C3147io<InputStream> c3147io;
                sr0 sr0Var2 = this.f18082a;
                C3437qi c3437qi2 = this.f18083b;
                final ys0 ys0Var = sr0Var2.f19686c;
                synchronized (ys0Var.f12267b) {
                    if (ys0Var.f12268c) {
                        c3147io = ys0Var.f12266a;
                    } else {
                        ys0Var.f12268c = true;
                        ys0Var.f12270e = c3437qi2;
                        ys0Var.f12271f.m5578o();
                        ys0Var.f12266a.f15328f.mo6230f(new Runnable(ys0Var) { // from class: c.n.b.d.j.a.xs0

                            /* JADX INFO: renamed from: f */
                            public final ys0 f21669f;

                            {
                                this.f21669f = ys0Var;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f21669f.m5851a();
                            }
                        }, C2962do.f13335f);
                        c3147io = ys0Var.f12266a;
                    }
                }
                return c3147io.get(((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14377j3)).intValue(), TimeUnit.SECONDS);
            }
        }), ExecutionException.class, qr0.f18420a, sr0Var.f19685b);
        final int callingUid = Binder.getCallingUid();
        kv1<di1> kv1VarM6249s = cw0.m6249s(cw0.m6247q(gv1Var, ot0.class, new qu1(sr0Var, c3437qi, callingUid) { // from class: c.n.b.d.j.a.rr0

            /* JADX INFO: renamed from: a */
            public final sr0 f19048a;

            /* JADX INFO: renamed from: b */
            public final C3437qi f19049b;

            /* JADX INFO: renamed from: c */
            public final int f19050c;

            {
                this.f19048a = sr0Var;
                this.f19049b = c3437qi;
                this.f19050c = callingUid;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                sr0 sr0Var2 = this.f19048a;
                return sr0Var2.f19687d.m8545a().m8159F6(this.f19049b, this.f19050c);
            }
        }, sr0Var.f19685b), new qu1(this) { // from class: c.n.b.d.j.a.os0

            /* JADX INFO: renamed from: a */
            public final rs0 f17729a;

            {
                this.f17729a = this;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                return cw0.m6231a(new di1(new zh1(this.f17729a.f19058d), bi1.m6015a(new InputStreamReader((InputStream) obj))));
            }
        }, this.f19057c);
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14370i3;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            kv1VarM6249s = cw0.m6247q(cw0.m6248r(kv1VarM6249s, ((Integer) c2862b.f12496d.m6596a(C3052g3.f14377j3)).intValue(), TimeUnit.SECONDS, this.f19059e), TimeoutException.class, ps0.f18086a, C2962do.f13335f);
        }
        ((du1) kv1VarM6249s).mo6230f(new ev1(kv1VarM6249s, new qs0(this)), C2962do.f13335f);
        return kv1VarM6249s;
    }
}
