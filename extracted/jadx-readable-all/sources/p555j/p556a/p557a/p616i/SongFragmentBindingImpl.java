package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;
import p555j.p556a.p557a.p558a.p596f.EndlessRecyclerOnScrollListener;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p748n.DataBindingComponent;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.i.f4, reason: use source file name */
/* JADX INFO: compiled from: SongFragmentBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class SongFragmentBindingImpl extends SongFragmentBinding {

    /* JADX INFO: renamed from: z */
    public static final SparseIntArray f32534z;

    /* JADX INFO: renamed from: A */
    public long f32535A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32534z = sparseIntArray;
        sparseIntArray.put(R.id.statusView, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SongFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 6, null, f32534z);
        super(dataBindingComponent, view, 3, (ConstraintLayout) objArrM391i[0], (ProgressBar) objArrM391i[3], (ProgressBar) objArrM391i[4], (RecyclerView) objArrM391i[2], (SwipeRefreshLayout) objArrM391i[1], (BackgroundMessageView) objArrM391i[5]);
        this.f32535A = -1L;
        this.f32511t.setTag(null);
        this.f32512u.setTag(null);
        this.f32513v.setTag(null);
        this.f32514w.setTag(null);
        this.f32515x.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0054 A[PHI: r2
  0x0054: PHI (r2v4 long) = (r2v0 long), (r2v8 long) binds: [B:14:0x002a, B:28:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        Boolean bool;
        int i;
        long j3;
        int i2;
        EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener;
        Boolean boolM421d;
        synchronized (this) {
            j2 = this.f32535A;
            this.f32535A = 0L;
        }
        BaseLoadMoreRefreshViewModel<Object> baseLoadMoreRefreshViewModel = this.f32516y;
        if ((31 & j2) != 0) {
            EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener2 = ((j2 & 24) == 0 || baseLoadMoreRefreshViewModel == null) ? null : baseLoadMoreRefreshViewModel.f32033p;
            long j4 = j2 & 25;
            if (j4 == 0) {
                i = 0;
            } else {
                MutableLiveData<Boolean> mutableLiveData = baseLoadMoreRefreshViewModel != null ? baseLoadMoreRefreshViewModel.f31989c : null;
                m404r(0, mutableLiveData);
                boolean zM394o = ViewDataBinding.m394o(mutableLiveData != null ? mutableLiveData.m421d() : null);
                if (j4 != 0) {
                    j2 |= zM394o ? 256L : 128L;
                }
                if (zM394o) {
                    i = 0;
                } else {
                    i = 8;
                }
            }
            if ((j2 & 26) == 0) {
                boolM421d = null;
            } else {
                MutableLiveData<Boolean> mutableLiveData2 = baseLoadMoreRefreshViewModel != null ? baseLoadMoreRefreshViewModel.f32029l : null;
                m404r(1, mutableLiveData2);
                if (mutableLiveData2 != null) {
                    boolM421d = mutableLiveData2.m421d();
                } else {
                    boolM421d = null;
                }
            }
            long j5 = j2 & 28;
            if (j5 != 0) {
                MutableLiveData<Boolean> mutableLiveData3 = baseLoadMoreRefreshViewModel != null ? baseLoadMoreRefreshViewModel.f32030m : null;
                m404r(2, mutableLiveData3);
                boolean zM394o2 = ViewDataBinding.m394o(mutableLiveData3 != null ? mutableLiveData3.m421d() : null);
                if (j5 != 0) {
                    j2 |= zM394o2 ? 64L : 32L;
                }
                int i3 = zM394o2 ? 0 : 8;
                endlessRecyclerOnScrollListener = endlessRecyclerOnScrollListener2;
                bool = boolM421d;
                i2 = i3;
                j3 = 28;
            } else {
                endlessRecyclerOnScrollListener = endlessRecyclerOnScrollListener2;
                bool = boolM421d;
                j3 = 28;
                i2 = 0;
            }
        } else {
            bool = null;
            i = 0;
            j3 = 28;
            i2 = 0;
            endlessRecyclerOnScrollListener = null;
        }
        if ((j3 & j2) != 0) {
            this.f32512u.setVisibility(i2);
        }
        if ((j2 & 25) != 0) {
            this.f32513v.setVisibility(i);
        }
        if ((j2 & 24) != 0) {
            SkuDao.a.m14091i(this.f32514w, endlessRecyclerOnScrollListener);
        }
        if ((j2 & 26) != 0) {
            SkuDao.a.m14089h(this.f32515x, bool);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32535A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32535A = 16L;
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
                this.f32535A |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.f32535A |= 2;
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
            this.f32535A |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (9 != i) {
            return false;
        }
        this.f32516y = (BaseLoadMoreRefreshViewModel) obj;
        synchronized (this) {
            this.f32535A |= 8;
        }
        m16396a(9);
        m401m();
        return true;
    }
}
