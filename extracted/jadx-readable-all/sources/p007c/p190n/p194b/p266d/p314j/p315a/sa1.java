package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.text.TextUtils;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class sa1 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final String f19509a;

    /* JADX INFO: renamed from: b */
    public final int f19510b;

    /* JADX INFO: renamed from: c */
    public final int f19511c;

    /* JADX INFO: renamed from: d */
    public final int f19512d;

    /* JADX INFO: renamed from: e */
    public final boolean f19513e;

    /* JADX INFO: renamed from: f */
    public final int f19514f;

    public sa1(String str, int i, int i2, int i3, boolean z, int i4) {
        this.f19509a = str;
        this.f19510b = i;
        this.f19511c = i2;
        this.f19512d = i3;
        this.f19513e = z;
        this.f19514f = i4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final void mo5696d(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = this.f19509a;
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("carrier", str);
        }
        C2622l.m5442u2(bundle2, "cnt", Integer.valueOf(this.f19510b), this.f19510b != -2);
        bundle2.putInt("gnt", this.f19511c);
        bundle2.putInt("pt", this.f19512d);
        Bundle bundle3 = bundle2.getBundle("device");
        if (bundle3 == null) {
            bundle3 = new Bundle();
        }
        bundle2.putBundle("device", bundle3);
        Bundle bundle4 = bundle3.getBundle("network");
        if (bundle4 == null) {
            bundle4 = new Bundle();
        }
        bundle3.putBundle("network", bundle4);
        bundle4.putInt("active_network_state", this.f19514f);
        bundle4.putBoolean("active_network_metered", this.f19513e);
    }
}
