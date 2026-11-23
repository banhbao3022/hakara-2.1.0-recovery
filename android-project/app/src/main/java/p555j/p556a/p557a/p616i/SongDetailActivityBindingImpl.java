package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Song;
import p555j.p556a.p557a.p558a.p559a.p569f.p570f.SongDetailViewModel;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.i.d4, reason: use source file name */
/* JADX INFO: compiled from: SongDetailActivityBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class SongDetailActivityBindingImpl extends SongDetailActivityBinding {

    /* JADX INFO: renamed from: D */
    public static final SparseIntArray f32495D;

    /* JADX INFO: renamed from: E */
    public long f32496E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32495D = sparseIntArray;
        sparseIntArray.put(R.id.appBarLayout, 7);
        sparseIntArray.put(R.id.collapsingToolbar, 8);
        sparseIntArray.put(R.id.headerLayout, 9);
        sparseIntArray.put(R.id.dimView, 10);
        sparseIntArray.put(R.id.songDetailLayout, 11);
        sparseIntArray.put(R.id.song_content, 12);
        sparseIntArray.put(R.id.btnSing, 13);
        sparseIntArray.put(R.id.toolbar, 14);
        sparseIntArray.put(R.id.btnBack, 15);
        sparseIntArray.put(R.id.btnSearch, 16);
        sparseIntArray.put(R.id.toolbarLine, 17);
        sparseIntArray.put(R.id.tabs, 18);
        sparseIntArray.put(R.id.pages, 19);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SongDetailActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 20, null, f32495D);
        super(dataBindingComponent, view, 1, (AppBarLayout) objArrM391i[7], (ImageView) objArrM391i[15], (ImageView) objArrM391i[16], (TextView) objArrM391i[13], (CollapsingToolbarLayout) objArrM391i[8], (CoordinatorLayout) objArrM391i[0], (View) objArrM391i[10], (ConstraintLayout) objArrM391i[9], (AppCompatImageView) objArrM391i[1], (ViewPager2) objArrM391i[19], (TextView) objArrM391i[4], (LinearLayout) objArrM391i[12], (RelativeLayout) objArrM391i[11], (TextView) objArrM391i[3], (TextView) objArrM391i[5], (TabLayout) objArrM391i[18], (AppCompatImageView) objArrM391i[2], (Toolbar) objArrM391i[14], (View) objArrM391i[17], (TextView) objArrM391i[6]);
        this.f32496E = -1L;
        this.f32464t.setTag(null);
        this.f32466v.setTag(null);
        this.f32467w.setTag(null);
        this.f32468x.setTag(null);
        this.f32469y.setTag(null);
        this.f32470z.setTag(null);
        this.f32462B.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        String str;
        String str2;
        String name;
        int recordCount;
        synchronized (this) {
            j2 = this.f32496E;
            this.f32496E = 0L;
        }
        SongDetailViewModel songDetailViewModel = this.f32463C;
        long j3 = j2 & 7;
        String str3 = null;
        if (j3 != 0) {
            MutableLiveData<Song> mutableLiveData = songDetailViewModel != null ? songDetailViewModel.f31312l : null;
            m404r(0, mutableLiveData);
            Song songM421d = mutableLiveData != null ? mutableLiveData.m421d() : null;
            if (songM421d != null) {
                String thumbnail = songM421d.getThumbnail();
                String artist = songM421d.getArtist();
                name = songM421d.getName();
                recordCount = songM421d.getRecordCount();
                str3 = artist;
                str2 = thumbnail;
            } else {
                str2 = null;
                name = null;
                recordCount = 0;
            }
            str = String.format(this.f32469y.getResources().getString(R.string.msg_recording_count), Integer.valueOf(recordCount));
        } else {
            str = null;
            str2 = null;
            name = null;
        }
        if (j3 != 0) {
            String str4 = str2;
            SkuDao.a.m14053E(this.f32466v, str4, null, null, null, true, false, false, 0, true, null, null, null);
            TextViewBindingAdapter.m16406a(this.f32467w, str3);
            TextViewBindingAdapter.m16406a(this.f32468x, name);
            TextViewBindingAdapter.m16406a(this.f32469y, str);
            SkuDao.a.m14053E(this.f32470z, str4, null, null, null, true, false, false, 10, false, null, null, null);
            TextViewBindingAdapter.m16406a(this.f32462B, name);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32496E != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32496E = 4L;
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
            this.f32496E |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (9 != i) {
            return false;
        }
        this.f32463C = (SongDetailViewModel) obj;
        synchronized (this) {
            this.f32496E |= 2;
        }
        m16396a(9);
        m401m();
        return true;
    }
}
