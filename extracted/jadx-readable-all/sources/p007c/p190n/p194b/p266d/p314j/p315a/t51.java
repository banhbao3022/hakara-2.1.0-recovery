package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class t51 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final jw2 f19771a;

    /* JADX INFO: renamed from: b */
    public final String f19772b;

    /* JADX INFO: renamed from: c */
    public final boolean f19773c;

    /* JADX INFO: renamed from: d */
    public final String f19774d;

    /* JADX INFO: renamed from: e */
    public final float f19775e;

    /* JADX INFO: renamed from: f */
    public final int f19776f;

    /* JADX INFO: renamed from: g */
    public final int f19777g;

    /* JADX INFO: renamed from: h */
    public final String f19778h;

    /* JADX INFO: renamed from: i */
    public final boolean f19779i;

    public t51(jw2 jw2Var, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        C2622l.m5379i(jw2Var, "the adSize must not be null");
        this.f19771a = jw2Var;
        this.f19772b = str;
        this.f19773c = z;
        this.f19774d = str2;
        this.f19775e = f;
        this.f19776f = i;
        this.f19777g = i2;
        this.f19778h = str3;
        this.f19779i = z2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final void mo5696d(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.f19771a.f15839j == -1) {
            bundle2.putString("smart_w", "full");
        }
        if (this.f19771a.f15836g == -2) {
            bundle2.putString("smart_h", "auto");
        }
        Boolean bool = Boolean.TRUE;
        C2622l.m5310S2(bundle2, "ene", bool, this.f19771a.f15844o);
        if (this.f19771a.f15847r) {
            bundle2.putString("rafmt", "102");
        }
        if (this.f19771a.f15848s) {
            bundle2.putString("rafmt", "103");
        }
        if (this.f19771a.f15849t) {
            bundle2.putString("rafmt", "105");
        }
        C2622l.m5310S2(bundle2, "inline_adaptive_slot", bool, this.f19779i);
        C2622l.m5310S2(bundle2, "interscroller_slot", bool, this.f19771a.f15849t);
        String str = this.f19772b;
        if (str != null) {
            bundle2.putString("format", str);
        }
        if (this.f19773c) {
            bundle2.putString("fluid", "height");
        }
        String str2 = this.f19774d;
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("sz", str2);
        }
        bundle2.putFloat("u_sd", this.f19775e);
        bundle2.putInt("sw", this.f19776f);
        bundle2.putInt("sh", this.f19777g);
        String str3 = this.f19778h;
        if (true ^ TextUtils.isEmpty(str3)) {
            bundle2.putString("sc", str3);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        jw2[] jw2VarArr = this.f19771a.f15841l;
        if (jw2VarArr == null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("height", this.f19771a.f15836g);
            bundle3.putInt("width", this.f19771a.f15839j);
            bundle3.putBoolean("is_fluid_height", this.f19771a.f15843n);
            arrayList.add(bundle3);
        } else {
            for (jw2 jw2Var : jw2VarArr) {
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("is_fluid_height", jw2Var.f15843n);
                bundle4.putInt("height", jw2Var.f15836g);
                bundle4.putInt("width", jw2Var.f15839j);
                arrayList.add(bundle4);
            }
        }
        bundle2.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
