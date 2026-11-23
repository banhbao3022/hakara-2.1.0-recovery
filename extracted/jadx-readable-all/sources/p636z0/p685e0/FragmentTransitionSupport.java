package p636z0.p685e0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import p636z0.p725k.p735h.CancellationSignal;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentTransitionImpl;

/* JADX INFO: renamed from: z0.e0.d, reason: use source file name */
/* JADX INFO: compiled from: FragmentTransitionSupport.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public class FragmentTransitionSupport extends FragmentTransitionImpl {

    /* JADX INFO: renamed from: z0.e0.d$a */
    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class a extends Transition3.c {
        public a(FragmentTransitionSupport fragmentTransitionSupport, Rect rect) {
        }
    }

    /* JADX INFO: renamed from: z0.e0.d$b */
    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class b implements Transition3.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f36425a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f36426b;

        public b(FragmentTransitionSupport fragmentTransitionSupport, View view, ArrayList arrayList) {
            this.f36425a = view;
            this.f36426b = arrayList;
        }

        @Override // p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: a */
        public void mo12473a(Transition3 transition3) {
            transition3.mo15518z(this);
            transition3.mo15505a(this);
        }

        @Override // p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: b */
        public void mo12474b(Transition3 transition3) {
        }

        @Override // p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: c */
        public void mo12475c(Transition3 transition3) {
            transition3.mo15518z(this);
            this.f36425a.setVisibility(8);
            int size = this.f36426b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f36426b.get(i)).setVisibility(0);
            }
        }

        @Override // p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: d */
        public void mo12476d(Transition3 transition3) {
        }

        @Override // p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: e */
        public void mo12477e(Transition3 transition3) {
        }
    }

    /* JADX INFO: renamed from: z0.e0.d$c */
    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class c extends TransitionListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f36427a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f36428b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f36429c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ArrayList f36430d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Object f36431e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ArrayList f36432f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f36427a = obj;
            this.f36428b = arrayList;
            this.f36429c = obj2;
            this.f36430d = arrayList2;
            this.f36431e = obj3;
            this.f36432f = arrayList3;
        }

        @Override // p636z0.p685e0.TransitionListenerAdapter, p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: a */
        public void mo12473a(Transition3 transition3) {
            Object obj = this.f36427a;
            if (obj != null) {
                FragmentTransitionSupport.this.mo15480p(obj, this.f36428b, null);
            }
            Object obj2 = this.f36429c;
            if (obj2 != null) {
                FragmentTransitionSupport.this.mo15480p(obj2, this.f36430d, null);
            }
            Object obj3 = this.f36431e;
            if (obj3 != null) {
                FragmentTransitionSupport.this.mo15480p(obj3, this.f36432f, null);
            }
        }

        @Override // p636z0.p685e0.TransitionListenerAdapter, p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: c */
        public void mo12475c(Transition3 transition3) {
            transition3.mo15518z(this);
        }
    }

    /* JADX INFO: renamed from: z0.e0.d$d */
    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class d implements CancellationSignal.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Transition3 f36434a;

        public d(FragmentTransitionSupport fragmentTransitionSupport, Transition3 transition3) {
            this.f36434a = transition3;
        }

        @Override // p636z0.p725k.p735h.CancellationSignal.a
        /* JADX INFO: renamed from: b */
        public void mo15489b() {
            this.f36434a.cancel();
        }
    }

    /* JADX INFO: renamed from: z0.e0.d$e */
    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class e implements Transition3.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f36435a;

        public e(FragmentTransitionSupport fragmentTransitionSupport, Runnable runnable) {
            this.f36435a = runnable;
        }

        @Override // p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: a */
        public void mo12473a(Transition3 transition3) {
        }

        @Override // p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: b */
        public void mo12474b(Transition3 transition3) {
        }

        @Override // p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: c */
        public void mo12475c(Transition3 transition3) {
            this.f36435a.run();
        }

        @Override // p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: d */
        public void mo12476d(Transition3 transition3) {
        }

        @Override // p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: e */
        public void mo12477e(Transition3 transition3) {
        }
    }

    /* JADX INFO: renamed from: z0.e0.d$f */
    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class f extends Transition3.c {
        public f(FragmentTransitionSupport fragmentTransitionSupport, Rect rect) {
        }
    }

    /* JADX INFO: renamed from: z */
    public static boolean m15471z(Transition3 transition3) {
        return (FragmentTransitionImpl.m16605k(transition3.f36453m) && FragmentTransitionImpl.m16605k(null) && FragmentTransitionImpl.m16605k(null)) ? false : true;
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: a */
    public void mo15472a(Object obj, View view) {
        if (obj != null) {
            ((Transition3) obj).mo15506b(view);
        }
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: b */
    public void mo15473b(Object obj, ArrayList<View> arrayList) {
        Transition3 transition3 = (Transition3) obj;
        if (transition3 == null) {
            return;
        }
        int i = 0;
        if (transition3 instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition3;
            int size = transitionSet.f36482D.size();
            while (i < size) {
                mo15473b(transitionSet.m15525P(i), arrayList);
                i++;
            }
            return;
        }
        if (m15471z(transition3) || !FragmentTransitionImpl.m16605k(transition3.f36454n)) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            transition3.mo15506b(arrayList.get(i));
            i++;
        }
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: c */
    public void mo15474c(ViewGroup viewGroup, Object obj) {
        TransitionManager.m15519a(viewGroup, (Transition3) obj);
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: e */
    public boolean mo15475e(Object obj) {
        return obj instanceof Transition3;
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: g */
    public Object mo15476g(Object obj) {
        if (obj != null) {
            return ((Transition3) obj).clone();
        }
        return null;
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: l */
    public Object mo15477l(Object obj, Object obj2, Object obj3) {
        Transition3 transition3 = (Transition3) obj;
        Transition3 transition4 = (Transition3) obj2;
        Transition3 transition5 = (Transition3) obj3;
        if (transition3 != null && transition4 != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.m15524O(transition3);
            transitionSet.m15524O(transition4);
            transitionSet.m15528S(1);
            transition3 = transitionSet;
        } else if (transition3 == null) {
            transition3 = transition4 != null ? transition4 : null;
        }
        if (transition5 == null) {
            return transition3;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition3 != null) {
            transitionSet2.m15524O(transition3);
        }
        transitionSet2.m15524O(transition5);
        return transitionSet2;
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: m */
    public Object mo15478m(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.m15524O((Transition3) obj);
        }
        if (obj2 != null) {
            transitionSet.m15524O((Transition3) obj2);
        }
        if (obj3 != null) {
            transitionSet.m15524O((Transition3) obj3);
        }
        return transitionSet;
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: o */
    public void mo15479o(Object obj, View view) {
        if (obj != null) {
            ((Transition3) obj).mo15494A(view);
        }
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: p */
    public void mo15480p(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition3 transition3 = (Transition3) obj;
        int i = 0;
        if (transition3 instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition3;
            int size = transitionSet.f36482D.size();
            while (i < size) {
                mo15480p(transitionSet.m15525P(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m15471z(transition3)) {
            return;
        }
        ArrayList<View> arrayList3 = transition3.f36454n;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size2) {
            transition3.mo15506b(arrayList2.get(i));
            i++;
        }
        int size3 = arrayList.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                transition3.mo15494A(arrayList.get(size3));
            }
        }
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: q */
    public void mo15481q(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition3) obj).mo15505a(new b(this, view, arrayList));
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: r */
    public void mo15482r(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition3) obj).mo15505a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: s */
    public void mo15483s(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition3) obj).mo15498G(new f(this, rect));
        }
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: t */
    public void mo15484t(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m16608j(view, rect);
            ((Transition3) obj).mo15498G(new a(this, rect));
        }
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: u */
    public void mo15485u(Fragment fragment, Object obj, CancellationSignal cancellationSignal, Runnable runnable) {
        Transition3 transition3 = (Transition3) obj;
        cancellationSignal.m16202b(new d(this, transition3));
        transition3.mo15505a(new e(this, runnable));
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: w */
    public void mo15486w(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        ArrayList<View> arrayList2 = transitionSet.f36454n;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FragmentTransitionImpl.m16603d(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo15473b(transitionSet, arrayList);
    }

    @Override // p636z0.p752p.p753c.FragmentTransitionImpl
    /* JADX INFO: renamed from: x */
    public void mo15487x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.f36454n.clear();
            transitionSet.f36454n.addAll(arrayList2);
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
        transitionSet.m15524O((Transition3) obj);
        return transitionSet;
    }
}
