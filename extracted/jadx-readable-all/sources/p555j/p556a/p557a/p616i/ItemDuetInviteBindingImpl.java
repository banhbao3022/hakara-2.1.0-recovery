package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.User;
import p469c1.p470a.p471a.p472a.RoundedCornersTransformation;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.v0, reason: use source file name */
/* JADX INFO: compiled from: ItemDuetInviteBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemDuetInviteBindingImpl extends ItemDuetInviteBinding {

    /* JADX INFO: renamed from: E */
    public static final SparseIntArray f32891E;

    /* JADX INFO: renamed from: F */
    public final AppCompatImageView f32892F;

    /* JADX INFO: renamed from: G */
    public long f32893G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32891E = sparseIntArray;
        sparseIntArray.put(R.id.viewAccount, 10);
        sparseIntArray.put(R.id.avatarDuetLayout, 11);
        sparseIntArray.put(R.id.layout_user_info, 12);
        sparseIntArray.put(R.id.layout_recording_info, 13);
        sparseIntArray.put(R.id.iconPlay, 14);
        sparseIntArray.put(R.id.layout_recording, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemDuetInviteBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 16, null, f32891E);
        super(dataBindingComponent, view, 0, (RelativeLayout) objArrM391i[11], (TextView) objArrM391i[9], (LinearLayout) objArrM391i[0], (TextView) objArrM391i[3], (TextView) objArrM391i[2], (ImageView) objArrM391i[14], (LinearLayout) objArrM391i[15], (RelativeLayout) objArrM391i[13], (LinearLayout) objArrM391i[12], (TextView) objArrM391i[4], (TextView) objArrM391i[8], (TextView) objArrM391i[6], (AppCompatImageView) objArrM391i[5], (TextView) objArrM391i[7], (RelativeLayout) objArrM391i[10]);
        this.f32893G = -1L;
        this.f32872t.setTag(null);
        this.f32873u.setTag(null);
        this.f32874v.setTag(null);
        this.f32875w.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArrM391i[1];
        this.f32892F = appCompatImageView;
        appCompatImageView.setTag(null);
        this.f32876x.setTag(null);
        this.f32877y.setTag(null);
        this.f32878z.setTag(null);
        this.f32868A.setTag(null);
        this.f32869B.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String fullName;
        int i;
        boolean z;
        String message;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        User user;
        String thumbnail;
        int type;
        int i3;
        String postDate;
        String name;
        String avatar;
        synchronized (this) {
            j2 = this.f32893G;
            this.f32893G = 0L;
        }
        Recording recording = this.f32871D;
        long j3 = j2 & 3;
        if (j3 != 0) {
            if (recording != null) {
                user = recording.getUser();
                thumbnail = recording.getThumbnail();
                int format = recording.getFormat();
                postDate = recording.getPostDate();
                name = recording.getName();
                i3 = format;
                type = recording.getType();
                message = recording.getMessage();
            } else {
                user = null;
                thumbnail = null;
                type = 0;
                message = null;
                i3 = 0;
                postDate = null;
                name = null;
            }
            if (user != null) {
                avatar = user.getAvatar();
                fullName = user.getFullName();
            } else {
                fullName = null;
                avatar = null;
            }
            boolean z2 = i3 == 1;
            z = type == 1;
            if (j3 != 0) {
                j2 |= z2 ? 128L : 64L;
            }
            if ((j2 & 3) != 0) {
                j2 = z ? j2 | 8 | 32 : j2 | 4 | 16;
            }
            i2 = z2 ? 0 : 8;
            str = thumbnail;
            i = z ? 0 : 8;
            str2 = postDate;
            str3 = name;
            str4 = avatar;
        } else {
            fullName = null;
            i = 0;
            z = false;
            message = null;
            i2 = 0;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        if ((32 & j2) != 0) {
            str5 = String.format(this.f32877y.getResources().getString(R.string.msg_recording_duet_invite_count), Integer.valueOf(recording != null ? recording.getDuetCount() : 0));
        } else {
            str5 = null;
        }
        if ((16 & j2) != 0) {
            str6 = String.format(this.f32877y.getResources().getString(R.string.msg_play_count), Integer.valueOf(recording != null ? recording.getPlayCount() : 0));
        } else {
            str6 = null;
        }
        long j4 = j2 & 3;
        if (j4 == 0) {
            str6 = null;
        } else if (z) {
            str6 = str5;
        }
        if (j4 != 0) {
            this.f32872t.setVisibility(i);
            TextViewBindingAdapter.m16406a(this.f32874v, str2);
            TextViewBindingAdapter.m16406a(this.f32875w, fullName);
            SkuDao.a.m14053E(this.f32892F, str4, null, null, null, true, false, true, 0, false, null, null, null);
            TextViewBindingAdapter.m16406a(this.f32876x, message);
            TextViewBindingAdapter.m16406a(this.f32877y, str6);
            TextViewBindingAdapter.m16406a(this.f32878z, str3);
            SkuDao.a.m14053E(this.f32868A, str, null, null, null, true, false, false, 10, false, RoundedCornersTransformation.a.LEFT, null, null);
            this.f32869B.setVisibility(i2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32893G != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32893G = 2L;
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
        this.f32871D = (Recording) obj;
        synchronized (this) {
            this.f32893G |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
