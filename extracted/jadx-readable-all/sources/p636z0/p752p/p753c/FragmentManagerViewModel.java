package p636z0.p752p.p753c;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import java.util.HashMap;
import java.util.Iterator;
import p636z0.p759s.ViewModelProvider2;
import p636z0.p759s.ViewModelStore;

/* JADX INFO: renamed from: z0.p.c.c0, reason: use source file name */
/* JADX INFO: compiled from: FragmentManagerViewModel.java */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentManagerViewModel extends ViewModel {

    /* JADX INFO: renamed from: c */
    public static final ViewModelProvider2.b f38297c = new a();

    /* JADX INFO: renamed from: g */
    public final boolean f38301g;

    /* JADX INFO: renamed from: d */
    public final HashMap<String, Fragment> f38298d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public final HashMap<String, FragmentManagerViewModel> f38299e = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public final HashMap<String, ViewModelStore> f38300f = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public boolean f38302h = false;

    /* JADX INFO: renamed from: i */
    public boolean f38303i = false;

    /* JADX INFO: renamed from: z0.p.c.c0$a */
    /* JADX INFO: compiled from: FragmentManagerViewModel.java */
    public class a implements ViewModelProvider2.b {
        @Override // p636z0.p759s.ViewModelProvider2.b
        /* JADX INFO: renamed from: a */
        public <T extends ViewModel> T mo13840a(Class<T> cls) {
            return new FragmentManagerViewModel(true);
        }
    }

    public FragmentManagerViewModel(boolean z) {
        this.f38301g = z;
    }

    @Override // androidx.lifecycle.ViewModel
    /* JADX INFO: renamed from: e */
    public void mo438e() {
        if (FragmentManager.m16647O(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f38302h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FragmentManagerViewModel.class != obj.getClass()) {
            return false;
        }
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) obj;
        return this.f38298d.equals(fragmentManagerViewModel.f38298d) && this.f38299e.equals(fragmentManagerViewModel.f38299e) && this.f38300f.equals(fragmentManagerViewModel.f38300f);
    }

    /* JADX INFO: renamed from: g */
    public void m16469g(Fragment fragment) {
        if (this.f38303i) {
            if (FragmentManager.m16647O(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f38298d.containsKey(fragment.f38437l)) {
                return;
            }
            this.f38298d.put(fragment.f38437l, fragment);
            if (FragmentManager.m16647O(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m16470h(Fragment fragment) {
        if (this.f38303i) {
            if (FragmentManager.m16647O(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f38298d.remove(fragment.f38437l) != null) && FragmentManager.m16647O(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public int hashCode() {
        return this.f38300f.hashCode() + ((this.f38299e.hashCode() + (this.f38298d.hashCode() * 31)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public boolean m16471i(Fragment fragment) {
        if (this.f38298d.containsKey(fragment.f38437l) && this.f38301g) {
            return this.f38302h;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f38298d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f38299e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f38300f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
