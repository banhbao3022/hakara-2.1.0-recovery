package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class hm1 {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, String> f14911a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public final nm1 f14912b = new nm1(C2330u.f10884a.f10896k);

    /* JADX INFO: renamed from: a */
    public static hm1 m7144a(String str) {
        hm1 hm1Var = new hm1();
        hm1Var.f14911a.put("action", str);
        return hm1Var;
    }

    /* JADX INFO: renamed from: b */
    public final hm1 m7145b(String str) {
        nm1 nm1Var = this.f14912b;
        if (nm1Var.f17162c.containsKey(str)) {
            long jMo5621a = nm1Var.f17160a.mo5621a();
            long jLongValue = nm1Var.f17162c.remove(str).longValue();
            StringBuilder sb = new StringBuilder(20);
            sb.append(jMo5621a - jLongValue);
            nm1Var.m7883a(str, sb.toString());
        } else {
            nm1Var.f17162c.put(str, Long.valueOf(nm1Var.f17160a.mo5621a()));
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final hm1 m7146c(String str, String str2) {
        nm1 nm1Var = this.f14912b;
        if (nm1Var.f17162c.containsKey(str)) {
            long jMo5621a = nm1Var.f17160a.mo5621a();
            long jLongValue = nm1Var.f17162c.remove(str).longValue();
            StringBuilder sb = new StringBuilder(str2.length() + 20);
            sb.append(str2);
            sb.append(jMo5621a - jLongValue);
            nm1Var.m7883a(str, sb.toString());
        } else {
            nm1Var.f17162c.put(str, Long.valueOf(nm1Var.f17160a.mo5621a()));
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final hm1 m7147d(di1 di1Var, C3146in c3146in) {
        bi1 bi1Var = di1Var.f13281b;
        m7148e(bi1Var.f12695b);
        if (!bi1Var.f12694a.isEmpty()) {
            switch (bi1Var.f12694a.get(0).f18805b) {
                case 1:
                    this.f14911a.put("ad_format", "banner");
                    break;
                case 2:
                    this.f14911a.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.f14911a.put("ad_format", "native_express");
                    break;
                case 4:
                    this.f14911a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.f14911a.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.f14911a.put("ad_format", "app_open_ad");
                    if (c3146in != null) {
                        this.f14911a.put("as", true != c3146in.f15325g ? "0" : "1");
                    }
                    break;
                default:
                    this.f14911a.put("ad_format", "unknown");
                    break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final hm1 m7148e(uh1 uh1Var) {
        if (!TextUtils.isEmpty(uh1Var.f20318b)) {
            this.f14911a.put("gqi", uh1Var.f20318b);
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, String> m7149f() {
        HashMap map = new HashMap(this.f14911a);
        nm1 nm1Var = this.f14912b;
        Objects.requireNonNull(nm1Var);
        ArrayList<mm1> arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : nm1Var.f17161b.entrySet()) {
            int i = 0;
            if (entry.getValue().size() > 1) {
                for (String str : entry.getValue()) {
                    String key = entry.getKey();
                    i++;
                    StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 12);
                    sb.append(key);
                    sb.append(".");
                    sb.append(i);
                    arrayList.add(new mm1(sb.toString(), str));
                }
            } else {
                arrayList.add(new mm1(entry.getKey(), entry.getValue().get(0)));
            }
        }
        for (mm1 mm1Var : arrayList) {
            map.put(mm1Var.f16798a, mm1Var.f16799b);
        }
        return map;
    }
}
