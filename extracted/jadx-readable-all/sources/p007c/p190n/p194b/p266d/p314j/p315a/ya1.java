package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ya1 implements ia1<za1> {

    /* JADX INFO: renamed from: a */
    public final Context f21828a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f21829b;

    /* JADX INFO: renamed from: c */
    public final Executor f21830c;

    /* JADX INFO: renamed from: d */
    public final int f21831d;

    /* JADX INFO: renamed from: e */
    public final C3701xm f21832e;

    public ya1(C3701xm c3701xm, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, byte[] bArr) {
        this.f21832e = c3701xm;
        this.f21828a = context;
        this.f21829b = scheduledExecutorService;
        this.f21830c = executor;
        this.f21831d = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<za1> zza() {
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14150A0;
        C2862b c2862b = C2862b.f12493a;
        if (!((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            return new gv1(new Exception("Did not ad Ad ID into query param."));
        }
        C3701xm c3701xm = this.f21832e;
        Context context = this.f21828a;
        Objects.requireNonNull(c3701xm);
        C3147io c3147io = new C3147io();
        C3331nn c3331nn = gx2.f14692a.f14693b;
        if (C3331nn.m7889g(context)) {
            C2962do.f13330a.execute(new RunnableC3664wm(context, c3147io));
        }
        return cw0.m6246p((zu1) cw0.m6248r(cw0.m6250t(zu1.m8908s(c3147io), wa1.f21028a, this.f21830c), ((Long) c2862b.f12496d.m6596a(C3052g3.f14157B0)).longValue(), TimeUnit.MILLISECONDS, this.f21829b), Throwable.class, new cs1(this) { // from class: c.n.b.d.j.a.xa1

            /* JADX INFO: renamed from: a */
            public final ya1 f21475a;

            {
                this.f21475a = this;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
            public final Object apply(Object obj) {
                ya1 ya1Var = this.f21475a;
                Objects.requireNonNull(ya1Var);
                C3331nn c3331nn2 = gx2.f14692a.f14693b;
                ContentResolver contentResolver = ya1Var.f21828a.getContentResolver();
                return new za1(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"));
            }
        }, this.f21830c);
    }
}
