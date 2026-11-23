package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.User;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.v1, reason: use source file name */
/* JADX INFO: compiled from: ItemRecordingRankingBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemRecordingRankingBindingImpl extends ItemRecordingRankingBinding {

    /* JADX INFO: renamed from: z */
    public static final SparseIntArray f32894z;

    /* JADX INFO: renamed from: A */
    public final CardView f32895A;

    /* JADX INFO: renamed from: B */
    public final TextView f32896B;

    /* JADX INFO: renamed from: C */
    public long f32897C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32894z = sparseIntArray;
        sparseIntArray.put(R.id.rootView, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemRecordingRankingBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 6, null, f32894z);
        super(dataBindingComponent, view, 0, (TextView) objArrM391i[4], (TextView) objArrM391i[2], (RelativeLayout) objArrM391i[5], (AppCompatImageView) objArrM391i[1]);
        this.f32897C = -1L;
        this.f32879t.setTag(null);
        this.f32880u.setTag(null);
        CardView cardView = (CardView) objArrM391i[0];
        this.f32895A = cardView;
        cardView.setTag(null);
        TextView textView = (TextView) objArrM391i[3];
        this.f32896B = textView;
        textView.setTag(null);
        this.f32882w.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String str;
        String fullName;
        String str2;
        int playCount;
        User user;
        int commentCount;
        int likeCount;
        String avatar;
        synchronized (this) {
            j2 = this.f32897C;
            this.f32897C = 0L;
        }
        Recording recording = this.f32884y;
        int i = this.f32883x;
        long j3 = 5 & j2;
        if (j3 != 0) {
            if (recording != null) {
                user = recording.getUser();
                commentCount = recording.getCommentCount();
                likeCount = recording.getLikeCount();
                playCount = recording.getPlayCount();
            } else {
                playCount = 0;
                user = null;
                commentCount = 0;
                likeCount = 0;
            }
            if (user != null) {
                avatar = user.getAvatar();
                fullName = user.getFullName();
            } else {
                fullName = null;
                avatar = null;
            }
            str = String.format(this.f32896B.getResources().getString(R.string.msg_recording_ranking_report), Integer.valueOf(playCount), Integer.valueOf(likeCount), Integer.valueOf(commentCount));
            str2 = avatar;
        } else {
            str = null;
            fullName = null;
            str2 = null;
        }
        long j4 = j2 & 6;
        String str3 = j4 != 0 ? String.format(this.f32879t.getResources().getString(R.string.msg_number_count), Integer.valueOf(i)) : null;
        if (j4 != 0) {
            TextViewBindingAdapter.m16406a(this.f32879t, str3);
        }
        if (j3 != 0) {
            TextViewBindingAdapter.m16406a(this.f32880u, fullName);
            TextViewBindingAdapter.m16406a(this.f32896B, str);
            SkuDao.a.m14053E(this.f32882w, str2, null, null, null, true, false, true, 0, false, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32897C != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32897C = 4L;
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
            this.f32884y = (Recording) obj;
            synchronized (this) {
                this.f32897C |= 1;
            }
            m16396a(8);
            m401m();
        } else {
            if (2 != i) {
                return false;
            }
            mo14246s(((Integer) obj).intValue());
        }
        return true;
    }

    @Override // p555j.p556a.p557a.p616i.ItemRecordingRankingBinding
    /* JADX INFO: renamed from: s */
    public void mo14246s(int i) {
        this.f32883x = i;
        synchronized (this) {
            this.f32897C |= 2;
        }
        m16396a(2);
        m401m();
    }
}
