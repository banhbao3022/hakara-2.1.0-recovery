package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2311z0;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: renamed from: c.n.b.d.j.a.cm */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2923cm {

    /* JADX INFO: renamed from: a */
    public static AbstractC2923cm f13052a;

    /* JADX INFO: renamed from: d */
    public static synchronized AbstractC2923cm m6200d(Context context) {
        AbstractC2923cm abstractC2923cm = f13052a;
        if (abstractC2923cm != null) {
            return abstractC2923cm;
        }
        Context applicationContext = context.getApplicationContext();
        C3052g3.m6922a(applicationContext);
        C2330u c2330u = C2330u.f10884a;
        C2311z0 c2311z0 = (C2311z0) c2330u.f10893h.m6649f();
        c2311z0.m4833c(applicationContext);
        Objects.requireNonNull(applicationContext);
        InterfaceC2782b interfaceC2782b = c2330u.f10896k;
        Objects.requireNonNull(interfaceC2782b);
        C2885bm c2885bm = c2330u.f10910y;
        C2622l.m5467z2(applicationContext, Context.class);
        C2622l.m5467z2(interfaceC2782b, InterfaceC2782b.class);
        C2622l.m5467z2(c2311z0, InterfaceC2305w0.class);
        C2622l.m5467z2(c2885bm, C2885bm.class);
        C3144il c3144il = new C3144il(applicationContext, interfaceC2782b, c2311z0, c2885bm);
        f13052a = c3144il;
        SharedPreferencesOnSharedPreferenceChangeListenerC2922cl sharedPreferencesOnSharedPreferenceChangeListenerC2922clMo6201a = c3144il.mo6201a();
        sharedPreferencesOnSharedPreferenceChangeListenerC2922clMo6201a.f13047b.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2922clMo6201a);
        sharedPreferencesOnSharedPreferenceChangeListenerC2922clMo6201a.onSharedPreferenceChanged(sharedPreferencesOnSharedPreferenceChangeListenerC2922clMo6201a.f13047b, "IABTCF_PurposeConsents");
        f13052a.mo6202b().f14609b.m6636b();
        final C3071gm c3071gmMo6203c = f13052a.mo6203c();
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14367i0;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            final HashMap map = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject((String) c2862b.f12496d.m6596a(C3052g3.f14374j0));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    HashSet hashSet = new HashSet();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            String strOptString = jSONArrayOptJSONArray.optString(i);
                            if (strOptString != null) {
                                hashSet.add(strOptString);
                            }
                        }
                        map.put(next, hashSet);
                    }
                }
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    c3071gmMo6203c.m7006a((String) it.next());
                }
                InterfaceC3034fm interfaceC3034fm = new InterfaceC3034fm(c3071gmMo6203c, map) { // from class: c.n.b.d.j.a.dm

                    /* JADX INFO: renamed from: a */
                    public final C3071gm f13315a;

                    /* JADX INFO: renamed from: b */
                    public final Map f13316b;

                    {
                        this.f13315a = c3071gmMo6203c;
                        this.f13316b = map;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3034fm
                    /* JADX INFO: renamed from: a */
                    public final void mo6374a(SharedPreferences sharedPreferences, String str, String str2) {
                        C3071gm c3071gm = this.f13315a;
                        Map map2 = this.f13316b;
                        Objects.requireNonNull(c3071gm);
                        if (map2.containsKey(str) && ((Set) map2.get(str)).contains(str2)) {
                            C3070gl c3070gl = c3071gm.f14614d;
                            c3070gl.f14609b.m6635a(-1, c3070gl.f14608a.mo5623c());
                        }
                    }
                };
                synchronized (c3071gmMo6203c) {
                    c3071gmMo6203c.f14612b.add(interfaceC3034fm);
                }
            } catch (JSONException e) {
                C2622l.m5358d3("Failed to parse listening list", e);
            }
        }
        return f13052a;
    }

    /* JADX INFO: renamed from: a */
    public abstract SharedPreferencesOnSharedPreferenceChangeListenerC2922cl mo6201a();

    /* JADX INFO: renamed from: b */
    public abstract C3070gl mo6202b();

    /* JADX INFO: renamed from: c */
    public abstract C3071gm mo6203c();
}
