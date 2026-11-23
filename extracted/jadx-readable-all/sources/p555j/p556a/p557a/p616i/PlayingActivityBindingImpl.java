package p555j.p556a.p557a.p616i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.devbrackets.android.exomedia.p474ui.widget.VideoView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.kenburn.KenBurnsView;
import mtp.media.karaoke.data.model.Duet;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.User;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p559a.p584n.PlayingViewModel4;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.i.z2, reason: use source file name */
/* JADX INFO: compiled from: PlayingActivityBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class PlayingActivityBindingImpl extends PlayingActivityBinding {

    /* JADX INFO: renamed from: V */
    public static final SparseIntArray f32997V;

    /* JADX INFO: renamed from: W */
    public final TextView f32998W;

    /* JADX INFO: renamed from: X */
    public final LinearLayout f32999X;

    /* JADX INFO: renamed from: Y */
    public final ImageView f33000Y;

    /* JADX INFO: renamed from: Z */
    public final ImageView f33001Z;

    /* JADX INFO: renamed from: a0 */
    public final TextView f33002a0;

    /* JADX INFO: renamed from: b0 */
    public final TextView f33003b0;

    /* JADX INFO: renamed from: c0 */
    public final TextView f33004c0;

    /* JADX INFO: renamed from: d0 */
    public final TextView f33005d0;

    /* JADX INFO: renamed from: e0 */
    public final TextView f33006e0;

    /* JADX INFO: renamed from: f0 */
    public final TextView f33007f0;

    /* JADX INFO: renamed from: g0 */
    public final TextView f33008g0;

    /* JADX INFO: renamed from: h0 */
    public long f33009h0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32997V = sparseIntArray;
        sparseIntArray.put(R.id.appBarLayout, 34);
        sparseIntArray.put(R.id.collapsingToolbar, 35);
        sparseIntArray.put(R.id.headerLayout, 36);
        sparseIntArray.put(R.id.kenBurnsView, 37);
        sparseIntArray.put(R.id.videoView, 38);
        sparseIntArray.put(R.id.recordingThumbnail, 39);
        sparseIntArray.put(R.id.clickShowHideControl, 40);
        sparseIntArray.put(R.id.layoutVideoVertical, 41);
        sparseIntArray.put(R.id.btnVideoLike, 42);
        sparseIntArray.put(R.id.btnVideoComment, 43);
        sparseIntArray.put(R.id.btnVideoShare, 44);
        sparseIntArray.put(R.id.btnVideoViewProfile, 45);
        sparseIntArray.put(R.id.progressBarVideo, 46);
        sparseIntArray.put(R.id.btnVideoWriteComment, 47);
        sparseIntArray.put(R.id.btnVideoSendGift, 48);
        sparseIntArray.put(R.id.controlLayout, 49);
        sparseIntArray.put(R.id.dimView, 50);
        sparseIntArray.put(R.id.seekBarContainer, 51);
        sparseIntArray.put(R.id.currTime, 52);
        sparseIntArray.put(R.id.seekBarAudio, 53);
        sparseIntArray.put(R.id.totalTime, 54);
        sparseIntArray.put(R.id.btnMediaPrev, 55);
        sparseIntArray.put(R.id.btnMediaPlay, 56);
        sparseIntArray.put(R.id.btnMediaNext, 57);
        sparseIntArray.put(R.id.loadingBar, 58);
        sparseIntArray.put(R.id.userLayout, 59);
        sparseIntArray.put(R.id.btnViewUser, 60);
        sparseIntArray.put(R.id.linearLayout, 61);
        sparseIntArray.put(R.id.linearLayoutDuet, 62);
        sparseIntArray.put(R.id.txtDuetCreate, 63);
        sparseIntArray.put(R.id.btnGiftViewAll, 64);
        sparseIntArray.put(R.id.recyclerGift, 65);
        sparseIntArray.put(R.id.playingToolbar, 66);
        sparseIntArray.put(R.id.btnBack, 67);
        sparseIntArray.put(R.id.f33394eq, 68);
        sparseIntArray.put(R.id.toolbarLine, 69);
        sparseIntArray.put(R.id.playingTabLayout, 70);
        sparseIntArray.put(R.id.playingViewPager, 71);
        sparseIntArray.put(R.id.commentDim, 72);
        sparseIntArray.put(R.id.footerLayout, 73);
        sparseIntArray.put(R.id.writeComment, 74);
        sparseIntArray.put(R.id.layoutAction, 75);
        sparseIntArray.put(R.id.actionSocial, 76);
        sparseIntArray.put(R.id.btnLike, 77);
        sparseIntArray.put(R.id.lblLike, 78);
        sparseIntArray.put(R.id.btnShare, 79);
        sparseIntArray.put(R.id.shareCount, 80);
        sparseIntArray.put(R.id.btnSendGift, 81);
        sparseIntArray.put(R.id.giftCount, 82);
        sparseIntArray.put(R.id.btnSendComment, 83);
        sparseIntArray.put(R.id.giftAnimationView, 84);
        sparseIntArray.put(R.id.senderAvatar, 85);
        sparseIntArray.put(R.id.senderFullName, 86);
        sparseIntArray.put(R.id.senderGiftImage, 87);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PlayingActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 88, null, f32997V);
        super(dataBindingComponent, view, 1, (ConstraintLayout) objArrM391i[76], (AppBarLayout) objArrM391i[34], (AppCompatImageView) objArrM391i[12], (AppCompatImageView) objArrM391i[19], (ImageView) objArrM391i[67], (TextView) objArrM391i[16], (TextView) objArrM391i[22], (LinearLayout) objArrM391i[64], (LinearLayout) objArrM391i[77], (ImageView) objArrM391i[57], (ImageView) objArrM391i[56], (ImageView) objArrM391i[55], (ImageView) objArrM391i[83], (RelativeLayout) objArrM391i[81], (LinearLayout) objArrM391i[79], (FloatingActionButton) objArrM391i[32], (LinearLayout) objArrM391i[43], (TextView) objArrM391i[10], (ImageView) objArrM391i[2], (LinearLayout) objArrM391i[42], (LinearLayout) objArrM391i[48], (LinearLayout) objArrM391i[44], (LinearLayout) objArrM391i[45], (TextView) objArrM391i[47], (ConstraintLayout) objArrM391i[18], (TextView) objArrM391i[26], (ConstraintLayout) objArrM391i[60], (View) objArrM391i[40], (CollapsingToolbarLayout) objArrM391i[35], (View) objArrM391i[72], (CoordinatorLayout) objArrM391i[0], (RelativeLayout) objArrM391i[49], (TextView) objArrM391i[28], (TextView) objArrM391i[52], (View) objArrM391i[50], (LottieAnimationView) objArrM391i[68], (CardView) objArrM391i[73], (TextView) objArrM391i[13], (TextView) objArrM391i[20], (RelativeLayout) objArrM391i[84], (TextView) objArrM391i[82], (ConstraintLayout) objArrM391i[36], (ImageView) objArrM391i[33], (KenBurnsView) objArrM391i[37], (LinearLayout) objArrM391i[75], (RelativeLayout) objArrM391i[41], (TextView) objArrM391i[14], (TextView) objArrM391i[21], (TextView) objArrM391i[78], (TextView) objArrM391i[27], (LinearLayout) objArrM391i[61], (LinearLayout) objArrM391i[62], (ProgressBar) objArrM391i[58], (TextView) objArrM391i[23], (TabLayout) objArrM391i[70], (Toolbar) objArrM391i[66], (ViewPager2) objArrM391i[71], (ProgressBar) objArrM391i[46], (AppCompatImageView) objArrM391i[39], (RecyclerView) objArrM391i[65], (SeekBar) objArrM391i[53], (RelativeLayout) objArrM391i[51], (AppCompatImageView) objArrM391i[85], (TextView) objArrM391i[86], (AppCompatImageView) objArrM391i[87], (TextView) objArrM391i[80], (View) objArrM391i[69], (TextView) objArrM391i[31], (TextView) objArrM391i[54], (TextView) objArrM391i[15], (TextView) objArrM391i[63], (TextView) objArrM391i[25], (LinearLayout) objArrM391i[59], (AppCompatImageView) objArrM391i[1], (TextView) objArrM391i[11], (VideoView) objArrM391i[38], (EditText) objArrM391i[74]);
        this.f33009h0 = -1L;
        this.f32977t.setTag(null);
        this.f32978u.setTag(null);
        this.f32979v.setTag(null);
        this.f32980w.setTag(null);
        this.f32981x.setTag(null);
        this.f32982y.setTag(null);
        this.f32983z.setTag(null);
        this.f32956A.setTag(null);
        this.f32957B.setTag(null);
        this.f32960E.setTag(null);
        this.f32961F.setTag(null);
        this.f32963H.setTag(null);
        this.f32964I.setTag(null);
        this.f32965J.setTag(null);
        this.f32966K.setTag(null);
        this.f32967L.setTag(null);
        this.f32968M.setTag(null);
        TextView textView = (TextView) objArrM391i[17];
        this.f32998W = textView;
        textView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArrM391i[24];
        this.f32999X = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArrM391i[29];
        this.f33000Y = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArrM391i[3];
        this.f33001Z = imageView2;
        imageView2.setTag(null);
        TextView textView2 = (TextView) objArrM391i[30];
        this.f33002a0 = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArrM391i[4];
        this.f33003b0 = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArrM391i[5];
        this.f33004c0 = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArrM391i[6];
        this.f33005d0 = textView5;
        textView5.setTag(null);
        TextView textView6 = (TextView) objArrM391i[7];
        this.f33006e0 = textView6;
        textView6.setTag(null);
        TextView textView7 = (TextView) objArrM391i[8];
        this.f33007f0 = textView7;
        textView7.setTag(null);
        TextView textView8 = (TextView) objArrM391i[9];
        this.f33008g0 = textView8;
        textView8.setTag(null);
        this.f32969N.setTag(null);
        this.f32971P.setTag(null);
        this.f32972Q.setTag(null);
        this.f32973R.setTag(null);
        this.f32974S.setTag(null);
        this.f32975T.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        long j3;
        long j4;
        String str;
        Drawable drawable;
        String str2;
        String strM1599u;
        int i;
        String str3;
        int i2;
        Drawable drawable2;
        String str4;
        Drawable drawable3;
        Drawable drawable4;
        String str5;
        int i3;
        String str6;
        int i4;
        String str7;
        String str8;
        int i5;
        String str9;
        int i6;
        boolean z;
        boolean z2;
        String str10;
        Drawable drawable5;
        String str11;
        int i7;
        String str12;
        boolean z3;
        int i8;
        String str13;
        String str14;
        int i9;
        int i10;
        int i11;
        String str15;
        int i12;
        Drawable drawableM14707b;
        String str16;
        int likeCount;
        int type;
        int commentCount;
        boolean likeStatus;
        int playCount;
        int shareCount;
        String name;
        String postDate;
        Integer starCount;
        User user;
        Duet duet;
        String message;
        ImageView imageView;
        long j5;
        boolean followStatus;
        int level;
        String avatar;
        int joinCount;
        User user2;
        Context context;
        int i13;
        Resources resources;
        int i14;
        TextView textView;
        long j6;
        int level2;
        boolean followStatus2;
        String fullName;
        String avatar2;
        TextView textView2;
        int i15;
        Context context2;
        int i16;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        synchronized (this) {
            j2 = this.f33009h0;
            this.f33009h0 = 0L;
        }
        PlayingViewModel4 playingViewModel4 = this.f32976U;
        long j15 = 7 & j2;
        if (j15 != 0) {
            MutableLiveData<Recording> mutableLiveData = playingViewModel4 != null ? playingViewModel4.f31696l : null;
            m404r(0, mutableLiveData);
            Recording recordingM421d = mutableLiveData != null ? mutableLiveData.m421d() : null;
            if (recordingM421d != null) {
                postDate = recordingM421d.getPostDate();
                likeCount = recordingM421d.getLikeCount();
                likeStatus = recordingM421d.getLikeStatus();
                playCount = recordingM421d.getPlayCount();
                starCount = recordingM421d.getStarCount();
                type = recordingM421d.getType();
                commentCount = recordingM421d.getCommentCount();
                user = recordingM421d.getUser();
                duet = recordingM421d.getDuet();
                shareCount = recordingM421d.getShareCount();
                message = recordingM421d.getMessage();
                name = recordingM421d.getName();
            } else {
                likeCount = 0;
                type = 0;
                commentCount = 0;
                likeStatus = false;
                playCount = 0;
                shareCount = 0;
                name = null;
                postDate = null;
                starCount = null;
                user = null;
                duet = null;
                message = null;
            }
            if (j15 != 0) {
                if (likeStatus) {
                    j13 = j2 | 65536 | 262144;
                    j14 = 16777216;
                } else {
                    j13 = j2 | 32768 | 131072;
                    j14 = 8388608;
                }
                j2 = j13 | j14;
            }
            Context context3 = this.f33001Z.getContext();
            Drawable drawableM14707b2 = likeStatus ? AppCompatResources.m14707b(context3, R.drawable.ic_like_active) : AppCompatResources.m14707b(context3, R.drawable.ic_like);
            Context context4 = this.f32965J.getContext();
            Drawable drawableM14707b3 = likeStatus ? AppCompatResources.m14707b(context4, R.drawable.ic_like_active) : AppCompatResources.m14707b(context4, R.drawable.ic_like);
            int i17 = R.color.white_light;
            if (likeStatus) {
                imageView = this.f33001Z;
                i17 = R.color.red;
            } else {
                imageView = this.f33001Z;
            }
            int iM388d = ViewDataBinding.m388d(imageView, i17);
            int iM393n = ViewDataBinding.m393n(starCount);
            boolean z4 = type == 1;
            boolean z5 = type == 2;
            boolean z6 = type > 0;
            String str17 = name;
            String str18 = postDate;
            String str19 = String.format(this.f32968M.getResources().getString(R.string.msg_recording_social_action), Integer.valueOf(playCount), Integer.valueOf(likeCount), Integer.valueOf(shareCount));
            boolean z7 = shareCount > 0;
            if ((j2 & 7) != 0) {
                j2 |= z4 ? 64L : 32L;
            }
            if ((j2 & 7) != 0) {
                if (z5) {
                    j11 = j2 | 16;
                    j12 = 4294967296L;
                } else {
                    j11 = j2 | 8;
                    j12 = 2147483648L;
                }
                j2 = j11 | j12;
            }
            if ((j2 & 7) != 0) {
                j2 |= z6 ? 17179869184L : 8589934592L;
            }
            if ((j2 & 7) != 0) {
                j2 |= z7 ? 67108864L : 33554432L;
            }
            if (user != null) {
                avatar = user.getAvatar();
                level = user.getLevel();
                String fullName2 = user.getFullName();
                followStatus = user.getFollowStatus();
                j5 = 7;
                str = fullName2;
            } else {
                j5 = 7;
                followStatus = false;
                level = 0;
                str = null;
                avatar = null;
            }
            if ((j2 & j5) != 0) {
                if (followStatus) {
                    j9 = j2 | 4096 | 1048576 | 1073741824;
                    j10 = 68719476736L;
                } else {
                    j9 = j2 | 2048 | 524288 | 536870912;
                    j10 = 34359738368L;
                }
                j2 = j9 | j10;
            }
            if (duet != null) {
                joinCount = duet.getJoinCount();
                user2 = duet.getUser();
            } else {
                joinCount = 0;
                user2 = null;
            }
            boolean z8 = iM393n > 0;
            String string = Integer.toString(iM393n);
            int i18 = z5 ? 0 : 8;
            int i19 = z6 ? 0 : 8;
            String string2 = Integer.toString(level);
            z3 = z7;
            String strM1599u2 = outline.m1599u("@", str);
            if (followStatus) {
                context = this.f32983z.getContext();
                i13 = R.drawable.ic_followed;
            } else {
                context = this.f32983z.getContext();
                i13 = R.drawable.ic_follow;
            }
            Drawable drawableM14707b4 = AppCompatResources.m14707b(context, i13);
            Drawable drawableM14707b5 = followStatus ? AppCompatResources.m14707b(this.f32979v.getContext(), R.drawable.bg_button_gray_basic_corners) : AppCompatResources.m14707b(this.f32979v.getContext(), R.drawable.bg_button_basic_corners);
            if (followStatus) {
                resources = this.f32979v.getResources();
                i14 = R.string.txt_following;
            } else {
                resources = this.f32979v.getResources();
                i14 = R.string.txt_follow;
            }
            String string3 = resources.getString(i14);
            int i20 = R.color.black_60;
            if (followStatus) {
                textView = this.f32979v;
            } else {
                textView = this.f32979v;
                i20 = R.color.white_light;
            }
            int iM388d2 = ViewDataBinding.m388d(textView, i20);
            String str20 = String.format(this.f32982y.getResources().getString(R.string.msg_duet_joined_count), Integer.valueOf(joinCount));
            i10 = iM388d;
            String str21 = String.format(this.f32973R.getResources().getString(R.string.msg_duet_joined_count), Integer.valueOf(joinCount));
            if ((j2 & 7) != 0) {
                j2 |= z8 ? 268435456L : 134217728L;
            }
            if (user2 != null) {
                fullName = user2.getFullName();
                followStatus2 = user2.getFollowStatus();
                avatar2 = user2.getAvatar();
                level2 = user2.getLevel();
                j6 = 7;
            } else {
                j6 = 7;
                level2 = 0;
                followStatus2 = false;
                fullName = null;
                avatar2 = null;
            }
            if ((j2 & j6) != 0) {
                if (followStatus2) {
                    j7 = j2 | 256 | 16384;
                    j8 = 4194304;
                } else {
                    j7 = j2 | 128 | 8192;
                    j8 = 2097152;
                }
                j2 = j7 | j8;
            }
            int i21 = z8 ? 0 : 8;
            j4 = j2;
            String strM1599u3 = outline.m1599u(str20, " @");
            if (followStatus2) {
                textView2 = this.f32980w;
                i15 = R.color.black_60;
            } else {
                textView2 = this.f32980w;
                i15 = R.color.white_light;
            }
            int iM388d3 = ViewDataBinding.m388d(textView2, i15);
            String string4 = this.f32980w.getResources().getString(followStatus2 ? R.string.txt_following : R.string.txt_follow);
            if (followStatus2) {
                context2 = this.f32980w.getContext();
                i16 = R.drawable.bg_button_gray_basic_corners;
            } else {
                context2 = this.f32980w.getContext();
                i16 = R.drawable.bg_button_basic_corners;
            }
            Drawable drawableM14707b6 = AppCompatResources.m14707b(context2, i16);
            String string5 = Integer.toString(level2);
            j3 = 16;
            i11 = commentCount;
            str15 = message;
            str11 = str19;
            i12 = i21;
            str6 = fullName;
            i5 = playCount;
            str10 = string;
            i2 = i18;
            str3 = string4;
            drawable3 = drawableM14707b6;
            i7 = shareCount;
            str8 = str17;
            str2 = string2;
            i6 = likeCount;
            strM1599u = outline.m1599u(strM1599u3, str);
            drawable = drawableM14707b3;
            str12 = avatar;
            str13 = avatar2;
            str9 = strM1599u2;
            drawable2 = drawableM14707b4;
            drawable5 = drawableM14707b2;
            str14 = string5;
            i8 = level2;
            str4 = string3;
            str7 = str21;
            i4 = i19;
            i3 = iM388d2;
            i = iM388d3;
            z = z4;
            drawable4 = drawableM14707b5;
            i9 = level;
            z2 = z5;
            str5 = str18;
        } else {
            j3 = 16;
            j4 = j2;
            str = null;
            drawable = null;
            str2 = null;
            strM1599u = null;
            i = 0;
            str3 = null;
            i2 = 0;
            drawable2 = null;
            str4 = null;
            drawable3 = null;
            drawable4 = null;
            str5 = null;
            i3 = 0;
            str6 = null;
            i4 = 0;
            str7 = null;
            str8 = null;
            i5 = 0;
            str9 = null;
            i6 = 0;
            z = false;
            z2 = false;
            str10 = null;
            drawable5 = null;
            str11 = null;
            i7 = 0;
            str12 = null;
            z3 = false;
            i8 = 0;
            str13 = null;
            str14 = null;
            i9 = 0;
            i10 = 0;
            i11 = 0;
            str15 = null;
            i12 = 0;
        }
        String strM1599u4 = (j4 & j3) != 0 ? outline.m1599u("@", str6) : null;
        long j16 = j4 & 7;
        if (j16 != 0) {
            boolean z9 = z ? true : z2;
            if (j16 != 0) {
                j4 |= z9 ? 1024L : 512L;
            }
            drawableM14707b = z9 ? AppCompatResources.m14707b(this.f32981x.getContext(), R.drawable.ic_mic_join_duet_white) : AppCompatResources.m14707b(this.f32981x.getContext(), R.drawable.ic_mic_float);
        } else {
            drawableM14707b = null;
        }
        String string6 = (j4 & 67108864) != 0 ? Integer.toString(i7) : null;
        long j17 = j4 & 7;
        if (j17 != 0) {
            if (!z2) {
                strM1599u4 = str9;
            }
            if (!z3) {
                string6 = this.f33005d0.getResources().getString(R.string.txt_share);
            }
            str16 = strM1599u4;
        } else {
            str6 = str6;
            string6 = null;
            str16 = null;
        }
        if (j17 != 0) {
            String str22 = string6;
            SkuDao.a.m14053E(this.f32977t, str12, null, null, null, true, false, true, 0, false, null, null, null);
            SkuDao.a.m14053E(this.f32978u, str13, null, null, null, true, false, true, 0, false, null, null, null);
            this.f32979v.setBackground(drawable4);
            TextViewBindingAdapter.m16406a(this.f32979v, str4);
            this.f32979v.setTextColor(i3);
            this.f32980w.setBackground(drawable3);
            this.f32980w.setTextColor(i);
            TextViewBindingAdapter.m16406a(this.f32980w, str3);
            this.f32981x.setImageDrawable(drawableM14707b);
            this.f32982y.setVisibility(i4);
            TextViewBindingAdapter.m16406a(this.f32982y, strM1599u);
            this.f32983z.setBackground(drawable2);
            this.f32956A.setVisibility(i2);
            TextViewBindingAdapter.m16406a(this.f32957B, str16);
            TextViewBindingAdapter.m16406a(this.f32961F, str5);
            TextViewBindingAdapter.m16406a(this.f32963H, str);
            TextViewBindingAdapter.m16406a(this.f32964I, str6);
            this.f32965J.setImageDrawable(drawable);
            TextViewBindingAdapter.m16406a(this.f32966K, str2);
            SkuDao.a.m14051C(this.f32966K, i9);
            TextViewBindingAdapter.m16406a(this.f32967L, str14);
            SkuDao.a.m14051C(this.f32967L, i8);
            TextViewBindingAdapter.m16406a(this.f32968M, str11);
            this.f32998W.setVisibility(i2);
            this.f32999X.setVisibility(i4);
            int i22 = i12;
            this.f33000Y.setVisibility(i22);
            this.f33001Z.setImageDrawable(drawable5);
            ImageView imageView2 = this.f33001Z;
            Integer numValueOf = Integer.valueOf(i10);
            Intrinsics2.m13089e(imageView2, "$this$customTint");
            if (numValueOf != null) {
                imageView2.setImageTintList(ColorStateList.valueOf(numValueOf.intValue()));
            }
            this.f33002a0.setVisibility(i22);
            TextViewBindingAdapter.m16406a(this.f33002a0, str10);
            SkuDao.a.m14060L(this.f33003b0, i6);
            SkuDao.a.m14060L(this.f33004c0, i11);
            TextViewBindingAdapter.m16406a(this.f33005d0, str22);
            TextViewBindingAdapter.m16406a(this.f33006e0, str9);
            SkuDao.a.m14060L(this.f33007f0, i5);
            String str23 = str15;
            TextViewBindingAdapter.m16406a(this.f33008g0, str23);
            TextViewBindingAdapter.m16406a(this.f32969N, str23);
            String str24 = str8;
            TextViewBindingAdapter.m16406a(this.f32971P, str24);
            this.f32972Q.setVisibility(i2);
            TextViewBindingAdapter.m16406a(this.f32973R, str7);
            SkuDao.a.m14053E(this.f32974S, str12, null, null, null, true, false, true, 0, false, null, null, null);
            TextViewBindingAdapter.m16406a(this.f32975T, str24);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f33009h0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f33009h0 = 4L;
        }
        m401m();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: j */
    public boolean mo399j(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.f33009h0 |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (9 != i) {
            return false;
        }
        this.f32976U = (PlayingViewModel4) obj;
        synchronized (this) {
            this.f33009h0 |= 2;
        }
        m16396a(9);
        m401m();
        return true;
    }
}
