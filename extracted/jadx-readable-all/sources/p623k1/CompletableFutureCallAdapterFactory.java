package p623k1;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: k1.g, reason: use source file name */
/* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
/* JADX INFO: loaded from: classes2.dex */
@IgnoreJRERequirement
public final class CompletableFutureCallAdapterFactory extends CallAdapter.a {

    /* JADX INFO: renamed from: a */
    public static final CallAdapter.a f33151a = new CompletableFutureCallAdapterFactory();

    /* JADX INFO: renamed from: k1.g$a */
    /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    public static final class a<R> implements CallAdapter<R, CompletableFuture<R>> {

        /* JADX INFO: renamed from: a */
        public final Type f33152a;

        /* JADX INFO: renamed from: k1.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        public class C8552a implements Callback2<R> {

            /* JADX INFO: renamed from: a */
            public final CompletableFuture<R> f33153a;

            public C8552a(a aVar, CompletableFuture<R> completableFuture) {
                this.f33153a = completableFuture;
            }

            @Override // p623k1.Callback2
            /* JADX INFO: renamed from: a */
            public void mo14297a(Call2<R> call2, Throwable th) {
                this.f33153a.completeExceptionally(th);
            }

            @Override // p623k1.Callback2
            /* JADX INFO: renamed from: b */
            public void mo14298b(Call2<R> call2, Response4<R> response4) {
                if (response4.m14315a()) {
                    this.f33153a.complete(response4.f33293b);
                } else {
                    this.f33153a.completeExceptionally(new HttpException2(response4));
                }
            }
        }

        public a(Type type) {
            this.f33152a = type;
        }

        @Override // p623k1.CallAdapter
        /* JADX INFO: renamed from: a */
        public Type mo14278a() {
            return this.f33152a;
        }

        @Override // p623k1.CallAdapter
        /* JADX INFO: renamed from: b */
        public Object mo14279b(Call2 call2) {
            b bVar = new b(call2);
            call2.mo14274B(new C8552a(this, bVar));
            return bVar;
        }
    }

    /* JADX INFO: renamed from: k1.g$b */
    /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: f */
        public final Call2<?> f33154f;

        public b(Call2<?> call2) {
            this.f33154f = call2;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (z) {
                this.f33154f.cancel();
            }
            return super.cancel(z);
        }
    }

    /* JADX INFO: renamed from: k1.g$c */
    /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    public static final class c<R> implements CallAdapter<R, CompletableFuture<Response4<R>>> {

        /* JADX INFO: renamed from: a */
        public final Type f33155a;

        /* JADX INFO: renamed from: k1.g$c$a */
        /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        public class a implements Callback2<R> {

            /* JADX INFO: renamed from: a */
            public final CompletableFuture<Response4<R>> f33156a;

            public a(c cVar, CompletableFuture<Response4<R>> completableFuture) {
                this.f33156a = completableFuture;
            }

            @Override // p623k1.Callback2
            /* JADX INFO: renamed from: a */
            public void mo14297a(Call2<R> call2, Throwable th) {
                this.f33156a.completeExceptionally(th);
            }

            @Override // p623k1.Callback2
            /* JADX INFO: renamed from: b */
            public void mo14298b(Call2<R> call2, Response4<R> response4) {
                this.f33156a.complete(response4);
            }
        }

        public c(Type type) {
            this.f33155a = type;
        }

        @Override // p623k1.CallAdapter
        /* JADX INFO: renamed from: a */
        public Type mo14278a() {
            return this.f33155a;
        }

        @Override // p623k1.CallAdapter
        /* JADX INFO: renamed from: b */
        public Object mo14279b(Call2 call2) {
            b bVar = new b(call2);
            call2.mo14274B(new a(this, bVar));
            return bVar;
        }
    }

    @Override // p623k1.CallAdapter.a
    /* JADX INFO: renamed from: a */
    public CallAdapter<?, ?> mo14280a(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Utils8.m14286f(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeM14285e = Utils8.m14285e(0, (ParameterizedType) type);
        if (Utils8.m14286f(typeM14285e) != Response4.class) {
            return new a(typeM14285e);
        }
        if (typeM14285e instanceof ParameterizedType) {
            return new c(Utils8.m14285e(0, (ParameterizedType) typeM14285e));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
