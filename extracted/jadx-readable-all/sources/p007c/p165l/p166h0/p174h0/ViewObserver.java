package p007c.p165l.p166h0.p174h0;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p165l.p166h0.p168c0.p169p.SensitiveUserDataUtils;
import p007c.p165l.p166h0.p168c0.p169p.ViewHierarchy;

/* JADX INFO: renamed from: c.l.h0.h0.e, reason: use source file name */
/* JADX INFO: compiled from: ViewObserver.java */
/* JADX INFO: loaded from: classes.dex */
public final class ViewObserver implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: f */
    public static final Map<Integer, ViewObserver> f4814f = new HashMap();

    /* JADX INFO: renamed from: g */
    public WeakReference<Activity> f4815g;

    /* JADX INFO: renamed from: h */
    public final Handler f4816h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i */
    public AtomicBoolean f4817i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c.l.h0.h0.e$a */
    /* JADX INFO: compiled from: ViewObserver.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                View viewM2354a = ViewObserver.this.m2354a();
                Activity activity = ViewObserver.this.f4815g.get();
                if (viewM2354a != null && activity != null) {
                    for (View view : (ArrayList) SuggestedEventViewHierarchy.m2347a(viewM2354a)) {
                        if (!SensitiveUserDataUtils.m2296a(view)) {
                            String strM2304h = ViewHierarchy.m2304h(view);
                            if (!strM2304h.isEmpty() && strM2304h.length() <= 300) {
                                ViewOnClickListener3.m2357b(view, viewM2354a, activity.getLocalClassName());
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public ViewObserver(Activity activity) {
        this.f4815g = new WeakReference<>(activity);
    }

    /* JADX INFO: renamed from: c */
    public static void m2352c(Activity activity) {
        View viewM2354a;
        int iHashCode = activity.hashCode();
        Map<Integer, ViewObserver> map = f4814f;
        if (map.containsKey(Integer.valueOf(iHashCode))) {
            return;
        }
        ViewObserver viewObserver = new ViewObserver(activity);
        map.put(Integer.valueOf(iHashCode), viewObserver);
        if (viewObserver.f4817i.getAndSet(true) || (viewM2354a = viewObserver.m2354a()) == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = viewM2354a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(viewObserver);
            viewObserver.m2355b();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2353d(Activity activity) {
        View viewM2354a;
        int iHashCode = activity.hashCode();
        Map<Integer, ViewObserver> map = f4814f;
        if (map.containsKey(Integer.valueOf(iHashCode))) {
            ViewObserver viewObserver = map.get(Integer.valueOf(iHashCode));
            map.remove(Integer.valueOf(iHashCode));
            if (viewObserver.f4817i.getAndSet(false) && (viewM2354a = viewObserver.m2354a()) != null) {
                ViewTreeObserver viewTreeObserver = viewM2354a.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(viewObserver);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final View m2354a() {
        Window window;
        Activity activity = this.f4815g.get();
        if (activity == null || (window = activity.getWindow()) == null) {
            return null;
        }
        return window.getDecorView().getRootView();
    }

    /* JADX INFO: renamed from: b */
    public final void m2355b() {
        a aVar = new a();
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            aVar.run();
        } else {
            this.f4816h.post(aVar);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        m2355b();
    }
}
