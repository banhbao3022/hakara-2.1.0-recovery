package p555j.p556a.p557a.p616i;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.h2, reason: use source file name */
/* JADX INFO: compiled from: ItemUserBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemUserBindingImpl extends ItemUserBinding {

    /* JADX INFO: renamed from: z */
    public static final SparseIntArray f32569z;

    /* JADX INFO: renamed from: A */
    public final CardView f32570A;

    /* JADX INFO: renamed from: B */
    public final TextView f32571B;

    /* JADX INFO: renamed from: C */
    public long f32572C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32569z = sparseIntArray;
        sparseIntArray.put(R.id.rootView, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemUserBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 7, null, f32569z);
        super(dataBindingComponent, view, 0, (TextView) objArrM391i[5], (TextView) objArrM391i[2], (TextView) objArrM391i[3], (RelativeLayout) objArrM391i[6], (AppCompatImageView) objArrM391i[1]);
        this.f32572C = -1L;
        this.f32546t.setTag(null);
        this.f32547u.setTag(null);
        this.f32548v.setTag(null);
        CardView cardView = (CardView) objArrM391i[0];
        this.f32570A = cardView;
        cardView.setTag(null);
        TextView textView = (TextView) objArrM391i[4];
        this.f32571B = textView;
        textView.setTag(null);
        this.f32550x.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String label;
        String fullName;
        String string;
        String string2;
        String str;
        int i;
        TextView textView;
        int i2;
        long j3;
        long j4;
        synchronized (this) {
            j2 = this.f32572C;
            this.f32572C = 0L;
        }
        User user = this.f32551y;
        long j5 = j2 & 3;
        int iM388d = 0;
        boolean z = false;
        Drawable drawable = null;
        String avatar = null;
        if (j5 != 0) {
            if (user != null) {
                avatar = user.getAvatar();
                label = user.getLabel();
                int level = user.getLevel();
                boolean followStatus = user.getFollowStatus();
                fullName = user.getFullName();
                i = level;
                z = followStatus;
            } else {
                label = null;
                fullName = null;
                i = 0;
            }
            if (j5 != 0) {
                if (z) {
                    j3 = j2 | 8 | 32;
                    j4 = 128;
                } else {
                    j3 = j2 | 4 | 16;
                    j4 = 64;
                }
                j2 = j3 | j4;
            }
            string = Integer.toString(i);
            Drawable drawableM14707b = AppCompatResources.m14707b(this.f32546t.getContext(), z ? R.drawable.bg_button_gray_basic_corners : R.drawable.bg_button_basic_corners);
            string2 = this.f32546t.getResources().getString(z ? R.string.txt_following : R.string.txt_follow);
            if (z) {
                textView = this.f32546t;
                i2 = R.color.black_40;
            } else {
                textView = this.f32546t;
                i2 = R.color.white_light;
            }
            iM388d = ViewDataBinding.m388d(textView, i2);
            str = avatar;
            drawable = drawableM14707b;
        } else {
            label = null;
            fullName = null;
            string = null;
            string2 = null;
            str = null;
            i = 0;
        }
        if ((j2 & 3) != 0) {
            this.f32546t.setBackground(drawable);
            TextViewBindingAdapter.m16406a(this.f32546t, string2);
            this.f32546t.setTextColor(iM388d);
            TextViewBindingAdapter.m16406a(this.f32547u, fullName);
            SkuDao.a.m14051C(this.f32548v, i);
            TextViewBindingAdapter.m16406a(this.f32548v, string);
            TextViewBindingAdapter.m16406a(this.f32571B, label);
            SkuDao.a.m14053E(this.f32550x, str, null, null, null, true, false, true, 0, false, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32572C != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32572C = 2L;
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
        this.f32551y = (User) obj;
        synchronized (this) {
            this.f32572C |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
