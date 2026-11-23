package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import mtp.media.karaoke.R;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: renamed from: j.a.a.i.x3, reason: use source file name */
/* JADX INFO: compiled from: SettingActivityBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class SettingActivityBindingImpl extends SettingActivityBinding {

    /* JADX INFO: renamed from: u */
    public static final SparseIntArray f32945u;

    /* JADX INFO: renamed from: v */
    public final LinearLayout f32946v;

    /* JADX INFO: renamed from: w */
    public long f32947w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32945u = sparseIntArray;
        sparseIntArray.put(R.id.appBar, 1);
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.toolbarLine, 3);
        sparseIntArray.put(R.id.editProfile, 4);
        sparseIntArray.put(R.id.btnWallet, 5);
        sparseIntArray.put(R.id.btnLevel, 6);
        sparseIntArray.put(R.id.btnBlocks, 7);
        sparseIntArray.put(R.id.clearCache, 8);
        sparseIntArray.put(R.id.clear1, 9);
        sparseIntArray.put(R.id.lblCapacity, 10);
        sparseIntArray.put(R.id.btnPrivacy, 11);
        sparseIntArray.put(R.id.btnTerms, 12);
        sparseIntArray.put(R.id.btnSupport, 13);
        sparseIntArray.put(R.id.checkVersion, 14);
        sparseIntArray.put(R.id.aboutUs, 15);
        sparseIntArray.put(R.id.btnLogout, 16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SettingActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 17, null, f32945u);
        super(dataBindingComponent, view, 0, (TextView) objArrM391i[15], (AppBarLayout) objArrM391i[1], (TextView) objArrM391i[7], (TextView) objArrM391i[6], (TextView) objArrM391i[16], (TextView) objArrM391i[11], (TextView) objArrM391i[13], (TextView) objArrM391i[12], (TextView) objArrM391i[5], (TextView) objArrM391i[14], (TextView) objArrM391i[9], (RelativeLayout) objArrM391i[8], (TextView) objArrM391i[4], (TextView) objArrM391i[10], (Toolbar) objArrM391i[2], (View) objArrM391i[3]);
        this.f32947w = -1L;
        LinearLayout linearLayout = (LinearLayout) objArrM391i[0];
        this.f32946v = linearLayout;
        linearLayout.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        synchronized (this) {
            this.f32947w = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32947w != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32947w = 2L;
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
