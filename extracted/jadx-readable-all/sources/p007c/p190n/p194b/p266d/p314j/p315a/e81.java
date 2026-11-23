package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class e81 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final String f13529a;

    public e81(String str) {
        this.f13529a = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5696d(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.f13529a.isEmpty()) {
            return;
        }
        bundle2.putString("inspector_extras", this.f13529a);
    }
}
