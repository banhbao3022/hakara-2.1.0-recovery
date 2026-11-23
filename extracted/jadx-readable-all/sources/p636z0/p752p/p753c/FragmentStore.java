package p636z0.p752p.p753c;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: z0.p.c.i0, reason: use source file name */
/* JADX INFO: compiled from: FragmentStore.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentStore {

    /* JADX INFO: renamed from: a */
    public final ArrayList<Fragment> f38348a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final HashMap<String, FragmentStateManager> f38349b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public FragmentManagerViewModel f38350c;

    /* JADX INFO: renamed from: a */
    public void m16493a(Fragment fragment) {
        if (this.f38348a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f38348a) {
            this.f38348a.add(fragment);
        }
        fragment.f38443r = true;
    }

    /* JADX INFO: renamed from: b */
    public void m16494b() {
        this.f38349b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: renamed from: c */
    public boolean m16495c(String str) {
        return this.f38349b.get(str) != null;
    }

    /* JADX INFO: renamed from: d */
    public Fragment m16496d(String str) {
        FragmentStateManager fragmentStateManager = this.f38349b.get(str);
        if (fragmentStateManager != null) {
            return fragmentStateManager.f38341c;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public Fragment m16497e(String str) {
        for (FragmentStateManager fragmentStateManager : this.f38349b.values()) {
            if (fragmentStateManager != null) {
                Fragment fragmentM16497e = fragmentStateManager.f38341c;
                if (!str.equals(fragmentM16497e.f38437l)) {
                    fragmentM16497e = fragmentM16497e.f38404A.f38617c.m16497e(str);
                }
                if (fragmentM16497e != null) {
                    return fragmentM16497e;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public List<FragmentStateManager> m16498f() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.f38349b.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public List<Fragment> m16499g() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.f38349b.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager.f38341c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public FragmentStateManager m16500h(String str) {
        return this.f38349b.get(str);
    }

    /* JADX INFO: renamed from: i */
    public List<Fragment> m16501i() {
        ArrayList arrayList;
        if (this.f38348a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f38348a) {
            arrayList = new ArrayList(this.f38348a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public void m16502j(FragmentStateManager fragmentStateManager) {
        Fragment fragment = fragmentStateManager.f38341c;
        if (m16495c(fragment.f38437l)) {
            return;
        }
        this.f38349b.put(fragment.f38437l, fragmentStateManager);
        if (fragment.f38412I) {
            if (fragment.f38411H) {
                this.f38350c.m16469g(fragment);
            } else {
                this.f38350c.m16470h(fragment);
            }
            fragment.f38412I = false;
        }
        if (FragmentManager.m16647O(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m16503k(FragmentStateManager fragmentStateManager) {
        Fragment fragment = fragmentStateManager.f38341c;
        if (fragment.f38411H) {
            this.f38350c.m16470h(fragment);
        }
        if (this.f38349b.put(fragment.f38437l, null) != null && FragmentManager.m16647O(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m16504l(Fragment fragment) {
        synchronized (this.f38348a) {
            this.f38348a.remove(fragment);
        }
        fragment.f38443r = false;
    }
}
