package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Simple;
import p007c.p085g.p086a.Glide;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: renamed from: j.a.a.i.z1, reason: use source file name */
/* JADX INFO: compiled from: ItemShareBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemShareBindingImpl extends ItemShareBinding {

    /* JADX INFO: renamed from: v */
    public final LinearLayout f32994v;

    /* JADX INFO: renamed from: w */
    public final TextView f32995w;

    /* JADX INFO: renamed from: x */
    public long f32996x;

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemShareBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 3, null, null);
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArrM391i[1]);
        this.f32996x = -1L;
        this.f32954t.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArrM391i[0];
        this.f32994v = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArrM391i[2];
        this.f32995w = textView;
        textView.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        int iM393n;
        Integer localImage;
        int id;
        synchronized (this) {
            j2 = this.f32996x;
            this.f32996x = 0L;
        }
        Simple simple = this.f32955u;
        long j3 = j2 & 3;
        Integer translateName = null;
        int i = 0;
        if (j3 != 0) {
            if (simple != null) {
                localImage = simple.getLocalImage();
                translateName = simple.getTranslateName();
                id = simple.getId();
            } else {
                localImage = null;
                id = 0;
            }
            iM393n = ViewDataBinding.m393n(translateName);
            boolean z = id > 0;
            if (j3 != 0) {
                j2 |= z ? 8L : 4L;
            }
            i = z ? 0 : 8;
            translateName = localImage;
        } else {
            iM393n = 0;
        }
        if ((j2 & 3) != 0) {
            AppCompatImageView appCompatImageView = this.f32954t;
            Intrinsics2.m13089e(appCompatImageView, "$this$setGlideSrc");
            Glide.m1627e(appCompatImageView.getContext()).mo1655o(translateName).m1642N(appCompatImageView);
            this.f32994v.setVisibility(i);
            SkuDao.a.m14096k0(this.f32995w, iM393n);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32996x != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32996x = 2L;
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
        this.f32955u = (Simple) obj;
        synchronized (this) {
            this.f32996x |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
