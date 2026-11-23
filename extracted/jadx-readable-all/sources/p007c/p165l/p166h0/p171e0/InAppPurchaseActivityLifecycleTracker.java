package p007c.p165l.p166h0.p171e0;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.e0.h, reason: use source file name */
/* JADX INFO: compiled from: InAppPurchaseActivityLifecycleTracker.java */
/* JADX INFO: loaded from: classes.dex */
public final class InAppPurchaseActivityLifecycleTracker implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        Context context = FacebookSdk.f5360i;
        HashMap<String, Method> map = InAppPurchaseEventManager.f4742a;
        InAppPurchaseActivityLifecycleTracker3.f4741h = InAppPurchaseEventManager.m2324e(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
