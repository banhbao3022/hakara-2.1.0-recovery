package p007c.p165l.p166h0.p167b0;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p165l.FacebookSdk;
import p007c.p165l.p166h0.UserDataStore;
import p007c.p165l.p166h0.UserDataStore2;
import p007c.p165l.p166h0.p168c0.p169p.ViewHierarchy;
import p007c.p165l.p178k0.Utility;

/* JADX INFO: renamed from: c.l.h0.b0.e, reason: use source file name */
/* JADX INFO: compiled from: MetadataViewObserver.java */
/* JADX INFO: loaded from: classes.dex */
public final class MetadataViewObserver implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: f */
    public static final Map<Integer, MetadataViewObserver> f4599f = new HashMap();

    /* JADX INFO: renamed from: i */
    public WeakReference<Activity> f4602i;

    /* JADX INFO: renamed from: g */
    public final Set<String> f4600g = new HashSet();

    /* JADX INFO: renamed from: h */
    public final Handler f4601h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j */
    public AtomicBoolean f4603j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c.l.h0.b0.e$a */
    /* JADX INFO: compiled from: MetadataViewObserver.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ View f4604f;

        public a(View view) {
            this.f4604f = view;
        }

        /* JADX WARN: Code duplicated, block: B:48:0x0101  */
        @Override // java.lang.Runnable
        public void run() {
            ViewGroup viewGroup;
            View view = this.f4604f;
            if (view instanceof EditText) {
                MetadataViewObserver metadataViewObserver = MetadataViewObserver.this;
                Objects.requireNonNull(metadataViewObserver);
                String strTrim = ((EditText) view).getText().toString().trim();
                if (strTrim.isEmpty() || metadataViewObserver.f4600g.contains(strTrim) || strTrim.length() > 100) {
                    return;
                }
                metadataViewObserver.f4600g.add(strTrim);
                HashMap map = new HashMap();
                List<MetadataRule> list = MetadataRule.f4595a;
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                for (MetadataRule metadataRule : new ArrayList(MetadataRule.f4595a)) {
                    if (strTrim.matches(metadataRule.f4598d)) {
                        if (arrayList == null) {
                            ArrayList<String> arrayList3 = new ArrayList();
                            arrayList3.add(ViewHierarchy.m2303g(view));
                            Object tag = view.getTag();
                            if (tag != null) {
                                arrayList3.add(tag.toString());
                            }
                            CharSequence contentDescription = view.getContentDescription();
                            if (contentDescription != null) {
                                arrayList3.add(contentDescription.toString());
                            }
                            try {
                                if (view.getId() != -1) {
                                    String[] strArrSplit = view.getResources().getResourceName(view.getId()).split("/");
                                    if (strArrSplit.length == 2) {
                                        arrayList3.add(strArrSplit[1]);
                                    }
                                }
                            } catch (Resources.NotFoundException unused) {
                            }
                            ArrayList arrayList4 = new ArrayList();
                            for (String str : arrayList3) {
                                if (!str.isEmpty() && str.length() <= 100) {
                                    arrayList4.add(str.toLowerCase());
                                }
                            }
                            arrayList = arrayList4;
                        }
                        if (MetadataMatcher.m2281b(arrayList, new ArrayList(metadataRule.f4597c))) {
                            map.put(metadataRule.f4596b, strTrim);
                        } else {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                String str2 = ViewHierarchy.f4689a;
                                if (view == null) {
                                    viewGroup = null;
                                } else {
                                    ViewParent parent = view.getParent();
                                    if (parent instanceof ViewGroup) {
                                        viewGroup = (ViewGroup) parent;
                                    } else {
                                        viewGroup = null;
                                    }
                                }
                                if (viewGroup != null) {
                                    for (View view2 : (ArrayList) ViewHierarchy.m2297a(viewGroup)) {
                                        if (view != view2) {
                                            arrayList2.addAll(MetadataMatcher.m2280a(view2));
                                        }
                                    }
                                }
                            }
                            if (MetadataMatcher.m2281b(arrayList2, new ArrayList(metadataRule.f4597c))) {
                                map.put(metadataRule.f4596b, strTrim);
                            }
                        }
                    }
                }
                if (!UserDataStore.f4591c.get()) {
                    UserDataStore.m2279a();
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    String str3 = (String) ((Map.Entry) it.next()).getKey();
                    String lowerCase = ((String) map.get(str3)).trim().trim().toLowerCase();
                    if ("em".equals(str3)) {
                        if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                            Log.e(UserDataStore.f4589a, "Setting email failure: this is not a valid email address");
                            lowerCase = "";
                        }
                    } else if ("ph".equals(str3)) {
                        lowerCase = lowerCase.replaceAll("[^0-9]", "");
                    } else if ("ge".equals(str3)) {
                        lowerCase = lowerCase.length() > 0 ? lowerCase.substring(0, 1) : "";
                        if (!"f".equals(lowerCase) && !"m".equals(lowerCase)) {
                            Log.e(UserDataStore.f4589a, "Setting gender failure: the supported value for gender is f or m");
                            lowerCase = "";
                        }
                    }
                    String strM2440M = Utility.m2440M(lowerCase);
                    ConcurrentHashMap<String, String> concurrentHashMap = UserDataStore.f4593e;
                    if (concurrentHashMap.containsKey(str3)) {
                        String str4 = concurrentHashMap.get(str3);
                        String[] strArrSplit2 = str4 != null ? str4.split(",") : new String[0];
                        HashSet hashSet = new HashSet(Arrays.asList(strArrSplit2));
                        if (hashSet.contains(strM2440M)) {
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        if (strArrSplit2.length == 0) {
                            sb.append(strM2440M);
                        } else if (strArrSplit2.length < 5) {
                            sb.append(str4);
                            sb.append(",");
                            sb.append(strM2440M);
                        } else {
                            for (int i = 1; i < 5; i++) {
                                sb.append(strArrSplit2[i]);
                                sb.append(",");
                            }
                            sb.append(strM2440M);
                            hashSet.remove(strArrSplit2[0]);
                        }
                        UserDataStore.f4593e.put(str3, sb.toString());
                    } else {
                        concurrentHashMap.put(str3, strM2440M);
                    }
                }
                FacebookSdk.m2660b().execute(new UserDataStore2("com.facebook.appevents.UserDataStore.internalUserData", Utility.m2431D(UserDataStore.f4593e)));
            }
        }
    }

    public MetadataViewObserver(Activity activity) {
        this.f4602i = new WeakReference<>(activity);
    }

    /* JADX INFO: renamed from: b */
    public static void m2284b(Activity activity) {
        MetadataViewObserver metadataViewObserver;
        Window window;
        int iHashCode = activity.hashCode();
        Map<Integer, MetadataViewObserver> map = f4599f;
        if (map.containsKey(Integer.valueOf(iHashCode))) {
            metadataViewObserver = map.get(Integer.valueOf(iHashCode));
        } else {
            metadataViewObserver = new MetadataViewObserver(activity);
            map.put(Integer.valueOf(activity.hashCode()), metadataViewObserver);
        }
        if (metadataViewObserver.f4603j.getAndSet(true)) {
            return;
        }
        Activity activity2 = metadataViewObserver.f4602i.get();
        View rootView = null;
        if (activity2 != null && (window = activity2.getWindow()) != null) {
            rootView = window.getDecorView().getRootView();
        }
        if (rootView == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalFocusChangeListener(metadataViewObserver);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2285a(View view) {
        a aVar = new a(view);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            aVar.run();
        } else {
            this.f4601h.post(aVar);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (view != null) {
            m2285a(view);
        }
        if (view2 != null) {
            m2285a(view2);
        }
    }
}
