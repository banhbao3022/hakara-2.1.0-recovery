package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Gift;
import mtp.media.karaoke.data.model.Present;
import p007c.p071d.p078c.p079a.outline;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.h1, reason: use source file name */
/* JADX INFO: compiled from: ItemGiftPresentBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemGiftPresentBindingImpl extends ItemGiftPresentBinding {

    /* JADX INFO: renamed from: w */
    public final TextView f32567w;

    /* JADX INFO: renamed from: x */
    public long f32568x;

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemGiftPresentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 3, null, null);
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArrM391i[1], (LinearLayout) objArrM391i[0]);
        this.f32568x = -1L;
        this.f32543t.setTag(null);
        TextView textView = (TextView) objArrM391i[2];
        this.f32567w = textView;
        textView.setTag(null);
        this.f32544u.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String image;
        Gift gift;
        synchronized (this) {
            j2 = this.f32568x;
            this.f32568x = 0L;
        }
        Present present = this.f32545v;
        int quantity = 0;
        long j3 = j2 & 3;
        String strM1599u = null;
        if (j3 != 0) {
            if (present != null) {
                gift = present.getGift();
                quantity = present.getQuantity();
            } else {
                gift = null;
            }
            image = gift != null ? gift.getImage() : null;
            strM1599u = outline.m1599u("x", Integer.toString(quantity));
        } else {
            image = null;
        }
        if (j3 != 0) {
            SkuDao.a.m14053E(this.f32543t, image, null, null, null, false, false, false, 0, false, null, null, null);
            TextViewBindingAdapter.m16406a(this.f32567w, strM1599u);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32568x != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32568x = 2L;
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
        this.f32545v = (Present) obj;
        synchronized (this) {
            this.f32568x |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
