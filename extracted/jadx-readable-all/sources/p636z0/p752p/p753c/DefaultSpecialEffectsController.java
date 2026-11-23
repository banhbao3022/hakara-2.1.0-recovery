package p636z0.p752p.p753c;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p691g.ArrayMap;
import p636z0.p691g.MapCollections;
import p636z0.p725k.p735h.CancellationSignal;
import p636z0.p725k.p739l.OneShotPreDrawListener;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p752p.C8310a;

/* JADX INFO: renamed from: z0.p.c.c, reason: use source file name */
/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* JADX INFO: renamed from: z0.p.c.c$a */
    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ List f38286f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ SpecialEffectsController.d f38287g;

        public a(List list, SpecialEffectsController.d dVar) {
            this.f38286f = list;
            this.f38287g = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f38286f.contains(this.f38287g)) {
                this.f38286f.remove(this.f38287g);
                DefaultSpecialEffectsController defaultSpecialEffectsController = DefaultSpecialEffectsController.this;
                SpecialEffectsController.d dVar = this.f38287g;
                Objects.requireNonNull(defaultSpecialEffectsController);
                dVar.f38583a.m16632f(dVar.f38585c.f38416M);
            }
        }
    }

    /* JADX INFO: renamed from: z0.p.c.c$b */
    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    public static class b extends c {

        /* JADX INFO: renamed from: c */
        public boolean f38289c;

        /* JADX INFO: renamed from: d */
        public boolean f38290d;

        /* JADX INFO: renamed from: e */
        public FragmentAnim4 f38291e;

        public b(SpecialEffectsController.d dVar, CancellationSignal cancellationSignal, boolean z) {
            super(dVar, cancellationSignal);
            this.f38290d = false;
            this.f38289c = z;
        }

        /* JADX INFO: renamed from: c */
        public FragmentAnim4 m16465c(Context context) {
            if (this.f38290d) {
                return this.f38291e;
            }
            SpecialEffectsController.d dVar = this.f38292a;
            FragmentAnim4 fragmentAnim4M16441f = C8310a.m16441f(context, dVar.f38585c, dVar.f38583a == SpecialEffectsController.d.c.VISIBLE, this.f38289c);
            this.f38291e = fragmentAnim4M16441f;
            this.f38290d = true;
            return fragmentAnim4M16441f;
        }
    }

    /* JADX INFO: renamed from: z0.p.c.c$c */
    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final SpecialEffectsController.d f38292a;

        /* JADX INFO: renamed from: b */
        public final CancellationSignal f38293b;

        public c(SpecialEffectsController.d dVar, CancellationSignal cancellationSignal) {
            this.f38292a = dVar;
            this.f38293b = cancellationSignal;
        }

        /* JADX INFO: renamed from: a */
        public void m16466a() {
            SpecialEffectsController.d dVar = this.f38292a;
            if (dVar.f38587e.remove(this.f38293b) && dVar.f38587e.isEmpty()) {
                dVar.mo16626b();
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m16467b() {
            SpecialEffectsController.d.c cVar;
            SpecialEffectsController.d.c cVarM16631j = SpecialEffectsController.d.c.m16631j(this.f38292a.f38585c.f38416M);
            SpecialEffectsController.d.c cVar2 = this.f38292a.f38583a;
            return cVarM16631j == cVar2 || !(cVarM16631j == (cVar = SpecialEffectsController.d.c.VISIBLE) || cVar2 == cVar);
        }
    }

    /* JADX INFO: renamed from: z0.p.c.c$d */
    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    public static class d extends c {

        /* JADX INFO: renamed from: c */
        public final Object f38294c;

        /* JADX INFO: renamed from: d */
        public final boolean f38295d;

        /* JADX INFO: renamed from: e */
        public final Object f38296e;

        public d(SpecialEffectsController.d dVar, CancellationSignal cancellationSignal, boolean z, boolean z2) {
            Object objM16541N;
            Object objM16537L;
            super(dVar, cancellationSignal);
            if (dVar.f38583a == SpecialEffectsController.d.c.VISIBLE) {
                if (z) {
                    objM16537L = dVar.f38585c.m16537L();
                } else {
                    dVar.f38585c.m16573z();
                    objM16537L = null;
                }
                this.f38294c = objM16537L;
                if (z) {
                    Fragment.b bVar = dVar.f38585c.f38419P;
                } else {
                    Fragment.b bVar2 = dVar.f38585c.f38419P;
                }
                this.f38295d = true;
            } else {
                if (z) {
                    objM16541N = dVar.f38585c.m16541N();
                } else {
                    dVar.f38585c.m16520C();
                    objM16541N = null;
                }
                this.f38294c = objM16541N;
                this.f38295d = true;
            }
            if (!z2) {
                this.f38296e = null;
            } else if (z) {
                this.f38296e = dVar.f38585c.m16545P();
            } else {
                dVar.f38585c.m16543O();
                this.f38296e = null;
            }
        }

        /* JADX INFO: renamed from: c */
        public final FragmentTransitionImpl m16468c(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition7.f38521b;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.mo15475e(obj)) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition7.f38522c;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.mo15475e(obj)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f38292a.f38585c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public DefaultSpecialEffectsController(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p636z0.p752p.p753c.SpecialEffectsController
    /* JADX INFO: renamed from: b */
    public void mo16461b(List<SpecialEffectsController.d> list, boolean z) {
        ArrayList<b> arrayList;
        ArrayList arrayList2;
        HashMap map;
        SpecialEffectsController.d.c cVar;
        String str;
        String str2;
        SpecialEffectsController.d dVar;
        Object obj;
        SpecialEffectsController.d.c cVar2;
        SpecialEffectsController.d.c cVar3;
        View view;
        Object objMo15478m;
        Object obj2;
        SpecialEffectsController.d dVar2;
        ArrayList<View> arrayList3;
        SpecialEffectsController.d.c cVar4;
        ArrayList arrayList4;
        ArrayList arrayList5;
        HashMap map2;
        ArrayList<View> arrayList6;
        SpecialEffectsController.d dVar3;
        View view2;
        FragmentTransitionImpl fragmentTransitionImpl;
        Rect rect;
        ArrayList<String> arrayList7;
        ArrayList<String> arrayList8;
        ArrayList<String> arrayList9;
        ArrayList<String> arrayList10;
        View view3;
        boolean z2 = z;
        SpecialEffectsController.d.c cVar5 = SpecialEffectsController.d.c.GONE;
        SpecialEffectsController.d.c cVar6 = SpecialEffectsController.d.c.VISIBLE;
        SpecialEffectsController.d dVar4 = null;
        SpecialEffectsController.d dVar5 = null;
        for (SpecialEffectsController.d dVar6 : list) {
            SpecialEffectsController.d.c cVarM16631j = SpecialEffectsController.d.c.m16631j(dVar6.f38585c.f38416M);
            int iOrdinal = dVar6.f38583a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2 || iOrdinal == 3) {
                    }
                } else if (cVarM16631j != cVar6) {
                    dVar5 = dVar6;
                }
            }
            if (cVarM16631j == cVar6 && dVar4 == null) {
                dVar4 = dVar6;
            }
        }
        ArrayList arrayList11 = new ArrayList();
        ArrayList<d> arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList(list);
        Iterator<SpecialEffectsController.d> it = list.iterator();
        while (it.hasNext()) {
            SpecialEffectsController.d next = it.next();
            CancellationSignal cancellationSignal = new CancellationSignal();
            next.mo16627d();
            next.f38587e.add(cancellationSignal);
            arrayList11.add(new b(next, cancellationSignal, z2));
            CancellationSignal cancellationSignal2 = new CancellationSignal();
            next.mo16627d();
            next.f38587e.add(cancellationSignal2);
            arrayList12.add(new d(next, cancellationSignal2, z2, !z2 ? next != dVar5 : next != dVar4));
            next.f38586d.add(new a(arrayList13, next));
        }
        HashMap map3 = new HashMap();
        FragmentTransitionImpl fragmentTransitionImpl2 = null;
        for (d dVar7 : arrayList12) {
            if (!dVar7.m16467b()) {
                FragmentTransitionImpl fragmentTransitionImplM16468c = dVar7.m16468c(dVar7.f38294c);
                FragmentTransitionImpl fragmentTransitionImplM16468c2 = dVar7.m16468c(dVar7.f38296e);
                if (fragmentTransitionImplM16468c != null && fragmentTransitionImplM16468c2 != null && fragmentTransitionImplM16468c != fragmentTransitionImplM16468c2) {
                    StringBuilder sbM1556G = outline.m1556G("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sbM1556G.append(dVar7.f38292a.f38585c);
                    sbM1556G.append(" returned Transition ");
                    sbM1556G.append(dVar7.f38294c);
                    sbM1556G.append(" which uses a different Transition  type than its shared element transition ");
                    sbM1556G.append(dVar7.f38296e);
                    throw new IllegalArgumentException(sbM1556G.toString());
                }
                if (fragmentTransitionImplM16468c == null) {
                    fragmentTransitionImplM16468c = fragmentTransitionImplM16468c2;
                }
                if (fragmentTransitionImpl2 == null) {
                    fragmentTransitionImpl2 = fragmentTransitionImplM16468c;
                } else if (fragmentTransitionImplM16468c != null && fragmentTransitionImpl2 != fragmentTransitionImplM16468c) {
                    StringBuilder sbM1556G2 = outline.m1556G("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sbM1556G2.append(dVar7.f38292a.f38585c);
                    sbM1556G2.append(" returned Transition ");
                    sbM1556G2.append(dVar7.f38294c);
                    sbM1556G2.append(" which uses a different Transition  type than other Fragments.");
                    throw new IllegalArgumentException(sbM1556G2.toString());
                }
            }
        }
        if (fragmentTransitionImpl2 == null) {
            for (d dVar8 : arrayList12) {
                map3.put(dVar8.f38292a, Boolean.FALSE);
                dVar8.m16466a();
            }
            cVar = cVar5;
            arrayList = arrayList11;
            arrayList2 = arrayList13;
            map = map3;
            str = "FragmentManager";
        } else {
            View view4 = new View(this.f38573a.getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList14 = new ArrayList<>();
            ArrayList<View> arrayList15 = new ArrayList<>();
            arrayList = arrayList11;
            ArrayMap arrayMap = new ArrayMap();
            Iterator it2 = arrayList12.iterator();
            Rect rect3 = rect2;
            Object obj3 = null;
            View view5 = null;
            boolean z3 = false;
            View view6 = view4;
            String str3 = "FragmentManager";
            SpecialEffectsController.d dVar9 = dVar4;
            SpecialEffectsController.d dVar10 = dVar5;
            while (it2.hasNext()) {
                SpecialEffectsController.d.c cVar7 = cVar6;
                Object obj4 = ((d) it2.next()).f38296e;
                if (!(obj4 != null) || dVar9 == null || dVar10 == null) {
                    arrayList3 = arrayList14;
                    cVar4 = cVar5;
                    arrayList4 = arrayList12;
                    arrayList5 = arrayList13;
                    map2 = map3;
                    arrayList6 = arrayList15;
                    dVar3 = dVar5;
                    view2 = view6;
                    fragmentTransitionImpl = fragmentTransitionImpl2;
                    rect = rect3;
                } else {
                    Object objMo15488y = fragmentTransitionImpl2.mo15488y(fragmentTransitionImpl2.mo15476g(obj4));
                    Fragment.b bVar = dVar10.f38585c.f38419P;
                    if (bVar == null || (arrayList7 = bVar.f38461i) == null) {
                        arrayList7 = new ArrayList<>();
                    }
                    FragmentTransitionImpl fragmentTransitionImpl3 = fragmentTransitionImpl2;
                    Fragment.b bVar2 = dVar9.f38585c.f38419P;
                    if (bVar2 == null || (arrayList8 = bVar2.f38461i) == null) {
                        arrayList8 = new ArrayList<>();
                    }
                    arrayList5 = arrayList13;
                    Fragment.b bVar3 = dVar9.f38585c.f38419P;
                    if (bVar3 == null || (arrayList9 = bVar3.f38462j) == null) {
                        arrayList9 = new ArrayList<>();
                    }
                    cVar4 = cVar5;
                    arrayList4 = arrayList12;
                    int i = 0;
                    while (i < arrayList9.size()) {
                        int iIndexOf = arrayList7.indexOf(arrayList9.get(i));
                        ArrayList<String> arrayList16 = arrayList9;
                        if (iIndexOf != -1) {
                            arrayList7.set(iIndexOf, arrayList8.get(i));
                        }
                        i++;
                        arrayList9 = arrayList16;
                    }
                    Fragment.b bVar4 = dVar10.f38585c.f38419P;
                    if (bVar4 == null || (arrayList10 = bVar4.f38462j) == null) {
                        arrayList10 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList17 = arrayList10;
                    if (z2) {
                        dVar9.f38585c.m16516A();
                        dVar10.f38585c.m16522D();
                    } else {
                        dVar9.f38585c.m16522D();
                        dVar10.f38585c.m16516A();
                    }
                    int i2 = 0;
                    for (int size = arrayList7.size(); i2 < size; size = size) {
                        arrayMap.put(arrayList7.get(i2), arrayList17.get(i2));
                        i2++;
                    }
                    ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
                    m16463k(arrayMap2, dVar9.f38585c.f38416M);
                    MapCollections.m15601k(arrayMap2, arrayList7);
                    MapCollections.m15601k(arrayMap, arrayMap2.keySet());
                    ArrayMap<String, View> arrayMap3 = new ArrayMap<>();
                    m16463k(arrayMap3, dVar10.f38585c.f38416M);
                    MapCollections.m15601k(arrayMap3, arrayList17);
                    MapCollections.m15601k(arrayMap3, arrayMap.values());
                    FragmentTransition7.m16598m(arrayMap, arrayMap3);
                    m16464l(arrayMap2, arrayMap.keySet());
                    m16464l(arrayMap3, arrayMap.values());
                    if (arrayMap.isEmpty()) {
                        arrayList14.clear();
                        arrayList15.clear();
                        obj3 = null;
                        rect = rect3;
                        arrayList3 = arrayList14;
                        map2 = map3;
                        arrayList6 = arrayList15;
                        dVar3 = dVar5;
                        view2 = view6;
                        fragmentTransitionImpl = fragmentTransitionImpl3;
                    } else {
                        FragmentTransition7.m16588c(dVar10.f38585c, dVar9.f38585c, z2, arrayMap2, true);
                        arrayList3 = arrayList14;
                        Rect rect4 = rect3;
                        ArrayList<String> arrayList18 = arrayList7;
                        SpecialEffectsController.d dVar11 = dVar5;
                        SpecialEffectsController.d dVar12 = dVar5;
                        HashMap map4 = map3;
                        arrayList6 = arrayList15;
                        SpecialEffectsController.d dVar13 = dVar4;
                        view2 = view6;
                        fragmentTransitionImpl = fragmentTransitionImpl3;
                        OneShotPreDrawListener.m16304a(this.f38573a, new DefaultSpecialEffectsController6(this, dVar11, dVar4, z, arrayMap3));
                        Iterator it3 = ((MapCollections.e) arrayMap2.values()).iterator();
                        while (true) {
                            MapCollections.a aVar = (MapCollections.a) it3;
                            if (!aVar.hasNext()) {
                                break;
                            } else {
                                m16462j(arrayList3, (View) aVar.next());
                            }
                        }
                        if (!arrayList18.isEmpty()) {
                            View view7 = (View) arrayMap2.get(arrayList18.get(0));
                            fragmentTransitionImpl.mo15484t(objMo15488y, view7);
                            view5 = view7;
                        }
                        Iterator it4 = ((MapCollections.e) arrayMap3.values()).iterator();
                        while (true) {
                            MapCollections.a aVar2 = (MapCollections.a) it4;
                            if (!aVar2.hasNext()) {
                                break;
                            } else {
                                m16462j(arrayList6, (View) aVar2.next());
                            }
                        }
                        if (arrayList17.isEmpty() || (view3 = (View) arrayMap3.get(arrayList17.get(0))) == null) {
                            rect = rect4;
                        } else {
                            rect = rect4;
                            OneShotPreDrawListener.m16304a(this.f38573a, new DefaultSpecialEffectsController7(this, fragmentTransitionImpl, view3, rect));
                            z3 = true;
                        }
                        fragmentTransitionImpl.mo15486w(objMo15488y, view2, arrayList3);
                        fragmentTransitionImpl.mo15482r(objMo15488y, null, null, null, null, objMo15488y, arrayList6);
                        Boolean bool = Boolean.TRUE;
                        map2 = map4;
                        dVar4 = dVar13;
                        map2.put(dVar4, bool);
                        dVar3 = dVar12;
                        map2.put(dVar3, bool);
                        obj3 = objMo15488y;
                        dVar9 = dVar4;
                        dVar10 = dVar3;
                    }
                }
                view6 = view2;
                rect3 = rect;
                arrayList14 = arrayList3;
                fragmentTransitionImpl2 = fragmentTransitionImpl;
                dVar5 = dVar3;
                arrayList15 = arrayList6;
                cVar6 = cVar7;
                arrayList13 = arrayList5;
                arrayList12 = arrayList4;
                arrayMap = arrayMap;
                str3 = str3;
                z2 = z;
                map3 = map2;
                cVar5 = cVar4;
            }
            ArrayList<View> arrayList19 = arrayList14;
            SpecialEffectsController.d.c cVar8 = cVar5;
            SpecialEffectsController.d.c cVar9 = cVar6;
            ArrayMap arrayMap4 = arrayMap;
            ArrayList<d> arrayList20 = arrayList12;
            arrayList2 = arrayList13;
            map = map3;
            String str4 = str3;
            ArrayList<View> arrayList21 = arrayList15;
            SpecialEffectsController.d dVar14 = dVar5;
            View view8 = view6;
            FragmentTransitionImpl fragmentTransitionImpl4 = fragmentTransitionImpl2;
            Rect rect5 = rect3;
            ArrayList arrayList22 = new ArrayList();
            Object obj5 = null;
            Object objMo15478m2 = null;
            for (Iterator it5 = arrayList20.iterator(); it5.hasNext(); it5 = it5) {
                d dVar15 = (d) it5.next();
                if (dVar15.m16467b()) {
                    dVar = dVar14;
                    map.put(dVar15.f38292a, Boolean.FALSE);
                    dVar15.m16466a();
                    view8 = view8;
                    obj = obj3;
                    dVar2 = dVar10;
                    obj2 = obj5;
                    view = view5;
                    cVar3 = cVar9;
                    cVar2 = cVar8;
                } else {
                    dVar = dVar14;
                    Object objMo15476g = fragmentTransitionImpl4.mo15476g(dVar15.f38294c);
                    SpecialEffectsController.d dVar16 = dVar15.f38292a;
                    boolean z4 = obj3 != null && (dVar16 == dVar9 || dVar16 == dVar10);
                    if (objMo15476g == null) {
                        if (!z4) {
                            map.put(dVar16, Boolean.FALSE);
                            dVar15.m16466a();
                        }
                        view8 = view8;
                        obj = obj3;
                        objMo15478m = obj5;
                        view = view5;
                        cVar3 = cVar9;
                        cVar2 = cVar8;
                    } else {
                        obj = obj3;
                        ArrayList<View> arrayList23 = new ArrayList<>();
                        Object obj6 = obj5;
                        m16462j(arrayList23, dVar16.f38585c.f38416M);
                        if (z4) {
                            if (dVar16 == dVar9) {
                                arrayList23.removeAll(arrayList19);
                            } else {
                                arrayList23.removeAll(arrayList21);
                            }
                        }
                        if (arrayList23.isEmpty()) {
                            fragmentTransitionImpl4.mo15472a(objMo15476g, view8);
                            cVar2 = cVar8;
                        } else {
                            fragmentTransitionImpl4.mo15473b(objMo15476g, arrayList23);
                            fragmentTransitionImpl4.mo15482r(objMo15476g, objMo15476g, arrayList23, null, null, null, null);
                            cVar2 = cVar8;
                            if (dVar16.f38583a == cVar2) {
                                arrayList2.remove(dVar16);
                                fragmentTransitionImpl4.mo15481q(objMo15476g, dVar16.f38585c.f38416M, arrayList23);
                                OneShotPreDrawListener.m16304a(this.f38573a, new DefaultSpecialEffectsController8(this, arrayList23));
                            }
                        }
                        cVar3 = cVar9;
                        if (dVar16.f38583a == cVar3) {
                            arrayList22.addAll(arrayList23);
                            if (z3) {
                                fragmentTransitionImpl4.mo15483s(objMo15476g, rect5);
                            }
                            view = view5;
                        } else {
                            view = view5;
                            fragmentTransitionImpl4.mo15484t(objMo15476g, view);
                        }
                        map.put(dVar16, Boolean.TRUE);
                        if (dVar15.f38295d) {
                            objMo15478m2 = fragmentTransitionImpl4.mo15478m(objMo15478m2, objMo15476g, null);
                            objMo15478m = obj6;
                        } else {
                            objMo15478m = fragmentTransitionImpl4.mo15478m(obj6, objMo15476g, null);
                        }
                    }
                    obj2 = objMo15478m;
                    dVar2 = dVar;
                }
                view5 = view;
                cVar9 = cVar3;
                cVar8 = cVar2;
                view8 = view8;
                dVar14 = dVar;
                dVar10 = dVar2;
                obj5 = obj2;
                obj3 = obj;
            }
            SpecialEffectsController.d dVar17 = dVar14;
            Object obj7 = obj5;
            cVar = cVar8;
            Object objMo15477l = fragmentTransitionImpl4.mo15477l(objMo15478m2, obj7, obj3);
            for (d dVar18 : arrayList20) {
                if (!dVar18.m16467b()) {
                    Object obj8 = dVar18.f38294c;
                    SpecialEffectsController.d dVar19 = dVar18.f38292a;
                    SpecialEffectsController.d dVar20 = dVar17;
                    boolean z5 = obj3 != null && (dVar19 == dVar9 || dVar19 == dVar20);
                    if (obj8 != null || z5) {
                        ViewGroup viewGroup = this.f38573a;
                        AtomicInteger atomicInteger = ViewCompat.f38073a;
                        if (viewGroup.isLaidOut()) {
                            fragmentTransitionImpl4.mo15485u(dVar18.f38292a.f38585c, objMo15477l, dVar18.f38293b, new DefaultSpecialEffectsController9(this, dVar18));
                            dVar9 = dVar9;
                        } else {
                            if (FragmentManager.m16647O(2)) {
                                StringBuilder sbM1556G3 = outline.m1556G("SpecialEffectsController: Container ");
                                sbM1556G3.append(this.f38573a);
                                sbM1556G3.append(" has not been laid out. Completing operation ");
                                sbM1556G3.append(dVar19);
                                str2 = str4;
                                Log.v(str2, sbM1556G3.toString());
                            } else {
                                str2 = str4;
                            }
                            dVar18.m16466a();
                        }
                        dVar17 = dVar20;
                    } else {
                        str2 = str4;
                    }
                    str4 = str2;
                    dVar17 = dVar20;
                }
            }
            str = str4;
            ViewGroup viewGroup2 = this.f38573a;
            AtomicInteger atomicInteger2 = ViewCompat.f38073a;
            if (viewGroup2.isLaidOut()) {
                FragmentTransition7.m16600o(arrayList22, 4);
                ArrayList<String> arrayListM16609n = fragmentTransitionImpl4.m16609n(arrayList21);
                fragmentTransitionImpl4.mo15474c(this.f38573a, objMo15477l);
                fragmentTransitionImpl4.m16610v(this.f38573a, arrayList19, arrayList21, arrayListM16609n, arrayMap4);
                FragmentTransition7.m16600o(arrayList22, 0);
                fragmentTransitionImpl4.mo15487x(obj3, arrayList19, arrayList21);
            }
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        ViewGroup viewGroup3 = this.f38573a;
        Context context = viewGroup3.getContext();
        ArrayList<b> arrayList24 = new ArrayList();
        boolean z6 = false;
        for (b bVar5 : arrayList) {
            if (bVar5.m16467b()) {
                bVar5.m16466a();
            } else {
                FragmentAnim4 fragmentAnim4M16465c = bVar5.m16465c(context);
                if (fragmentAnim4M16465c == null) {
                    bVar5.m16466a();
                } else {
                    Animator animator = fragmentAnim4M16465c.f38530b;
                    if (animator == null) {
                        arrayList24.add(bVar5);
                    } else {
                        SpecialEffectsController.d dVar21 = bVar5.f38292a;
                        Fragment fragment = dVar21.f38585c;
                        if (Boolean.TRUE.equals(map.get(dVar21))) {
                            if (FragmentManager.m16647O(2)) {
                                Log.v(str, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                            }
                            bVar5.m16466a();
                        } else {
                            boolean z7 = dVar21.f38583a == cVar;
                            ArrayList arrayList25 = arrayList2;
                            if (z7) {
                                arrayList25.remove(dVar21);
                            }
                            View view9 = fragment.f38416M;
                            viewGroup3.startViewTransition(view9);
                            animator.addListener(new DefaultSpecialEffectsController2(this, viewGroup3, view9, z7, dVar21, bVar5));
                            animator.setTarget(view9);
                            animator.start();
                            bVar5.f38293b.m16202b(new DefaultSpecialEffectsController3(this, animator));
                            z6 = true;
                            arrayList2 = arrayList25;
                            cVar = cVar;
                            map = map;
                        }
                    }
                }
            }
        }
        ArrayList<SpecialEffectsController.d> arrayList26 = arrayList2;
        for (b bVar6 : arrayList24) {
            SpecialEffectsController.d dVar22 = bVar6.f38292a;
            Fragment fragment2 = dVar22.f38585c;
            if (zContainsValue) {
                if (FragmentManager.m16647O(2)) {
                    Log.v(str, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
                }
                bVar6.m16466a();
            } else if (z6) {
                if (FragmentManager.m16647O(2)) {
                    Log.v(str, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
                bVar6.m16466a();
            } else {
                View view10 = fragment2.f38416M;
                FragmentAnim4 fragmentAnim4M16465c2 = bVar6.m16465c(context);
                Objects.requireNonNull(fragmentAnim4M16465c2);
                Animation animation = fragmentAnim4M16465c2.f38529a;
                Objects.requireNonNull(animation);
                if (dVar22.f38583a != SpecialEffectsController.d.c.REMOVED) {
                    view10.startAnimation(animation);
                    bVar6.m16466a();
                } else {
                    viewGroup3.startViewTransition(view10);
                    FragmentAnim5 fragmentAnim5 = new FragmentAnim5(animation, viewGroup3, view10);
                    fragmentAnim5.setAnimationListener(new DefaultSpecialEffectsController4(this, viewGroup3, view10, bVar6));
                    view10.startAnimation(fragmentAnim5);
                }
                bVar6.f38293b.m16202b(new DefaultSpecialEffectsController5(this, view10, viewGroup3, bVar6));
            }
        }
        for (SpecialEffectsController.d dVar23 : arrayList26) {
            dVar23.f38583a.m16632f(dVar23.f38585c.f38416M);
        }
        arrayList26.clear();
    }

    /* JADX INFO: renamed from: j */
    public void m16462j(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        if (!arrayList.contains(view)) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (view.getTransitionName() != null) {
                arrayList.add(view);
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                m16462j(arrayList, childAt);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m16463k(Map<String, View> map, View view) {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m16463k(map, childAt);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public void m16464l(ArrayMap<String, View> arrayMap, Collection<String> collection) {
        Iterator it = ((MapCollections.b) arrayMap.entrySet()).iterator();
        while (true) {
            MapCollections.d dVar = (MapCollections.d) it;
            if (!dVar.hasNext()) {
                return;
            }
            dVar.next();
            View view = (View) dVar.getValue();
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (!collection.contains(view.getTransitionName())) {
                dVar.remove();
            }
        }
    }
}
