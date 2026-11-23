package p555j.p556a.p557a.p616i;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.kenburn.KenBurnsView;
import mtp.media.karaoke.p628ui.widgets.CircleProgressBar;
import mtp.media.karaoke.p628ui.widgets.VideoTextureView;
import p636z0.p748n.DataBindingComponent;

/* JADX INFO: renamed from: j.a.a.i.f3, reason: use source file name */
/* JADX INFO: compiled from: ProcessActivityBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ProcessActivityBindingImpl extends ProcessActivityBinding {

    /* JADX INFO: renamed from: w */
    public static final SparseIntArray f32532w;

    /* JADX INFO: renamed from: x */
    public long f32533x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32532w = sparseIntArray;
        sparseIntArray.put(R.id.singBackground, 1);
        sparseIntArray.put(R.id.layoutPlayer, 2);
        sparseIntArray.put(R.id.videoPlayerViewDuet, 3);
        sparseIntArray.put(R.id.videoPlayerView, 4);
        sparseIntArray.put(R.id.dimVideoView, 5);
        sparseIntArray.put(R.id.linearLayout4, 6);
        sparseIntArray.put(R.id.thumbnailBackground, 7);
        sparseIntArray.put(R.id.kenBurnsView, 8);
        sparseIntArray.put(R.id.dimView, 9);
        sparseIntArray.put(R.id.btnCreateVideo, 10);
        sparseIntArray.put(R.id.seekBarControl, 11);
        sparseIntArray.put(R.id.btnPlay, 12);
        sparseIntArray.put(R.id.currTime, 13);
        sparseIntArray.put(R.id.seekBar, 14);
        sparseIntArray.put(R.id.durationTime, 15);
        sparseIntArray.put(R.id.toolbar, 16);
        sparseIntArray.put(R.id.toolbarTitle, 17);
        sparseIntArray.put(R.id.btnDraft, 18);
        sparseIntArray.put(R.id.layoutPagerEffect, 19);
        sparseIntArray.put(R.id.effect_tab_layout, 20);
        sparseIntArray.put(R.id.effect_view_pager, 21);
        sparseIntArray.put(R.id.btnContinue, 22);
        sparseIntArray.put(R.id.layoutSaveMixing, 23);
        sparseIntArray.put(R.id.processProgressBar, 24);
        sparseIntArray.put(R.id.txtProgress, 25);
        sparseIntArray.put(R.id.imgProgressSuccess, 26);
        sparseIntArray.put(R.id.txtMessageProgress, 27);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProcessActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 28, null, f32532w);
        super(dataBindingComponent, view, 0, (TextView) objArrM391i[22], (TextView) objArrM391i[10], (TextView) objArrM391i[18], (ImageButton) objArrM391i[12], (TextView) objArrM391i[13], (View) objArrM391i[5], (View) objArrM391i[9], (TextView) objArrM391i[15], (TabLayout) objArrM391i[20], (ViewPager) objArrM391i[21], (ImageView) objArrM391i[26], (KenBurnsView) objArrM391i[8], (LinearLayout) objArrM391i[19], (RelativeLayout) objArrM391i[2], (LinearLayout) objArrM391i[23], (ConstraintLayout) objArrM391i[6], (CircleProgressBar) objArrM391i[24], (ConstraintLayout) objArrM391i[0], (SeekBar) objArrM391i[14], (ConstraintLayout) objArrM391i[11], (ImageView) objArrM391i[1], (ImageView) objArrM391i[7], (Toolbar) objArrM391i[16], (TextView) objArrM391i[17], (TextView) objArrM391i[27], (TextView) objArrM391i[25], (VideoTextureView) objArrM391i[4], (VideoTextureView) objArrM391i[3]);
        this.f32533x = -1L;
        this.f32510v.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        synchronized (this) {
            this.f32533x = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32533x != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32533x = 2L;
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
        return true;
    }
}
