package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class it0 implements z80 {

    /* JADX INFO: renamed from: f */
    public final Context f15378f;

    /* JADX INFO: renamed from: g */
    public final C2885bm f15379g;

    public it0(Context context, C2885bm c2885bm) {
        this.f15378f = context;
        this.f15379g = c2885bm;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.z80
    /* JADX INFO: renamed from: Q */
    public final void mo6214Q(di1 di1Var) {
        if (TextUtils.isEmpty(di1Var.f13281b.f12695b.f20320d)) {
            return;
        }
        C2885bm c2885bm = this.f15379g;
        Context context = this.f15378f;
        ew2 ew2Var = di1Var.f13280a.f22289a.f15191d;
        Objects.requireNonNull(c2885bm);
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14339e0)).booleanValue() && c2885bm.m6048f(context) && C2885bm.m6042m(context)) {
            synchronized (c2885bm.f12743l) {
            }
        }
        this.f15379g.m6055n(this.f15378f, "_aq", di1Var.f13281b.f12695b.f20320d, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.z80
    /* JADX INFO: renamed from: m */
    public final void mo6215m(C3437qi c3437qi) {
    }
}
