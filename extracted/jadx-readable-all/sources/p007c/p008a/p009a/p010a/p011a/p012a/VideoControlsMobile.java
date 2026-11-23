package p007c.p008a.p009a.p010a.p011a.p012a;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.devbrackets.android.exomedia.p474ui.widget.VideoView;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import mtp.media.karaoke.R;
import p007c.p008a.p009a.p010a.C0244f;
import p007c.p008a.p009a.p010a.p011a.p013b.BottomViewHideShowAnimation;
import p007c.p008a.p009a.p010a.p011a.p013b.TopViewHideShowAnimation;
import p007c.p008a.p009a.p010a.p027i.VideoControlsSeekListener;
import p007c.p008a.p009a.p010a.p027i.VideoControlsVisibilityListener;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.a.a.d, reason: use source file name */
/* JADX INFO: compiled from: VideoControlsMobile.kt */
/* JADX INFO: loaded from: classes.dex */
public final class VideoControlsMobile extends DefaultVideoControls {

    /* JADX INFO: renamed from: J */
    public SeekBar f1477J;

    /* JADX INFO: renamed from: K */
    public LinearLayout f1478K;

    /* JADX INFO: renamed from: L */
    public boolean f1479L;

    /* JADX INFO: renamed from: c.a.a.a.a.a.d$a */
    /* JADX INFO: compiled from: VideoControlsMobile.kt */
    public final class a implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: f */
        public long f1480f;

        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            Intrinsics2.m13089e(seekBar, "seekBar");
            if (z) {
                this.f1480f = i;
                VideoControlsMobile.this.getCurrentTimeTextView().setText(C0244f.m1022k(this.f1480f));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            Intrinsics2.m13089e(seekBar, "seekBar");
            VideoControlsMobile.this.setUserInteracting(true);
            VideoControlsSeekListener seekListener = VideoControlsMobile.this.getSeekListener();
            if (seekListener == null || !((DefaultVideoControls.c) seekListener).m993g()) {
                VideoControlsMobile.this.getInternalListener().m993g();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics2.m13089e(seekBar, "seekBar");
            VideoControlsMobile.this.setUserInteracting(false);
            VideoControlsSeekListener seekListener = VideoControlsMobile.this.getSeekListener();
            if (seekListener != null) {
                if (((DefaultVideoControls.c) seekListener).m992f(this.f1480f)) {
                    return;
                }
            }
            VideoControlsMobile.this.getInternalListener().m992f(this.f1480f);
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.a.a.d$b */
    /* JADX INFO: compiled from: VideoControlsMobile.kt */
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            VideoControlsMobile.this.mo976h(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoControlsMobile(Context context) {
        super(context);
        Intrinsics2.m13089e(context, "context");
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.VideoControls
    /* JADX INFO: renamed from: e */
    public void mo994e() {
        if (this.f1432E) {
            boolean z = false;
            setLoading(false);
            getLoadingProgressBar().setVisibility(8);
            getControlsContainer().setVisibility(0);
            getPlayPauseButton().setEnabled(true);
            getPreviousButton().setEnabled(getEnabledViews().get(R.id.exomedia_controls_previous_btn, true));
            getNextButton().setEnabled(getEnabledViews().get(R.id.exomedia_controls_next_btn, true));
            VideoView videoView = getVideoView();
            if (videoView != null && videoView.m12572a()) {
                z = true;
            }
            mo974d(z);
        }
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.VideoControls
    /* JADX INFO: renamed from: f */
    public void mo995f(boolean z) {
        if (this.f1432E) {
            return;
        }
        setLoading(true);
        getLoadingProgressBar().setVisibility(0);
        if (z) {
            getControlsContainer().setVisibility(8);
        } else {
            getPlayPauseButton().setEnabled(false);
            getPreviousButton().setEnabled(false);
            getNextButton().setEnabled(false);
        }
        mo972b();
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    public List<View> getExtraViews() {
        LinearLayout linearLayout = this.f1478K;
        if (linearLayout == null) {
            Intrinsics2.m13096l("extraViewsContainer");
            throw null;
        }
        int childCount = linearLayout.getChildCount();
        if (childCount <= 0) {
            return super.getExtraViews();
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < childCount; i++) {
            LinearLayout linearLayout2 = this.f1478K;
            if (linearLayout2 == null) {
                Intrinsics2.m13096l("extraViewsContainer");
                throw null;
            }
            linkedList.add(linearLayout2.getChildAt(i));
        }
        return linkedList;
    }

    public final LinearLayout getExtraViewsContainer() {
        LinearLayout linearLayout = this.f1478K;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics2.m13096l("extraViewsContainer");
        throw null;
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    public int getLayoutResource() {
        return R.layout.exomedia_default_controls_mobile;
    }

    public final SeekBar getSeekBar() {
        SeekBar seekBar = this.f1477J;
        if (seekBar != null) {
            return seekBar;
        }
        Intrinsics2.m13096l("seekBar");
        throw null;
    }

    public final boolean getUserInteracting() {
        return this.f1479L;
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    /* JADX INFO: renamed from: h */
    public void mo976h(boolean z) {
        if (this.f1433F == z) {
            return;
        }
        if (!getHideEmptyTextContainer() || !m979k()) {
            ViewGroup textContainer = getTextContainer();
            ViewGroup textContainer2 = getTextContainer();
            Objects.requireNonNull(DefaultVideoControls.f1427h);
            textContainer.startAnimation(new TopViewHideShowAnimation(textContainer2, z, DefaultVideoControls.f1426g));
        }
        if (!this.f1432E) {
            ViewGroup controlsContainer = getControlsContainer();
            ViewGroup controlsContainer2 = getControlsContainer();
            Objects.requireNonNull(DefaultVideoControls.f1427h);
            controlsContainer.startAnimation(new BottomViewHideShowAnimation(controlsContainer2, z, DefaultVideoControls.f1426g));
        }
        setVisible(z);
        if (this.f1433F) {
            VideoControlsVisibilityListener videoControlsVisibilityListener = this.f1428A;
            if (videoControlsVisibilityListener != null) {
                videoControlsVisibilityListener.m1210b();
                return;
            }
            return;
        }
        VideoControlsVisibilityListener videoControlsVisibilityListener2 = this.f1428A;
        if (videoControlsVisibilityListener2 != null) {
            videoControlsVisibilityListener2.m1209a();
        }
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    /* JADX INFO: renamed from: j */
    public void mo978j(long j2) {
        setHideDelay(j2);
        if (j2 < 0 || !getCanViewHide() || this.f1432E || this.f1479L) {
            return;
        }
        getVisibilityHandler().postDelayed(new b(), j2);
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    /* JADX INFO: renamed from: l */
    public void mo980l() {
        super.mo980l();
        SeekBar seekBar = this.f1477J;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(new a());
        } else {
            Intrinsics2.m13096l("seekBar");
            throw null;
        }
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    /* JADX INFO: renamed from: m */
    public void mo981m() {
        super.mo981m();
        View viewFindViewById = findViewById(R.id.exomedia_controls_video_seek);
        Intrinsics2.m13088d(viewFindViewById, "findViewById(R.id.exomedia_controls_video_seek)");
        this.f1477J = (SeekBar) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.exomedia_controls_extra_container);
        Intrinsics2.m13088d(viewFindViewById2, "findViewById(R.id.exomed…controls_extra_container)");
        this.f1478K = (LinearLayout) viewFindViewById2;
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    /* JADX INFO: renamed from: q */
    public void mo985q(long j2, long j3, int i) {
        if (this.f1479L) {
            return;
        }
        SeekBar seekBar = this.f1477J;
        if (seekBar == null) {
            Intrinsics2.m13096l("seekBar");
            throw null;
        }
        if (seekBar == null) {
            Intrinsics2.m13096l("seekBar");
            throw null;
        }
        seekBar.setSecondaryProgress((int) ((i / 100) * seekBar.getMax()));
        SeekBar seekBar2 = this.f1477J;
        if (seekBar2 == null) {
            Intrinsics2.m13096l("seekBar");
            throw null;
        }
        seekBar2.setProgress((int) j2);
        m984p(j2);
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    /* JADX INFO: renamed from: r */
    public void mo986r() {
        if (this.f1433F) {
            boolean zM979k = m979k();
            if (getHideEmptyTextContainer() && zM979k && getTextContainer().getVisibility() == 0) {
                getTextContainer().clearAnimation();
                ViewGroup textContainer = getTextContainer();
                ViewGroup textContainer2 = getTextContainer();
                Objects.requireNonNull(DefaultVideoControls.f1427h);
                textContainer.startAnimation(new TopViewHideShowAnimation(textContainer2, false, DefaultVideoControls.f1426g));
                return;
            }
            if ((getHideEmptyTextContainer() && zM979k) || getTextContainer().getVisibility() == 0) {
                return;
            }
            getTextContainer().clearAnimation();
            ViewGroup textContainer3 = getTextContainer();
            ViewGroup textContainer4 = getTextContainer();
            Objects.requireNonNull(DefaultVideoControls.f1427h);
            textContainer3.startAnimation(new TopViewHideShowAnimation(textContainer4, true, DefaultVideoControls.f1426g));
        }
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls, p007c.p008a.p009a.p010a.p011a.p012a.VideoControls
    public void setDuration(long j2) {
        SeekBar seekBar = this.f1477J;
        if (seekBar == null) {
            Intrinsics2.m13096l("seekBar");
            throw null;
        }
        if (j2 != seekBar.getMax()) {
            getEndTimeTextView().setText(C0244f.m1022k(j2));
            SeekBar seekBar2 = this.f1477J;
            if (seekBar2 != null) {
                seekBar2.setMax((int) j2);
            } else {
                Intrinsics2.m13096l("seekBar");
                throw null;
            }
        }
    }

    public final void setExtraViewsContainer(LinearLayout linearLayout) {
        Intrinsics2.m13089e(linearLayout, "<set-?>");
        this.f1478K = linearLayout;
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    public void setPosition(long j2) {
        getCurrentTimeTextView().setText(C0244f.m1022k(j2));
        SeekBar seekBar = this.f1477J;
        if (seekBar != null) {
            seekBar.setProgress((int) j2);
        } else {
            Intrinsics2.m13096l("seekBar");
            throw null;
        }
    }

    public final void setSeekBar(SeekBar seekBar) {
        Intrinsics2.m13089e(seekBar, "<set-?>");
        this.f1477J = seekBar;
    }

    public final void setUserInteracting(boolean z) {
        this.f1479L = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoControlsMobile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoControlsMobile(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public VideoControlsMobile(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
    }
}
