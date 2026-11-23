package p636z0.p770y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p636z0.p691g.SparseArrayCompat;
import p636z0.p770y.p771t.C8457a;

/* JADX INFO: renamed from: z0.y.k, reason: use source file name */
/* JADX INFO: compiled from: NavGraph.java */
/* JADX INFO: loaded from: classes.dex */
public class NavGraph extends NavDestination implements Iterable<NavDestination> {

    /* JADX INFO: renamed from: n */
    public final SparseArrayCompat<NavDestination> f39044n;

    /* JADX INFO: renamed from: o */
    public int f39045o;

    /* JADX INFO: renamed from: p */
    public String f39046p;

    /* JADX INFO: renamed from: z0.y.k$a */
    /* JADX INFO: compiled from: NavGraph.java */
    public class a implements Iterator<NavDestination> {

        /* JADX INFO: renamed from: f */
        public int f39047f = -1;

        /* JADX INFO: renamed from: g */
        public boolean f39048g = false;

        public a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f39047f + 1 < NavGraph.this.f39044n.m15620k();
        }

        @Override // java.util.Iterator
        public NavDestination next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f39048g = true;
            SparseArrayCompat<NavDestination> sparseArrayCompat = NavGraph.this.f39044n;
            int i = this.f39047f + 1;
            this.f39047f = i;
            return sparseArrayCompat.m15621l(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f39048g) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            NavGraph.this.f39044n.m15621l(this.f39047f).f39032g = null;
            SparseArrayCompat<NavDestination> sparseArrayCompat = NavGraph.this.f39044n;
            int i = this.f39047f;
            Object[] objArr = sparseArrayCompat.f36671i;
            Object obj = objArr[i];
            Object obj2 = SparseArrayCompat.f36668f;
            if (obj != obj2) {
                objArr[i] = obj2;
                sparseArrayCompat.f36669g = true;
            }
            this.f39047f = i - 1;
            this.f39048g = false;
        }
    }

    public NavGraph(Navigator<? extends NavGraph> navigator) {
        super(navigator);
        this.f39044n = new SparseArrayCompat<>();
    }

    @Override // java.lang.Iterable
    public final Iterator<NavDestination> iterator() {
        return new a();
    }

    @Override // p636z0.p770y.NavDestination
    /* JADX INFO: renamed from: j */
    public NavDestination.a mo16910j(NavDeepLinkRequest navDeepLinkRequest) {
        NavDestination.a aVarMo16910j = super.mo16910j(navDeepLinkRequest);
        a aVar = new a();
        while (aVar.hasNext()) {
            NavDestination.a aVarMo16910j2 = ((NavDestination) aVar.next()).mo16910j(navDeepLinkRequest);
            if (aVarMo16910j2 != null && (aVarMo16910j == null || aVarMo16910j2.compareTo(aVarMo16910j) > 0)) {
                aVarMo16910j = aVarMo16910j2;
            }
        }
        return aVarMo16910j;
    }

    @Override // p636z0.p770y.NavDestination
    /* JADX INFO: renamed from: m */
    public void mo462m(Context context, AttributeSet attributeSet) {
        super.mo462m(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C8457a.f39093d);
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        if (resourceId != this.f39033h) {
            this.f39045o = resourceId;
            this.f39046p = null;
            this.f39046p = NavDestination.m16907h(context, resourceId);
            typedArrayObtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Start destination " + resourceId + " cannot use the same id as the graph " + this);
    }

    /* JADX INFO: renamed from: q */
    public final void m16912q(NavDestination navDestination) {
        int i = navDestination.f39033h;
        if (i == 0) {
            throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
        }
        if (i == this.f39033h) {
            throw new IllegalArgumentException("Destination " + navDestination + " cannot have the same id as graph " + this);
        }
        NavDestination navDestinationM15616e = this.f39044n.m15616e(i);
        if (navDestinationM15616e == navDestination) {
            return;
        }
        if (navDestination.f39032g != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (navDestinationM15616e != null) {
            navDestinationM15616e.f39032g = null;
        }
        navDestination.f39032g = this;
        this.f39044n.m15619j(navDestination.f39033h, navDestination);
    }

    /* JADX INFO: renamed from: s */
    public final NavDestination m16913s(int i) {
        return m16914t(i, true);
    }

    /* JADX INFO: renamed from: t */
    public final NavDestination m16914t(int i, boolean z) {
        NavGraph navGraph;
        NavDestination navDestinationM15617g = this.f39044n.m15617g(i, null);
        if (navDestinationM15617g != null) {
            return navDestinationM15617g;
        }
        if (!z || (navGraph = this.f39032g) == null) {
            return null;
        }
        return navGraph.m16913s(i);
    }

    @Override // p636z0.p770y.NavDestination
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        NavDestination navDestinationM16913s = m16913s(this.f39045o);
        if (navDestinationM16913s == null) {
            String str = this.f39046p;
            if (str == null) {
                sb.append("0x");
                sb.append(Integer.toHexString(this.f39045o));
            } else {
                sb.append(str);
            }
        } else {
            sb.append("{");
            sb.append(navDestinationM16913s.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
