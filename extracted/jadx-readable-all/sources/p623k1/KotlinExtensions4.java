package p623k1;

import p007c.p451o.p452a.C5729a;
import p477d1.Result;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CancellableContinuation;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: k1.p, reason: use source file name */
/* JADX INFO: compiled from: KotlinExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class KotlinExtensions4<T> implements Callback2<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CancellableContinuation f33177a;

    public KotlinExtensions4(CancellableContinuation cancellableContinuation) {
        this.f33177a = cancellableContinuation;
    }

    @Override // p623k1.Callback2
    /* JADX INFO: renamed from: a */
    public void mo14297a(Call2<T> call2, Throwable th) {
        Intrinsics2.m13090f(call2, "call");
        Intrinsics2.m13090f(th, "t");
        CancellableContinuation cancellableContinuation = this.f33177a;
        Result.a aVar = Result.f29493f;
        cancellableContinuation.mo13056g(C5729a.m12456k(th));
    }

    @Override // p623k1.Callback2
    /* JADX INFO: renamed from: b */
    public void mo14298b(Call2<T> call2, Response4<T> response4) {
        Intrinsics2.m13090f(call2, "call");
        Intrinsics2.m13090f(response4, "response");
        CancellableContinuation cancellableContinuation = this.f33177a;
        Result.a aVar = Result.f29493f;
        cancellableContinuation.mo13056g(response4);
    }
}
