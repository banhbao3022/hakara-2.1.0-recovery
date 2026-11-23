package p007c.p165l.p166h0.p171e0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.e0.k, reason: use source file name */
/* JADX INFO: compiled from: InAppPurchaseEventManager.java */
/* JADX INFO: loaded from: classes.dex */
public class InAppPurchaseEventManager {

    /* JADX INFO: renamed from: a */
    public static final HashMap<String, Method> f4742a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static final HashMap<String, Class<?>> f4743b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static final String f4744c;

    /* JADX INFO: renamed from: d */
    public static final SharedPreferences f4745d;

    /* JADX INFO: renamed from: e */
    public static final SharedPreferences f4746e;

    static {
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        f4744c = FacebookSdk.f5360i.getPackageName();
        Validate.m2479h();
        f4745d = FacebookSdk.f5360i.getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
        Validate.m2479h();
        f4746e = FacebookSdk.f5360i.getSharedPreferences("com.facebook.internal.PURCHASE", 0);
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList<String> m2320a(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        SharedPreferences.Editor editorEdit = f4746e.edit();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        for (String str : arrayList) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("productId");
                long j2 = jSONObject.getLong("purchaseTime");
                String string2 = jSONObject.getString("purchaseToken");
                if (jCurrentTimeMillis - (j2 / 1000) <= 86400 && !f4746e.getString(string, "").equals(string2)) {
                    editorEdit.putString(string, string2);
                    arrayList2.add(str);
                }
            } catch (JSONException unused) {
            }
        }
        editorEdit.apply();
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public static Class<?> m2321b(Context context, String str) {
        HashMap<String, Class<?>> map = f4743b;
        Class<?> clsLoadClass = map.get(str);
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        try {
            clsLoadClass = context.getClassLoader().loadClass(str);
            map.put(str, clsLoadClass);
            return clsLoadClass;
        } catch (ClassNotFoundException unused) {
            return clsLoadClass;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public static Method m2322c(Class<?> cls, String str) {
        HashMap<String, Method> map = f4742a;
        Method declaredMethod = map.get(str);
        if (declaredMethod != null) {
            return declaredMethod;
        }
        Class<?>[] clsArr = null;
        byte b = -1;
        try {
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        b = 3;
                    }
                    break;
                case -1450694211:
                    if (str.equals("isBillingSupported")) {
                        b = 2;
                    }
                    break;
                case -1123215065:
                    if (str.equals("asInterface")) {
                        b = 0;
                    }
                    break;
                case -594356707:
                    if (str.equals("getPurchaseHistory")) {
                        b = 4;
                    }
                    break;
                case -573310373:
                    if (str.equals("getSkuDetails")) {
                        b = 1;
                    }
                    break;
            }
            if (b == 0) {
                clsArr = new Class[]{IBinder.class};
            } else if (b == 1) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, Bundle.class};
            } else if (b == 2) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class};
            } else if (b == 3) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class};
            } else if (b == 4) {
                clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class, Bundle.class};
            }
            declaredMethod = cls.getDeclaredMethod(str, clsArr);
            map.put(str, declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            return declaredMethod;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Code duplicated, block: B:18:0x005a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:20:0x005c A[EDGE_INSN: B:20:0x005c->B:19:0x005c BREAK  A[LOOP:0: B:8:0x0016->B:23:?], SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static ArrayList<String> m2323d(Context context, Object obj, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (obj != null && m2325f(context, obj, str).booleanValue()) {
            String string = null;
            int size = 0;
            do {
                Object objM2324e = m2324e(context, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj, new Object[]{3, f4744c, str, string});
                if (objM2324e == null) {
                    string = null;
                    if (size < 30) {
                        break;
                        break;
                    }
                } else {
                    Bundle bundle = (Bundle) objM2324e;
                    if (bundle.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        if (stringArrayList == null) {
                            break;
                        }
                        size += stringArrayList.size();
                        arrayList.addAll(stringArrayList);
                        string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                    } else {
                        string = null;
                    }
                    if (size < 30) {
                        break;
                    }
                }
            } while (string != null);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static Object m2324e(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method methodM2322c;
        Class<?> clsM2321b = m2321b(context, str);
        if (clsM2321b == null || (methodM2322c = m2322c(clsM2321b, str2)) == null) {
            return null;
        }
        if (obj != null) {
            obj = clsM2321b.cast(obj);
        }
        try {
            return methodM2322c.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m2325f(Context context, Object obj, String str) {
        if (obj == null) {
            return Boolean.FALSE;
        }
        boolean z = false;
        Object objM2324e = m2324e(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f4744c, str});
        if (objM2324e != null && ((Integer) objM2324e).intValue() == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
