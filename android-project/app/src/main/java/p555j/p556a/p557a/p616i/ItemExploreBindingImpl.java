package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Simple3;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.b1, reason: use source file name */
/* JADX INFO: compiled from: ItemExploreBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemExploreBindingImpl extends ItemExploreBinding {

    /* JADX INFO: renamed from: y */
    public static final SparseIntArray f32421y;

    /* JADX INFO: renamed from: A */
    public final TextView f32422A;

    /* JADX INFO: renamed from: B */
    public long f32423B;

    /* JADX INFO: renamed from: z */
    public final LinearLayout f32424z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32421y = sparseIntArray;
        sparseIntArray.put(R.id.btnViewAll, 2);
        sparseIntArray.put(R.id.recyclerRecording, 3);
        sparseIntArray.put(R.id.progressBar, 4);
        sparseIntArray.put(R.id.dim, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemExploreBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 6, null, f32421y);
        super(dataBindingComponent, view, 0, (LinearLayout) objArrM391i[2], (View) objArrM391i[5], (ProgressBar) objArrM391i[4], (RecyclerView) objArrM391i[3]);
        this.f32423B = -1L;
        LinearLayout linearLayout = (LinearLayout) objArrM391i[0];
        this.f32424z = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArrM391i[1];
        this.f32422A = textView;
        textView.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        synchronized (this) {
            j2 = this.f32423B;
            this.f32423B = 0L;
        }
        String name = null;
        Simple3 simple3 = this.f32389x;
        long j3 = j2 & 3;
        if (j3 != 0 && simple3 != null) {
            name = simple3.getName();
        }
        if (j3 != 0) {
            TextViewBindingAdapter.m16406a(this.f32422A, name);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32423B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32423B = 2L;
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
        this.f32389x = (Simple3) obj;
        synchronized (this) {
            this.f32423B |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
