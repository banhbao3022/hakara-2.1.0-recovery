package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class x61 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final double f21439a;

    /* JADX INFO: renamed from: b */
    public final boolean f21440b;

    public x61(double d, boolean z) {
        this.f21439a = d;
        this.f21440b = z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final void mo5696d(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundleM5415p0 = C2622l.m5415p0(bundle2, "device");
        bundle2.putBundle("device", bundleM5415p0);
        Bundle bundle3 = bundleM5415p0.getBundle("battery");
        if (bundle3 == null) {
            bundle3 = new Bundle();
        }
        bundleM5415p0.putBundle("battery", bundle3);
        bundle3.putBoolean("is_charging", this.f21440b);
        bundle3.putDouble("battery_level", this.f21439a);
    }
}
