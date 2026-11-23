package p636z0.p770y;

import androidx.lifecycle.ViewModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import p636z0.p759s.ViewModelProvider2;
import p636z0.p759s.ViewModelStore;

/* JADX INFO: renamed from: z0.y.g, reason: use source file name */
/* JADX INFO: compiled from: NavControllerViewModel.java */
/* JADX INFO: loaded from: classes.dex */
public class NavControllerViewModel extends ViewModel {

    /* JADX INFO: renamed from: c */
    public static final ViewModelProvider2.b f39013c = new a();

    /* JADX INFO: renamed from: d */
    public final HashMap<UUID, ViewModelStore> f39014d = new HashMap<>();

    /* JADX INFO: renamed from: z0.y.g$a */
    /* JADX INFO: compiled from: NavControllerViewModel.java */
    public class a implements ViewModelProvider2.b {
        @Override // p636z0.p759s.ViewModelProvider2.b
        /* JADX INFO: renamed from: a */
        public <T extends ViewModel> T mo13840a(Class<T> cls) {
            return new NavControllerViewModel();
        }
    }

    @Override // androidx.lifecycle.ViewModel
    /* JADX INFO: renamed from: e */
    public void mo438e() {
        Iterator<ViewModelStore> it = this.f39014d.values().iterator();
        while (it.hasNext()) {
            it.next().m16725a();
        }
        this.f39014d.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<UUID> it = this.f39014d.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
