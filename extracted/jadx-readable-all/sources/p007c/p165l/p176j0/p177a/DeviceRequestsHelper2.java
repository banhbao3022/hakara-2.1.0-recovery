package p007c.p165l.p176j0.p177a;

import android.net.nsd.NsdManager;
import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.FetchedAppSettings;
import p007c.p165l.p178k0.FetchedAppSettingsManager;
import p007c.p165l.p178k0.SmartLoginOption;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.j0.a.b, reason: use source file name */
/* JADX INFO: compiled from: DeviceRequestsHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class DeviceRequestsHelper2 {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, NsdManager.RegistrationListener> f4871a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static void m2411a(String str) {
        NsdManager.RegistrationListener registrationListener = f4871a.get(str);
        if (registrationListener != null) {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            try {
                ((NsdManager) FacebookSdk.f5360i.getSystemService("servicediscovery")).unregisterService(registrationListener);
            } catch (IllegalArgumentException unused) {
                HashSet<LoggingBehavior> hashSet2 = FacebookSdk.f5352a;
            }
            f4871a.remove(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m2412b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2413c() {
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        FetchedAppSettings fetchedAppSettingsM2524b = FetchedAppSettingsManager.m2524b(FacebookSdk.f5354c);
        return fetchedAppSettingsM2524b != null && fetchedAppSettingsM2524b.f5003c.contains(SmartLoginOption.Enabled);
    }
}
