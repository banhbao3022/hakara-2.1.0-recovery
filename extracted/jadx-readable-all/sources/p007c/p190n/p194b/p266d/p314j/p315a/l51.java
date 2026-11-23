package p007c.p190n.p194b.p266d.p314j.p315a;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class l51 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final ii1 f16289a;

    /* JADX INFO: renamed from: b */
    public final long f16290b;

    public l51(ii1 ii1Var, long j2) {
        C2622l.m5379i(ii1Var, "the targeting must not be null");
        this.f16289a = ii1Var;
        this.f16290b = j2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final void mo5696d(Bundle bundle) {
        Bundle bundle2 = bundle;
        ew2 ew2Var = this.f16289a.f15191d;
        bundle2.putInt("http_timeout_millis", ew2Var.f13712B);
        bundle2.putString("slotname", this.f16289a.f15193f);
        int i = this.f16289a.f15202o.f21885a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            bundle2.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle2.putBoolean("is_rewarded_interstitial", true);
        }
        bundle2.putLong("start_signals_timestamp", this.f16290b);
        String str = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(ew2Var.f13714g));
        if (ew2Var.f13714g != -1) {
            bundle2.putString("cust_age", str);
        }
        Bundle bundle3 = ew2Var.f13715h;
        if (bundle3 != null) {
            bundle2.putBundle("extras", bundle3);
        }
        C2622l.m5442u2(bundle2, "cust_gender", Integer.valueOf(ew2Var.f13716i), ew2Var.f13716i != -1);
        C2622l.m5433s3(bundle2, "kw", ew2Var.f13717j);
        C2622l.m5442u2(bundle2, "tag_for_child_directed_treatment", Integer.valueOf(ew2Var.f13719l), ew2Var.f13719l != -1);
        if (ew2Var.f13718k) {
            bundle2.putBoolean("test_request", true);
        }
        C2622l.m5442u2(bundle2, "d_imp_hdr", 1, ew2Var.f13713f >= 2 && ew2Var.f13720m);
        String str2 = ew2Var.f13721n;
        if (ew2Var.f13713f >= 2 && !TextUtils.isEmpty(str2)) {
            bundle2.putString("ppid", str2);
        }
        Location location = ew2Var.f13723p;
        if (location != null) {
            Float fValueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
            Long lValueOf = Long.valueOf(location.getTime() * 1000);
            Long lValueOf2 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
            Long lValueOf3 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
            Bundle bundle4 = new Bundle();
            bundle4.putFloat("radius", fValueOf.floatValue());
            bundle4.putLong("lat", lValueOf2.longValue());
            bundle4.putLong("long", lValueOf3.longValue());
            bundle4.putLong("time", lValueOf.longValue());
            bundle2.putBundle("uule", bundle4);
        }
        String str3 = ew2Var.f13724q;
        if (str3 != null) {
            bundle2.putString("url", str3);
        }
        C2622l.m5433s3(bundle2, "neighboring_content_urls", ew2Var.f13711A);
        Bundle bundle5 = ew2Var.f13726s;
        if (bundle5 != null) {
            bundle2.putBundle("custom_targeting", bundle5);
        }
        C2622l.m5433s3(bundle2, "category_exclusions", ew2Var.f13727t);
        String str4 = ew2Var.f13728u;
        if (str4 != null) {
            bundle2.putString("request_agent", str4);
        }
        String str5 = ew2Var.f13729v;
        if (str5 != null) {
            bundle2.putString("request_pkg", str5);
        }
        C2622l.m5310S2(bundle2, "is_designed_for_families", Boolean.valueOf(ew2Var.f13730w), ew2Var.f13713f >= 7);
        if (ew2Var.f13713f >= 8) {
            C2622l.m5442u2(bundle2, "tag_for_under_age_of_consent", Integer.valueOf(ew2Var.f13732y), ew2Var.f13732y != -1);
            String str6 = ew2Var.f13733z;
            if (str6 != null) {
                bundle2.putString("max_ad_content_rating", str6);
            }
        }
    }
}
