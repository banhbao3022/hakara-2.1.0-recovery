package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class a81 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final Boolean f12034a;

    public a81(Boolean bool) {
        this.f12034a = bool;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5696d(Bundle bundle) {
        Bundle bundle2 = bundle;
        Boolean bool = this.f12034a;
        if (bool != null) {
            bundle2.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
