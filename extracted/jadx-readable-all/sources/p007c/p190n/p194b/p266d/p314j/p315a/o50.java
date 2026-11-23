package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class o50 {

    /* JADX INFO: renamed from: a */
    public final yl1 f17531a;

    /* JADX INFO: renamed from: b */
    public final C3702xn f17532b;

    /* JADX INFO: renamed from: c */
    public final ApplicationInfo f17533c;

    /* JADX INFO: renamed from: d */
    public final String f17534d;

    /* JADX INFO: renamed from: e */
    public final List<String> f17535e;

    /* JADX INFO: renamed from: f */
    public final PackageInfo f17536f;

    /* JADX INFO: renamed from: g */
    public final vc2<kv1<String>> f17537g;

    /* JADX INFO: renamed from: h */
    public final String f17538h;

    /* JADX INFO: renamed from: i */
    public final ma1<Bundle> f17539i;

    public o50(yl1 yl1Var, C3702xn c3702xn, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, vc2<kv1<String>> vc2Var, InterfaceC2305w0 interfaceC2305w0, String str2, ma1<Bundle> ma1Var) {
        this.f17531a = yl1Var;
        this.f17532b = c3702xn;
        this.f17533c = applicationInfo;
        this.f17534d = str;
        this.f17535e = list;
        this.f17536f = packageInfo;
        this.f17537g = vc2Var;
        this.f17538h = str2;
        this.f17539i = ma1Var;
    }

    /* JADX INFO: renamed from: a */
    public final kv1<Bundle> m7963a() {
        yl1 yl1Var = this.f17531a;
        return C2622l.m5435t0(this.f17539i.m7679a(new Bundle()), rl1.SIGNALS, yl1Var).m8042f();
    }

    /* JADX INFO: renamed from: b */
    public final kv1<C3437qi> m7964b() {
        final kv1<Bundle> kv1VarM7963a = m7963a();
        return this.f17531a.m8126b(rl1.REQUEST_PARCEL, kv1VarM7963a, this.f17537g.m8545a()).m7143a(new Callable(this, kv1VarM7963a) { // from class: c.n.b.d.j.a.n50

            /* JADX INFO: renamed from: a */
            public final o50 f17025a;

            /* JADX INFO: renamed from: b */
            public final kv1 f17026b;

            {
                this.f17025a = this;
                this.f17026b = kv1VarM7963a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o50 o50Var = this.f17025a;
                kv1 kv1Var = this.f17026b;
                Objects.requireNonNull(o50Var);
                return new C3437qi((Bundle) kv1Var.get(), o50Var.f17532b, o50Var.f17533c, o50Var.f17534d, o50Var.f17535e, o50Var.f17536f, o50Var.f17537g.m8545a().get(), o50Var.f17538h, null, null);
            }
        }).m8042f();
    }
}
