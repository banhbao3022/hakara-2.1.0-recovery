package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p267a.p279w.C2198a;
import p007c.p190n.p194b.p266d.p267a.p279w.C2202e;
import p007c.p190n.p194b.p266d.p267a.p279w.C2204g;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ii1 {

    /* JADX INFO: renamed from: a */
    public final C3310n2 f15188a;

    /* JADX INFO: renamed from: b */
    public final C3170ja f15189b;

    /* JADX INFO: renamed from: c */
    public final h41 f15190c;

    /* JADX INFO: renamed from: d */
    public final ew2 f15191d;

    /* JADX INFO: renamed from: e */
    public final jw2 f15192e;

    /* JADX INFO: renamed from: f */
    public final String f15193f;

    /* JADX INFO: renamed from: g */
    public final ArrayList<String> f15194g;

    /* JADX INFO: renamed from: h */
    public final ArrayList<String> f15195h;

    /* JADX INFO: renamed from: i */
    public final C3165j5 f15196i;

    /* JADX INFO: renamed from: j */
    public final qw2 f15197j;

    /* JADX INFO: renamed from: k */
    public final int f15198k;

    /* JADX INFO: renamed from: l */
    public final C2198a f15199l;

    /* JADX INFO: renamed from: m */
    public final C2204g f15200m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC2863b0 f15201n;

    /* JADX INFO: renamed from: o */
    public final yh1 f15202o;

    /* JADX INFO: renamed from: p */
    public final boolean f15203p;

    /* JADX INFO: renamed from: q */
    public final C3012f0 f15204q;

    public ii1(hi1 hi1Var) {
        this.f15192e = hi1Var.f14856b;
        this.f15193f = hi1Var.f14857c;
        this.f15204q = hi1Var.f14872r;
        ew2 ew2Var = hi1Var.f14855a;
        this.f15191d = new ew2(ew2Var.f13713f, ew2Var.f13714g, ew2Var.f13715h, ew2Var.f13716i, ew2Var.f13717j, ew2Var.f13718k, ew2Var.f13719l, ew2Var.f13720m || hi1Var.f14859e, ew2Var.f13721n, ew2Var.f13722o, ew2Var.f13723p, ew2Var.f13724q, ew2Var.f13725r, ew2Var.f13726s, ew2Var.f13727t, ew2Var.f13728u, ew2Var.f13729v, ew2Var.f13730w, ew2Var.f13731x, ew2Var.f13732y, ew2Var.f13733z, ew2Var.f13711A, C2267h1.m4761v(ew2Var.f13712B));
        C3310n2 c3310n2 = hi1Var.f14858d;
        C3165j5 c3165j5 = null;
        if (c3310n2 == null) {
            C3165j5 c3165j6 = hi1Var.f14862h;
            c3310n2 = c3165j6 != null ? c3165j6.f15480k : null;
        }
        this.f15188a = c3310n2;
        ArrayList<String> arrayList = hi1Var.f14860f;
        this.f15194g = arrayList;
        this.f15195h = hi1Var.f14861g;
        if (arrayList != null && (c3165j5 = hi1Var.f14862h) == null) {
            c3165j5 = new C3165j5(new C2202e(new C2202e.a()));
        }
        this.f15196i = c3165j5;
        this.f15197j = hi1Var.f14863i;
        this.f15198k = hi1Var.f14867m;
        this.f15199l = hi1Var.f14864j;
        this.f15200m = hi1Var.f14865k;
        this.f15201n = hi1Var.f14866l;
        this.f15189b = hi1Var.f14868n;
        this.f15202o = new yh1(hi1Var.f14869o);
        this.f15203p = hi1Var.f14870p;
        this.f15190c = hi1Var.f14871q;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2908c7 m7255a() {
        C2204g c2204g = this.f15200m;
        if (c2204g == null && this.f15199l == null) {
            return null;
        }
        if (c2204g != null) {
            IBinder iBinder = c2204g.f10614h;
            if (iBinder == null) {
                return null;
            }
            int i = AbstractBinderC2870b7.f12534f;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
            return iInterfaceQueryLocalInterface instanceof InterfaceC2908c7 ? (InterfaceC2908c7) iInterfaceQueryLocalInterface : new C2833a7(iBinder);
        }
        IBinder iBinder2 = this.f15199l.f10597g;
        if (iBinder2 == null) {
            return null;
        }
        int i2 = AbstractBinderC2870b7.f12534f;
        IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterfaceQueryLocalInterface2 instanceof InterfaceC2908c7 ? (InterfaceC2908c7) iInterfaceQueryLocalInterface2 : new C2833a7(iBinder2);
    }
}
