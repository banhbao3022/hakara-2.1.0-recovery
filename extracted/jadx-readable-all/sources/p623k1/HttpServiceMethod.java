package p623k1;

import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p486i.IntrinsicsJvm;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CancellableContinuationImpl4;
import p509g1.Call;
import p509g1.ResponseBody;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: k1.k, reason: use source file name */
/* JADX INFO: compiled from: HttpServiceMethod.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class HttpServiceMethod<ResponseT, ReturnT> extends ServiceMethod<ReturnT> {

    /* JADX INFO: renamed from: a */
    public final RequestFactory f33166a;

    /* JADX INFO: renamed from: b */
    public final Call.a f33167b;

    /* JADX INFO: renamed from: c */
    public final Converter<ResponseBody, ResponseT> f33168c;

    /* JADX INFO: renamed from: k1.k$a */
    /* JADX INFO: compiled from: HttpServiceMethod.java */
    public static final class a<ResponseT, ReturnT> extends HttpServiceMethod<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: d */
        public final CallAdapter<ResponseT, ReturnT> f33169d;

        public a(RequestFactory requestFactory, Call.a aVar, Converter<ResponseBody, ResponseT> converter, CallAdapter<ResponseT, ReturnT> callAdapter) {
            super(requestFactory, aVar, converter);
            this.f33169d = callAdapter;
        }

        @Override // p623k1.HttpServiceMethod
        /* JADX INFO: renamed from: c */
        public ReturnT mo14299c(Call2<ResponseT> call2, Object[] objArr) {
            return this.f33169d.mo14279b(call2);
        }
    }

    /* JADX INFO: renamed from: k1.k$b */
    /* JADX INFO: compiled from: HttpServiceMethod.java */
    public static final class b<ResponseT> extends HttpServiceMethod<ResponseT, Object> {

        /* JADX INFO: renamed from: d */
        public final CallAdapter<ResponseT, Call2<ResponseT>> f33170d;

        public b(RequestFactory requestFactory, Call.a aVar, Converter<ResponseBody, ResponseT> converter, CallAdapter<ResponseT, Call2<ResponseT>> callAdapter, boolean z) {
            super(requestFactory, aVar, converter);
            this.f33170d = callAdapter;
        }

        @Override // p623k1.HttpServiceMethod
        /* JADX INFO: renamed from: c */
        public Object mo14299c(Call2<ResponseT> call2, Object[] objArr) {
            Call2<ResponseT> call2Mo14279b = this.f33170d.mo14279b(call2);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                CancellableContinuationImpl4 cancellableContinuationImpl4 = new CancellableContinuationImpl4(IntrinsicsJvm.m13064b(continuation), 1);
                cancellableContinuationImpl4.mo13254i(new KotlinExtensions(call2Mo14279b));
                call2Mo14279b.mo14274B(new KotlinExtensions2(cancellableContinuationImpl4));
                Object objM13268s = cancellableContinuationImpl4.m13268s();
                if (objM13268s == Intrinsics.COROUTINE_SUSPENDED) {
                    Intrinsics2.m13089e(continuation, "frame");
                }
                return objM13268s;
            } catch (Exception e) {
                return SkuDao.a.m14080c0(e, continuation);
            }
        }
    }

    /* JADX INFO: renamed from: k1.k$c */
    /* JADX INFO: compiled from: HttpServiceMethod.java */
    public static final class c<ResponseT> extends HttpServiceMethod<ResponseT, Object> {

        /* JADX INFO: renamed from: d */
        public final CallAdapter<ResponseT, Call2<ResponseT>> f33171d;

        public c(RequestFactory requestFactory, Call.a aVar, Converter<ResponseBody, ResponseT> converter, CallAdapter<ResponseT, Call2<ResponseT>> callAdapter) {
            super(requestFactory, aVar, converter);
            this.f33171d = callAdapter;
        }

        @Override // p623k1.HttpServiceMethod
        /* JADX INFO: renamed from: c */
        public Object mo14299c(Call2<ResponseT> call2, Object[] objArr) {
            Call2<ResponseT> call2Mo14279b = this.f33171d.mo14279b(call2);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                CancellableContinuationImpl4 cancellableContinuationImpl4 = new CancellableContinuationImpl4(IntrinsicsJvm.m13064b(continuation), 1);
                cancellableContinuationImpl4.mo13254i(new KotlinExtensions3(call2Mo14279b));
                call2Mo14279b.mo14274B(new KotlinExtensions4(cancellableContinuationImpl4));
                Object objM13268s = cancellableContinuationImpl4.m13268s();
                if (objM13268s == Intrinsics.COROUTINE_SUSPENDED) {
                    Intrinsics2.m13089e(continuation, "frame");
                }
                return objM13268s;
            } catch (Exception e) {
                return SkuDao.a.m14080c0(e, continuation);
            }
        }
    }

    public HttpServiceMethod(RequestFactory requestFactory, Call.a aVar, Converter<ResponseBody, ResponseT> converter) {
        this.f33166a = requestFactory;
        this.f33167b = aVar;
        this.f33168c = converter;
    }

    @Override // p623k1.ServiceMethod
    /* JADX INFO: renamed from: a */
    public final ReturnT mo14270a(Object[] objArr) {
        return mo14299c(new OkHttpCall(this.f33166a, objArr, this.f33167b, this.f33168c), objArr);
    }

    /* JADX INFO: renamed from: c */
    public abstract ReturnT mo14299c(Call2<ResponseT> call2, Object[] objArr);
}
