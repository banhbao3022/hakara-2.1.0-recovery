package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.i.h3, reason: use source file name */
/* JADX INFO: compiled from: ProfileEditActivityBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ProfileEditActivityBindingImpl extends ProfileEditActivityBinding {

    /* JADX INFO: renamed from: B */
    public static final SparseIntArray f32573B;

    /* JADX INFO: renamed from: C */
    public long f32574C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32573B = sparseIntArray;
        sparseIntArray.put(R.id.appBar, 7);
        sparseIntArray.put(R.id.toolbar, 8);
        sparseIntArray.put(R.id.toolbarTitle, 9);
        sparseIntArray.put(R.id.btnSave, 10);
        sparseIntArray.put(R.id.lblFullName, 11);
        sparseIntArray.put(R.id.lblId, 12);
        sparseIntArray.put(R.id.lblBirthday, 13);
        sparseIntArray.put(R.id.lblGender, 14);
        sparseIntArray.put(R.id.lblBio, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProfileEditActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 16, null, f32573B);
        super(dataBindingComponent, view, 1, (AppBarLayout) objArrM391i[7], (TextView) objArrM391i[10], (EditText) objArrM391i[6], (EditText) objArrM391i[2], (AppCompatImageView) objArrM391i[1], (TextView) objArrM391i[15], (TextView) objArrM391i[13], (TextView) objArrM391i[11], (TextView) objArrM391i[14], (TextView) objArrM391i[12], (LinearLayout) objArrM391i[0], (Toolbar) objArrM391i[8], (TextView) objArrM391i[9], (TextView) objArrM391i[4], (TextView) objArrM391i[5], (TextView) objArrM391i[3]);
        this.f32574C = -1L;
        this.f32553t.setTag(null);
        this.f32554u.setTag(null);
        this.f32555v.setTag(null);
        this.f32556w.setTag(null);
        this.f32557x.setTag(null);
        this.f32558y.setTag(null);
        this.f32559z.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String uid;
        String bio;
        String str;
        String str2;
        String str3;
        boolean z;
        String string;
        String avatar;
        String birthday;
        String fullName;
        synchronized (this) {
            j2 = this.f32574C;
            this.f32574C = 0L;
        }
        ProfileViewModel6 profileViewModel6 = this.f32552A;
        long j3 = j2 & 7;
        int i = 0;
        if (j3 != 0) {
            MutableLiveData<User> mutableLiveData = profileViewModel6 != null ? profileViewModel6.f31515m : null;
            m404r(0, mutableLiveData);
            User userM421d = mutableLiveData != null ? mutableLiveData.m421d() : null;
            if (userM421d != null) {
                bio = userM421d.getBio();
                avatar = userM421d.getAvatar();
                birthday = userM421d.getBirthday();
                int gender = userM421d.getGender();
                fullName = userM421d.getFullName();
                uid = userM421d.getUid();
                i = gender;
            } else {
                uid = null;
                bio = null;
                avatar = null;
                birthday = null;
                fullName = null;
            }
            boolean z2 = i == 1;
            if (j3 != 0) {
                j2 = z2 ? j2 | 16 : j2 | 8;
            }
            str2 = fullName;
            boolean z3 = z2;
            str3 = avatar;
            str = birthday;
            z = z3;
        } else {
            uid = null;
            bio = null;
            str = null;
            str2 = null;
            str3 = null;
            i = 0;
            z = false;
        }
        long j4 = 8 & j2;
        if (j4 != 0) {
            boolean z4 = i == 2;
            if (j4 != 0) {
                j2 |= z4 ? 64L : 32L;
            }
            string = this.f32558y.getResources().getString(z4 ? R.string.text_gender_female : R.string.text_gender_secret);
        } else {
            string = null;
        }
        long j5 = j2 & 7;
        if (j5 == 0) {
            string = null;
        } else if (z) {
            string = this.f32558y.getResources().getString(R.string.text_gender_male);
        }
        if (j5 != 0) {
            TextViewBindingAdapter.m16406a(this.f32553t, bio);
            TextViewBindingAdapter.m16406a(this.f32554u, str2);
            AppCompatImageView appCompatImageView = this.f32555v;
            SkuDao.a.m14053E(appCompatImageView, str3, AppCompatResources.m14707b(appCompatImageView.getContext(), R.drawable.ic_avatar_default), null, null, true, false, true, 0, false, null, null, null);
            TextView textView = this.f32557x;
            Intrinsics2.m13089e(textView, "$this$birthday");
            Date dateM14093j = str != null ? SkuDao.a.m14093j(str, "yyyy-MM-dd HH:mm:ss") : null;
            if (dateM14093j != null) {
                textView.setText(new SimpleDateFormat("dd MMMM, yyyy", Locale.getDefault()).format(dateM14093j));
            }
            TextViewBindingAdapter.m16406a(this.f32558y, string);
            TextViewBindingAdapter.m16406a(this.f32559z, uid);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32574C != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32574C = 4L;
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
            this.f32574C |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (9 != i) {
            return false;
        }
        this.f32552A = (ProfileViewModel6) obj;
        synchronized (this) {
            this.f32574C |= 2;
        }
        m16396a(9);
        m401m();
        return true;
    }
}
