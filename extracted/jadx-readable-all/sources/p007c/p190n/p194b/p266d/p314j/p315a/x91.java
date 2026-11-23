package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class x91 implements ia1<y91> {

    /* JADX INFO: renamed from: a */
    public final lv1 f21470a;

    /* JADX INFO: renamed from: b */
    public final Context f21471b;

    /* JADX INFO: renamed from: c */
    public final C3702xn f21472c;

    public x91(lv1 lv1Var, Context context, C3702xn c3702xn) {
        this.f21470a = lv1Var;
        this.f21471b = context;
        this.f21472c = c3702xn;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<y91> zza() {
        return this.f21470a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.w91

            /* JADX INFO: renamed from: a */
            public final x91 f21023a;

            {
                this.f21023a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                x91 x91Var = this.f21023a;
                boolean zM5636d = C2794c.m5637a(x91Var.f21471b).m5636d();
                C2267h1 c2267h1 = C2330u.f10884a.f10889d;
                boolean zM4746e = C2267h1.m4746e(x91Var.f21471b);
                String str = x91Var.f21472c.f21615f;
                boolean zM4711r = C2253d.m4711r();
                ApplicationInfo applicationInfo = x91Var.f21471b.getApplicationInfo();
                return new y91(zM5636d, zM4746e, str, zM4711r, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.m12665b(x91Var.f21471b, ModuleDescriptor.MODULE_ID), DynamiteModule.m12664a(x91Var.f21471b, ModuleDescriptor.MODULE_ID));
            }
        });
    }
}
