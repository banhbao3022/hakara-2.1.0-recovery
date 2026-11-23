package p007c.p165l.p166h0.p174h0;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookSdk;
import p007c.p165l.GraphRequest2;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.AppEventsLoggerImpl3;
import p007c.p165l.p166h0.InternalAppEventsLogger;
import p007c.p165l.p166h0.p168c0.p169p.ViewHierarchy;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.h0.h, reason: use source file name */
/* JADX INFO: compiled from: ViewOnClickListener.java */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListener3 implements View.OnClickListener {

    /* JADX INFO: renamed from: f */
    public static final Set<Integer> f4825f = new HashSet();

    /* JADX INFO: renamed from: g */
    public View.OnClickListener f4826g;

    /* JADX INFO: renamed from: h */
    public WeakReference<View> f4827h;

    /* JADX INFO: renamed from: i */
    public WeakReference<View> f4828i;

    /* JADX INFO: renamed from: j */
    public String f4829j;

    public ViewOnClickListener3(View view, View view2, String str) {
        this.f4826g = ViewHierarchy.m2301e(view);
        this.f4828i = new WeakReference<>(view);
        this.f4827h = new WeakReference<>(view2);
        this.f4829j = str.toLowerCase().replace("activity", "");
    }

    /* JADX INFO: renamed from: a */
    public static void m2356a(String str, String str2, float[] fArr) {
        if (SuggestedEventsManager.f4812b.contains(str)) {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            AppEventsLoggerImpl3 appEventsLoggerImpl3 = new InternalAppEventsLogger(FacebookSdk.f5360i).f4855a;
            Objects.requireNonNull(appEventsLoggerImpl3);
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", str2);
            appEventsLoggerImpl3.m2365d(str, bundle);
            return;
        }
        if (SuggestedEventsManager.f4813c.contains(str)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                for (float f : fArr) {
                    sb.append(f);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle2.putString("metadata", jSONObject.toString());
                Locale locale = Locale.US;
                HashSet<LoggingBehavior> hashSet2 = FacebookSdk.f5352a;
                Validate.m2479h();
                GraphRequest2 graphRequest2M2676m = GraphRequest2.m2676m(null, String.format(locale, "%s/suggested_events", FacebookSdk.f5354c), null, null);
                graphRequest2M2676m.f5380i = bundle2;
                graphRequest2M2676m.m2687d();
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2357b(View view, View view2, String str) {
        Field declaredField;
        Field declaredField2;
        int iHashCode = view.hashCode();
        if (f4825f.contains(Integer.valueOf(iHashCode))) {
            return;
        }
        ViewOnClickListener3 viewOnClickListener3 = new ViewOnClickListener3(view, view2, str);
        Object obj = null;
        try {
            try {
                declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                try {
                    declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                } catch (ClassNotFoundException | NoSuchFieldException unused) {
                    declaredField2 = null;
                }
            } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                declaredField = null;
            }
            if (declaredField == null || declaredField2 == null) {
                view.setOnClickListener(viewOnClickListener3);
            } else {
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                try {
                    declaredField.setAccessible(true);
                    obj = declaredField.get(view);
                } catch (IllegalAccessException unused3) {
                }
                if (obj == null) {
                    view.setOnClickListener(viewOnClickListener3);
                } else {
                    declaredField2.set(obj, viewOnClickListener3);
                }
            }
        } catch (Exception unused4) {
        }
        f4825f.add(Integer.valueOf(iHashCode));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean z;
        View.OnClickListener onClickListener = this.f4826g;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        View view2 = this.f4827h.get();
        View view3 = this.f4828i.get();
        if (view2 == null || view3 == null) {
            return;
        }
        try {
            Map<String, String> map = PredictionHistoryManager.f4807a;
            JSONObject jSONObject = new JSONObject();
            View view4 = view3;
            while (view4 != null) {
                SuggestedEventViewHierarchy.m2349c(view4, jSONObject);
                String str = ViewHierarchy.f4689a;
                ViewParent parent = view4.getParent();
                view4 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            }
            String strM2440M = Utility.m2440M(jSONObject.toString());
            if (strM2440M == null) {
                return;
            }
            String strM2304h = ViewHierarchy.m2304h(view3);
            Map<String, String> map2 = PredictionHistoryManager.f4807a;
            String str2 = map2.containsKey(strM2440M) ? map2.get(strM2440M) : null;
            if (str2 == null) {
                z = false;
            } else {
                if (!str2.equals("other")) {
                    Utility.m2438K(new ViewOnClickListener(str2, strM2304h));
                }
                z = true;
            }
            if (z) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("view", SuggestedEventViewHierarchy.m2348b(view2, view3));
            jSONObject2.put("screenname", this.f4829j);
            Utility.m2438K(new ViewOnClickListener2(this, jSONObject2, strM2304h, strM2440M));
        } catch (Exception unused) {
        }
    }
}
