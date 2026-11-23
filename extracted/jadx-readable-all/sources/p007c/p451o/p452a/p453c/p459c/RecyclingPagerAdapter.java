package p007c.p451o.p452a.p453c.p459c;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Objects;
import p007c.p451o.p452a.p453c.p459c.RecyclingPagerAdapter.c;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p695h0.p696a.PagerAdapter2;

/* JADX INFO: renamed from: c.o.a.c.c.a, reason: use source file name */
/* JADX INFO: compiled from: RecyclingPagerAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class RecyclingPagerAdapter<VH extends c> extends PagerAdapter2 {

    /* JADX INFO: renamed from: b */
    public static final String f27852b;

    /* JADX INFO: renamed from: c */
    public final SparseArray<b> f27853c = new SparseArray<>();

    /* JADX INFO: renamed from: d */
    public SparseArray<Parcelable> f27854d = new SparseArray<>();

    /* JADX INFO: renamed from: c.o.a.c.c.a$a */
    /* JADX INFO: compiled from: RecyclingPagerAdapter.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.o.a.c.c.a$b */
    /* JADX INFO: compiled from: RecyclingPagerAdapter.kt */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final List<c> f27855a;

        /* JADX INFO: renamed from: b */
        public final RecyclingPagerAdapter<?> f27856b;

        public b(RecyclingPagerAdapter<?> recyclingPagerAdapter) {
            Intrinsics2.m13090f(recyclingPagerAdapter, "adapter");
            this.f27856b = recyclingPagerAdapter;
            this.f27855a = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: c.o.a.c.c.a$c */
    /* JADX INFO: compiled from: RecyclingPagerAdapter.kt */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        public static final String f27857a;

        /* JADX INFO: renamed from: b */
        public int f27858b;

        /* JADX INFO: renamed from: c */
        public boolean f27859c;

        /* JADX INFO: renamed from: d */
        public final View f27860d;

        /* JADX INFO: renamed from: c.o.a.c.c.a$c$a */
        /* JADX INFO: compiled from: RecyclingPagerAdapter.kt */
        public static final class a {
            public a() {
            }

            public a(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            new a(null);
            String simpleName = c.class.getSimpleName();
            Intrinsics2.m13086b(simpleName, "ViewHolder::class.java.simpleName");
            f27857a = simpleName;
        }

        public c(View view) {
            Intrinsics2.m13090f(view, "itemView");
            this.f27860d = view;
        }
    }

    static {
        new a(null);
        String simpleName = RecyclingPagerAdapter.class.getSimpleName();
        Intrinsics2.m13086b(simpleName, "RecyclingPagerAdapter::class.java.simpleName");
        f27852b = simpleName;
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: a */
    public void mo12479a(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics2.m13090f(viewGroup, "parent");
        Intrinsics2.m13090f(obj, "item");
        if (obj instanceof c) {
            c cVar = (c) obj;
            Intrinsics2.m13090f(viewGroup, "parent");
            viewGroup.removeView(cVar.f27860d);
            cVar.f27859c = false;
        }
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: c */
    public int mo12480c() {
        return mo12486l();
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: d */
    public int mo12481d(Object obj) {
        Intrinsics2.m13090f(obj, "item");
        return -2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: f */
    public Object mo12482f(ViewGroup viewGroup, int i) {
        c cVarMo12488n;
        SparseArray<Parcelable> sparseParcelableArray;
        Intrinsics2.m13090f(viewGroup, "parent");
        b bVar = this.f27853c.get(0);
        if (bVar == null) {
            bVar = new b(this);
            this.f27853c.put(0, bVar);
        }
        Intrinsics2.m13090f(viewGroup, "parent");
        int i2 = 0;
        while (true) {
            if (i2 >= bVar.f27855a.size()) {
                cVarMo12488n = bVar.f27856b.mo12488n(viewGroup, 0);
                bVar.f27855a.add(cVarMo12488n);
                break;
            }
            cVarMo12488n = bVar.f27855a.get(i2);
            if (!cVarMo12488n.f27859c) {
                break;
            }
            i2++;
        }
        Objects.requireNonNull(cVarMo12488n);
        Intrinsics2.m13090f(viewGroup, "parent");
        cVarMo12488n.f27859c = true;
        cVarMo12488n.f27858b = i;
        viewGroup.addView(cVarMo12488n.f27860d);
        mo12487m(cVarMo12488n, i);
        Parcelable parcelable = this.f27854d.get(i);
        if (parcelable == null || !(parcelable instanceof Bundle)) {
            sparseParcelableArray = null;
        } else {
            Bundle bundle = (Bundle) parcelable;
            String str = c.f27857a;
            if (bundle.containsKey(str)) {
                sparseParcelableArray = bundle.getSparseParcelableArray(str);
            } else {
                sparseParcelableArray = null;
            }
        }
        if (sparseParcelableArray != null) {
            cVarMo12488n.f27860d.restoreHierarchyState(sparseParcelableArray);
        }
        return cVarMo12488n;
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: g */
    public boolean mo12483g(View view, Object obj) {
        Intrinsics2.m13090f(view, "view");
        Intrinsics2.m13090f(obj, "obj");
        return (obj instanceof c) && ((c) obj).f27860d == view;
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: h */
    public void mo12484h(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable == null || !(parcelable instanceof Bundle)) {
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(classLoader);
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(f27852b);
        if (sparseParcelableArray == null) {
            sparseParcelableArray = new SparseArray<>();
        }
        this.f27854d = sparseParcelableArray;
    }

    @Override // p636z0.p695h0.p696a.PagerAdapter2
    /* JADX INFO: renamed from: i */
    public Parcelable mo12485i() {
        ArrayList<c> arrayList = new ArrayList();
        SparseArray<b> sparseArray = this.f27853c;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            if (size != sparseArray.size()) {
                throw new ConcurrentModificationException();
            }
            sparseArray.keyAt(i);
            for (c cVar : sparseArray.valueAt(i).f27855a) {
                if (cVar.f27859c) {
                    arrayList.add(cVar);
                }
            }
        }
        for (c cVar2 : arrayList) {
            SparseArray<Parcelable> sparseArray2 = this.f27854d;
            int i2 = cVar2.f27858b;
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            cVar2.f27860d.saveHierarchyState(sparseArray3);
            Bundle bundle = new Bundle();
            bundle.putSparseParcelableArray(c.f27857a, sparseArray3);
            sparseArray2.put(i2, bundle);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putSparseParcelableArray(f27852b, this.f27854d);
        return bundle2;
    }

    /* JADX INFO: renamed from: l */
    public abstract int mo12486l();

    /* JADX INFO: renamed from: m */
    public abstract void mo12487m(VH vh, int i);

    /* JADX INFO: renamed from: n */
    public abstract VH mo12488n(ViewGroup viewGroup, int i);
}
