package p636z0.p752p.p753c;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p691g.ArrayMap;
import p636z0.p691g.MapCollections;
import p636z0.p725k.p735h.CancellationSignal;
import p636z0.p725k.p739l.OneShotPreDrawListener;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.p.c.q0, reason: use source file name */
/* JADX INFO: compiled from: FragmentTransition.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentTransition7 {

    /* JADX INFO: renamed from: a */
    public static final int[] f38520a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* JADX INFO: renamed from: b */
    public static final FragmentTransitionImpl f38521b = new FragmentTransitionCompat21();

    /* JADX INFO: renamed from: c */
    public static final FragmentTransitionImpl f38522c;

    /* JADX INFO: renamed from: z0.p.c.q0$a */
    /* JADX INFO: compiled from: FragmentTransition.java */
    public interface a {
    }

    /* JADX INFO: renamed from: z0.p.c.q0$b */
    /* JADX INFO: compiled from: FragmentTransition.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public Fragment f38523a;

        /* JADX INFO: renamed from: b */
        public boolean f38524b;

        /* JADX INFO: renamed from: c */
        public BackStackRecord f38525c;

        /* JADX INFO: renamed from: d */
        public Fragment f38526d;

        /* JADX INFO: renamed from: e */
        public boolean f38527e;

        /* JADX INFO: renamed from: f */
        public BackStackRecord f38528f;
    }

    static {
        FragmentTransitionImpl fragmentTransitionImpl;
        try {
            fragmentTransitionImpl = (FragmentTransitionImpl) Class.forName("z0.e0.d").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            fragmentTransitionImpl = null;
        }
        f38522c = fragmentTransitionImpl;
    }

    /* JADX INFO: renamed from: a */
    public static void m16586a(ArrayList<View> arrayList, ArrayMap<String, View> arrayMap, Collection<String> collection) {
        for (int i = arrayMap.f36667l - 1; i >= 0; i--) {
            View viewM15612l = arrayMap.m15612l(i);
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (collection.contains(viewM15612l.getTransitionName())) {
                arrayList.add(viewM15612l);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0076  */
    /* JADX WARN: Code duplicated, block: B:61:0x0078  */
    /* JADX WARN: Code duplicated, block: B:63:0x007c  */
    /* JADX WARN: Code duplicated, block: B:64:0x007e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0088  */
    /* JADX INFO: renamed from: b */
    public static void m16587b(BackStackRecord backStackRecord, FragmentTransaction.a aVar, SparseArray<b> sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        View view;
        boolean z6;
        Fragment fragment = aVar.f38369b;
        if (fragment == null || (i = fragment.f38407D) == 0) {
            return;
        }
        int i2 = z ? f38520a[aVar.f38368a] : aVar.f38368a;
        boolean z7 = true;
        boolean z8 = false;
        if (i2 == 1) {
            if (z2 || fragment.f38443r || fragment.f38409F) {
                z3 = false;
            } else {
                z3 = true;
            }
            z8 = z3;
            z4 = z7;
            z7 = false;
            z5 = false;
        } else if (i2 == 3) {
            if (z2 ? !fragment.f38443r || fragment.f38409F : fragment.f38443r || (view = fragment.f38416M) == null || view.getVisibility() != 0 || fragment.f38421R < 0.0f) {
                z6 = false;
            } else {
                z6 = true;
            }
            z5 = z6;
            z4 = false;
        } else if (i2 != 4) {
            if (i2 != 5) {
                if (i2 != 6) {
                    if (i2 != 7) {
                        z3 = false;
                        z7 = false;
                    } else {
                        if (z2) {
                            z3 = true;
                        }
                        z3 = false;
                    }
                }
                if (z2) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                z5 = z6;
                z4 = false;
            } else if (!z2) {
                z3 = fragment.f38409F;
            } else if (fragment.f38420Q && !fragment.f38409F && fragment.f38443r) {
                z3 = true;
            } else {
                z3 = false;
            }
            z8 = z3;
            z4 = z7;
            z7 = false;
            z5 = false;
        } else {
            if (!z2 ? !(!fragment.f38443r || fragment.f38409F) : fragment.f38420Q && fragment.f38443r && fragment.f38409F) {
                z6 = false;
            } else {
                z6 = true;
            }
            z5 = z6;
            z4 = false;
        }
        b bVar = sparseArray.get(i);
        if (z8) {
            if (bVar == null) {
                b bVar2 = new b();
                sparseArray.put(i, bVar2);
                bVar = bVar2;
            }
            bVar.f38523a = fragment;
            bVar.f38524b = z;
            bVar.f38525c = backStackRecord;
        }
        if (!z2 && z4) {
            if (bVar != null && bVar.f38526d == fragment) {
                bVar.f38526d = null;
            }
            if (!backStackRecord.f38367p) {
                FragmentManager fragmentManager = backStackRecord.f38261q;
                fragmentManager.f38617c.m16502j(fragmentManager.m16687h(fragment));
                fragmentManager.m16667U(fragment, fragmentManager.f38630p);
            }
        }
        if (z5 && (bVar == null || bVar.f38526d == null)) {
            if (bVar == null) {
                b bVar3 = new b();
                sparseArray.put(i, bVar3);
                bVar = bVar3;
            }
            bVar.f38526d = fragment;
            bVar.f38527e = z;
            bVar.f38528f = backStackRecord;
        }
        if (z2 || !z7 || bVar == null || bVar.f38523a != fragment) {
            return;
        }
        bVar.f38523a = null;
    }

    /* JADX INFO: renamed from: c */
    public static void m16588c(Fragment fragment, Fragment fragment2, boolean z, ArrayMap<String, View> arrayMap, boolean z2) {
        if (z) {
            fragment2.m16516A();
        } else {
            fragment.m16516A();
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m16589d(FragmentTransitionImpl fragmentTransitionImpl, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!fragmentTransitionImpl.mo15475e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static ArrayMap<String, View> m16590e(FragmentTransitionImpl fragmentTransitionImpl, ArrayMap<String, String> arrayMap, Object obj, b bVar) {
        ArrayList<String> arrayList;
        Fragment fragment = bVar.f38523a;
        View view = fragment.f38416M;
        if (arrayMap.isEmpty() || obj == null || view == null) {
            arrayMap.clear();
            return null;
        }
        ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
        fragmentTransitionImpl.m16607i(arrayMap2, view);
        BackStackRecord backStackRecord = bVar.f38525c;
        if (bVar.f38524b) {
            fragment.m16522D();
            arrayList = backStackRecord.f38365n;
        } else {
            fragment.m16516A();
            arrayList = backStackRecord.f38366o;
        }
        if (arrayList != null) {
            MapCollections.m15601k(arrayMap2, arrayList);
            MapCollections.m15601k(arrayMap2, arrayMap.values());
        }
        m16598m(arrayMap, arrayMap2);
        return arrayMap2;
    }

    /* JADX INFO: renamed from: f */
    public static ArrayMap<String, View> m16591f(FragmentTransitionImpl fragmentTransitionImpl, ArrayMap<String, String> arrayMap, Object obj, b bVar) {
        ArrayList<String> arrayList;
        if (arrayMap.isEmpty() || obj == null) {
            arrayMap.clear();
            return null;
        }
        Fragment fragment = bVar.f38526d;
        ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
        fragmentTransitionImpl.m16607i(arrayMap2, fragment.m16530H0());
        BackStackRecord backStackRecord = bVar.f38528f;
        if (bVar.f38527e) {
            fragment.m16516A();
            arrayList = backStackRecord.f38366o;
        } else {
            fragment.m16522D();
            arrayList = backStackRecord.f38365n;
        }
        if (arrayList != null) {
            MapCollections.m15601k(arrayMap2, arrayList);
        }
        MapCollections.m15601k(arrayMap, arrayMap2.keySet());
        return arrayMap2;
    }

    /* JADX INFO: renamed from: g */
    public static FragmentTransitionImpl m16592g(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            fragment.m16520C();
            Object objM16541N = fragment.m16541N();
            if (objM16541N != null) {
                arrayList.add(objM16541N);
            }
            Object objM16545P = fragment.m16545P();
            if (objM16545P != null) {
                arrayList.add(objM16545P);
            }
        }
        if (fragment2 != null) {
            fragment2.m16573z();
            Object objM16537L = fragment2.m16537L();
            if (objM16537L != null) {
                arrayList.add(objM16537L);
            }
            fragment2.m16543O();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        FragmentTransitionImpl fragmentTransitionImpl = f38521b;
        if (fragmentTransitionImpl != null && m16589d(fragmentTransitionImpl, arrayList)) {
            return fragmentTransitionImpl;
        }
        FragmentTransitionImpl fragmentTransitionImpl2 = f38522c;
        if (fragmentTransitionImpl2 != null && m16589d(fragmentTransitionImpl2, arrayList)) {
            return fragmentTransitionImpl2;
        }
        if (fragmentTransitionImpl == null && fragmentTransitionImpl2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* JADX INFO: renamed from: h */
    public static ArrayList<View> m16593h(FragmentTransitionImpl fragmentTransitionImpl, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.f38416M;
        if (view2 != null) {
            fragmentTransitionImpl.m16606f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        fragmentTransitionImpl.mo15473b(obj, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: i */
    public static Object m16594i(FragmentTransitionImpl fragmentTransitionImpl, Fragment fragment, boolean z) {
        Object objM16537L = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            objM16537L = fragment.m16537L();
        } else {
            fragment.m16573z();
        }
        return fragmentTransitionImpl.mo15476g(objM16537L);
    }

    /* JADX INFO: renamed from: j */
    public static Object m16595j(FragmentTransitionImpl fragmentTransitionImpl, Fragment fragment, boolean z) {
        Object objM16541N = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            objM16541N = fragment.m16541N();
        } else {
            fragment.m16520C();
        }
        return fragmentTransitionImpl.mo15476g(objM16541N);
    }

    /* JADX INFO: renamed from: k */
    public static View m16596k(ArrayMap<String, View> arrayMap, b bVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        BackStackRecord backStackRecord = bVar.f38525c;
        if (obj == null || arrayMap == null || (arrayList = backStackRecord.f38365n) == null || arrayList.isEmpty()) {
            return null;
        }
        return arrayMap.get(z ? backStackRecord.f38365n.get(0) : backStackRecord.f38366o.get(0));
    }

    /* JADX INFO: renamed from: l */
    public static Object m16597l(FragmentTransitionImpl fragmentTransitionImpl, Fragment fragment, Fragment fragment2, boolean z) {
        Object objM16545P;
        if (z) {
            objM16545P = fragment2.m16545P();
        } else {
            fragment.m16543O();
            objM16545P = null;
        }
        return fragmentTransitionImpl.mo15488y(fragmentTransitionImpl.mo15476g(objM16545P));
    }

    /* JADX INFO: renamed from: m */
    public static void m16598m(ArrayMap<String, String> arrayMap, ArrayMap<String, View> arrayMap2) {
        int i = arrayMap.f36667l;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            if (!arrayMap2.containsKey(arrayMap.m15612l(i))) {
                arrayMap.mo2036j(i);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m16599n(FragmentTransitionImpl fragmentTransitionImpl, Object obj, Object obj2, ArrayMap<String, View> arrayMap, boolean z, BackStackRecord backStackRecord) {
        ArrayList<String> arrayList = backStackRecord.f38365n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = arrayMap.get(z ? backStackRecord.f38366o.get(0) : backStackRecord.f38365n.get(0));
        fragmentTransitionImpl.mo15484t(obj, view);
        if (obj2 != null) {
            fragmentTransitionImpl.mo15484t(obj2, view);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m16600o(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0373  */
    /* JADX WARN: Code duplicated, block: B:140:0x037d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0383  */
    /* JADX WARN: Code duplicated, block: B:145:0x038d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:163:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x0230  */
    /* JADX WARN: Code duplicated, block: B:96:0x0232 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static void m16601p(Context context, FragmentContainer fragmentContainer, ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, a aVar) {
        int i3;
        SparseArray sparseArray;
        ViewGroup viewGroup;
        ArrayList<View> arrayList3;
        ArrayList<View> arrayList4;
        Object obj;
        Fragment fragment;
        ArrayList<View> arrayListM16593h;
        Object objMo15478m;
        Object obj2;
        Object obj3;
        ArrayMap arrayMap;
        boolean z2;
        Fragment fragment2;
        Fragment fragment3;
        Rect rect;
        Fragment fragment4;
        Object obj4;
        ArrayList<View> arrayListM16593h2;
        ArrayList<View> arrayListM16593h3;
        Object objMo15478m2;
        Object obj5;
        View view;
        Rect rect2;
        ArrayList<String> arrayList5;
        ArrayList<String> arrayList6;
        ArrayList<BackStackRecord> arrayList7 = arrayList;
        ArrayList<Boolean> arrayList8 = arrayList2;
        int i4 = i2;
        boolean z3 = z;
        SparseArray sparseArray2 = new SparseArray();
        int i5 = i;
        while (true) {
            i3 = 0;
            if (i5 >= i4) {
                break;
            }
            BackStackRecord backStackRecord = arrayList7.get(i5);
            if (!arrayList8.get(i5).booleanValue()) {
                int size = backStackRecord.f38352a.size();
                for (int i6 = 0; i6 < size; i6++) {
                    m16587b(backStackRecord, backStackRecord.f38352a.get(i6), sparseArray2, false, z3);
                }
            } else if (backStackRecord.f38261q.f38632r.mo16515e()) {
                for (int size2 = backStackRecord.f38352a.size() - 1; size2 >= 0; size2--) {
                    m16587b(backStackRecord, backStackRecord.f38352a.get(size2), sparseArray2, true, z3);
                }
            }
            i5++;
        }
        if (sparseArray2.size() != 0) {
            View view2 = new View(context);
            int size3 = sparseArray2.size();
            int i7 = 0;
            while (i7 < size3) {
                int iKeyAt = sparseArray2.keyAt(i7);
                ArrayMap arrayMap2 = new ArrayMap();
                int i8 = i4 - 1;
                while (i8 >= i) {
                    BackStackRecord backStackRecord2 = arrayList7.get(i8);
                    if (backStackRecord2.m16459t(iKeyAt)) {
                        boolean zBooleanValue = arrayList8.get(i8).booleanValue();
                        ArrayList<String> arrayList9 = backStackRecord2.f38365n;
                        if (arrayList9 != null) {
                            int size4 = arrayList9.size();
                            if (zBooleanValue) {
                                arrayList5 = backStackRecord2.f38365n;
                                arrayList6 = backStackRecord2.f38366o;
                            } else {
                                ArrayList<String> arrayList10 = backStackRecord2.f38365n;
                                arrayList5 = backStackRecord2.f38366o;
                                arrayList6 = arrayList10;
                            }
                            while (i3 < size4) {
                                String str = arrayList6.get(i3);
                                String str2 = arrayList5.get(i3);
                                String str3 = (String) arrayMap2.remove(str2);
                                if (str3 != null) {
                                    arrayMap2.put(str, str3);
                                } else {
                                    arrayMap2.put(str, str2);
                                }
                                i3++;
                            }
                        }
                    }
                    i8--;
                    arrayList7 = arrayList;
                    arrayList8 = arrayList2;
                    i3 = 0;
                }
                b bVar = (b) sparseArray2.valueAt(i7);
                if (!fragmentContainer.mo16515e() || (viewGroup = (ViewGroup) fragmentContainer.mo16514c(iKeyAt)) == null) {
                    sparseArray = sparseArray2;
                    i7 = i7;
                    size3 = size3;
                } else {
                    if (z3) {
                        Fragment fragment5 = bVar.f38523a;
                        Fragment fragment6 = bVar.f38526d;
                        FragmentTransitionImpl fragmentTransitionImplM16592g = m16592g(fragment6, fragment5);
                        if (fragmentTransitionImplM16592g == null) {
                            sparseArray = sparseArray2;
                            i7 = i7;
                            size3 = size3;
                        } else {
                            boolean z4 = bVar.f38524b;
                            boolean z5 = bVar.f38527e;
                            ArrayList<View> arrayList11 = new ArrayList<>();
                            ArrayList<View> arrayList12 = new ArrayList<>();
                            Object objM16594i = m16594i(fragmentTransitionImplM16592g, fragment5, z4);
                            Object objM16595j = m16595j(fragmentTransitionImplM16592g, fragment6, z5);
                            Fragment fragment7 = bVar.f38523a;
                            sparseArray = sparseArray2;
                            Fragment fragment8 = bVar.f38526d;
                            if (fragment7 != null) {
                                fragment7.m16530H0().setVisibility(0);
                            }
                            if (fragment7 == null || fragment8 == null) {
                                fragment4 = fragment5;
                                size3 = size3;
                            } else {
                                boolean z6 = bVar.f38524b;
                                Object objM16597l = arrayMap2.isEmpty() ? null : m16597l(fragmentTransitionImplM16592g, fragment7, fragment8, z6);
                                ArrayMap<String, View> arrayMapM16591f = m16591f(fragmentTransitionImplM16592g, arrayMap2, objM16597l, bVar);
                                fragment4 = fragment5;
                                ArrayMap<String, View> arrayMapM16590e = m16590e(fragmentTransitionImplM16592g, arrayMap2, objM16597l, bVar);
                                if (arrayMap2.isEmpty()) {
                                    if (arrayMapM16591f != null) {
                                        arrayMapM16591f.clear();
                                    }
                                    if (arrayMapM16590e != null) {
                                        arrayMapM16590e.clear();
                                    }
                                    obj5 = null;
                                } else {
                                    m16586a(arrayList12, arrayMapM16591f, arrayMap2.keySet());
                                    m16586a(arrayList11, arrayMapM16590e, arrayMap2.values());
                                    obj5 = objM16597l;
                                }
                                if (objM16594i != null || objM16595j != null || obj5 != null) {
                                    arrayMap2 = arrayMap2;
                                    m16588c(fragment7, fragment8, z6, arrayMapM16591f, true);
                                    if (obj5 != null) {
                                        arrayList11.add(view2);
                                        fragmentTransitionImplM16592g.mo15486w(obj5, view2, arrayList12);
                                        m16599n(fragmentTransitionImplM16592g, obj5, objM16595j, arrayMapM16591f, bVar.f38527e, bVar.f38528f);
                                        Rect rect3 = new Rect();
                                        View viewM16596k = m16596k(arrayMapM16590e, bVar, objM16594i, z6);
                                        if (viewM16596k != null) {
                                            fragmentTransitionImplM16592g.mo15483s(objM16594i, rect3);
                                        }
                                        view = viewM16596k;
                                        rect2 = rect3;
                                    } else {
                                        view = null;
                                        rect2 = null;
                                    }
                                    OneShotPreDrawListener.m16304a(viewGroup, new FragmentTransition5(fragment7, fragment8, z6, arrayMapM16590e, view, fragmentTransitionImplM16592g, rect2));
                                    obj4 = obj5;
                                }
                                if (objM16594i == null || obj4 != null || objM16595j != null) {
                                    arrayListM16593h2 = m16593h(fragmentTransitionImplM16592g, objM16595j, fragment6, arrayList12, view2);
                                    arrayListM16593h3 = m16593h(fragmentTransitionImplM16592g, objM16594i, fragment4, arrayList11, view2);
                                    m16600o(arrayListM16593h3, 4);
                                    objMo15478m2 = fragmentTransitionImplM16592g.mo15478m(objM16595j, objM16594i, obj4);
                                    if (fragment6 != null && arrayListM16593h2 != null && (arrayListM16593h2.size() > 0 || arrayList12.size() > 0)) {
                                        CancellationSignal cancellationSignal = new CancellationSignal();
                                        FragmentManager.d dVar = (FragmentManager.d) aVar;
                                        dVar.m16712b(fragment6, cancellationSignal);
                                        fragmentTransitionImplM16592g.mo15485u(fragment6, objMo15478m2, cancellationSignal, new FragmentTransition(dVar, fragment6, cancellationSignal));
                                    }
                                    if (objMo15478m2 != null) {
                                        if (fragment6 != null && objM16595j != null && fragment6.f38443r && fragment6.f38409F && fragment6.f38420Q) {
                                            fragment6.m16544O0(true);
                                            fragmentTransitionImplM16592g.mo15481q(objM16595j, fragment6.f38416M, arrayListM16593h2);
                                            OneShotPreDrawListener.m16304a(fragment6.f38415L, new FragmentTransition2(arrayListM16593h2));
                                        }
                                        ArrayList<String> arrayListM16609n = fragmentTransitionImplM16592g.m16609n(arrayList11);
                                        fragmentTransitionImplM16592g.mo15482r(objMo15478m2, objM16594i, arrayListM16593h3, objM16595j, arrayListM16593h2, obj4, arrayList11);
                                        fragmentTransitionImplM16592g.mo15474c(viewGroup, objMo15478m2);
                                        fragmentTransitionImplM16592g.m16610v(viewGroup, arrayList12, arrayList11, arrayListM16609n, arrayMap2);
                                        m16600o(arrayListM16593h3, 0);
                                        fragmentTransitionImplM16592g.mo15487x(obj4, arrayList12, arrayList11);
                                    }
                                }
                            }
                            obj4 = null;
                            if (objM16594i == null) {
                                arrayListM16593h2 = m16593h(fragmentTransitionImplM16592g, objM16595j, fragment6, arrayList12, view2);
                                arrayListM16593h3 = m16593h(fragmentTransitionImplM16592g, objM16594i, fragment4, arrayList11, view2);
                                m16600o(arrayListM16593h3, 4);
                                objMo15478m2 = fragmentTransitionImplM16592g.mo15478m(objM16595j, objM16594i, obj4);
                                if (fragment6 != null) {
                                    CancellationSignal cancellationSignal2 = new CancellationSignal();
                                    FragmentManager.d dVar2 = (FragmentManager.d) aVar;
                                    dVar2.m16712b(fragment6, cancellationSignal2);
                                    fragmentTransitionImplM16592g.mo15485u(fragment6, objMo15478m2, cancellationSignal2, new FragmentTransition(dVar2, fragment6, cancellationSignal2));
                                }
                                if (objMo15478m2 != null) {
                                    if (fragment6 != null) {
                                        fragment6.m16544O0(true);
                                        fragmentTransitionImplM16592g.mo15481q(objM16595j, fragment6.f38416M, arrayListM16593h2);
                                        OneShotPreDrawListener.m16304a(fragment6.f38415L, new FragmentTransition2(arrayListM16593h2));
                                    }
                                    ArrayList<String> arrayListM16609n2 = fragmentTransitionImplM16592g.m16609n(arrayList11);
                                    fragmentTransitionImplM16592g.mo15482r(objMo15478m2, objM16594i, arrayListM16593h3, objM16595j, arrayListM16593h2, obj4, arrayList11);
                                    fragmentTransitionImplM16592g.mo15474c(viewGroup, objMo15478m2);
                                    fragmentTransitionImplM16592g.m16610v(viewGroup, arrayList12, arrayList11, arrayListM16609n2, arrayMap2);
                                    m16600o(arrayListM16593h3, 0);
                                    fragmentTransitionImplM16592g.mo15487x(obj4, arrayList12, arrayList11);
                                }
                            } else {
                                arrayListM16593h2 = m16593h(fragmentTransitionImplM16592g, objM16595j, fragment6, arrayList12, view2);
                                arrayListM16593h3 = m16593h(fragmentTransitionImplM16592g, objM16594i, fragment4, arrayList11, view2);
                                m16600o(arrayListM16593h3, 4);
                                objMo15478m2 = fragmentTransitionImplM16592g.mo15478m(objM16595j, objM16594i, obj4);
                                if (fragment6 != null) {
                                    CancellationSignal cancellationSignal3 = new CancellationSignal();
                                    FragmentManager.d dVar3 = (FragmentManager.d) aVar;
                                    dVar3.m16712b(fragment6, cancellationSignal3);
                                    fragmentTransitionImplM16592g.mo15485u(fragment6, objMo15478m2, cancellationSignal3, new FragmentTransition(dVar3, fragment6, cancellationSignal3));
                                }
                                if (objMo15478m2 != null) {
                                    if (fragment6 != null) {
                                        fragment6.m16544O0(true);
                                        fragmentTransitionImplM16592g.mo15481q(objM16595j, fragment6.f38416M, arrayListM16593h2);
                                        OneShotPreDrawListener.m16304a(fragment6.f38415L, new FragmentTransition2(arrayListM16593h2));
                                    }
                                    ArrayList<String> arrayListM16609n3 = fragmentTransitionImplM16592g.m16609n(arrayList11);
                                    fragmentTransitionImplM16592g.mo15482r(objMo15478m2, objM16594i, arrayListM16593h3, objM16595j, arrayListM16593h2, obj4, arrayList11);
                                    fragmentTransitionImplM16592g.mo15474c(viewGroup, objMo15478m2);
                                    fragmentTransitionImplM16592g.m16610v(viewGroup, arrayList12, arrayList11, arrayListM16609n3, arrayMap2);
                                    m16600o(arrayListM16593h3, 0);
                                    fragmentTransitionImplM16592g.mo15487x(obj4, arrayList12, arrayList11);
                                }
                            }
                        }
                    } else {
                        sparseArray = sparseArray2;
                        ArrayMap arrayMap3 = arrayMap2;
                        i7 = i7;
                        size3 = size3;
                        Fragment fragment9 = bVar.f38523a;
                        Fragment fragment10 = bVar.f38526d;
                        FragmentTransitionImpl fragmentTransitionImplM16592g2 = m16592g(fragment10, fragment9);
                        if (fragmentTransitionImplM16592g2 != null) {
                            boolean z7 = bVar.f38524b;
                            boolean z8 = bVar.f38527e;
                            Object objM16594i2 = m16594i(fragmentTransitionImplM16592g2, fragment9, z7);
                            Object objM16595j2 = m16595j(fragmentTransitionImplM16592g2, fragment10, z8);
                            ArrayList<View> arrayList13 = new ArrayList<>();
                            ArrayList<View> arrayList14 = new ArrayList<>();
                            Fragment fragment11 = bVar.f38523a;
                            Fragment fragment12 = bVar.f38526d;
                            if (fragment11 != null && fragment12 != null) {
                                boolean z9 = bVar.f38524b;
                                Object objM16597l2 = arrayMap3.isEmpty() ? null : m16597l(fragmentTransitionImplM16592g2, fragment11, fragment12, z9);
                                ArrayMap<String, View> arrayMapM16591f2 = m16591f(fragmentTransitionImplM16592g2, arrayMap3, objM16597l2, bVar);
                                if (arrayMap3.isEmpty()) {
                                    obj2 = null;
                                } else {
                                    arrayList13.addAll(arrayMapM16591f2.values());
                                    obj2 = objM16597l2;
                                }
                                if (objM16594i2 == null && objM16595j2 == null && obj2 == null) {
                                    arrayMap3 = arrayMap3;
                                } else {
                                    fragment9 = fragment9;
                                    m16588c(fragment11, fragment12, z9, arrayMapM16591f2, true);
                                    if (obj2 != null) {
                                        rect = new Rect();
                                        fragmentTransitionImplM16592g2.mo15486w(obj2, view2, arrayList13);
                                        obj3 = obj2;
                                        arrayMap = arrayMap3;
                                        z2 = z9;
                                        fragment2 = fragment12;
                                        fragment3 = fragment11;
                                        arrayList4 = arrayList14;
                                        m16599n(fragmentTransitionImplM16592g2, obj3, objM16595j2, arrayMapM16591f2, bVar.f38527e, bVar.f38528f);
                                        if (objM16594i2 != null) {
                                            fragmentTransitionImplM16592g2.mo15483s(objM16594i2, rect);
                                        }
                                    } else {
                                        obj3 = obj2;
                                        arrayMap = arrayMap3;
                                        z2 = z9;
                                        fragment2 = fragment12;
                                        fragment3 = fragment11;
                                        arrayList4 = arrayList14;
                                        rect = null;
                                    }
                                    arrayMap3 = arrayMap;
                                    arrayList3 = arrayList13;
                                    fragment10 = fragment10;
                                    OneShotPreDrawListener.m16304a(viewGroup, new FragmentTransition6(fragmentTransitionImplM16592g2, arrayMap, obj3, bVar, arrayList4, view2, fragment3, fragment2, z2, arrayList3, objM16594i2, rect));
                                    obj = obj3;
                                }
                                if (objM16594i2 == null || obj != null || objM16595j2 != null) {
                                    ArrayList<View> arrayList15 = arrayList3;
                                    fragment = fragment10;
                                    arrayListM16593h = m16593h(fragmentTransitionImplM16592g2, objM16595j2, fragment, arrayList15, view2);
                                    if (arrayListM16593h != null || arrayListM16593h.isEmpty()) {
                                        objM16595j2 = null;
                                    }
                                    fragmentTransitionImplM16592g2.mo15472a(objM16594i2, view2);
                                    objMo15478m = fragmentTransitionImplM16592g2.mo15478m(objM16595j2, objM16594i2, obj);
                                    if (fragment != null && arrayListM16593h != null && (arrayListM16593h.size() > 0 || arrayList15.size() > 0)) {
                                        CancellationSignal cancellationSignal4 = new CancellationSignal();
                                        FragmentManager.d dVar4 = (FragmentManager.d) aVar;
                                        dVar4.m16712b(fragment, cancellationSignal4);
                                        fragmentTransitionImplM16592g2.mo15485u(fragment, objMo15478m, cancellationSignal4, new FragmentTransition3(dVar4, fragment, cancellationSignal4));
                                    }
                                    if (objMo15478m != null) {
                                        ArrayList<View> arrayList16 = new ArrayList<>();
                                        fragmentTransitionImplM16592g2.mo15482r(objMo15478m, objM16594i2, arrayList16, objM16595j2, arrayListM16593h, obj, arrayList4);
                                        OneShotPreDrawListener.m16304a(viewGroup, new FragmentTransition4(objM16594i2, fragmentTransitionImplM16592g2, view2, fragment9, arrayList4, arrayList16, arrayListM16593h, objM16595j2));
                                        ArrayList<View> arrayList17 = arrayList4;
                                        ArrayMap arrayMap4 = arrayMap3;
                                        OneShotPreDrawListener.m16304a(viewGroup, new FragmentTransitionImpl2(fragmentTransitionImplM16592g2, arrayList17, arrayMap4));
                                        fragmentTransitionImplM16592g2.mo15474c(viewGroup, objMo15478m);
                                        OneShotPreDrawListener.m16304a(viewGroup, new FragmentTransitionImpl3(fragmentTransitionImplM16592g2, arrayList17, arrayMap4));
                                    }
                                }
                            }
                            arrayList4 = arrayList14;
                            arrayList3 = arrayList13;
                            obj = null;
                            if (objM16594i2 == null) {
                                ArrayList<View> arrayList18 = arrayList3;
                                fragment = fragment10;
                                arrayListM16593h = m16593h(fragmentTransitionImplM16592g2, objM16595j2, fragment, arrayList18, view2);
                                if (arrayListM16593h != null) {
                                    objM16595j2 = null;
                                } else {
                                    objM16595j2 = null;
                                }
                                fragmentTransitionImplM16592g2.mo15472a(objM16594i2, view2);
                                objMo15478m = fragmentTransitionImplM16592g2.mo15478m(objM16595j2, objM16594i2, obj);
                                if (fragment != null) {
                                    CancellationSignal cancellationSignal5 = new CancellationSignal();
                                    FragmentManager.d dVar5 = (FragmentManager.d) aVar;
                                    dVar5.m16712b(fragment, cancellationSignal5);
                                    fragmentTransitionImplM16592g2.mo15485u(fragment, objMo15478m, cancellationSignal5, new FragmentTransition3(dVar5, fragment, cancellationSignal5));
                                }
                                if (objMo15478m != null) {
                                    ArrayList<View> arrayList19 = new ArrayList<>();
                                    fragmentTransitionImplM16592g2.mo15482r(objMo15478m, objM16594i2, arrayList19, objM16595j2, arrayListM16593h, obj, arrayList4);
                                    OneShotPreDrawListener.m16304a(viewGroup, new FragmentTransition4(objM16594i2, fragmentTransitionImplM16592g2, view2, fragment9, arrayList4, arrayList19, arrayListM16593h, objM16595j2));
                                    ArrayList<View> arrayList110 = arrayList4;
                                    ArrayMap arrayMap5 = arrayMap3;
                                    OneShotPreDrawListener.m16304a(viewGroup, new FragmentTransitionImpl2(fragmentTransitionImplM16592g2, arrayList110, arrayMap5));
                                    fragmentTransitionImplM16592g2.mo15474c(viewGroup, objMo15478m);
                                    OneShotPreDrawListener.m16304a(viewGroup, new FragmentTransitionImpl3(fragmentTransitionImplM16592g2, arrayList110, arrayMap5));
                                }
                            } else {
                                ArrayList<View> arrayList111 = arrayList3;
                                fragment = fragment10;
                                arrayListM16593h = m16593h(fragmentTransitionImplM16592g2, objM16595j2, fragment, arrayList111, view2);
                                if (arrayListM16593h != null) {
                                    objM16595j2 = null;
                                } else {
                                    objM16595j2 = null;
                                }
                                fragmentTransitionImplM16592g2.mo15472a(objM16594i2, view2);
                                objMo15478m = fragmentTransitionImplM16592g2.mo15478m(objM16595j2, objM16594i2, obj);
                                if (fragment != null) {
                                    CancellationSignal cancellationSignal6 = new CancellationSignal();
                                    FragmentManager.d dVar6 = (FragmentManager.d) aVar;
                                    dVar6.m16712b(fragment, cancellationSignal6);
                                    fragmentTransitionImplM16592g2.mo15485u(fragment, objMo15478m, cancellationSignal6, new FragmentTransition3(dVar6, fragment, cancellationSignal6));
                                }
                                if (objMo15478m != null) {
                                    ArrayList<View> arrayList112 = new ArrayList<>();
                                    fragmentTransitionImplM16592g2.mo15482r(objMo15478m, objM16594i2, arrayList112, objM16595j2, arrayListM16593h, obj, arrayList4);
                                    OneShotPreDrawListener.m16304a(viewGroup, new FragmentTransition4(objM16594i2, fragmentTransitionImplM16592g2, view2, fragment9, arrayList4, arrayList112, arrayListM16593h, objM16595j2));
                                    ArrayList<View> arrayList113 = arrayList4;
                                    ArrayMap arrayMap6 = arrayMap3;
                                    OneShotPreDrawListener.m16304a(viewGroup, new FragmentTransitionImpl2(fragmentTransitionImplM16592g2, arrayList113, arrayMap6));
                                    fragmentTransitionImplM16592g2.mo15474c(viewGroup, objMo15478m);
                                    OneShotPreDrawListener.m16304a(viewGroup, new FragmentTransitionImpl3(fragmentTransitionImplM16592g2, arrayList113, arrayMap6));
                                }
                            }
                        }
                    }
                    i7 = i7;
                    size3 = size3;
                }
                i7++;
                arrayList7 = arrayList;
                arrayList8 = arrayList2;
                i4 = i2;
                z3 = z;
                size3 = size3;
                sparseArray2 = sparseArray;
                i3 = 0;
            }
        }
    }
}
