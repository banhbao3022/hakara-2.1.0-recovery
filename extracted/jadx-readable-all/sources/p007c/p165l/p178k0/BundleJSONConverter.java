package p007c.p165l.p178k0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.l.k0.d, reason: use source file name */
/* JADX INFO: compiled from: BundleJSONConverter.java */
/* JADX INFO: loaded from: classes.dex */
public class BundleJSONConverter {

    /* JADX INFO: renamed from: a */
    public static final Map<Class<?>, h> f4900a;

    /* JADX INFO: renamed from: c.l.k0.d$a */
    /* JADX INFO: compiled from: BundleJSONConverter.java */
    public static class a implements h {
        @Override // p007c.p165l.p178k0.BundleJSONConverter.h
        /* JADX INFO: renamed from: a */
        public void mo2424a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: renamed from: c.l.k0.d$b */
    /* JADX INFO: compiled from: BundleJSONConverter.java */
    public static class b implements h {
        @Override // p007c.p165l.p178k0.BundleJSONConverter.h
        /* JADX INFO: renamed from: a */
        public void mo2424a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: c.l.k0.d$c */
    /* JADX INFO: compiled from: BundleJSONConverter.java */
    public static class c implements h {
        @Override // p007c.p165l.p178k0.BundleJSONConverter.h
        /* JADX INFO: renamed from: a */
        public void mo2424a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: c.l.k0.d$d */
    /* JADX INFO: compiled from: BundleJSONConverter.java */
    public static class d implements h {
        @Override // p007c.p165l.p178k0.BundleJSONConverter.h
        /* JADX INFO: renamed from: a */
        public void mo2424a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* JADX INFO: renamed from: c.l.k0.d$e */
    /* JADX INFO: compiled from: BundleJSONConverter.java */
    public static class e implements h {
        @Override // p007c.p165l.p178k0.BundleJSONConverter.h
        /* JADX INFO: renamed from: a */
        public void mo2424a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putString(str, (String) obj);
        }
    }

    /* JADX INFO: renamed from: c.l.k0.d$f */
    /* JADX INFO: compiled from: BundleJSONConverter.java */
    public static class f implements h {
        @Override // p007c.p165l.p178k0.BundleJSONConverter.h
        /* JADX INFO: renamed from: a */
        public void mo2424a(Bundle bundle, String str, Object obj) throws JSONException {
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* JADX INFO: renamed from: c.l.k0.d$g */
    /* JADX INFO: compiled from: BundleJSONConverter.java */
    public static class g implements h {
        @Override // p007c.p165l.p178k0.BundleJSONConverter.h
        /* JADX INFO: renamed from: a */
        public void mo2424a(Bundle bundle, String str, Object obj) throws JSONException {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList<String> arrayList = new ArrayList<>();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj2 = jSONArray.get(i);
                if (!(obj2 instanceof String)) {
                    StringBuilder sbM1556G = outline.m1556G("Unexpected type in an array: ");
                    sbM1556G.append(obj2.getClass());
                    throw new IllegalArgumentException(sbM1556G.toString());
                }
                arrayList.add((String) obj2);
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    /* JADX INFO: renamed from: c.l.k0.d$h */
    /* JADX INFO: compiled from: BundleJSONConverter.java */
    public interface h {
        /* JADX INFO: renamed from: a */
        void mo2424a(Bundle bundle, String str, Object obj) throws JSONException;
    }

    static {
        HashMap map = new HashMap();
        f4900a = map;
        map.put(Boolean.class, new a());
        map.put(Integer.class, new b());
        map.put(Long.class, new c());
        map.put(Double.class, new d());
        map.put(String.class, new e());
        map.put(String[].class, new f());
        map.put(JSONArray.class, new g());
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m2423a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != null && obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, m2423a((JSONObject) obj));
                } else {
                    h hVar = f4900a.get(obj.getClass());
                    if (hVar == null) {
                        StringBuilder sbM1556G = outline.m1556G("Unsupported type: ");
                        sbM1556G.append(obj.getClass());
                        throw new IllegalArgumentException(sbM1556G.toString());
                    }
                    hVar.mo2424a(bundle, next, obj);
                }
            }
        }
        return bundle;
    }
}
