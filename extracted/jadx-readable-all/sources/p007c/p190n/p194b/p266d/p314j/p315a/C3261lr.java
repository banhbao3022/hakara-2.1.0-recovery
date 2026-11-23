package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2297s0;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.lr */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3261lr implements InterfaceC3464r8<InterfaceC3704xp> {

    /* JADX INFO: renamed from: a */
    public boolean f16462a;

    /* JADX INFO: renamed from: b */
    public static int m7606b(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            C3331nn c3331nn = gx2.f14692a.f14693b;
            return C3331nn.m7886d(context.getResources().getDisplayMetrics(), Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(str.length() + 34 + str2.length());
            sb.append("Could not parse ");
            sb.append(str);
            sb.append(" in a video GMSG: ");
            sb.append(str2);
            C2622l.m5226A3(sb.toString());
            return i;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7607c(C3333np c3333np, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                c3333np.f17199k.mo6851x(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                C2622l.m5226A3(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            c3333np.f17199k.mo6852y(Integer.parseInt(str2));
        }
        if (str3 != null) {
            c3333np.f17199k.mo6853z(Integer.parseInt(str3));
        }
        if (str4 != null) {
            c3333np.f17199k.mo6848A(Integer.parseInt(str4));
        }
        if (str5 != null) {
            c3333np.f17199k.mo6849B(Integer.parseInt(str5));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(InterfaceC3704xp interfaceC3704xp, Map map) {
        int i;
        boolean z;
        int i2;
        InterfaceC3704xp interfaceC3704xp2 = interfaceC3704xp;
        String str = (String) map.get("action");
        if (str == null) {
            C2622l.m5226A3("Action missing from video GMSG.");
            return;
        }
        if (C2622l.m5281L3(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(string).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(string);
            C2622l.m5318U2(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                C2622l.m5226A3("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                interfaceC3704xp2.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                C2622l.m5226A3("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                C2622l.m5226A3("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                interfaceC3704xp2.mo6461Q(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                C2622l.m5226A3("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if ("decoderProps".equals(str)) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                C2622l.m5226A3("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                interfaceC3704xp2.mo6501r0("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, C2297s0.m4801a(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            interfaceC3704xp2.mo6501r0("onVideoEvent", map4);
            return;
        }
        C3370op c3370opMo6475d = interfaceC3704xp2.mo6475d();
        if (c3370opMo6475d == null) {
            C2622l.m5226A3("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = "new".equals(str);
        boolean zEquals2 = "position".equals(str);
        if (zEquals || zEquals2) {
            Context context = interfaceC3704xp2.getContext();
            int iM7606b = m7606b(context, map, "x", 0);
            int iM7606b2 = m7606b(context, map, "y", 0);
            int iM7606b3 = m7606b(context, map, "w", -1);
            AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14276U1;
            C2862b c2862b = C2862b.f12493a;
            int iMo6508v = ((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() ? iM7606b3 == -1 ? interfaceC3704xp2.mo6508v() : Math.min(iM7606b3, interfaceC3704xp2.mo6508v()) : Math.min(iM7606b3, interfaceC3704xp2.mo6508v() - iM7606b);
            int iM7606b4 = m7606b(context, map, "h", -1);
            int iMo6442G = ((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() ? iM7606b4 == -1 ? interfaceC3704xp2.mo6442G() : Math.min(iM7606b4, interfaceC3704xp2.mo6442G()) : Math.min(iM7606b4, interfaceC3704xp2.mo6442G() - iM7606b2);
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean z2 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || c3370opMo6475d.m8050a() != null) {
                C2622l.m5354d("The underlay may only be modified from the UI thread.");
                C3333np c3333np = c3370opMo6475d.f17712d;
                if (c3333np != null) {
                    c3333np.m7908k(iM7606b, iM7606b2, iMo6508v, iMo6442G);
                    return;
                }
                return;
            }
            C3667wp c3667wp = new C3667wp((String) map.get("flags"));
            if (c3370opMo6475d.f17712d == null) {
                C2622l.m5391k1(c3370opMo6475d.f17710b.mo6489l().f18702b, c3370opMo6475d.f17710b.mo6484i(), "vpr2");
                Context context2 = c3370opMo6475d.f17709a;
                InterfaceC3704xp interfaceC3704xp3 = c3370opMo6475d.f17710b;
                C3333np c3333np2 = new C3333np(context2, interfaceC3704xp3, i, z2, interfaceC3704xp3.mo6489l().f18702b, c3667wp);
                c3370opMo6475d.f17712d = c3333np2;
                c3370opMo6475d.f17711c.addView(c3333np2, 0, new ViewGroup.LayoutParams(-1, -1));
                c3370opMo6475d.f17712d.m7908k(iM7606b, iM7606b2, iMo6508v, iMo6442G);
                c3370opMo6475d.f17710b.mo6472a0(false);
            }
            C3333np c3333npM8050a = c3370opMo6475d.m8050a();
            if (c3333npM8050a != null) {
                m7607c(c3333npM8050a, map);
                return;
            }
            return;
        }
        BinderC3263lt binderC3263ltMo6480g = interfaceC3704xp2.mo6480g();
        if (binderC3263ltMo6480g != null) {
            if ("timeupdate".equals(str)) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    C2622l.m5226A3("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    float f = Float.parseFloat(str6);
                    synchronized (binderC3263ltMo6480g.f16489g) {
                        binderC3263ltMo6480g.f16497o = f;
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    C2622l.m5226A3(str6.length() != 0 ? "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6) : new String("Could not parse currentTime parameter from timeupdate video GMSG: "));
                    return;
                }
            }
            if ("skip".equals(str)) {
                synchronized (binderC3263ltMo6480g.f16489g) {
                    z = binderC3263ltMo6480g.f16495m;
                    i2 = binderC3263ltMo6480g.f16492j;
                    binderC3263ltMo6480g.f16492j = 3;
                }
                binderC3263ltMo6480g.m7616J6(i2, 3, z, z);
                return;
            }
        }
        C3333np c3333npM8050a2 = c3370opMo6475d.m8050a();
        if (c3333npM8050a2 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            interfaceC3704xp2.mo6501r0("onVideoEvent", map5);
            return;
        }
        if ("click".equals(str)) {
            Context context3 = interfaceC3704xp2.getContext();
            int iM7606b5 = m7606b(context3, map, "x", 0);
            int iM7606b6 = m7606b(context3, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iM7606b5, iM7606b6, 0);
            AbstractC3037fp abstractC3037fp = c3333npM8050a2.f17199k;
            if (abstractC3037fp != null) {
                abstractC3037fp.dispatchTouchEvent(motionEventObtain);
            }
            motionEventObtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                C2622l.m5226A3("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                int i3 = (int) (Float.parseFloat(str7) * 1000.0f);
                AbstractC3037fp abstractC3037fp2 = c3333npM8050a2.f17199k;
                if (abstractC3037fp2 == null) {
                    return;
                }
                abstractC3037fp2.mo6413o(i3);
                return;
            } catch (NumberFormatException unused5) {
                C2622l.m5226A3(str7.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(str7) : new String("Could not parse time parameter from currentTime video GMSG: "));
                return;
            }
        }
        if ("hide".equals(str)) {
            c3333npM8050a2.setVisibility(4);
            return;
        }
        if ("load".equals(str)) {
            if (c3333npM8050a2.f17199k == null) {
                return;
            }
            if (TextUtils.isEmpty(c3333npM8050a2.f17206r)) {
                c3333npM8050a2.m7900c("no_src", new String[0]);
                return;
            } else {
                c3333npM8050a2.f17199k.mo6850w(c3333npM8050a2.f17206r, c3333npM8050a2.f17207s);
                return;
            }
        }
        if ("loadControl".equals(str)) {
            m7607c(c3333npM8050a2, map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                AbstractC3037fp abstractC3037fp3 = c3333npM8050a2.f17199k;
                if (abstractC3037fp3 == null) {
                    return;
                }
                C2889bq c2889bq = abstractC3037fp3.f14088g;
                c2889bq.f12773e = true;
                c2889bq.m6070b();
                abstractC3037fp3.mo5839l();
                return;
            }
            AbstractC3037fp abstractC3037fp4 = c3333npM8050a2.f17199k;
            if (abstractC3037fp4 == null) {
                return;
            }
            C2889bq c2889bq2 = abstractC3037fp4.f14088g;
            c2889bq2.f12773e = false;
            c2889bq2.m6070b();
            abstractC3037fp4.mo5839l();
            return;
        }
        if ("pause".equals(str)) {
            AbstractC3037fp abstractC3037fp5 = c3333npM8050a2.f17199k;
            if (abstractC3037fp5 == null) {
                return;
            }
            abstractC3037fp5.mo6410k();
            return;
        }
        if ("play".equals(str)) {
            AbstractC3037fp abstractC3037fp6 = c3333npM8050a2.f17199k;
            if (abstractC3037fp6 == null) {
                return;
            }
            abstractC3037fp6.mo6409j();
            return;
        }
        if ("show".equals(str)) {
            c3333npM8050a2.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            String str8 = (String) map.get("src");
            Integer numValueOf = null;
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    String str9 = (String) map.get("periodicReportIntervalMs");
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str9).length() + 65);
                    sb2.append("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ");
                    sb2.append(str9);
                    C2622l.m5226A3(sb2.toString());
                }
            }
            String[] strArr = {str8};
            String str10 = (String) map.get("demuxed");
            if (str10 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str10);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        strArr2[i4] = jSONArray.getString(i4);
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    C2622l.m5226A3(str10.length() != 0 ? "Malformed demuxed URL list for playback: ".concat(str10) : new String("Malformed demuxed URL list for playback: "));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                interfaceC3704xp2.mo6439E0(numValueOf.intValue());
            }
            c3333npM8050a2.f17206r = str8;
            c3333npM8050a2.f17207s = strArr;
            return;
        }
        if ("touchMove".equals(str)) {
            Context context4 = interfaceC3704xp2.getContext();
            float fM7606b = m7606b(context4, map, "dx", 0);
            float fM7606b2 = m7606b(context4, map, "dy", 0);
            AbstractC3037fp abstractC3037fp7 = c3333npM8050a2.f17199k;
            if (abstractC3037fp7 != null) {
                abstractC3037fp7.mo6414p(fM7606b, fM7606b2);
            }
            if (this.f16462a) {
                return;
            }
            interfaceC3704xp2.mo6485j();
            this.f16462a = true;
            return;
        }
        if (!"volume".equals(str)) {
            if ("watermark".equals(str)) {
                c3333npM8050a2.m7898a();
                return;
            } else {
                C2622l.m5226A3(str.length() != 0 ? "Unknown video action: ".concat(str) : new String("Unknown video action: "));
                return;
            }
        }
        String str11 = (String) map.get("volume");
        if (str11 == null) {
            C2622l.m5226A3("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            float f2 = Float.parseFloat(str11);
            AbstractC3037fp abstractC3037fp8 = c3333npM8050a2.f17199k;
            if (abstractC3037fp8 == null) {
                return;
            }
            C2889bq c2889bq3 = abstractC3037fp8.f14088g;
            c2889bq3.f12774f = f2;
            c2889bq3.m6070b();
            abstractC3037fp8.mo5839l();
        } catch (NumberFormatException unused8) {
            C2622l.m5226A3(str11.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(str11) : new String("Could not parse volume parameter from volume video GMSG: "));
        }
    }
}
