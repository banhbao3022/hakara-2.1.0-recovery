package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class x81 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final String f21453a;

    public x81(String str) {
        this.f21453a = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final void mo5696d(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = this.f21453a;
        if (str != null) {
            bundle2.putString("omid_v", str);
        }
    }
}
