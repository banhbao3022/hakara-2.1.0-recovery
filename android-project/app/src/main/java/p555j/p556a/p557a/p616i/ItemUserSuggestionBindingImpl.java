package p555j.p556a.p557a.p616i;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.p2, reason: use source file name */
/* JADX INFO: compiled from: ItemUserSuggestionBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemUserSuggestionBindingImpl extends ItemUserSuggestionBinding {

    /* JADX INFO: renamed from: w */
    public final LinearLayout f32742w;

    /* JADX INFO: renamed from: x */
    public final TextView f32743x;

    /* JADX INFO: renamed from: y */
    public final TextView f32744y;

    /* JADX INFO: renamed from: z */
    public long f32745z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemUserSuggestionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 5, null, null);
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArrM391i[1], (TextView) objArrM391i[4]);
        this.f32745z = -1L;
        this.f32725t.setTag(null);
        this.f32726u.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArrM391i[0];
        this.f32742w = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArrM391i[2];
        this.f32743x = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArrM391i[3];
        this.f32744y = textView2;
        textView2.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String str;
        String str2;
        Drawable drawableM14707b;
        String str3;
        String str4;
        String fullName;
        String label;
        TextView textView;
        int i;
        long j3;
        long j4;
        synchronized (this) {
            j2 = this.f32745z;
            this.f32745z = 0L;
        }
        User user = this.f32727v;
        long j5 = j2 & 3;
        int iM388d = 0;
        boolean followStatus = false;
        String avatar = null;
        if (j5 != 0) {
            if (user != null) {
                avatar = user.getAvatar();
                label = user.getLabel();
                followStatus = user.getFollowStatus();
                fullName = user.getFullName();
            } else {
                fullName = null;
                label = null;
            }
            if (j5 != 0) {
                if (followStatus) {
                    j3 = j2 | 8 | 32;
                    j4 = 128;
                } else {
                    j3 = j2 | 4 | 16;
                    j4 = 64;
                }
                j2 = j3 | j4;
            }
            drawableM14707b = AppCompatResources.m14707b(this.f32726u.getContext(), followStatus ? R.drawable.bg_button_gray_basic_corners : R.drawable.bg_button_basic_corners);
            String string = this.f32726u.getResources().getString(followStatus ? R.string.txt_following : R.string.txt_follow);
            if (followStatus) {
                textView = this.f32726u;
                i = R.color.black_40;
            } else {
                textView = this.f32726u;
                i = R.color.white_light;
            }
            iM388d = ViewDataBinding.m388d(textView, i);
            str4 = label;
            str2 = fullName;
            str = string;
            str3 = avatar;
        } else {
            str = null;
            str2 = null;
            drawableM14707b = null;
            str3 = null;
            str4 = null;
        }
        if ((j2 & 3) != 0) {
            SkuDao.a.m14053E(this.f32725t, str3, null, null, null, true, false, true, 0, false, null, null, null);
            this.f32726u.setBackground(drawableM14707b);
            TextViewBindingAdapter.m16406a(this.f32726u, str);
            this.f32726u.setTextColor(iM388d);
            TextViewBindingAdapter.m16406a(this.f32743x, str2);
            TextViewBindingAdapter.m16406a(this.f32744y, str4);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32745z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32745z = 2L;
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
        this.f32727v = (User) obj;
        synchronized (this) {
            this.f32745z |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
