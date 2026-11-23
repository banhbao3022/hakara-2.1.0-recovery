package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.airbnb.lottie.LottieAnimationView;
import com.cgfay.camera.widget.RecordCountDownView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.seekbar.CustomSeekBar;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.widgets.VideoTextureView;
import p555j.p556a.p557a.p558a.p559a.p590r.C6799h0;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.i.b4, reason: use source file name */
/* JADX INFO: compiled from: SingActivityBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class SingActivityBindingImpl extends SingActivityBinding {

    /* JADX INFO: renamed from: F */
    public static final SparseIntArray f32431F;

    /* JADX INFO: renamed from: G */
    public final AppCompatImageView f32432G;

    /* JADX INFO: renamed from: H */
    public final AppCompatImageView f32433H;

    /* JADX INFO: renamed from: I */
    public long f32434I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32431F = sparseIntArray;
        sparseIntArray.put(R.id.dimView, 9);
        sparseIntArray.put(R.id.youTubePlayerView, 10);
        sparseIntArray.put(R.id.loadingForFirst, 11);
        sparseIntArray.put(R.id.progress_loading, 12);
        sparseIntArray.put(R.id.toolbar, 13);
        sparseIntArray.put(R.id.btnCancel, 14);
        sparseIntArray.put(R.id.linearLayout5, 15);
        sparseIntArray.put(R.id.pointRecording, 16);
        sparseIntArray.put(R.id.timerTextView, 17);
        sparseIntArray.put(R.id.ADuetLayout, 18);
        sparseIntArray.put(R.id.duetAnimationA, 19);
        sparseIntArray.put(R.id.BDuetLayout, 20);
        sparseIntArray.put(R.id.duetAnimationB, 21);
        sparseIntArray.put(R.id.layoutNextPrevSecond, 22);
        sparseIntArray.put(R.id.btnPrevSecond, 23);
        sparseIntArray.put(R.id.btnNextSecond, 24);
        sparseIntArray.put(R.id.layoutTips, 25);
        sparseIntArray.put(R.id.tips_top_line1, 26);
        sparseIntArray.put(R.id.tips_icon, 27);
        sparseIntArray.put(R.id.tips_top_line2, 28);
        sparseIntArray.put(R.id.sing_tips, 29);
        sparseIntArray.put(R.id.layoutVideoView, 30);
        sparseIntArray.put(R.id.videoPlayerView, 31);
        sparseIntArray.put(R.id.fragment_camera_container, 32);
        sparseIntArray.put(R.id.seekBarContainer, 33);
        sparseIntArray.put(R.id.currTime, 34);
        sparseIntArray.put(R.id.audioDuration, 35);
        sparseIntArray.put(R.id.songSeekBar, 36);
        sparseIntArray.put(R.id.icCameraSwitch, 37);
        sparseIntArray.put(R.id.btnShowCamera, 38);
        sparseIntArray.put(R.id.btnSingContinue, 39);
        sparseIntArray.put(R.id.loading, 40);
        sparseIntArray.put(R.id.layoutLoopBack, 41);
        sparseIntArray.put(R.id.isLoopBack, 42);
        sparseIntArray.put(R.id.countDownViewSing, 43);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SingActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 44, null, f32431F);
        super(dataBindingComponent, view, 5, (RelativeLayout) objArrM391i[18], (RelativeLayout) objArrM391i[20], (TextView) objArrM391i[35], (ImageView) objArrM391i[14], (TextView) objArrM391i[24], (TextView) objArrM391i[23], (ImageView) objArrM391i[38], (TextView) objArrM391i[39], (ConstraintLayout) objArrM391i[0], (RecordCountDownView) objArrM391i[43], (TextView) objArrM391i[34], (View) objArrM391i[9], (LottieAnimationView) objArrM391i[19], (LottieAnimationView) objArrM391i[21], (RelativeLayout) objArrM391i[4], (FrameLayout) objArrM391i[32], (ImageView) objArrM391i[37], (Switch) objArrM391i[42], (LinearLayout) objArrM391i[41], (RelativeLayout) objArrM391i[22], (LinearLayout) objArrM391i[25], (RelativeLayout) objArrM391i[30], (RelativeLayout) objArrM391i[8], (LinearLayout) objArrM391i[15], (LottieAnimationView) objArrM391i[40], (LinearLayout) objArrM391i[11], (ImageButton) objArrM391i[16], (ProgressBar) objArrM391i[12], (LinearLayout) objArrM391i[33], (AppCompatImageView) objArrM391i[1], (ViewPager) objArrM391i[29], (CustomSeekBar) objArrM391i[36], (AppCompatImageView) objArrM391i[2], (TextView) objArrM391i[17], (ImageView) objArrM391i[27], (View) objArrM391i[26], (View) objArrM391i[28], (Toolbar) objArrM391i[13], (TextView) objArrM391i[3], (VideoTextureView) objArrM391i[31], (AppCompatImageView) objArrM391i[7], (YouTubePlayerView) objArrM391i[10]);
        this.f32434I = -1L;
        this.f32409t.setTag(null);
        this.f32411v.setTag(null);
        this.f32413x.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArrM391i[5];
        this.f32432G = appCompatImageView;
        appCompatImageView.setTag(null);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) objArrM391i[6];
        this.f32433H = appCompatImageView2;
        appCompatImageView2.setTag(null);
        this.f32414y.setTag(null);
        this.f32415z.setTag(null);
        this.f32406C.setTag(null);
        this.f32407D.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098 A[PHI: r2
  0x0098: PHI (r2v3 long) = (r2v0 long), (r2v5 long) binds: [B:33:0x0068, B:50:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e2  */
    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String name;
        String thumbnail;
        int i;
        String avatar;
        String thumbnail2;
        String str;
        String avatar2;
        synchronized (this) {
            j2 = this.f32434I;
            this.f32434I = 0L;
        }
        C6799h0 c6799h0 = this.f32408E;
        if ((127 & j2) != 0) {
            if ((j2 & 97) == 0) {
                name = null;
                thumbnail = null;
            } else {
                MutableLiveData<Song> mutableLiveData = c6799h0 != null ? c6799h0.f31857l : null;
                m404r(0, mutableLiveData);
                Song songM421d = mutableLiveData != null ? mutableLiveData.m421d() : null;
                if (songM421d != null) {
                    thumbnail = songM421d.getThumbnail();
                    name = songM421d.getName();
                } else {
                    name = null;
                    thumbnail = null;
                }
            }
            if ((j2 & 98) == 0) {
                avatar = null;
            } else {
                MutableLiveData<User> mutableLiveData2 = c6799h0 != null ? c6799h0.f31864s : null;
                m404r(1, mutableLiveData2);
                User userM421d = mutableLiveData2 != null ? mutableLiveData2.m421d() : null;
                if (userM421d != null) {
                    avatar = userM421d.getAvatar();
                } else {
                    avatar = null;
                }
            }
            long j3 = j2 & 100;
            if (j3 == 0) {
                i = 0;
            } else {
                MutableLiveData<Integer> mutableLiveData3 = c6799h0 != null ? c6799h0.f31858m : null;
                m404r(2, mutableLiveData3);
                boolean z = ViewDataBinding.m393n(mutableLiveData3 != null ? mutableLiveData3.m421d() : null) == 0;
                if (j3 != 0) {
                    j2 |= z ? 256L : 128L;
                }
                if (z) {
                    i = 8;
                } else {
                    i = 0;
                }
            }
            if ((j2 & 104) == 0) {
                avatar2 = null;
            } else {
                MutableLiveData<User> mutableLiveData4 = c6799h0 != null ? c6799h0.f31863r : null;
                m404r(3, mutableLiveData4);
                User userM421d2 = mutableLiveData4 != null ? mutableLiveData4.m421d() : null;
                if (userM421d2 != null) {
                    avatar2 = userM421d2.getAvatar();
                } else {
                    avatar2 = null;
                }
            }
            if ((j2 & 112) == 0) {
                str = avatar2;
                thumbnail2 = null;
            } else {
                MutableLiveData<Recording> mutableLiveData5 = c6799h0 != null ? c6799h0.f31859n : null;
                m404r(4, mutableLiveData5);
                Recording recordingM421d = mutableLiveData5 != null ? mutableLiveData5.m421d() : null;
                if (recordingM421d != null) {
                    thumbnail2 = recordingM421d.getThumbnail();
                    str = avatar2;
                } else {
                    str = avatar2;
                    thumbnail2 = null;
                }
            }
        } else {
            name = null;
            thumbnail = null;
            i = 0;
            avatar = null;
            thumbnail2 = null;
            str = null;
        }
        if ((j2 & 100) != 0) {
            this.f32411v.setVisibility(i);
        }
        if ((104 & j2) != 0) {
            SkuDao.a.m14053E(this.f32432G, str, null, null, null, true, false, true, 0, false, null, null, null);
        }
        if ((98 & j2) != 0) {
            SkuDao.a.m14053E(this.f32433H, avatar, null, null, null, true, false, true, 0, false, null, null, null);
        }
        if ((j2 & 97) != 0) {
            String str2 = thumbnail;
            SkuDao.a.m14053E(this.f32414y, str2, null, null, null, true, false, false, 0, true, null, null, null);
            SkuDao.a.m14053E(this.f32415z, str2, null, null, null, true, false, false, 0, false, null, null, null);
            TextViewBindingAdapter.m16406a(this.f32406C, name);
        }
        if ((j2 & 112) != 0) {
            SkuDao.a.m14053E(this.f32407D, thumbnail2, null, null, null, true, false, false, 0, false, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32434I != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32434I = 64L;
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
                this.f32434I |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.f32434I |= 2;
            }
            return true;
        }
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.f32434I |= 4;
            }
            return true;
        }
        if (i == 3) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.f32434I |= 8;
            }
            return true;
        }
        if (i != 4) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.f32434I |= 16;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (9 != i) {
            return false;
        }
        this.f32408E = (C6799h0) obj;
        synchronized (this) {
            this.f32434I |= 32;
        }
        m16396a(9);
        m401m();
        return true;
    }
}
