package p007c.p008a.p009a.p010a.p011a.p012a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.devbrackets.android.exomedia.p474ui.widget.VideoView;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import mtp.media.karaoke.R;
import p007c.p008a.p009a.p010a.C0244f;
import p007c.p008a.p009a.p010a.p027i.VideoControlsButtonListener;
import p007c.p008a.p009a.p010a.p027i.VideoControlsSeekListener;
import p007c.p008a.p009a.p010a.p027i.VideoControlsVisibilityListener;
import p007c.p008a.p009a.p010a.p028j.Repeater;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: c.a.a.a.a.a.a, reason: use source file name */
/* JADX INFO: compiled from: DefaultVideoControls.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class DefaultVideoControls extends RelativeLayout implements VideoControls {

    /* JADX INFO: renamed from: A */
    public VideoControlsVisibilityListener f1428A;

    /* JADX INFO: renamed from: B */
    public c f1429B;

    /* JADX INFO: renamed from: C */
    public SparseBooleanArray f1430C;

    /* JADX INFO: renamed from: D */
    public long f1431D;

    /* JADX INFO: renamed from: E */
    public boolean f1432E;

    /* JADX INFO: renamed from: F */
    public boolean f1433F;

    /* JADX INFO: renamed from: G */
    public boolean f1434G;

    /* JADX INFO: renamed from: H */
    public boolean f1435H;

    /* JADX INFO: renamed from: I */
    public long f1436I;

    /* JADX INFO: renamed from: i */
    public TextView f1437i;

    /* JADX INFO: renamed from: j */
    public TextView f1438j;

    /* JADX INFO: renamed from: k */
    public TextView f1439k;

    /* JADX INFO: renamed from: l */
    public TextView f1440l;

    /* JADX INFO: renamed from: m */
    public TextView f1441m;

    /* JADX INFO: renamed from: n */
    public ImageButton f1442n;

    /* JADX INFO: renamed from: o */
    public ImageButton f1443o;

    /* JADX INFO: renamed from: p */
    public ImageButton f1444p;

    /* JADX INFO: renamed from: q */
    public ProgressBar f1445q;

    /* JADX INFO: renamed from: r */
    public ViewGroup f1446r;

    /* JADX INFO: renamed from: s */
    public ViewGroup f1447s;

    /* JADX INFO: renamed from: t */
    public Drawable f1448t;

    /* JADX INFO: renamed from: u */
    public Drawable f1449u;

    /* JADX INFO: renamed from: v */
    public Handler f1450v;

    /* JADX INFO: renamed from: w */
    public Repeater f1451w;

    /* JADX INFO: renamed from: x */
    public VideoView f1452x;

    /* JADX INFO: renamed from: y */
    public VideoControlsSeekListener f1453y;

    /* JADX INFO: renamed from: z */
    public VideoControlsButtonListener f1454z;

    /* JADX INFO: renamed from: h */
    public static final b f1427h = new b(null);

    /* JADX INFO: renamed from: f */
    public static final int f1425f = 2000;

    /* JADX INFO: renamed from: g */
    public static final long f1426g = 300;

    /* JADX INFO: renamed from: c.a.a.a.a.a.a$a */
    /* JADX INFO: compiled from: java-style lambda group */
    public static final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f1455f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Object f1456g;

        public a(int i, Object obj) {
            this.f1455f = i;
            this.f1456g = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.f1455f;
            if (i == 0) {
                DefaultVideoControls defaultVideoControls = (DefaultVideoControls) this.f1456g;
                VideoControlsButtonListener videoControlsButtonListener = defaultVideoControls.f1454z;
                if (videoControlsButtonListener == null || !videoControlsButtonListener.mo990d()) {
                    defaultVideoControls.f1429B.mo990d();
                    return;
                }
                return;
            }
            if (i == 1) {
                DefaultVideoControls defaultVideoControls2 = (DefaultVideoControls) this.f1456g;
                VideoControlsButtonListener videoControlsButtonListener2 = defaultVideoControls2.f1454z;
                if (videoControlsButtonListener2 == null || !videoControlsButtonListener2.mo987a()) {
                    Objects.requireNonNull(defaultVideoControls2.f1429B);
                    return;
                }
                return;
            }
            if (i != 2) {
                throw null;
            }
            DefaultVideoControls defaultVideoControls3 = (DefaultVideoControls) this.f1456g;
            VideoControlsButtonListener videoControlsButtonListener3 = defaultVideoControls3.f1454z;
            if (videoControlsButtonListener3 == null || !videoControlsButtonListener3.mo991e()) {
                Objects.requireNonNull(defaultVideoControls3.f1429B);
            }
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.a.a.a$b */
    /* JADX INFO: compiled from: DefaultVideoControls.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.a.a.a$c */
    /* JADX INFO: compiled from: DefaultVideoControls.kt */
    public class c implements VideoControlsSeekListener, VideoControlsButtonListener {

        /* JADX INFO: renamed from: a */
        public boolean f1457a;

        public c() {
        }

        @Override // p007c.p008a.p009a.p010a.p027i.VideoControlsButtonListener
        /* JADX INFO: renamed from: a */
        public boolean mo987a() {
            return false;
        }

        @Override // p007c.p008a.p009a.p010a.p027i.VideoControlsButtonListener
        /* JADX INFO: renamed from: b */
        public boolean mo988b() {
            return false;
        }

        @Override // p007c.p008a.p009a.p010a.p027i.VideoControlsButtonListener
        /* JADX INFO: renamed from: c */
        public boolean mo989c() {
            return false;
        }

        @Override // p007c.p008a.p009a.p010a.p027i.VideoControlsButtonListener
        /* JADX INFO: renamed from: d */
        public boolean mo990d() {
            VideoView videoView = DefaultVideoControls.this.getVideoView();
            if (videoView == null) {
                return false;
            }
            if (videoView.m12572a()) {
                VideoView.m12571c(videoView, false, 1, null);
                return true;
            }
            videoView.m12575e();
            return true;
        }

        @Override // p007c.p008a.p009a.p010a.p027i.VideoControlsButtonListener
        /* JADX INFO: renamed from: e */
        public boolean mo991e() {
            return false;
        }

        /* JADX INFO: renamed from: f */
        public boolean m992f(long j2) {
            if (DefaultVideoControls.this.getVideoView() == null) {
                return false;
            }
            VideoView videoView = DefaultVideoControls.this.getVideoView();
            if (videoView != null) {
                VideoControls videoControls = videoView.f28219u;
                if (videoControls != null) {
                    videoControls.mo995f(false);
                }
                videoView.getVideoViewImpl().mo1096x(j2);
            }
            if (!this.f1457a) {
                return true;
            }
            this.f1457a = false;
            VideoView videoView2 = DefaultVideoControls.this.getVideoView();
            if (videoView2 != null) {
                videoView2.m12575e();
            }
            DefaultVideoControls defaultVideoControls = DefaultVideoControls.this;
            defaultVideoControls.mo978j(defaultVideoControls.f1431D);
            return true;
        }

        /* JADX INFO: renamed from: g */
        public boolean m993g() {
            if (DefaultVideoControls.this.getVideoView() == null) {
                return false;
            }
            VideoView videoView = DefaultVideoControls.this.getVideoView();
            if (videoView != null && videoView.m12572a()) {
                this.f1457a = true;
                VideoView videoView2 = DefaultVideoControls.this.getVideoView();
                if (videoView2 != null) {
                    videoView2.m12573b(true);
                }
            }
            DefaultVideoControls.this.mo972b();
            return true;
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.a.a.a$d */
    /* JADX INFO: compiled from: DefaultVideoControls.kt */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DefaultVideoControls.this.m977i();
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.a.a.a$e */
    /* JADX INFO: compiled from: DefaultVideoControls.kt */
    public static final class e extends Lambda implements InterfaceC6153a<Unit> {
        public e() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            DefaultVideoControls defaultVideoControls = DefaultVideoControls.this;
            VideoView videoView = defaultVideoControls.f1452x;
            if (videoView != null) {
                defaultVideoControls.mo985q(videoView.getCurrentPosition(), videoView.getDuration(), videoView.getBufferPercentage());
            }
            return Unit.f29502a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultVideoControls(Context context) {
        super(context);
        Intrinsics2.m13089e(context, "context");
        this.f1450v = new Handler();
        this.f1451w = new Repeater(false, 1, null);
        this.f1429B = new c();
        this.f1430C = new SparseBooleanArray();
        this.f1431D = f1425f;
        this.f1433F = true;
        this.f1434G = true;
        this.f1435H = true;
        Context context2 = getContext();
        Intrinsics2.m13088d(context2, "context");
        setup(context2);
    }

    public static final long getCONTROL_VISIBILITY_ANIMATION_LENGTH() {
        return f1426g;
    }

    public static final int getDEFAULT_CONTROL_HIDE_DELAY() {
        return f1425f;
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.VideoControls
    /* JADX INFO: renamed from: a */
    public void mo971a(VideoView videoView) {
        Intrinsics2.m13089e(videoView, "videoView");
        videoView.removeView(this);
        this.f1452x = null;
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.VideoControls
    /* JADX INFO: renamed from: b */
    public void mo972b() {
        this.f1450v.removeCallbacksAndMessages(null);
        clearAnimation();
        mo976h(true);
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.VideoControls
    /* JADX INFO: renamed from: c */
    public void mo973c(boolean z) {
        if (z) {
            mo978j(this.f1431D);
        } else {
            m977i();
        }
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.VideoControls
    /* JADX INFO: renamed from: d */
    public void mo974d(boolean z) {
        Drawable drawable;
        ImageButton imageButton = this.f1442n;
        if (imageButton == null) {
            Intrinsics2.m13096l("playPauseButton");
            throw null;
        }
        if (z) {
            drawable = this.f1449u;
            if (drawable == null) {
                Intrinsics2.m13096l("pauseDrawable");
                throw null;
            }
        } else {
            drawable = this.f1448t;
            if (drawable == null) {
                Intrinsics2.m13096l("playDrawable");
                throw null;
            }
        }
        imageButton.setImageDrawable(drawable);
        this.f1451w.m1213b();
        if (z) {
            mo978j(this.f1431D);
        } else {
            mo972b();
        }
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.VideoControls
    /* JADX INFO: renamed from: g */
    public void mo975g(VideoView videoView) {
        Intrinsics2.m13089e(videoView, "videoView");
        videoView.addView(this);
        this.f1452x = videoView;
    }

    public final VideoControlsButtonListener getButtonsListener() {
        return this.f1454z;
    }

    public final boolean getCanViewHide() {
        return this.f1434G;
    }

    public final ViewGroup getControlsContainer() {
        ViewGroup viewGroup = this.f1446r;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics2.m13096l("controlsContainer");
        throw null;
    }

    public final TextView getCurrentTimeTextView() {
        TextView textView = this.f1437i;
        if (textView != null) {
            return textView;
        }
        Intrinsics2.m13096l("currentTimeTextView");
        throw null;
    }

    public final TextView getDescriptionTextView() {
        TextView textView = this.f1441m;
        if (textView != null) {
            return textView;
        }
        Intrinsics2.m13096l("descriptionTextView");
        throw null;
    }

    public final SparseBooleanArray getEnabledViews() {
        return this.f1430C;
    }

    public final TextView getEndTimeTextView() {
        TextView textView = this.f1438j;
        if (textView != null) {
            return textView;
        }
        Intrinsics2.m13096l("endTimeTextView");
        throw null;
    }

    public List<View> getExtraViews() {
        return new LinkedList();
    }

    public final long getHideDelay() {
        return this.f1431D;
    }

    public final boolean getHideEmptyTextContainer() {
        return this.f1435H;
    }

    public final c getInternalListener() {
        return this.f1429B;
    }

    public abstract int getLayoutResource();

    public final ProgressBar getLoadingProgressBar() {
        ProgressBar progressBar = this.f1445q;
        if (progressBar != null) {
            return progressBar;
        }
        Intrinsics2.m13096l("loadingProgressBar");
        throw null;
    }

    public final ImageButton getNextButton() {
        ImageButton imageButton = this.f1444p;
        if (imageButton != null) {
            return imageButton;
        }
        Intrinsics2.m13096l("nextButton");
        throw null;
    }

    public final Drawable getPauseDrawable() {
        Drawable drawable = this.f1449u;
        if (drawable != null) {
            return drawable;
        }
        Intrinsics2.m13096l("pauseDrawable");
        throw null;
    }

    public final Drawable getPlayDrawable() {
        Drawable drawable = this.f1448t;
        if (drawable != null) {
            return drawable;
        }
        Intrinsics2.m13096l("playDrawable");
        throw null;
    }

    public final ImageButton getPlayPauseButton() {
        ImageButton imageButton = this.f1442n;
        if (imageButton != null) {
            return imageButton;
        }
        Intrinsics2.m13096l("playPauseButton");
        throw null;
    }

    public final ImageButton getPreviousButton() {
        ImageButton imageButton = this.f1443o;
        if (imageButton != null) {
            return imageButton;
        }
        Intrinsics2.m13096l("previousButton");
        throw null;
    }

    public final Repeater getProgressPollRepeater() {
        return this.f1451w;
    }

    public final VideoControlsSeekListener getSeekListener() {
        return this.f1453y;
    }

    public final TextView getSubTitleTextView() {
        TextView textView = this.f1440l;
        if (textView != null) {
            return textView;
        }
        Intrinsics2.m13096l("subTitleTextView");
        throw null;
    }

    public final ViewGroup getTextContainer() {
        ViewGroup viewGroup = this.f1447s;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics2.m13096l("textContainer");
        throw null;
    }

    public final TextView getTitleTextView() {
        TextView textView = this.f1439k;
        if (textView != null) {
            return textView;
        }
        Intrinsics2.m13096l("titleTextView");
        throw null;
    }

    public final VideoView getVideoView() {
        return this.f1452x;
    }

    public final Handler getVisibilityHandler() {
        return this.f1450v;
    }

    public final VideoControlsVisibilityListener getVisibilityListener() {
        return this.f1428A;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo976h(boolean z);

    /* JADX INFO: renamed from: i */
    public final void m977i() {
        if (!this.f1434G || this.f1432E) {
            return;
        }
        this.f1450v.removeCallbacksAndMessages(null);
        clearAnimation();
        mo976h(false);
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.VideoControls
    public boolean isVisible() {
        return this.f1433F;
    }

    /* JADX INFO: renamed from: j */
    public void mo978j(long j2) {
        this.f1431D = j2;
        if (j2 < 0 || !this.f1434G || this.f1432E) {
            return;
        }
        this.f1450v.postDelayed(new d(), j2);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m979k() {
        TextView textView = this.f1439k;
        if (textView == null) {
            Intrinsics2.m13096l("titleTextView");
            throw null;
        }
        CharSequence text = textView.getText();
        if (!(text == null || text.length() == 0)) {
            return false;
        }
        TextView textView2 = this.f1440l;
        if (textView2 == null) {
            Intrinsics2.m13096l("subTitleTextView");
            throw null;
        }
        CharSequence text2 = textView2.getText();
        if (!(text2 == null || text2.length() == 0)) {
            return false;
        }
        TextView textView3 = this.f1441m;
        if (textView3 != null) {
            CharSequence text3 = textView3.getText();
            return text3 == null || text3.length() == 0;
        }
        Intrinsics2.m13096l("descriptionTextView");
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public void mo980l() {
        ImageButton imageButton = this.f1442n;
        if (imageButton == null) {
            Intrinsics2.m13096l("playPauseButton");
            throw null;
        }
        imageButton.setOnClickListener(new a(0, this));
        ImageButton imageButton2 = this.f1443o;
        if (imageButton2 == null) {
            Intrinsics2.m13096l("previousButton");
            throw null;
        }
        imageButton2.setOnClickListener(new a(1, this));
        ImageButton imageButton3 = this.f1444p;
        if (imageButton3 != null) {
            imageButton3.setOnClickListener(new a(2, this));
        } else {
            Intrinsics2.m13096l("nextButton");
            throw null;
        }
    }

    /* JADX INFO: renamed from: m */
    public void mo981m() {
        View viewFindViewById = findViewById(R.id.exomedia_controls_current_time);
        Intrinsics2.m13088d(viewFindViewById, "findViewById(R.id.exomedia_controls_current_time)");
        this.f1437i = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.exomedia_controls_end_time);
        Intrinsics2.m13088d(viewFindViewById2, "findViewById(R.id.exomedia_controls_end_time)");
        this.f1438j = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.exomedia_controls_title);
        Intrinsics2.m13088d(viewFindViewById3, "findViewById(R.id.exomedia_controls_title)");
        this.f1439k = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.exomedia_controls_sub_title);
        Intrinsics2.m13088d(viewFindViewById4, "findViewById(R.id.exomedia_controls_sub_title)");
        this.f1440l = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.exomedia_controls_description);
        Intrinsics2.m13088d(viewFindViewById5, "findViewById(R.id.exomedia_controls_description)");
        this.f1441m = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.exomedia_controls_play_pause_btn);
        Intrinsics2.m13088d(viewFindViewById6, "findViewById(R.id.exomed…_controls_play_pause_btn)");
        this.f1442n = (ImageButton) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.exomedia_controls_previous_btn);
        Intrinsics2.m13088d(viewFindViewById7, "findViewById(R.id.exomedia_controls_previous_btn)");
        this.f1443o = (ImageButton) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.exomedia_controls_next_btn);
        Intrinsics2.m13088d(viewFindViewById8, "findViewById(R.id.exomedia_controls_next_btn)");
        this.f1444p = (ImageButton) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.exomedia_controls_video_loading);
        Intrinsics2.m13088d(viewFindViewById9, "findViewById(R.id.exomedia_controls_video_loading)");
        this.f1445q = (ProgressBar) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.exomedia_controls_interactive_container);
        Intrinsics2.m13088d(viewFindViewById10, "findViewById(R.id.exomed…ls_interactive_container)");
        this.f1446r = (ViewGroup) viewFindViewById10;
        View viewFindViewById11 = findViewById(R.id.exomedia_controls_text_container);
        Intrinsics2.m13088d(viewFindViewById11, "findViewById(R.id.exomed…_controls_text_container)");
        this.f1447s = (ViewGroup) viewFindViewById11;
    }

    /* JADX INFO: renamed from: n */
    public void mo982n() {
        mo983o(R.color.exomedia_default_controls_button_selector);
    }

    /* JADX INFO: renamed from: o */
    public void mo983o(int i) {
        Context context = getContext();
        Intrinsics2.m13088d(context, "context");
        this.f1448t = C0244f.m1025n(context, R.drawable.exomedia_ic_play_arrow_white, i);
        Context context2 = getContext();
        Intrinsics2.m13088d(context2, "context");
        this.f1449u = C0244f.m1025n(context2, R.drawable.exomedia_ic_pause_white, i);
        ImageButton imageButton = this.f1442n;
        if (imageButton == null) {
            Intrinsics2.m13096l("playPauseButton");
            throw null;
        }
        Drawable drawable = this.f1448t;
        if (drawable == null) {
            Intrinsics2.m13096l("playDrawable");
            throw null;
        }
        imageButton.setImageDrawable(drawable);
        Context context3 = getContext();
        Intrinsics2.m13088d(context3, "context");
        Drawable drawableM1025n = C0244f.m1025n(context3, R.drawable.exomedia_ic_skip_previous_white, i);
        ImageButton imageButton2 = this.f1443o;
        if (imageButton2 == null) {
            Intrinsics2.m13096l("previousButton");
            throw null;
        }
        imageButton2.setImageDrawable(drawableM1025n);
        Context context4 = getContext();
        Intrinsics2.m13088d(context4, "context");
        Drawable drawableM1025n2 = C0244f.m1025n(context4, R.drawable.exomedia_ic_skip_next_white, i);
        ImageButton imageButton3 = this.f1444p;
        if (imageButton3 != null) {
            imageButton3.setImageDrawable(drawableM1025n2);
        } else {
            Intrinsics2.m13096l("nextButton");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1451w.f1669f = new e();
        VideoView videoView = this.f1452x;
        if (videoView == null || !videoView.m12572a()) {
            return;
        }
        mo974d(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Repeater repeater = this.f1451w;
        repeater.m1212a().quit();
        repeater.f1664a = false;
        this.f1451w.f1669f = null;
    }

    /* JADX INFO: renamed from: p */
    public final void m984p(long j2) {
        if (Math.abs(j2 - this.f1436I) >= CloseCodes.NORMAL_CLOSURE || this.f1436I == 0) {
            this.f1436I = j2;
            TextView textView = this.f1437i;
            if (textView != null) {
                textView.setText(C0244f.m1022k(j2));
            } else {
                Intrinsics2.m13096l("currentTimeTextView");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo985q(long j2, long j3, int i);

    /* JADX INFO: renamed from: r */
    public abstract void mo986r();

    public final void setButtonListener(VideoControlsButtonListener videoControlsButtonListener) {
        this.f1454z = videoControlsButtonListener;
    }

    public final void setButtonsListener(VideoControlsButtonListener videoControlsButtonListener) {
        this.f1454z = videoControlsButtonListener;
    }

    public final void setCanHide(boolean z) {
        this.f1434G = z;
    }

    public final void setCanViewHide(boolean z) {
        this.f1434G = z;
    }

    public final void setControlsContainer(ViewGroup viewGroup) {
        Intrinsics2.m13089e(viewGroup, "<set-?>");
        this.f1446r = viewGroup;
    }

    public final void setCurrentTimeTextView(TextView textView) {
        Intrinsics2.m13089e(textView, "<set-?>");
        this.f1437i = textView;
    }

    public final void setDescription(CharSequence charSequence) {
        TextView textView = this.f1441m;
        if (textView == null) {
            Intrinsics2.m13096l("descriptionTextView");
            throw null;
        }
        textView.setText(charSequence);
        mo986r();
    }

    public final void setDescriptionTextView(TextView textView) {
        Intrinsics2.m13089e(textView, "<set-?>");
        this.f1441m = textView;
    }

    @Override // p007c.p008a.p009a.p010a.p011a.p012a.VideoControls
    public abstract /* synthetic */ void setDuration(long j2);

    public final void setEnabledViews(SparseBooleanArray sparseBooleanArray) {
        Intrinsics2.m13089e(sparseBooleanArray, "<set-?>");
        this.f1430C = sparseBooleanArray;
    }

    public final void setEndTimeTextView(TextView textView) {
        Intrinsics2.m13089e(textView, "<set-?>");
        this.f1438j = textView;
    }

    public void setFastForwardButtonEnabled(boolean z) {
    }

    public void setFastForwardButtonRemoved(boolean z) {
    }

    public void setFastForwardDrawable(Drawable drawable) {
        Intrinsics2.m13089e(drawable, "drawable");
    }

    public final void setHideDelay(long j2) {
        this.f1431D = j2;
    }

    public final void setHideEmptyTextContainer(boolean z) {
        this.f1435H = z;
        mo986r();
    }

    public final void setInternalListener(c cVar) {
        Intrinsics2.m13089e(cVar, "<set-?>");
        this.f1429B = cVar;
    }

    public final void setLoading(boolean z) {
        this.f1432E = z;
    }

    public final void setLoadingProgressBar(ProgressBar progressBar) {
        Intrinsics2.m13089e(progressBar, "<set-?>");
        this.f1445q = progressBar;
    }

    public final void setNextButton(ImageButton imageButton) {
        Intrinsics2.m13089e(imageButton, "<set-?>");
        this.f1444p = imageButton;
    }

    public final void setNextButtonEnabled(boolean z) {
        ImageButton imageButton = this.f1444p;
        if (imageButton == null) {
            Intrinsics2.m13096l("nextButton");
            throw null;
        }
        imageButton.setEnabled(z);
        this.f1430C.put(R.id.exomedia_controls_next_btn, z);
    }

    public final void setNextButtonRemoved(boolean z) {
        ImageButton imageButton = this.f1444p;
        if (imageButton != null) {
            imageButton.setVisibility(z ? 8 : 0);
        } else {
            Intrinsics2.m13096l("nextButton");
            throw null;
        }
    }

    public final void setNextDrawable(Drawable drawable) {
        Intrinsics2.m13089e(drawable, "drawable");
        ImageButton imageButton = this.f1444p;
        if (imageButton != null) {
            imageButton.setImageDrawable(drawable);
        } else {
            Intrinsics2.m13096l("nextButton");
            throw null;
        }
    }

    public final void setPauseDrawable(Drawable drawable) {
        Intrinsics2.m13089e(drawable, "<set-?>");
        this.f1449u = drawable;
    }

    public final void setPlayDrawable(Drawable drawable) {
        Intrinsics2.m13089e(drawable, "<set-?>");
        this.f1448t = drawable;
    }

    public final void setPlayPauseButton(ImageButton imageButton) {
        Intrinsics2.m13089e(imageButton, "<set-?>");
        this.f1442n = imageButton;
    }

    public abstract void setPosition(long j2);

    public final void setPreviousButton(ImageButton imageButton) {
        Intrinsics2.m13089e(imageButton, "<set-?>");
        this.f1443o = imageButton;
    }

    public final void setPreviousButtonEnabled(boolean z) {
        ImageButton imageButton = this.f1443o;
        if (imageButton == null) {
            Intrinsics2.m13096l("previousButton");
            throw null;
        }
        imageButton.setEnabled(z);
        this.f1430C.put(R.id.exomedia_controls_previous_btn, z);
    }

    public final void setPreviousButtonRemoved(boolean z) {
        ImageButton imageButton = this.f1443o;
        if (imageButton != null) {
            imageButton.setVisibility(z ? 8 : 0);
        } else {
            Intrinsics2.m13096l("previousButton");
            throw null;
        }
    }

    public final void setPreviousDrawable(Drawable drawable) {
        Intrinsics2.m13089e(drawable, "drawable");
        ImageButton imageButton = this.f1443o;
        if (imageButton != null) {
            imageButton.setImageDrawable(drawable);
        } else {
            Intrinsics2.m13096l("previousButton");
            throw null;
        }
    }

    public final void setProgressPollRepeater(Repeater repeater) {
        Intrinsics2.m13089e(repeater, "<set-?>");
        this.f1451w = repeater;
    }

    public void setRewindButtonEnabled(boolean z) {
    }

    public void setRewindButtonRemoved(boolean z) {
    }

    public void setRewindDrawable(Drawable drawable) {
        Intrinsics2.m13089e(drawable, "drawable");
    }

    public final void setSeekListener(VideoControlsSeekListener videoControlsSeekListener) {
        this.f1453y = videoControlsSeekListener;
    }

    public final void setSubTitle(CharSequence charSequence) {
        TextView textView = this.f1440l;
        if (textView == null) {
            Intrinsics2.m13096l("subTitleTextView");
            throw null;
        }
        textView.setText(charSequence);
        mo986r();
    }

    public final void setSubTitleTextView(TextView textView) {
        Intrinsics2.m13089e(textView, "<set-?>");
        this.f1440l = textView;
    }

    public final void setTextContainer(ViewGroup viewGroup) {
        Intrinsics2.m13089e(viewGroup, "<set-?>");
        this.f1447s = viewGroup;
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.f1439k;
        if (textView == null) {
            Intrinsics2.m13096l("titleTextView");
            throw null;
        }
        textView.setText(charSequence);
        mo986r();
    }

    public final void setTitleTextView(TextView textView) {
        Intrinsics2.m13089e(textView, "<set-?>");
        this.f1439k = textView;
    }

    public final void setVideoView(VideoView videoView) {
        this.f1452x = videoView;
    }

    public final void setVisibilityHandler(Handler handler) {
        Intrinsics2.m13089e(handler, "<set-?>");
        this.f1450v = handler;
    }

    public final void setVisibilityListener(VideoControlsVisibilityListener videoControlsVisibilityListener) {
        this.f1428A = videoControlsVisibilityListener;
    }

    public void setVisible(boolean z) {
        this.f1433F = z;
    }

    public void setup(Context context) {
        Intrinsics2.m13089e(context, "context");
        View.inflate(context, getLayoutResource(), this);
        mo981m();
        mo980l();
        mo982n();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultVideoControls(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f1450v = new Handler();
        this.f1451w = new Repeater(false, 1, null);
        this.f1429B = new c();
        this.f1430C = new SparseBooleanArray();
        this.f1431D = f1425f;
        this.f1433F = true;
        this.f1434G = true;
        this.f1435H = true;
        Context context2 = getContext();
        Intrinsics2.m13088d(context2, "context");
        setup(context2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultVideoControls(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f1450v = new Handler();
        this.f1451w = new Repeater(false, 1, null);
        this.f1429B = new c();
        this.f1430C = new SparseBooleanArray();
        this.f1431D = f1425f;
        this.f1433F = true;
        this.f1434G = true;
        this.f1435H = true;
        Context context2 = getContext();
        Intrinsics2.m13088d(context2, "context");
        setup(context2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultVideoControls(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f1450v = new Handler();
        this.f1451w = new Repeater(false, 1, null);
        this.f1429B = new c();
        this.f1430C = new SparseBooleanArray();
        this.f1431D = f1425f;
        this.f1433F = true;
        this.f1434G = true;
        this.f1435H = true;
        Context context2 = getContext();
        Intrinsics2.m13088d(context2, "context");
        setup(context2);
    }
}
