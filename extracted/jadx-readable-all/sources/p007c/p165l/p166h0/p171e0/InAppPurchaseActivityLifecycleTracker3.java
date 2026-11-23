package p007c.p165l.p166h0.p171e0;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.AppEventQueue;
import p007c.p165l.p166h0.AppEventQueue3;
import p007c.p165l.p166h0.AppEventsLoggerImpl3;
import p007c.p165l.p166h0.InternalAppEventsLogger;
import p007c.p165l.p178k0.FetchedAppGateKeepersManager;
import p007c.p165l.p178k0.Logger3;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.e0.j, reason: use source file name */
/* JADX INFO: compiled from: InAppPurchaseActivityLifecycleTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class InAppPurchaseActivityLifecycleTracker3 {

    /* JADX INFO: renamed from: a */
    public static final String f4734a = "c.l.h0.e0.j";

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f4735b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static Boolean f4736c = null;

    /* JADX INFO: renamed from: d */
    public static Boolean f4737d = null;

    /* JADX INFO: renamed from: e */
    public static ServiceConnection f4738e;

    /* JADX INFO: renamed from: f */
    public static Application.ActivityLifecycleCallbacks f4739f;

    /* JADX INFO: renamed from: g */
    public static Intent f4740g;

    /* JADX INFO: renamed from: h */
    public static Object f4741h;

    /* JADX WARN: Code duplicated, block: B:79:0x028d  */
    /* JADX INFO: renamed from: a */
    public static void m2319a(Context context, ArrayList arrayList, boolean z) {
        AutomaticAnalyticsLogger.a aVar;
        boolean z2;
        boolean z3;
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList<String> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                String string = new JSONObject(str).getString("productId");
                map.put(string, str);
                arrayList2.add(string);
            } catch (JSONException e) {
                Log.e(f4734a, "Error parsing in-app purchase data.", e);
            }
        }
        Object obj = f4741h;
        HashMap<String, Method> map2 = InAppPurchaseEventManager.f4742a;
        HashMap map3 = new HashMap();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        for (String str2 : arrayList2) {
            String string2 = InAppPurchaseEventManager.f4745d.getString(str2, null);
            if (string2 != null) {
                String[] strArrSplit = string2.split(";", 2);
                if (jCurrentTimeMillis - Long.parseLong(strArrSplit[0]) < 43200) {
                    map3.put(str2, strArrSplit[1]);
                }
            }
        }
        ArrayList<String> arrayList3 = new ArrayList<>();
        for (String str3 : arrayList2) {
            if (!map3.containsKey(str3)) {
                arrayList3.add(str3);
            }
        }
        HashMap map4 = new HashMap();
        if (obj != null && !arrayList3.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            Object[] objArr = new Object[4];
            objArr[0] = 3;
            objArr[1] = InAppPurchaseEventManager.f4744c;
            objArr[2] = z ? "subs" : "inapp";
            objArr[3] = bundle;
            Object objM2324e = InAppPurchaseEventManager.m2324e(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
            if (objM2324e != null) {
                Bundle bundle2 = (Bundle) objM2324e;
                if (bundle2.getInt("RESPONSE_CODE") == 0) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList != null && arrayList3.size() == stringArrayList.size()) {
                        for (int i = 0; i < arrayList3.size(); i++) {
                            map4.put(arrayList3.get(i), stringArrayList.get(i));
                        }
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
                    SharedPreferences.Editor editorEdit = InAppPurchaseEventManager.f4745d.edit();
                    for (Map.Entry entry : map4.entrySet()) {
                        editorEdit.putString((String) entry.getKey(), jCurrentTimeMillis2 + ";" + ((String) entry.getValue()));
                    }
                    editorEdit.apply();
                }
            }
        }
        map3.putAll(map4);
        for (Map.Entry entry2 : map3.entrySet()) {
            String str4 = (String) map.get(entry2.getKey());
            String str5 = (String) entry2.getValue();
            if (AutomaticAnalyticsLogger.m2318a()) {
                HashMap map5 = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(str4);
                    JSONObject jSONObject2 = new JSONObject(str5);
                    Bundle bundle3 = new Bundle(1);
                    bundle3.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
                    bundle3.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
                    bundle3.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
                    bundle3.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
                    bundle3.putCharSequence("fb_iap_product_title", jSONObject2.optString(CainMediaMetadataRetriever.METADATA_KEY_TITLE));
                    bundle3.putCharSequence("fb_iap_product_description", jSONObject2.optString(CainMediaMetadataRetriever.METADATA_KEY_DESCRIPTION));
                    String strOptString = jSONObject2.optString("type");
                    bundle3.putCharSequence("fb_iap_product_type", strOptString);
                    if (strOptString.equals("subs")) {
                        bundle3.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                        bundle3.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                        bundle3.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                        String strOptString2 = jSONObject2.optString("introductoryPriceCycles");
                        if (!strOptString2.isEmpty()) {
                            bundle3.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                            bundle3.putCharSequence("fb_intro_price_cycles", strOptString2);
                        }
                    }
                    for (String str6 : map5.keySet()) {
                        bundle3.putCharSequence(str6, (CharSequence) map5.get(str6));
                    }
                    aVar = new AutomaticAnalyticsLogger.a(new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d), Currency.getInstance(jSONObject2.getString("price_currency_code")), bundle3);
                } catch (JSONException e2) {
                    Log.e(AutomaticAnalyticsLogger.f4729a, "Error parsing in-app subscription data.", e2);
                    aVar = null;
                }
                if (aVar != null) {
                    if (z) {
                        Validate.m2479h();
                        if (FetchedAppGateKeepersManager.m2519b("app_events_if_auto_log_subs", FacebookSdk.f5354c, false)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        HashMap<String, Method> map6 = InAppPurchaseEventManager.f4742a;
                        try {
                            String strOptString3 = new JSONObject(str5).optString("freeTrialPeriod");
                            z3 = (strOptString3 == null || strOptString3.isEmpty()) ? false : true;
                        } catch (JSONException unused) {
                        }
                        String str7 = z3 ? "StartTrial" : "Subscribe";
                        InternalAppEventsLogger internalAppEventsLogger = AutomaticAnalyticsLogger.f4730b;
                        BigDecimal bigDecimal = aVar.f4731a;
                        Currency currency = aVar.f4732b;
                        Bundle bundle4 = aVar.f4733c;
                        Objects.requireNonNull(internalAppEventsLogger);
                        if (FacebookSdk.m2659a()) {
                            AppEventsLoggerImpl3 appEventsLoggerImpl3 = internalAppEventsLogger.f4855a;
                            Objects.requireNonNull(appEventsLoggerImpl3);
                            if (bigDecimal == null || currency == null) {
                                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                            } else {
                                if (bundle4 == null) {
                                    bundle4 = new Bundle();
                                }
                                Bundle bundle5 = bundle4;
                                bundle5.putString("fb_currency", currency.getCurrencyCode());
                                appEventsLoggerImpl3.m2366e(str7, Double.valueOf(bigDecimal.doubleValue()), bundle5, true, ActivityLifecycleTracker.m2312b());
                            }
                        }
                    } else {
                        InternalAppEventsLogger internalAppEventsLogger2 = AutomaticAnalyticsLogger.f4730b;
                        BigDecimal bigDecimal2 = aVar.f4731a;
                        Currency currency2 = aVar.f4732b;
                        Bundle bundle6 = aVar.f4733c;
                        Objects.requireNonNull(internalAppEventsLogger2);
                        if (FacebookSdk.m2659a()) {
                            AppEventsLoggerImpl3 appEventsLoggerImpl4 = internalAppEventsLogger2.f4855a;
                            Objects.requireNonNull(appEventsLoggerImpl4);
                            if (bigDecimal2 == null) {
                                HashMap<String, String> map7 = Logger3.f5043a;
                                synchronized (FacebookSdk.f5352a) {
                                }
                            } else if (currency2 == null) {
                                HashMap<String, String> map8 = Logger3.f5043a;
                                synchronized (FacebookSdk.f5352a) {
                                }
                            } else {
                                if (bundle6 == null) {
                                    bundle6 = new Bundle();
                                }
                                bundle6.putString("fb_currency", currency2.getCurrencyCode());
                                appEventsLoggerImpl4.m2366e("fb_mobile_purchase", Double.valueOf(bigDecimal2.doubleValue()), bundle6, true, ActivityLifecycleTracker.m2312b());
                                AppEventsLoggerImpl3.m2362a();
                                AppEventQueue.f4758c.execute(new AppEventQueue3(6));
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
