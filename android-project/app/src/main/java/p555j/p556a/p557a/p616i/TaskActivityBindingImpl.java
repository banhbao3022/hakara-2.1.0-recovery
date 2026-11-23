package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.i.l4, reason: use source file name */
/* JADX INFO: compiled from: TaskActivityBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class TaskActivityBindingImpl extends TaskActivityBinding {

    /* JADX INFO: renamed from: x */
    public static final SparseIntArray f32662x;

    /* JADX INFO: renamed from: A */
    public final TextView f32663A;

    /* JADX INFO: renamed from: B */
    public long f32664B;

    /* JADX INFO: renamed from: y */
    public final LinearLayout f32665y;

    /* JADX INFO: renamed from: z */
    public final TextView f32666z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32662x = sparseIntArray;
        sparseIntArray.put(R.id.appBar, 5);
        sparseIntArray.put(R.id.toolbar, 6);
        sparseIntArray.put(R.id.toolbarLine, 7);
        sparseIntArray.put(R.id.abcddddd, 8);
        sparseIntArray.put(R.id.container, 9);
        sparseIntArray.put(R.id.recycler_view, 10);
        sparseIntArray.put(R.id.progress_loading, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TaskActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 12, null, f32662x);
        super(dataBindingComponent, view, 1, (LinearLayout) objArrM391i[8], (AppBarLayout) objArrM391i[5], (AppCompatImageView) objArrM391i[1], (RelativeLayout) objArrM391i[9], (ProgressBar) objArrM391i[11], (RecyclerView) objArrM391i[10], (Toolbar) objArrM391i[6], (View) objArrM391i[7], (TextView) objArrM391i[2]);
        this.f32664B = -1L;
        this.f32644t.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArrM391i[0];
        this.f32665y = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArrM391i[3];
        this.f32666z = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArrM391i[4];
        this.f32663A = textView2;
        textView2.setTag(null);
        this.f32646v.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String fullName;
        String string;
        String str;
        int diamonds;
        synchronized (this) {
            j2 = this.f32664B;
            this.f32664B = 0L;
        }
        ProfileViewModel6 profileViewModel6 = this.f32647w;
        long j3 = j2 & 7;
        String string2 = null;
        if (j3 != 0) {
            MutableLiveData<User> mutableLiveData = profileViewModel6 != null ? profileViewModel6.f31515m : null;
            int coins = 0;
            m404r(0, mutableLiveData);
            User userM421d = mutableLiveData != null ? mutableLiveData.m421d() : null;
            if (userM421d != null) {
                coins = userM421d.getCoins();
                String avatar = userM421d.getAvatar();
                diamonds = userM421d.getDiamonds();
                fullName = userM421d.getFullName();
                string2 = avatar;
            } else {
                fullName = null;
                diamonds = 0;
            }
            string = Integer.toString(coins);
            str = string2;
            string2 = Integer.toString(diamonds);
        } else {
            fullName = null;
            string = null;
            str = null;
        }
        if (j3 != 0) {
            SkuDao.a.m14053E(this.f32644t, str, null, null, null, true, false, true, 0, false, null, null, null);
            TextViewBindingAdapter.m16406a(this.f32666z, string2);
            TextViewBindingAdapter.m16406a(this.f32663A, string);
            TextViewBindingAdapter.m16406a(this.f32646v, fullName);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32664B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32664B = 4L;
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
            this.f32664B |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (9 != i) {
            return false;
        }
        this.f32647w = (ProfileViewModel6) obj;
        synchronized (this) {
            this.f32664B |= 2;
        }
        m16396a(9);
        m401m();
        return true;
    }
}
