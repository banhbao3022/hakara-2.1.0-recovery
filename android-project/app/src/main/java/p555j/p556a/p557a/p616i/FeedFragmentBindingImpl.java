package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import mtp.media.karaoke.R;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: renamed from: j.a.a.i.z, reason: use source file name */
/* JADX INFO: compiled from: FeedFragmentBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class FeedFragmentBindingImpl extends FeedFragmentBinding {

    /* JADX INFO: renamed from: u */
    public static final SparseIntArray f32984u;

    /* JADX INFO: renamed from: v */
    public final LinearLayout f32985v;

    /* JADX INFO: renamed from: w */
    public long f32986w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32984u = sparseIntArray;
        sparseIntArray.put(R.id.app_bar, 1);
        sparseIntArray.put(R.id.tabLayout, 2);
        sparseIntArray.put(R.id.f33394eq, 3);
        sparseIntArray.put(R.id.toolbarLine, 4);
        sparseIntArray.put(R.id.viewpager, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeedFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 6, null, f32984u);
        super(dataBindingComponent, view, 0, (AppBarLayout) objArrM391i[1], (LottieAnimationView) objArrM391i[3], (TabLayout) objArrM391i[2], (View) objArrM391i[4], (ViewPager2) objArrM391i[5]);
        this.f32986w = -1L;
        LinearLayout linearLayout = (LinearLayout) objArrM391i[0];
        this.f32985v = linearLayout;
        linearLayout.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        synchronized (this) {
            this.f32986w = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32986w != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32986w = 2L;
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
