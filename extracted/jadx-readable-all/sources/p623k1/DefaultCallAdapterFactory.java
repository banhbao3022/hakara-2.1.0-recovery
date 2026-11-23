package p623k1;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import p509g1.Request3;

/* JADX INFO: renamed from: k1.i, reason: use source file name */
/* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class DefaultCallAdapterFactory extends CallAdapter.a {

    /* JADX INFO: renamed from: a */
    public final Executor f33157a;

    /* JADX INFO: renamed from: k1.i$a */
    /* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
    public class a implements CallAdapter<Object, Call2<?>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Type f33158a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Executor f33159b;

        public a(DefaultCallAdapterFactory defaultCallAdapterFactory, Type type, Executor executor) {
            this.f33158a = type;
            this.f33159b = executor;
        }

        @Override // p623k1.CallAdapter
        /* JADX INFO: renamed from: a */
        public Type mo14278a() {
            return this.f33158a;
        }

        @Override // p623k1.CallAdapter
        /* JADX INFO: renamed from: b */
        public Call2<?> mo14279b(Call2<Object> call2) {
            Executor executor = this.f33159b;
            return executor == null ? call2 : new b(executor, call2);
        }
    }

    /* JADX INFO: renamed from: k1.i$b */
    /* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
    public static final class b<T> implements Call2<T> {

        /* JADX INFO: renamed from: f */
        public final Executor f33160f;

        /* JADX INFO: renamed from: g */
        public final Call2<T> f33161g;

        /* JADX INFO: renamed from: k1.i$b$a */
        /* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
        public class a implements Callback2<T> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Callback2 f33162a;

            public a(Callback2 callback2) {
                this.f33162a = callback2;
            }

            @Override // p623k1.Callback2
            /* JADX INFO: renamed from: a */
            public void mo14297a(Call2<T> call2, final Throwable th) {
                Executor executor = b.this.f33160f;
                final Callback2 callback2 = this.f33162a;
                executor.execute(new Runnable() { // from class: k1.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultCallAdapterFactory.b.a aVar = this.f33111f;
                        callback2.mo14297a(DefaultCallAdapterFactory.b.this, th);
                    }
                });
            }

            @Override // p623k1.Callback2
            /* JADX INFO: renamed from: b */
            public void mo14298b(Call2<T> call2, final Response4<T> response4) {
                Executor executor = b.this.f33160f;
                final Callback2 callback2 = this.f33162a;
                executor.execute(new Runnable() { // from class: k1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultCallAdapterFactory.b.a aVar = this.f33126f;
                        Callback2 callback3 = callback2;
                        Response4 response5 = response4;
                        if (DefaultCallAdapterFactory.b.this.f33161g.mo14277f()) {
                            callback3.mo14297a(DefaultCallAdapterFactory.b.this, new IOException("Canceled"));
                        } else {
                            callback3.mo14298b(DefaultCallAdapterFactory.b.this, response5);
                        }
                    }
                });
            }
        }

        public b(Executor executor, Call2<T> call2) {
            this.f33160f = executor;
            this.f33161g = call2;
        }

        @Override // p623k1.Call2
        /* JADX INFO: renamed from: B */
        public void mo14274B(Callback2<T> callback2) {
            this.f33161g.mo14274B(new a(callback2));
        }

        @Override // p623k1.Call2
        /* JADX INFO: renamed from: D */
        public Call2<T> mo14275D() {
            return new b(this.f33160f, this.f33161g.mo14275D());
        }

        @Override // p623k1.Call2
        /* JADX INFO: renamed from: c */
        public Request3 mo14276c() {
            return this.f33161g.mo14276c();
        }

        @Override // p623k1.Call2
        public void cancel() {
            this.f33161g.cancel();
        }

        public Object clone() throws CloneNotSupportedException {
            return new b(this.f33160f, this.f33161g.mo14275D());
        }

        @Override // p623k1.Call2
        /* JADX INFO: renamed from: f */
        public boolean mo14277f() {
            return this.f33161g.mo14277f();
        }
    }

    public DefaultCallAdapterFactory(Executor executor) {
        this.f33157a = executor;
    }

    @Override // p623k1.CallAdapter.a
    /* JADX INFO: renamed from: a */
    public CallAdapter<?, ?> mo14280a(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Utils8.m14286f(type) != Call2.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(this, Utils8.m14285e(0, (ParameterizedType) type), Utils8.m14289i(annotationArr, SkipCallbackExecutor.class) ? null : this.f33157a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
