package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Simple2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: renamed from: j.a.a.i.l0, reason: use source file name */
/* JADX INFO: compiled from: ItemBackgroundBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemBackgroundBindingImpl extends ItemBackgroundBinding {

    /* JADX INFO: renamed from: v */
    public final LinearLayout f32651v;

    /* JADX INFO: renamed from: w */
    public long f32652w;

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemBackgroundBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 2, null, null);
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArrM391i[1]);
        this.f32652w = -1L;
        this.f32630t.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArrM391i[0];
        this.f32651v = linearLayout;
        linearLayout.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        synchronized (this) {
            j2 = this.f32652w;
            this.f32652w = 0L;
        }
        String value = null;
        Simple2 simple2 = this.f32631u;
        long j3 = j2 & 3;
        if (j3 != 0 && simple2 != null) {
            value = simple2.getValue();
        }
        String str = value;
        if (j3 != 0) {
            SkuDao.a.m14053E(this.f32630t, str, null, null, null, true, false, false, 16, false, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32652w != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32652w = 2L;
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
        if (8 != i) {
            return false;
        }
        this.f32631u = (Simple2) obj;
        synchronized (this) {
            this.f32652w |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
