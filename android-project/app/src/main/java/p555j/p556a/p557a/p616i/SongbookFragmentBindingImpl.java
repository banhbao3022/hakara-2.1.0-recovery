package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: renamed from: j.a.a.i.h4, reason: use source file name */
/* JADX INFO: compiled from: SongbookFragmentBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class SongbookFragmentBindingImpl extends SongbookFragmentBinding {

    /* JADX INFO: renamed from: t */
    public static final SparseIntArray f32575t;

    /* JADX INFO: renamed from: u */
    public final CoordinatorLayout f32576u;

    /* JADX INFO: renamed from: v */
    public long f32577v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32575t = sparseIntArray;
        sparseIntArray.put(R.id.app_bar, 1);
        sparseIntArray.put(R.id.collapsingToolbar, 2);
        sparseIntArray.put(R.id.actionIconLayout, 3);
        sparseIntArray.put(R.id.btnDuet, 4);
        sparseIntArray.put(R.id.iconDuet, 5);
        sparseIntArray.put(R.id.btnWallet, 6);
        sparseIntArray.put(R.id.iconWallet, 7);
        sparseIntArray.put(R.id.btnTask, 8);
        sparseIntArray.put(R.id.iconTask, 9);
        sparseIntArray.put(R.id.toolbar, 10);
        sparseIntArray.put(R.id.layoutSearch, 11);
        sparseIntArray.put(R.id.iconSearch, 12);
        sparseIntArray.put(R.id.btnSearch, 13);
        sparseIntArray.put(R.id.tabLayout, 14);
        sparseIntArray.put(R.id.viewpager, 15);
        sparseIntArray.put(R.id.statusView, 16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SongbookFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 17, null, f32575t);
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArrM391i[3], (AppBarLayout) objArrM391i[1], (RelativeLayout) objArrM391i[4], (TextView) objArrM391i[13], (RelativeLayout) objArrM391i[8], (RelativeLayout) objArrM391i[6], (CollapsingToolbarLayout) objArrM391i[2], (ImageView) objArrM391i[5], (ImageButton) objArrM391i[12], (ImageView) objArrM391i[9], (ImageView) objArrM391i[7], (RelativeLayout) objArrM391i[11], (BackgroundMessageView) objArrM391i[16], (TabLayout) objArrM391i[14], (Toolbar) objArrM391i[10], (ViewPager2) objArrM391i[15]);
        this.f32577v = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArrM391i[0];
        this.f32576u = coordinatorLayout;
        coordinatorLayout.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        synchronized (this) {
            this.f32577v = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32577v != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32577v = 2L;
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
