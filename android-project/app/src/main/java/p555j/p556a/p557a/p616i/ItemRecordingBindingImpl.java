package p555j.p556a.p557a.p616i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Duet;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.User;
import p469c1.p470a.p471a.p472a.RoundedCornersTransformation;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.t1, reason: use source file name */
/* JADX INFO: compiled from: ItemRecordingBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemRecordingBindingImpl extends ItemRecordingBinding {

    /* JADX INFO: renamed from: U */
    public static final SparseIntArray f32848U;

    /* JADX INFO: renamed from: V */
    public final AppCompatImageView f32849V;

    /* JADX INFO: renamed from: W */
    public final AppCompatImageView f32850W;

    /* JADX INFO: renamed from: X */
    public final ImageView f32851X;

    /* JADX INFO: renamed from: Y */
    public final ImageView f32852Y;

    /* JADX INFO: renamed from: Z */
    public long f32853Z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32848U = sparseIntArray;
        sparseIntArray.put(R.id.viewAccount, 21);
        sparseIntArray.put(R.id.avatarDuetLayout, 22);
        sparseIntArray.put(R.id.layout_user_info, 23);
        sparseIntArray.put(R.id.layout_recording_info, 24);
        sparseIntArray.put(R.id.iconPlay, 25);
        sparseIntArray.put(R.id.layout_recording, 26);
        sparseIntArray.put(R.id.socialActionLayout, 27);
        sparseIntArray.put(R.id.btnLike, 28);
        sparseIntArray.put(R.id.btnComment, 29);
        sparseIntArray.put(R.id.btnShare, 30);
        sparseIntArray.put(R.id.btnSendGift, 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemRecordingBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 32, null, f32848U);
        super(dataBindingComponent, view, 0, (RelativeLayout) objArrM391i[22], (LinearLayout) objArrM391i[29], (TextView) objArrM391i[6], (TextView) objArrM391i[15], (LinearLayout) objArrM391i[28], (ImageView) objArrM391i[7], (LinearLayout) objArrM391i[31], (LinearLayout) objArrM391i[30], (LinearLayout) objArrM391i[0], (TextView) objArrM391i[18], (TextView) objArrM391i[4], (TextView) objArrM391i[3], (TextView) objArrM391i[20], (ImageView) objArrM391i[16], (ImageView) objArrM391i[25], (LinearLayout) objArrM391i[26], (RelativeLayout) objArrM391i[24], (LinearLayout) objArrM391i[23], (TextView) objArrM391i[9], (TextView) objArrM391i[14], (TextView) objArrM391i[11], (TextView) objArrM391i[19], (ConstraintLayout) objArrM391i[27], (AppCompatImageView) objArrM391i[10], (TextView) objArrM391i[13], (TextView) objArrM391i[17], (TextView) objArrM391i[12], (RelativeLayout) objArrM391i[21]);
        this.f32853Z = -1L;
        this.f32833u.setTag(null);
        this.f32834v.setTag(null);
        this.f32836x.setTag(null);
        this.f32812A.setTag(null);
        this.f32813B.setTag(null);
        this.f32814C.setTag(null);
        this.f32815D.setTag(null);
        this.f32816E.setTag(null);
        this.f32817F.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArrM391i[1];
        this.f32849V = appCompatImageView;
        appCompatImageView.setTag(null);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) objArrM391i[2];
        this.f32850W = appCompatImageView2;
        appCompatImageView2.setTag(null);
        ImageView imageView = (ImageView) objArrM391i[5];
        this.f32851X = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArrM391i[8];
        this.f32852Y = imageView2;
        imageView2.setTag(null);
        this.f32818G.setTag(null);
        this.f32819H.setTag(null);
        this.f32820I.setTag(null);
        this.f32821J.setTag(null);
        this.f32822K.setTag(null);
        this.f32823L.setTag(null);
        this.f32824M.setTag(null);
        this.f32825N.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    /* JADX WARN: Code duplicated, block: B:250:0x04f0 A[PHI: r2
  0x04f0: PHI (r2v3 long) = (r2v2 long), (r2v13 long) binds: [B:240:0x04d6, B:248:0x04eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:283:0x0546 A[PHI: r2
  0x0546: PHI (r2v5 long) = (r2v4 long), (r2v11 long) binds: [B:271:0x052e, B:280:0x0540] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        Drawable drawable;
        String str;
        String str2;
        String str3;
        Drawable drawable2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z6;
        boolean z7;
        float f;
        int i8;
        int i9;
        String str10;
        boolean z8;
        int i10;
        String str11;
        int i11;
        String str12;
        String str13;
        String str14;
        String str15;
        int i12;
        int i13;
        String str16;
        String avatar;
        Drawable drawableM14707b;
        String str17;
        String str18;
        String name;
        int i14;
        int i15;
        int i16;
        boolean z9;
        boolean z10;
        boolean z11;
        int likeCount;
        int giftCount;
        int commentCount;
        int shareCount;
        int i17;
        String string;
        String avatar2;
        String fullName;
        Drawable drawableM14707b2;
        boolean z12;
        int iM388d;
        boolean z13;
        String string2;
        Resources resources;
        int i18;
        int pin;
        int i19;
        boolean z14;
        TextView textView;
        int i20;
        long j3;
        long j4;
        String str19;
        Duet duet;
        int i21;
        int i22;
        int privacy;
        boolean likeStatus;
        Context context;
        int i23;
        Resources resources2;
        int i24;
        long j5;
        long j6;
        synchronized (this) {
            j2 = this.f32853Z;
            this.f32853Z = 0L;
        }
        Integer num = this.f32830S;
        Recording recording = this.f32831T;
        boolean z15 = this.f32827P;
        boolean z16 = this.f32829R;
        boolean z17 = this.f32828Q;
        int iM393n = (j2 & 35) != 0 ? ViewDataBinding.m393n(num) : 0;
        float f2 = 0.0f;
        if ((47 & j2) != 0) {
            long j7 = j2 & 34;
            if (j7 != 0) {
                if (recording != null) {
                    privacy = recording.getPrivacy();
                    likeStatus = recording.getLikeStatus();
                    int format = recording.getFormat();
                    String message = recording.getMessage();
                    Duet duet2 = recording.getDuet();
                    String thumbnail = recording.getThumbnail();
                    String postDate = recording.getPostDate();
                    int type = recording.getType();
                    likeCount = recording.getLikeCount();
                    giftCount = recording.getGiftCount();
                    commentCount = recording.getCommentCount();
                    shareCount = recording.getShareCount();
                    name = recording.getName();
                    i21 = format;
                    str19 = message;
                    i22 = type;
                    str18 = postDate;
                    str17 = thumbnail;
                    duet = duet2;
                } else {
                    str19 = null;
                    duet = null;
                    str17 = null;
                    str18 = null;
                    name = null;
                    i21 = 0;
                    i22 = 0;
                    privacy = 0;
                    likeStatus = false;
                    likeCount = 0;
                    giftCount = 0;
                    commentCount = 0;
                    shareCount = 0;
                }
                if (j7 != 0) {
                    j2 |= likeStatus ? 131072L : 65536L;
                }
                boolean z18 = privacy == 0;
                if (likeStatus) {
                    context = this.f32817F.getContext();
                    i23 = R.drawable.ic_like_active;
                } else {
                    context = this.f32817F.getContext();
                    i23 = R.drawable.ic_like;
                }
                drawableM14707b = AppCompatResources.m14707b(context, i23);
                boolean z19 = i21 == 1;
                z10 = i22 == 1;
                boolean z20 = i22 == 2;
                z9 = likeCount > 0;
                z11 = giftCount > 0;
                z6 = commentCount > 0;
                z7 = shareCount > 0;
                if ((j2 & 34) != 0) {
                    j2 |= z18 ? 35184372088832L : 17592186044416L;
                }
                if ((j2 & 34) != 0) {
                    j2 |= z19 ? 8388608L : 4194304L;
                }
                if ((j2 & 34) != 0) {
                    j2 = z10 ? j2 | 32768 | 524288 : j2 | 16384 | 262144;
                }
                if ((j2 & 34) != 0) {
                    if (z20) {
                        j5 = j2 | 128;
                        j6 = 2199023255552L;
                    } else {
                        j5 = j2 | 64;
                        j6 = 1099511627776L;
                    }
                    j2 = j5 | j6;
                }
                if ((j2 & 34) != 0) {
                    j2 = z9 ? j2 | 134217728 : j2 | 67108864;
                }
                if ((j2 & 34) != 0) {
                    j2 = z11 ? j2 | 8589934592L : j2 | 4294967296L;
                }
                if ((j2 & 34) != 0) {
                    j2 = z6 ? j2 | 549755813888L : j2 | 274877906944L;
                }
                if ((j2 & 34) != 0) {
                    j2 = z7 ? j2 | 2097152 : j2 | 1048576;
                }
                User user = duet != null ? duet.getUser() : null;
                i16 = z18 ? 8 : 0;
                i15 = z19 ? 0 : 8;
                i17 = z10 ? 0 : 8;
                if (z20) {
                    resources2 = this.f32849V.getResources();
                    i24 = R.dimen.dp_44;
                } else {
                    resources2 = this.f32849V.getResources();
                    i24 = R.dimen.dp_50;
                }
                float dimension = resources2.getDimension(i24);
                i14 = z20 ? 0 : 8;
                avatar = user != null ? user.getAvatar() : null;
                String str20 = str19;
                f2 = dimension;
                str16 = str20;
            } else {
                str16 = null;
                avatar = null;
                drawableM14707b = null;
                str17 = null;
                str18 = null;
                name = null;
                i14 = 0;
                i15 = 0;
                i16 = 0;
                z9 = false;
                z10 = false;
                z11 = false;
                likeCount = 0;
                giftCount = 0;
                commentCount = 0;
                shareCount = 0;
                z6 = false;
                z7 = false;
                i17 = 0;
            }
            if ((j2 & 38) != 0) {
                User user2 = recording != null ? recording.getUser() : null;
                long j8 = j2 & 34;
                if (j8 == 0 || user2 == null) {
                    avatar2 = null;
                    fullName = null;
                } else {
                    avatar2 = user2.getAvatar();
                    fullName = user2.getFullName();
                }
                boolean followStatus = user2 != null ? user2.getFollowStatus() : false;
                if (j8 != 0) {
                    if (followStatus) {
                        j3 = j2 | 512 | 536870912;
                        j4 = 34359738368L;
                    } else {
                        j3 = j2 | 256 | 268435456;
                        j4 = 17179869184L;
                    }
                    j2 = j3 | j4;
                }
                if ((j2 & 34) != 0) {
                    if (followStatus) {
                        textView = this.f32833u;
                        i20 = R.color.black_40;
                    } else {
                        textView = this.f32833u;
                        i20 = R.color.white_light;
                    }
                    iM388d = ViewDataBinding.m388d(textView, i20);
                    drawableM14707b2 = followStatus ? AppCompatResources.m14707b(this.f32833u.getContext(), R.drawable.bg_button_gray_basic_corners) : AppCompatResources.m14707b(this.f32833u.getContext(), R.drawable.bg_button_basic_corners);
                    string = followStatus ? this.f32833u.getResources().getString(R.string.txt_following) : this.f32833u.getResources().getString(R.string.txt_follow);
                    z14 = true;
                } else {
                    i14 = i14;
                    i15 = i15;
                    string = null;
                    drawableM14707b2 = null;
                    z14 = true;
                    iM388d = 0;
                }
                z12 = followStatus == z14;
                if ((j2 & 38) != 0) {
                    j2 |= z12 ? 2048L : 1024L;
                }
            } else {
                str16 = str16;
                i14 = i14;
                i15 = i15;
                string = null;
                avatar2 = null;
                fullName = null;
                drawableM14707b2 = null;
                z12 = false;
                iM388d = 0;
            }
            long j9 = j2 & 42;
            if (j9 != 0) {
                if (recording != null) {
                    i19 = 1;
                    pin = recording.getPin();
                } else {
                    pin = 0;
                    i19 = 1;
                }
                z13 = pin == i19;
                if (j9 != 0) {
                    j2 = z13 ? j2 | 137438953472L : j2 | 68719476736L;
                }
            } else {
                z12 = z12;
                string = string;
                z13 = false;
            }
            long j10 = j2 & 35;
            if (j10 != 0) {
                boolean z21 = iM393n == (recording != null ? recording.getUserId() : 0);
                if (j10 != 0) {
                    j2 |= z21 ? 33554432L : 16777216L;
                }
                if (z21) {
                    resources = this.f32834v.getResources();
                    i18 = R.string.txt_invite;
                } else {
                    resources = this.f32834v.getResources();
                    i18 = R.string.txt_join;
                }
                string2 = resources.getString(i18);
            } else {
                string2 = null;
            }
            z2 = z13;
            i8 = i16;
            str9 = name;
            i = i17;
            i9 = i14;
            i2 = iM388d;
            z = z12;
            str6 = str16;
            i7 = shareCount;
            str4 = string2;
            i6 = commentCount;
            drawable = drawableM14707b2;
            i5 = giftCount;
            i4 = likeCount;
            i3 = i15;
            str8 = avatar2;
            f = f2;
            z3 = z9;
            str3 = fullName;
            str7 = avatar;
            str = string;
            boolean z22 = z10;
            drawable2 = drawableM14707b;
            str2 = str18;
            str5 = str17;
            z5 = z11;
            z4 = z22;
        } else {
            drawable = null;
            str = null;
            str2 = null;
            str3 = null;
            drawable2 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            z = false;
            z2 = false;
            i = 0;
            i2 = 0;
            z3 = false;
            z4 = false;
            z5 = false;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            z6 = false;
            z7 = false;
            f = 0.0f;
            i8 = 0;
            i9 = 0;
        }
        long j11 = j2 & 52;
        if (j11 != 0 && j11 != 0) {
            j2 = z17 ? j2 | 140737488355328L : j2 | 70368744177664L;
        }
        if ((j2 & 262144) != 0) {
            str10 = String.format(this.f32819H.getResources().getString(R.string.msg_play_count), Integer.valueOf(recording != null ? recording.getPlayCount() : 0));
        } else {
            drawable2 = drawable2;
            str10 = null;
        }
        boolean z23 = ((70368744178688L & j2) == 0 || (j2 & 70368744177664L) == 0) ? false : !z15;
        boolean z24 = (j2 & 137438953472L) != 0 ? !z16 : false;
        String string3 = (j2 & 134217728) != 0 ? Integer.toString(i4) : null;
        String string4 = (j2 & 2097152) != 0 ? Integer.toString(i7) : null;
        String string5 = (j2 & 549755813888L) != 0 ? Integer.toString(i6) : null;
        String string6 = (j2 & 8589934592L) != 0 ? Integer.toString(i5) : null;
        if ((j2 & 524288) != 0) {
            z8 = true;
            i10 = 0;
            str11 = String.format(this.f32819H.getResources().getString(R.string.msg_recording_duet_invite_count), Integer.valueOf(recording != null ? recording.getDuetCount() : 0));
        } else {
            z15 = z15;
            z8 = true;
            i10 = 0;
            str11 = null;
        }
        long j12 = j2 & 38;
        if (j12 == 0) {
            i11 = 0;
        } else {
            if (z) {
                z15 = true;
            }
            if (j12 != 0) {
                j2 |= z15 ? 2147483648L : 1073741824L;
            }
            if (z15) {
                i11 = 8;
            } else {
                i11 = 0;
            }
        }
        if ((j2 & 34) != 0) {
            String str21 = z4 ? str11 : str10;
            if (!z7) {
                string4 = "";
            }
            String str22 = z3 ? string3 : "";
            if (!z5) {
                string6 = "";
            }
            if (!z6) {
                string5 = "";
            }
            str13 = str22;
            str14 = string6;
            str15 = string5;
            str12 = str21;
        } else {
            str12 = null;
            str13 = null;
            str14 = null;
            str15 = null;
            string4 = null;
        }
        long j13 = j2 & 42;
        if (j13 == 0) {
            i12 = 0;
        } else {
            if (!z2) {
                z24 = false;
            }
            if (j13 != 0) {
                j2 |= z24 ? 8192L : 4096L;
            }
            if (z24) {
                i12 = 0;
            } else {
                i12 = 8;
            }
        }
        long j14 = j2 & 52;
        if (j14 != 0) {
            if (!z17) {
                z8 = z23;
            }
            if (j14 != 0) {
                j2 |= z8 ? 8796093022208L : 4398046511104L;
            }
            if (z8) {
                i10 = 8;
            }
            i13 = i10;
        } else {
            i13 = 0;
        }
        if ((j2 & 34) != 0) {
            this.f32833u.setBackground(drawable);
            this.f32833u.setTextColor(i2);
            TextViewBindingAdapter.m16406a(this.f32833u, str);
            this.f32834v.setVisibility(i);
            TextViewBindingAdapter.m16406a(this.f32813B, str15);
            TextViewBindingAdapter.m16406a(this.f32814C, str2);
            TextViewBindingAdapter.m16406a(this.f32815D, str3);
            TextViewBindingAdapter.m16406a(this.f32816E, str14);
            this.f32817F.setImageDrawable(drawable2);
            AppCompatImageView appCompatImageView = this.f32849V;
            Intrinsics2.m13089e(appCompatImageView, "view");
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            int i25 = (int) f;
            layoutParams.width = i25;
            appCompatImageView.setLayoutParams(layoutParams);
            AppCompatImageView appCompatImageView2 = this.f32849V;
            Intrinsics2.m13089e(appCompatImageView2, "view");
            ViewGroup.LayoutParams layoutParams2 = appCompatImageView2.getLayoutParams();
            layoutParams2.height = i25;
            appCompatImageView2.setLayoutParams(layoutParams2);
            SkuDao.a.m14053E(this.f32849V, str8, null, null, null, true, false, true, 0, false, null, null, null);
            int i26 = i9;
            this.f32850W.setVisibility(i26);
            SkuDao.a.m14053E(this.f32850W, str7, null, null, null, true, false, true, 0, false, null, null, null);
            this.f32851X.setVisibility(i8);
            TextViewBindingAdapter.m16406a(this.f32818G, str6);
            TextViewBindingAdapter.m16406a(this.f32819H, str12);
            TextViewBindingAdapter.m16406a(this.f32820I, str9);
            TextViewBindingAdapter.m16406a(this.f32821J, string4);
            SkuDao.a.m14053E(this.f32822K, str5, null, null, null, true, false, false, 10, false, RoundedCornersTransformation.a.LEFT, null, null);
            this.f32823L.setVisibility(i26);
            TextViewBindingAdapter.m16406a(this.f32824M, str13);
            this.f32825N.setVisibility(i3);
        }
        if ((j2 & 38) != 0) {
            this.f32833u.setVisibility(i11);
        }
        if ((35 & j2) != 0) {
            TextViewBindingAdapter.m16406a(this.f32834v, str4);
        }
        if ((j2 & 52) != 0) {
            this.f32836x.setVisibility(i13);
        }
        if ((j2 & 42) != 0) {
            this.f32852Y.setVisibility(i12);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32853Z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32853Z = 32L;
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
        if (1 == i) {
            mo14242s((Integer) obj);
            return true;
        }
        if (8 == i) {
            this.f32831T = (Recording) obj;
            synchronized (this) {
                this.f32853Z |= 2;
            }
            m16396a(8);
            m401m();
            return true;
        }
        if (5 == i) {
            mo14243t(((Boolean) obj).booleanValue());
            return true;
        }
        if (7 == i) {
            mo14245v(((Boolean) obj).booleanValue());
            return true;
        }
        if (6 != i) {
            return false;
        }
        mo14244u(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // p555j.p556a.p557a.p616i.ItemRecordingBinding
    /* JADX INFO: renamed from: s */
    public void mo14242s(Integer num) {
        this.f32830S = num;
        synchronized (this) {
            this.f32853Z |= 1;
        }
        m16396a(1);
        m401m();
    }

    @Override // p555j.p556a.p557a.p616i.ItemRecordingBinding
    /* JADX INFO: renamed from: t */
    public void mo14243t(boolean z) {
        this.f32827P = z;
        synchronized (this) {
            this.f32853Z |= 4;
        }
        m16396a(5);
        m401m();
    }

    @Override // p555j.p556a.p557a.p616i.ItemRecordingBinding
    /* JADX INFO: renamed from: u */
    public void mo14244u(boolean z) {
        this.f32828Q = z;
        synchronized (this) {
            this.f32853Z |= 16;
        }
        m16396a(6);
        m401m();
    }

    @Override // p555j.p556a.p557a.p616i.ItemRecordingBinding
    /* JADX INFO: renamed from: v */
    public void mo14245v(boolean z) {
        this.f32829R = z;
        synchronized (this) {
            this.f32853Z |= 8;
        }
        m16396a(7);
        m401m();
    }
}
