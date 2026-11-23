package p636z0.p752p.p753c;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p636z0.p725k.p735h.CancellationSignal;

/* JADX INFO: renamed from: z0.p.c.r0, reason: use source file name */
/* JADX INFO: compiled from: FragmentTransitionCompat21.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentTransitionCompat21 extends FragmentTransitionImpl {

    /* JADX INFO: renamed from: z0.p.c.r0$a */
    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class a extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Rect f38531a;

        public a(FragmentTransitionCompat21 fragmentTransitionCompat21, Rect rect) {
            this.f38531a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f38531a;
        }
    }

    /* JADX INFO: renamed from: z0.p.c.r0$b */
    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class b implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f38532a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f38533b;

        public b(FragmentTransitionCompat21 fragmentTransitionCompat21, View view, ArrayList arrayList) {
            this.f38532a = view;
            this.f38533b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f38532a.setVisibility(8);
            int size = this.f38533b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f38533b.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* JADX INFO: renamed from: z0.p.c.r0$c */
    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class c implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f38534a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f38535b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f38536c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ArrayList f38537d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Object f38538e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ArrayList f38539f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f38534a = obj;
            this.f38535b = arrayList;
            this.f38536c = obj2;
            this.f38537d = arrayList2;
            this.f38538e = obj3;
            this.f38539f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f38534a;
            if (obj != null) {
                FragmentTransitionCompat21.this.mo15480p(obj, this.f38535b, null);
            }
            Object obj2 = this.f38536c;
            if (obj2 != null) {
                FragmentTransitionCompat21.this.mo15480p(obj2, this.f38537d, null);
            }
            Object obj3 = this.f38538e;
            if (obj3 != null) {
                FragmentTransitionCompat21.this.mo15480p(obj3, this.f38539f, null);
            }
        }
    }

    /* JADX INFO: renamed from: z0.p.c.r0$d */
    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class d implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f38541a;

        public d(FragmentTransitionCompat21 fragmentTransitionCompat21, Runnable runnable) {
            this.f38541a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f38541a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* JADX INFO: renamed from: z0.p.c.r0$e */
    /* JADX INFO: compiled from: FragmentTransitionCompat21.java */
    public class e extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Rect f38542a;

        public e(FragmentTransitionCompat21 fragmentTransitionCompat21, Rect rect) {
            this.f38542a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f38542a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f38542a;
        }
    }

    /* JADX INFO: renamed from: z */
    public static boolean m16602z(Transition transition) {
        return (FragmentTransitionImpl.m16605k(transition.getTargetIds()) && FragmentTransitionImpl.m16605k(transition.getTargetNames()) && FragmentTransitionImpl.m16605k(transition.getTargetTypes())) ? false : true;
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: a */
    public void mo15472a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: b */
    public void mo15473b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo15473b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m16602z(transition) || !FragmentTransitionImpl.m16605k(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget(arrayList.get(i));
            i++;
        }
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: c */
    public void mo15474c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: e */
    public boolean mo15475e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: g */
    public Object mo15476g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: l */
    public Object mo15477l(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: m */
    public Object mo15478m(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: o */
    public void mo15479o(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: p */
    public void mo15480p(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo15480p(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m16602z(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget(arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: q */
    public void mo15481q(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(this, view, arrayList));
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: r */
    public void mo15482r(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: s */
    public void mo15483s(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(this, rect));
        }
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: t */
    public void mo15484t(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m16608j(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(this, rect));
        }
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: u */
    public void mo15485u(Fragment fragment, Object obj, CancellationSignal cancellationSignal, Runnable runnable) {
        ((Transition) obj).addListener(new d(this, runnable));
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: w */
    public void mo15486w(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FragmentTransitionImpl.m16603d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo15473b(transitionSet, arrayList);
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: x */
    public void mo15487x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo15480p(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: y */
    public Object mo15488y(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
