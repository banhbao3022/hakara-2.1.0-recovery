package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class i61 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final qw2 f15098a;

    /* JADX INFO: renamed from: b */
    public final C3702xn f15099b;

    /* JADX INFO: renamed from: c */
    public final boolean f15100c;

    public i61(qw2 qw2Var, C3702xn c3702xn, boolean z) {
        this.f15098a = qw2Var;
        this.f15099b = c3702xn;
        this.f15100c = z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final void mo5696d(Bundle bundle) {
        Bundle bundle2 = bundle;
        AbstractC3718y2<Integer> abstractC3718y2 = C3052g3.f14314a3;
        C2862b c2862b = C2862b.f12493a;
        if (this.f15099b.f21617h >= ((Integer) c2862b.f12496d.m6596a(abstractC3718y2)).intValue()) {
            bundle2.putString("app_open_version", "2");
        }
        if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14321b3)).booleanValue()) {
            bundle2.putBoolean("app_switched", this.f15100c);
        }
        qw2 qw2Var = this.f15098a;
        if (qw2Var != null) {
            int i = qw2Var.f18655f;
            if (i == 1) {
                bundle2.putString("avo", "p");
            } else if (i == 2) {
                bundle2.putString("avo", "l");
            }
        }
    }
}
