package p555j.p556a.p557a.p616i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p007c.p071d.p078c.p079a.outline;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.i.j3, reason: use source file name */
/* JADX INFO: compiled from: ProfileFragmentBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ProfileFragmentBindingImpl extends ProfileFragmentBinding {

    /* JADX INFO: renamed from: I */
    public static final SparseIntArray f32623I;

    /* JADX INFO: renamed from: J */
    public final TextView f32624J;

    /* JADX INFO: renamed from: K */
    public long f32625K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32623I = sparseIntArray;
        sparseIntArray.put(R.id.container, 14);
        sparseIntArray.put(R.id.profileAppBarLayout, 15);
        sparseIntArray.put(R.id.collapsingToolbar, 16);
        sparseIntArray.put(R.id.linearLayout8, 17);
        sparseIntArray.put(R.id.btnViewFollower, 18);
        sparseIntArray.put(R.id.btnViewFollowing, 19);
        sparseIntArray.put(R.id.btnViewGifts, 20);
        sparseIntArray.put(R.id.btnPlayCount, 21);
        sparseIntArray.put(R.id.actionIconLayout, 22);
        sparseIntArray.put(R.id.btnTask, 23);
        sparseIntArray.put(R.id.btnWallet, 24);
        sparseIntArray.put(R.id.btnViewImage, 25);
        sparseIntArray.put(R.id.profileToolbar, 26);
        sparseIntArray.put(R.id.toolbarLayout, 27);
        sparseIntArray.put(R.id.btnMore, 28);
        sparseIntArray.put(R.id.btnSetting, 29);
        sparseIntArray.put(R.id.f33394eq, 30);
        sparseIntArray.put(R.id.toolbarLine, 31);
        sparseIntArray.put(R.id.tabs, 32);
        sparseIntArray.put(R.id.pages, 33);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProfileFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 34, null, f32623I);
        super(dataBindingComponent, view, 2, (ConstraintLayout) objArrM391i[22], (AppCompatImageView) objArrM391i[2], (ImageView) objArrM391i[12], (TextView) objArrM391i[7], (ImageView) objArrM391i[28], (LinearLayout) objArrM391i[21], (ImageView) objArrM391i[29], (LinearLayout) objArrM391i[23], (LinearLayout) objArrM391i[18], (LinearLayout) objArrM391i[19], (LinearLayout) objArrM391i[20], (LinearLayout) objArrM391i[25], (LinearLayout) objArrM391i[24], (CollapsingToolbarLayout) objArrM391i[16], (CoordinatorLayout) objArrM391i[14], (AppCompatImageView) objArrM391i[1], (LottieAnimationView) objArrM391i[30], (TextView) objArrM391i[4], (TextView) objArrM391i[6], (LinearLayout) objArrM391i[17], (TextView) objArrM391i[3], (ViewPager2) objArrM391i[33], (AppBarLayout) objArrM391i[15], (TextView) objArrM391i[8], (TextView) objArrM391i[9], (TextView) objArrM391i[10], (Toolbar) objArrM391i[26], (SwipeRefreshLayout) objArrM391i[0], (TabLayout) objArrM391i[32], (LinearLayout) objArrM391i[27], (View) objArrM391i[31], (TextView) objArrM391i[13], (TextView) objArrM391i[5]);
        this.f32625K = -1L;
        this.f32605t.setTag(null);
        this.f32606u.setTag(null);
        this.f32607v.setTag(null);
        this.f32608w.setTag(null);
        this.f32609x.setTag(null);
        this.f32610y.setTag(null);
        TextView textView = (TextView) objArrM391i[11];
        this.f32624J = textView;
        textView.setTag(null);
        this.f32611z.setTag(null);
        this.f32597A.setTag(null);
        this.f32598B.setTag(null);
        this.f32599C.setTag(null);
        this.f32600D.setTag(null);
        this.f32602F.setTag(null);
        this.f32603G.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x021b  */
    /* JADX WARN: Code duplicated, block: B:127:0x022b  */
    /* JADX WARN: Code duplicated, block: B:130:0x023b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0245  */
    /* JADX WARN: Code duplicated, block: B:134:0x0252 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x0255  */
    /* JADX WARN: Code duplicated, block: B:137:0x0258  */
    /* JADX WARN: Code duplicated, block: B:139:0x025b  */
    /* JADX WARN: Code duplicated, block: B:140:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        MutableLiveData<User> mutableLiveData;
        User userM421d;
        boolean zM394o;
        Drawable drawableM14707b;
        String string;
        boolean z;
        String bio;
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String string2;
        Drawable drawableM14707b2;
        int iM388d;
        String strM1599u;
        long j3;
        long j4;
        Resources resources;
        int i6;
        String fullName;
        String avatar;
        int followerCount;
        int playCount;
        int followingCount;
        int giftCount;
        int level;
        String cover;
        long j5;
        long j6;
        synchronized (this) {
            j2 = this.f32625K;
            this.f32625K = 0L;
        }
        ProfileViewModel6 profileViewModel6 = this.f32604H;
        if ((j2 & 15) != 0) {
            long j7 = j2 & 13;
            if (j7 != 0) {
                mutableLiveData = profileViewModel6 != null ? profileViewModel6.f31515m : null;
                m404r(0, mutableLiveData);
                userM421d = mutableLiveData != null ? mutableLiveData.m421d() : null;
                if (userM421d != null) {
                    bio = userM421d.getBio();
                    fullName = userM421d.getFullName();
                    avatar = userM421d.getAvatar();
                    followerCount = userM421d.getFollowerCount();
                    playCount = userM421d.getPlayCount();
                    followingCount = userM421d.getFollowingCount();
                    giftCount = userM421d.getGiftCount();
                    level = userM421d.getLevel();
                    cover = userM421d.getCover();
                } else {
                    bio = null;
                    fullName = null;
                    avatar = null;
                    followerCount = 0;
                    playCount = 0;
                    followingCount = 0;
                    giftCount = 0;
                    level = 0;
                    cover = null;
                }
                z = userM421d != null;
                if (j7 != 0) {
                    j2 = z ? j2 | 524288 : j2 | 262144;
                }
                string = Integer.toString(level);
            } else {
                mutableLiveData = null;
                userM421d = null;
                string = null;
                bio = null;
                fullName = null;
                avatar = null;
                followerCount = 0;
                playCount = 0;
                followingCount = 0;
                giftCount = 0;
                level = 0;
                cover = null;
                z = false;
            }
            MutableLiveData<Boolean> mutableLiveData2 = profileViewModel6 != null ? profileViewModel6.f31514l : null;
            m404r(1, mutableLiveData2);
            zM394o = ViewDataBinding.m394o(mutableLiveData2 != null ? mutableLiveData2.m421d() : null);
            if ((15 & j2) != 0) {
                if (zM394o) {
                    j5 = j2 | 128 | 8192;
                    j6 = 131072;
                } else {
                    j5 = j2 | 64 | 4096;
                    j6 = 65536;
                }
                j2 = j5 | j6;
            }
            if ((j2 & 14) != 0) {
                j2 |= zM394o ? 32768L : 16384L;
            }
            if ((j2 & 14) != 0) {
                drawableM14707b = AppCompatResources.m14707b(this.f32606u.getContext(), zM394o ? R.drawable.ic_arrow_back_white_24dp : R.drawable.ic_add_friend);
            } else {
                drawableM14707b = null;
            }
            str = fullName;
            str2 = avatar;
            i = followerCount;
            i2 = playCount;
            i3 = followingCount;
            i4 = giftCount;
            i5 = level;
            str3 = cover;
        } else {
            mutableLiveData = null;
            userM421d = null;
            zM394o = false;
            drawableM14707b = null;
            string = null;
            z = false;
            bio = null;
            str = null;
            str2 = null;
            str3 = null;
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        long j8 = j2 & 663680;
        int i7 = R.drawable.bg_button_gray_basic_corners;
        if (j8 != 0) {
            if (profileViewModel6 != null) {
                mutableLiveData = profileViewModel6.f31515m;
            }
            m404r(0, mutableLiveData);
            if (mutableLiveData != null) {
                userM421d = mutableLiveData.m421d();
            }
            if ((j2 & 139392) != 0) {
                boolean followStatus = userM421d != null ? userM421d.getFollowStatus() : false;
                if ((j2 & 128) != 0) {
                    j2 |= followStatus ? 32L : 16L;
                }
                if ((j2 & 131072) != 0) {
                    j2 |= followStatus ? 512L : 256L;
                }
                if ((j2 & 8192) != 0) {
                    j2 |= followStatus ? 2048L : 1024L;
                }
                if ((j2 & 128) != 0) {
                    Context context = this.f32607v.getContext();
                    if (!followStatus) {
                        i7 = R.drawable.bg_button_basic_corners;
                    }
                    drawableM14707b2 = AppCompatResources.m14707b(context, i7);
                } else {
                    drawableM14707b2 = null;
                }
                if ((j2 & 131072) != 0) {
                    iM388d = ViewDataBinding.m388d(this.f32607v, followStatus ? R.color.black_60 : R.color.white_light);
                } else {
                    iM388d = 0;
                }
                if ((j2 & 8192) != 0) {
                    if (followStatus) {
                        resources = this.f32607v.getResources();
                        i6 = R.string.txt_following;
                    } else {
                        resources = this.f32607v.getResources();
                        i6 = R.string.txt_follow;
                    }
                    string2 = resources.getString(i6);
                } else {
                    string2 = null;
                }
            } else {
                string2 = null;
                drawableM14707b2 = null;
                iM388d = 0;
            }
            if ((524288 & j2) != 0) {
                strM1599u = outline.m1599u("ID: ", userM421d != null ? userM421d.getUid() : null);
            }
            j3 = j2 & 15;
            if (j3 != 0) {
                if (!zM394o) {
                    drawableM14707b2 = AppCompatResources.m14707b(this.f32607v.getContext(), R.drawable.bg_button_gray_basic_corners);
                }
                if (!zM394o) {
                    string2 = this.f32607v.getResources().getString(R.string.txt_edit);
                }
                if (!zM394o) {
                    iM388d = ViewDataBinding.m388d(this.f32607v, R.color.black_70);
                }
            } else {
                string2 = null;
                iM388d = 0;
                drawableM14707b2 = null;
            }
            j4 = j2 & 13;
            if (j4 != 0) {
                strM1599u = null;
            } else if (!z) {
                strM1599u = "";
            }
            if (j4 != 0) {
                AppCompatImageView appCompatImageView = this.f32605t;
                SkuDao.a.m14053E(appCompatImageView, str2, AppCompatResources.m14707b(appCompatImageView.getContext(), R.drawable.ic_avatar_default), null, null, true, false, true, 0, false, null, null, null);
                SkuDao.a.m14053E(this.f32608w, str3, null, null, null, false, false, false, 0, false, null, null, null);
                TextViewBindingAdapter.m16406a(this.f32609x, str);
                SkuDao.a.m14051C(this.f32610y, i5);
                TextViewBindingAdapter.m16406a(this.f32610y, string);
                SkuDao.a.m14060L(this.f32624J, i2);
                TextViewBindingAdapter.m16406a(this.f32611z, bio);
                SkuDao.a.m14060L(this.f32597A, i);
                SkuDao.a.m14060L(this.f32598B, i3);
                SkuDao.a.m14060L(this.f32599C, i4);
                TextViewBindingAdapter.m16406a(this.f32602F, str);
                TextViewBindingAdapter.m16406a(this.f32603G, strM1599u);
            }
            if ((j2 & 14) != 0) {
                this.f32606u.setImageDrawable(drawableM14707b);
            }
            if (j3 != 0) {
                this.f32607v.setBackground(drawableM14707b2);
                TextViewBindingAdapter.m16406a(this.f32607v, string2);
                this.f32607v.setTextColor(iM388d);
            }
        }
        string2 = null;
        drawableM14707b2 = null;
        iM388d = 0;
        strM1599u = null;
        j3 = j2 & 15;
        if (j3 != 0) {
            if (!zM394o) {
                drawableM14707b2 = AppCompatResources.m14707b(this.f32607v.getContext(), R.drawable.bg_button_gray_basic_corners);
            }
            if (!zM394o) {
                string2 = this.f32607v.getResources().getString(R.string.txt_edit);
            }
            if (!zM394o) {
                iM388d = ViewDataBinding.m388d(this.f32607v, R.color.black_70);
            }
        } else {
            string2 = null;
            iM388d = 0;
            drawableM14707b2 = null;
        }
        j4 = j2 & 13;
        if (j4 != 0) {
            strM1599u = null;
        } else if (!z) {
            strM1599u = "";
        }
        if (j4 != 0) {
            AppCompatImageView appCompatImageView2 = this.f32605t;
            SkuDao.a.m14053E(appCompatImageView2, str2, AppCompatResources.m14707b(appCompatImageView2.getContext(), R.drawable.ic_avatar_default), null, null, true, false, true, 0, false, null, null, null);
            SkuDao.a.m14053E(this.f32608w, str3, null, null, null, false, false, false, 0, false, null, null, null);
            TextViewBindingAdapter.m16406a(this.f32609x, str);
            SkuDao.a.m14051C(this.f32610y, i5);
            TextViewBindingAdapter.m16406a(this.f32610y, string);
            SkuDao.a.m14060L(this.f32624J, i2);
            TextViewBindingAdapter.m16406a(this.f32611z, bio);
            SkuDao.a.m14060L(this.f32597A, i);
            SkuDao.a.m14060L(this.f32598B, i3);
            SkuDao.a.m14060L(this.f32599C, i4);
            TextViewBindingAdapter.m16406a(this.f32602F, str);
            TextViewBindingAdapter.m16406a(this.f32603G, strM1599u);
        }
        if ((j2 & 14) != 0) {
            this.f32606u.setImageDrawable(drawableM14707b);
        }
        if (j3 != 0) {
            this.f32607v.setBackground(drawableM14707b2);
            TextViewBindingAdapter.m16406a(this.f32607v, string2);
            this.f32607v.setTextColor(iM388d);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32625K != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32625K = 8L;
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
                this.f32625K |= 1;
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.f32625K |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (9 != i) {
            return false;
        }
        this.f32604H = (ProfileViewModel6) obj;
        synchronized (this) {
            this.f32625K |= 4;
        }
        m16396a(9);
        m401m();
        return true;
    }
}
