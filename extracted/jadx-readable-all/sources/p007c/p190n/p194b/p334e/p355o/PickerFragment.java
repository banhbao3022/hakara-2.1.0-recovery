package p007c.p190n.p194b.p334e.p355o;

import java.util.LinkedHashSet;
import p636z0.p752p.p753c.Fragment;

/* JADX INFO: renamed from: c.n.b.e.o.w, reason: use source file name */
/* JADX INFO: compiled from: PickerFragment.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class PickerFragment<S> extends Fragment {

    /* JADX INFO: renamed from: c0 */
    public final LinkedHashSet<OnSelectionChangedListener<S>> f25311c0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: W0 */
    public boolean mo11222W0(OnSelectionChangedListener<S> onSelectionChangedListener) {
        return this.f25311c0.add(onSelectionChangedListener);
    }
}
