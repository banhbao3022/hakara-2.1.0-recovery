package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import mtp.media.karaoke.R;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: renamed from: j.a.a.i.b0, reason: use source file name */
/* JADX INFO: compiled from: FragmentBackgroundBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class FragmentBackgroundBindingImpl extends FragmentBackgroundBinding {

    /* JADX INFO: renamed from: u */
    public static final SparseIntArray f32419u;

    /* JADX INFO: renamed from: v */
    public long f32420v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32419u = sparseIntArray;
        sparseIntArray.put(R.id.recycler_view, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentBackgroundBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 2, null, f32419u);
        super(dataBindingComponent, view, 0, (LinearLayout) objArrM391i[0], (RecyclerView) objArrM391i[1]);
        this.f32420v = -1L;
        this.f32384t.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        synchronized (this) {
            this.f32420v = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32420v != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32420v = 2L;
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
