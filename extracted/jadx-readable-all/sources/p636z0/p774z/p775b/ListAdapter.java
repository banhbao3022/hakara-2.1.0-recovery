package p636z0.p774z.p775b;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC0149b0;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: z0.z.b.t, reason: use source file name */
/* JADX INFO: compiled from: ListAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ListAdapter<T, VH extends RecyclerView.AbstractC0149b0> extends RecyclerView.AbstractC0152e<VH> {

    /* JADX INFO: renamed from: d */
    public final AsyncListDiffer2<T> f39339d;

    /* JADX INFO: renamed from: e */
    public final AsyncListDiffer2.a<T> f39340e;

    /* JADX INFO: renamed from: z0.z.b.t$a */
    /* JADX INFO: compiled from: ListAdapter.java */
    public class a implements AsyncListDiffer2.a<T> {
        public a() {
        }

        @Override // p636z0.p774z.p775b.AsyncListDiffer2.a
        /* JADX INFO: renamed from: a */
        public void mo16997a(List<T> list, List<T> list2) {
            Objects.requireNonNull(ListAdapter.this);
        }
    }

    public ListAdapter(AsyncDifferConfig<T> asyncDifferConfig) {
        a aVar = new a();
        this.f39340e = aVar;
        AsyncListDiffer2<T> asyncListDiffer2 = new AsyncListDiffer2<>(new AdapterListUpdateCallback(this), asyncDifferConfig);
        this.f39339d = asyncListDiffer2;
        asyncListDiffer2.f39161e.add(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: d */
    public int mo662d() {
        return this.f39339d.f39163g.size();
    }
}
