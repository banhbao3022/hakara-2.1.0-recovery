package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: c.n.b.d.k.b.q9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4646q9 implements InterfaceC4745z9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C4611n9 f24295a;

    public C4646q9(C4611n9 c4611n9) {
        this.f24295a = c4611n9;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4745z9
    /* JADX INFO: renamed from: F */
    public final void mo10723F(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f24295a.f24201k.mo10684l().f24418f.m10811a("AppId not known when logging error event");
        } else {
            this.f24295a.mo10686n().m10758v(new RunnableC4668s9(this, str, bundle));
        }
    }
}
