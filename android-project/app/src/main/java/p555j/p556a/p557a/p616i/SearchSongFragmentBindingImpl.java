package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: renamed from: j.a.a.i.v3, reason: use source file name */
/* JADX INFO: compiled from: SearchSongFragmentBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class SearchSongFragmentBindingImpl extends SearchSongFragmentBinding {

    /* JADX INFO: renamed from: u */
    public static final SparseIntArray f32900u;

    /* JADX INFO: renamed from: v */
    public long f32901v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32900u = sparseIntArray;
        sparseIntArray.put(R.id.message, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchSongFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 2, null, f32900u);
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArrM391i[0], (TextView) objArrM391i[1]);
        this.f32901v = -1L;
        this.f32887t.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        synchronized (this) {
            this.f32901v = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32901v != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32901v = 2L;
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
