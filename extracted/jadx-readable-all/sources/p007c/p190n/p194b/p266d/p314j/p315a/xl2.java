package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xl2 implements bm2, am2 {

    /* JADX INFO: renamed from: f */
    public final Uri f21598f;

    /* JADX INFO: renamed from: g */
    public final gn2 f21599g;

    /* JADX INFO: renamed from: h */
    public final ej2 f21600h;

    /* JADX INFO: renamed from: i */
    public final int f21601i;

    /* JADX INFO: renamed from: j */
    public final Handler f21602j;

    /* JADX INFO: renamed from: k */
    public final wl2 f21603k;

    /* JADX INFO: renamed from: l */
    public final lh2 f21604l = new lh2();

    /* JADX INFO: renamed from: m */
    public final int f21605m;

    /* JADX INFO: renamed from: n */
    public am2 f21606n;

    /* JADX INFO: renamed from: o */
    public nh2 f21607o;

    /* JADX INFO: renamed from: p */
    public boolean f21608p;

    public xl2(Uri uri, gn2 gn2Var, ej2 ej2Var, int i, Handler handler, wl2 wl2Var, String str, int i2) {
        this.f21598f = uri;
        this.f21599g = gn2Var;
        this.f21600h = ej2Var;
        this.f21601i = i;
        this.f21602j = handler;
        this.f21603k = wl2Var;
        this.f21605m = i2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bm2
    /* JADX INFO: renamed from: a */
    public final void mo6059a() throws IOException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bm2
    /* JADX INFO: renamed from: b */
    public final zl2 mo6060b(int i, kn2 kn2Var) {
        C2622l.m5366f1(i == 0);
        return new vl2(this.f21598f, this.f21599g.zza(), this.f21600h.zza(), this.f21601i, this.f21602j, this.f21603k, this, kn2Var, null, this.f21605m, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.am2
    /* JADX INFO: renamed from: c */
    public final void mo5793c(nh2 nh2Var, Object obj) {
        lh2 lh2Var = this.f21604l;
        nh2Var.mo7498d(0, lh2Var, false);
        boolean z = lh2Var.f16364c != -9223372036854775807L;
        if (!this.f21608p || z) {
            this.f21607o = nh2Var;
            this.f21608p = z;
            this.f21606n.mo5793c(nh2Var, null);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bm2
    /* JADX INFO: renamed from: d */
    public final void mo6061d(tg2 tg2Var, boolean z, am2 am2Var) {
        this.f21606n = am2Var;
        mm2 mm2Var = new mm2(-9223372036854775807L, false);
        this.f21607o = mm2Var;
        am2Var.mo5793c(mm2Var, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bm2
    /* JADX INFO: renamed from: e */
    public final void mo6062e() {
        this.f21606n = null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bm2
    /* JADX INFO: renamed from: f */
    public final void mo6063f(zl2 zl2Var) {
        vl2 vl2Var = (vl2) zl2Var;
        tl2 tl2Var = vl2Var.f20848n;
        un2 un2Var = vl2Var.f20847m;
        ql2 ql2Var = new ql2(vl2Var, tl2Var);
        rn2<? extends sn2> rn2Var = un2Var.f20382b;
        if (rn2Var != null) {
            rn2Var.m8301b(true);
        }
        un2Var.f20381a.execute(ql2Var);
        un2Var.f20381a.shutdown();
        vl2Var.f20852r.removeCallbacksAndMessages(null);
        vl2Var.f20838K = true;
    }
}
