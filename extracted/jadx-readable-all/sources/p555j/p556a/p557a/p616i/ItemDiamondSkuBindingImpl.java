package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import p555j.p556a.p557a.p606h.p609c.p611b.SkuEntity;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.r0, reason: use source file name */
/* JADX INFO: compiled from: ItemDiamondSkuBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemDiamondSkuBindingImpl extends ItemDiamondSkuBinding {

    /* JADX INFO: renamed from: x */
    public static final SparseIntArray f32783x;

    /* JADX INFO: renamed from: y */
    public final CardView f32784y;

    /* JADX INFO: renamed from: z */
    public long f32785z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32783x = sparseIntArray;
        sparseIntArray.put(R.id.rootView, 3);
        sparseIntArray.put(R.id.iconDiamond, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemDiamondSkuBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 5, null, f32783x);
        super(dataBindingComponent, view, 0, (ImageView) objArrM391i[4], (TextView) objArrM391i[2], (RelativeLayout) objArrM391i[3], (TextView) objArrM391i[1]);
        this.f32785z = -1L;
        this.f32758t.setTag(null);
        CardView cardView = (CardView) objArrM391i[0];
        this.f32784y = cardView;
        cardView.setTag(null);
        this.f32760v.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String strSubstring;
        String str;
        String str2;
        synchronized (this) {
            j2 = this.f32785z;
            this.f32785z = 0L;
        }
        SkuEntity skuEntity = this.f32761w;
        long j3 = j2 & 5;
        String str3 = null;
        if (j3 != 0) {
            if (skuEntity != null) {
                str = skuEntity.f32354i;
                str2 = skuEntity.f32353h;
            } else {
                str = null;
                str2 = null;
            }
            strSubstring = str != null ? str.substring(0, str != null ? str.indexOf(" ") : 0) : null;
            str3 = str2;
        } else {
            strSubstring = null;
        }
        if (j3 != 0) {
            TextViewBindingAdapter.m16406a(this.f32758t, str3);
            TextViewBindingAdapter.m16406a(this.f32760v, strSubstring);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32785z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32785z = 4L;
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
            this.f32761w = (SkuEntity) obj;
            synchronized (this) {
                this.f32785z |= 1;
            }
            m16396a(8);
            m401m();
        } else {
            if (2 != i) {
                return false;
            }
            ((Integer) obj).intValue();
        }
        return true;
    }
}
