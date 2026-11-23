package p007c.p008a.p009a.p010a.p011a.p012a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.devbrackets.android.exomedia.p474ui.widget.VideoView;
import java.util.Objects;
import mtp.media.karaoke.R;
import p007c.p008a.p009a.p010a.C0244f;
import p007c.p008a.p009a.p010a.p011a.p013b.BottomViewHideShowAnimation;
import p007c.p008a.p009a.p010a.p027i.VideoControlsButtonListener;
import p007c.p008a.p009a.p010a.p027i.VideoControlsSeekListener;
import p007c.p008a.p009a.p010a.p027i.VideoControlsVisibilityListener;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.a.a.b, reason: use source file name */
/* JADX INFO: compiled from: VideoControlsLeanback.kt */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
public final class VideoControlsLeanback extends DefaultVideoControls {

    /* JADX INFO: renamed from: L */
    public ProgressBar f1463L;

    /* JADX INFO: renamed from: M */
    public ImageView f1464M;

    /* JADX INFO: renamed from: N */
    public ViewGroup f1465N;

    /* JADX INFO: renamed from: O */
    public ImageButton f1466O;

    /* JADX INFO: renamed from: P */
    public ImageButton f1467P;

    /* JADX INFO: renamed from: Q */
    public View f1468Q;

    /* JADX INFO: renamed from: R */
    public b f1469R;

    /* JADX INFO: renamed from: K */
    public static final c f1462K = new c(null);

    /* JADX INFO: renamed from: J */
    public static final int f1461J = 10000;

    /* JADX INFO: renamed from: c.a.a.a.a.a.b$a */
    /* JADX INFO: compiled from: java-style lambda group */
    public static final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f1470f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Object f1471g;

        public a(int i, Object obj) {
            this.f1470f = i;
            this.f1471g = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.f1470f;
            if (i == 0) {
                ((VideoControlsLeanback) this.f1471g).m999v();
            } else {
                if (i != 1) {
                    throw null;
                }
                ((VideoControlsLeanback) this.f1471g).m998u();
            }
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.a.a.b$b */
    /* JADX INFO: compiled from: VideoControlsLeanback.kt */
    public final class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            Intrinsics2.m13089e(view, "view");
            if (z) {
                Intrinsics2.m13089e(view, "selectedView");
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i = iArr[0];
                VideoControlsLeanback.this.getRippleIndicator().getLocationOnScreen(iArr);
                VideoControlsLeanback.this.getRippleIndicator().startAnimation(VideoControlsLeanback.this.new f((i - ((VideoControlsLeanback.this.getRippleIndicator().getWidth() - view.getWidth()) / 2)) - iArr[0]));
            }
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.a.a.b$c */
    /* JADX INFO: compiled from: VideoControlsLeanback.kt */
    public static final class c {
        public c() {
        }

        public c(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.a.a.b$d */
    /* JADX INFO: compiled from: VideoControlsLeanback.kt */
    public final class d extends DefaultVideoControls.c {
        public d() {
            super();
        }

        @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls.c, p007c.p008a.p009a.p010a.p027i.VideoControlsButtonListener
        /* JADX INFO: renamed from: b */
        public boolean mo988b() {
            VideoView videoView = VideoControlsLeanback.this.getVideoView();
            if (videoView == null) {
                return false;
            }
            long currentPosition = videoView.getCurrentPosition();
            Objects.requireNonNull(VideoControlsLeanback.f1462K);
            long j2 = currentPosition - ((long) VideoControlsLeanback.f1461J);
            if (j2 < 0) {
                j2 = 0;
            }
            VideoControlsLeanback.this.m1000w(j2);
            return true;
        }

        @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls.c, p007c.p008a.p009a.p010a.p027i.VideoControlsButtonListener
        /* JADX INFO: renamed from: c */
        public boolean mo989c() {
            VideoView videoView = VideoControlsLeanback.this.getVideoView();
            if (videoView == null) {
                return false;
            }
            long currentPosition = videoView.getCurrentPosition();
            Objects.requireNonNull(VideoControlsLeanback.f1462K);
            long max = currentPosition + ((long) VideoControlsLeanback.f1461J);
            if (max > VideoControlsLeanback.this.getProgressBar().getMax()) {
                max = VideoControlsLeanback.this.getProgressBar().getMax();
            }
            VideoControlsLeanback.this.m1000w(max);
            return true;
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.a.a.b$e */
    /* JADX INFO: compiled from: VideoControlsLeanback.kt */
    public final class e implements View.OnKeyListener {
        public e() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            Intrinsics2.m13089e(view, "view");
            Intrinsics2.m13089e(keyEvent, "event");
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i == 4) {
                VideoControlsLeanback videoControlsLeanback = VideoControlsLeanback.this;
                if (videoControlsLeanback.f1433F && videoControlsLeanback.getCanViewHide()) {
                    VideoControlsLeanback videoControlsLeanback2 = VideoControlsLeanback.this;
                    if (!videoControlsLeanback2.f1432E) {
                        videoControlsLeanback2.m977i();
                        return true;
                    }
                }
                if (VideoControlsLeanback.this.getControlsParent().getAnimation() != null) {
                    return true;
                }
            } else {
                if (i == 85) {
                    VideoControlsLeanback videoControlsLeanback3 = VideoControlsLeanback.this;
                    VideoControlsButtonListener videoControlsButtonListener = videoControlsLeanback3.f1454z;
                    if (videoControlsButtonListener == null || !videoControlsButtonListener.mo990d()) {
                        videoControlsLeanback3.f1429B.mo990d();
                    }
                    return true;
                }
                if (i != 126) {
                    if (i != 127) {
                        switch (i) {
                            case 19:
                                VideoControlsLeanback.this.m1001x();
                                return true;
                            case 20:
                                VideoControlsLeanback.this.m977i();
                                return true;
                            case 21:
                                VideoControlsLeanback.this.m1001x();
                                VideoControlsLeanback videoControlsLeanback4 = VideoControlsLeanback.this;
                                videoControlsLeanback4.m997t(videoControlsLeanback4.getCurrentFocus());
                                return true;
                            case 22:
                                VideoControlsLeanback.this.m1001x();
                                VideoControlsLeanback videoControlsLeanback5 = VideoControlsLeanback.this;
                                videoControlsLeanback5.m996s(videoControlsLeanback5.getCurrentFocus());
                                return true;
                            case 23:
                                VideoControlsLeanback.this.m1001x();
                                View currentFocus = VideoControlsLeanback.this.getCurrentFocus();
                                if (currentFocus != null) {
                                    currentFocus.callOnClick();
                                }
                                return true;
                            default:
                                switch (i) {
                                    case 87:
                                        VideoControlsLeanback videoControlsLeanback6 = VideoControlsLeanback.this;
                                        VideoControlsButtonListener videoControlsButtonListener2 = videoControlsLeanback6.f1454z;
                                        if (videoControlsButtonListener2 == null || !videoControlsButtonListener2.mo991e()) {
                                            Objects.requireNonNull(videoControlsLeanback6.f1429B);
                                        }
                                        return true;
                                    case 88:
                                        VideoControlsLeanback videoControlsLeanback7 = VideoControlsLeanback.this;
                                        VideoControlsButtonListener videoControlsButtonListener3 = videoControlsLeanback7.f1454z;
                                        if (videoControlsButtonListener3 == null || !videoControlsButtonListener3.mo987a()) {
                                            Objects.requireNonNull(videoControlsLeanback7.f1429B);
                                        }
                                        return true;
                                    case 89:
                                        VideoControlsLeanback.this.m999v();
                                        return true;
                                    case 90:
                                        VideoControlsLeanback.this.m998u();
                                        return true;
                                }
                        }
                    }
                    if (VideoControlsLeanback.this.getVideoView() != null) {
                        VideoView videoView = VideoControlsLeanback.this.getVideoView();
                        Intrinsics2.m13087c(videoView);
                        if (videoView.m12572a()) {
                            VideoView videoView2 = VideoControlsLeanback.this.getVideoView();
                            if (videoView2 != null) {
                                VideoView.m12571c(videoView2, false, 1, null);
                            }
                            return true;
                        }
                    }
                } else if (VideoControlsLeanback.this.getVideoView() != null) {
                    VideoView videoView3 = VideoControlsLeanback.this.getVideoView();
                    Intrinsics2.m13087c(videoView3);
                    if (!videoView3.m12572a()) {
                        VideoView videoView4 = VideoControlsLeanback.this.getVideoView();
                        if (videoView4 != null) {
                            videoView4.m12575e();
                        }
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.a.a.b$f */
    /* JADX INFO: compiled from: VideoControlsLeanback.kt */
    public final class f extends TranslateAnimation implements Animation.AnimationListener {

        /* JADX INFO: renamed from: f */
        public int f1475f;

        public f(int i) {
            super(0.0f, i, 0.0f, 0.0f);
            this.f1475f = i;
            setDuration(250L);
            setAnimationListener(this);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Intrinsics2.m13089e(animation, "animation");
            VideoControlsLeanback.this.getRippleIndicator().setX(VideoControlsLeanback.this.getRippleIndicator().getX() + this.f1475f);
            VideoControlsLeanback.this.getRippleIndicator().clearAnimation();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics2.m13089e(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics2.m13089e(animation, "animation");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoControlsLeanback(Context context) {
        super(context);
        Intrinsics2.m13089e(context, "context");
        this.f1469R = new b();
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.VideoControls
    /* JADX INFO: renamed from: e */
    public void mo994e() {
        if (this.f1432E) {
            boolean z = false;
            setLoading(false);
            getControlsContainer().setVisibility(0);
            ImageView imageView = this.f1464M;
            if (imageView == null) {
                Intrinsics2.m13096l("rippleIndicator");
                throw null;
            }
            imageView.setVisibility(0);
            getLoadingProgressBar().setVisibility(8);
            if (getVideoView() != null) {
                VideoView videoView = getVideoView();
                Intrinsics2.m13087c(videoView);
                if (videoView.m12572a()) {
                    z = true;
                }
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
        getControlsContainer().setVisibility(8);
        ImageView imageView = this.f1464M;
        if (imageView == null) {
            Intrinsics2.m13096l("rippleIndicator");
            throw null;
        }
        imageView.setVisibility(8);
        getLoadingProgressBar().setVisibility(0);
        mo972b();
    }

    public final b getButtonFocusChangeListener() {
        return this.f1469R;
    }

    public final ViewGroup getControlsParent() {
        ViewGroup viewGroup = this.f1465N;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics2.m13096l("controlsParent");
        throw null;
    }

    public final View getCurrentFocus() {
        return this.f1468Q;
    }

    public final ImageButton getFastForwardButton() {
        return this.f1466O;
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    public int getLayoutResource() {
        return R.layout.exomedia_default_controls_leanback;
    }

    public final ProgressBar getProgressBar() {
        ProgressBar progressBar = this.f1463L;
        if (progressBar != null) {
            return progressBar;
        }
        Intrinsics2.m13096l("progressBar");
        throw null;
    }

    public final ImageButton getRewindButton() {
        return this.f1467P;
    }

    public final ImageView getRippleIndicator() {
        ImageView imageView = this.f1464M;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics2.m13096l("rippleIndicator");
        throw null;
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    /* JADX INFO: renamed from: h */
    public void mo976h(boolean z) {
        if (this.f1433F == z) {
            return;
        }
        if (!this.f1432E) {
            ViewGroup viewGroup = this.f1465N;
            if (viewGroup == null) {
                Intrinsics2.m13096l("controlsParent");
                throw null;
            }
            ViewGroup viewGroup2 = this.f1465N;
            if (viewGroup2 == null) {
                Intrinsics2.m13096l("controlsParent");
                throw null;
            }
            Objects.requireNonNull(DefaultVideoControls.f1427h);
            viewGroup.startAnimation(new BottomViewHideShowAnimation(viewGroup2, z, DefaultVideoControls.f1426g));
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
    /* JADX INFO: renamed from: l */
    public void mo980l() {
        super.mo980l();
        ImageButton imageButton = this.f1467P;
        if (imageButton != null) {
            imageButton.setOnClickListener(new a(0, this));
        }
        ImageButton imageButton2 = this.f1466O;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(new a(1, this));
        }
        getPreviousButton().setOnFocusChangeListener(this.f1469R);
        ImageButton imageButton3 = this.f1467P;
        if (imageButton3 != null) {
            imageButton3.setOnFocusChangeListener(this.f1469R);
        }
        getPlayPauseButton().setOnFocusChangeListener(this.f1469R);
        ImageButton imageButton4 = this.f1466O;
        if (imageButton4 != null) {
            imageButton4.setOnFocusChangeListener(this.f1469R);
        }
        getNextButton().setOnFocusChangeListener(this.f1469R);
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    /* JADX INFO: renamed from: m */
    public void mo981m() {
        super.mo981m();
        View viewFindViewById = findViewById(R.id.exomedia_controls_video_progress);
        Intrinsics2.m13088d(viewFindViewById, "findViewById(R.id.exomed…_controls_video_progress)");
        this.f1463L = (ProgressBar) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.exomedia_controls_leanback_ripple);
        Intrinsics2.m13088d(viewFindViewById2, "findViewById(R.id.exomed…controls_leanback_ripple)");
        this.f1464M = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.exomedia_controls_parent);
        Intrinsics2.m13088d(viewFindViewById3, "findViewById(R.id.exomedia_controls_parent)");
        this.f1465N = (ViewGroup) viewFindViewById3;
        this.f1466O = (ImageButton) findViewById(R.id.exomedia_controls_fast_forward_btn);
        this.f1467P = (ImageButton) findViewById(R.id.exomedia_controls_rewind_btn);
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    /* JADX INFO: renamed from: n */
    public void mo982n() {
        mo983o(R.color.exomedia_default_controls_leanback_button_selector);
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    /* JADX INFO: renamed from: o */
    public void mo983o(int i) {
        super.mo983o(i);
        Context context = getContext();
        Intrinsics2.m13088d(context, "context");
        Drawable drawableM1025n = C0244f.m1025n(context, R.drawable.exomedia_ic_rewind_white, i);
        ImageButton imageButton = this.f1467P;
        if (imageButton != null) {
            imageButton.setImageDrawable(drawableM1025n);
        }
        Context context2 = getContext();
        Intrinsics2.m13088d(context2, "context");
        Drawable drawableM1025n2 = C0244f.m1025n(context2, R.drawable.exomedia_ic_fast_forward_white, i);
        ImageButton imageButton2 = this.f1466O;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawableM1025n2);
        }
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getPlayPauseButton().requestFocus();
        this.f1468Q = getPlayPauseButton();
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    /* JADX INFO: renamed from: q */
    public void mo985q(long j2, long j3, int i) {
        ProgressBar progressBar = this.f1463L;
        if (progressBar == null) {
            Intrinsics2.m13096l("progressBar");
            throw null;
        }
        if (progressBar == null) {
            Intrinsics2.m13096l("progressBar");
            throw null;
        }
        progressBar.setSecondaryProgress((int) ((i / 100) * progressBar.getMax()));
        ProgressBar progressBar2 = this.f1463L;
        if (progressBar2 == null) {
            Intrinsics2.m13096l("progressBar");
            throw null;
        }
        progressBar2.setProgress((int) j2);
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
                textContainer.startAnimation(new BottomViewHideShowAnimation(textContainer2, false, DefaultVideoControls.f1426g));
                return;
            }
            if ((getHideEmptyTextContainer() && zM979k) || getTextContainer().getVisibility() == 0) {
                return;
            }
            getTextContainer().clearAnimation();
            ViewGroup textContainer3 = getTextContainer();
            ViewGroup textContainer4 = getTextContainer();
            Objects.requireNonNull(DefaultVideoControls.f1427h);
            textContainer3.startAnimation(new BottomViewHideShowAnimation(textContainer4, true, DefaultVideoControls.f1426g));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m996s(View view) {
        int nextFocusRightId;
        if (view == null || (nextFocusRightId = view.getNextFocusRightId()) == -1) {
            return;
        }
        View viewFindViewById = findViewById(nextFocusRightId);
        Intrinsics2.m13088d(viewFindViewById, "nextView");
        if (viewFindViewById.getVisibility() != 0) {
            m996s(viewFindViewById);
            return;
        }
        viewFindViewById.requestFocus();
        this.f1468Q = viewFindViewById;
        this.f1469R.onFocusChange(viewFindViewById, true);
    }

    public final void setButtonFocusChangeListener(b bVar) {
        Intrinsics2.m13089e(bVar, "<set-?>");
        this.f1469R = bVar;
    }

    public final void setControlsParent(ViewGroup viewGroup) {
        Intrinsics2.m13089e(viewGroup, "<set-?>");
        this.f1465N = viewGroup;
    }

    public final void setCurrentFocus(View view) {
        this.f1468Q = view;
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls, p007c.p008a.p009a.p010a.p011a.p012a.VideoControls
    public void setDuration(long j2) {
        ProgressBar progressBar = this.f1463L;
        if (progressBar == null) {
            Intrinsics2.m13096l("progressBar");
            throw null;
        }
        if (j2 != progressBar.getMax()) {
            getEndTimeTextView().setText(C0244f.m1022k(j2));
            ProgressBar progressBar2 = this.f1463L;
            if (progressBar2 != null) {
                progressBar2.setMax((int) j2);
            } else {
                Intrinsics2.m13096l("progressBar");
                throw null;
            }
        }
    }

    public final void setFastForwardButton(ImageButton imageButton) {
        this.f1466O = imageButton;
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    public void setFastForwardButtonEnabled(boolean z) {
        ImageButton imageButton = this.f1466O;
        if (imageButton != null) {
            imageButton.setEnabled(z);
            getEnabledViews().put(R.id.exomedia_controls_fast_forward_btn, z);
        }
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    public void setFastForwardButtonRemoved(boolean z) {
        ImageButton imageButton = this.f1466O;
        if (imageButton != null) {
            imageButton.setVisibility(z ? 8 : 0);
        }
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    public void setFastForwardDrawable(Drawable drawable) {
        Intrinsics2.m13089e(drawable, "drawable");
        ImageButton imageButton = this.f1466O;
        if (imageButton != null) {
            imageButton.setImageDrawable(drawable);
        }
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    public void setPosition(long j2) {
        getCurrentTimeTextView().setText(C0244f.m1022k(j2));
        ProgressBar progressBar = this.f1463L;
        if (progressBar != null) {
            progressBar.setProgress((int) j2);
        } else {
            Intrinsics2.m13096l("progressBar");
            throw null;
        }
    }

    public final void setProgressBar(ProgressBar progressBar) {
        Intrinsics2.m13089e(progressBar, "<set-?>");
        this.f1463L = progressBar;
    }

    public final void setRewindButton(ImageButton imageButton) {
        this.f1467P = imageButton;
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    public void setRewindButtonEnabled(boolean z) {
        ImageButton imageButton = this.f1467P;
        if (imageButton != null) {
            imageButton.setEnabled(z);
            getEnabledViews().put(R.id.exomedia_controls_rewind_btn, z);
        }
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    public void setRewindButtonRemoved(boolean z) {
        ImageButton imageButton = this.f1467P;
        if (imageButton != null) {
            imageButton.setVisibility(z ? 8 : 0);
        }
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    public void setRewindDrawable(Drawable drawable) {
        Intrinsics2.m13089e(drawable, "drawable");
        ImageButton imageButton = this.f1467P;
        if (imageButton != null) {
            imageButton.setImageDrawable(drawable);
        }
    }

    public final void setRippleIndicator(ImageView imageView) {
        Intrinsics2.m13089e(imageView, "<set-?>");
        this.f1464M = imageView;
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.DefaultVideoControls
    public void setup(Context context) {
        Intrinsics2.m13089e(context, "context");
        super.setup(context);
        setInternalListener(new d());
        e eVar = new e();
        setOnKeyListener(eVar);
        getPlayPauseButton().setOnKeyListener(eVar);
        getPreviousButton().setOnKeyListener(eVar);
        getNextButton().setOnKeyListener(eVar);
        ImageButton imageButton = this.f1467P;
        if (imageButton != null) {
            imageButton.setOnKeyListener(eVar);
        }
        ImageButton imageButton2 = this.f1466O;
        if (imageButton2 != null) {
            imageButton2.setOnKeyListener(eVar);
        }
        setFocusable(true);
    }

    /* JADX INFO: renamed from: t */
    public final void m997t(View view) {
        int nextFocusLeftId;
        if (view == null || (nextFocusLeftId = view.getNextFocusLeftId()) == -1) {
            return;
        }
        View viewFindViewById = findViewById(nextFocusLeftId);
        Intrinsics2.m13088d(viewFindViewById, "previousView");
        if (viewFindViewById.getVisibility() != 0) {
            m997t(viewFindViewById);
            return;
        }
        viewFindViewById.requestFocus();
        this.f1468Q = viewFindViewById;
        this.f1469R.onFocusChange(viewFindViewById, true);
    }

    /* JADX INFO: renamed from: u */
    public final void m998u() {
        if (getButtonsListener() != null) {
            VideoControlsButtonListener buttonsListener = getButtonsListener();
            Intrinsics2.m13087c(buttonsListener);
            if (buttonsListener.mo989c()) {
                return;
            }
        }
        getInternalListener().mo989c();
    }

    /* JADX INFO: renamed from: v */
    public final void m999v() {
        if (getButtonsListener() != null) {
            VideoControlsButtonListener buttonsListener = getButtonsListener();
            Intrinsics2.m13087c(buttonsListener);
            if (buttonsListener.mo988b()) {
                return;
            }
        }
        getInternalListener().mo988b();
    }

    /* JADX INFO: renamed from: w */
    public final void m1000w(long j2) {
        if (getSeekListener() != null) {
            VideoControlsSeekListener seekListener = getSeekListener();
            Intrinsics2.m13087c(seekListener);
            if (((DefaultVideoControls.c) seekListener).m992f(j2)) {
                return;
            }
        }
        mo972b();
        getInternalListener().m992f(j2);
    }

    /* JADX INFO: renamed from: x */
    public final void m1001x() {
        mo972b();
        VideoView videoView = getVideoView();
        if (videoView == null || !videoView.m12572a()) {
            return;
        }
        mo978j(this.f1431D);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoControlsLeanback(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f1469R = new b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoControlsLeanback(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f1469R = new b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoControlsLeanback(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f1469R = new b();
    }
}
