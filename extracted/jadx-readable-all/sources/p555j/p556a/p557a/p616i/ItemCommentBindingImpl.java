package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Comment;
import mtp.media.karaoke.data.model.User;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.p0, reason: use source file name */
/* JADX INFO: compiled from: ItemCommentBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemCommentBindingImpl extends ItemCommentBinding {

    /* JADX INFO: renamed from: D */
    public static final SparseIntArray f32735D;

    /* JADX INFO: renamed from: E */
    public final LinearLayout f32736E;

    /* JADX INFO: renamed from: F */
    public long f32737F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32735D = sparseIntArray;
        sparseIntArray.put(R.id.content, 6);
        sparseIntArray.put(R.id.message, 7);
        sparseIntArray.put(R.id.btnReplyComment, 8);
        sparseIntArray.put(R.id.iconLikeComment, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemCommentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 10, null, f32735D);
        super(dataBindingComponent, view, 0, (TextView) objArrM391i[4], (TextView) objArrM391i[8], (LinearLayout) objArrM391i[6], (TextView) objArrM391i[3], (TextView) objArrM391i[2], (ImageView) objArrM391i[9], (TextView) objArrM391i[7], (AppCompatImageView) objArrM391i[1], (TextView) objArrM391i[5]);
        this.f32737F = -1L;
        this.f32715t.setTag(null);
        this.f32718w.setTag(null);
        this.f32719x.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArrM391i[0];
        this.f32736E = linearLayout;
        linearLayout.setTag(null);
        this.f32712A.setTag(null);
        this.f32713B.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String fullName;
        String createdAt;
        String str;
        int i;
        int i2;
        boolean z;
        User user;
        int likeCount;
        boolean likeStatus;
        String avatar;
        synchronized (this) {
            j2 = this.f32737F;
            this.f32737F = 0L;
        }
        Comment comment = this.f32714C;
        long j3 = j2 & 3;
        String str2 = null;
        if (j3 != 0) {
            if (comment != null) {
                user = comment.getUser();
                createdAt = comment.getCreatedAt();
                likeStatus = comment.getLikeStatus();
                likeCount = comment.getLikeCount();
            } else {
                user = null;
                createdAt = null;
                likeCount = 0;
                likeStatus = false;
            }
            if (j3 != 0) {
                j2 |= likeStatus ? 32L : 16L;
            }
            if (user != null) {
                avatar = user.getAvatar();
                fullName = user.getFullName();
            } else {
                fullName = null;
                avatar = null;
            }
            int iM388d = likeStatus ? ViewDataBinding.m388d(this.f32715t, R.color.header_color) : ViewDataBinding.m388d(this.f32715t, R.color.black_40);
            z = likeCount > 0;
            if ((j2 & 3) != 0) {
                j2 = z ? j2 | 8 : j2 | 4;
            }
            str = avatar;
            int i3 = iM388d;
            i2 = likeCount;
            i = i3;
        } else {
            fullName = null;
            createdAt = null;
            str = null;
            i = 0;
            i2 = 0;
            z = false;
        }
        String string = (8 & j2) != 0 ? Integer.toString(i2) : null;
        long j4 = j2 & 3;
        if (j4 != 0) {
            str2 = z ? string : "";
        }
        if (j4 != 0) {
            this.f32715t.setTextColor(i);
            SkuDao.a.m14082d0(this.f32718w, createdAt);
            TextViewBindingAdapter.m16406a(this.f32719x, fullName);
            SkuDao.a.m14053E(this.f32712A, str, null, null, null, true, false, true, 0, false, null, null, null);
            TextViewBindingAdapter.m16406a(this.f32713B, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32737F != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32737F = 2L;
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
        this.f32714C = (Comment) obj;
        synchronized (this) {
            this.f32737F |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
