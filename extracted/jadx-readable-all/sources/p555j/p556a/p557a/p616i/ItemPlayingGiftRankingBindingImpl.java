package p555j.p556a.p557a.p616i;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Present;
import mtp.media.karaoke.data.model.User;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.p1, reason: use source file name */
/* JADX INFO: compiled from: ItemPlayingGiftRankingBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemPlayingGiftRankingBindingImpl extends ItemPlayingGiftRankingBinding {

    /* JADX INFO: renamed from: w */
    public static final SparseIntArray f32738w;

    /* JADX INFO: renamed from: x */
    public final LinearLayout f32739x;

    /* JADX INFO: renamed from: y */
    public final TextView f32740y;

    /* JADX INFO: renamed from: z */
    public long f32741z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32738w = sparseIntArray;
        sparseIntArray.put(R.id.presentItem, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemPlayingGiftRankingBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 5, null, f32738w);
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArrM391i[1], (AppCompatImageView) objArrM391i[2], (RelativeLayout) objArrM391i[4]);
        this.f32741z = -1L;
        this.f32722t.setTag(null);
        this.f32723u.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArrM391i[0];
        this.f32739x = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArrM391i[3];
        this.f32740y = textView;
        textView.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        long j3;
        String avatar;
        int id;
        int stars;
        boolean z;
        boolean z2;
        boolean z3;
        Drawable drawableM14707b;
        String str;
        int i;
        User user;
        synchronized (this) {
            j2 = this.f32741z;
            this.f32741z = 0L;
        }
        Present present = this.f32724v;
        long j4 = j2 & 3;
        Drawable drawable = null;
        if (j4 != 0) {
            if (present != null) {
                stars = present.getStars();
                user = present.getUser();
                id = present.getId();
            } else {
                user = null;
                id = 0;
                stars = 0;
            }
            z2 = stars > 0;
            z = id > 3;
            z3 = id == 1;
            if (j4 != 0) {
                j2 = z2 ? j2 | 512 : j2 | 256;
            }
            if ((j2 & 3) != 0) {
                j2 = z ? j2 | 128 : j2 | 64;
            }
            if ((j2 & 3) == 0) {
                j3 = 1024;
            } else if (z3) {
                j2 |= 2048;
                j3 = 1024;
            } else {
                j3 = 1024;
                j2 |= 1024;
            }
            avatar = user != null ? user.getAvatar() : null;
        } else {
            j3 = 1024;
            avatar = null;
            id = 0;
            stars = 0;
            z = false;
            z2 = false;
            z3 = false;
        }
        long j5 = j2 & j3;
        if (j5 != 0) {
            boolean z4 = id == 2;
            if (j5 != 0) {
                j2 |= z4 ? 32L : 16L;
            }
            drawableM14707b = AppCompatResources.m14707b(this.f32723u.getContext(), z4 ? R.drawable.ic_king_2 : R.drawable.ic_king_3);
        } else {
            drawableM14707b = null;
        }
        boolean z5 = (64 & j2) != 0 && id == 0;
        String string = (512 & j2) != 0 ? Integer.toString(stars) : null;
        long j6 = j2 & 3;
        if (j6 != 0) {
            boolean z6 = z ? true : z5;
            String str2 = z2 ? string : "--";
            Drawable drawableM14707b2 = z3 ? AppCompatResources.m14707b(this.f32723u.getContext(), R.drawable.ic_king_1) : drawableM14707b;
            if (j6 != 0) {
                j2 |= z6 ? 8L : 4L;
            }
            i = z6 ? 8 : 0;
            String str3 = str2;
            drawable = drawableM14707b2;
            str = str3;
        } else {
            str = null;
            i = 0;
        }
        if ((j2 & 3) != 0) {
            SkuDao.a.m14053E(this.f32722t, avatar, null, null, null, true, false, true, 0, false, null, null, null);
            this.f32723u.setVisibility(i);
            SkuDao.a.m14053E(this.f32723u, null, drawable, null, null, true, false, true, 0, false, null, null, null);
            TextViewBindingAdapter.m16406a(this.f32740y, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32741z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32741z = 2L;
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
        this.f32724v = (Present) obj;
        synchronized (this) {
            this.f32741z |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
