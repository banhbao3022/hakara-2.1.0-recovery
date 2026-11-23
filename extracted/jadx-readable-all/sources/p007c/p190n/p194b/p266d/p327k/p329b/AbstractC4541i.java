package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Handler;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p314j.p325k.HandlerC4260mc;

/* JADX INFO: renamed from: c.n.b.d.k.b.i */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4541i {

    /* JADX INFO: renamed from: a */
    public static volatile Handler f23985a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4697v5 f23986b;

    /* JADX INFO: renamed from: c */
    public final Runnable f23987c;

    /* JADX INFO: renamed from: d */
    public volatile long f23988d;

    public AbstractC4541i(InterfaceC4697v5 interfaceC4697v5) {
        Objects.requireNonNull(interfaceC4697v5, "null reference");
        this.f23986b = interfaceC4697v5;
        this.f23987c = new RunnableC4565k(this, interfaceC4697v5);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo10482a();

    /* JADX INFO: renamed from: b */
    public final void m10596b(long j2) {
        m10597c();
        if (j2 >= 0) {
            this.f23988d = this.f23986b.mo10682j().mo5623c();
            if (m10598d().postDelayed(this.f23987c, j2)) {
                return;
            }
            this.f23986b.mo10684l().f24418f.m10812b("Failed to schedule delayed post. time", Long.valueOf(j2));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10597c() {
        this.f23988d = 0L;
        m10598d().removeCallbacks(this.f23987c);
    }

    /* JADX INFO: renamed from: d */
    public final Handler m10598d() {
        Handler handler;
        if (f23985a != null) {
            return f23985a;
        }
        synchronized (AbstractC4541i.class) {
            if (f23985a == null) {
                f23985a = new HandlerC4260mc(this.f23986b.mo10685m().getMainLooper());
            }
            handler = f23985a;
        }
        return handler;
    }
}
