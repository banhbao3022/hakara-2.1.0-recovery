package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import mtp.media.karaoke.R;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: renamed from: j.a.a.i.t, reason: use source file name */
/* JADX INFO: compiled from: ExploreFragmentBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ExploreFragmentBindingImpl extends ExploreFragmentBinding {

    /* JADX INFO: renamed from: v */
    public static final SparseIntArray f32841v;

    /* JADX INFO: renamed from: w */
    public long f32842w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32841v = sparseIntArray;
        sparseIntArray.put(R.id.appBar, 1);
        sparseIntArray.put(R.id.f33394eq, 2);
        sparseIntArray.put(R.id.toolbarLine, 3);
        sparseIntArray.put(R.id.refresh_layout, 4);
        sparseIntArray.put(R.id.recycler_view, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExploreFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 6, null, f32841v);
        super(dataBindingComponent, view, 0, (AppBarLayout) objArrM391i[1], (LinearLayout) objArrM391i[0], (LottieAnimationView) objArrM391i[2], (RecyclerView) objArrM391i[5], (SwipeRefreshLayout) objArrM391i[4], (View) objArrM391i[3]);
        this.f32842w = -1L;
        this.f32805t.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        synchronized (this) {
            this.f32842w = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32842w != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32842w = 2L;
        }
        m401m();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: j */
    public boolean mo399j(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (9 != i) {
            return false;
        }
        return true;
    }
}
