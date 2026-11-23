package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import mtp.media.karaoke.R;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: renamed from: j.a.a.i.p4, reason: use source file name */
/* JADX INFO: compiled from: UserInviteActivityBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class UserInviteActivityBindingImpl extends UserInviteActivityBinding {

    /* JADX INFO: renamed from: t */
    public static final SparseIntArray f32748t;

    /* JADX INFO: renamed from: u */
    public final CoordinatorLayout f32749u;

    /* JADX INFO: renamed from: v */
    public long f32750v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32748t = sparseIntArray;
        sparseIntArray.put(R.id.fragment_container, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UserInviteActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 2, null, f32748t);
        super(dataBindingComponent, view, 0, (FragmentContainerView) objArrM391i[1]);
        this.f32750v = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArrM391i[0];
        this.f32749u = coordinatorLayout;
        coordinatorLayout.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        synchronized (this) {
            this.f32750v = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32750v != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32750v = 2L;
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
