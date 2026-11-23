package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p267a.p279w.C2198a;
import p007c.p190n.p194b.p266d.p267a.p279w.C2204g;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h01<AdT> implements bx0<AdT> {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: a */
    public final kv1<AdT> mo6115a(di1 di1Var, rh1 rh1Var) {
        String strOptString = rh1Var.f18830u.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        ii1 ii1Var = di1Var.f13280a.f22289a;
        hi1 hi1Var = new hi1();
        hi1Var.f14869o.f21546a = ii1Var.f15202o.f21885a;
        ew2 ew2Var = ii1Var.f15191d;
        hi1Var.f14855a = ew2Var;
        hi1Var.f14856b = ii1Var.f15192e;
        hi1Var.f14872r = ii1Var.f15204q;
        hi1Var.f14857c = ii1Var.f15193f;
        hi1Var.f14858d = ii1Var.f15188a;
        hi1Var.f14860f = ii1Var.f15194g;
        hi1Var.f14861g = ii1Var.f15195h;
        hi1Var.f14862h = ii1Var.f15196i;
        hi1Var.f14863i = ii1Var.f15197j;
        C2198a c2198a = ii1Var.f15199l;
        hi1Var.f14864j = c2198a;
        if (c2198a != null) {
            hi1Var.f14859e = c2198a.f10596f;
        }
        C2204g c2204g = ii1Var.f15200m;
        hi1Var.f14865k = c2204g;
        if (c2204g != null) {
            hi1Var.f14859e = c2204g.f10612f;
            hi1Var.f14866l = c2204g.f10613g;
        }
        hi1Var.f14870p = ii1Var.f15203p;
        hi1Var.f14871q = ii1Var.f15190c;
        hi1Var.f14857c = strOptString;
        Bundle bundle = ew2Var.f13725r;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        Bundle bundle4 = bundle3 == null ? new Bundle() : new Bundle(bundle3);
        bundle4.putInt("gw", 1);
        String strOptString2 = rh1Var.f18830u.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundle4.putString("mad_hac", strOptString2);
        }
        String strOptString3 = rh1Var.f18830u.optString("adJson", null);
        if (strOptString3 != null) {
            bundle4.putString("_ad", strOptString3);
        }
        bundle4.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = rh1Var.f18779C.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = rh1Var.f18779C.optString(next, null);
            if (next != null) {
                bundle4.putString(next, strOptString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        ew2 ew2Var2 = ii1Var.f15191d;
        hi1Var.f14855a = new ew2(ew2Var2.f13713f, ew2Var2.f13714g, bundle4, ew2Var2.f13716i, ew2Var2.f13717j, ew2Var2.f13718k, ew2Var2.f13719l, ew2Var2.f13720m, ew2Var2.f13721n, ew2Var2.f13722o, ew2Var2.f13723p, ew2Var2.f13724q, bundle2, ew2Var2.f13726s, ew2Var2.f13727t, ew2Var2.f13728u, ew2Var2.f13729v, ew2Var2.f13730w, ew2Var2.f13731x, ew2Var2.f13732y, ew2Var2.f13733z, ew2Var2.f13711A, ew2Var2.f13712B);
        ii1 ii1VarM7136a = hi1Var.m7136a();
        Bundle bundle5 = new Bundle();
        uh1 uh1Var = di1Var.f13281b.f12695b;
        Bundle bundle6 = new Bundle();
        bundle6.putStringArrayList("nofill_urls", new ArrayList<>(uh1Var.f20317a));
        bundle6.putInt("refresh_interval", uh1Var.f20319c);
        bundle6.putString("gws_query_id", uh1Var.f20318b);
        bundle5.putBundle("parent_common_config", bundle6);
        Bundle bundleM1575Z = outline.m1575Z("initial_ad_unit_id", di1Var.f13280a.f22289a.f15193f);
        bundleM1575Z.putString("allocation_id", rh1Var.f18831v);
        bundleM1575Z.putStringArrayList("click_urls", new ArrayList<>(rh1Var.f18807c));
        bundleM1575Z.putStringArrayList("imp_urls", new ArrayList<>(rh1Var.f18809d));
        bundleM1575Z.putStringArrayList("manual_tracking_urls", new ArrayList<>(rh1Var.f18824o));
        bundleM1575Z.putStringArrayList("fill_urls", new ArrayList<>(rh1Var.f18822m));
        bundleM1575Z.putStringArrayList("video_start_urls", new ArrayList<>(rh1Var.f18815g));
        bundleM1575Z.putStringArrayList("video_reward_urls", new ArrayList<>(rh1Var.f18817h));
        bundleM1575Z.putStringArrayList("video_complete_urls", new ArrayList<>(rh1Var.f18818i));
        bundleM1575Z.putString("transaction_id", rh1Var.f18819j);
        bundleM1575Z.putString("valid_from_timestamp", rh1Var.f18820k);
        bundleM1575Z.putBoolean("is_closable_area_disabled", rh1Var.f18787K);
        if (rh1Var.f18821l != null) {
            Bundle bundle7 = new Bundle();
            bundle7.putInt("rb_amount", rh1Var.f18821l.f18848g);
            bundle7.putString("rb_type", rh1Var.f18821l.f18847f);
            bundleM1575Z.putParcelableArray("rewards", new Bundle[]{bundle7});
        }
        bundle5.putBundle("parent_ad_config", bundleM1575Z);
        return mo6699c(ii1VarM7136a, bundle5);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: b */
    public final boolean mo6116b(di1 di1Var, rh1 rh1Var) {
        return !TextUtils.isEmpty(rh1Var.f18830u.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    /* JADX INFO: renamed from: c */
    public abstract kv1<AdT> mo6699c(ii1 ii1Var, Bundle bundle);
}
