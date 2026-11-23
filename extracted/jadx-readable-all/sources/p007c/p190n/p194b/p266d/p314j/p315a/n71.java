package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class n71 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final String f17035a;

    /* JADX INFO: renamed from: b */
    public final String f17036b;

    /* JADX INFO: renamed from: c */
    public final Bundle f17037c;

    public /* synthetic */ n71(String str, String str2, Bundle bundle) {
        this.f17035a = str;
        this.f17036b = str2;
        this.f17037c = bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5696d(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("consent_string", this.f17035a);
        bundle2.putString("fc_consent", this.f17036b);
        bundle2.putBundle("iab_consent_info", this.f17037c);
    }
}
