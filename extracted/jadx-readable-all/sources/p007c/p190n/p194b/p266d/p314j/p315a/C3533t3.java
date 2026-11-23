package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: renamed from: c.n.b.d.j.a.t3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C3533t3 {

    /* JADX INFO: renamed from: a */
    public final List<C3422q3> f19755a = new LinkedList();

    /* JADX INFO: renamed from: b */
    public final Map<String, String> f19756b;

    /* JADX INFO: renamed from: c */
    public final Object f19757c;

    public C3533t3(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f19756b = linkedHashMap;
        this.f19757c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    /* JADX INFO: renamed from: d */
    public static final C3422q3 m8395d() {
        return new C3422q3(C2330u.f10884a.f10896k.mo5621a(), null, null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8396a(C3422q3 c3422q3, long j2, String... strArr) {
        synchronized (this.f19757c) {
            for (String str : strArr) {
                this.f19755a.add(new C3422q3(j2, str, c3422q3));
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final C3496s3 m8397b() {
        C3496s3 c3496s3;
        boolean zBooleanValue = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14333d1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.f19757c) {
            try {
                for (C3422q3 c3422q3 : this.f19755a) {
                    long j2 = c3422q3.f18173a;
                    String str = c3422q3.f18174b;
                    C3422q3 c3422q4 = c3422q3.f18175c;
                    if (c3422q4 != null && j2 > 0) {
                        long j3 = j2 - c3422q4.f18173a;
                        sb.append(str);
                        sb.append('.');
                        sb.append(j3);
                        sb.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(c3422q4.f18173a))) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(c3422q4.f18173a));
                                sb2.append('+');
                                sb2.append(str);
                            } else {
                                map.put(Long.valueOf(c3422q4.f18173a), new StringBuilder(str));
                            }
                        }
                    }
                }
                this.f19755a.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        long jLongValue = ((Long) entry.getKey()).longValue();
                        C2330u c2330u = C2330u.f10884a;
                        sb3.append((jLongValue - c2330u.f10896k.mo5621a()) + c2330u.f10896k.mo5623c());
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                c3496s3 = new C3496s3(sb.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3496s3;
    }

    /* JADX INFO: renamed from: c */
    public final void m8398c(String str, String str2) {
        C3163j3 c3163j3M6644a;
        if (TextUtils.isEmpty(str2) || (c3163j3M6644a = C2330u.f10884a.f10893h.m6644a()) == null) {
            return;
        }
        synchronized (this.f19757c) {
            AbstractC3385p3 abstractC3385p3 = c3163j3M6644a.f15452c.get(str);
            if (abstractC3385p3 == null) {
                abstractC3385p3 = AbstractC3385p3.f17817a;
            }
            Map<String, String> map = this.f19756b;
            map.put(str, abstractC3385p3.mo7572a(map.get(str), str2));
        }
    }
}
