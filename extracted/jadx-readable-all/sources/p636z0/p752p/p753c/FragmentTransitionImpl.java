package p636z0.p752p.p753c;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p691g.SimpleArrayMap;
import p636z0.p725k.p735h.CancellationSignal;
import p636z0.p725k.p739l.OneShotPreDrawListener;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.p.c.s0, reason: use source file name */
/* JADX INFO: compiled from: FragmentTransitionImpl.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public abstract class FragmentTransitionImpl {

    /* JADX INFO: renamed from: z0.p.c.s0$a */
    /* JADX INFO: compiled from: FragmentTransitionImpl.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f38548f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ArrayList f38549g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ ArrayList f38550h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ArrayList f38551i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ ArrayList f38552j;

        public a(FragmentTransitionImpl fragmentTransitionImpl, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f38548f = i;
            this.f38549g = arrayList;
            this.f38550h = arrayList2;
            this.f38551i = arrayList3;
            this.f38552j = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f38548f; i++) {
                View view = (View) this.f38549g.get(i);
                String str = (String) this.f38550h.get(i);
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                view.setTransitionName(str);
                ((View) this.f38551i.get(i)).setTransitionName((String) this.f38552j.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m16603d(List<View> list, View view) {
        int size = list.size();
        if (m16604h(list, view, size)) {
            return;
        }
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (view.getTransitionName() != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m16604h(list, childAt, size) && childAt.getTransitionName() != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m16604h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m16605k(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo15472a(Object obj, View view);

    /* JADX INFO: renamed from: b */
    public abstract void mo15473b(Object obj, ArrayList<View> arrayList);

    /* JADX INFO: renamed from: c */
    public abstract void mo15474c(ViewGroup viewGroup, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo15475e(Object obj);

    /* JADX INFO: renamed from: f */
    public void m16606f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isTransitionGroup()) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m16606f(arrayList, viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo15476g(Object obj);

    /* JADX INFO: renamed from: i */
    public void m16607i(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m16607i(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m16608j(View view, Rect rect) {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract Object mo15477l(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: m */
    public abstract Object mo15478m(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: n */
    public ArrayList<String> m16609n(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            arrayList2.add(view.getTransitionName());
            view.setTransitionName(null);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo15479o(Object obj, View view);

    /* JADX INFO: renamed from: p */
    public abstract void mo15480p(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX INFO: renamed from: q */
    public abstract void mo15481q(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: renamed from: r */
    public abstract void mo15482r(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* JADX INFO: renamed from: s */
    public abstract void mo15483s(Object obj, Rect rect);

    /* JADX INFO: renamed from: t */
    public abstract void mo15484t(Object obj, View view);

    /* JADX INFO: renamed from: u */
    public void mo15485u(Fragment fragment, Object obj, CancellationSignal cancellationSignal, Runnable runnable) {
        runnable.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public void m16610v(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            String transitionName = view2.getTransitionName();
            arrayList4.add(transitionName);
            if (transitionName != null) {
                view2.setTransitionName(null);
                String str = (String) ((SimpleArrayMap) map).getOrDefault(transitionName, null);
                for (int i2 = 0; i2 < size; i2++) {
                    if (str.equals(arrayList3.get(i2))) {
                        arrayList2.get(i2).setTransitionName(transitionName);
                        break;
                    }
                }
            }
        }
        OneShotPreDrawListener.m16304a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* JADX INFO: renamed from: w */
    public abstract void mo15486w(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: renamed from: x */
    public abstract void mo15487x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX INFO: renamed from: y */
    public abstract Object mo15488y(Object obj);
}
