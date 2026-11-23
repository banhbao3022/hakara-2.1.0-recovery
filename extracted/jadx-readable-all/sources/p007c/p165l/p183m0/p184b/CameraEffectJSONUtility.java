package p007c.p165l.p183m0.p184b;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p183m0.p185c.CameraEffectArguments;

/* JADX INFO: renamed from: c.l.m0.b.b, reason: use source file name */
/* JADX INFO: compiled from: CameraEffectJSONUtility.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraEffectJSONUtility {

    /* JADX INFO: renamed from: a */
    public static final Map<Class<?>, d> f5188a;

    /* JADX INFO: renamed from: c.l.m0.b.b$a */
    /* JADX INFO: compiled from: CameraEffectJSONUtility.java */
    public static class a implements d {
        @Override // p007c.p165l.p183m0.p184b.CameraEffectJSONUtility.d
        /* JADX INFO: renamed from: a */
        public void mo2604a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }
    }

    /* JADX INFO: renamed from: c.l.m0.b.b$b */
    /* JADX INFO: compiled from: CameraEffectJSONUtility.java */
    public static class b implements d {
        @Override // p007c.p165l.p183m0.p184b.CameraEffectJSONUtility.d
        /* JADX INFO: renamed from: a */
        public void mo2604a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : (String[]) obj) {
                jSONArray.put(str2);
            }
            jSONObject.put(str, jSONArray);
        }
    }

    /* JADX INFO: renamed from: c.l.m0.b.b$c */
    /* JADX INFO: compiled from: CameraEffectJSONUtility.java */
    public static class c implements d {
        @Override // p007c.p165l.p183m0.p184b.CameraEffectJSONUtility.d
        /* JADX INFO: renamed from: a */
        public void mo2604a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }

    /* JADX INFO: renamed from: c.l.m0.b.b$d */
    /* JADX INFO: compiled from: CameraEffectJSONUtility.java */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo2604a(JSONObject jSONObject, String str, Object obj) throws JSONException;
    }

    static {
        HashMap map = new HashMap();
        f5188a = map;
        map.put(String.class, new a());
        map.put(String[].class, new b());
        map.put(JSONArray.class, new c());
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m2603a(CameraEffectArguments cameraEffectArguments) throws JSONException {
        if (cameraEffectArguments == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : cameraEffectArguments.f5248f.keySet()) {
            Object obj = cameraEffectArguments.f5248f.get(str);
            if (obj != null) {
                d dVar = f5188a.get(obj.getClass());
                if (dVar == null) {
                    StringBuilder sbM1556G = outline.m1556G("Unsupported type: ");
                    sbM1556G.append(obj.getClass());
                    throw new IllegalArgumentException(sbM1556G.toString());
                }
                dVar.mo2604a(jSONObject, str, obj);
            }
        }
        return jSONObject;
    }
}
