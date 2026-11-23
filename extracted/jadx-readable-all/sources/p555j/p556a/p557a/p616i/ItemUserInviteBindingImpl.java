package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.l2, reason: use source file name */
/* JADX INFO: compiled from: ItemUserInviteBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemUserInviteBindingImpl extends ItemUserInviteBinding {

    /* JADX INFO: renamed from: y */
    public static final SparseIntArray f32656y;

    /* JADX INFO: renamed from: A */
    public final TextView f32657A;

    /* JADX INFO: renamed from: B */
    public long f32658B;

    /* JADX INFO: renamed from: z */
    public final CardView f32659z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32656y = sparseIntArray;
        sparseIntArray.put(R.id.rootView, 4);
        sparseIntArray.put(R.id.iconChecked, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemUserInviteBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 6, null, f32656y);
        super(dataBindingComponent, view, 0, (TextView) objArrM391i[2], (AppCompatImageView) objArrM391i[5], (RelativeLayout) objArrM391i[4], (AppCompatImageView) objArrM391i[1]);
        this.f32658B = -1L;
        this.f32634t.setTag(null);
        CardView cardView = (CardView) objArrM391i[0];
        this.f32659z = cardView;
        cardView.setTag(null);
        TextView textView = (TextView) objArrM391i[3];
        this.f32657A = textView;
        textView.setTag(null);
        this.f32637w.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String label;
        String str;
        synchronized (this) {
            j2 = this.f32658B;
            this.f32658B = 0L;
        }
        User user = this.f32638x;
        long j3 = j2 & 3;
        String str2 = null;
        if (j3 == 0 || user == null) {
            label = null;
            str = null;
        } else {
            String avatar = user.getAvatar();
            String fullName = user.getFullName();
            label = user.getLabel();
            str = avatar;
            str2 = fullName;
        }
        if (j3 != 0) {
            TextViewBindingAdapter.m16406a(this.f32634t, str2);
            TextViewBindingAdapter.m16406a(this.f32657A, label);
            SkuDao.a.m14053E(this.f32637w, str, null, null, null, true, false, true, 0, false, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32658B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32658B = 2L;
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
        this.f32638x = (User) obj;
        synchronized (this) {
            this.f32658B |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
