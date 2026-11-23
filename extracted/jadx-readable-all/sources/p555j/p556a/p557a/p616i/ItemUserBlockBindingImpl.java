package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p007c.p071d.p078c.p079a.outline;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.j2, reason: use source file name */
/* JADX INFO: compiled from: ItemUserBlockBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemUserBlockBindingImpl extends ItemUserBlockBinding {

    /* JADX INFO: renamed from: x */
    public static final SparseIntArray f32619x;

    /* JADX INFO: renamed from: A */
    public long f32620A;

    /* JADX INFO: renamed from: y */
    public final CardView f32621y;

    /* JADX INFO: renamed from: z */
    public final TextView f32622z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32619x = sparseIntArray;
        sparseIntArray.put(R.id.btnUnblock, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemUserBlockBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 5, null, f32619x);
        super(dataBindingComponent, view, 0, (TextView) objArrM391i[4], (TextView) objArrM391i[2], (AppCompatImageView) objArrM391i[1]);
        this.f32620A = -1L;
        this.f32594u.setTag(null);
        CardView cardView = (CardView) objArrM391i[0];
        this.f32621y = cardView;
        cardView.setTag(null);
        TextView textView = (TextView) objArrM391i[3];
        this.f32622z = textView;
        textView.setTag(null);
        this.f32595v.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String strM1599u;
        String str;
        String str2;
        String fullName;
        synchronized (this) {
            j2 = this.f32620A;
            this.f32620A = 0L;
        }
        User user = this.f32596w;
        long j3 = j2 & 3;
        String uid = null;
        if (j3 != 0) {
            if (user != null) {
                String avatar = user.getAvatar();
                fullName = user.getFullName();
                uid = user.getUid();
                str2 = avatar;
            } else {
                str2 = null;
                fullName = null;
            }
            str = str2;
            strM1599u = outline.m1599u("ID: ", uid);
            uid = fullName;
        } else {
            strM1599u = null;
            str = null;
        }
        if (j3 != 0) {
            TextViewBindingAdapter.m16406a(this.f32594u, uid);
            TextViewBindingAdapter.m16406a(this.f32622z, strM1599u);
            SkuDao.a.m14053E(this.f32595v, str, null, null, null, true, false, true, 0, false, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32620A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32620A = 2L;
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
        this.f32596w = (User) obj;
        synchronized (this) {
            this.f32620A |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
