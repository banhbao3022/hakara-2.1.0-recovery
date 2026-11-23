package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;
import p555j.p556a.p557a.p558a.p596f.EndlessRecyclerOnScrollListener;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p748n.DataBindingComponent;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.i.r, reason: use source file name */
/* JADX INFO: compiled from: DuetOwnerActivityBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class DuetOwnerActivityBindingImpl extends DuetOwnerActivityBinding {

    /* JADX INFO: renamed from: A */
    public static final SparseIntArray f32780A;

    /* JADX INFO: renamed from: B */
    public final LinearLayout f32781B;

    /* JADX INFO: renamed from: C */
    public long f32782C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32780A = sparseIntArray;
        sparseIntArray.put(R.id.appBar, 6);
        sparseIntArray.put(R.id.toolbar, 7);
        sparseIntArray.put(R.id.toolbarLine, 8);
        sparseIntArray.put(R.id.duetAvatar, 9);
        sparseIntArray.put(R.id.txtFullName, 10);
        sparseIntArray.put(R.id.lblLevel, 11);
        sparseIntArray.put(R.id.txtMessage, 12);
        sparseIntArray.put(R.id.btnJoin, 13);
        sparseIntArray.put(R.id.lblCountDuet, 14);
        sparseIntArray.put(R.id.container, 15);
        sparseIntArray.put(R.id.statusView, 16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DuetOwnerActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 17, null, f32780A);
        super(dataBindingComponent, view, 3, (AppBarLayout) objArrM391i[6], (AppCompatImageView) objArrM391i[1], (TextView) objArrM391i[13], (ConstraintLayout) objArrM391i[15], (AppCompatImageView) objArrM391i[9], (TextView) objArrM391i[14], (TextView) objArrM391i[11], (ProgressBar) objArrM391i[2], (ProgressBar) objArrM391i[5], (RecyclerView) objArrM391i[4], (SwipeRefreshLayout) objArrM391i[3], (BackgroundMessageView) objArrM391i[16], (Toolbar) objArrM391i[7], (View) objArrM391i[8], (TextView) objArrM391i[10], (TextView) objArrM391i[12]);
        this.f32782C = -1L;
        this.f32751t.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArrM391i[0];
        this.f32781B = linearLayout;
        linearLayout.setTag(null);
        this.f32752u.setTag(null);
        this.f32753v.setTag(null);
        this.f32754w.setTag(null);
        this.f32755x.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0054 A[PHI: r2
  0x0054: PHI (r2v3 long) = (r2v0 long), (r2v9 long) binds: [B:14:0x002a, B:28:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0084 A[PHI: r2
  0x0084: PHI (r2v5 long) = (r2v4 long), (r2v7 long) binds: [B:33:0x0059, B:47:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        int i;
        Boolean bool;
        int i2;
        EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener;
        int i3;
        int i4;
        synchronized (this) {
            j2 = this.f32782C;
            this.f32782C = 0L;
        }
        BaseLoadMoreRefreshViewModel<Object> baseLoadMoreRefreshViewModel = this.f32757z;
        if ((31 & j2) != 0) {
            EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener2 = ((j2 & 24) == 0 || baseLoadMoreRefreshViewModel == null) ? null : baseLoadMoreRefreshViewModel.f32033p;
            long j3 = j2 & 25;
            if (j3 == 0) {
                i3 = 0;
            } else {
                MutableLiveData<Boolean> mutableLiveData = baseLoadMoreRefreshViewModel != null ? baseLoadMoreRefreshViewModel.f32030m : null;
                m404r(0, mutableLiveData);
                boolean zM394o = ViewDataBinding.m394o(mutableLiveData != null ? mutableLiveData.m421d() : null);
                if (j3 != 0) {
                    j2 |= zM394o ? 64L : 32L;
                }
                if (zM394o) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
            }
            long j4 = j2 & 26;
            if (j4 == 0) {
                i4 = 0;
            } else {
                MutableLiveData<Boolean> mutableLiveData2 = baseLoadMoreRefreshViewModel != null ? baseLoadMoreRefreshViewModel.f31989c : null;
                m404r(1, mutableLiveData2);
                boolean zM394o2 = ViewDataBinding.m394o(mutableLiveData2 != null ? mutableLiveData2.m421d() : null);
                if (j4 != 0) {
                    j2 |= zM394o2 ? 256L : 128L;
                }
                if (zM394o2) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
            }
            if ((j2 & 28) == 0) {
                endlessRecyclerOnScrollListener = endlessRecyclerOnScrollListener2;
                i = i4;
                bool = null;
                i2 = i3;
            } else {
                MutableLiveData<Boolean> mutableLiveData3 = baseLoadMoreRefreshViewModel != null ? baseLoadMoreRefreshViewModel.f32029l : null;
                m404r(2, mutableLiveData3);
                if (mutableLiveData3 != null) {
                    Boolean boolM421d = mutableLiveData3.m421d();
                    i = i4;
                    i2 = i3;
                    endlessRecyclerOnScrollListener = endlessRecyclerOnScrollListener2;
                    bool = boolM421d;
                } else {
                    endlessRecyclerOnScrollListener = endlessRecyclerOnScrollListener2;
                    i = i4;
                    bool = null;
                    i2 = i3;
                }
            }
        } else {
            i = 0;
            bool = null;
            i2 = 0;
            endlessRecyclerOnScrollListener = null;
        }
        if ((j2 & 16) != 0) {
            SkuDao.a.m14053E(this.f32751t, null, null, null, null, true, false, true, 0, false, null, null, null);
        }
        if ((25 & j2) != 0) {
            this.f32752u.setVisibility(i2);
        }
        if ((j2 & 26) != 0) {
            this.f32753v.setVisibility(i);
        }
        if ((j2 & 24) != 0) {
            SkuDao.a.m14091i(this.f32754w, endlessRecyclerOnScrollListener);
        }
        if ((j2 & 28) != 0) {
            SkuDao.a.m14089h(this.f32755x, bool);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32782C != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32782C = 16L;
        }
        m401m();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: j */
    public boolean mo399j(int i, Object obj, int i2) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.f32782C |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.f32782C |= 2;
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.f32782C |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (9 != i) {
            return false;
        }
        this.f32757z = (BaseLoadMoreRefreshViewModel) obj;
        synchronized (this) {
            this.f32782C |= 8;
        }
        m16396a(9);
        m401m();
        return true;
    }
}
