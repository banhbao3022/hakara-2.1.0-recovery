package p007c.p071d.p072a.p073a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p314j.p326l.C4437a;
import p007c.p190n.p194b.p266d.p314j.p326l.InterfaceC4440d;
import p555j.p556a.p557a.p558a.p559a.p591s.WalletViewModel4;
import p555j.p556a.p557a.p558a.p559a.p591s.WalletViewModel5;

/* JADX INFO: renamed from: c.d.a.a.b */
/* JADX INFO: compiled from: com.android.billingclient:billing@@3.0.3 */
/* JADX INFO: loaded from: classes.dex */
public class C0511b extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public int f2678a;

    /* JADX INFO: renamed from: b */
    public final String f2679b;

    /* JADX INFO: renamed from: c */
    public final Handler f2680c;

    /* JADX INFO: renamed from: d */
    public C0543y f2681d;

    /* JADX INFO: renamed from: e */
    public Context f2682e;

    /* JADX INFO: renamed from: f */
    public InterfaceC4440d f2683f;

    /* JADX INFO: renamed from: g */
    public ServiceConnectionC0538t f2684g;

    /* JADX INFO: renamed from: h */
    public boolean f2685h;

    /* JADX INFO: renamed from: i */
    public boolean f2686i;

    /* JADX INFO: renamed from: j */
    public int f2687j;

    /* JADX INFO: renamed from: k */
    public boolean f2688k;

    /* JADX INFO: renamed from: l */
    public boolean f2689l;

    /* JADX INFO: renamed from: m */
    public boolean f2690m;

    /* JADX INFO: renamed from: n */
    public boolean f2691n;

    /* JADX INFO: renamed from: o */
    public boolean f2692o;

    /* JADX INFO: renamed from: p */
    public boolean f2693p;

    /* JADX INFO: renamed from: q */
    public boolean f2694q;

    /* JADX INFO: renamed from: r */
    public boolean f2695r;

    /* JADX INFO: renamed from: s */
    public boolean f2696s;

    /* JADX INFO: renamed from: t */
    public ExecutorService f2697t;

    public C0511b(String str, Context context, InterfaceC0525i interfaceC0525i) {
        String str2;
        try {
            str2 = (String) Class.forName("c.d.a.b.a").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str2 = "3.0.3";
        }
        this.f2678a = 0;
        this.f2680c = new Handler(Looper.getMainLooper());
        this.f2687j = 0;
        this.f2679b = str2;
        Context applicationContext = context.getApplicationContext();
        this.f2682e = applicationContext;
        this.f2681d = new C0543y(applicationContext, interfaceC0525i);
        this.f2696s = true;
    }

    @Override // p007c.p071d.p072a.p073a.AbstractC0509a
    /* JADX INFO: renamed from: a */
    public final void mo1526a(C0521g c0521g, InterfaceC0523h interfaceC0523h) {
        if (!mo1529d()) {
            ((WalletViewModel4) interfaceC0523h).mo1542a(C0539u.f2768j, c0521g.f2720a);
        } else if (m1538m(new CallableC0510a0(this, c0521g, interfaceC0523h), 30000L, new RunnableC0512b0(interfaceC0523h, c0521g)) == null) {
            ((WalletViewModel4) interfaceC0523h).mo1542a(m1536k(), c0521g.f2720a);
        }
    }

    @Override // p007c.p071d.p072a.p073a.AbstractC0509a
    /* JADX INFO: renamed from: b */
    public final void mo1527b() {
        try {
            try {
                this.f2681d.m1545a();
                ServiceConnectionC0538t serviceConnectionC0538t = this.f2684g;
                if (serviceConnectionC0538t != null) {
                    synchronized (serviceConnectionC0538t.f2755a) {
                        serviceConnectionC0538t.f2757c = null;
                        serviceConnectionC0538t.f2756b = true;
                    }
                }
                if (this.f2684g != null && this.f2683f != null) {
                    C4437a.m10349a("BillingClient", "Unbinding from service.");
                    this.f2682e.unbindService(this.f2684g);
                    this.f2684g = null;
                }
                this.f2683f = null;
                ExecutorService executorService = this.f2697t;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.f2697t = null;
                }
                this.f2678a = 3;
            } catch (Exception e) {
                String strValueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 48);
                sb.append("There was an exception while ending connection: ");
                sb.append(strValueOf);
                C4437a.m10350b("BillingClient", sb.toString());
                this.f2678a = 3;
            }
        } catch (Throwable th) {
            this.f2678a = 3;
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    @Override // p007c.p071d.p072a.p073a.AbstractC0509a
    /* JADX INFO: renamed from: c */
    public final C0519f mo1528c(String str) {
        if (!mo1529d()) {
            return C0539u.f2768j;
        }
        switch (str) {
            case "subscriptions":
                return this.f2685h ? C0539u.f2767i : C0539u.f2765g;
            case "subscriptionsUpdate":
                return this.f2686i ? C0539u.f2767i : C0539u.f2765g;
            case "inAppItemsOnVr":
                return m1534i("inapp");
            case "subscriptionsOnVr":
                return m1534i("subs");
            case "priceChangeConfirmation":
                return this.f2689l ? C0539u.f2767i : C0539u.f2765g;
            case "bbb":
                return this.f2692o ? C0539u.f2767i : C0539u.f2765g;
            case "aaa":
                return this.f2694q ? C0539u.f2767i : C0539u.f2765g;
            case "ddd":
                return this.f2693p ? C0539u.f2767i : C0539u.f2765g;
            case "ccc":
            case "eee":
                return this.f2695r ? C0539u.f2767i : C0539u.f2765g;
            default:
                C4437a.m10350b("BillingClient", str.length() != 0 ? "Unsupported feature: ".concat(str) : new String("Unsupported feature: "));
                return C0539u.f2773o;
        }
    }

    @Override // p007c.p071d.p072a.p073a.AbstractC0509a
    /* JADX INFO: renamed from: d */
    public final boolean mo1529d() {
        return (this.f2678a != 2 || this.f2683f == null || this.f2684g == null) ? false : true;
    }

    @Override // p007c.p071d.p072a.p073a.AbstractC0509a
    /* JADX INFO: renamed from: e */
    public final C0519f mo1530e(Activity activity, C0517e c0517e) {
        String str;
        String str2;
        String str3;
        long j2;
        Future futureM1538m;
        String str4;
        int i;
        String str5;
        boolean z;
        int i2;
        String strOptString;
        String str6 = "BUY_INTENT";
        String str7 = "; try to reconnect";
        if (!mo1529d()) {
            C0519f c0519f = C0539u.f2768j;
            m1537l(c0519f);
            return c0519f;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c0517e.f2711g);
        SkuDetails skuDetails = (SkuDetails) arrayList.get(0);
        String strM12556b = skuDetails.m12556b();
        String str8 = "BillingClient";
        if (strM12556b.equals("subs") && !this.f2685h) {
            C4437a.m10350b("BillingClient", "Current client doesn't support subscriptions.");
            C0519f c0519f2 = C0539u.f2770l;
            m1537l(c0519f2);
            return c0519f2;
        }
        String str9 = c0517e.f2707c;
        if (str9 != null && !this.f2686i) {
            C4437a.m10350b("BillingClient", "Current client doesn't support subscriptions update.");
            C0519f c0519f3 = C0539u.f2771m;
            m1537l(c0519f3);
            return c0519f3;
        }
        if (((!c0517e.f2712h && c0517e.f2706b == null && c0517e.f2709e == null && c0517e.f2710f == 0 && !c0517e.f2705a) ? false : true) && !this.f2688k) {
            C4437a.m10350b("BillingClient", "Current client doesn't support extra params for buy intent.");
            C0519f c0519f4 = C0539u.f2764f;
            m1537l(c0519f4);
            return c0519f4;
        }
        if (arrayList.size() > 1 && !this.f2695r) {
            C4437a.m10350b("BillingClient", "Current client doesn't support multi-item purchases.");
            C0519f c0519f5 = C0539u.f2772n;
            m1537l(c0519f5);
            return c0519f5;
        }
        String str10 = "";
        int i3 = 0;
        String str11 = "";
        while (i3 < arrayList.size()) {
            String strValueOf = String.valueOf(str11);
            String strValueOf2 = String.valueOf(arrayList.get(i3));
            String str12 = str10;
            String strM1550A = outline.m1550A(new StringBuilder(strValueOf.length() + strValueOf2.length()), strValueOf, strValueOf2);
            if (i3 < arrayList.size() - 1) {
                strM1550A = String.valueOf(strM1550A).concat(", ");
            }
            str11 = strM1550A;
            i3++;
            str10 = str12;
        }
        String str13 = str10;
        C4437a.m10349a("BillingClient", outline.m1553D(new StringBuilder(String.valueOf(str11).length() + 41 + strM12556b.length()), "Constructing buy intent for ", str11, ", item type: ", strM12556b));
        if (this.f2688k) {
            boolean z2 = this.f2690m;
            boolean z3 = this.f2696s;
            Bundle bundleM1575Z = outline.m1575Z("playBillingLibraryVersion", this.f2679b);
            int i4 = c0517e.f2710f;
            if (i4 != 0) {
                bundleM1575Z.putInt("prorationMode", i4);
            }
            if (!TextUtils.isEmpty(c0517e.f2706b)) {
                bundleM1575Z.putString("accountId", c0517e.f2706b);
            }
            if (!TextUtils.isEmpty(c0517e.f2709e)) {
                bundleM1575Z.putString("obfuscatedProfileId", c0517e.f2709e);
            }
            if (c0517e.f2712h) {
                i = 1;
                bundleM1575Z.putBoolean("vr", true);
            } else {
                i = 1;
            }
            if (!TextUtils.isEmpty(c0517e.f2707c)) {
                String[] strArr = new String[i];
                strArr[0] = c0517e.f2707c;
                bundleM1575Z.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(strArr)));
            }
            if (!TextUtils.isEmpty(c0517e.f2708d)) {
                bundleM1575Z.putString("oldSkuPurchaseToken", c0517e.f2708d);
            }
            if (!TextUtils.isEmpty(null)) {
                bundleM1575Z.putString("oldSkuPurchaseId", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundleM1575Z.putString("paymentsPurchaseParams", null);
            }
            if (z2 && z3) {
                bundleM1575Z.putBoolean("enablePendingPurchases", true);
            }
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList<String> arrayList4 = new ArrayList<>();
            ArrayList<Integer> arrayList5 = new ArrayList<>();
            int size = arrayList.size();
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            str3 = str11;
            int i5 = 0;
            while (i5 < size) {
                int i6 = size;
                SkuDetails skuDetails2 = (SkuDetails) arrayList.get(i5);
                String str14 = str6;
                if (!skuDetails2.f28133b.optString("skuDetailsToken").isEmpty()) {
                    arrayList2.add(skuDetails2.f28133b.optString("skuDetailsToken"));
                }
                try {
                    strOptString = new JSONObject(skuDetails2.f28132a).optString("offer_id_token");
                } catch (JSONException unused) {
                    strOptString = str13;
                }
                String str15 = str8;
                String strOptString2 = skuDetails2.f28133b.optString("offer_id");
                int iOptInt = skuDetails2.f28133b.optInt("offer_type");
                arrayList3.add(strOptString);
                z4 |= !TextUtils.isEmpty(strOptString);
                arrayList4.add(strOptString2);
                z5 |= !TextUtils.isEmpty(strOptString2);
                arrayList5.add(Integer.valueOf(iOptInt));
                z6 |= iOptInt != 0;
                i5++;
                str6 = str14;
                size = i6;
                str8 = str15;
            }
            str = str6;
            str2 = str8;
            if (!arrayList2.isEmpty()) {
                bundleM1575Z.putStringArrayList("skuDetailsTokens", arrayList2);
            }
            if (z4) {
                if (!this.f2693p) {
                    C0519f c0519f6 = C0539u.f2765g;
                    m1537l(c0519f6);
                    return c0519f6;
                }
                bundleM1575Z.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList3);
            }
            if (z5) {
                bundleM1575Z.putStringArrayList("SKU_OFFER_ID_LIST", arrayList4);
            }
            if (z6) {
                bundleM1575Z.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList5);
            }
            if (TextUtils.isEmpty(skuDetails.m12557c())) {
                str5 = null;
                z = false;
            } else {
                bundleM1575Z.putString("skuPackageName", skuDetails.m12557c());
                str5 = null;
                z = true;
            }
            if (!TextUtils.isEmpty(str5)) {
                bundleM1575Z.putString("accountName", str5);
            }
            if (arrayList.size() > 1) {
                ArrayList<String> arrayList6 = new ArrayList<>(arrayList.size() - 1);
                ArrayList<String> arrayList7 = new ArrayList<>(arrayList.size() - 1);
                for (int i7 = 1; i7 < arrayList.size(); i7++) {
                    arrayList6.add(((SkuDetails) arrayList.get(i7)).m12555a());
                    arrayList7.add(((SkuDetails) arrayList.get(i7)).m12556b());
                }
                bundleM1575Z.putStringArrayList("additionalSkus", arrayList6);
                bundleM1575Z.putStringArrayList("additionalSkuTypes", arrayList7);
            }
            if (!TextUtils.isEmpty(activity.getIntent().getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = activity.getIntent().getStringExtra("PROXY_PACKAGE");
                bundleM1575Z.putString("proxyPackage", stringExtra);
                try {
                    bundleM1575Z.putString("proxyPackageVersion", this.f2682e.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused2) {
                    bundleM1575Z.putString("proxyPackageVersion", "package not found");
                }
            }
            if (this.f2694q && z) {
                i2 = 15;
            } else if (this.f2690m) {
                i2 = 9;
            } else {
                i2 = c0517e.f2712h ? 7 : 6;
            }
            j2 = 5000;
            futureM1538m = m1538m(new CallableC0526i0(this, i2, skuDetails, strM12556b, c0517e, bundleM1575Z), 5000L, null);
        } else {
            str = "BUY_INTENT";
            str7 = "; try to reconnect";
            str2 = "BillingClient";
            str3 = str11;
            j2 = 5000;
            futureM1538m = str9 != null ? m1538m(new CallableC0528j0(this, c0517e, skuDetails), 5000L, null) : m1538m(new CallableC0531m(this, skuDetails, strM12556b), 5000L, null);
        }
        try {
            try {
                try {
                    Bundle bundle = (Bundle) futureM1538m.get(j2, TimeUnit.MILLISECONDS);
                    str4 = str2;
                    try {
                        int iM10352d = C4437a.m10352d(bundle, str4);
                        String strM10353e = C4437a.m10353e(bundle, str4);
                        if (iM10352d == 0) {
                            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                            String str16 = str;
                            intent.putExtra(str16, (PendingIntent) bundle.getParcelable(str16));
                            activity.startActivity(intent);
                            return C0539u.f2767i;
                        }
                        StringBuilder sb = new StringBuilder(52);
                        sb.append("Unable to buy item, Error response code: ");
                        sb.append(iM10352d);
                        C4437a.m10350b(str4, sb.toString());
                        C0519f c0519f7 = new C0519f();
                        c0519f7.f2715a = iM10352d;
                        c0519f7.f2716b = strM10353e;
                        this.f2681d.f2782b.f2778a.mo1543a(c0519f7, null);
                        return c0519f7;
                    } catch (CancellationException | TimeoutException unused3) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 68);
                        sb2.append("Time out while launching billing flow: ; for sku: ");
                        sb2.append(str3);
                        sb2.append(str7);
                        C4437a.m10350b(str4, sb2.toString());
                        C0519f c0519f8 = C0539u.f2769k;
                        m1537l(c0519f8);
                        return c0519f8;
                    } catch (Exception unused4) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 69);
                        sb3.append("Exception while launching billing flow: ; for sku: ");
                        sb3.append(str3);
                        sb3.append(str7);
                        C4437a.m10350b(str4, sb3.toString());
                        C0519f c0519f9 = C0539u.f2768j;
                        m1537l(c0519f9);
                        return c0519f9;
                    }
                } catch (CancellationException | TimeoutException unused5) {
                    str4 = str2;
                }
            } catch (CancellationException | TimeoutException unused6) {
                str4 = str2;
            }
        } catch (Exception unused7) {
            str4 = str2;
        }
    }

    @Override // p007c.p071d.p072a.p073a.AbstractC0509a
    /* JADX INFO: renamed from: f */
    public final Purchase.C5777a mo1531f(String str) {
        if (!mo1529d()) {
            return new Purchase.C5777a(C0539u.f2768j, null);
        }
        if (TextUtils.isEmpty(str)) {
            C4437a.m10350b("BillingClient", "Please provide a valid SKU type.");
            return new Purchase.C5777a(C0539u.f2763e, null);
        }
        try {
            return (Purchase.C5777a) m1538m(new CallableC0532n(this, str), 5000L, null).get(5000L, TimeUnit.MILLISECONDS);
        } catch (CancellationException | TimeoutException unused) {
            return new Purchase.C5777a(C0539u.f2769k, null);
        } catch (Exception unused2) {
            return new Purchase.C5777a(C0539u.f2766h, null);
        }
    }

    @Override // p007c.p071d.p072a.p073a.AbstractC0509a
    /* JADX INFO: renamed from: g */
    public final void mo1532g(C0527j c0527j, InterfaceC0529k interfaceC0529k) {
        if (!mo1529d()) {
            interfaceC0529k.mo1539a(C0539u.f2768j, null);
            return;
        }
        String str = c0527j.f2733a;
        List<String> list = c0527j.f2734b;
        if (TextUtils.isEmpty(str)) {
            C4437a.m10350b("BillingClient", "Please fix the input params. SKU type can't be empty.");
            interfaceC0529k.mo1539a(C0539u.f2763e, null);
            return;
        }
        if (list == null) {
            C4437a.m10350b("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
            interfaceC0529k.mo1539a(C0539u.f2762d, null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("SKU must be set.");
            }
            arrayList.add(new C0541w(str2));
        }
        if (m1538m(new CallableC0534p(this, str, arrayList, interfaceC0529k), 30000L, new RunnableC0544z(interfaceC0529k)) == null) {
            interfaceC0529k.mo1539a(m1536k(), null);
        }
    }

    @Override // p007c.p071d.p072a.p073a.AbstractC0509a
    /* JADX INFO: renamed from: h */
    public final void mo1533h(InterfaceC0515d interfaceC0515d) {
        ServiceInfo serviceInfo;
        if (mo1529d()) {
            C4437a.m10349a("BillingClient", "Service connection is valid. No need to re-initialize.");
            ((WalletViewModel5) interfaceC0515d).mo1540b(C0539u.f2767i);
            return;
        }
        int i = this.f2678a;
        if (i == 1) {
            C4437a.m10350b("BillingClient", "Client is already in the process of connecting to billing service.");
            ((WalletViewModel5) interfaceC0515d).mo1540b(C0539u.f2761c);
            return;
        }
        if (i == 3) {
            C4437a.m10350b("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            ((WalletViewModel5) interfaceC0515d).mo1540b(C0539u.f2768j);
            return;
        }
        this.f2678a = 1;
        C0543y c0543y = this.f2681d;
        C0542x c0542x = c0543y.f2782b;
        Context context = c0543y.f2781a;
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        if (!c0542x.f2779b) {
            context.registerReceiver(c0542x.f2780c.f2782b, intentFilter);
            c0542x.f2779b = true;
        }
        C4437a.m10349a("BillingClient", "Starting in-app billing setup.");
        this.f2684g = new ServiceConnectionC0538t(this, interfaceC0515d);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.f2682e.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty() && (serviceInfo = listQueryIntentServices.get(0).serviceInfo) != null) {
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!"com.android.vending".equals(str) || str2 == null) {
                C4437a.m10350b("BillingClient", "The device doesn't have valid Play Store.");
            } else {
                ComponentName componentName = new ComponentName(str, str2);
                Intent intent2 = new Intent(intent);
                intent2.setComponent(componentName);
                intent2.putExtra("playBillingLibraryVersion", this.f2679b);
                if (this.f2682e.bindService(intent2, this.f2684g, 1)) {
                    C4437a.m10349a("BillingClient", "Service was bonded successfully.");
                    return;
                }
                C4437a.m10350b("BillingClient", "Connection to Billing service is blocked.");
            }
        }
        this.f2678a = 0;
        C4437a.m10349a("BillingClient", "Billing service unavailable on device.");
        ((WalletViewModel5) interfaceC0515d).mo1540b(C0539u.f2760b);
    }

    /* JADX INFO: renamed from: i */
    public final C0519f m1534i(String str) {
        try {
            return ((Integer) m1538m(new CallableC0518e0(this, str), 5000L, null).get(5000L, TimeUnit.MILLISECONDS)).intValue() == 0 ? C0539u.f2767i : C0539u.f2765g;
        } catch (Exception unused) {
            C4437a.m10350b("BillingClient", "Exception while checking if billing is supported; try to reconnect");
            return C0539u.f2768j;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m1535j(Runnable runnable) {
        if (Thread.interrupted()) {
            return;
        }
        this.f2680c.post(runnable);
    }

    /* JADX INFO: renamed from: k */
    public final C0519f m1536k() {
        int i = this.f2678a;
        return (i == 0 || i == 3) ? C0539u.f2768j : C0539u.f2766h;
    }

    /* JADX INFO: renamed from: l */
    public final C0519f m1537l(C0519f c0519f) {
        this.f2681d.f2782b.f2778a.mo1543a(c0519f, null);
        return c0519f;
    }

    /* JADX INFO: renamed from: m */
    public final <T> Future<T> m1538m(Callable<T> callable, long j2, Runnable runnable) {
        long j3 = (long) (j2 * 0.95d);
        if (this.f2697t == null) {
            this.f2697t = Executors.newFixedThreadPool(C4437a.f23683a, new ThreadFactoryC0514c0(this));
        }
        try {
            Future<T> futureSubmit = this.f2697t.submit(callable);
            this.f2680c.postDelayed(new RunnableC0516d0(futureSubmit, runnable), j3);
            return futureSubmit;
        } catch (Exception e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 28);
            sb.append("Async task throws exception ");
            sb.append(strValueOf);
            C4437a.m10350b("BillingClient", sb.toString());
            return null;
        }
    }
}
