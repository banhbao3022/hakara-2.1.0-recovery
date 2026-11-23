package p636z0.p774z.p775b;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z0.z.b.e, reason: use source file name */
/* JADX INFO: compiled from: AsyncListDiffer.java */
/* JADX INFO: loaded from: classes.dex */
public class AsyncListDiffer2<T> {

    /* JADX INFO: renamed from: a */
    public static final Executor f39157a = new b();

    /* JADX INFO: renamed from: b */
    public final ListUpdateCallback f39158b;

    /* JADX INFO: renamed from: c */
    public final AsyncDifferConfig<T> f39159c;

    /* JADX INFO: renamed from: d */
    public Executor f39160d;

    /* JADX INFO: renamed from: e */
    public final List<a<T>> f39161e;

    /* JADX INFO: renamed from: f */
    public List<T> f39162f;

    /* JADX INFO: renamed from: g */
    public List<T> f39163g;

    /* JADX INFO: renamed from: h */
    public int f39164h;

    /* JADX INFO: renamed from: z0.z.b.e$a */
    /* JADX INFO: compiled from: AsyncListDiffer.java */
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        void mo16997a(List<T> list, List<T> list2);
    }

    /* JADX INFO: renamed from: z0.z.b.e$b */
    /* JADX INFO: compiled from: AsyncListDiffer.java */
    public static class b implements Executor {

        /* JADX INFO: renamed from: f */
        public final Handler f39165f = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f39165f.post(runnable);
        }
    }

    public AsyncListDiffer2(RecyclerView.AbstractC0152e abstractC0152e, DiffUtil.e<T> eVar) {
        this(new AdapterListUpdateCallback(abstractC0152e), new AsyncDifferConfig.a(eVar).m16985a());
    }

    /* JADX INFO: renamed from: a */
    public final void m16996a(List<T> list, Runnable runnable) {
        Iterator<a<T>> it = this.f39161e.iterator();
        while (it.hasNext()) {
            it.next().mo16997a(list, this.f39163g);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public AsyncListDiffer2(ListUpdateCallback listUpdateCallback, AsyncDifferConfig<T> asyncDifferConfig) {
        this.f39161e = new CopyOnWriteArrayList();
        this.f39163g = Collections.emptyList();
        this.f39158b = listUpdateCallback;
        this.f39159c = asyncDifferConfig;
        Objects.requireNonNull(asyncDifferConfig);
        this.f39160d = f39157a;
    }
}
