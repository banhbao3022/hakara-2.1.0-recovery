package p636z0.p725k.p739l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p729e.Insets;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityViewCommand;

/* JADX INFO: renamed from: z0.k.l.q, reason: use source file name */
/* JADX INFO: compiled from: ViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class ViewCompat {

    /* JADX INFO: renamed from: c */
    public static Field f38075c;

    /* JADX INFO: renamed from: e */
    public static ThreadLocal<Rect> f38077e;

    /* JADX INFO: renamed from: a */
    public static final AtomicInteger f38073a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b */
    public static WeakHashMap<View, ViewPropertyAnimatorCompat> f38074b = null;

    /* JADX INFO: renamed from: d */
    public static boolean f38076d = false;

    /* JADX INFO: renamed from: f */
    public static final int[] f38078f = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: g */
    public static final OnReceiveContentViewBehavior f38079g = new a();

    /* JADX INFO: renamed from: z0.k.l.q$a */
    /* JADX INFO: compiled from: ViewCompat.java */
    public class a implements OnReceiveContentViewBehavior {
        @Override // p636z0.p725k.p739l.OnReceiveContentViewBehavior
        /* JADX INFO: renamed from: a */
        public ContentInfoCompat mo14915a(ContentInfoCompat contentInfoCompat) {
            return contentInfoCompat;
        }
    }

    /* JADX INFO: renamed from: z0.k.l.q$c */
    /* JADX INFO: compiled from: ViewCompat.java */
    public static class c {

        /* JADX INFO: renamed from: z0.k.l.q$c$a */
        /* JADX INFO: compiled from: ViewCompat.java */
        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            public WindowInsetsCompat f38084a = null;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f38085b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ OnApplyWindowInsetsListener f38086c;

            public a(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
                this.f38085b = view;
                this.f38086c = onApplyWindowInsetsListener;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat windowInsetsCompatM16225j = WindowInsetsCompat.m16225j(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    c.m16333a(windowInsets, this.f38085b);
                    if (windowInsetsCompatM16225j.equals(this.f38084a)) {
                        return this.f38086c.mo307a(view, windowInsetsCompatM16225j).m16232h();
                    }
                }
                this.f38084a = windowInsetsCompatM16225j;
                WindowInsetsCompat windowInsetsCompatMo307a = this.f38086c.mo307a(view, windowInsetsCompatM16225j);
                if (i >= 30) {
                    return windowInsetsCompatMo307a.m16232h();
                }
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                view.requestApplyInsets();
                return windowInsetsCompatMo307a.m16232h();
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m16333a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* JADX INFO: renamed from: b */
        public static WindowInsetsCompat m16334b(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets windowInsetsM16232h = windowInsetsCompat.m16232h();
            if (windowInsetsM16232h != null) {
                return WindowInsetsCompat.m16225j(view.computeSystemWindowInsets(windowInsetsM16232h, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        /* JADX INFO: renamed from: c */
        public static WindowInsetsCompat m16335c(View view) {
            if (!WindowInsetsCompat.a.f37985d || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = WindowInsetsCompat.a.f37982a.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) WindowInsetsCompat.a.f37983b.get(obj);
                Rect rect2 = (Rect) WindowInsetsCompat.a.f37984c.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                WindowInsetsCompat.b bVar = new WindowInsetsCompat.b();
                bVar.f37986a.mo16236c(Insets.m16166a(rect.left, rect.top, rect.right, rect.bottom));
                bVar.f37986a.mo16237d(Insets.m16166a(rect2.left, rect2.top, rect2.right, rect2.bottom));
                WindowInsetsCompat windowInsetsCompatM16233a = bVar.m16233a();
                windowInsetsCompatM16233a.f37981b.mo16247o(windowInsetsCompatM16233a);
                windowInsetsCompatM16233a.f37981b.mo16240d(view.getRootView());
                return windowInsetsCompatM16233a;
            } catch (IllegalAccessException e) {
                StringBuilder sbM1556G = outline.m1556G("Failed to get insets from AttachInfo. ");
                sbM1556G.append(e.getMessage());
                Log.w("WindowInsetsCompat", sbM1556G.toString(), e);
                return null;
            }
        }

        /* JADX INFO: renamed from: d */
        public static void m16336d(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, onApplyWindowInsetsListener);
            }
            if (onApplyWindowInsetsListener == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, onApplyWindowInsetsListener));
            }
        }
    }

    /* JADX INFO: renamed from: z0.k.l.q$d */
    /* JADX INFO: compiled from: ViewCompat.java */
    public static class d {
        /* JADX INFO: renamed from: a */
        public static WindowInsetsCompat m16337a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompatM16225j = WindowInsetsCompat.m16225j(rootWindowInsets, null);
            windowInsetsCompatM16225j.f37981b.mo16247o(windowInsetsCompatM16225j);
            windowInsetsCompatM16225j.f37981b.mo16240d(view.getRootView());
            return windowInsetsCompatM16225j;
        }
    }

    /* JADX INFO: renamed from: z0.k.l.q$e */
    /* JADX INFO: compiled from: ViewCompat.java */
    public static class e {
        /* JADX INFO: renamed from: a */
        public static void m16338a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* JADX INFO: renamed from: z0.k.l.q$f */
    /* JADX INFO: compiled from: ViewCompat.java */
    public interface f {
        /* JADX INFO: renamed from: a */
        boolean m16339a(View view, KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: z0.k.l.q$g */
    /* JADX INFO: compiled from: ViewCompat.java */
    public static class g {

        /* JADX INFO: renamed from: a */
        public static final ArrayList<WeakReference<View>> f38087a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public WeakHashMap<View, Boolean> f38088b = null;

        /* JADX INFO: renamed from: c */
        public SparseArray<WeakReference<View>> f38089c = null;

        /* JADX INFO: renamed from: d */
        public WeakReference<KeyEvent> f38090d = null;

        /* JADX INFO: renamed from: a */
        public final View m16340a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f38088b;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewM16340a = m16340a(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewM16340a != null) {
                            return viewM16340a;
                        }
                    }
                }
                if (m16341b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m16341b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((f) arrayList.get(size)).m16339a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        new WeakHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static void m16307a(View view, AccessibilityNodeInfoCompat.a aVar) {
        AccessibilityDelegateCompat accessibilityDelegateCompatM16313g = m16313g(view);
        if (accessibilityDelegateCompatM16313g == null) {
            accessibilityDelegateCompatM16313g = new AccessibilityDelegateCompat();
        }
        m16327u(view, accessibilityDelegateCompatM16313g);
        m16324r(aVar.m16275a(), view);
        m16316j(view).add(aVar);
        m16318l(view, 0);
    }

    /* JADX INFO: renamed from: b */
    public static ViewPropertyAnimatorCompat m16308b(View view) {
        if (f38074b == null) {
            f38074b = new WeakHashMap<>();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = f38074b.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
        f38074b.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    /* JADX INFO: renamed from: c */
    public static void m16309c(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m16329w((View) parent);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m16310d(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m16329w((View) parent);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static WindowInsetsCompat m16311e(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsM16232h = windowInsetsCompat.m16232h();
        if (windowInsetsM16232h != null) {
            WindowInsets windowInsetsDispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsetsM16232h);
            if (!windowInsetsDispatchApplyWindowInsets.equals(windowInsetsM16232h)) {
                return WindowInsetsCompat.m16225j(windowInsetsDispatchApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m16312f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = g.f38087a;
        g gVar = (g) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (gVar == null) {
            gVar = new g();
            view.setTag(R.id.tag_unhandled_key_event_manager, gVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = gVar.f38088b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = g.f38087a;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (gVar.f38088b == null) {
                        gVar.f38088b = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = g.f38087a;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            gVar.f38088b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                gVar.f38088b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View viewM16340a = gVar.m16340a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM16340a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (gVar.f38089c == null) {
                    gVar.f38089c = new SparseArray<>();
                }
                gVar.f38089c.put(keyCode, new WeakReference<>(viewM16340a));
            }
        }
        return viewM16340a != null;
    }

    /* JADX INFO: renamed from: g */
    public static AccessibilityDelegateCompat m16313g(View view) {
        View.AccessibilityDelegate accessibilityDelegateM16314h = m16314h(view);
        if (accessibilityDelegateM16314h == null) {
            return null;
        }
        return accessibilityDelegateM16314h instanceof AccessibilityDelegateCompat.a ? ((AccessibilityDelegateCompat.a) accessibilityDelegateM16314h).f37979a : new AccessibilityDelegateCompat(accessibilityDelegateM16314h);
    }

    /* JADX INFO: renamed from: h */
    public static View.AccessibilityDelegate m16314h(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        if (f38076d) {
            return null;
        }
        if (f38075c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f38075c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f38076d = true;
                return null;
            }
        }
        try {
            Object obj = f38075c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f38076d = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static CharSequence m16315i(View view) {
        return new ViewCompat3(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).m16332c(view);
    }

    /* JADX INFO: renamed from: j */
    public static List<AccessibilityNodeInfoCompat.a> m16316j(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: k */
    public static Rect m16317k() {
        if (f38077e == null) {
            f38077e = new ThreadLocal<>();
        }
        Rect rect = f38077e.get();
        if (rect == null) {
            rect = new Rect();
            f38077e.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* JADX INFO: renamed from: l */
    public static void m16318l(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m16315i(view) != null && view.getVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(m16315i(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                        if (((View) parent).getImportantForAccessibility() == 4) {
                            view.setImportantForAccessibility(2);
                            break;
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(m16315i(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m16319m(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect rectM16317k = m16317k();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM16317k.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectM16317k.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m16309c(view, i);
        if (z && rectM16317k.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM16317k);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m16320n(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect rectM16317k = m16317k();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectM16317k.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectM16317k.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m16310d(view, i);
        if (z && rectM16317k.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectM16317k);
        }
    }

    /* JADX INFO: renamed from: o */
    public static WindowInsetsCompat m16321o(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsM16232h = windowInsetsCompat.m16232h();
        if (windowInsetsM16232h != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsM16232h);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsM16232h)) {
                return WindowInsetsCompat.m16225j(windowInsetsOnApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static ContentInfoCompat m16322p(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        OnReceiveContentListener onReceiveContentListener = (OnReceiveContentListener) view.getTag(R.id.tag_on_receive_content_listener);
        if (onReceiveContentListener == null) {
            return (view instanceof OnReceiveContentViewBehavior ? (OnReceiveContentViewBehavior) view : f38079g).mo14915a(contentInfoCompat);
        }
        ContentInfoCompat contentInfoCompatMo16303a = onReceiveContentListener.mo16303a(view, contentInfoCompat);
        if (contentInfoCompatMo16303a == null) {
            return null;
        }
        return (view instanceof OnReceiveContentViewBehavior ? (OnReceiveContentViewBehavior) view : f38079g).mo14915a(contentInfoCompatMo16303a);
    }

    /* JADX INFO: renamed from: q */
    public static void m16323q(View view, int i) {
        m16324r(i, view);
        m16318l(view, 0);
    }

    /* JADX INFO: renamed from: r */
    public static void m16324r(int i, View view) {
        List<AccessibilityNodeInfoCompat.a> listM16316j = m16316j(view);
        for (int i2 = 0; i2 < listM16316j.size(); i2++) {
            if (listM16316j.get(i2).m16275a() == i) {
                listM16316j.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m16325s(View view, AccessibilityNodeInfoCompat.a aVar, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand != null) {
            m16307a(view, new AccessibilityNodeInfoCompat.a(null, aVar.f38030j, null, accessibilityViewCommand, aVar.f38031k));
        } else {
            m16324r(aVar.m16275a(), view);
            m16318l(view, 0);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m16326t(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            e.m16338a(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m16327u(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (accessibilityDelegateCompat == null && (m16314h(view) instanceof AccessibilityDelegateCompat.a)) {
            accessibilityDelegateCompat = new AccessibilityDelegateCompat();
        }
        view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.f37978c);
    }

    /* JADX INFO: renamed from: v */
    public static void m16328v(View view, PointerIconCompat pointerIconCompat) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (pointerIconCompat != null ? pointerIconCompat.f38072a : null));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m16329w(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* JADX INFO: renamed from: z0.k.l.q$b */
    /* JADX INFO: compiled from: ViewCompat.java */
    public static abstract class b<T> {

        /* JADX INFO: renamed from: a */
        public final int f38080a;

        /* JADX INFO: renamed from: b */
        public final Class<T> f38081b;

        /* JADX INFO: renamed from: c */
        public final int f38082c;

        /* JADX INFO: renamed from: d */
        public final int f38083d;

        public b(int i, Class<T> cls, int i2) {
            this.f38080a = i;
            this.f38081b = cls;
            this.f38083d = 0;
            this.f38082c = i2;
        }

        /* JADX INFO: renamed from: a */
        public boolean m16330a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        /* JADX INFO: renamed from: b */
        public abstract T mo16331b(View view);

        /* JADX INFO: renamed from: c */
        public T m16332c(View view) {
            if (Build.VERSION.SDK_INT >= this.f38082c) {
                return mo16331b(view);
            }
            T t = (T) view.getTag(this.f38080a);
            if (this.f38081b.isInstance(t)) {
                return t;
            }
            return null;
        }

        public b(int i, Class<T> cls, int i2, int i3) {
            this.f38080a = i;
            this.f38081b = cls;
            this.f38083d = i2;
            this.f38082c = i3;
        }
    }
}
