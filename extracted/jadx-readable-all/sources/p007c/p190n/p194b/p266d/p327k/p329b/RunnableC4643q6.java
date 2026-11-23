package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: c.n.b.d.k.b.q6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4643q6 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReference f24289f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f24290g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f24291h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C4500e6 f24292i;

    public RunnableC4643q6(C4500e6 c4500e6, AtomicReference atomicReference, String str, String str2) {
        this.f24292i = c4500e6;
        this.f24289f = atomicReference;
        this.f24290g = str;
        this.f24291h = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4677t7 c4677t7M10841x = this.f24292i.f24476a.m10841x();
        AtomicReference atomicReference = this.f24289f;
        String str = this.f24290g;
        String str2 = this.f24291h;
        c4677t7M10841x.mo10381b();
        c4677t7M10841x.m10479t();
        c4677t7M10841x.m10778z(new RunnableC4550i8(c4677t7M10841x, atomicReference, null, str, str2, c4677t7M10841x.m10775I(false)));
    }
}
