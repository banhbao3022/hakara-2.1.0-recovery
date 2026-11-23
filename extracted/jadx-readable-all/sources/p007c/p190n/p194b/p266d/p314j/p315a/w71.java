package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class w71 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final String f21014a;

    /* JADX INFO: renamed from: b */
    public final boolean f21015b;

    public w71(String str, boolean z) {
        this.f21014a = str;
        this.f21015b = z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5696d(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("gct", this.f21014a);
        if (this.f21015b) {
            bundle2.putString("de", "1");
        }
    }
}
