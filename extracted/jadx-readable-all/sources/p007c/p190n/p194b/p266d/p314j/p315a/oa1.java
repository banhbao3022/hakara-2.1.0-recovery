package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class oa1 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final boolean f17573a;

    /* JADX INFO: renamed from: b */
    public final boolean f17574b;

    /* JADX INFO: renamed from: c */
    public final String f17575c;

    /* JADX INFO: renamed from: d */
    public final boolean f17576d;

    /* JADX INFO: renamed from: e */
    public final boolean f17577e;

    /* JADX INFO: renamed from: f */
    public final boolean f17578f;

    /* JADX INFO: renamed from: g */
    public final String f17579g;

    /* JADX INFO: renamed from: h */
    public final ArrayList<String> f17580h;

    /* JADX INFO: renamed from: i */
    public final String f17581i;

    /* JADX INFO: renamed from: j */
    public final String f17582j;

    /* JADX INFO: renamed from: k */
    public final String f17583k;

    /* JADX INFO: renamed from: l */
    public final boolean f17584l;

    /* JADX INFO: renamed from: m */
    public final String f17585m;

    /* JADX INFO: renamed from: n */
    public final long f17586n;

    public oa1(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList<String> arrayList, String str3, String str4, String str5, boolean z6, String str6, long j2) {
        this.f17573a = z;
        this.f17574b = z2;
        this.f17575c = str;
        this.f17576d = z3;
        this.f17577e = z4;
        this.f17578f = z5;
        this.f17579g = str2;
        this.f17580h = arrayList;
        this.f17581i = str3;
        this.f17582j = str4;
        this.f17583k = str5;
        this.f17584l = z6;
        this.f17585m = str6;
        this.f17586n = j2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final void mo5696d(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("cog", this.f17573a);
        bundle2.putBoolean("coh", this.f17574b);
        bundle2.putString("gl", this.f17575c);
        bundle2.putBoolean("simulator", this.f17576d);
        bundle2.putBoolean("is_latchsky", this.f17577e);
        bundle2.putBoolean("is_sidewinder", this.f17578f);
        bundle2.putString("hl", this.f17579g);
        if (!this.f17580h.isEmpty()) {
            bundle2.putStringArrayList("hl_list", this.f17580h);
        }
        bundle2.putString("mv", this.f17581i);
        bundle2.putString("submodel", this.f17585m);
        Bundle bundle3 = bundle2.getBundle("device");
        if (bundle3 == null) {
            bundle3 = new Bundle();
        }
        bundle2.putBundle("device", bundle3);
        bundle3.putString("build", this.f17583k);
        bundle3.putLong("remaining_data_partition_space", this.f17586n);
        Bundle bundle4 = bundle3.getBundle("browser");
        if (bundle4 == null) {
            bundle4 = new Bundle();
        }
        bundle3.putBundle("browser", bundle4);
        bundle4.putBoolean("is_browser_custom_tabs_capable", this.f17584l);
        if (TextUtils.isEmpty(this.f17582j)) {
            return;
        }
        Bundle bundle5 = bundle3.getBundle("play_store");
        if (bundle5 == null) {
            bundle5 = new Bundle();
        }
        bundle3.putBundle("play_store", bundle5);
        bundle5.putString("package_version", this.f17582j);
    }
}
