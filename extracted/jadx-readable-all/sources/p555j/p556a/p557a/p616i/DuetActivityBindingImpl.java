package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import mtp.media.karaoke.R;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: renamed from: j.a.a.i.l, reason: use source file name */
/* JADX INFO: compiled from: DuetActivityBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class DuetActivityBindingImpl extends DuetActivityBinding {

    /* JADX INFO: renamed from: u */
    public static final SparseIntArray f32648u;

    /* JADX INFO: renamed from: v */
    public final LinearLayout f32649v;

    /* JADX INFO: renamed from: w */
    public long f32650w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32648u = sparseIntArray;
        sparseIntArray.put(R.id.appBar, 1);
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.toolbarTitle, 3);
        sparseIntArray.put(R.id.tabLayout, 4);
        sparseIntArray.put(R.id.toolbarLine, 5);
        sparseIntArray.put(R.id.viewpager, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DuetActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 7, null, f32648u);
        super(dataBindingComponent, view, 0, (AppBarLayout) objArrM391i[1], (TabLayout) objArrM391i[4], (Toolbar) objArrM391i[2], (View) objArrM391i[5], (TextView) objArrM391i[3], (ViewPager2) objArrM391i[6]);
        this.f32650w = -1L;
        LinearLayout linearLayout = (LinearLayout) objArrM391i[0];
        this.f32649v = linearLayout;
        linearLayout.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        synchronized (this) {
            this.f32650w = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32650w != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32650w = 2L;
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
