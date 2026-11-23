package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class pu0 extends AbstractBinderC3067gi {

    /* JADX INFO: renamed from: f */
    public final Context f18089f;

    /* JADX INFO: renamed from: g */
    public final Executor f18090g;

    /* JADX INFO: renamed from: h */
    public final AbstractC2882bj f18091h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC3638vx f18092i;

    /* JADX INFO: renamed from: j */
    public final HashMap<String, mu0> f18093j;

    /* JADX INFO: renamed from: k */
    public final C2920cj f18094k;

    /* JADX WARN: Multi-variable type inference failed */
    public pu0(Context context, Context context2, Executor executor, C2920cj c2920cj, InterfaceC3638vx interfaceC3638vx, AbstractC2882bj abstractC2882bj, HashMap<String, mu0> map, uu0 uu0Var) {
        C3052g3.m6922a(context);
        this.f18089f = context;
        this.f18090g = context2;
        this.f18094k = executor;
        this.f18091h = interfaceC3638vx;
        this.f18092i = c2920cj;
        this.f18093j = abstractC2882bj;
    }

    /* JADX INFO: renamed from: J6 */
    public static kv1<JSONObject> m8157J6(C3437qi c3437qi, yl1 yl1Var, final bb1 bb1Var) {
        qu1 qu1Var = new qu1(bb1Var) { // from class: c.n.b.d.j.a.cu0

            /* JADX INFO: renamed from: a */
            public final bb1 f13119a;

            {
                this.f13119a = bb1Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                return this.f13119a.mo5957a().m7679a(C2330u.f10884a.f10889d.m4768D((Bundle) obj));
            }
        };
        dl1 dl1Var = du0.f13388a;
        ol1<I> ol1VarM8125a = yl1Var.m8125a(rl1.GMS_SIGNALS, cw0.m6231a(c3437qi.f18295f));
        ol1 ol1VarM8038b = ol1VarM8125a.m8038b(qu1Var, ol1VarM8125a.f17674f.f18025b);
        return ol1VarM8038b.m8038b(new jl1(dl1Var), ol1VarM8038b.f17674f.f18025b).m8042f();
    }

    /* JADX INFO: renamed from: K6 */
    public static kv1<C3548ti> m8158K6(kv1<JSONObject> kv1Var, yl1 yl1Var, C3468rc c3468rc) {
        C3617vc c3617vc = new C3617vc(c3468rc.f18740c, "AFMA_getAdDictionary", C3357oc.f17593b, fu0.f14116a);
        ol1<I> ol1VarM8125a = yl1Var.m8125a(rl1.BUILD_URL, kv1Var);
        return ol1VarM8125a.m8038b(c3617vc, ol1VarM8125a.f17674f.f18025b).m8042f();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3104hi
    /* JADX INFO: renamed from: B4 */
    public final void mo6814B4(String str, InterfaceC3252li interfaceC3252li) {
        m8163L6(m8161H6(str), interfaceC3252li);
    }

    /* JADX INFO: renamed from: F6 */
    public final kv1<InputStream> m8159F6(C3437qi c3437qi, int i) {
        rl1 rl1Var = rl1.PRE_PROCESS;
        rl1 rl1Var2 = rl1.HTTP;
        C3468rc c3468rcM7227a = C2330u.f10884a.f10902q.m7227a(this.f18089f, C3702xn.m8742H());
        bb1 bb1VarM7620A = ((AbstractC3264lu) this.f18092i).m7620A(c3437qi, i);
        C3617vc c3617vc = new C3617vc(c3468rcM7227a.f18740c, "google.afma.response.normalize", ou0.f17733a, C3357oc.f17594c);
        wu0 wu0Var = new wu0(c3437qi.f18301l);
        tu0 tu0Var = new tu0(this.f18089f, c3437qi.f18296g.f21615f, this.f18094k, i, null);
        yl1 yl1VarMo5959c = bb1VarM7620A.mo5959c();
        mu0 mu0Var = null;
        if (C3571u4.f20210a.m6603d().booleanValue()) {
            String str = c3437qi.f18304o;
            if (str != null && !str.isEmpty()) {
                mu0 mu0VarRemove = this.f18093j.remove(c3437qi.f18304o);
                if (mu0VarRemove == null) {
                    C2096e.m4590z("Request contained a PoolKey but no matching parameters were found.");
                } else {
                    mu0Var = mu0VarRemove;
                }
            }
        } else {
            String str2 = c3437qi.f18304o;
            if (str2 != null && !str2.isEmpty()) {
                C2096e.m4590z("Request contained a PoolKey but split request is disabled.");
            }
        }
        if (mu0Var != null) {
            ol1<I> ol1VarM8125a = yl1VarMo5959c.m8125a(rl1Var2, cw0.m6231a(new vu0(mu0Var.f16852b, mu0Var.f16851a)));
            ol1 ol1VarM8038b = ol1VarM8125a.m8038b(new jl1(wu0Var), ol1VarM8125a.f17674f.f18025b);
            final fl1 fl1VarM8042f = ol1VarM8038b.m8038b(new jl1(tu0Var), ol1VarM8038b.f17674f.f18025b).m8042f();
            final kv1<?> kv1VarM6231a = cw0.m6231a(mu0Var);
            ol1 ol1VarM7143a = yl1VarMo5959c.m8126b(rl1Var, fl1VarM8042f, kv1VarM6231a).m7143a(new Callable(fl1VarM8042f, kv1VarM6231a) { // from class: c.n.b.d.j.a.bu0

                /* JADX INFO: renamed from: a */
                public final kv1 f12863a;

                /* JADX INFO: renamed from: b */
                public final kv1 f12864b;

                {
                    this.f12863a = fl1VarM8042f;
                    this.f12864b = kv1VarM6231a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    kv1 kv1Var = this.f12863a;
                    kv1 kv1Var2 = this.f12864b;
                    return new ou0((su0) kv1Var.get(), ((mu0) kv1Var2.get()).f16852b, ((mu0) kv1Var2.get()).f16851a);
                }
            });
            return ol1VarM7143a.m8038b(c3617vc, ol1VarM7143a.f17674f.f18025b).m8042f();
        }
        final kv1<JSONObject> kv1VarM8157J6 = m8157J6(c3437qi, yl1VarMo5959c, bb1VarM7620A);
        final kv1<C3548ti> kv1VarM8158K6 = m8158K6(kv1VarM8157J6, yl1VarMo5959c, c3468rcM7227a);
        ol1 ol1VarM7143a2 = yl1VarMo5959c.m8126b(rl1Var2, kv1VarM8158K6, kv1VarM8157J6).m7143a(new Callable(kv1VarM8157J6, kv1VarM8158K6) { // from class: c.n.b.d.j.a.zt0

            /* JADX INFO: renamed from: a */
            public final kv1 f22397a;

            /* JADX INFO: renamed from: b */
            public final kv1 f22398b;

            {
                this.f22397a = kv1VarM8157J6;
                this.f22398b = kv1VarM8158K6;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new vu0((JSONObject) this.f22397a.get(), (C3548ti) this.f22398b.get());
            }
        });
        ol1 ol1VarM8038b2 = ol1VarM7143a2.m8038b(new jl1(wu0Var), ol1VarM7143a2.f17674f.f18025b);
        final fl1 fl1VarM8042f2 = ol1VarM8038b2.m8038b(new jl1(tu0Var), ol1VarM8038b2.f17674f.f18025b).m8042f();
        ol1 ol1VarM7143a3 = yl1VarMo5959c.m8126b(rl1Var, kv1VarM8157J6, kv1VarM8158K6, fl1VarM8042f2).m7143a(new Callable(fl1VarM8042f2, kv1VarM8157J6, kv1VarM8158K6) { // from class: c.n.b.d.j.a.au0

            /* JADX INFO: renamed from: a */
            public final kv1 f12274a;

            /* JADX INFO: renamed from: b */
            public final kv1 f12275b;

            /* JADX INFO: renamed from: c */
            public final kv1 f12276c;

            {
                this.f12274a = fl1VarM8042f2;
                this.f12275b = kv1VarM8157J6;
                this.f12276c = kv1VarM8158K6;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ou0((su0) this.f12274a.get(), (JSONObject) this.f12275b.get(), (C3548ti) this.f12276c.get());
            }
        });
        return ol1VarM7143a3.m8038b(c3617vc, ol1VarM7143a3.f17674f.f18025b).m8042f();
    }

    /* JADX INFO: renamed from: G6 */
    public final kv1<InputStream> m8160G6(C3437qi c3437qi, int i) {
        if (!C3571u4.f20210a.m6603d().booleanValue()) {
            return new gv1(new Exception("Split request is disabled."));
        }
        sj1 sj1Var = c3437qi.f18303n;
        if (sj1Var == null) {
            return new gv1(new Exception("Pool configuration missing from request."));
        }
        if (sj1Var.f19584j == 0 || sj1Var.f19585k == 0) {
            return new gv1(new Exception("Caching is disabled."));
        }
        C3468rc c3468rcM7227a = C2330u.f10884a.f10902q.m7227a(this.f18089f, C3702xn.m8742H());
        bb1 bb1VarM7620A = ((AbstractC3264lu) this.f18092i).m7620A(c3437qi, i);
        yl1 yl1VarMo5959c = bb1VarM7620A.mo5959c();
        final kv1<JSONObject> kv1VarM8157J6 = m8157J6(c3437qi, yl1VarMo5959c, bb1VarM7620A);
        final kv1<C3548ti> kv1VarM8158K6 = m8158K6(kv1VarM8157J6, yl1VarMo5959c, c3468rcM7227a);
        return yl1VarMo5959c.m8126b(rl1.GET_URL_AND_CACHE_KEY, kv1VarM8157J6, kv1VarM8158K6).m7143a(new Callable(this, kv1VarM8158K6, kv1VarM8157J6) { // from class: c.n.b.d.j.a.hu0

            /* JADX INFO: renamed from: a */
            public final pu0 f15015a;

            /* JADX INFO: renamed from: b */
            public final kv1 f15016b;

            /* JADX INFO: renamed from: c */
            public final kv1 f15017c;

            {
                this.f15015a = this;
                this.f15016b = kv1VarM8158K6;
                this.f15017c = kv1VarM8157J6;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                pu0 pu0Var = this.f15015a;
                kv1 kv1Var = this.f15016b;
                kv1 kv1Var2 = this.f15017c;
                Objects.requireNonNull(pu0Var);
                String str = ((C3548ti) kv1Var.get()).f19841i;
                pu0Var.f18093j.put(str, new mu0((C3548ti) kv1Var.get(), (JSONObject) kv1Var2.get()));
                return new ByteArrayInputStream(str.getBytes(bs1.f12807a));
            }
        }).m8042f();
    }

    /* JADX INFO: renamed from: H6 */
    public final kv1<InputStream> m8161H6(String str) {
        if (!C3571u4.f20210a.m6603d().booleanValue()) {
            return new gv1(new Exception("Split request is disabled."));
        }
        ku0 ku0Var = new ku0();
        if (this.f18093j.remove(str) != null) {
            return cw0.m6231a(ku0Var);
        }
        String strValueOf = String.valueOf(str);
        return new gv1(new Exception(strValueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(strValueOf) : new String("URL to be removed not found for cache key: ")));
    }

    /* JADX INFO: renamed from: I6 */
    public final kv1<InputStream> m8162I6(C3437qi c3437qi, int i) {
        C3468rc c3468rcM7227a = C2330u.f10884a.f10902q.m7227a(this.f18089f, C3702xn.m8742H());
        if (!C3757z4.f22166a.m6603d().booleanValue()) {
            return new gv1(new Exception("Signal collection disabled."));
        }
        bb1 bb1VarM7620A = ((AbstractC3264lu) this.f18092i).m7620A(c3437qi, i);
        final ma1<JSONObject> ma1VarMo5958b = bb1VarM7620A.mo5958b();
        C3617vc c3617vc = new C3617vc(c3468rcM7227a.f18740c, "google.afma.request.getSignals", C3357oc.f17593b, C3357oc.f17594c);
        ol1<I> ol1VarM8125a = bb1VarM7620A.mo5959c().m8125a(rl1.GET_SIGNALS, cw0.m6231a(c3437qi.f18295f));
        ol1 ol1VarM8038b = ol1VarM8125a.m8038b(new qu1(ma1VarMo5958b) { // from class: c.n.b.d.j.a.iu0

            /* JADX INFO: renamed from: a */
            public final ma1 f15388a;

            {
                this.f15388a = ma1VarMo5958b;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                return this.f15388a.m7679a(C2330u.f10884a.f10889d.m4768D((Bundle) obj));
            }
        }, ol1VarM8125a.f17674f.f18025b);
        ol1 ol1VarM8125a2 = ol1VarM8038b.f17674f.m8125a(rl1.JS_SIGNALS, ol1VarM8038b.m8042f());
        return ol1VarM8125a2.m8038b(c3617vc, ol1VarM8125a2.f17674f.f18025b).m8042f();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3104hi
    /* JADX INFO: renamed from: J1 */
    public final void mo6815J1(C3437qi c3437qi, InterfaceC3252li interfaceC3252li) {
        m8163L6(m8160G6(c3437qi, Binder.getCallingUid()), interfaceC3252li);
    }

    /* JADX INFO: renamed from: L6 */
    public final void m8163L6(kv1<InputStream> kv1Var, InterfaceC3252li interfaceC3252li) {
        kv1 kv1VarM6249s = cw0.m6249s(kv1Var, new qu1(this) { // from class: c.n.b.d.j.a.ju0
            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) throws IOException {
                final InputStream inputStream = (InputStream) obj;
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                final ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[1];
                C2962do.f13330a.execute(new Runnable(inputStream, parcelFileDescriptor2) { // from class: c.n.b.d.j.a.xi1

                    /* JADX INFO: renamed from: f */
                    public final InputStream f21550f;

                    /* JADX INFO: renamed from: g */
                    public final ParcelFileDescriptor f21551g;

                    {
                        this.f21550f = inputStream;
                        this.f21551g = parcelFileDescriptor2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InputStream inputStream2 = this.f21550f;
                        try {
                            try {
                                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(this.f21551g);
                                try {
                                    C2622l.m5399m(inputStream2, autoCloseOutputStream, false, 1024);
                                    autoCloseOutputStream.close();
                                    inputStream2.close();
                                } catch (Throwable th) {
                                    try {
                                        autoCloseOutputStream.close();
                                    } catch (Throwable th2) {
                                        q62.f18207a.mo7442a(th, th2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Throwable th4) {
                                        q62.f18207a.mo7442a(th3, th4);
                                    }
                                }
                                throw th3;
                            }
                        } catch (IOException unused) {
                        }
                    }
                });
                return cw0.m6231a(parcelFileDescriptor);
            }
        }, C2962do.f13330a);
        lu0 lu0Var = new lu0(interfaceC3252li);
        lv1 lv1Var = C2962do.f13335f;
        ((du1) kv1VarM6249s).mo6230f(new ev1(kv1VarM6249s, lu0Var), lv1Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3104hi
    /* JADX INFO: renamed from: a1 */
    public final void mo6816a1(C3437qi c3437qi, InterfaceC3252li interfaceC3252li) {
        m8163L6(m8162I6(c3437qi, Binder.getCallingUid()), interfaceC3252li);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3104hi
    /* JADX INFO: renamed from: i6 */
    public final void mo6817i6(C3437qi c3437qi, InterfaceC3252li interfaceC3252li) {
        kv1<InputStream> kv1VarM8159F6 = m8159F6(c3437qi, Binder.getCallingUid());
        m8163L6(kv1VarM8159F6, interfaceC3252li);
        ((fl1) kv1VarM8159F6).f14054h.mo6230f(new Runnable(this) { // from class: c.n.b.d.j.a.gu0

            /* JADX INFO: renamed from: f */
            public final pu0 f14680f;

            {
                this.f14680f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2622l.m5320V0(this.f14680f.f18091h.mo5817a(), "persistFlags");
            }
        }, this.f18090g);
    }
}
