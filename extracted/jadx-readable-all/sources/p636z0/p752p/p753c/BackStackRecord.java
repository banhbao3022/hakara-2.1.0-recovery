package p636z0.p752p.p753c;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p759s.Lifecycle3;

/* JADX INFO: renamed from: z0.p.c.a, reason: use source file name */
/* JADX INFO: compiled from: BackStackRecord.java */
/* JADX INFO: loaded from: classes.dex */
public final class BackStackRecord extends FragmentTransaction implements FragmentManager.m {

    /* JADX INFO: renamed from: q */
    public final FragmentManager f38261q;

    /* JADX INFO: renamed from: r */
    public boolean f38262r;

    /* JADX INFO: renamed from: s */
    public int f38263s;

    /* JADX WARN: Illegal instructions before constructor call */
    public BackStackRecord(FragmentManager fragmentManager) {
        FragmentFactory fragmentFactoryM16658K = fragmentManager.m16658K();
        FragmentHostCallback<?> fragmentHostCallback = fragmentManager.f38631q;
        super(fragmentFactoryM16658K, fragmentHostCallback != null ? fragmentHostCallback.f38565g.getClassLoader() : null);
        this.f38263s = -1;
        this.f38261q = fragmentManager;
    }

    @Override // p636z0.p752p.p753c.FragmentManager.m
    /* JADX INFO: renamed from: a */
    public boolean mo16443a(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m16647O(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f38358g) {
            return true;
        }
        FragmentManager fragmentManager = this.f38261q;
        if (fragmentManager.f38618d == null) {
            fragmentManager.f38618d = new ArrayList<>();
        }
        fragmentManager.f38618d.add(this);
        return true;
    }

    @Override // p636z0.p752p.p753c.FragmentTransaction
    /* JADX INFO: renamed from: c */
    public int mo16444c() {
        return m16455p(false);
    }

    @Override // p636z0.p752p.p753c.FragmentTransaction
    /* JADX INFO: renamed from: d */
    public void mo16445d() {
        if (this.f38358g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f38359h = false;
        this.f38261q.m16651D(this, false);
    }

    @Override // p636z0.p752p.p753c.FragmentTransaction
    /* JADX INFO: renamed from: e */
    public void mo16446e() {
        if (this.f38358g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f38359h = false;
        this.f38261q.m16651D(this, true);
    }

    @Override // p636z0.p752p.p753c.FragmentTransaction
    /* JADX INFO: renamed from: f */
    public FragmentTransaction mo16447f(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f38450y;
        if (fragmentManager == null || fragmentManager == this.f38261q) {
            m16505b(new FragmentTransaction.a(6, fragment));
            return this;
        }
        StringBuilder sbM1556G = outline.m1556G("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        sbM1556G.append(fragment.toString());
        sbM1556G.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sbM1556G.toString());
    }

    @Override // p636z0.p752p.p753c.FragmentTransaction
    /* JADX INFO: renamed from: g */
    public void mo16448g(int i, Fragment fragment, String str, int i2) {
        super.mo16448g(i, fragment, str, i2);
        fragment.f38450y = this.f38261q;
    }

    @Override // p636z0.p752p.p753c.FragmentTransaction
    /* JADX INFO: renamed from: h */
    public FragmentTransaction mo16449h(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f38450y;
        if (fragmentManager == null || fragmentManager == this.f38261q) {
            super.mo16449h(fragment);
            return this;
        }
        StringBuilder sbM1556G = outline.m1556G("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        sbM1556G.append(fragment.toString());
        sbM1556G.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sbM1556G.toString());
    }

    @Override // p636z0.p752p.p753c.FragmentTransaction
    /* JADX INFO: renamed from: k */
    public FragmentTransaction mo16450k(Fragment fragment, Lifecycle3.b bVar) {
        if (fragment.f38450y != this.f38261q) {
            StringBuilder sbM1556G = outline.m1556G("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sbM1556G.append(this.f38261q);
            throw new IllegalArgumentException(sbM1556G.toString());
        }
        if (bVar == Lifecycle3.b.INITIALIZED && fragment.f38432g > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        }
        if (bVar != Lifecycle3.b.DESTROYED) {
            super.mo16450k(fragment, bVar);
            return this;
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // p636z0.p752p.p753c.FragmentTransaction
    /* JADX INFO: renamed from: l */
    public FragmentTransaction mo16451l(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f38450y;
        if (fragmentManager == null || fragmentManager == this.f38261q) {
            super.mo16451l(fragment);
            return this;
        }
        StringBuilder sbM1556G = outline.m1556G("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
        sbM1556G.append(fragment.toString());
        sbM1556G.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sbM1556G.toString());
    }

    @Override // p636z0.p752p.p753c.FragmentTransaction
    /* JADX INFO: renamed from: m */
    public FragmentTransaction mo16452m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f38450y;
        if (fragmentManager == null || fragmentManager == this.f38261q) {
            super.mo16452m(fragment);
            return this;
        }
        StringBuilder sbM1556G = outline.m1556G("Cannot show Fragment attached to a different FragmentManager. Fragment ");
        sbM1556G.append(fragment.toString());
        sbM1556G.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sbM1556G.toString());
    }

    /* JADX INFO: renamed from: n */
    public void m16453n(int i) {
        if (this.f38358g) {
            if (FragmentManager.m16647O(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f38352a.size();
            for (int i2 = 0; i2 < size; i2++) {
                FragmentTransaction.a aVar = this.f38352a.get(i2);
                Fragment fragment = aVar.f38369b;
                if (fragment != null) {
                    fragment.f38449x += i;
                    if (FragmentManager.m16647O(2)) {
                        StringBuilder sbM1556G = outline.m1556G("Bump nesting of ");
                        sbM1556G.append(aVar.f38369b);
                        sbM1556G.append(" to ");
                        sbM1556G.append(aVar.f38369b.f38449x);
                        Log.v("FragmentManager", sbM1556G.toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public int m16454o() {
        return m16455p(true);
    }

    /* JADX INFO: renamed from: p */
    public int m16455p(boolean z) {
        if (this.f38262r) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.m16647O(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
            m16456q("  ", printWriter, true);
            printWriter.close();
        }
        this.f38262r = true;
        if (this.f38358g) {
            this.f38263s = this.f38261q.f38623i.getAndIncrement();
        } else {
            this.f38263s = -1;
        }
        this.f38261q.m16648A(this, z);
        return this.f38263s;
    }

    /* JADX INFO: renamed from: q */
    public void m16456q(String str, PrintWriter printWriter, boolean z) {
        String string;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f38360i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f38263s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f38262r);
            if (this.f38357f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f38357f));
            }
            if (this.f38353b != 0 || this.f38354c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f38353b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f38354c));
            }
            if (this.f38355d != 0 || this.f38356e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f38355d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f38356e));
            }
            if (this.f38361j != 0 || this.f38362k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f38361j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f38362k);
            }
            if (this.f38363l != 0 || this.f38364m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f38363l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f38364m);
            }
        }
        if (this.f38352a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f38352a.size();
        for (int i = 0; i < size; i++) {
            FragmentTransaction.a aVar = this.f38352a.get(i);
            switch (aVar.f38368a) {
                case 0:
                    string = "NULL";
                    break;
                case 1:
                    string = "ADD";
                    break;
                case 2:
                    string = "REPLACE";
                    break;
                case 3:
                    string = "REMOVE";
                    break;
                case 4:
                    string = "HIDE";
                    break;
                case 5:
                    string = "SHOW";
                    break;
                case 6:
                    string = "DETACH";
                    break;
                case 7:
                    string = "ATTACH";
                    break;
                case 8:
                    string = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    string = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    string = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder sbM1556G = outline.m1556G("cmd=");
                    sbM1556G.append(aVar.f38368a);
                    string = sbM1556G.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(string);
            printWriter.print(" ");
            printWriter.println(aVar.f38369b);
            if (z) {
                if (aVar.f38370c != 0 || aVar.f38371d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f38370c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f38371d));
                }
                if (aVar.f38372e != 0 || aVar.f38373f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f38372e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f38373f));
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m16457r() {
        int size = this.f38352a.size();
        for (int i = 0; i < size; i++) {
            FragmentTransaction.a aVar = this.f38352a.get(i);
            Fragment fragment = aVar.f38369b;
            if (fragment != null) {
                fragment.m16549R0(false);
                int i2 = this.f38357f;
                if (fragment.f38419P != null || i2 != 0) {
                    fragment.m16567r();
                    fragment.f38419P.f38460h = i2;
                }
                ArrayList<String> arrayList = this.f38365n;
                ArrayList<String> arrayList2 = this.f38366o;
                fragment.m16567r();
                Fragment.b bVar = fragment.f38419P;
                bVar.f38461i = arrayList;
                bVar.f38462j = arrayList2;
            }
            switch (aVar.f38368a) {
                case 1:
                    fragment.m16536K0(aVar.f38370c, aVar.f38371d, aVar.f38372e, aVar.f38373f);
                    this.f38261q.m16682e0(fragment, false);
                    this.f38261q.m16673a(fragment);
                    break;
                case 2:
                default:
                    StringBuilder sbM1556G = outline.m1556G("Unknown cmd: ");
                    sbM1556G.append(aVar.f38368a);
                    throw new IllegalArgumentException(sbM1556G.toString());
                case 3:
                    fragment.m16536K0(aVar.f38370c, aVar.f38371d, aVar.f38372e, aVar.f38373f);
                    this.f38261q.m16672Z(fragment);
                    break;
                case 4:
                    fragment.m16536K0(aVar.f38370c, aVar.f38371d, aVar.f38372e, aVar.f38373f);
                    this.f38261q.m16661N(fragment);
                    break;
                case 5:
                    fragment.m16536K0(aVar.f38370c, aVar.f38371d, aVar.f38372e, aVar.f38373f);
                    this.f38261q.m16682e0(fragment, false);
                    this.f38261q.m16690i0(fragment);
                    break;
                case 6:
                    fragment.m16536K0(aVar.f38370c, aVar.f38371d, aVar.f38372e, aVar.f38373f);
                    this.f38261q.m16691j(fragment);
                    break;
                case 7:
                    fragment.m16536K0(aVar.f38370c, aVar.f38371d, aVar.f38372e, aVar.f38373f);
                    this.f38261q.m16682e0(fragment, false);
                    this.f38261q.m16677c(fragment);
                    break;
                case 8:
                    this.f38261q.m16686g0(fragment);
                    break;
                case 9:
                    this.f38261q.m16686g0(null);
                    break;
                case 10:
                    this.f38261q.m16684f0(fragment, aVar.f38375h);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m16458s(boolean z) {
        for (int size = this.f38352a.size() - 1; size >= 0; size--) {
            FragmentTransaction.a aVar = this.f38352a.get(size);
            Fragment fragment = aVar.f38369b;
            if (fragment != null) {
                fragment.m16549R0(true);
                int i = this.f38357f;
                int i2 = 8194;
                if (i != 4097) {
                    i2 = i != 4099 ? i != 8194 ? 0 : 4097 : 4099;
                }
                if (fragment.f38419P != null || i2 != 0) {
                    fragment.m16567r();
                    fragment.f38419P.f38460h = i2;
                }
                ArrayList<String> arrayList = this.f38366o;
                ArrayList<String> arrayList2 = this.f38365n;
                fragment.m16567r();
                Fragment.b bVar = fragment.f38419P;
                bVar.f38461i = arrayList;
                bVar.f38462j = arrayList2;
            }
            switch (aVar.f38368a) {
                case 1:
                    fragment.m16536K0(aVar.f38370c, aVar.f38371d, aVar.f38372e, aVar.f38373f);
                    this.f38261q.m16682e0(fragment, true);
                    this.f38261q.m16672Z(fragment);
                    break;
                case 2:
                default:
                    StringBuilder sbM1556G = outline.m1556G("Unknown cmd: ");
                    sbM1556G.append(aVar.f38368a);
                    throw new IllegalArgumentException(sbM1556G.toString());
                case 3:
                    fragment.m16536K0(aVar.f38370c, aVar.f38371d, aVar.f38372e, aVar.f38373f);
                    this.f38261q.m16673a(fragment);
                    break;
                case 4:
                    fragment.m16536K0(aVar.f38370c, aVar.f38371d, aVar.f38372e, aVar.f38373f);
                    this.f38261q.m16690i0(fragment);
                    break;
                case 5:
                    fragment.m16536K0(aVar.f38370c, aVar.f38371d, aVar.f38372e, aVar.f38373f);
                    this.f38261q.m16682e0(fragment, true);
                    this.f38261q.m16661N(fragment);
                    break;
                case 6:
                    fragment.m16536K0(aVar.f38370c, aVar.f38371d, aVar.f38372e, aVar.f38373f);
                    this.f38261q.m16677c(fragment);
                    break;
                case 7:
                    fragment.m16536K0(aVar.f38370c, aVar.f38371d, aVar.f38372e, aVar.f38373f);
                    this.f38261q.m16682e0(fragment, true);
                    this.f38261q.m16691j(fragment);
                    break;
                case 8:
                    this.f38261q.m16686g0(null);
                    break;
                case 9:
                    this.f38261q.m16686g0(fragment);
                    break;
                case 10:
                    this.f38261q.m16684f0(fragment, aVar.f38374g);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m16459t(int i) {
        int size = this.f38352a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f38352a.get(i2).f38369b;
            int i3 = fragment != null ? fragment.f38407D : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f38263s >= 0) {
            sb.append(" #");
            sb.append(this.f38263s);
        }
        if (this.f38360i != null) {
            sb.append(" ");
            sb.append(this.f38360i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public boolean m16460u(ArrayList<BackStackRecord> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f38352a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f38352a.get(i4).f38369b;
            int i5 = fragment != null ? fragment.f38407D : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    BackStackRecord backStackRecord = arrayList.get(i6);
                    int size2 = backStackRecord.f38352a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = backStackRecord.f38352a.get(i7).f38369b;
                        if ((fragment2 != null ? fragment2.f38407D : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }
}
