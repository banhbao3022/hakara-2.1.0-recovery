package p623k1;

import java.lang.reflect.Method;
import java.util.Objects;
import p007c.p451o.p452a.C5729a;
import p477d1.KotlinNullPointerException;
import p477d1.Result;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CancellableContinuation;
import p509g1.Request3;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: k1.n, reason: use source file name */
/* JADX INFO: compiled from: KotlinExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class KotlinExtensions2<T> implements Callback2<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CancellableContinuation f33175a;

    public KotlinExtensions2(CancellableContinuation cancellableContinuation) {
        this.f33175a = cancellableContinuation;
    }

    @Override // p623k1.Callback2
    /* JADX INFO: renamed from: a */
    public void mo14297a(Call2<T> call2, Throwable th) {
        Intrinsics2.m13090f(call2, "call");
        Intrinsics2.m13090f(th, "t");
        CancellableContinuation cancellableContinuation = this.f33175a;
        Result.a aVar = Result.f29493f;
        cancellableContinuation.mo13056g(C5729a.m12456k(th));
    }

    @Override // p623k1.Callback2
    /* JADX INFO: renamed from: b */
    public void mo14298b(Call2<T> call2, Response4<T> response4) {
        Intrinsics2.m13090f(call2, "call");
        Intrinsics2.m13090f(response4, "response");
        if (!response4.m14315a()) {
            CancellableContinuation cancellableContinuation = this.f33175a;
            HttpException2 httpException2 = new HttpException2(response4);
            Result.a aVar = Result.f29493f;
            cancellableContinuation.mo13056g(C5729a.m12456k(httpException2));
            return;
        }
        T t = response4.f33293b;
        if (t != null) {
            CancellableContinuation cancellableContinuation2 = this.f33175a;
            Result.a aVar2 = Result.f29493f;
            cancellableContinuation2.mo13056g(t);
            return;
        }
        Request3 request3Mo14276c = call2.mo14276c();
        Objects.requireNonNull(request3Mo14276c);
        Intrinsics2.m13090f(Invocation.class, "type");
        Object objCast = Invocation.class.cast(request3Mo14276c.f29955f.get(Invocation.class));
        if (objCast == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        Intrinsics2.m13086b(objCast, "call.request().tag(Invocation::class.java)!!");
        Method method = ((Invocation) objCast).f33172a;
        StringBuilder sb = new StringBuilder();
        sb.append("Response from ");
        Intrinsics2.m13086b(method, "method");
        Class<?> declaringClass = method.getDeclaringClass();
        Intrinsics2.m13086b(declaringClass, "method.declaringClass");
        sb.append(declaringClass.getName());
        sb.append('.');
        sb.append(method.getName());
        sb.append(" was null but response body type was declared as non-null");
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
        CancellableContinuation cancellableContinuation3 = this.f33175a;
        Result.a aVar3 = Result.f29493f;
        cancellableContinuation3.mo13056g(C5729a.m12456k(kotlinNullPointerException));
    }
}
