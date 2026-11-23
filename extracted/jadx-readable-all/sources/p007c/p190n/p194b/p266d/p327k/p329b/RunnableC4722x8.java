package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.ArrayList;

/* JADX INFO: renamed from: c.n.b.d.k.b.x8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4722x8 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4611n9 f24586f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Runnable f24587g;

    public RunnableC4722x8(C4611n9 c4611n9, Runnable runnable) {
        this.f24586f = c4611n9;
        this.f24587g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24586f.m10670R();
        C4611n9 c4611n9 = this.f24586f;
        Runnable runnable = this.f24587g;
        c4611n9.m10673U();
        if (c4611n9.f24205o == null) {
            c4611n9.f24205o = new ArrayList();
        }
        c4611n9.f24205o.add(runnable);
        this.f24586f.m10669Q();
    }
}
