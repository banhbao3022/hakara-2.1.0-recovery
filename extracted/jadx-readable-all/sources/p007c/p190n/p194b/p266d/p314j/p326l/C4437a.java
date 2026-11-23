package p007c.p190n.p194b.p266d.p314j.p326l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import org.json.JSONException;
import p007c.p071d.p072a.p073a.C0519f;
import p007c.p071d.p072a.p073a.C0541w;

/* JADX INFO: renamed from: c.n.b.d.j.l.a */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4437a {

    /* JADX INFO: renamed from: a */
    public static final int f23683a = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: a */
    public static void m10349a(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10350b(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C0519f m10351c(Intent intent, String str) {
        if (intent == null) {
            m10350b("BillingHelper", "Got null intent!");
            C0519f c0519f = new C0519f();
            c0519f.f2715a = 6;
            c0519f.f2716b = "An internal error occurred.";
            return c0519f;
        }
        int iM10352d = m10352d(intent.getExtras(), str);
        String strM10353e = m10353e(intent.getExtras(), str);
        C0519f c0519f2 = new C0519f();
        c0519f2.f2715a = iM10352d;
        c0519f2.f2716b = strM10353e;
        return c0519f2;
    }

    /* JADX INFO: renamed from: d */
    public static int m10352d(Bundle bundle, String str) {
        if (bundle == null) {
            m10350b(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m10349a(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        String name = obj.getClass().getName();
        m10350b(str, name.length() != 0 ? "Unexpected type for bundle response code: ".concat(name) : new String("Unexpected type for bundle response code: "));
        return 6;
    }

    /* JADX INFO: renamed from: e */
    public static String m10353e(Bundle bundle, String str) {
        if (bundle == null) {
            m10350b(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m10349a(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        String name = obj.getClass().getName();
        m10350b(str, name.length() != 0 ? "Unexpected type for debug message: ".concat(name) : new String("Unexpected type for debug message: "));
        return "";
    }

    /* JADX INFO: renamed from: f */
    public static Bundle m10354f(int i, boolean z, String str, String str2, ArrayList<C0541w> arrayList) {
        Bundle bundle = new Bundle();
        if (i >= 9) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (i >= 9 && z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (i >= 14) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            int size = arrayList.size();
            boolean z2 = false;
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.get(i2);
                arrayList2.add(null);
                z2 |= !TextUtils.isEmpty(null);
            }
            if (z2) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: g */
    public static Purchase m10355g(String str, String str2) {
        if (str == null || str2 == null) {
            m10350b("BillingHelper", "Received a bad purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
            sb.append("Got JSONException while parsing purchase data: ");
            sb.append(strValueOf);
            m10350b("BillingHelper", sb.toString());
            return null;
        }
    }
}
