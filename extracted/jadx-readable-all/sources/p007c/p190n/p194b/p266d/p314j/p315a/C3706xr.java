package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.xr */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3706xr implements InterfaceC3464r8<InterfaceC3704xp> {
    /* JADX INFO: renamed from: b */
    public static final Integer m8750b(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            C2622l.m5226A3(sb.toString());
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(InterfaceC3704xp interfaceC3704xp, Map map) {
        AbstractC3669wr c3780zr;
        InterfaceC3704xp interfaceC3704xp2 = interfaceC3704xp;
        if (C2622l.m5281L3(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String strValueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 15);
            sb.append("Precache GMSG: ");
            sb.append(strValueOf);
            C2622l.m5318U2(sb.toString());
        }
        C3409pr c3409pr = C2330u.f10884a.f10885A;
        if (map.containsKey("abort")) {
            if (C3409pr.m8152f(interfaceC3704xp2)) {
                return;
            }
            C2622l.m5226A3("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numM8750b = m8750b(map, "periodicReportIntervalMs");
        Integer numM8750b2 = m8750b(map, "exoPlayerRenderingIntervalMs");
        Integer numM8750b3 = m8750b(map, "exoPlayerIdleIntervalMs");
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    C2622l.m5226A3(str2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(str2) : new String("Malformed demuxed URL list for precache: "));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (C3409pr.m8151c(interfaceC3704xp2) != null) {
                C2622l.m5226A3("Precache task is already running.");
                return;
            }
            if (interfaceC3704xp2.mo6487k() == null) {
                C2622l.m5226A3("Precache requires a dependency provider.");
                return;
            }
            C3667wp c3667wp = new C3667wp((String) map.get("flags"));
            Integer numM8750b4 = m8750b(map, "player");
            if (numM8750b4 == null) {
                numM8750b4 = 0;
            }
            if (numM8750b != null) {
                interfaceC3704xp2.mo6439E0(numM8750b.intValue());
            }
            if (numM8750b2 != null) {
                interfaceC3704xp2.mo6431A(numM8750b2.intValue());
            }
            if (numM8750b3 != null) {
                interfaceC3704xp2.mo6474c0(numM8750b3.intValue());
            }
            int iIntValue = numM8750b4.intValue();
            C3187jr c3187jr = interfaceC3704xp2.mo6487k().f10831b;
            if (iIntValue > 0) {
                int i2 = C3002er.f13651g;
                c3780zr = i2 < c3667wp.f21288g ? new C3003es(interfaceC3704xp2, c3667wp) : i2 < c3667wp.f21283b ? new C2929cs(interfaceC3704xp2, c3667wp) : new C2854as(interfaceC3704xp2);
            } else {
                c3780zr = new C3780zr(interfaceC3704xp2);
            }
            new C3372or(interfaceC3704xp2, c3780zr, str, strArr).m4707b();
        } else {
            C3372or c3372orM8151c = C3409pr.m8151c(interfaceC3704xp2);
            if (c3372orM8151c == null) {
                C2622l.m5226A3("Precache must specify a source.");
                return;
            }
            c3780zr = c3372orM8151c.f17724c;
        }
        Integer numM8750b5 = m8750b(map, "minBufferMs");
        if (numM8750b5 != null) {
            c3780zr.mo6680k(numM8750b5.intValue());
        }
        Integer numM8750b6 = m8750b(map, "maxBufferMs");
        if (numM8750b6 != null) {
            c3780zr.mo6679j(numM8750b6.intValue());
        }
        Integer numM8750b7 = m8750b(map, "bufferForPlaybackMs");
        if (numM8750b7 != null) {
            c3780zr.mo6681l(numM8750b7.intValue());
        }
        Integer numM8750b8 = m8750b(map, "bufferForPlaybackAfterRebufferMs");
        if (numM8750b8 != null) {
            c3780zr.mo6682m(numM8750b8.intValue());
        }
    }
}
