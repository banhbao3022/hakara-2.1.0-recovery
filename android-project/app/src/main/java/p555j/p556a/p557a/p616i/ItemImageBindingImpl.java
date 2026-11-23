package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Image;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: renamed from: j.a.a.i.j1, reason: use source file name */
/* JADX INFO: compiled from: ItemImageBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemImageBindingImpl extends ItemImageBinding {

    /* JADX INFO: renamed from: y */
    public static final SparseIntArray f32617y;

    /* JADX INFO: renamed from: z */
    public long f32618z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32617y = sparseIntArray;
        sparseIntArray.put(R.id.iconChecked, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemImageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 3, null, f32617y);
        super(dataBindingComponent, view, 0, (ImageView) objArrM391i[2], (AppCompatImageView) objArrM391i[1], (RelativeLayout) objArrM391i[0]);
        this.f32618z = -1L;
        this.f32589u.setTag(null);
        this.f32590v.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        synchronized (this) {
            j2 = this.f32618z;
            this.f32618z = 0L;
        }
        String image = null;
        Image image2 = this.f32592x;
        long j3 = j2 & 9;
        if (j3 != 0 && image2 != null) {
            image = image2.getImage();
        }
        String str = image;
        if (j3 != 0) {
            AppCompatImageView appCompatImageView = this.f32589u;
            SkuDao.a.m14053E(appCompatImageView, str, AppCompatResources.m14707b(appCompatImageView.getContext(), R.drawable.ic_image_placeholder), null, null, true, false, false, 0, false, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32618z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32618z = 8L;
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
        if (8 == i) {
            this.f32592x = (Image) obj;
            synchronized (this) {
                this.f32618z |= 1;
            }
            m16396a(8);
            m401m();
        } else if (3 == i) {
            this.f32591w = ((Boolean) obj).booleanValue();
        } else {
            if (4 != i) {
                return false;
            }
            ((Boolean) obj).booleanValue();
        }
        return true;
    }

    @Override // p555j.p556a.p557a.p616i.ItemImageBinding
    /* JADX INFO: renamed from: s */
    public void mo14241s(boolean z) {
        this.f32591w = z;
    }
}
