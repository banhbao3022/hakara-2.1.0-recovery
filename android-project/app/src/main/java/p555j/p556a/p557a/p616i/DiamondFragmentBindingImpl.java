package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p555j.p556a.p557a.p558a.p559a.p591s.WalletViewModel5;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.i.h, reason: use source file name */
/* JADX INFO: compiled from: DiamondFragmentBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class DiamondFragmentBindingImpl extends DiamondFragmentBinding {

    /* JADX INFO: renamed from: u */
    public static final SparseIntArray f32560u;

    /* JADX INFO: renamed from: v */
    public final LinearLayout f32561v;

    /* JADX INFO: renamed from: w */
    public final TextView f32562w;

    /* JADX INFO: renamed from: x */
    public long f32563x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32560u = sparseIntArray;
        sparseIntArray.put(R.id.progress_loading, 2);
        sparseIntArray.put(R.id.recycler_view, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DiamondFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 4, null, f32560u);
        super(dataBindingComponent, view, 1, (ProgressBar) objArrM391i[2], (RecyclerView) objArrM391i[3]);
        this.f32563x = -1L;
        LinearLayout linearLayout = (LinearLayout) objArrM391i[0];
        this.f32561v = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArrM391i[1];
        this.f32562w = textView;
        textView.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        synchronized (this) {
            j2 = this.f32563x;
            this.f32563x = 0L;
        }
        WalletViewModel5 walletViewModel5 = this.f32536t;
        long j3 = j2 & 7;
        String string = null;
        if (j3 != 0) {
            MutableLiveData<User> mutableLiveData = walletViewModel5 != null ? walletViewModel5.f31976m : null;
            m404r(0, mutableLiveData);
            User userM421d = mutableLiveData != null ? mutableLiveData.m421d() : null;
            string = Integer.toString(userM421d != null ? userM421d.getDiamonds() : 0);
        }
        if (j3 != 0) {
            TextViewBindingAdapter.m16406a(this.f32562w, string);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32563x != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32563x = 4L;
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
            this.f32563x |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (9 != i) {
            return false;
        }
        this.f32536t = (WalletViewModel5) obj;
        synchronized (this) {
            this.f32563x |= 2;
        }
        m16396a(9);
        m401m();
        return true;
    }
}
