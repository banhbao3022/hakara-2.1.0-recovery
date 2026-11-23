package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class m81 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final qh1 f16698a;

    public m81(qh1 qh1Var) {
        this.f16698a = qh1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final void mo5696d(Bundle bundle) {
        boolean z;
        boolean z2;
        Bundle bundle2 = bundle;
        qh1 qh1Var = this.f16698a;
        if (qh1Var != null) {
            synchronized (qh1Var.f18292b) {
                qh1Var.m8203a();
                z = true;
                z2 = qh1Var.f18294d == 2;
            }
            bundle2.putBoolean("render_in_browser", z2);
            qh1 qh1Var2 = this.f16698a;
            synchronized (qh1Var2.f18292b) {
                qh1Var2.m8203a();
                if (qh1Var2.f18294d != 3) {
                    z = false;
                }
            }
            bundle2.putBoolean("disable_ml", z);
        }
    }
}
