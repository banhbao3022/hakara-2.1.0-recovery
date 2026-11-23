package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p007c.p071d.p078c.p079a.outline;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.i.r2, reason: use source file name */
/* JADX INFO: compiled from: LevelActivityBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class LevelActivityBindingImpl extends LevelActivityBinding {

    /* JADX INFO: renamed from: x */
    public static final SparseIntArray f32790x;

    /* JADX INFO: renamed from: A */
    public final TextView f32791A;

    /* JADX INFO: renamed from: B */
    public final TextView f32792B;

    /* JADX INFO: renamed from: C */
    public final TextView f32793C;

    /* JADX INFO: renamed from: D */
    public final TextView f32794D;

    /* JADX INFO: renamed from: E */
    public long f32795E;

    /* JADX INFO: renamed from: y */
    public final ConstraintLayout f32796y;

    /* JADX INFO: renamed from: z */
    public final AppCompatImageView f32797z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32790x = sparseIntArray;
        sparseIntArray.put(R.id.imageView3, 9);
        sparseIntArray.put(R.id.appBar, 10);
        sparseIntArray.put(R.id.toolbar, 11);
        sparseIntArray.put(R.id.linearLayout6, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LevelActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 13, null, f32790x);
        super(dataBindingComponent, view, 1, (AppBarLayout) objArrM391i[10], (TextView) objArrM391i[6], (ImageView) objArrM391i[9], (LinearLayout) objArrM391i[12], (ProgressBar) objArrM391i[5], (TextView) objArrM391i[4], (Toolbar) objArrM391i[11]);
        this.f32795E = -1L;
        this.f32767t.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrM391i[0];
        this.f32796y = constraintLayout;
        constraintLayout.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArrM391i[1];
        this.f32797z = appCompatImageView;
        appCompatImageView.setTag(null);
        TextView textView = (TextView) objArrM391i[2];
        this.f32791A = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArrM391i[3];
        this.f32792B = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArrM391i[7];
        this.f32793C = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArrM391i[8];
        this.f32794D = textView4;
        textView4.setTag(null);
        this.f32768u.setTag(null);
        this.f32769v.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        int nextLevelExps;
        int exps;
        boolean z;
        String str;
        String str2;
        String strM1590l;
        String string;
        String strM1590l2;
        String str3;
        long j3;
        long j4;
        int i;
        int level;
        synchronized (this) {
            j2 = this.f32795E;
            this.f32795E = 0L;
        }
        ProfileViewModel6 profileViewModel6 = this.f32770w;
        long j5 = 7 & j2;
        User user = null;
        int i2 = 0;
        if (j5 != 0) {
            MutableLiveData<User> mutableLiveData = profileViewModel6 != null ? profileViewModel6.f31515m : null;
            m404r(0, mutableLiveData);
            User userM421d = mutableLiveData != null ? mutableLiveData.m421d() : null;
            if (userM421d != null) {
                String avatar = userM421d.getAvatar();
                nextLevelExps = userM421d.getNextLevelExps();
                level = userM421d.getLevel();
                exps = userM421d.getExps();
                user = avatar;
            } else {
                nextLevelExps = 0;
                level = 0;
                exps = 0;
            }
            z = nextLevelExps > 0;
            string = Integer.toString(nextLevelExps);
            strM1590l2 = outline.m1590l("Lv.", level);
            int i3 = level + 1;
            String string2 = Integer.toString(exps);
            int i4 = nextLevelExps - exps;
            if (j5 != 0) {
                j2 = z ? j2 | 16 : j2 | 8;
            }
            strM1590l = outline.m1590l("Lv.", i3);
            str2 = String.format(this.f32792B.getResources().getString(R.string.msg_how_to_next_level), Integer.valueOf(i4), Integer.valueOf(i3));
            str3 = user;
            j3 = 16;
            user = userM421d;
            str = string2;
        } else {
            nextLevelExps = 0;
            exps = 0;
            z = false;
            str = null;
            str2 = null;
            strM1590l = null;
            string = null;
            strM1590l2 = null;
            str3 = 0;
            j3 = 16;
        }
        if ((j3 & j2) != 0) {
            int currentLevelExps = user != null ? user.getCurrentLevelExps() : 0;
            i = ((exps - currentLevelExps) * 100) / (nextLevelExps - currentLevelExps);
            j4 = 7;
        } else {
            j4 = 7;
            i = 0;
        }
        long j6 = j2 & j4;
        if (j6 != 0 && z) {
            i2 = i;
        }
        if (j6 != 0) {
            TextViewBindingAdapter.m16406a(this.f32767t, strM1590l);
            AppCompatImageView appCompatImageView = this.f32797z;
            SkuDao.a.m14053E(appCompatImageView, str3, AppCompatResources.m14707b(appCompatImageView.getContext(), R.drawable.ic_avatar_default), null, null, true, false, true, 0, false, null, null, null);
            TextViewBindingAdapter.m16406a(this.f32791A, strM1590l2);
            TextViewBindingAdapter.m16406a(this.f32792B, str2);
            TextViewBindingAdapter.m16406a(this.f32793C, str);
            TextViewBindingAdapter.m16406a(this.f32794D, string);
            this.f32768u.setProgress(i2);
            TextViewBindingAdapter.m16406a(this.f32769v, strM1590l2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32795E != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32795E = 4L;
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
            this.f32795E |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (9 != i) {
            return false;
        }
        this.f32770w = (ProfileViewModel6) obj;
        synchronized (this) {
            this.f32795E |= 2;
        }
        m16396a(9);
        m401m();
        return true;
    }
}
