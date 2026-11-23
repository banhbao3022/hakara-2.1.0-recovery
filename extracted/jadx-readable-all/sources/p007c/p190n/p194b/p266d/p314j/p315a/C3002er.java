package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.er */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3002er implements vn2, wl2, dp2, zh2, qg2 {

    /* JADX INFO: renamed from: f */
    public static int f13650f;

    /* JADX INFO: renamed from: g */
    public static int f13651g;

    /* JADX INFO: renamed from: h */
    public final Context f13652h;

    /* JADX INFO: renamed from: i */
    public final C3556tq f13653i;

    /* JADX INFO: renamed from: j */
    public final hh2 f13654j;

    /* JADX INFO: renamed from: k */
    public final hh2 f13655k;

    /* JADX INFO: renamed from: l */
    public final xm2 f13656l;

    /* JADX INFO: renamed from: m */
    public final C3667wp f13657m;

    /* JADX INFO: renamed from: n */
    public tg2 f13658n;

    /* JADX INFO: renamed from: o */
    public ByteBuffer f13659o;

    /* JADX INFO: renamed from: p */
    public boolean f13660p;

    /* JADX INFO: renamed from: q */
    public final WeakReference<InterfaceC3704xp> f13661q;

    /* JADX INFO: renamed from: r */
    public InterfaceC2965dr f13662r;

    /* JADX INFO: renamed from: s */
    public int f13663s;

    /* JADX INFO: renamed from: t */
    public int f13664t;

    /* JADX INFO: renamed from: u */
    public long f13665u;

    /* JADX INFO: renamed from: v */
    public final String f13666v;

    /* JADX INFO: renamed from: w */
    public final int f13667w;

    /* JADX INFO: renamed from: x */
    public final ArrayList<pn2> f13668x;

    /* JADX INFO: renamed from: y */
    public volatile C3519sq f13669y;

    /* JADX INFO: renamed from: z */
    public final Set<WeakReference<C3408pq>> f13670z = new HashSet();

    public C3002er(Context context, C3667wp c3667wp, InterfaceC3704xp interfaceC3704xp) {
        this.f13652h = context;
        this.f13657m = c3667wp;
        this.f13661q = new WeakReference<>(interfaceC3704xp);
        C3556tq c3556tq = new C3556tq();
        this.f13653i = c3556tq;
        vk2 vk2Var = vk2.f20823a;
        xr1 xr1Var = C2267h1.f10713a;
        ro2 ro2Var = new ro2(context, vk2Var, 0L, xr1Var, this, -1);
        this.f13654j = ro2Var;
        mi2 mi2Var = new mi2(vk2Var, null, true, xr1Var, this);
        this.f13655k = mi2Var;
        tm2 tm2Var = new tm2(null);
        this.f13656l = tm2Var;
        if (C2096e.m4556E()) {
            String strValueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(strValueOf);
            C2096e.m4590z(sb.toString());
        }
        f13650f++;
        vg2 vg2Var = new vg2(new hh2[]{mi2Var, ro2Var}, tm2Var, c3556tq, null);
        this.f13658n = vg2Var;
        vg2Var.f20770f.add(this);
        this.f13663s = 0;
        this.f13665u = 0L;
        this.f13664t = 0;
        this.f13668x = new ArrayList<>();
        this.f13669y = null;
        this.f13666v = (interfaceC3704xp == null || interfaceC3704xp.mo6497p() == null) ? "" : interfaceC3704xp.mo6497p();
        this.f13667w = interfaceC3704xp != null ? interfaceC3704xp.mo6493n() : 0;
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14387l)).booleanValue()) {
            ((vg2) this.f13658n).f20769e.f12142L = true;
        }
        if (interfaceC3704xp != null && interfaceC3704xp.mo6496o0() > 0) {
            ((vg2) this.f13658n).f20769e.f12143M = interfaceC3704xp.mo6496o0();
        }
        if (interfaceC3704xp == null || interfaceC3704xp.mo6454M() <= 0) {
            return;
        }
        ((vg2) this.f13658n).f20769e.f12144N = interfaceC3704xp.mo6454M();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qg2
    /* JADX INFO: renamed from: a */
    public final void mo6660a(pg2 pg2Var) {
        InterfaceC2965dr interfaceC2965dr = this.f13662r;
        if (interfaceC2965dr != null) {
            interfaceC2965dr.mo6427b("onPlayerError", pg2Var);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qg2
    /* JADX INFO: renamed from: b */
    public final void mo6661b(gh2 gh2Var) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qg2
    /* JADX INFO: renamed from: c */
    public final void mo6662c(om2 om2Var, zm2 zm2Var) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qg2
    /* JADX INFO: renamed from: d */
    public final void mo6663d() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qg2
    /* JADX INFO: renamed from: f */
    public final void mo6664f(nh2 nh2Var, Object obj) {
    }

    public final void finalize() throws Throwable {
        f13650f--;
        if (C2096e.m4556E()) {
            String strValueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(strValueOf);
            C2096e.m4590z(sb.toString());
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qg2
    /* JADX INFO: renamed from: g */
    public final void mo6665g(boolean z, int i) {
        InterfaceC2965dr interfaceC2965dr = this.f13662r;
        if (interfaceC2965dr != null) {
            interfaceC2965dr.mo6429d(i);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.vn2
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo6226h(Object obj, int i) {
        this.f13663s += i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.vn2
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void mo6225e(hn2 hn2Var, jn2 jn2Var) {
        if (hn2Var instanceof pn2) {
            this.f13668x.add((pn2) hn2Var);
            return;
        }
        if (hn2Var instanceof C3519sq) {
            this.f13669y = (C3519sq) hn2Var;
            final InterfaceC3704xp interfaceC3704xp = this.f13661q.get();
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14333d1)).booleanValue() && interfaceC3704xp != null && this.f13669y.f19665l) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.f13669y.f19667n));
                map.put("gcacheDownloaded", String.valueOf(this.f13669y.f19668o));
                C2267h1.f10713a.post(new Runnable(interfaceC3704xp, map) { // from class: c.n.b.d.j.a.uq

                    /* JADX INFO: renamed from: f */
                    public final InterfaceC3704xp f20400f;

                    /* JADX INFO: renamed from: g */
                    public final Map f20401g;

                    {
                        this.f20400f = interfaceC3704xp;
                        this.f20401g = map;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20400f.mo6501r0("onGcacheInfoEvent", this.f20401g);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m6667j(int i) {
        this.f13663s += i;
    }

    /* JADX INFO: renamed from: k */
    public final void m6668k(boolean z) {
        if (this.f13658n != null) {
            for (int i = 0; i < 2; i++) {
                xm2 xm2Var = this.f13656l;
                boolean z2 = !z;
                if (xm2Var.f21614c.get(i) != z2) {
                    xm2Var.f21614c.put(i, z2);
                    an2 an2Var = xm2Var.f12750a;
                    if (an2Var != null) {
                        ((ah2) an2Var).f12150j.sendEmptyMessage(10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX INFO: renamed from: l */
    public final bm2 m6669l(Uri uri, final String str) {
        gn2 gn2Var;
        gn2 gn2Var2;
        ej2 ej2Var;
        if (!this.f13660p || this.f13659o.limit() <= 0) {
            AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14347f1;
            C2862b c2862b = C2862b.f12493a;
            final boolean z = true;
            if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                if (!((Boolean) c2862b.f12496d.m6596a(C3052g3.f14333d1)).booleanValue()) {
                    if (this.f13657m.f21290i) {
                        z = false;
                    }
                }
            } else if (this.f13657m.f21290i) {
                z = false;
            }
            C3667wp c3667wp = this.f13657m;
            final gn2 gn2Var3 = c3667wp.f21289h > 0 ? new gn2(this, str, z) { // from class: c.n.b.d.j.a.wq

                /* JADX INFO: renamed from: a */
                public final C3002er f21296a;

                /* JADX INFO: renamed from: b */
                public final String f21297b;

                /* JADX INFO: renamed from: c */
                public final boolean f21298c;

                {
                    this.f21296a = this;
                    this.f21297b = str;
                    this.f21298c = z;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.gn2
                public final hn2 zza() {
                    C3002er c3002er = this.f21296a;
                    String str2 = this.f21297b;
                    boolean z2 = this.f21298c;
                    Objects.requireNonNull(c3002er);
                    C3002er c3002er2 = true != z2 ? null : c3002er;
                    C3667wp c3667wp2 = c3002er.f13657m;
                    C3408pq c3408pq = new C3408pq(str2, c3002er2, c3667wp2.f21285d, c3667wp2.f21286e, c3667wp2.f21289h);
                    c3002er.f13670z.add(new WeakReference<>(c3408pq));
                    return c3408pq;
                }
            } : new gn2(this, str, z) { // from class: c.n.b.d.j.a.xq

                /* JADX INFO: renamed from: a */
                public final C3002er f21653a;

                /* JADX INFO: renamed from: b */
                public final String f21654b;

                /* JADX INFO: renamed from: c */
                public final boolean f21655c;

                {
                    this.f21653a = this;
                    this.f21654b = str;
                    this.f21655c = z;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.gn2
                public final hn2 zza() {
                    C3002er c3002er = this.f21653a;
                    String str2 = this.f21654b;
                    boolean z2 = this.f21655c;
                    Objects.requireNonNull(c3002er);
                    C3002er c3002er2 = true != z2 ? null : c3002er;
                    C3667wp c3667wp2 = c3002er.f13657m;
                    return new ln2(str2, null, c3002er2, c3667wp2.f21285d, c3667wp2.f21286e, true, null);
                }
            };
            if (c3667wp.f21290i) {
                gn2Var3 = new gn2(this, gn2Var3) { // from class: c.n.b.d.j.a.yq

                    /* JADX INFO: renamed from: a */
                    public final C3002er f21972a;

                    /* JADX INFO: renamed from: b */
                    public final gn2 f21973b;

                    {
                        this.f21972a = this;
                        this.f21973b = gn2Var3;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gn2
                    public final hn2 zza() {
                        C3002er c3002er = this.f21972a;
                        return new C3519sq(c3002er.f13652h, this.f21973b.zza(), c3002er.f13666v, c3002er.f13667w, c3002er, new C2928cr(c3002er));
                    }
                };
            }
            ByteBuffer byteBuffer = this.f13659o;
            if (byteBuffer == null || byteBuffer.limit() <= 0) {
                gn2Var = gn2Var3;
            } else {
                final byte[] bArr = new byte[this.f13659o.limit()];
                this.f13659o.get(bArr);
                gn2Var2 = new gn2(gn2Var3, bArr) { // from class: c.n.b.d.j.a.zq

                    /* JADX INFO: renamed from: a */
                    public final gn2 f22384a;

                    /* JADX INFO: renamed from: b */
                    public final byte[] f22385b;

                    {
                        this.f22384a = gn2Var3;
                        this.f22385b = bArr;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gn2
                    public final hn2 zza() {
                        gn2 gn2Var4 = this.f22384a;
                        byte[] bArr2 = this.f22385b;
                        return new C3039fr(new fn2(bArr2), bArr2.length, gn2Var4.zza());
                    }
                };
            }
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14380k)).booleanValue()) {
                ej2Var = C2853ar.f12255a;
            } else {
                ej2Var = C2890br.f12786a;
            }
            ej2 ej2Var2 = ej2Var;
            C3667wp c3667wp2 = this.f13657m;
            return new xl2(uri, gn2Var, ej2Var2, c3667wp2.f21291j, C2267h1.f10713a, this, null, c3667wp2.f21287f);
        }
        final byte[] bArr2 = new byte[this.f13659o.limit()];
        this.f13659o.get(bArr2);
        gn2Var2 = new gn2(bArr2) { // from class: c.n.b.d.j.a.vq

            /* JADX INFO: renamed from: a */
            public final byte[] f20909a;

            {
                this.f20909a = bArr2;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.gn2
            public final hn2 zza() {
                return new fn2(this.f20909a);
            }
        };
        gn2Var = gn2Var2;
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14380k)).booleanValue()) {
            ej2Var = C2853ar.f12255a;
        } else {
            ej2Var = C2890br.f12786a;
        }
        ej2 ej2Var3 = ej2Var;
        C3667wp c3667wp3 = this.f13657m;
        return new xl2(uri, gn2Var, ej2Var3, c3667wp3.f21291j, C2267h1.f10713a, this, null, c3667wp3.f21287f);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m6670m() {
        return this.f13669y != null && this.f13669y.f19666m;
    }

    /* JADX INFO: renamed from: n */
    public final void m6671n(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        bm2 gm2Var;
        if (this.f13658n == null) {
            return;
        }
        this.f13659o = byteBuffer;
        this.f13660p = z;
        int length = uriArr.length;
        if (length == 1) {
            gm2Var = m6669l(uriArr[0], str);
        } else {
            bm2[] bm2VarArr = new bm2[length];
            for (int i = 0; i < uriArr.length; i++) {
                bm2VarArr[i] = m6669l(uriArr[i], str);
            }
            gm2Var = new gm2(bm2VarArr);
        }
        vg2 vg2Var = (vg2) this.f13658n;
        if (!vg2Var.f20779o.m7863f() || vg2Var.f20780p != null) {
            vg2Var.f20779o = nh2.f17107a;
            vg2Var.f20780p = null;
            Iterator<qg2> it = vg2Var.f20770f.iterator();
            while (it.hasNext()) {
                it.next().mo6664f(vg2Var.f20779o, vg2Var.f20780p);
            }
        }
        if (vg2Var.f20773i) {
            vg2Var.f20773i = false;
            vg2Var.f20781q = om2.f17681a;
            vg2Var.f20782r = vg2Var.f20767c;
            vg2Var.f20766b.mo6067b(null);
            Iterator<qg2> it2 = vg2Var.f20770f.iterator();
            while (it2.hasNext()) {
                it2.next().mo6662c(vg2Var.f20781q, vg2Var.f20782r);
            }
        }
        vg2Var.f20777m++;
        vg2Var.f20769e.f12150j.obtainMessage(0, 1, 0, gm2Var).sendToTarget();
        f13651g++;
    }

    /* JADX INFO: renamed from: o */
    public final void m6672o() {
        tg2 tg2Var = this.f13658n;
        if (tg2Var != null) {
            ((vg2) tg2Var).f20770f.remove(this);
            vg2 vg2Var = (vg2) this.f13658n;
            ah2 ah2Var = vg2Var.f20769e;
            synchronized (ah2Var) {
                if (!ah2Var.f12162v) {
                    ah2Var.f12150j.sendEmptyMessage(6);
                    while (!ah2Var.f12162v) {
                        try {
                            ah2Var.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    ah2Var.f12151k.quit();
                }
            }
            vg2Var.f20768d.removeCallbacksAndMessages(null);
            this.f13658n = null;
            f13651g--;
        }
    }

    /* JADX INFO: renamed from: p */
    public final long m6673p() {
        if (m6670m() && this.f13669y.f19667n) {
            return Math.min(this.f13663s, this.f13669y.f19669p);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: q */
    public final long m6674q() {
        if (m6670m()) {
            final C3519sq c3519sq = this.f13669y;
            if (c3519sq.f19664k == null) {
                return -1L;
            }
            if (c3519sq.f19671r.get() != -1) {
                return c3519sq.f19671r.get();
            }
            synchronized (c3519sq) {
                if (c3519sq.f19670q == null) {
                    c3519sq.f19670q = C2962do.f13330a.mo6691u0(new Callable(c3519sq) { // from class: c.n.b.d.j.a.qq

                        /* JADX INFO: renamed from: a */
                        public final C3519sq f18407a;

                        {
                            this.f18407a = c3519sq;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            long j2;
                            C3519sq c3519sq2 = this.f18407a;
                            Objects.requireNonNull(c3519sq2);
                            hr2 hr2Var = C2330u.f10884a.f10895j;
                            lr2 lr2Var = c3519sq2.f19664k;
                            synchronized (hr2Var.f14949b) {
                                j2 = -2;
                                if (hr2Var.f14952e != null) {
                                    if (hr2Var.f14950c.m7542C()) {
                                        try {
                                            nr2 nr2Var = hr2Var.f14952e;
                                            Parcel parcelM7001E0 = nr2Var.m7001E0();
                                            ig2.m7251b(parcelM7001E0, lr2Var);
                                            Parcel parcelM7003i1 = nr2Var.m7003i1(3, parcelM7001E0);
                                            long j3 = parcelM7003i1.readLong();
                                            parcelM7003i1.recycle();
                                            j2 = j3;
                                        } catch (RemoteException e) {
                                            C2622l.m5438t3("Unable to call into cache service.", e);
                                        }
                                    }
                                }
                            }
                            return Long.valueOf(j2);
                        }
                    });
                }
            }
            if (!c3519sq.f19670q.isDone()) {
                return -1L;
            }
            try {
                c3519sq.f19671r.compareAndSet(-1L, c3519sq.f19670q.get().longValue());
                return c3519sq.f19671r.get();
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        while (!this.f13668x.isEmpty()) {
            long j2 = this.f13665u;
            Map<String, List<String>> mapMo7592c = this.f13668x.remove(0).mo7592c();
            long j3 = 0;
            if (mapMo7592c != null) {
                for (Map.Entry<String, List<String>> entry : mapMo7592c.entrySet()) {
                    if (entry != null) {
                        try {
                            if (entry.getKey() != null) {
                                String key = entry.getKey();
                                boolean z = true;
                                if (key != "content-length") {
                                    if (14 != key.length()) {
                                        z = false;
                                        break;
                                    }
                                    for (int i = 0; i < 14; i++) {
                                        char cCharAt = "content-length".charAt(i);
                                        char cCharAt2 = key.charAt(i);
                                        if (cCharAt != cCharAt2) {
                                            char c2 = (char) ((cCharAt | ' ') - 97);
                                            if (c2 < 26 && c2 == ((char) ((cCharAt2 | ' ') - 97))) {
                                            }
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                                if (z && entry.getValue() != null && entry.getValue().get(0) != null) {
                                    j3 = Long.parseLong(entry.getValue().get(0));
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } catch (NumberFormatException unused2) {
                        }
                    }
                }
            }
            this.f13665u = j2 + j3;
        }
        return this.f13665u;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qg2
    /* JADX INFO: renamed from: t0 */
    public final void mo6675t0(boolean z) {
    }
}
