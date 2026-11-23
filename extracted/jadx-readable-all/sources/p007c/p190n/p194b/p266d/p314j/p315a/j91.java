package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class j91 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final String f15510a;

    /* JADX INFO: renamed from: b */
    public final String f15511b;

    public j91(String str, String str2) {
        this.f15510a = str;
        this.f15511b = str2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final void mo5696d(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14455u4)).booleanValue()) {
            bundle2.putString("request_id", this.f15511b);
        } else {
            bundle2.putString("request_id", this.f15510a);
        }
    }
}
