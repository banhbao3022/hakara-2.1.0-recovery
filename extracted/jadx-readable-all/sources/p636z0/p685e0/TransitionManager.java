package p636z0.p685e0;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p636z0.p691g.ArrayMap;
import p636z0.p691g.LongSparseArray;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.e0.m, reason: use source file name */
/* JADX INFO: compiled from: TransitionManager.java */
/* JADX INFO: loaded from: classes.dex */
public class TransitionManager {

    /* JADX INFO: renamed from: a */
    public static Transition3 f36475a = new AutoTransition();

    /* JADX INFO: renamed from: b */
    public static ThreadLocal<WeakReference<ArrayMap<ViewGroup, ArrayList<Transition3>>>> f36476b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c */
    public static ArrayList<ViewGroup> f36477c = new ArrayList<>();

    /* JADX INFO: renamed from: z0.e0.m$a */
    /* JADX INFO: compiled from: TransitionManager.java */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: f */
        public Transition3 f36478f;

        /* JADX INFO: renamed from: g */
        public ViewGroup f36479g;

        /* JADX INFO: renamed from: z0.e0.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TransitionManager.java */
        public class C8569a extends TransitionListenerAdapter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ArrayMap f36480a;

            public C8569a(ArrayMap arrayMap) {
                this.f36480a = arrayMap;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p636z0.p685e0.TransitionListenerAdapter, p636z0.p685e0.Transition3.d
            /* JADX INFO: renamed from: c */
            public void mo12475c(Transition3 transition3) {
                ((ArrayList) this.f36480a.get(a.this.f36479g)).remove(transition3);
                transition3.mo15518z(this);
            }
        }

        public a(Transition3 transition3, ViewGroup viewGroup) {
            this.f36478f = transition3;
            this.f36479g = viewGroup;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0215  */
        /* JADX WARN: Code duplicated, block: B:102:0x0223  */
        /* JADX WARN: Code duplicated, block: B:106:0x0242  */
        /* JADX WARN: Code duplicated, block: B:136:0x01ef A[EDGE_INSN: B:136:0x01ef->B:90:0x01ef BREAK  A[LOOP:1: B:19:0x009a->B:89:0x01e5], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:14:0x005c  */
        /* JADX WARN: Code duplicated, block: B:174:0x020d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:177:0x022e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:17:0x0066 A[LOOP:0: B:15:0x0060->B:17:0x0066, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:21:0x009f  */
        /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:25:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:30:0x00af  */
        /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:47:0x010d  */
        /* JADX WARN: Code duplicated, block: B:49:0x0119  */
        /* JADX WARN: Code duplicated, block: B:62:0x0161  */
        /* JADX WARN: Code duplicated, block: B:64:0x016b  */
        /* JADX WARN: Code duplicated, block: B:77:0x01af  */
        /* JADX WARN: Code duplicated, block: B:80:0x01b6  */
        /* JADX WARN: Code duplicated, block: B:93:0x01f4  */
        /* JADX WARN: Code duplicated, block: B:95:0x0202  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ArrayList arrayList;
            Transition3 transition3;
            TransitionValuesMaps transitionValuesMaps;
            TransitionValuesMaps transitionValuesMaps2;
            ArrayMap arrayMap;
            ArrayMap arrayMap2;
            int i;
            int[] iArr;
            int i2;
            int i3;
            ArrayMap<Animator, Transition3.b> arrayMapM15492r;
            int i4;
            Animator animatorM15611h;
            Transition3.b orDefault;
            TransitionValues transitionValues;
            TransitionValues transitionValues2;
            int i5;
            TransitionValuesMaps transitionValuesMaps3;
            int i6;
            View view;
            TransitionValues transitionValues3;
            ArrayMap<String, View> arrayMap3;
            int i7;
            int i8;
            View viewM15612l;
            View view2;
            SparseArray<View> sparseArray;
            int size;
            int i9;
            View viewValueAt;
            View view3;
            LongSparseArray<View> longSparseArray;
            int iM15595o;
            int i10;
            View viewM15596p;
            TransitionValuesMaps transitionValuesMaps4;
            Iterator it;
            this.f36479g.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f36479g.removeOnAttachStateChangeListener(this);
            int i11 = 1;
            if (!TransitionManager.f36477c.remove(this.f36479g)) {
                return true;
            }
            ArrayMap<ViewGroup, ArrayList<Transition3>> arrayMapM15520b = TransitionManager.m15520b();
            ArrayList<Transition3> arrayList2 = arrayMapM15520b.get(this.f36479g);
            boolean z = false;
            if (arrayList2 != null) {
                arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
                arrayList2.add(this.f36478f);
                this.f36478f.mo15505a(new C8569a(arrayMapM15520b));
                this.f36478f.m15509k(this.f36479g, false);
                if (arrayList != null) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Transition3) it.next()).mo15495C(this.f36479g);
                    }
                }
                transition3 = this.f36478f;
                ViewGroup viewGroup = this.f36479g;
                Objects.requireNonNull(transition3);
                transition3.f36459s = new ArrayList<>();
                transition3.f36460t = new ArrayList<>();
                transitionValuesMaps = transition3.f36455o;
                transitionValuesMaps2 = transition3.f36456p;
                arrayMap = new ArrayMap(transitionValuesMaps.f36495a);
                arrayMap2 = new ArrayMap(transitionValuesMaps2.f36495a);
                i = 0;
                while (true) {
                    iArr = transition3.f36458r;
                    if (i < iArr.length) {
                        break;
                    }
                    i5 = iArr[i];
                    if (i5 != i11) {
                        transitionValuesMaps3 = transitionValuesMaps;
                        i6 = arrayMap.f36667l;
                        while (true) {
                            i6--;
                            if (i6 >= 0) {
                                view = (View) arrayMap.m15611h(i6);
                                if (view == null && transition3.m15516w(view) && (transitionValues3 = (TransitionValues) arrayMap2.remove(view)) != null && transition3.m15516w(transitionValues3.f36493b)) {
                                    transition3.f36459s.add((TransitionValues) arrayMap.mo2036j(i6));
                                    transition3.f36460t.add(transitionValues3);
                                }
                            }
                        }
                    } else if (i5 != 2) {
                        transitionValuesMaps3 = transitionValuesMaps;
                        arrayMap3 = transitionValuesMaps3.f36498d;
                        ArrayMap<String, View> arrayMap4 = transitionValuesMaps2.f36498d;
                        i7 = arrayMap3.f36667l;
                        for (i8 = 0; i8 < i7; i8++) {
                            viewM15612l = arrayMap3.m15612l(i8);
                            if (viewM15612l == null && transition3.m15516w(viewM15612l) && (view2 = arrayMap4.get(arrayMap3.m15611h(i8))) != null && transition3.m15516w(view2)) {
                                TransitionValues transitionValues4 = (TransitionValues) arrayMap.getOrDefault(viewM15612l, null);
                                TransitionValues transitionValues5 = (TransitionValues) arrayMap2.getOrDefault(view2, null);
                                if (transitionValues4 != null && transitionValues5 != null) {
                                    transition3.f36459s.add(transitionValues4);
                                    transition3.f36460t.add(transitionValues5);
                                    arrayMap.remove(viewM15612l);
                                    arrayMap2.remove(view2);
                                }
                            }
                        }
                    } else if (i5 != 3) {
                        if (i5 == 4) {
                            longSparseArray = transitionValuesMaps.f36497c;
                            LongSparseArray<View> longSparseArray2 = transitionValuesMaps2.f36497c;
                            iM15595o = longSparseArray.m15595o();
                            i10 = 0;
                            while (i10 < iM15595o) {
                                viewM15596p = longSparseArray.m15596p(i10);
                                if (viewM15596p == null && transition3.m15516w(viewM15596p)) {
                                    transitionValuesMaps4 = transitionValuesMaps;
                                    View viewM15589i = longSparseArray2.m15589i(longSparseArray.m15592l(i10));
                                    if (viewM15589i != null && transition3.m15516w(viewM15589i)) {
                                        TransitionValues transitionValues6 = (TransitionValues) arrayMap.getOrDefault(viewM15596p, z);
                                        TransitionValues transitionValues7 = (TransitionValues) arrayMap2.getOrDefault(viewM15589i, z);
                                        if (transitionValues6 != null && transitionValues7 != null) {
                                            transition3.f36459s.add(transitionValues6);
                                            transition3.f36460t.add(transitionValues7);
                                            arrayMap.remove(viewM15596p);
                                            arrayMap2.remove(viewM15589i);
                                        }
                                    }
                                } else {
                                    transitionValuesMaps4 = transitionValuesMaps;
                                }
                                i10++;
                                transitionValuesMaps = transitionValuesMaps4;
                                z = false;
                            }
                        }
                        transitionValuesMaps3 = transitionValuesMaps;
                    } else {
                        transitionValuesMaps3 = transitionValuesMaps;
                        sparseArray = transitionValuesMaps3.f36496b;
                        SparseArray<View> sparseArray2 = transitionValuesMaps2.f36496b;
                        size = sparseArray.size();
                        for (i9 = 0; i9 < size; i9++) {
                            viewValueAt = sparseArray.valueAt(i9);
                            if (viewValueAt == null && transition3.m15516w(viewValueAt) && (view3 = sparseArray2.get(sparseArray.keyAt(i9))) != null && transition3.m15516w(view3)) {
                                TransitionValues transitionValues8 = (TransitionValues) arrayMap.getOrDefault(viewValueAt, null);
                                TransitionValues transitionValues9 = (TransitionValues) arrayMap2.getOrDefault(view3, null);
                                if (transitionValues8 != null && transitionValues9 != null) {
                                    transition3.f36459s.add(transitionValues8);
                                    transition3.f36460t.add(transitionValues9);
                                    arrayMap.remove(viewValueAt);
                                    arrayMap2.remove(view3);
                                }
                            }
                        }
                    }
                    i++;
                    transitionValuesMaps = transitionValuesMaps3;
                    i11 = 1;
                    z = false;
                }
                for (i2 = 0; i2 < arrayMap.f36667l; i2++) {
                    transitionValues2 = (TransitionValues) arrayMap.m15612l(i2);
                    if (transition3.m15516w(transitionValues2.f36493b)) {
                        transition3.f36459s.add(transitionValues2);
                        transition3.f36460t.add(null);
                    }
                }
                for (i3 = 0; i3 < arrayMap2.f36667l; i3++) {
                    transitionValues = (TransitionValues) arrayMap2.m15612l(i3);
                    if (transition3.m15516w(transitionValues.f36493b)) {
                        transition3.f36460t.add(transitionValues);
                        transition3.f36459s.add(null);
                    }
                }
                arrayMapM15492r = Transition3.m15492r();
                int i12 = arrayMapM15492r.f36667l;
                ViewUtilsBase viewUtilsBase = ViewUtils6.f36500a;
                WindowIdApi18 windowIdApi18 = new WindowIdApi18(viewGroup);
                for (i4 = i12 - 1; i4 >= 0; i4--) {
                    animatorM15611h = arrayMapM15492r.m15611h(i4);
                    if (animatorM15611h == null && (orDefault = arrayMapM15492r.getOrDefault(animatorM15611h, null)) != null && orDefault.f36467a != null && windowIdApi18.equals(orDefault.f36470d)) {
                        TransitionValues transitionValues10 = orDefault.f36469c;
                        View view4 = orDefault.f36467a;
                        TransitionValues transitionValuesM15515t = transition3.m15515t(view4, true);
                        TransitionValues transitionValuesM15514q = transition3.m15514q(view4, true);
                        if (transitionValuesM15515t == null && transitionValuesM15514q == null) {
                            transitionValuesM15514q = transition3.f36456p.f36495a.get(view4);
                        }
                        if (!(transitionValuesM15515t == null && transitionValuesM15514q == null) && orDefault.f36471e.mo15467v(transitionValues10, transitionValuesM15514q)) {
                            if (animatorM15611h.isRunning() || animatorM15611h.isStarted()) {
                                animatorM15611h.cancel();
                            } else {
                                arrayMapM15492r.remove(animatorM15611h);
                            }
                        }
                    }
                }
                transition3.mo15512o(viewGroup, transition3.f36455o, transition3.f36456p, transition3.f36459s, transition3.f36460t);
                transition3.mo15496E();
                return true;
            }
            arrayList2 = new ArrayList<>();
            arrayMapM15520b.put(this.f36479g, arrayList2);
            arrayList2.add(this.f36478f);
            this.f36478f.mo15505a(new C8569a(arrayMapM15520b));
            this.f36478f.m15509k(this.f36479g, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition3) it.next()).mo15495C(this.f36479g);
                }
            }
            transition3 = this.f36478f;
            ViewGroup viewGroup2 = this.f36479g;
            Objects.requireNonNull(transition3);
            transition3.f36459s = new ArrayList<>();
            transition3.f36460t = new ArrayList<>();
            transitionValuesMaps = transition3.f36455o;
            transitionValuesMaps2 = transition3.f36456p;
            arrayMap = new ArrayMap(transitionValuesMaps.f36495a);
            arrayMap2 = new ArrayMap(transitionValuesMaps2.f36495a);
            i = 0;
            while (true) {
                iArr = transition3.f36458r;
                if (i < iArr.length) {
                    break;
                    break;
                }
                i5 = iArr[i];
                if (i5 != i11) {
                    transitionValuesMaps3 = transitionValuesMaps;
                    i6 = arrayMap.f36667l;
                    while (true) {
                        i6--;
                        if (i6 >= 0) {
                            view = (View) arrayMap.m15611h(i6);
                            if (view == null) {
                            }
                        }
                    }
                } else if (i5 != 2) {
                    transitionValuesMaps3 = transitionValuesMaps;
                    arrayMap3 = transitionValuesMaps3.f36498d;
                    ArrayMap<String, View> arrayMap5 = transitionValuesMaps2.f36498d;
                    i7 = arrayMap3.f36667l;
                    while (i8 < i7) {
                        viewM15612l = arrayMap3.m15612l(i8);
                        if (viewM15612l == null) {
                        }
                    }
                } else if (i5 != 3) {
                    if (i5 == 4) {
                        longSparseArray = transitionValuesMaps.f36497c;
                        LongSparseArray<View> longSparseArray3 = transitionValuesMaps2.f36497c;
                        iM15595o = longSparseArray.m15595o();
                        i10 = 0;
                        while (i10 < iM15595o) {
                            viewM15596p = longSparseArray.m15596p(i10);
                            if (viewM15596p == null) {
                                transitionValuesMaps4 = transitionValuesMaps;
                            } else {
                                transitionValuesMaps4 = transitionValuesMaps;
                            }
                            i10++;
                            transitionValuesMaps = transitionValuesMaps4;
                            z = false;
                        }
                    }
                    transitionValuesMaps3 = transitionValuesMaps;
                } else {
                    transitionValuesMaps3 = transitionValuesMaps;
                    sparseArray = transitionValuesMaps3.f36496b;
                    SparseArray<View> sparseArray3 = transitionValuesMaps2.f36496b;
                    size = sparseArray.size();
                    while (i9 < size) {
                        viewValueAt = sparseArray.valueAt(i9);
                        if (viewValueAt == null) {
                        }
                    }
                }
                i++;
                transitionValuesMaps = transitionValuesMaps3;
                i11 = 1;
                z = false;
            }
            while (i2 < arrayMap.f36667l) {
                transitionValues2 = (TransitionValues) arrayMap.m15612l(i2);
                if (transition3.m15516w(transitionValues2.f36493b)) {
                    transition3.f36459s.add(transitionValues2);
                    transition3.f36460t.add(null);
                }
            }
            while (i3 < arrayMap2.f36667l) {
                transitionValues = (TransitionValues) arrayMap2.m15612l(i3);
                if (transition3.m15516w(transitionValues.f36493b)) {
                    transition3.f36460t.add(transitionValues);
                    transition3.f36459s.add(null);
                }
            }
            arrayMapM15492r = Transition3.m15492r();
            int i13 = arrayMapM15492r.f36667l;
            ViewUtilsBase viewUtilsBase2 = ViewUtils6.f36500a;
            WindowIdApi18 windowIdApi19 = new WindowIdApi18(viewGroup2);
            while (i4 >= 0) {
                animatorM15611h = arrayMapM15492r.m15611h(i4);
                if (animatorM15611h == null) {
                }
            }
            transition3.mo15512o(viewGroup2, transition3.f36455o, transition3.f36456p, transition3.f36459s, transition3.f36460t);
            transition3.mo15496E();
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f36479g.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f36479g.removeOnAttachStateChangeListener(this);
            TransitionManager.f36477c.remove(this.f36479g);
            ArrayList<Transition3> arrayList = TransitionManager.m15520b().get(this.f36479g);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition3> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo15495C(this.f36479g);
                }
            }
            this.f36478f.m15510l(true);
        }
    }

    public TransitionManager() {
        new ArrayMap();
        new ArrayMap();
    }

    /* JADX INFO: renamed from: a */
    public static void m15519a(ViewGroup viewGroup, Transition3 transition3) {
        if (f36477c.contains(viewGroup)) {
            return;
        }
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (viewGroup.isLaidOut()) {
            f36477c.add(viewGroup);
            if (transition3 == null) {
                transition3 = f36475a;
            }
            Transition3 transition3Clone = transition3.clone();
            ArrayList<Transition3> orDefault = m15520b().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<Transition3> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().mo15517y(viewGroup);
                }
            }
            if (transition3Clone != null) {
                transition3Clone.m15509k(viewGroup, true);
            }
            Scene scene = (Scene) viewGroup.getTag(R.id.transition_current_scene);
            if (scene != null) {
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (transition3Clone != null) {
                a aVar = new a(transition3Clone, viewGroup);
                viewGroup.addOnAttachStateChangeListener(aVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static ArrayMap<ViewGroup, ArrayList<Transition3>> m15520b() {
        ArrayMap<ViewGroup, ArrayList<Transition3>> arrayMap;
        WeakReference<ArrayMap<ViewGroup, ArrayList<Transition3>>> weakReference = f36476b.get();
        if (weakReference != null && (arrayMap = weakReference.get()) != null) {
            return arrayMap;
        }
        ArrayMap<ViewGroup, ArrayList<Transition3>> arrayMap2 = new ArrayMap<>();
        f36476b.set(new WeakReference<>(arrayMap2));
        return arrayMap2;
    }
}
