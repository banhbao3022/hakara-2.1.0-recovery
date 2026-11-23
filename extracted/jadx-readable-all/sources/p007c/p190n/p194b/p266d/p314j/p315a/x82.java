package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p007c.p190n.p194b.p266d.p267a.p280x.C2211a;
import p007c.p190n.p194b.p266d.p298f.C2612g;
import p007c.p190n.p194b.p266d.p298f.C2614h;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.C4778g0;
import p007c.p190n.p194b.p266d.p333n.C4795w;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4773e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class x82 implements tb2 {

    /* JADX INFO: renamed from: f */
    public static x82 f21454f;

    /* JADX INFO: renamed from: g */
    public final Context f21455g;

    /* JADX INFO: renamed from: h */
    public final br1 f21456h;

    /* JADX INFO: renamed from: i */
    public final gr1 f21457i;

    /* JADX INFO: renamed from: j */
    public final ir1 f21458j;

    /* JADX INFO: renamed from: k */
    public final ie2 f21459k;

    /* JADX INFO: renamed from: l */
    public final np1 f21460l;

    /* JADX INFO: renamed from: m */
    public final Executor f21461m;

    /* JADX INFO: renamed from: n */
    public final zf2 f21462n;

    /* JADX INFO: renamed from: o */
    public final c72 f21463o;

    /* JADX INFO: renamed from: r */
    public volatile boolean f21466r;

    /* JADX INFO: renamed from: p */
    public volatile long f21464p = 0;

    /* JADX INFO: renamed from: q */
    public final Object f21465q = new Object();

    /* JADX INFO: renamed from: s */
    public volatile boolean f21467s = false;

    public x82(Context context, np1 np1Var, br1 br1Var, gr1 gr1Var, ir1 ir1Var, ie2 ie2Var, Executor executor, jp1 jp1Var, zf2 zf2Var) {
        this.f21455g = context;
        this.f21460l = np1Var;
        this.f21456h = br1Var;
        this.f21457i = gr1Var;
        this.f21458j = ir1Var;
        this.f21459k = ie2Var;
        this.f21461m = executor;
        this.f21462n = zf2Var;
        this.f21463o = new c72(jp1Var);
    }

    /* JADX INFO: renamed from: h */
    public static synchronized x82 m8724h(String str, Context context, boolean z, boolean z2) {
        if (f21454f == null) {
            qp1 qp1Var = new qp1();
            qp1Var.m8222a(false);
            qp1Var.f18405c = Boolean.TRUE;
            Objects.requireNonNull(str, "Null clientVersion");
            qp1Var.f18403a = str;
            qp1Var.f18404b = Boolean.valueOf(z);
            pp1 pp1VarM8223b = qp1Var.m8223b();
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
            x82 x82VarM8726l = m8726l(context, np1.m7912a(context, executorServiceNewCachedThreadPool, z2), pp1VarM8223b, executorServiceNewCachedThreadPool);
            f21454f = x82VarM8726l;
            x82VarM8726l.m8727i();
            f21454f.m8728j();
        }
        return f21454f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
    
        if (r4.m6178v().m6811x().equals(r5.m6811x()) != false) goto L45;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m8725k(p007c.p190n.p194b.p266d.p314j.p315a.x82 r11) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p266d.p314j.p315a.x82.m8725k(c.n.b.d.j.a.x82):void");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: l */
    public static x82 m8726l(Context context, np1 np1Var, pp1 pp1Var, Executor executor) {
        final cq1 cq1Var = new cq1(context, executor, np1Var, pp1Var, new zp1(), new aq1());
        if (pp1Var.mo8145b()) {
            AbstractC4781i<f31> abstractC4781iM10206c = C4340s8.m10206c(executor, new Callable(cq1Var) { // from class: c.n.b.d.j.a.wp1

                /* JADX INFO: renamed from: a */
                public final cq1 f21294a;

                {
                    this.f21294a = cq1Var;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() throws C2612g, C2614h, IOException {
                    Context context2 = this.f21294a.f13082a;
                    go0 go0VarM6750r0 = f31.m6750r0();
                    C2211a c2211a = new C2211a(context2);
                    c2211a.m4663h(true);
                    C2211a.a aVarM4661c = c2211a.m4661c();
                    String strEncodeToString = aVarM4661c.f10624a;
                    if (strEncodeToString != null && strEncodeToString.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                        UUID uuidFromString = UUID.fromString(strEncodeToString);
                        byte[] bArr = new byte[16];
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                        byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                        byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                        strEncodeToString = Base64.encodeToString(bArr, 11);
                    }
                    if (strEncodeToString != null) {
                        go0VarM6750r0.m7008s(strEncodeToString);
                        boolean z = aVarM4661c.f10625b;
                        if (go0VarM6750r0.f13191h) {
                            go0VarM6750r0.m6298m();
                            go0VarM6750r0.f13191h = false;
                        }
                        f31.m6747i0((f31) go0VarM6750r0.f13190g, z);
                        eu0 eu0Var = eu0.DEVICE_IDENTIFIER_ANDROID_AD_ID;
                        if (go0VarM6750r0.f13191h) {
                            go0VarM6750r0.m6298m();
                            go0VarM6750r0.f13191h = false;
                        }
                        f31.m6746h0((f31) go0VarM6750r0.f13190g, eu0Var);
                    }
                    return go0VarM6750r0.m6300o();
                }
            });
            C4778g0 c4778g0 = (C4778g0) abstractC4781iM10206c;
            c4778g0.f24676b.m10927b(new C4795w(executor, new InterfaceC4773e(cq1Var) { // from class: c.n.b.d.j.a.yp1

                /* JADX INFO: renamed from: a */
                public final cq1 f21968a;

                {
                    this.f21968a = cq1Var;
                }

                @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4773e
                /* JADX INFO: renamed from: c */
                public final void mo8822c(Exception exc) {
                    cq1 cq1Var2 = this.f21968a;
                    Objects.requireNonNull(cq1Var2);
                    if (exc instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    cq1Var2.f13084c.m7914c(2025, -1L, exc);
                }
            }));
            c4778g0.m10946s();
            cq1Var.f13088g = abstractC4781iM10206c;
        } else {
            cq1Var.f13088g = C4340s8.m10208e(zp1.f22382a);
        }
        AbstractC4781i<f31> abstractC4781iM10206c2 = C4340s8.m10206c(executor, new Callable(cq1Var) { // from class: c.n.b.d.j.a.xp1

            /* JADX INFO: renamed from: a */
            public final cq1 f21635a;

            {
                this.f21635a = cq1Var;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() throws PackageManager.NameNotFoundException {
                Context context2 = this.f21635a.f13082a;
                return C2622l.m5430s0(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
            }
        });
        C4778g0 c4778g1 = (C4778g0) abstractC4781iM10206c2;
        c4778g1.f24676b.m10927b(new C4795w(executor, new InterfaceC4773e(cq1Var) { // from class: c.n.b.d.j.a.yp1

            /* JADX INFO: renamed from: a */
            public final cq1 f21968a;

            {
                this.f21968a = cq1Var;
            }

            @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4773e
            /* JADX INFO: renamed from: c */
            public final void mo8822c(Exception exc) {
                cq1 cq1Var2 = this.f21968a;
                Objects.requireNonNull(cq1Var2);
                if (exc instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                cq1Var2.f13084c.m7914c(2025, -1L, exc);
            }
        }));
        c4778g1.m10946s();
        cq1Var.f13089h = abstractC4781iM10206c2;
        he2 he2Var = new he2(context);
        ie2 ie2Var = new ie2(pp1Var, cq1Var, new ve2(context, he2Var), he2Var);
        zf2 zf2VarM5269J1 = C2622l.m5269J1(context, np1Var);
        jp1 jp1Var = new jp1();
        return new x82(context, np1Var, new br1(context, zf2VarM5269J1), new gr1(context, zf2VarM5269J1, new e62(np1Var), ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14382k1)).booleanValue()), new ir1(context, ie2Var, np1Var, jp1Var), ie2Var, executor, jp1Var, zf2VarM5269J1);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb2
    /* JADX INFO: renamed from: a */
    public final void mo4852a(MotionEvent motionEvent) {
        zq1 zq1VarM7291b = this.f21458j.m7291b();
        if (zq1VarM7291b != null) {
            try {
                zq1VarM7291b.m8900a(null, motionEvent);
            } catch (hr1 e) {
                this.f21460l.m7914c(e.f14947f, -1L, e);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb2
    /* JADX INFO: renamed from: b */
    public final String mo4853b(Context context, View view, Activity activity) {
        String strM8899e;
        m8728j();
        zq1 zq1VarM7291b = this.f21458j.m7291b();
        if (zq1VarM7291b == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zq1VarM7291b) {
            Map<String, Object> mapM7247b = ((ie2) zq1VarM7291b.f22388c).m7247b();
            HashMap map = (HashMap) mapM7247b;
            map.put("f", "v");
            map.put("ctx", context);
            map.put("aid", null);
            map.put("view", view);
            map.put("act", null);
            strM8899e = zq1.m8899e(zq1VarM7291b.m8904f(null, mapM7247b));
        }
        this.f21460l.m7915d(5002, System.currentTimeMillis() - jCurrentTimeMillis, strM8899e);
        return strM8899e;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb2
    /* JADX INFO: renamed from: c */
    public final String mo4854c(Context context, String str, View view, Activity activity) {
        String strM8899e;
        m8728j();
        zq1 zq1VarM7291b = this.f21458j.m7291b();
        if (zq1VarM7291b == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zq1VarM7291b) {
            ie2 ie2Var = (ie2) zq1VarM7291b.f22388c;
            Map<String, Object> mapM7247b = ie2Var.m7247b();
            ((HashMap) mapM7247b).put("lts", Long.valueOf(ie2Var.f15176c.m8548c()));
            HashMap map = (HashMap) mapM7247b;
            map.put("f", "c");
            map.put("ctx", context);
            map.put("cs", str);
            map.put("aid", null);
            map.put("view", view);
            map.put("act", activity);
            strM8899e = zq1.m8899e(zq1VarM7291b.m8904f(null, mapM7247b));
        }
        this.f21460l.m7915d(5000, System.currentTimeMillis() - jCurrentTimeMillis, strM8899e);
        return strM8899e;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb2
    /* JADX INFO: renamed from: d */
    public final void mo4855d(int i, int i2, int i3) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb2
    /* JADX INFO: renamed from: e */
    public final String mo4856e(Context context, String str, View view) {
        return mo4854c(context, str, view, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb2
    /* JADX INFO: renamed from: f */
    public final String mo4857f(Context context) {
        String strM8899e;
        m8728j();
        zq1 zq1VarM7291b = this.f21458j.m7291b();
        if (zq1VarM7291b == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zq1VarM7291b) {
            Map<String, Object> mapM7246a = ((ie2) zq1VarM7291b.f22388c).m7246a();
            HashMap map = (HashMap) mapM7246a;
            map.put("f", "q");
            map.put("ctx", context);
            map.put("aid", null);
            strM8899e = zq1.m8899e(zq1VarM7291b.m8904f(null, mapM7246a));
        }
        this.f21460l.m7915d(5001, System.currentTimeMillis() - jCurrentTimeMillis, strM8899e);
        return strM8899e;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb2
    /* JADX INFO: renamed from: g */
    public final void mo4858g(View view) {
        this.f21459k.f15176c.m8546a(view);
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m8727i() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ar1 ar1VarM8729m = m8729m(1);
        if (ar1VarM8729m == null) {
            this.f21460l.m7913b(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f21458j.m7290a(ar1VarM8729m)) {
            this.f21467s = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0043 A[Catch: all -> 0x005c, TryCatch #1 {, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x001b, B:12:0x001d, B:13:0x0021, B:22:0x002e, B:27:0x0043, B:30:0x004c, B:34:0x0059, B:35:0x005a, B:14:0x0022, B:16:0x0026, B:17:0x0028, B:19:0x002a), top: B:42:0x0007, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #1 {, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x001b, B:12:0x001d, B:13:0x0021, B:22:0x002e, B:27:0x0043, B:30:0x004c, B:34:0x0059, B:35:0x005a, B:14:0x0022, B:16:0x0026, B:17:0x0028, B:19:0x002a), top: B:42:0x0007, inners: #0 }] */
    /* JADX INFO: renamed from: j */
    public final void m8728j() {
        ar1 ar1Var;
        if (this.f21466r) {
            return;
        }
        synchronized (this.f21465q) {
            if (!this.f21466r) {
                if ((System.currentTimeMillis() / 1000) - this.f21464p < 3600) {
                    return;
                }
                ir1 ir1Var = this.f21458j;
                synchronized (ir1Var.f15366g) {
                    zq1 zq1Var = ir1Var.f15365f;
                    ar1Var = zq1Var != null ? zq1Var.f22387b : null;
                }
                if (ar1Var != null) {
                    if (ar1Var.f12256a.m6812y() - (System.currentTimeMillis() / 1000) < 3600) {
                        if (!C2622l.m5396l1(this.f21462n)) {
                            this.f21461m.execute(new z72(this));
                        }
                    }
                } else if (!C2622l.m5396l1(this.f21462n)) {
                    this.f21461m.execute(new z72(this));
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final ar1 m8729m(int i) {
        ar1 ar1Var = null;
        if (!C2622l.m5396l1(this.f21462n)) {
            return null;
        }
        if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14368i1)).booleanValue()) {
            br1 br1Var = this.f21456h;
            fg2 fg2VarM6083b = br1Var.m6083b(1);
            if (fg2VarM6083b == null) {
                return null;
            }
            String strM6810v = fg2VarM6083b.m6810v();
            File fileM5228B0 = C2622l.m5228B0(strM6810v, "pcam.jar", br1Var.m6084c());
            if (!fileM5228B0.exists()) {
                fileM5228B0 = C2622l.m5228B0(strM6810v, "pcam", br1Var.m6084c());
            }
            return new ar1(fg2VarM6083b, fileM5228B0, C2622l.m5228B0(strM6810v, "pcbc", br1Var.m6084c()), C2622l.m5228B0(strM6810v, "pcopt", br1Var.m6084c()));
        }
        gr1 gr1Var = this.f21457i;
        Objects.requireNonNull(gr1Var);
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (gr1.f14650a) {
            fg2 fg2VarM7027h = gr1Var.m7027h(1);
            if (fg2VarM7027h == null) {
                gr1Var.m7026g(4022, jCurrentTimeMillis);
            } else {
                File fileM7023c = gr1Var.m7023c(fg2VarM7027h.m6810v());
                File file = new File(fileM7023c, "pcam.jar");
                if (!file.exists()) {
                    file = new File(fileM7023c, "pcam");
                }
                File file2 = new File(fileM7023c, "pcbc");
                File file3 = new File(fileM7023c, "pcopt");
                gr1Var.m7026g(5016, jCurrentTimeMillis);
                ar1Var = new ar1(fg2VarM7027h, file, file2, file3);
            }
        }
        return ar1Var;
    }
}
