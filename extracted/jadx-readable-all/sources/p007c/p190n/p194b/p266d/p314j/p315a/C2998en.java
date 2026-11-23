package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2311z0;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;

/* JADX INFO: renamed from: c.n.b.d.j.a.en */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2998en {

    /* JADX INFO: renamed from: a */
    public final Object f13612a = new Object();

    /* JADX INFO: renamed from: b */
    public final C2311z0 f13613b;

    /* JADX INFO: renamed from: c */
    public final C3146in f13614c;

    /* JADX INFO: renamed from: d */
    public boolean f13615d;

    /* JADX INFO: renamed from: e */
    public Context f13616e;

    /* JADX INFO: renamed from: f */
    public C3702xn f13617f;

    /* JADX INFO: renamed from: g */
    public C3163j3 f13618g;

    /* JADX INFO: renamed from: h */
    public Boolean f13619h;

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f13620i;

    /* JADX INFO: renamed from: j */
    public final C2961dn f13621j;

    /* JADX INFO: renamed from: k */
    public final Object f13622k;

    /* JADX INFO: renamed from: l */
    public kv1<ArrayList<String>> f13623l;

    public C2998en() {
        C2311z0 c2311z0 = new C2311z0();
        this.f13613b = c2311z0;
        this.f13614c = new C3146in(gx2.f14692a.f14695d, c2311z0);
        this.f13615d = false;
        this.f13618g = null;
        this.f13619h = null;
        this.f13620i = new AtomicInteger(0);
        this.f13621j = new C2961dn(null);
        this.f13622k = new Object();
    }

    /* JADX INFO: renamed from: a */
    public final C3163j3 m6644a() {
        C3163j3 c3163j3;
        synchronized (this.f13612a) {
            c3163j3 = this.f13618g;
        }
        return c3163j3;
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: b */
    public final void m6645b(Context context, C3702xn c3702xn) {
        C3163j3 c3163j3;
        synchronized (this.f13612a) {
            if (!this.f13615d) {
                this.f13616e = context.getApplicationContext();
                this.f13617f = c3702xn;
                C2330u.f10884a.f10892g.m6422b(this.f13614c);
                this.f13613b.m4833c(this.f13616e);
                C3696xh.m8734c(this.f13616e, this.f13617f);
                if (C3201k4.f15881c.m6603d().booleanValue()) {
                    c3163j3 = new C3163j3();
                } else {
                    C2096e.m4590z("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    c3163j3 = null;
                }
                this.f13618g = c3163j3;
                if (c3163j3 != null) {
                    C2622l.m5320V0(new C2924cn(this).m4707b(), "AppState.registerCsiReporter");
                }
                this.f13615d = true;
                m6650g();
            }
        }
        C2330u.f10884a.f10889d.m4766B(context, c3702xn.f21615f);
    }

    /* JADX INFO: renamed from: c */
    public final Resources m6646c() {
        if (this.f13617f.f21618i) {
            return this.f13616e.getResources();
        }
        try {
            try {
                DynamiteModule.m12666d(this.f13616e, DynamiteModule.f28674a, ModuleDescriptor.MODULE_ID).f28686m.getResources();
                return null;
            } catch (Exception e) {
                throw new C3628vn(e);
            }
        } catch (C3628vn e2) {
            C2622l.m5241D3("Cannot load resource from dynamite apk or local jar", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6647d(Throwable th, String str) {
        C3696xh.m8734c(this.f13616e, this.f13617f).mo8736b(th, str);
    }

    /* JADX INFO: renamed from: e */
    public final void m6648e(Throwable th, String str) {
        C3696xh.m8734c(this.f13616e, this.f13617f).mo8735a(th, str, C3646w4.f20991g.m6603d().floatValue());
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC2305w0 m6649f() {
        C2311z0 c2311z0;
        synchronized (this.f13612a) {
            c2311z0 = this.f13613b;
        }
        return c2311z0;
    }

    /* JADX INFO: renamed from: g */
    public final kv1<ArrayList<String>> m6650g() {
        if (this.f13616e != null) {
            if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14480y1)).booleanValue()) {
                synchronized (this.f13622k) {
                    kv1<ArrayList<String>> kv1Var = this.f13623l;
                    if (kv1Var != null) {
                        return kv1Var;
                    }
                    kv1<ArrayList<String>> kv1VarMo6691u0 = C2962do.f13330a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.bn

                        /* JADX INFO: renamed from: a */
                        public final C2998en f12746a;

                        {
                            this.f12746a = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Context contextM6634a = C2994ej.m6634a(this.f12746a.f13616e);
                            ArrayList arrayList = new ArrayList();
                            try {
                                PackageInfo packageInfoM5635c = C2794c.m5637a(contextM6634a).m5635c(contextM6634a.getApplicationInfo().packageName, 4096);
                                if (packageInfoM5635c.requestedPermissions != null && packageInfoM5635c.requestedPermissionsFlags != null) {
                                    int i = 0;
                                    while (true) {
                                        String[] strArr = packageInfoM5635c.requestedPermissions;
                                        if (i >= strArr.length) {
                                            break;
                                        }
                                        if ((packageInfoM5635c.requestedPermissionsFlags[i] & 2) != 0) {
                                            arrayList.add(strArr[i]);
                                        }
                                        i++;
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                            return arrayList;
                        }
                    });
                    this.f13623l = kv1VarMo6691u0;
                    return kv1VarMo6691u0;
                }
            }
        }
        return cw0.m6231a(new ArrayList());
    }
}
