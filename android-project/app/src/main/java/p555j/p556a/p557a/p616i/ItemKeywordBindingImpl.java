package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Keyword;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.l1, reason: use source file name */
/* JADX INFO: compiled from: ItemKeywordBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemKeywordBindingImpl extends ItemKeywordBinding {

    /* JADX INFO: renamed from: v */
    public static final SparseIntArray f32653v;

    /* JADX INFO: renamed from: w */
    public final LinearLayout f32654w;

    /* JADX INFO: renamed from: x */
    public long f32655x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32653v = sparseIntArray;
        sparseIntArray.put(R.id.card_view, 2);
        sparseIntArray.put(R.id.keyword_icon, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemKeywordBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 4, null, f32653v);
        super(dataBindingComponent, view, 0, (CardView) objArrM391i[2], (ImageView) objArrM391i[3], (TextView) objArrM391i[1]);
        this.f32655x = -1L;
        this.f32632t.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArrM391i[0];
        this.f32654w = linearLayout;
        linearLayout.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        synchronized (this) {
            j2 = this.f32655x;
            this.f32655x = 0L;
        }
        String name = null;
        Keyword keyword = this.f32633u;
        long j3 = j2 & 3;
        if (j3 != 0 && keyword != null) {
            name = keyword.getName();
        }
        if (j3 != 0) {
            TextViewBindingAdapter.m16406a(this.f32632t, name);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32655x != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32655x = 2L;
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
        this.f32633u = (Keyword) obj;
        synchronized (this) {
            this.f32655x |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
