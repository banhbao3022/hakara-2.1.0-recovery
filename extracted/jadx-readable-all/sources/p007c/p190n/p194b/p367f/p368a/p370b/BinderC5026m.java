package p007c.p190n.p194b.p367f.p368a.p370b;

import android.os.Bundle;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.b.m */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC5026m extends BinderC5010i<Void> {

    /* JADX INFO: renamed from: h */
    public final int f25870h;

    /* JADX INFO: renamed from: i */
    public final String f25871i;

    /* JADX INFO: renamed from: j */
    public final int f25872j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C5030n f25873k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC5026m(C5030n c5030n, C5151o<Void> c5151o, int i, String str, int i2) {
        super(c5030n, c5151o);
        this.f25873k = c5030n;
        this.f25870h = i;
        this.f25871i = str;
        this.f25872j = i2;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.BinderC5010i, p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5110p0
    /* JADX INFO: renamed from: s5 */
    public final void mo11453s5(Bundle bundle) {
        this.f25873k.f25881e.m11549b();
        C5030n.f25877a.m11533b(6, "onError(%d), retrying notifyModuleCompleted...", new Object[]{Integer.valueOf(bundle.getInt("error_code"))});
        int i = this.f25872j;
        if (i > 0) {
            this.f25873k.m11464k(this.f25870h, this.f25871i, i - 1);
        }
    }
}
