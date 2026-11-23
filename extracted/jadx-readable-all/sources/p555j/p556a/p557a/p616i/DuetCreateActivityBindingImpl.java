package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.seekbar.CustomSeekBar;
import mtp.media.karaoke.data.model.Song;
import p555j.p556a.p557a.p558a.p559a.p590r.C6799h0;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p748n.DataBindingComponent;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.i.n, reason: use source file name */
/* JADX INFO: compiled from: DuetCreateActivityBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class DuetCreateActivityBindingImpl extends DuetCreateActivityBinding {

    /* JADX INFO: renamed from: x */
    public static final SparseIntArray f32687x;

    /* JADX INFO: renamed from: y */
    public long f32688y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32687x = sparseIntArray;
        sparseIntArray.put(R.id.dimView, 2);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.youTubePlayerView, 4);
        sparseIntArray.put(R.id.seekBarContainer, 5);
        sparseIntArray.put(R.id.txtCurrentTime, 6);
        sparseIntArray.put(R.id.seekBar, 7);
        sparseIntArray.put(R.id.txtTotalTime, 8);
        sparseIntArray.put(R.id.linearLayout2, 9);
        sparseIntArray.put(R.id.btnDuetA, 10);
        sparseIntArray.put(R.id.btnDuetAB, 11);
        sparseIntArray.put(R.id.btnDuetB, 12);
        sparseIntArray.put(R.id.btnStart, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DuetCreateActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 14, null, f32687x);
        super(dataBindingComponent, view, 1, (TextView) objArrM391i[10], (TextView) objArrM391i[11], (TextView) objArrM391i[12], (TextView) objArrM391i[13], (ConstraintLayout) objArrM391i[0], (View) objArrM391i[2], (LinearLayout) objArrM391i[9], (CustomSeekBar) objArrM391i[7], (RelativeLayout) objArrM391i[5], (AppCompatImageView) objArrM391i[1], (Toolbar) objArrM391i[3], (TextView) objArrM391i[6], (TextView) objArrM391i[8], (YouTubePlayerView) objArrM391i[4]);
        this.f32688y = -1L;
        this.f32667t.setTag(null);
        this.f32669v.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        synchronized (this) {
            j2 = this.f32688y;
            this.f32688y = 0L;
        }
        C6799h0 c6799h0 = this.f32670w;
        long j3 = j2 & 7;
        String thumbnail = null;
        if (j3 != 0) {
            MutableLiveData<Song> mutableLiveData = c6799h0 != null ? c6799h0.f31857l : null;
            m404r(0, mutableLiveData);
            Song songM421d = mutableLiveData != null ? mutableLiveData.m421d() : null;
            if (songM421d != null) {
                thumbnail = songM421d.getThumbnail();
            }
        }
        String str = thumbnail;
        if (j3 != 0) {
            SkuDao.a.m14053E(this.f32669v, str, null, null, null, true, false, false, 0, true, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32688y != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32688y = 4L;
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
            this.f32688y |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (9 != i) {
            return false;
        }
        this.f32670w = (C6799h0) obj;
        synchronized (this) {
            this.f32688y |= 2;
        }
        m16396a(9);
        m401m();
        return true;
    }
}
