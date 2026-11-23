package p555j.p556a.p557a.p616i;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Present;
import mtp.media.karaoke.data.model.User;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.d1, reason: use source file name */
/* JADX INFO: compiled from: ItemFanGiftBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemFanGiftBindingImpl extends ItemFanGiftBinding {

    /* JADX INFO: renamed from: B */
    public static final SparseIntArray f32476B;

    /* JADX INFO: renamed from: C */
    public final CardView f32477C;

    /* JADX INFO: renamed from: D */
    public final TextView f32478D;

    /* JADX INFO: renamed from: E */
    public long f32479E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32476B = sparseIntArray;
        sparseIntArray.put(R.id.rootView, 7);
        sparseIntArray.put(R.id.medalLayout, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemFanGiftBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 9, null, f32476B);
        super(dataBindingComponent, view, 0, (TextView) objArrM391i[4], (ImageView) objArrM391i[1], (TextView) objArrM391i[6], (RelativeLayout) objArrM391i[8], (RelativeLayout) objArrM391i[7], (TextView) objArrM391i[2], (AppCompatImageView) objArrM391i[3]);
        this.f32479E = -1L;
        this.f32443t.setTag(null);
        this.f32444u.setTag(null);
        this.f32445v.setTag(null);
        CardView cardView = (CardView) objArrM391i[0];
        this.f32477C = cardView;
        cardView.setTag(null);
        TextView textView = (TextView) objArrM391i[5];
        this.f32478D = textView;
        textView.setTag(null);
        this.f32447x.setTag(null);
        this.f32448y.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        int level;
        String string;
        String string2;
        String fullName;
        String str;
        int i;
        int i2;
        boolean z;
        String str2;
        Drawable drawableM14707b;
        long j3;
        long j4;
        User user;
        int stars;
        String avatar;
        synchronized (this) {
            j2 = this.f32479E;
            this.f32479E = 0L;
        }
        Present present = this.f32442A;
        int i3 = this.f32449z;
        if ((j2 & 5) != 0) {
            if (present != null) {
                stars = present.getStars();
                user = present.getUser();
            } else {
                user = null;
                stars = 0;
            }
            string = Integer.toString(stars);
            if (user != null) {
                avatar = user.getAvatar();
                fullName = user.getFullName();
                level = user.getLevel();
            } else {
                level = 0;
                avatar = null;
                fullName = null;
            }
            str = avatar;
            string2 = Integer.toString(level);
        } else {
            level = 0;
            string = null;
            string2 = null;
            fullName = null;
            str = null;
        }
        long j5 = j2 & 6;
        if (j5 != 0) {
            boolean z2 = i3 > 3;
            z = i3 == 1;
            String string3 = Integer.toString(i3);
            if (j5 != 0) {
                if (z2) {
                    j3 = j2 | 16;
                    j4 = 1024;
                } else {
                    j3 = j2 | 8;
                    j4 = 512;
                }
                j2 = j3 | j4;
            }
            if ((j2 & 6) != 0) {
                j2 = z ? j2 | 64 : j2 | 32;
            }
            int i4 = z2 ? 0 : 8;
            i2 = z2 ? 4 : 0;
            i = i4;
            str2 = string3;
        } else {
            i = 0;
            i2 = 0;
            z = false;
            str2 = null;
        }
        long j6 = j2 & 32;
        if (j6 != 0) {
            boolean z3 = i3 == 2;
            if (j6 != 0) {
                j2 |= z3 ? 256L : 128L;
            }
            drawableM14707b = AppCompatResources.m14707b(this.f32444u.getContext(), z3 ? R.drawable.ic_medal_two : R.drawable.ic_medal_three);
        } else {
            drawableM14707b = null;
        }
        long j7 = j2 & 6;
        if (j7 == 0) {
            drawableM14707b = null;
        } else if (z) {
            drawableM14707b = AppCompatResources.m14707b(this.f32444u.getContext(), R.drawable.ic_medal_one);
        }
        if ((j2 & 5) != 0) {
            TextViewBindingAdapter.m16406a(this.f32443t, fullName);
            SkuDao.a.m14051C(this.f32445v, level);
            TextViewBindingAdapter.m16406a(this.f32445v, string2);
            TextViewBindingAdapter.m16406a(this.f32478D, string);
            SkuDao.a.m14053E(this.f32448y, str, null, null, null, true, false, true, 0, false, null, null, null);
        }
        if (j7 != 0) {
            this.f32444u.setImageDrawable(drawableM14707b);
            this.f32444u.setVisibility(i2);
            TextViewBindingAdapter.m16406a(this.f32447x, str2);
            this.f32447x.setVisibility(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32479E != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32479E = 4L;
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
            this.f32442A = (Present) obj;
            synchronized (this) {
                this.f32479E |= 1;
            }
            m16396a(8);
            m401m();
        } else {
            if (2 != i) {
                return false;
            }
            mo14240s(((Integer) obj).intValue());
        }
        return true;
    }

    @Override // p555j.p556a.p557a.p616i.ItemFanGiftBinding
    /* JADX INFO: renamed from: s */
    public void mo14240s(int i) {
        this.f32449z = i;
        synchronized (this) {
            this.f32479E |= 2;
        }
        m16396a(2);
        m401m();
    }
}
