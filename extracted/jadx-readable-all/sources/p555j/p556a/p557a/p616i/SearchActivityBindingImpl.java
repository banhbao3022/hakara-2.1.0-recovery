package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import me.gujun.android.taggroup.TagGroup;
import mtp.media.karaoke.R;
import p555j.p556a.p557a.p558a.p559a.p585o.SearchViewModel7;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: renamed from: j.a.a.i.r3, reason: use source file name */
/* JADX INFO: compiled from: SearchActivityBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class SearchActivityBindingImpl extends SearchActivityBinding {

    /* JADX INFO: renamed from: w */
    public static final SparseIntArray f32798w;

    /* JADX INFO: renamed from: x */
    public final LinearLayout f32799x;

    /* JADX INFO: renamed from: y */
    public final RelativeLayout f32800y;

    /* JADX INFO: renamed from: z */
    public long f32801z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32798w = sparseIntArray;
        sparseIntArray.put(R.id.searchContainer, 3);
        sparseIntArray.put(R.id.toolbar, 4);
        sparseIntArray.put(R.id.layoutSearchPage, 5);
        sparseIntArray.put(R.id.headerRecent, 6);
        sparseIntArray.put(R.id.btnTrashRecent, 7);
        sparseIntArray.put(R.id.headerTrending, 8);
        sparseIntArray.put(R.id.tagGroup, 9);
        sparseIntArray.put(R.id.recyclerSuggest, 10);
        sparseIntArray.put(R.id.toolbarLine, 11);
        sparseIntArray.put(R.id.searchResultLayout, 12);
        sparseIntArray.put(R.id.tabs, 13);
        sparseIntArray.put(R.id.pages, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 15, null, f32798w);
        super(dataBindingComponent, view, 0, (ImageButton) objArrM391i[7], (TextView) objArrM391i[6], (TextView) objArrM391i[8], (LinearLayout) objArrM391i[5], (ViewPager2) objArrM391i[14], (RecyclerView) objArrM391i[10], (CoordinatorLayout) objArrM391i[3], (LinearLayout) objArrM391i[12], (TabLayout) objArrM391i[13], (TagGroup) objArrM391i[9], (TagGroup) objArrM391i[2], (Toolbar) objArrM391i[4], (View) objArrM391i[11]);
        this.f32801z = -1L;
        LinearLayout linearLayout = (LinearLayout) objArrM391i[0];
        this.f32799x = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArrM391i[1];
        this.f32800y = relativeLayout;
        relativeLayout.setTag(null);
        this.f32771t.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        synchronized (this) {
            j2 = this.f32801z;
            this.f32801z = 0L;
        }
        SearchViewModel7 searchViewModel7 = this.f32773v;
        long j3 = j2 & 3;
        int i = 0;
        if (j3 != 0) {
            boolean z = searchViewModel7 != null ? searchViewModel7.f31734p : false;
            if (j3 != 0) {
                j2 |= z ? 8L : 4L;
            }
            if (!z) {
                i = 8;
            }
        }
        if ((j2 & 3) != 0) {
            this.f32800y.setVisibility(i);
            this.f32771t.setVisibility(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32801z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32801z = 2L;
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
        if (9 != i) {
            return false;
        }
        this.f32773v = (SearchViewModel7) obj;
        synchronized (this) {
            this.f32801z |= 1;
        }
        m16396a(9);
        m401m();
        return true;
    }
}
