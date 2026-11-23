package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p555j.p556a.p557a.p558a.p559a.p590r.C6799h0;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.i.b3, reason: use source file name */
/* JADX INFO: compiled from: PostActivityBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class PostActivityBindingImpl extends PostActivityBinding {

    /* JADX INFO: renamed from: A */
    public static final SparseIntArray f32427A;

    /* JADX INFO: renamed from: B */
    public final CoordinatorLayout f32428B;

    /* JADX INFO: renamed from: C */
    public final LinearLayout f32429C;

    /* JADX INFO: renamed from: D */
    public long f32430D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32427A = sparseIntArray;
        sparseIntArray.put(R.id.appBar, 6);
        sparseIntArray.put(R.id.toolbar, 7);
        sparseIntArray.put(R.id.toolbarTitle, 8);
        sparseIntArray.put(R.id.btnPost, 9);
        sparseIntArray.put(R.id.toolbarLine, 10);
        sparseIntArray.put(R.id.viewAccount, 11);
        sparseIntArray.put(R.id.layout_user_info, 12);
        sparseIntArray.put(R.id.btnPrivacy, 13);
        sparseIntArray.put(R.id.iconPrivacy, 14);
        sparseIntArray.put(R.id.txtPrivacy, 15);
        sparseIntArray.put(R.id.message, 16);
        sparseIntArray.put(R.id.layout_recording_info, 17);
        sparseIntArray.put(R.id.btnChangeThumbnail, 18);
        sparseIntArray.put(R.id.layout_recording, 19);
        sparseIntArray.put(R.id.txtDuration, 20);
        sparseIntArray.put(R.id.btnInviteFriendDuet, 21);
        sparseIntArray.put(R.id.iconInvite, 22);
        sparseIntArray.put(R.id.iconArrow, 23);
        sparseIntArray.put(R.id.recyclerUsers, 24);
        sparseIntArray.put(R.id.layoutPosting, 25);
        sparseIntArray.put(R.id.loading, 26);
        sparseIntArray.put(R.id.txtMessageProgress, 27);
        sparseIntArray.put(R.id.fragment, 28);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PostActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 29, null, f32427A);
        super(dataBindingComponent, view, 3, (AppBarLayout) objArrM391i[6], (AppCompatImageView) objArrM391i[1], (ImageView) objArrM391i[18], (RelativeLayout) objArrM391i[21], (TextView) objArrM391i[9], (LinearLayout) objArrM391i[13], (FrameLayout) objArrM391i[28], (TextView) objArrM391i[2], (ImageView) objArrM391i[23], (ImageView) objArrM391i[22], (ImageView) objArrM391i[14], (LinearLayout) objArrM391i[25], (LinearLayout) objArrM391i[19], (RelativeLayout) objArrM391i[17], (LinearLayout) objArrM391i[12], (LottieAnimationView) objArrM391i[26], (EditText) objArrM391i[16], (TextView) objArrM391i[4], (RecyclerView) objArrM391i[24], (AppCompatImageView) objArrM391i[3], (Toolbar) objArrM391i[7], (View) objArrM391i[10], (TextView) objArrM391i[8], (TextView) objArrM391i[20], (TextView) objArrM391i[27], (TextView) objArrM391i[15], (RelativeLayout) objArrM391i[11]);
        this.f32430D = -1L;
        this.f32397t.setTag(null);
        this.f32399v.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArrM391i[0];
        this.f32428B = coordinatorLayout;
        coordinatorLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArrM391i[5];
        this.f32429C = linearLayout;
        linearLayout.setTag(null);
        this.f32400w.setTag(null);
        this.f32401x.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String fullName;
        String avatar;
        synchronized (this) {
            j2 = this.f32430D;
            this.f32430D = 0L;
        }
        C6799h0 c6799h0 = this.f32403z;
        if ((31 & j2) != 0) {
            if ((j2 & 25) == 0) {
                str2 = null;
                str3 = null;
            } else {
                MutableLiveData<RecordingEntity> mutableLiveData = c6799h0 != null ? c6799h0.f31869x : null;
                m404r(0, mutableLiveData);
                RecordingEntity recordingEntityM421d = mutableLiveData != null ? mutableLiveData.m421d() : null;
                if (recordingEntityM421d != null) {
                    str3 = recordingEntityM421d.f32336l;
                    str2 = recordingEntityM421d.f32331g;
                } else {
                    str2 = null;
                    str3 = null;
                }
            }
            if ((j2 & 26) == 0) {
                fullName = null;
                avatar = null;
            } else {
                MutableLiveData<User> mutableLiveData2 = c6799h0 != null ? c6799h0.f31862q : null;
                m404r(1, mutableLiveData2);
                User userM421d = mutableLiveData2 != null ? mutableLiveData2.m421d() : null;
                if (userM421d != null) {
                    avatar = userM421d.getAvatar();
                    fullName = userM421d.getFullName();
                } else {
                    fullName = null;
                    avatar = null;
                }
            }
            long j3 = j2 & 28;
            if (j3 != 0) {
                MutableLiveData<Integer> mutableLiveData3 = c6799h0 != null ? c6799h0.f31858m : null;
                m404r(2, mutableLiveData3);
                boolean z = ViewDataBinding.m393n(mutableLiveData3 != null ? mutableLiveData3.m421d() : null) == 0;
                if (j3 != 0) {
                    j2 |= z ? 64L : 32L;
                }
                i = z ? 8 : 0;
                str = fullName;
                str4 = avatar;
            } else {
                str = fullName;
                str4 = avatar;
                i = 0;
            }
        } else {
            str = null;
            str2 = null;
            str3 = null;
            i = 0;
            str4 = null;
        }
        if ((26 & j2) != 0) {
            SkuDao.a.m14053E(this.f32397t, str4, null, null, null, true, false, true, 0, false, null, null, null);
            TextViewBindingAdapter.m16406a(this.f32399v, str);
        }
        if ((28 & j2) != 0) {
            this.f32429C.setVisibility(i);
        }
        if ((j2 & 25) != 0) {
            TextViewBindingAdapter.m16406a(this.f32400w, str2);
            AppCompatImageView appCompatImageView = this.f32401x;
            SkuDao.a.m14053E(appCompatImageView, str3, AppCompatResources.m14707b(appCompatImageView.getContext(), R.drawable.ic_song_default), null, null, true, false, false, 0, false, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32430D != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32430D = 16L;
        }
        m401m();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: j */
    public boolean mo399j(int i, Object obj, int i2) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.f32430D |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.f32430D |= 2;
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.f32430D |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (9 != i) {
            return false;
        }
        this.f32403z = (C6799h0) obj;
        synchronized (this) {
            this.f32430D |= 8;
        }
        m16396a(9);
        m401m();
        return true;
    }
}
