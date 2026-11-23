package p007c.p165l.p178k0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookOperationCanceledException;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p182l0.DefaultAudience;

/* JADX INFO: renamed from: c.l.k0.z, reason: use source file name */
/* JADX INFO: compiled from: NativeProtocol.java */
/* JADX INFO: loaded from: classes.dex */
public final class NativeProtocol {

    /* JADX INFO: renamed from: a */
    public static final String f5057a = "c.l.k0.z";

    /* JADX INFO: renamed from: b */
    public static final List<f> f5058b;

    /* JADX INFO: renamed from: c */
    public static final List<f> f5059c;

    /* JADX INFO: renamed from: d */
    public static final Map<String, List<f>> f5060d;

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f5061e;

    /* JADX INFO: renamed from: f */
    public static final List<Integer> f5062f;

    /* JADX INFO: renamed from: c.l.k0.z$a */
    /* JADX INFO: compiled from: NativeProtocol.java */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                Iterator<f> it = NativeProtocol.f5058b.iterator();
                while (it.hasNext()) {
                    it.next().m2553a(true);
                }
                NativeProtocol.f5061e.set(false);
            } catch (Throwable th) {
                NativeProtocol.f5061e.set(false);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c.l.k0.z$b */
    /* JADX INFO: compiled from: NativeProtocol.java */
    public static class b extends f {
        public b(a aVar) {
            super(null);
        }

        @Override // p007c.p165l.p178k0.NativeProtocol.f
        /* JADX INFO: renamed from: b */
        public String mo2551b() {
            return null;
        }

        @Override // p007c.p165l.p178k0.NativeProtocol.f
        /* JADX INFO: renamed from: c */
        public String mo2552c() {
            return "com.facebook.arstudio.player";
        }
    }

    /* JADX INFO: renamed from: c.l.k0.z$c */
    /* JADX INFO: compiled from: NativeProtocol.java */
    public static class c extends f {
        public c(a aVar) {
            super(null);
        }

        @Override // p007c.p165l.p178k0.NativeProtocol.f
        /* JADX INFO: renamed from: b */
        public String mo2551b() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        @Override // p007c.p165l.p178k0.NativeProtocol.f
        /* JADX INFO: renamed from: c */
        public String mo2552c() {
            return "com.facebook.lite";
        }
    }

    /* JADX INFO: renamed from: c.l.k0.z$d */
    /* JADX INFO: compiled from: NativeProtocol.java */
    public static class d extends f {
        public d(a aVar) {
            super(null);
        }

        @Override // p007c.p165l.p178k0.NativeProtocol.f
        /* JADX INFO: renamed from: b */
        public String mo2551b() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // p007c.p165l.p178k0.NativeProtocol.f
        /* JADX INFO: renamed from: c */
        public String mo2552c() {
            return "com.facebook.katana";
        }
    }

    /* JADX INFO: renamed from: c.l.k0.z$e */
    /* JADX INFO: compiled from: NativeProtocol.java */
    public static class e extends f {
        public e(a aVar) {
            super(null);
        }

        @Override // p007c.p165l.p178k0.NativeProtocol.f
        /* JADX INFO: renamed from: b */
        public String mo2551b() {
            return null;
        }

        @Override // p007c.p165l.p178k0.NativeProtocol.f
        /* JADX INFO: renamed from: c */
        public String mo2552c() {
            return "com.facebook.orca";
        }
    }

    /* JADX INFO: renamed from: c.l.k0.z$f */
    /* JADX INFO: compiled from: NativeProtocol.java */
    public static abstract class f {

        /* JADX INFO: renamed from: a */
        public TreeSet<Integer> f5063a;

        public f() {
        }

        /* JADX WARN: Code duplicated, block: B:8:0x000d A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d), top: B:14:0x0003 }] */
        /* JADX INFO: renamed from: a */
        public final synchronized void m2553a(boolean z) {
            if (z) {
                this.f5063a = NativeProtocol.m2537a(this);
            } else {
                TreeSet<Integer> treeSet = this.f5063a;
                if (treeSet == null || treeSet.isEmpty()) {
                    this.f5063a = NativeProtocol.m2537a(this);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract String mo2551b();

        /* JADX INFO: renamed from: c */
        public abstract String mo2552c();

        public f(a aVar) {
        }
    }

    /* JADX INFO: renamed from: c.l.k0.z$g */
    /* JADX INFO: compiled from: NativeProtocol.java */
    public static class g {

        /* JADX INFO: renamed from: a */
        public f f5064a;

        /* JADX INFO: renamed from: b */
        public int f5065b;
    }

    /* JADX INFO: renamed from: c.l.k0.z$h */
    /* JADX INFO: compiled from: NativeProtocol.java */
    public static class h extends f {
        public h(a aVar) {
            super(null);
        }

        @Override // p007c.p165l.p178k0.NativeProtocol.f
        /* JADX INFO: renamed from: b */
        public String mo2551b() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // p007c.p165l.p178k0.NativeProtocol.f
        /* JADX INFO: renamed from: c */
        public String mo2552c() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d(null));
        arrayList.add(new h(null));
        f5058b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new d(null));
        arrayList2.add(new h(null));
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList3.add(0, new b(null));
        f5059c = arrayList3;
        HashMap map = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new e(null));
        map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList);
        map.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList);
        map.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList);
        map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList);
        map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList4);
        map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList4);
        map.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayList3);
        map.put("com.facebook.platform.action.request.SHARE_STORY", arrayList);
        f5060d = map;
        f5061e = new AtomicBoolean(false);
        f5062f = Arrays.asList(20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101);
    }

    /* JADX INFO: renamed from: a */
    public static TreeSet m2537a(f fVar) {
        ProviderInfo providerInfoResolveContentProvider;
        TreeSet treeSet = new TreeSet();
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        ContentResolver contentResolver = FacebookSdk.f5360i.getContentResolver();
        String[] strArr = {"version"};
        StringBuilder sbM1556G = outline.m1556G("content://");
        sbM1556G.append(fVar.mo2552c());
        sbM1556G.append(".provider.PlatformProvider/versions");
        Uri uri = Uri.parse(sbM1556G.toString());
        Cursor cursorQuery = null;
        try {
            Validate.m2479h();
            try {
                providerInfoResolveContentProvider = FacebookSdk.f5360i.getPackageManager().resolveContentProvider(fVar.mo2552c() + ".provider.PlatformProvider", 0);
            } catch (RuntimeException e2) {
                Log.e(f5057a, "Failed to query content resolver.", e2);
                providerInfoResolveContentProvider = null;
            }
            if (providerInfoResolveContentProvider != null) {
                try {
                    cursorQuery = contentResolver.query(uri, strArr, null, null, null);
                } catch (IllegalArgumentException | NullPointerException | SecurityException unused) {
                    Log.e(f5057a, "Failed to query content resolver.");
                }
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("version"))));
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return treeSet;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m2538b(FacebookException facebookException) {
        Bundle bundle = new Bundle();
        bundle.putString("error_description", facebookException.toString());
        if (facebookException instanceof FacebookOperationCanceledException) {
            bundle.putString("error_type", "UserCanceled");
        }
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public static Intent m2539c(f fVar, String str, Collection collection, String str2, boolean z, DefaultAudience defaultAudience, String str3, String str4) {
        String strMo2551b = fVar.mo2551b();
        if (strMo2551b == null) {
            return null;
        }
        Intent intentPutExtra = new Intent().setClassName(fVar.mo2552c(), strMo2551b).putExtra("client_id", str);
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        intentPutExtra.putExtra("facebook_sdk_version", "5.15.3");
        if (!Utility.m2467z(collection)) {
            intentPutExtra.putExtra("scope", TextUtils.join(",", collection));
        }
        if (!Utility.m2466y(str2)) {
            intentPutExtra.putExtra("e2e", str2);
        }
        intentPutExtra.putExtra("state", str3);
        intentPutExtra.putExtra("response_type", "token,signed_request,graph_domain");
        intentPutExtra.putExtra("return_scopes", "true");
        if (z) {
            intentPutExtra.putExtra("default_audience", defaultAudience.f5075k);
        }
        intentPutExtra.putExtra("legacy_override", FacebookSdk.m2662d());
        intentPutExtra.putExtra("auth_type", str4);
        return intentPutExtra;
    }

    /* JADX INFO: renamed from: d */
    public static Intent m2540d(Intent intent, Bundle bundle, FacebookException facebookException) {
        UUID uuidM2542f = m2542f(intent);
        if (uuidM2542f == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", uuidM2542f.toString());
        if (facebookException != null) {
            bundle2.putBundle("error", m2538b(facebookException));
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null) {
            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent2;
    }

    /* JADX INFO: renamed from: e */
    public static Bundle m2541e(Intent intent) {
        if (m2547k(intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0))) {
            return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static UUID m2542f(Intent intent) {
        String stringExtra;
        if (intent == null) {
            return null;
        }
        if (m2547k(intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0))) {
            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
        } else {
            stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        if (stringExtra == null) {
            return null;
        }
        try {
            return UUID.fromString(stringExtra);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static FacebookException m2543g(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        if (string == null) {
            string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        if (string2 == null) {
            string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        return (string == null || !string.equalsIgnoreCase("UserCanceled")) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
    }

    /* JADX INFO: renamed from: h */
    public static g m2544h(List<f> list, int[] iArr) {
        int iMin;
        m2549m();
        if (list == null) {
            g gVar = new g();
            gVar.f5065b = -1;
            return gVar;
        }
        for (f fVar : list) {
            TreeSet<Integer> treeSet = fVar.f5063a;
            if (treeSet == null || treeSet.isEmpty()) {
                fVar.m2553a(false);
            }
            TreeSet<Integer> treeSet2 = fVar.f5063a;
            int iM2545i = m2545i();
            int length = iArr.length - 1;
            Iterator<Integer> itDescendingIterator = treeSet2.descendingIterator();
            int iMax = -1;
            while (true) {
                if (itDescendingIterator.hasNext()) {
                    int iIntValue = itDescendingIterator.next().intValue();
                    iMax = Math.max(iMax, iIntValue);
                    while (length >= 0 && iArr[length] > iIntValue) {
                        length--;
                    }
                    if (length >= 0) {
                        if (iArr[length] == iIntValue) {
                            if (length % 2 == 0) {
                                iMin = Math.min(iMax, iM2545i);
                                break;
                            }
                        }
                    }
                }
                iMin = -1;
                break;
            }
            if (iMin != -1) {
                g gVar2 = new g();
                gVar2.f5064a = fVar;
                gVar2.f5065b = iMin;
                return gVar2;
            }
        }
        g gVar3 = new g();
        gVar3.f5065b = -1;
        return gVar3;
    }

    /* JADX INFO: renamed from: i */
    public static final int m2545i() {
        return f5062f.get(0).intValue();
    }

    /* JADX INFO: renamed from: j */
    public static Bundle m2546j(Intent intent) {
        return !m2547k(intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2547k(int i) {
        return f5062f.contains(Integer.valueOf(i)) && i >= 20140701;
    }

    /* JADX INFO: renamed from: l */
    public static void m2548l(Intent intent, String str, String str2, int i, Bundle bundle) {
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        String str3 = FacebookSdk.f5354c;
        Validate.m2479h();
        String str4 = FacebookSdk.f5355d;
        intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", str3);
        if (!m2547k(i)) {
            intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
            if (!Utility.m2466y(str4)) {
                intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", str4);
            }
            intent.putExtras(bundle);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", str);
        Utility.m2434G(bundle2, "app_name", str4);
        intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
    }

    /* JADX INFO: renamed from: m */
    public static void m2549m() {
        if (f5061e.compareAndSet(false, true)) {
            FacebookSdk.m2660b().execute(new a());
        }
    }

    /* JADX INFO: renamed from: n */
    public static Intent m2550n(Context context, Intent intent) {
        ResolveInfo resolveInfoResolveActivity;
        if (intent == null || (resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null || !FacebookSignatureValidator.m2512a(context, resolveInfoResolveActivity.activityInfo.packageName)) {
            return null;
        }
        return intent;
    }
}
