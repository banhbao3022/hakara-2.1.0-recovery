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
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.x0, reason: use source file name */
/* JADX INFO: compiled from: ItemDuetOwnerJoinedBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemDuetOwnerJoinedBindingImpl extends ItemDuetOwnerJoinedBinding {

    /* JADX INFO: renamed from: x */
    public static final SparseIntArray f32929x;

    /* JADX INFO: renamed from: A */
    public final TextView f32930A;

    /* JADX INFO: renamed from: B */
    public final TextView f32931B;

    /* JADX INFO: renamed from: C */
    public long f32932C;

    /* JADX INFO: renamed from: y */
    public final CardView f32933y;

    /* JADX INFO: renamed from: z */
    public final TextView f32934z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32929x = sparseIntArray;
        sparseIntArray.put(R.id.rootView, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemDuetOwnerJoinedBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 7, null, f32929x);
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArrM391i[1], (AppCompatImageView) objArrM391i[2], (LinearLayout) objArrM391i[6]);
        this.f32932C = -1L;
        this.f32908t.setTag(null);
        this.f32909u.setTag(null);
        CardView cardView = (CardView) objArrM391i[0];
        this.f32933y = cardView;
        cardView.setTag(null);
        TextView textView = (TextView) objArrM391i[3];
        this.f32934z = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArrM391i[4];
        this.f32930A = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArrM391i[5];
        this.f32931B = textView3;
        textView3.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String string;
        String fullName;
        String string2;
        String str;
        User user;
        Duet duet;
        int playCount;
        int likeCount;
        String avatar;
        synchronized (this) {
            j2 = this.f32932C;
            this.f32932C = 0L;
        }
        Recording recording = this.f32911w;
        long j3 = j2 & 3;
        String avatar2 = null;
        if (j3 != 0) {
            if (recording != null) {
                user = recording.getUser();
                likeCount = recording.getLikeCount();
                duet = recording.getDuet();
                playCount = recording.getPlayCount();
            } else {
                user = null;
                duet = null;
                playCount = 0;
                likeCount = 0;
            }
            if (user != null) {
                avatar = user.getAvatar();
                fullName = user.getFullName();
            } else {
                fullName = null;
                avatar = null;
            }
            string2 = Integer.toString(likeCount);
            string = Integer.toString(playCount);
            User user2 = duet != null ? duet.getUser() : null;
            avatar2 = user2 != null ? user2.getAvatar() : null;
            str = avatar;
        } else {
            string = null;
            fullName = null;
            string2 = null;
            str = null;
        }
        if (j3 != 0) {
            AppCompatImageView appCompatImageView = this.f32908t;
            SkuDao.a.m14053E(appCompatImageView, str, AppCompatResources.m14707b(appCompatImageView.getContext(), R.drawable.ic_avatar_default), null, null, true, false, true, 0, false, null, null, null);
            AppCompatImageView appCompatImageView2 = this.f32909u;
            SkuDao.a.m14053E(appCompatImageView2, avatar2, AppCompatResources.m14707b(appCompatImageView2.getContext(), R.drawable.ic_avatar_default), null, null, true, false, true, 0, false, null, null, null);
            TextViewBindingAdapter.m16406a(this.f32934z, fullName);
            TextViewBindingAdapter.m16406a(this.f32930A, string);
            TextViewBindingAdapter.m16406a(this.f32931B, string2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32932C != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32932C = 2L;
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
        this.f32911w = (Recording) obj;
        synchronized (this) {
            this.f32932C |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
