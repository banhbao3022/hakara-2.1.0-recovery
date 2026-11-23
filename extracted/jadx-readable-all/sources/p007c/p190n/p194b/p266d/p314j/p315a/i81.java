package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class i81 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final Bundle f15111a;

    public i81(Bundle bundle) {
        this.f15111a = bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5696d(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundleM5415p0 = C2622l.m5415p0(bundle2, "device");
        bundleM5415p0.putBundle("android_mem_info", this.f15111a);
        bundle2.putBundle("device", bundleM5415p0);
    }
}
