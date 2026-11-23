package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: c.n.b.d.k.b.s6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4665s6 implements InterfaceC4745z9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C4500e6 f24429a;

    public C4665s6(C4500e6 c4500e6) {
        this.f24429a = c4500e6;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4745z9
    /* JADX INFO: renamed from: F */
    public final void mo10723F(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f24429a.m10517H("auto", "_err", bundle);
        } else {
            this.f24429a.f24476a.m10831g();
            throw null;
        }
    }
}
