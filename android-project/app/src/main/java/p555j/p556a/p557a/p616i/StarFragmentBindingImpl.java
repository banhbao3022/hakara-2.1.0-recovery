package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p555j.p556a.p557a.p558a.p559a.p591s.WalletViewModel5;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.i.j4, reason: use source file name */
/* JADX INFO: compiled from: StarFragmentBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class StarFragmentBindingImpl extends StarFragmentBinding {

    /* JADX INFO: renamed from: u */
    public final LinearLayout f32626u;

    /* JADX INFO: renamed from: v */
    public final TextView f32627v;

    /* JADX INFO: renamed from: w */
    public long f32628w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        super(dataBindingComponent, view, 1);
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 2, null, null);
        this.f32628w = -1L;
        LinearLayout linearLayout = (LinearLayout) objArrM391i[0];
        this.f32626u = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArrM391i[1];
        this.f32627v = textView;
        textView.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        synchronized (this) {
            j2 = this.f32628w;
            this.f32628w = 0L;
        }
        WalletViewModel5 walletViewModel5 = this.f32612t;
        long j3 = j2 & 7;
        String string = null;
        if (j3 != 0) {
            MutableLiveData<User> mutableLiveData = walletViewModel5 != null ? walletViewModel5.f31976m : null;
            m404r(0, mutableLiveData);
            User userM421d = mutableLiveData != null ? mutableLiveData.m421d() : null;
            string = Integer.toString(userM421d != null ? userM421d.getStars() : 0);
        }
        if (j3 != 0) {
            TextViewBindingAdapter.m16406a(this.f32627v, string);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32628w != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32628w = 4L;
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
            this.f32628w |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (9 != i) {
            return false;
        }
        this.f32612t = (WalletViewModel5) obj;
        synchronized (this) {
            this.f32628w |= 2;
        }
        m16396a(9);
        m401m();
        return true;
    }
}
