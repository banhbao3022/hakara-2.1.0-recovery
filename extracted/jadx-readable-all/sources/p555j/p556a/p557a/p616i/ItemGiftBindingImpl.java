package p555j.p556a.p557a.p616i;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Gift;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.f1, reason: use source file name */
/* JADX INFO: compiled from: ItemGiftBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemGiftBindingImpl extends ItemGiftBinding {

    /* JADX INFO: renamed from: A */
    public long f32524A;

    /* JADX INFO: renamed from: w */
    public final TextView f32525w;

    /* JADX INFO: renamed from: x */
    public final LinearLayout f32526x;

    /* JADX INFO: renamed from: y */
    public final ImageView f32527y;

    /* JADX INFO: renamed from: z */
    public final TextView f32528z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemGiftBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 6, null, null);
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArrM391i[1], (LinearLayout) objArrM391i[0]);
        this.f32524A = -1L;
        this.f32505t.setTag(null);
        TextView textView = (TextView) objArrM391i[2];
        this.f32525w = textView;
        textView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArrM391i[3];
        this.f32526x = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArrM391i[4];
        this.f32527y = imageView;
        imageView.setTag(null);
        TextView textView2 = (TextView) objArrM391i[5];
        this.f32528z = textView2;
        textView2.setTag(null);
        this.f32506u.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String str;
        String str2;
        String str3;
        Drawable drawableM14707b;
        int i;
        String name;
        int type;
        int amount;
        synchronized (this) {
            j2 = this.f32524A;
            this.f32524A = 0L;
        }
        Gift gift = this.f32507v;
        long j3 = j2 & 3;
        String image = null;
        if (j3 != 0) {
            if (gift != null) {
                amount = gift.getAmount();
                image = gift.getImage();
                name = gift.getName();
                type = gift.getType();
            } else {
                name = null;
                type = 0;
                amount = 0;
            }
            boolean z = amount > 0;
            String string = Integer.toString(amount);
            boolean z2 = type == 1;
            if (j3 != 0) {
                j2 |= z ? 8L : 4L;
            }
            if ((j2 & 3) != 0) {
                j2 |= z2 ? 32L : 16L;
            }
            int i2 = z ? 0 : 8;
            drawableM14707b = AppCompatResources.m14707b(this.f32527y.getContext(), z2 ? R.drawable.ic_diamond_line : R.drawable.ic_coin_line);
            str3 = string;
            str = name;
            str2 = image;
            i = i2;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            drawableM14707b = null;
            i = 0;
        }
        if ((j2 & 3) != 0) {
            this.f32505t.setVisibility(i);
            SkuDao.a.m14053E(this.f32505t, str2, null, null, null, false, false, false, 0, false, null, null, null);
            TextViewBindingAdapter.m16406a(this.f32525w, str);
            this.f32526x.setVisibility(i);
            SkuDao.a.m14053E(this.f32527y, null, drawableM14707b, null, null, false, false, false, 0, false, null, null, null);
            TextViewBindingAdapter.m16406a(this.f32528z, str3);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32524A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32524A = 2L;
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
        this.f32507v = (Gift) obj;
        synchronized (this) {
            this.f32524A |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
