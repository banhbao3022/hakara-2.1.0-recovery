package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: c.n.b.d.k.b.t6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4676t6 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReference f24449f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f24450g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f24451h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f24452i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C4500e6 f24453j;

    public RunnableC4676t6(C4500e6 c4500e6, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.f24453j = c4500e6;
        this.f24449f = atomicReference;
        this.f24450g = str;
        this.f24451h = str2;
        this.f24452i = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4677t7 c4677t7M10841x = this.f24453j.f24476a.m10841x();
        AtomicReference atomicReference = this.f24449f;
        String str = this.f24450g;
        String str2 = this.f24451h;
        boolean z = this.f24452i;
        c4677t7M10841x.mo10381b();
        c4677t7M10841x.m10479t();
        c4677t7M10841x.m10778z(new RunnableC4574k8(c4677t7M10841x, atomicReference, null, str, str2, z, c4677t7M10841x.m10775I(false)));
    }
}
