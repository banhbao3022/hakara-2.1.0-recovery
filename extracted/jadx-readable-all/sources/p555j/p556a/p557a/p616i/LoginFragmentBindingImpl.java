package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: renamed from: j.a.a.i.t2, reason: use source file name */
/* JADX INFO: compiled from: LoginFragmentBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class LoginFragmentBindingImpl extends LoginFragmentBinding {

    /* JADX INFO: renamed from: t */
    public static final SparseIntArray f32854t;

    /* JADX INFO: renamed from: u */
    public final ConstraintLayout f32855u;

    /* JADX INFO: renamed from: v */
    public long f32856v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32854t = sparseIntArray;
        sparseIntArray.put(R.id.txtTitle, 1);
        sparseIntArray.put(R.id.layoutLoginFb, 2);
        sparseIntArray.put(R.id.btnLoginFb, 3);
        sparseIntArray.put(R.id.layoutLoginGoogle, 4);
        sparseIntArray.put(R.id.btnLoginGoogle, 5);
        sparseIntArray.put(R.id.txtPolicy, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LoginFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 7, null, f32854t);
        super(dataBindingComponent, view, 0, (Button) objArrM391i[3], (Button) objArrM391i[5], (RelativeLayout) objArrM391i[2], (RelativeLayout) objArrM391i[4], (TextView) objArrM391i[6], (TextView) objArrM391i[1]);
        this.f32856v = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrM391i[0];
        this.f32855u = constraintLayout;
        constraintLayout.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        synchronized (this) {
            this.f32856v = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32856v != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32856v = 2L;
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
