package p636z0.p770y.p772u;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p752p.p753c.BackStackRecord;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentManager;
import p636z0.p752p.p753c.FragmentManager.n;
import p636z0.p752p.p753c.FragmentTransition7;
import p636z0.p770y.NavDestination;
import p636z0.p770y.NavOptions;
import p636z0.p770y.Navigator;
import p636z0.p770y.NavigatorProvider;

/* JADX INFO: renamed from: z0.y.u.a, reason: use source file name */
/* JADX INFO: compiled from: FragmentNavigator.java */
/* JADX INFO: loaded from: classes.dex */
@Navigator.b("fragment")
public class FragmentNavigator extends Navigator<a> {

    /* JADX INFO: renamed from: a */
    public final Context f39095a;

    /* JADX INFO: renamed from: b */
    public final FragmentManager f39096b;

    /* JADX INFO: renamed from: c */
    public final int f39097c;

    /* JADX INFO: renamed from: d */
    public ArrayDeque<Integer> f39098d = new ArrayDeque<>();

    /* JADX INFO: renamed from: z0.y.u.a$a */
    /* JADX INFO: compiled from: FragmentNavigator.java */
    public static class a extends NavDestination {

        /* JADX INFO: renamed from: n */
        public String f39099n;

        public a(NavigatorProvider navigatorProvider) {
            this((Navigator<? extends a>) navigatorProvider.m16929c(FragmentNavigator.class));
        }

        @Override // p636z0.p770y.NavDestination
        /* JADX INFO: renamed from: m */
        public void mo462m(Context context, AttributeSet attributeSet) {
            super.mo462m(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C8459b.f39101b);
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                this.f39099n = string;
            }
            typedArrayObtainAttributes.recycle();
        }

        @Override // p636z0.p770y.NavDestination
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f39099n;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            return sb.toString();
        }

        public a(Navigator<? extends a> navigator) {
            super(navigator);
        }
    }

    /* JADX INFO: renamed from: z0.y.u.a$b */
    /* JADX INFO: compiled from: FragmentNavigator.java */
    public static final class b implements Navigator.a {
    }

    public FragmentNavigator(Context context, FragmentManager fragmentManager, int i) {
        this.f39095a = context;
        this.f39096b = fragmentManager;
        this.f39097c = i;
    }

    @Override // p636z0.p770y.Navigator
    /* JADX INFO: renamed from: a */
    public NavDestination mo457a() {
        return new a(this);
    }

    @Override // p636z0.p770y.Navigator
    /* JADX INFO: renamed from: c */
    public void mo459c(Bundle bundle) {
        int[] intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds");
        if (intArray != null) {
            this.f39098d.clear();
            for (int i : intArray) {
                this.f39098d.add(Integer.valueOf(i));
            }
        }
    }

    @Override // p636z0.p770y.Navigator
    /* JADX INFO: renamed from: d */
    public Bundle mo460d() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.f39098d.size()];
        Iterator<Integer> it = this.f39098d.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    @Override // p636z0.p770y.Navigator
    /* JADX INFO: renamed from: e */
    public boolean mo461e() {
        if (this.f39098d.isEmpty()) {
            return false;
        }
        if (this.f39096b.m16665S()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        FragmentManager fragmentManager = this.f39096b;
        fragmentManager.m16648A(fragmentManager.new n(m16931f(this.f39098d.size(), this.f39098d.peekLast().intValue()), -1, 1), false);
        this.f39098d.removeLast();
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final String m16931f(int i, int i2) {
        return i + "-" + i2;
    }

    @Override // p636z0.p770y.Navigator
    /* JADX INFO: renamed from: g */
    public NavDestination mo458b(a aVar, Bundle bundle, NavOptions navOptions, Navigator.a aVar2) {
        boolean z;
        if (this.f39096b.m16665S()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String str = aVar.f39099n;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set");
        }
        if (str.charAt(0) == '.') {
            str = this.f39095a.getPackageName() + str;
        }
        Fragment fragmentMo16614a = this.f39096b.m16658K().mo16614a(this.f39095a.getClassLoader(), str);
        fragmentMo16614a.m16540M0(bundle);
        BackStackRecord backStackRecord = new BackStackRecord(this.f39096b);
        int i = navOptions != null ? navOptions.f39057d : -1;
        int i2 = navOptions != null ? navOptions.f39058e : -1;
        int i3 = navOptions != null ? navOptions.f39059f : -1;
        int i4 = navOptions != null ? navOptions.f39060g : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            if (i4 == -1) {
                i4 = 0;
            }
            backStackRecord.f38353b = i;
            backStackRecord.f38354c = i2;
            backStackRecord.f38355d = i3;
            backStackRecord.f38356e = i4;
        }
        backStackRecord.m16506i(this.f39097c, fragmentMo16614a, null);
        backStackRecord.mo16451l(fragmentMo16614a);
        int i5 = aVar.f39033h;
        boolean zIsEmpty = this.f39098d.isEmpty();
        boolean z2 = navOptions != null && !zIsEmpty && navOptions.f39054a && this.f39098d.peekLast().intValue() == i5;
        if (zIsEmpty) {
            z = true;
        } else if (z2) {
            if (this.f39098d.size() > 1) {
                FragmentManager fragmentManager = this.f39096b;
                fragmentManager.m16648A(fragmentManager.new n(m16931f(this.f39098d.size(), this.f39098d.peekLast().intValue()), -1, 1), false);
                String strM16931f = m16931f(this.f39098d.size(), i5);
                if (!backStackRecord.f38359h) {
                    throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                }
                backStackRecord.f38358g = true;
                backStackRecord.f38360i = strM16931f;
            }
            z = false;
        } else {
            String strM16931f2 = m16931f(this.f39098d.size() + 1, i5);
            if (!backStackRecord.f38359h) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            backStackRecord.f38358g = true;
            backStackRecord.f38360i = strM16931f2;
            z = true;
        }
        if (aVar2 instanceof b) {
            Objects.requireNonNull((b) aVar2);
            for (Map.Entry entry : Collections.unmodifiableMap(null).entrySet()) {
                View view = (View) entry.getKey();
                String str2 = (String) entry.getValue();
                if ((FragmentTransition7.f38521b == null && FragmentTransition7.f38522c == null) ? false : true) {
                    AtomicInteger atomicInteger = ViewCompat.f38073a;
                    String transitionName = view.getTransitionName();
                    if (transitionName == null) {
                        throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
                    }
                    if (backStackRecord.f38365n == null) {
                        backStackRecord.f38365n = new ArrayList<>();
                        backStackRecord.f38366o = new ArrayList<>();
                    } else {
                        if (backStackRecord.f38366o.contains(str2)) {
                            throw new IllegalArgumentException(outline.m1600v("A shared element with the target name '", str2, "' has already been added to the transaction."));
                        }
                        if (backStackRecord.f38365n.contains(transitionName)) {
                            throw new IllegalArgumentException(outline.m1600v("A shared element with the source name '", transitionName, "' has already been added to the transaction."));
                        }
                    }
                    backStackRecord.f38365n.add(transitionName);
                    backStackRecord.f38366o.add(str2);
                }
            }
        }
        backStackRecord.f38367p = true;
        backStackRecord.mo16444c();
        if (!z) {
            return null;
        }
        this.f39098d.add(Integer.valueOf(i5));
        return aVar;
    }
}
