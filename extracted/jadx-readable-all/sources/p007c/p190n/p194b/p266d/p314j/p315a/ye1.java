package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Binder;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p007c.p190n.p194b.p266d.p314j.p315a.m20;
import p007c.p190n.p194b.p266d.p314j.p315a.r50;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ye1<R extends r50<AdT>, AdT extends m20> implements lf1<R, xe1<AdT>> {

    /* JADX INFO: renamed from: a */
    public final nj1 f21859a;

    /* JADX INFO: renamed from: b */
    public final Executor f21860b;

    /* JADX INFO: renamed from: c */
    public final dv1<Void> f21861c = new we1();

    public ye1(nj1 nj1Var, Executor executor) {
        this.f21859a = nj1Var;
        this.f21860b = executor;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lf1
    /* JADX INFO: renamed from: a */
    public final kv1<xe1<AdT>> mo5768a(final mf1 mf1Var, final kf1<R> kf1Var) {
        kv1 kv1VarM6231a;
        kv1 kv1VarM6246p;
        hf1 hf1Var = new hf1(this.f21859a, mf1Var.f16744b, kf1Var, this.f21860b);
        gf1 gf1Var = hf1Var.f14836e;
        if (gf1Var == null) {
            if (C3571u4.f20210a.m6603d().booleanValue()) {
                q50 q50VarMo5787a = hf1Var.f14834c.mo5787a(hf1Var.f14833b);
                q50VarMo5787a.mo7308c(new te1(((oj1) hf1Var.f14832a).f17660b.f19587m));
                final q30 q30VarMo7141b = ((r50) q50VarMo5787a.mo7309d()).mo7141b();
                final sj1 sj1Var = ((oj1) hf1Var.f14832a).f17660b;
                ol1<I> ol1VarM8125a = q30VarMo7141b.f18178c.m8125a(rl1.GET_CACHE_KEY, q30VarMo7141b.f18184i.m7964b());
                fl1 fl1VarM8042f = ol1VarM8125a.m8038b(new qu1(q30VarMo7141b, sj1Var) { // from class: c.n.b.d.j.a.n30

                    /* JADX INFO: renamed from: a */
                    public final q30 f17017a;

                    /* JADX INFO: renamed from: b */
                    public final sj1 f17018b;

                    {
                        this.f17017a = q30VarMo7141b;
                        this.f17018b = sj1Var;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                    /* JADX INFO: renamed from: a */
                    public final kv1 mo4612a(Object obj) {
                        q30 q30Var = this.f17017a;
                        sj1 sj1Var2 = this.f17018b;
                        final C3437qi c3437qi = (C3437qi) obj;
                        Objects.requireNonNull(q30Var);
                        c3437qi.f18303n = sj1Var2;
                        final yt0 yt0Var = q30Var.f18183h;
                        qu1 qu1Var = new qu1(c3437qi) { // from class: c.n.b.d.j.a.rt0

                            /* JADX INFO: renamed from: a */
                            public final C3437qi f19062a;

                            {
                                this.f19062a = c3437qi;
                            }

                            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                            /* JADX INFO: renamed from: a */
                            public final kv1 mo4612a(Object obj2) throws IOException {
                                byte[] bArrM7935a;
                                C3437qi c3437qi2 = this.f19062a;
                                InputStream inputStream = (InputStream) obj2;
                                int i = nt1.f17268a;
                                Objects.requireNonNull(inputStream);
                                ArrayDeque arrayDeque = new ArrayDeque(20);
                                int i2 = 8192;
                                int i3 = 0;
                                while (i3 < 2147483639) {
                                    int iMin = Math.min(i2, 2147483639 - i3);
                                    byte[] bArr = new byte[iMin];
                                    arrayDeque.add(bArr);
                                    int i4 = 0;
                                    while (i4 < iMin) {
                                        int i5 = inputStream.read(bArr, i4, iMin - i4);
                                        if (i5 == -1) {
                                            bArrM7935a = nt1.m7935a(arrayDeque, i3);
                                            c3437qi2.f18304o = new String(bArrM7935a, bs1.f12807a);
                                            return cw0.m6231a(c3437qi2);
                                        }
                                        i4 += i5;
                                        i3 += i5;
                                    }
                                    long j2 = i2;
                                    long j3 = j2 + j2;
                                    if (j3 > 2147483647L) {
                                        i2 = Integer.MAX_VALUE;
                                    } else {
                                        i2 = j3 < -2147483648L ? Integer.MIN_VALUE : (int) j3;
                                    }
                                }
                                if (inputStream.read() != -1) {
                                    throw new OutOfMemoryError("input is too large to fit in a byte array");
                                }
                                bArrM7935a = nt1.m7935a(arrayDeque, 2147483639);
                                c3437qi2.f18304o = new String(bArrM7935a, bs1.f12807a);
                                return cw0.m6231a(c3437qi2);
                            }
                        };
                        final ht0 ht0Var = yt0Var.f21992b;
                        return yt0Var.m8830a(c3437qi, new xt0(ht0Var) { // from class: c.n.b.d.j.a.st0

                            /* JADX INFO: renamed from: a */
                            public final ht0 f19698a;

                            {
                                this.f19698a = ht0Var;
                            }

                            @Override // p007c.p190n.p194b.p266d.p314j.p315a.xt0
                            /* JADX INFO: renamed from: a */
                            public final kv1 mo8368a(C3437qi c3437qi2) {
                                kv1 gv1Var;
                                ht0 ht0Var2 = this.f19698a;
                                synchronized (ht0Var2.f12267b) {
                                    int i = ht0Var2.f15007h;
                                    if (i != 1 && i != 2) {
                                        gv1Var = new gv1(new ot0(2));
                                    } else if (ht0Var2.f12268c) {
                                        gv1Var = ht0Var2.f12266a;
                                    } else {
                                        ht0Var2.f15007h = 2;
                                        ht0Var2.f12268c = true;
                                        ht0Var2.f12270e = c3437qi2;
                                        ht0Var2.f12271f.m5578o();
                                        C3147io<InputStream> c3147io = ht0Var2.f12266a;
                                        c3147io.f15328f.mo6230f(new Runnable(ht0Var2) { // from class: c.n.b.d.j.a.ft0

                                            /* JADX INFO: renamed from: f */
                                            public final ht0 f14112f;

                                            {
                                                this.f14112f = ht0Var2;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                this.f14112f.m5851a();
                                            }
                                        }, C2962do.f13335f);
                                        gv1Var = ht0Var2.f12266a;
                                    }
                                }
                                return gv1Var;
                            }
                        }, new xt0(yt0Var) { // from class: c.n.b.d.j.a.tt0

                            /* JADX INFO: renamed from: a */
                            public final yt0 f19980a;

                            {
                                this.f19980a = yt0Var;
                            }

                            @Override // p007c.p190n.p194b.p266d.p314j.p315a.xt0
                            /* JADX INFO: renamed from: a */
                            public final kv1 mo8368a(C3437qi c3437qi2) {
                                return this.f19980a.f21993c.m8545a().m8160G6(c3437qi2, Binder.getCallingUid());
                            }
                        }, qu1Var);
                    }
                }, ol1VarM8125a.f17674f.f18025b).m8042f();
                o30 o30Var = new o30(q30VarMo7141b);
                fl1VarM8042f.mo6230f(new ev1(fl1VarM8042f, o30Var), q30VarMo7141b.f18185j);
                kv1VarM6246p = cw0.m6246p(cw0.m6250t(zu1.m8908s(fl1VarM8042f), new ef1(hf1Var), hf1Var.f14835d), ot0.class, new df1(hf1Var), hf1Var.f14835d);
            } else {
                gf1 gf1Var2 = new gf1(null, hf1Var.m7117a());
                hf1Var.f14836e = gf1Var2;
                kv1VarM6246p = cw0.m6231a(gf1Var2);
            }
            kv1VarM6231a = cw0.m6250t(kv1VarM6246p, cf1.f12996a, hf1Var.f14835d);
        } else {
            kv1VarM6231a = cw0.m6231a(gf1Var);
        }
        return cw0.m6246p(cw0.m6249s(zu1.m8908s(kv1VarM6231a), new qu1(this, mf1Var, kf1Var) { // from class: c.n.b.d.j.a.ue1

            /* JADX INFO: renamed from: a */
            public final ye1 f20295a;

            /* JADX INFO: renamed from: b */
            public final mf1 f20296b;

            /* JADX INFO: renamed from: c */
            public final kf1 f20297c;

            {
                this.f20295a = this;
                this.f20296b = mf1Var;
                this.f20297c = kf1Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                vj1<?> vj1VarM7715a;
                Future futureM8830a;
                ye1 ye1Var = this.f20295a;
                mf1 mf1Var2 = this.f20296b;
                kf1 kf1Var2 = this.f20297c;
                gf1 gf1Var3 = (gf1) obj;
                Objects.requireNonNull(ye1Var);
                wj1 wj1Var = gf1Var3.f14552b;
                C3437qi c3437qi = gf1Var3.f14551a;
                if (wj1Var != null) {
                    oj1 oj1Var = (oj1) ye1Var.f21859a;
                    synchronized (oj1Var) {
                        mj1 mj1Var = oj1Var.f17659a.get(wj1Var);
                        if (mj1Var != null) {
                            vj1VarM7715a = mj1Var.m7715a();
                            if (vj1VarM7715a == null) {
                                oj1Var.f17661c.f18318e++;
                            }
                            lk1 lk1Var = mj1Var.f16778d;
                            kk1 kk1VarM7511a = lk1Var.f16378b.m7511a();
                            kk1 kk1Var = lk1Var.f16378b;
                            kk1Var.f15970f = false;
                            kk1Var.f15971g = 0;
                            if (vj1VarM7715a != null) {
                                ls2 ls2VarM8452v = ts2.m8452v();
                                js2 js2VarM7546v = ks2.m7546v();
                                js2VarM7546v.m7388r(ns2.IN_MEMORY);
                                os2 os2VarM8224v = qs2.m8224v();
                                boolean z = kk1VarM7511a.f15970f;
                                if (os2VarM8224v.f13191h) {
                                    os2VarM8224v.m6298m();
                                    os2VarM8224v.f13191h = false;
                                }
                                qs2.m8226y((qs2) os2VarM8224v.f13190g, z);
                                int i = kk1VarM7511a.f15971g;
                                if (os2VarM8224v.f13191h) {
                                    os2VarM8224v.m6298m();
                                    os2VarM8224v.f13191h = false;
                                }
                                qs2.m8227z((qs2) os2VarM8224v.f13190g, i);
                                js2VarM7546v.m7389s(os2VarM8224v);
                                ls2VarM8452v.m7612r(js2VarM7546v);
                                vj1VarM7715a.f20805a.f18181f.m7108A0(new v90(ls2VarM8452v.m6300o()));
                            }
                            oj1Var.m8036b();
                        } else {
                            oj1Var.f17661c.f18317d++;
                            oj1Var.m8036b();
                            vj1VarM7715a = null;
                        }
                    }
                } else {
                    vj1VarM7715a = null;
                }
                if (wj1Var == null) {
                    return cw0.m6231a(null);
                }
                if (vj1VarM7715a != null && c3437qi != null) {
                    q30 q30VarMo7141b2 = ((r50) kf1Var2.mo5787a(mf1Var2.f16744b).mo7309d()).mo7141b();
                    yl1 yl1Var = q30VarMo7141b2.f18178c;
                    rl1 rl1Var = rl1.NOTIFY_CACHE_HIT;
                    final yt0 yt0Var = q30VarMo7141b2.f18183h;
                    Objects.requireNonNull(yt0Var);
                    if (re2.m8276a(c3437qi.f18304o)) {
                        futureM8830a = new gv1(new or0(2, "Pool key missing from removeUrl call."));
                    } else {
                        futureM8830a = yt0Var.m8830a(c3437qi, new xt0(yt0Var) { // from class: c.n.b.d.j.a.vt0

                            /* JADX INFO: renamed from: a */
                            public final yt0 f20939a;

                            {
                                this.f20939a = yt0Var;
                            }

                            @Override // p007c.p190n.p194b.p266d.p314j.p315a.xt0
                            /* JADX INFO: renamed from: a */
                            public final kv1 mo8368a(C3437qi c3437qi2) {
                                kv1 gv1Var;
                                ht0 ht0Var = this.f20939a.f21992b;
                                String str = c3437qi2.f18304o;
                                synchronized (ht0Var.f12267b) {
                                    int i2 = ht0Var.f15007h;
                                    if (i2 != 1 && i2 != 3) {
                                        gv1Var = new gv1(new ot0(2));
                                    } else if (ht0Var.f12268c) {
                                        gv1Var = ht0Var.f12266a;
                                    } else {
                                        ht0Var.f15007h = 3;
                                        ht0Var.f12268c = true;
                                        ht0Var.f15006g = str;
                                        ht0Var.f12271f.m5578o();
                                        C3147io<InputStream> c3147io = ht0Var.f12266a;
                                        c3147io.f15328f.mo6230f(new Runnable(ht0Var) { // from class: c.n.b.d.j.a.gt0

                                            /* JADX INFO: renamed from: f */
                                            public final ht0 f14675f;

                                            {
                                                this.f14675f = ht0Var;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                this.f14675f.m5851a();
                                            }
                                        }, C2962do.f13335f);
                                        gv1Var = ht0Var.f12266a;
                                    }
                                }
                                return gv1Var;
                            }
                        }, new xt0(yt0Var) { // from class: c.n.b.d.j.a.wt0

                            /* JADX INFO: renamed from: a */
                            public final yt0 f21356a;

                            {
                                this.f21356a = yt0Var;
                            }

                            @Override // p007c.p190n.p194b.p266d.p314j.p315a.xt0
                            /* JADX INFO: renamed from: a */
                            public final kv1 mo8368a(C3437qi c3437qi2) {
                                return this.f21356a.f21993c.m8545a().m8161H6(c3437qi2.f18304o);
                            }
                        }, ut0.f20427a);
                    }
                    fl1 fl1VarM8042f2 = yl1Var.m8125a(rl1Var, futureM8830a).m8042f();
                    fl1VarM8042f2.mo6230f(new ev1(fl1VarM8042f2, new p30(q30VarMo7141b2)), q30VarMo7141b2.f18185j);
                    cw0.m6253w(fl1VarM8042f2, ye1Var.f21861c, ye1Var.f21860b);
                }
                return cw0.m6231a(new xe1(wj1Var, c3437qi, vj1VarM7715a));
            }
        }, this.f21860b), Exception.class, new ve1(), this.f21860b);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lf1
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo5769b() {
        return null;
    }
}
