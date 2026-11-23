package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import mtp.media.karaoke.R;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: renamed from: j.a.a.i.z3, reason: use source file name */
/* JADX INFO: compiled from: ShareFragmentBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ShareFragmentBindingImpl extends ShareFragmentBinding {

    /* JADX INFO: renamed from: t */
    public static final SparseIntArray f33010t;

    /* JADX INFO: renamed from: u */
    public final LinearLayout f33011u;

    /* JADX INFO: renamed from: v */
    public long f33012v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f33010t = sparseIntArray;
        sparseIntArray.put(R.id.recyclerViewShare, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShareFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 2, null, f33010t);
        super(dataBindingComponent, view, 0, (RecyclerView) objArrM391i[1]);
        this.f33012v = -1L;
        LinearLayout linearLayout = (LinearLayout) objArrM391i[0];
        this.f33011u = linearLayout;
        linearLayout.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        synchronized (this) {
            this.f33012v = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f33012v != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f33012v = 2L;
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
