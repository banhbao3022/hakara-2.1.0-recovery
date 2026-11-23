package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: renamed from: c.n.b.d.j.a.wi */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC3660wi implements Callable<C3623vi> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f21130a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3734yi f21131b;

    public CallableC3660wi(C3734yi c3734yi, Context context) {
        this.f21131b = c3734yi;
        this.f21130a = context;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    @Override // java.util.concurrent.Callable
    public final C3623vi call() throws Exception {
        C3623vi c3623viM8502a;
        C3697xi c3697xi = this.f21131b.f21888a.get(this.f21130a);
        if (c3697xi != null) {
            if (C3090h4.f14739a.m6603d().longValue() + c3697xi.f21547a < C2330u.f10884a.f10896k.mo5623c()) {
                c3623viM8502a = new C3585ui(this.f21130a).m8502a();
            } else {
                c3623viM8502a = new C3585ui(this.f21130a, c3697xi.f21548b).m8502a();
            }
        } else {
            c3623viM8502a = new C3585ui(this.f21130a).m8502a();
        }
        C3734yi c3734yi = this.f21131b;
        c3734yi.f21888a.put(this.f21130a, new C3697xi(c3734yi, c3623viM8502a));
        return c3623viM8502a;
    }
}
