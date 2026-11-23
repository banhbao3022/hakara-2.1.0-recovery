package p636z0.p685e0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p691g.ArrayMap;
import p636z0.p691g.ContainerHelpers;
import p636z0.p691g.LongSparseArray;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.e0.i, reason: use source file name */
/* JADX INFO: compiled from: Transition.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class Transition3 implements Cloneable {

    /* JADX INFO: renamed from: f */
    public static final int[] f36443f = {2, 1, 3, 4};

    /* JADX INFO: renamed from: g */
    public static final PathMotion f36444g = new a();

    /* JADX INFO: renamed from: h */
    public static ThreadLocal<ArrayMap<Animator, b>> f36445h = new ThreadLocal<>();

    /* JADX INFO: renamed from: A */
    public TransitionPropagation f36446A;

    /* JADX INFO: renamed from: B */
    public c f36447B;

    /* JADX INFO: renamed from: C */
    public PathMotion f36448C;

    /* JADX INFO: renamed from: i */
    public String f36449i;

    /* JADX INFO: renamed from: j */
    public long f36450j;

    /* JADX INFO: renamed from: k */
    public long f36451k;

    /* JADX INFO: renamed from: l */
    public TimeInterpolator f36452l;

    /* JADX INFO: renamed from: m */
    public ArrayList<Integer> f36453m;

    /* JADX INFO: renamed from: n */
    public ArrayList<View> f36454n;

    /* JADX INFO: renamed from: o */
    public TransitionValuesMaps f36455o;

    /* JADX INFO: renamed from: p */
    public TransitionValuesMaps f36456p;

    /* JADX INFO: renamed from: q */
    public TransitionSet f36457q;

    /* JADX INFO: renamed from: r */
    public int[] f36458r;

    /* JADX INFO: renamed from: s */
    public ArrayList<TransitionValues> f36459s;

    /* JADX INFO: renamed from: t */
    public ArrayList<TransitionValues> f36460t;

    /* JADX INFO: renamed from: u */
    public ArrayList<Animator> f36461u;

    /* JADX INFO: renamed from: v */
    public int f36462v;

    /* JADX INFO: renamed from: w */
    public boolean f36463w;

    /* JADX INFO: renamed from: x */
    public boolean f36464x;

    /* JADX INFO: renamed from: y */
    public ArrayList<d> f36465y;

    /* JADX INFO: renamed from: z */
    public ArrayList<Animator> f36466z;

    /* JADX INFO: renamed from: z0.e0.i$a */
    /* JADX INFO: compiled from: Transition.java */
    public static class a extends PathMotion {
        @Override // p636z0.p685e0.PathMotion
        /* JADX INFO: renamed from: a */
        public Path mo15490a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: renamed from: z0.e0.i$b */
    /* JADX INFO: compiled from: Transition.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public View f36467a;

        /* JADX INFO: renamed from: b */
        public String f36468b;

        /* JADX INFO: renamed from: c */
        public TransitionValues f36469c;

        /* JADX INFO: renamed from: d */
        public WindowIdImpl f36470d;

        /* JADX INFO: renamed from: e */
        public Transition3 f36471e;

        public b(View view, String str, Transition3 transition3, WindowIdImpl windowIdImpl, TransitionValues transitionValues) {
            this.f36467a = view;
            this.f36468b = str;
            this.f36469c = transitionValues;
            this.f36470d = windowIdImpl;
            this.f36471e = transition3;
        }
    }

    /* JADX INFO: renamed from: z0.e0.i$c */
    /* JADX INFO: compiled from: Transition.java */
    public static abstract class c {
    }

    /* JADX INFO: renamed from: z0.e0.i$d */
    /* JADX INFO: compiled from: Transition.java */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo12473a(Transition3 transition3);

        /* JADX INFO: renamed from: b */
        void mo12474b(Transition3 transition3);

        /* JADX INFO: renamed from: c */
        void mo12475c(Transition3 transition3);

        /* JADX INFO: renamed from: d */
        void mo12476d(Transition3 transition3);

        /* JADX INFO: renamed from: e */
        void mo12477e(Transition3 transition3);
    }

    public Transition3() {
        this.f36449i = getClass().getName();
        this.f36450j = -1L;
        this.f36451k = -1L;
        this.f36452l = null;
        this.f36453m = new ArrayList<>();
        this.f36454n = new ArrayList<>();
        this.f36455o = new TransitionValuesMaps();
        this.f36456p = new TransitionValuesMaps();
        this.f36457q = null;
        this.f36458r = f36443f;
        this.f36461u = new ArrayList<>();
        this.f36462v = 0;
        this.f36463w = false;
        this.f36464x = false;
        this.f36465y = null;
        this.f36466z = new ArrayList<>();
        this.f36448C = f36444g;
    }

    /* JADX INFO: renamed from: d */
    public static void m15491d(TransitionValuesMaps transitionValuesMaps, View view, TransitionValues transitionValues) {
        transitionValuesMaps.f36495a.put(view, transitionValues);
        int id = view.getId();
        if (id >= 0) {
            if (transitionValuesMaps.f36496b.indexOfKey(id) >= 0) {
                transitionValuesMaps.f36496b.put(id, null);
            } else {
                transitionValuesMaps.f36496b.put(id, view);
            }
        }
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (transitionValuesMaps.f36498d.m15608e(transitionName) >= 0) {
                transitionValuesMaps.f36498d.put(transitionName, null);
            } else {
                transitionValuesMaps.f36498d.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                LongSparseArray<View> longSparseArray = transitionValuesMaps.f36497c;
                if (longSparseArray.f36635g) {
                    longSparseArray.m15588g();
                }
                if (ContainerHelpers.m15579b(longSparseArray.f36636h, longSparseArray.f36638j, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    transitionValuesMaps.f36497c.m15593m(itemIdAtPosition, view);
                    return;
                }
                View viewM15589i = transitionValuesMaps.f36497c.m15589i(itemIdAtPosition);
                if (viewM15589i != null) {
                    viewM15589i.setHasTransientState(false);
                    transitionValuesMaps.f36497c.m15593m(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static ArrayMap<Animator, b> m15492r() {
        ArrayMap<Animator, b> arrayMap = f36445h.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        ArrayMap<Animator, b> arrayMap2 = new ArrayMap<>();
        f36445h.set(arrayMap2);
        return arrayMap2;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m15493x(TransitionValues transitionValues, TransitionValues transitionValues2, String str) {
        Object obj = transitionValues.f36492a.get(str);
        Object obj2 = transitionValues2.f36492a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* JADX INFO: renamed from: A */
    public Transition3 mo15494A(View view) {
        this.f36454n.remove(view);
        return this;
    }

    /* JADX INFO: renamed from: C */
    public void mo15495C(View view) {
        if (this.f36463w) {
            if (!this.f36464x) {
                ArrayMap<Animator, b> arrayMapM15492r = m15492r();
                int i = arrayMapM15492r.f36667l;
                ViewUtilsBase viewUtilsBase = ViewUtils6.f36500a;
                WindowIdApi18 windowIdApi18 = new WindowIdApi18(view);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    b bVarM15612l = arrayMapM15492r.m15612l(i2);
                    if (bVarM15612l.f36467a != null && windowIdApi18.equals(bVarM15612l.f36470d)) {
                        arrayMapM15492r.m15611h(i2).resume();
                    }
                }
                ArrayList<d> arrayList = this.f36465y;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f36465y.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((d) arrayList2.get(i3)).mo12477e(this);
                    }
                }
            }
            this.f36463w = false;
        }
    }

    /* JADX INFO: renamed from: E */
    public void mo15496E() {
        m15503M();
        ArrayMap<Animator, b> arrayMapM15492r = m15492r();
        for (Animator animator : this.f36466z) {
            if (arrayMapM15492r.containsKey(animator)) {
                m15503M();
                if (animator != null) {
                    animator.addListener(new Transition4(this, arrayMapM15492r));
                    long j2 = this.f36451k;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f36450j;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f36452l;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new Transition5(this));
                    animator.start();
                }
            }
        }
        this.f36466z.clear();
        m15513p();
    }

    /* JADX INFO: renamed from: F */
    public Transition3 mo15497F(long j2) {
        this.f36451k = j2;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public void mo15498G(c cVar) {
        this.f36447B = cVar;
    }

    /* JADX INFO: renamed from: I */
    public Transition3 mo15499I(TimeInterpolator timeInterpolator) {
        this.f36452l = timeInterpolator;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public void mo15500J(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f36448C = f36444g;
        } else {
            this.f36448C = pathMotion;
        }
    }

    /* JADX INFO: renamed from: K */
    public void mo15501K(TransitionPropagation transitionPropagation) {
        this.f36446A = transitionPropagation;
    }

    /* JADX INFO: renamed from: L */
    public Transition3 mo15502L(long j2) {
        this.f36450j = j2;
        return this;
    }

    /* JADX INFO: renamed from: M */
    public void m15503M() {
        if (this.f36462v == 0) {
            ArrayList<d> arrayList = this.f36465y;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f36465y.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((d) arrayList2.get(i)).mo12473a(this);
                }
            }
            this.f36464x = false;
        }
        this.f36462v++;
    }

    /* JADX INFO: renamed from: N */
    public String mo15504N(String str) {
        StringBuilder sbM1556G = outline.m1556G(str);
        sbM1556G.append(getClass().getSimpleName());
        sbM1556G.append("@");
        sbM1556G.append(Integer.toHexString(hashCode()));
        sbM1556G.append(": ");
        String string = sbM1556G.toString();
        if (this.f36451k != -1) {
            StringBuilder sbM1561L = outline.m1561L(string, "dur(");
            sbM1561L.append(this.f36451k);
            sbM1561L.append(") ");
            string = sbM1561L.toString();
        }
        if (this.f36450j != -1) {
            StringBuilder sbM1561L2 = outline.m1561L(string, "dly(");
            sbM1561L2.append(this.f36450j);
            sbM1561L2.append(") ");
            string = sbM1561L2.toString();
        }
        if (this.f36452l != null) {
            StringBuilder sbM1561L3 = outline.m1561L(string, "interp(");
            sbM1561L3.append(this.f36452l);
            sbM1561L3.append(") ");
            string = sbM1561L3.toString();
        }
        if (this.f36453m.size() <= 0 && this.f36454n.size() <= 0) {
            return string;
        }
        String strM1599u = outline.m1599u(string, "tgts(");
        if (this.f36453m.size() > 0) {
            for (int i = 0; i < this.f36453m.size(); i++) {
                if (i > 0) {
                    strM1599u = outline.m1599u(strM1599u, ", ");
                }
                StringBuilder sbM1556G2 = outline.m1556G(strM1599u);
                sbM1556G2.append(this.f36453m.get(i));
                strM1599u = sbM1556G2.toString();
            }
        }
        if (this.f36454n.size() > 0) {
            for (int i2 = 0; i2 < this.f36454n.size(); i2++) {
                if (i2 > 0) {
                    strM1599u = outline.m1599u(strM1599u, ", ");
                }
                StringBuilder sbM1556G3 = outline.m1556G(strM1599u);
                sbM1556G3.append(this.f36454n.get(i2));
                strM1599u = sbM1556G3.toString();
            }
        }
        return outline.m1599u(strM1599u, ")");
    }

    /* JADX INFO: renamed from: a */
    public Transition3 mo15505a(d dVar) {
        if (this.f36465y == null) {
            this.f36465y = new ArrayList<>();
        }
        this.f36465y.add(dVar);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public Transition3 mo15506b(View view) {
        this.f36454n.add(view);
        return this;
    }

    public void cancel() {
        for (int size = this.f36461u.size() - 1; size >= 0; size--) {
            this.f36461u.get(size).cancel();
        }
        ArrayList<d> arrayList = this.f36465y;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f36465y.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((d) arrayList2.get(i)).mo12476d(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo11341e(TransitionValues transitionValues);

    /* JADX INFO: renamed from: g */
    public final void m15507g(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            TransitionValues transitionValues = new TransitionValues(view);
            if (z) {
                mo11342j(transitionValues);
            } else {
                mo11341e(transitionValues);
            }
            transitionValues.f36494c.add(this);
            mo15508i(transitionValues);
            if (z) {
                m15491d(this.f36455o, view, transitionValues);
            } else {
                m15491d(this.f36456p, view, transitionValues);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m15507g(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo15508i(TransitionValues transitionValues) {
        String[] strArrM15522b;
        if (this.f36446A == null || transitionValues.f36492a.isEmpty() || (strArrM15522b = this.f36446A.m15522b()) == null) {
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= strArrM15522b.length) {
                z = true;
                break;
            } else if (!transitionValues.f36492a.containsKey(strArrM15522b[i])) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return;
        }
        this.f36446A.m15521a(transitionValues);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo11342j(TransitionValues transitionValues);

    /* JADX INFO: renamed from: k */
    public void m15509k(ViewGroup viewGroup, boolean z) {
        m15510l(z);
        if (this.f36453m.size() <= 0 && this.f36454n.size() <= 0) {
            m15507g(viewGroup, z);
            return;
        }
        for (int i = 0; i < this.f36453m.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(this.f36453m.get(i).intValue());
            if (viewFindViewById != null) {
                TransitionValues transitionValues = new TransitionValues(viewFindViewById);
                if (z) {
                    mo11342j(transitionValues);
                } else {
                    mo11341e(transitionValues);
                }
                transitionValues.f36494c.add(this);
                mo15508i(transitionValues);
                if (z) {
                    m15491d(this.f36455o, viewFindViewById, transitionValues);
                } else {
                    m15491d(this.f36456p, viewFindViewById, transitionValues);
                }
            }
        }
        for (int i2 = 0; i2 < this.f36454n.size(); i2++) {
            View view = this.f36454n.get(i2);
            TransitionValues transitionValues2 = new TransitionValues(view);
            if (z) {
                mo11342j(transitionValues2);
            } else {
                mo11341e(transitionValues2);
            }
            transitionValues2.f36494c.add(this);
            mo15508i(transitionValues2);
            if (z) {
                m15491d(this.f36455o, view, transitionValues2);
            } else {
                m15491d(this.f36456p, view, transitionValues2);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m15510l(boolean z) {
        if (z) {
            this.f36455o.f36495a.clear();
            this.f36455o.f36496b.clear();
            this.f36455o.f36497c.m15585b();
        } else {
            this.f36456p.f36495a.clear();
            this.f36456p.f36496b.clear();
            this.f36456p.f36497c.m15585b();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Transition3 clone() {
        try {
            Transition3 transition3 = (Transition3) super.clone();
            transition3.f36466z = new ArrayList<>();
            transition3.f36455o = new TransitionValuesMaps();
            transition3.f36456p = new TransitionValuesMaps();
            transition3.f36459s = null;
            transition3.f36460t = null;
            return transition3;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public Animator mo11343n(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX INFO: renamed from: o */
    public void mo15512o(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList<TransitionValues> arrayList, ArrayList<TransitionValues> arrayList2) {
        Animator animatorMo11343n;
        int i;
        int i2;
        View view;
        Animator animator;
        TransitionValues transitionValues;
        Animator animator2;
        TransitionValues transitionValues2;
        ArrayMap<Animator, b> arrayMapM15492r = m15492r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long jMin = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            TransitionValues transitionValues3 = arrayList.get(i3);
            TransitionValues transitionValues4 = arrayList2.get(i3);
            if (transitionValues3 != null && !transitionValues3.f36494c.contains(this)) {
                transitionValues3 = null;
            }
            if (transitionValues4 != null && !transitionValues4.f36494c.contains(this)) {
                transitionValues4 = null;
            }
            if (transitionValues3 == null && transitionValues4 == null) {
                i = size;
                i2 = i3;
            } else if (!(transitionValues3 == null || transitionValues4 == null || mo15467v(transitionValues3, transitionValues4)) || (animatorMo11343n = mo11343n(viewGroup, transitionValues3, transitionValues4)) == null) {
                i = size;
                i2 = i3;
            } else {
                if (transitionValues4 != null) {
                    view = transitionValues4.f36493b;
                    String[] strArrMo15461s = mo15461s();
                    if (strArrMo15461s != null && strArrMo15461s.length > 0) {
                        transitionValues2 = new TransitionValues(view);
                        i = size;
                        TransitionValues transitionValues5 = transitionValuesMaps2.f36495a.get(view);
                        if (transitionValues5 != null) {
                            int i4 = 0;
                            while (i4 < strArrMo15461s.length) {
                                transitionValues2.f36492a.put(strArrMo15461s[i4], transitionValues5.f36492a.get(strArrMo15461s[i4]));
                                i4++;
                                i3 = i3;
                                transitionValues5 = transitionValues5;
                            }
                        }
                        i2 = i3;
                        int i5 = arrayMapM15492r.f36667l;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                animator2 = animatorMo11343n;
                                break;
                            }
                            b bVar = arrayMapM15492r.get(arrayMapM15492r.m15611h(i6));
                            if (bVar.f36469c != null && bVar.f36467a == view && bVar.f36468b.equals(this.f36449i) && bVar.f36469c.equals(transitionValues2)) {
                                animator2 = null;
                                break;
                            }
                            i6++;
                        }
                    } else {
                        i = size;
                        i2 = i3;
                        animator2 = animatorMo11343n;
                        transitionValues2 = null;
                    }
                    animator = animator2;
                    transitionValues = transitionValues2;
                } else {
                    i = size;
                    i2 = i3;
                    view = transitionValues3.f36493b;
                    animator = animatorMo11343n;
                    transitionValues = null;
                }
                if (animator != null) {
                    TransitionPropagation transitionPropagation = this.f36446A;
                    if (transitionPropagation != null) {
                        long jM15523c = transitionPropagation.m15523c(viewGroup, this, transitionValues3, transitionValues4);
                        sparseIntArray.put(this.f36466z.size(), (int) jM15523c);
                        jMin = Math.min(jM15523c, jMin);
                    }
                    long j2 = jMin;
                    String str = this.f36449i;
                    ViewUtilsBase viewUtilsBase = ViewUtils6.f36500a;
                    arrayMapM15492r.put(animator, new b(view, str, this, new WindowIdApi18(viewGroup), transitionValues));
                    this.f36466z.add(animator);
                    jMin = j2;
                }
            }
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator3 = this.f36466z.get(sparseIntArray.keyAt(i7));
                animator3.setStartDelay(animator3.getStartDelay() + (((long) sparseIntArray.valueAt(i7)) - jMin));
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m15513p() {
        int i = this.f36462v - 1;
        this.f36462v = i;
        if (i == 0) {
            ArrayList<d> arrayList = this.f36465y;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f36465y.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((d) arrayList2.get(i2)).mo12475c(this);
                }
            }
            for (int i3 = 0; i3 < this.f36455o.f36497c.m15595o(); i3++) {
                View viewM15596p = this.f36455o.f36497c.m15596p(i3);
                if (viewM15596p != null) {
                    AtomicInteger atomicInteger = ViewCompat.f38073a;
                    viewM15596p.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < this.f36456p.f36497c.m15595o(); i4++) {
                View viewM15596p2 = this.f36456p.f36497c.m15596p(i4);
                if (viewM15596p2 != null) {
                    AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                    viewM15596p2.setHasTransientState(false);
                }
            }
            this.f36464x = true;
        }
    }

    /* JADX INFO: renamed from: q */
    public TransitionValues m15514q(View view, boolean z) {
        TransitionSet transitionSet = this.f36457q;
        if (transitionSet != null) {
            return transitionSet.m15514q(view, z);
        }
        ArrayList<TransitionValues> arrayList = z ? this.f36459s : this.f36460t;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            TransitionValues transitionValues = arrayList.get(i2);
            if (transitionValues == null) {
                return null;
            }
            if (transitionValues.f36493b == view) {
                i = i2;
                break;
            }
        }
        if (i >= 0) {
            return (z ? this.f36460t : this.f36459s).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public String[] mo15461s() {
        return null;
    }

    /* JADX INFO: renamed from: t */
    public TransitionValues m15515t(View view, boolean z) {
        TransitionSet transitionSet = this.f36457q;
        if (transitionSet != null) {
            return transitionSet.m15515t(view, z);
        }
        return (z ? this.f36455o : this.f36456p).f36495a.getOrDefault(view, null);
    }

    public String toString() {
        return mo15504N("");
    }

    /* JADX INFO: renamed from: v */
    public boolean mo15467v(TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return false;
        }
        String[] strArrMo15461s = mo15461s();
        if (strArrMo15461s == null) {
            Iterator<String> it = transitionValues.f36492a.keySet().iterator();
            while (it.hasNext()) {
                if (m15493x(transitionValues, transitionValues2, it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrMo15461s) {
            if (!m15493x(transitionValues, transitionValues2, str)) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: renamed from: w */
    public boolean m15516w(View view) {
        return (this.f36453m.size() == 0 && this.f36454n.size() == 0) || this.f36453m.contains(Integer.valueOf(view.getId())) || this.f36454n.contains(view);
    }

    /* JADX INFO: renamed from: y */
    public void mo15517y(View view) {
        if (this.f36464x) {
            return;
        }
        ArrayMap<Animator, b> arrayMapM15492r = m15492r();
        int i = arrayMapM15492r.f36667l;
        ViewUtilsBase viewUtilsBase = ViewUtils6.f36500a;
        WindowIdApi18 windowIdApi18 = new WindowIdApi18(view);
        for (int i2 = i - 1; i2 >= 0; i2--) {
            b bVarM15612l = arrayMapM15492r.m15612l(i2);
            if (bVarM15612l.f36467a != null && windowIdApi18.equals(bVarM15612l.f36470d)) {
                arrayMapM15492r.m15611h(i2).pause();
            }
        }
        ArrayList<d> arrayList = this.f36465y;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f36465y.clone();
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((d) arrayList2.get(i3)).mo12474b(this);
            }
        }
        this.f36463w = true;
    }

    /* JADX INFO: renamed from: z */
    public Transition3 mo15518z(d dVar) {
        ArrayList<d> arrayList = this.f36465y;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.f36465y.size() == 0) {
            this.f36465y = null;
        }
        return this;
    }

    @SuppressLint({"RestrictedApi"})
    public Transition3(Context context, AttributeSet attributeSet) {
        boolean z;
        this.f36449i = getClass().getName();
        this.f36450j = -1L;
        this.f36451k = -1L;
        this.f36452l = null;
        this.f36453m = new ArrayList<>();
        this.f36454n = new ArrayList<>();
        this.f36455o = new TransitionValuesMaps();
        this.f36456p = new TransitionValuesMaps();
        this.f36457q = null;
        this.f36458r = f36443f;
        this.f36461u = new ArrayList<>();
        this.f36462v = 0;
        this.f36463w = false;
        this.f36464x = false;
        this.f36465y = null;
        this.f36466z = new ArrayList<>();
        this.f36448C = f36444g;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.f36438a);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jM16077v = C8162a.m16077v(typedArrayObtainStyledAttributes, xmlResourceParser, CainMediaMetadataRetriever.METADATA_KEY_DURATION, 1, -1);
        if (jM16077v >= 0) {
            mo15497F(jM16077v);
        }
        long jM16077v2 = C8162a.m16077v(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jM16077v2 > 0) {
            mo15502L(jM16077v2);
        }
        int iM16078w = C8162a.m16078w(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (iM16078w > 0) {
            mo15499I(AnimationUtils.loadInterpolator(context, iM16078w));
        }
        String strM16079x = C8162a.m16079x(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM16079x != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(strM16079x, ",");
            int[] iArr = new int[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String strTrim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(strTrim)) {
                    iArr[i] = 3;
                } else if ("instance".equalsIgnoreCase(strTrim)) {
                    iArr[i] = 1;
                } else if ("name".equalsIgnoreCase(strTrim)) {
                    iArr[i] = 2;
                } else if ("itemId".equalsIgnoreCase(strTrim)) {
                    iArr[i] = 4;
                } else if (strTrim.isEmpty()) {
                    int[] iArr2 = new int[iArr.length - 1];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    i--;
                    iArr = iArr2;
                } else {
                    throw new InflateException(outline.m1600v("Unknown match type in matchOrder: '", strTrim, "'"));
                }
                i++;
            }
            if (iArr.length == 0) {
                this.f36458r = f36443f;
            } else {
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    int i3 = iArr[i2];
                    if (i3 >= 1 && i3 <= 4) {
                        int i4 = iArr[i2];
                        int i5 = 0;
                        while (true) {
                            if (i5 >= i2) {
                                z = false;
                                break;
                            } else {
                                if (iArr[i5] == i4) {
                                    z = true;
                                    break;
                                }
                                i5++;
                            }
                        }
                        if (z) {
                            throw new IllegalArgumentException("matches contains a duplicate value");
                        }
                    } else {
                        throw new IllegalArgumentException("matches contains invalid value");
                    }
                }
                this.f36458r = (int[]) iArr.clone();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
