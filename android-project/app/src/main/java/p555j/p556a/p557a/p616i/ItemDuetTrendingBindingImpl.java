package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Duet;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.User;
import p007c.p071d.p078c.p079a.outline;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.z0, reason: use source file name */
/* JADX INFO: compiled from: ItemDuetTrendingBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemDuetTrendingBindingImpl extends ItemDuetTrendingBinding {

    /* JADX INFO: renamed from: y */
    public static final SparseIntArray f32987y;

    /* JADX INFO: renamed from: A */
    public final TextView f32988A;

    /* JADX INFO: renamed from: B */
    public final TextView f32989B;

    /* JADX INFO: renamed from: C */
    public final TextView f32990C;

    /* JADX INFO: renamed from: D */
    public final TextView f32991D;

    /* JADX INFO: renamed from: E */
    public long f32992E;

    /* JADX INFO: renamed from: z */
    public final CardView f32993z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32987y = sparseIntArray;
        sparseIntArray.put(R.id.rootView, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemDuetTrendingBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 9, null, f32987y);
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArrM391i[2], (AppCompatImageView) objArrM391i[1], (LinearLayout) objArrM391i[8], (TextView) objArrM391i[7]);
        this.f32992E = -1L;
        this.f32949t.setTag(null);
        this.f32950u.setTag(null);
        CardView cardView = (CardView) objArrM391i[0];
        this.f32993z = cardView;
        cardView.setTag(null);
        TextView textView = (TextView) objArrM391i[3];
        this.f32988A = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArrM391i[4];
        this.f32989B = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArrM391i[5];
        this.f32990C = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArrM391i[6];
        this.f32991D = textView4;
        textView4.setTag(null);
        this.f32952w.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String str;
        String str2;
        String string;
        String str3;
        String str4;
        int i;
        String str5;
        int playCount;
        int format;
        int likeCount;
        Duet duet;
        User user;
        String name;
        String fullName;
        String avatar;
        String fullName2;
        String str6;
        synchronized (this) {
            j2 = this.f32992E;
            this.f32992E = 0L;
        }
        Recording recording = this.f32953x;
        long j3 = j2 & 3;
        if (j3 != 0) {
            if (recording != null) {
                user = recording.getUser();
                playCount = recording.getPlayCount();
                format = recording.getFormat();
                name = recording.getName();
                likeCount = recording.getLikeCount();
                duet = recording.getDuet();
            } else {
                playCount = 0;
                format = 0;
                likeCount = 0;
                duet = null;
                user = null;
                name = null;
            }
            if (user != null) {
                avatar = user.getAvatar();
                fullName = user.getFullName();
            } else {
                fullName = null;
                avatar = null;
            }
            string = Integer.toString(playCount);
            boolean z = format == 1;
            String string2 = Integer.toString(likeCount);
            if (j3 != 0) {
                j2 |= z ? 8L : 4L;
            }
            User user2 = duet != null ? duet.getUser() : null;
            String strM1599u = outline.m1599u(fullName, " ft ");
            int i2 = z ? 0 : 8;
            if (user2 != null) {
                String avatar2 = user2.getAvatar();
                fullName2 = user2.getFullName();
                str6 = avatar2;
            } else {
                fullName2 = null;
                str6 = null;
            }
            String strM1599u2 = outline.m1599u(strM1599u, fullName2);
            i = i2;
            str3 = string2;
            str2 = name;
            str4 = avatar;
            str5 = strM1599u2;
            str = str6;
        } else {
            str = null;
            str2 = null;
            string = null;
            str3 = null;
            str4 = null;
            i = 0;
            str5 = null;
        }
        if ((j2 & 3) != 0) {
            AppCompatImageView appCompatImageView = this.f32949t;
            SkuDao.a.m14053E(appCompatImageView, str4, AppCompatResources.m14707b(appCompatImageView.getContext(), R.drawable.ic_avatar_default), null, null, true, false, true, 0, false, null, null, null);
            AppCompatImageView appCompatImageView2 = this.f32950u;
            SkuDao.a.m14053E(appCompatImageView2, str, AppCompatResources.m14707b(appCompatImageView2.getContext(), R.drawable.ic_avatar_default), null, null, true, false, true, 0, false, null, null, null);
            TextViewBindingAdapter.m16406a(this.f32988A, str2);
            TextViewBindingAdapter.m16406a(this.f32989B, str5);
            TextViewBindingAdapter.m16406a(this.f32990C, string);
            TextViewBindingAdapter.m16406a(this.f32991D, str3);
            this.f32952w.setVisibility(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32992E != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32992E = 2L;
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
        this.f32953x = (Recording) obj;
        synchronized (this) {
            this.f32992E |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
