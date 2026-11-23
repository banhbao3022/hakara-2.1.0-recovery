package p007c.p165l.p166h0.p171e0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.e0.i, reason: use source file name */
/* JADX INFO: compiled from: InAppPurchaseActivityLifecycleTracker.java */
/* JADX INFO: loaded from: classes.dex */
public final class InAppPurchaseActivityLifecycleTracker2 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: c.l.h0.e0.i$a */
    /* JADX INFO: compiled from: InAppPurchaseActivityLifecycleTracker.java */
    public class a implements Runnable {
        public a(InAppPurchaseActivityLifecycleTracker2 inAppPurchaseActivityLifecycleTracker2) {
        }

        @Override // java.lang.Runnable
        public void run() {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            Context context = FacebookSdk.f5360i;
            InAppPurchaseActivityLifecycleTracker3.m2319a(context, InAppPurchaseEventManager.m2320a(InAppPurchaseEventManager.m2323d(context, InAppPurchaseActivityLifecycleTracker3.f4741h, "inapp")), false);
            InAppPurchaseActivityLifecycleTracker3.m2319a(context, InAppPurchaseEventManager.m2320a(InAppPurchaseEventManager.m2323d(context, InAppPurchaseActivityLifecycleTracker3.f4741h, "subs")), true);
        }
    }

    /* JADX INFO: renamed from: c.l.h0.e0.i$b */
    /* JADX INFO: compiled from: InAppPurchaseActivityLifecycleTracker.java */
    public class b implements Runnable {
        public b(InAppPurchaseActivityLifecycleTracker2 inAppPurchaseActivityLifecycleTracker2) {
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
        @Override // java.lang.Runnable
        public void run() {
            Class<?> clsM2321b;
            ArrayList<String> stringArrayList;
            long j2;
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            Context context = FacebookSdk.f5360i;
            ArrayList<String> arrayListM2320a = InAppPurchaseEventManager.m2320a(InAppPurchaseEventManager.m2323d(context, InAppPurchaseActivityLifecycleTracker3.f4741h, "inapp"));
            char c2 = 0;
            if (arrayListM2320a.isEmpty()) {
                Object obj = InAppPurchaseActivityLifecycleTracker3.f4741h;
                ArrayList<String> arrayList = new ArrayList<>();
                if (obj == null || (clsM2321b = InAppPurchaseEventManager.m2321b(context, "com.android.vending.billing.IInAppBillingService")) == null || InAppPurchaseEventManager.m2322c(clsM2321b, "getPurchaseHistory") == null) {
                    arrayListM2320a = arrayList;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    if (InAppPurchaseEventManager.m2325f(context, obj, "inapp").booleanValue()) {
                        String string = null;
                        int i = 0;
                        boolean z = false;
                        while (true) {
                            Object[] objArr = new Object[5];
                            objArr[c2] = 6;
                            objArr[1] = InAppPurchaseEventManager.f4744c;
                            objArr[2] = "inapp";
                            objArr[3] = string;
                            objArr[4] = new Bundle();
                            Object objM2324e = InAppPurchaseEventManager.m2324e(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, objArr);
                            if (objM2324e != null) {
                                long j3 = 1000;
                                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                                Bundle bundle = (Bundle) objM2324e;
                                if (bundle.getInt("RESPONSE_CODE") != 0 || (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) == null) {
                                    string = null;
                                } else {
                                    for (String str : stringArrayList) {
                                        try {
                                            try {
                                                j2 = 1000;
                                                try {
                                                    if (jCurrentTimeMillis - (new JSONObject(str).getLong("purchaseTime") / 1000) > 1200) {
                                                        z = true;
                                                        break;
                                                    } else {
                                                        arrayList2.add(str);
                                                        i++;
                                                    }
                                                } catch (JSONException unused) {
                                                    continue;
                                                }
                                            } catch (JSONException unused2) {
                                                j2 = 1000;
                                            }
                                        } catch (JSONException unused3) {
                                            j2 = j3;
                                        }
                                        j3 = j2;
                                    }
                                    string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                                }
                            } else {
                                string = null;
                            }
                            if (i >= 30 || string == null || z) {
                                break;
                            } else {
                                c2 = 0;
                            }
                        }
                    }
                    arrayListM2320a = InAppPurchaseEventManager.m2320a(arrayList2);
                }
            }
            InAppPurchaseActivityLifecycleTracker3.m2319a(context, arrayListM2320a, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        try {
            FacebookSdk.m2660b().execute(new a(this));
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        try {
            if (InAppPurchaseActivityLifecycleTracker3.f4737d.booleanValue() && activity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity")) {
                FacebookSdk.m2660b().execute(new b(this));
            }
        } catch (Exception unused) {
        }
    }
}
