package com.devbrackets.android.exomedia.p474ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.Map;
import java.util.Objects;
import mtp.media.karaoke.R;
import p007c.p008a.p009a.p010a.C0244f;
import p007c.p008a.p009a.p010a.C0245g;
import p007c.p008a.p009a.p010a.ExoMedia3;
import p007c.p008a.p009a.p010a.p011a.p012a.VideoControls;
import p007c.p008a.p009a.p010a.p011a.p012a.VideoControlsLeanback;
import p007c.p008a.p009a.p010a.p011a.p012a.VideoControlsMobile;
import p007c.p008a.p009a.p010a.p014h.ListenerMux;
import p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi;
import p007c.p008a.p009a.p010a.p014h.p018g.ExoMediaPlayer;
import p007c.p008a.p009a.p010a.p014h.p018g.WindowInfo;
import p007c.p008a.p009a.p010a.p014h.p019h.CaptionListener;
import p007c.p008a.p009a.p010a.p014h.p019h.MetadataListener;
import p007c.p008a.p009a.p010a.p014h.p023k.p026f.ScaleType;
import p007c.p008a.p009a.p010a.p027i.OnBufferUpdateListener;
import p007c.p008a.p009a.p010a.p027i.OnCompletionListener2;
import p007c.p008a.p009a.p010a.p027i.OnErrorListener2;
import p007c.p008a.p009a.p010a.p027i.OnPreparedListener2;
import p007c.p008a.p009a.p010a.p027i.OnSeekCompletionListener;
import p007c.p008a.p009a.p010a.p027i.OnVideoSizeChangedListener2;
import p007c.p008a.p009a.p010a.p028j.DeviceUtil;
import p007c.p008a.p009a.p010a.p028j.StopWatch;
import p007c.p190n.p194b.p209b.p214m1.AnalyticsListener2;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p477d1.Lazy3;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p483s._Arrays;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: compiled from: VideoView.kt */
/* JADX INFO: loaded from: classes.dex */
public class VideoView extends RelativeLayout {

    /* JADX INFO: renamed from: f */
    public final Lazy3 f28204f;

    /* JADX INFO: renamed from: g */
    public final Lazy3 f28205g;

    /* JADX INFO: renamed from: h */
    public Uri f28206h;

    /* JADX INFO: renamed from: i */
    public DeviceUtil f28207i;

    /* JADX INFO: renamed from: j */
    public AudioManager f28208j;

    /* JADX INFO: renamed from: k */
    public C5792b f28209k;

    /* JADX INFO: renamed from: l */
    public long f28210l;

    /* JADX INFO: renamed from: m */
    public long f28211m;

    /* JADX INFO: renamed from: n */
    public boolean f28212n;

    /* JADX INFO: renamed from: o */
    public boolean f28213o;

    /* JADX INFO: renamed from: p */
    public StopWatch f28214p;

    /* JADX INFO: renamed from: q */
    public C5793c f28215q;

    /* JADX INFO: renamed from: r */
    public final Lazy3 f28216r;

    /* JADX INFO: renamed from: s */
    public boolean f28217s;

    /* JADX INFO: renamed from: t */
    public boolean f28218t;

    /* JADX INFO: renamed from: u */
    public VideoControls f28219u;

    /* JADX INFO: renamed from: com.devbrackets.android.exomedia.ui.widget.VideoView$a */
    /* JADX INFO: compiled from: VideoView.kt */
    public final class C5791a {

        /* JADX INFO: renamed from: a */
        public boolean f28220a;

        /* JADX INFO: renamed from: b */
        public boolean f28221b;

        /* JADX INFO: renamed from: c */
        public int f28222c;

        /* JADX INFO: renamed from: d */
        public int f28223d;

        /* JADX INFO: renamed from: e */
        public ScaleType f28224e;

        /* JADX INFO: renamed from: f */
        public Boolean f28225f;

        /* JADX INFO: renamed from: com.devbrackets.android.exomedia.ui.widget.VideoView$a$a */
        /* JADX INFO: compiled from: VideoView.kt */
        public static final class a extends Lambda implements InterfaceC6164l<TypedArray, Unit> {
            public a() {
                super(1);
            }

            @Override // p477d1.p493x.p494b.InterfaceC6164l
            /* JADX INFO: renamed from: b */
            public Unit mo3b(TypedArray typedArray) {
                TypedArray typedArray2 = typedArray;
                Intrinsics2.m13089e(typedArray2, "typedArray");
                C5791a c5791a = C5791a.this;
                c5791a.f28220a = typedArray2.getBoolean(1, c5791a.f28220a);
                C5791a c5791a2 = C5791a.this;
                c5791a2.f28221b = typedArray2.getBoolean(2, c5791a2.f28221b);
                if (typedArray2.hasValue(3)) {
                    C5791a c5791a3 = C5791a.this;
                    ScaleType.a aVar = ScaleType.f1660m;
                    int i = typedArray2.getInt(3, -1);
                    Objects.requireNonNull(aVar);
                    ScaleType[] scaleTypeArrValues = ScaleType.values();
                    c5791a3.f28224e = (i < 0 || i > _Arrays.m13032f(scaleTypeArrValues)) ? ScaleType.NONE : scaleTypeArrValues[i];
                }
                if (typedArray2.hasValue(0)) {
                    C5791a.this.f28225f = Boolean.valueOf(typedArray2.getBoolean(0, false));
                }
                C5791a c5791a4 = C5791a.this;
                boolean z = c5791a4.f28221b;
                int i2 = z ? R.layout.exomedia_default_exo_texture_video_view : R.layout.exomedia_default_exo_surface_video_view;
                c5791a4.f28222c = i2;
                c5791a4.f28223d = z ? R.layout.exomedia_default_native_texture_video_view : R.layout.exomedia_default_native_surface_video_view;
                c5791a4.f28222c = typedArray2.getResourceId(4, i2);
                C5791a c5791a5 = C5791a.this;
                c5791a5.f28223d = typedArray2.getResourceId(5, c5791a5.f28223d);
                return Unit.f29502a;
            }
        }

        public C5791a(VideoView videoView, Context context, AttributeSet attributeSet) {
            Intrinsics2.m13089e(context, "context");
            this.f28222c = R.layout.exomedia_default_exo_texture_video_view;
            this.f28223d = R.layout.exomedia_default_native_texture_video_view;
            int[] iArr = C0245g.f1503a;
            Intrinsics2.m13088d(iArr, "R.styleable.VideoView");
            a aVar = new a();
            if (attributeSet == null) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
            Intrinsics2.m13088d(typedArrayObtainStyledAttributes, "it");
            aVar.mo3b(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: com.devbrackets.android.exomedia.ui.widget.VideoView$b */
    /* JADX INFO: compiled from: VideoView.kt */
    public final class C5792b implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public boolean f28227a;

        /* JADX INFO: renamed from: b */
        public boolean f28228b;

        /* JADX INFO: renamed from: c */
        public int f28229c;

        /* JADX INFO: renamed from: d */
        @TargetApi(26)
        public AudioFocusRequest f28230d;

        public C5792b() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m12577a() {
            int iAbandonAudioFocus;
            if (!VideoView.this.getHandleAudioFocus()) {
                return true;
            }
            if (VideoView.this.getAudioManager() == null) {
                return false;
            }
            this.f28227a = false;
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = this.f28230d;
                if (audioFocusRequest != null) {
                    AudioManager audioManager = VideoView.this.getAudioManager();
                    Intrinsics2.m13087c(audioManager);
                    iAbandonAudioFocus = audioManager.abandonAudioFocusRequest(audioFocusRequest);
                    if (1 == iAbandonAudioFocus) {
                        this.f28230d = null;
                    }
                } else {
                    iAbandonAudioFocus = 1;
                }
            } else {
                AudioManager audioManager2 = VideoView.this.getAudioManager();
                Intrinsics2.m13087c(audioManager2);
                iAbandonAudioFocus = audioManager2.abandonAudioFocus(this);
            }
            return 1 == iAbandonAudioFocus;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (!VideoView.this.getHandleAudioFocus() || this.f28229c == i) {
                return;
            }
            this.f28229c = i;
            if (i == -3 || i == -2) {
                if (VideoView.this.m12572a()) {
                    this.f28228b = true;
                    VideoView.this.m12573b(true);
                    return;
                }
                return;
            }
            if (i == -1) {
                if (VideoView.this.m12572a()) {
                    this.f28228b = true;
                    VideoView.m12571c(VideoView.this, false, 1, null);
                    return;
                }
                return;
            }
            if (i == 1 || i == 2) {
                if (this.f28227a || this.f28228b) {
                    VideoView.this.m12575e();
                    this.f28227a = false;
                    this.f28228b = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.devbrackets.android.exomedia.ui.widget.VideoView$c */
    /* JADX INFO: compiled from: VideoView.kt */
    public final class C5793c extends ListenerMux.b {

        /* JADX INFO: renamed from: a */
        public OnVideoSizeChangedListener2 f28232a;

        public C5793c() {
        }

        @Override // p007c.p008a.p009a.p010a.p014h.ListenerMux.b
        /* JADX INFO: renamed from: a */
        public void mo1007a(ExoMediaPlayer exoMediaPlayer, Exception exc) {
            Intrinsics2.m13089e(exoMediaPlayer, "exoMediaPlayer");
            VideoView.this.m12576f(true);
            exoMediaPlayer.f1538m = false;
        }

        @Override // p007c.p008a.p009a.p010a.p014h.ListenerMux.b
        /* JADX INFO: renamed from: b */
        public void mo1008b() {
            VideoView.this.setKeepScreenOn(false);
            VideoView.this.m12576f(false);
        }

        @Override // p007c.p008a.p009a.p010a.p014h.ListenerMux.b
        /* JADX INFO: renamed from: c */
        public void mo1009c() {
            VideoControls videoControls = VideoView.this.getVideoControls();
            if (videoControls != null) {
                videoControls.setDuration(VideoView.this.getDuration());
            }
            VideoControls videoControls2 = VideoView.this.getVideoControls();
            if (videoControls2 != null) {
                videoControls2.mo994e();
            }
        }

        @Override // p007c.p008a.p009a.p010a.p014h.ListenerMux.b
        /* JADX INFO: renamed from: d */
        public void mo1089d(boolean z) {
            ImageView previewImageView = VideoView.this.getPreviewImageView();
            if (previewImageView != null) {
                previewImageView.setVisibility(z ? 0 : 8);
            }
        }

        @Override // p007c.p008a.p009a.p010a.p014h.ListenerMux.b
        /* JADX INFO: renamed from: e */
        public void mo1090e() {
            VideoControls videoControls = VideoView.this.getVideoControls();
            if (videoControls != null) {
                videoControls.mo994e();
            }
        }

        @Override // p007c.p008a.p009a.p010a.p014h.ListenerMux.b
        /* JADX INFO: renamed from: f */
        public void mo1091f(int i, int i2, int i3, float f) {
            VideoView.this.getVideoViewImpl().m1093b(i3, false);
            VideoView.this.getVideoViewImpl().mo1092a(i, i2, f);
            OnVideoSizeChangedListener2 onVideoSizeChangedListener2 = this.f28232a;
            if (onVideoSizeChangedListener2 != null) {
                onVideoSizeChangedListener2.m1208a(i, i2, f);
            }
        }

        @Override // p007c.p008a.p009a.p010a.p014h.ListenerMux.b
        /* JADX INFO: renamed from: g */
        public boolean mo1010g(long j2) {
            long currentPosition = VideoView.this.getCurrentPosition();
            long duration = VideoView.this.getDuration();
            return currentPosition > 0 && duration > 0 && currentPosition + j2 >= duration;
        }
    }

    /* JADX INFO: renamed from: com.devbrackets.android.exomedia.ui.widget.VideoView$d */
    /* JADX INFO: compiled from: VideoView.kt */
    public final class ViewOnTouchListenerC5794d extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

        /* JADX INFO: renamed from: f */
        public final Lazy3 f28234f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ VideoView f28235g;

        /* JADX INFO: renamed from: com.devbrackets.android.exomedia.ui.widget.VideoView$d$a */
        /* JADX INFO: compiled from: VideoView.kt */
        public static final class a extends Lambda implements InterfaceC6153a<GestureDetector> {

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ Context f28237h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(0);
                this.f28237h = context;
            }

            @Override // p477d1.p493x.p494b.InterfaceC6153a
            /* JADX INFO: renamed from: c */
            public GestureDetector mo2c() {
                return new GestureDetector(this.f28237h, ViewOnTouchListenerC5794d.this);
            }
        }

        public ViewOnTouchListenerC5794d(VideoView videoView, Context context) {
            Intrinsics2.m13089e(context, "context");
            this.f28235g = videoView;
            this.f28234f = LazyJVM.m13021b(new a(context));
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            VideoControls videoControls;
            Intrinsics2.m13089e(motionEvent, "event");
            VideoControls videoControls2 = this.f28235g.getVideoControls();
            if (videoControls2 == null || !videoControls2.isVisible()) {
                VideoView videoView = this.f28235g;
                VideoControls videoControls3 = videoView.f28219u;
                if (videoControls3 != null) {
                    videoControls3.mo972b();
                }
                if (videoView.m12572a() && (videoControls = videoView.f28219u) != null) {
                    videoControls.mo973c(true);
                }
            } else {
                VideoControls videoControls4 = this.f28235g.getVideoControls();
                if (videoControls4 != null) {
                    videoControls4.mo973c(false);
                }
            }
            return true;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics2.m13089e(view, "view");
            Intrinsics2.m13089e(motionEvent, "event");
            ((GestureDetector) this.f28234f.getValue()).onTouchEvent(motionEvent);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.devbrackets.android.exomedia.ui.widget.VideoView$e */
    /* JADX INFO: compiled from: VideoView.kt */
    public static final class C5795e extends Lambda implements InterfaceC6153a<ListenerMux> {
        public C5795e() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ListenerMux mo2c() {
            return new ListenerMux(VideoView.this.getMuxNotifier());
        }
    }

    /* JADX INFO: renamed from: com.devbrackets.android.exomedia.ui.widget.VideoView$f */
    /* JADX INFO: compiled from: VideoView.kt */
    public static final class C5796f extends Lambda implements InterfaceC6153a<ImageView> {
        public C5796f() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ImageView mo2c() {
            return (ImageView) VideoView.this.findViewById(R.id.exomedia_video_preview_image);
        }
    }

    /* JADX INFO: renamed from: com.devbrackets.android.exomedia.ui.widget.VideoView$g */
    /* JADX INFO: compiled from: VideoView.kt */
    public static final class C5797g extends Lambda implements InterfaceC6153a<VideoViewApi> {
        public C5797g() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public VideoViewApi mo2c() {
            KeyEvent.Callback callbackFindViewById = VideoView.this.findViewById(R.id.exomedia_video_view);
            Objects.requireNonNull(callbackFindViewById, "null cannot be cast to non-null type com.devbrackets.android.exomedia.core.api.VideoViewApi");
            return (VideoViewApi) callbackFindViewById;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoView(Context context) {
        super(context);
        Intrinsics2.m13089e(context, "context");
        this.f28204f = LazyJVM.m13021b(new C5796f());
        this.f28205g = LazyJVM.m13021b(new C5797g());
        this.f28207i = new DeviceUtil();
        this.f28209k = new C5792b();
        this.f28211m = -1L;
        this.f28213o = true;
        this.f28214p = new StopWatch(false, 1, null);
        this.f28215q = new C5793c();
        this.f28216r = LazyJVM.m13021b(new C5795e());
        this.f28217s = true;
        this.f28218t = true;
        m12574d(context, null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m12571c(VideoView videoView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        videoView.m12573b(z);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12572a() {
        return getVideoViewImpl().isPlaying();
    }

    /* JADX INFO: renamed from: b */
    public final void m12573b(boolean z) {
        if (!z) {
            this.f28209k.m12577a();
        }
        getVideoViewImpl().pause();
        setKeepScreenOn(false);
        VideoControls videoControls = this.f28219u;
        if (videoControls != null) {
            videoControls.mo974d(false);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m12574d(Context context, AttributeSet attributeSet) {
        VideoControls videoControlsMobile;
        Intrinsics2.m13089e(context, "context");
        if (isInEditMode()) {
            return;
        }
        Object systemService = context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f28208j = (AudioManager) systemService;
        C5791a c5791a = new C5791a(this, context, attributeSet);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(c5791a, "attributeContainer");
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(c5791a, "attributeContainer");
        View.inflate(context, R.layout.exomedia_video_view_layout, this);
        ViewStub viewStub = (ViewStub) findViewById(R.id.video_view_api_impl_stub);
        Intrinsics2.m13088d(viewStub, "videoViewStub");
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(c5791a, "attributeContainer");
        viewStub.setLayoutResource(this.f28207i.m1211a(context) ^ true ? c5791a.f28223d : c5791a.f28222c);
        viewStub.inflate();
        getVideoViewImpl().setListenerMux(getListenerMux());
        Intrinsics2.m13089e(c5791a, "attributeContainer");
        if (c5791a.f28220a) {
            Context context2 = getContext();
            Intrinsics2.m13088d(context2, "context");
            if (C0244f.m1020i(context2)) {
                Context context3 = getContext();
                Intrinsics2.m13088d(context3, "context");
                videoControlsMobile = new VideoControlsLeanback(context3);
            } else {
                Context context4 = getContext();
                Intrinsics2.m13088d(context4, "context");
                videoControlsMobile = new VideoControlsMobile(context4);
            }
            setVideoControls(videoControlsMobile);
        }
        ScaleType scaleType = c5791a.f28224e;
        if (scaleType != null) {
            setScaleType(scaleType);
        }
        Boolean bool = c5791a.f28225f;
        if (bool != null) {
            setMeasureBasedOnAspectRatioEnabled(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12575e() {
        boolean z;
        int iRequestAudioFocus;
        C5792b c5792b = this.f28209k;
        if (!VideoView.this.getHandleAudioFocus() || c5792b.f28229c == 1) {
            z = true;
        } else {
            z = false;
            if (VideoView.this.getAudioManager() != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).build();
                    AudioManager audioManager = VideoView.this.getAudioManager();
                    Intrinsics2.m13087c(audioManager);
                    iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequestBuild);
                    c5792b.f28230d = audioFocusRequestBuild;
                } else {
                    AudioManager audioManager2 = VideoView.this.getAudioManager();
                    Intrinsics2.m13087c(audioManager2);
                    iRequestAudioFocus = audioManager2.requestAudioFocus(c5792b, 3, 1);
                }
                if (1 == iRequestAudioFocus) {
                    c5792b.f28229c = 1;
                    z = true;
                } else {
                    c5792b.f28227a = true;
                }
            }
        }
        if (z) {
            getVideoViewImpl().start();
            setKeepScreenOn(true);
            VideoControls videoControls = this.f28219u;
            if (videoControls != null) {
                videoControls.mo974d(true);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12576f(boolean z) {
        this.f28209k.m12577a();
        getVideoViewImpl().mo1094c(z);
        setKeepScreenOn(false);
        VideoControls videoControls = this.f28219u;
        if (videoControls != null) {
            videoControls.mo974d(false);
        }
    }

    public final C5792b getAudioFocusHelper() {
        return this.f28209k;
    }

    public final AudioManager getAudioManager() {
        return this.f28208j;
    }

    public final Map<ExoMedia3, TrackGroupArray> getAvailableTracks() {
        return getVideoViewImpl().getAvailableTracks();
    }

    public final Bitmap getBitmap() {
        Object videoViewImpl = getVideoViewImpl();
        if (!(videoViewImpl instanceof TextureView)) {
            videoViewImpl = null;
        }
        TextureView textureView = (TextureView) videoViewImpl;
        if (textureView != null) {
            return textureView.getBitmap();
        }
        return null;
    }

    public final int getBufferPercentage() {
        return getVideoViewImpl().getBufferedPercent();
    }

    public final long getCurrentPosition() {
        if (!this.f28212n) {
            return this.f28210l + getVideoViewImpl().getCurrentPosition();
        }
        long j2 = this.f28210l;
        StopWatch stopWatch = this.f28214p;
        return j2 + stopWatch.f1677e + stopWatch.f1678f;
    }

    public final DeviceUtil getDeviceUtil() {
        return this.f28207i;
    }

    public final long getDuration() {
        long j2 = this.f28211m;
        return j2 >= 0 ? j2 : getVideoViewImpl().getDuration();
    }

    public final boolean getHandleAudioFocus() {
        return this.f28218t;
    }

    public final ListenerMux getListenerMux() {
        return (ListenerMux) this.f28216r.getValue();
    }

    public final boolean getMatchOverridePositionSpeed() {
        return this.f28213o;
    }

    public final C5793c getMuxNotifier() {
        return this.f28215q;
    }

    public final long getOverriddenDuration() {
        return this.f28211m;
    }

    public final StopWatch getOverriddenPositionStopWatch() {
        return this.f28214p;
    }

    public final boolean getOverridePosition() {
        return this.f28212n;
    }

    public final float getPlaybackSpeed() {
        return getVideoViewImpl().getPlaybackSpeed();
    }

    public final long getPositionOffset() {
        return this.f28210l;
    }

    public final ImageView getPreviewImageView() {
        return (ImageView) this.f28204f.getValue();
    }

    public final boolean getReleaseOnDetachFromWindow() {
        return this.f28217s;
    }

    public final VideoControls getVideoControls() {
        return this.f28219u;
    }

    public final Uri getVideoUri() {
        return this.f28206h;
    }

    public final VideoViewApi getVideoViewImpl() {
        return (VideoViewApi) this.f28205g.getValue();
    }

    public final float getVolume() {
        return getVideoViewImpl().getVolume();
    }

    public final WindowInfo getWindowInfo() {
        return getVideoViewImpl().getWindowInfo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (isInEditMode() || !this.f28217s) {
            return;
        }
        VideoControls videoControls = this.f28219u;
        if (videoControls != null) {
            videoControls.mo971a(this);
        }
        setVideoControls(null);
        m12576f(true);
        Objects.requireNonNull(this.f28214p);
        getVideoViewImpl().release();
    }

    public final void setAnalyticsListener(AnalyticsListener2 analyticsListener2) {
        getListenerMux().f1511m = analyticsListener2;
    }

    public final void setAudioFocusHelper(C5792b c5792b) {
        Intrinsics2.m13089e(c5792b, "<set-?>");
        this.f28209k = c5792b;
    }

    public final void setAudioManager(AudioManager audioManager) {
        this.f28208j = audioManager;
    }

    public final void setCaptionListener(CaptionListener captionListener) {
        getVideoViewImpl().setCaptionListener(captionListener);
    }

    public final void setDeviceUtil(DeviceUtil deviceUtil) {
        Intrinsics2.m13089e(deviceUtil, "<set-?>");
        this.f28207i = deviceUtil;
    }

    public final void setDrmSessionManager(DrmSessionManager2 drmSessionManager2) {
        getVideoViewImpl().setDrmSessionManager(drmSessionManager2);
    }

    public final void setHandleAudioFocus(boolean z) {
        this.f28209k.m12577a();
        this.f28218t = z;
    }

    public final void setId3MetadataListener(MetadataListener metadataListener) {
        getListenerMux().f1510l = metadataListener;
    }

    public final void setMatchOverridePositionSpeed(boolean z) {
        this.f28213o = z;
    }

    public final void setMeasureBasedOnAspectRatioEnabled(boolean z) {
        getVideoViewImpl().setMeasureBasedOnAspectRatioEnabled(z);
    }

    public final void setMuxNotifier(C5793c c5793c) {
        Intrinsics2.m13089e(c5793c, "<set-?>");
        this.f28215q = c5793c;
    }

    public final void setOnBufferUpdateListener(OnBufferUpdateListener onBufferUpdateListener) {
        getListenerMux().f1507i = onBufferUpdateListener;
    }

    public final void setOnCompletionListener(OnCompletionListener2 onCompletionListener2) {
        getListenerMux().f1506h = onCompletionListener2;
    }

    public final void setOnErrorListener(OnErrorListener2 onErrorListener2) {
        getListenerMux().f1509k = onErrorListener2;
    }

    public final void setOnPreparedListener(OnPreparedListener2 onPreparedListener2) {
        getListenerMux().f1505g = onPreparedListener2;
    }

    public final void setOnSeekCompletionListener(OnSeekCompletionListener onSeekCompletionListener) {
        getListenerMux().f1508j = onSeekCompletionListener;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        getVideoViewImpl().setOnTouchListener(onTouchListener);
        super.setOnTouchListener(onTouchListener);
    }

    public final void setOnVideoSizedChangedListener(OnVideoSizeChangedListener2 onVideoSizeChangedListener2) {
        this.f28215q.f28232a = onVideoSizeChangedListener2;
    }

    public final void setOverriddenDuration(long j2) {
        this.f28211m = j2;
    }

    public final void setOverriddenPositionStopWatch(StopWatch stopWatch) {
        Intrinsics2.m13089e(stopWatch, "<set-?>");
        this.f28214p = stopWatch;
    }

    public final void setOverridePosition(boolean z) {
        this.f28212n = z;
    }

    public final void setOverridePositionMatchesPlaybackSpeed(boolean z) {
        if (z != this.f28213o) {
            this.f28213o = z;
            if (!z) {
                this.f28214p.f1679g = 1.0f;
            } else {
                this.f28214p.f1679g = getPlaybackSpeed();
            }
        }
    }

    public final void setPositionOffset(long j2) {
        this.f28210l = j2;
    }

    public final void setPreviewImage(Drawable drawable) {
        ImageView previewImageView = getPreviewImageView();
        if (previewImageView != null) {
            previewImageView.setImageDrawable(drawable);
        }
    }

    public final void setReleaseOnDetachFromWindow(boolean z) {
        this.f28217s = z;
    }

    public final void setRepeatMode(int i) {
        getVideoViewImpl().setRepeatMode(i);
    }

    public final void setScaleType(ScaleType scaleType) {
        Intrinsics2.m13089e(scaleType, "scaleType");
        getVideoViewImpl().setScaleType(scaleType);
    }

    public final void setVideoControls(VideoControls videoControls) {
        ViewOnTouchListenerC5794d viewOnTouchListenerC5794d;
        VideoControls videoControls2;
        if ((!Intrinsics2.m13085a(this.f28219u, videoControls)) && (videoControls2 = this.f28219u) != null) {
            videoControls2.mo971a(this);
        }
        this.f28219u = videoControls;
        if (videoControls != null) {
            videoControls.mo975g(this);
        }
        if (this.f28219u != null) {
            Context context = getContext();
            Intrinsics2.m13088d(context, "context");
            viewOnTouchListenerC5794d = new ViewOnTouchListenerC5794d(this, context);
        } else {
            viewOnTouchListenerC5794d = null;
        }
        setOnTouchListener(viewOnTouchListenerC5794d);
    }

    public final void setVideoPath(String str) {
        Intrinsics2.m13089e(str, "path");
        setVideoURI(Uri.parse(str));
    }

    public final void setVideoRotation(int i) {
        getVideoViewImpl().m1093b(i, true);
    }

    public final void setVideoURI(Uri uri) {
        this.f28206h = uri;
        getVideoViewImpl().setVideoUri(uri);
        VideoControls videoControls = this.f28219u;
        if (videoControls != null) {
            videoControls.mo995f(true);
        }
    }

    public final void setVideoUri(Uri uri) {
        this.f28206h = uri;
    }

    public final void setVolume(float f) {
        getVideoViewImpl().setVolume(f);
    }

    public final void setPreviewImage(int i) {
        ImageView previewImageView = getPreviewImageView();
        if (previewImageView != null) {
            previewImageView.setImageResource(i);
        }
    }

    public final void setPreviewImage(Bitmap bitmap) {
        ImageView previewImageView = getPreviewImageView();
        if (previewImageView != null) {
            previewImageView.setImageBitmap(bitmap);
        }
    }

    public final void setPreviewImage(Uri uri) {
        ImageView previewImageView = getPreviewImageView();
        if (previewImageView != null) {
            previewImageView.setImageURI(uri);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f28204f = LazyJVM.m13021b(new C5796f());
        this.f28205g = LazyJVM.m13021b(new C5797g());
        this.f28207i = new DeviceUtil();
        this.f28209k = new C5792b();
        this.f28211m = -1L;
        this.f28213o = true;
        this.f28214p = new StopWatch(false, 1, null);
        this.f28215q = new C5793c();
        this.f28216r = LazyJVM.m13021b(new C5795e());
        this.f28217s = true;
        this.f28218t = true;
        m12574d(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @TargetApi(11)
    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f28204f = LazyJVM.m13021b(new C5796f());
        this.f28205g = LazyJVM.m13021b(new C5797g());
        this.f28207i = new DeviceUtil();
        this.f28209k = new C5792b();
        this.f28211m = -1L;
        this.f28213o = true;
        this.f28214p = new StopWatch(false, 1, null);
        this.f28215q = new C5793c();
        this.f28216r = LazyJVM.m13021b(new C5795e());
        this.f28217s = true;
        this.f28218t = true;
        m12574d(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public VideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f28204f = LazyJVM.m13021b(new C5796f());
        this.f28205g = LazyJVM.m13021b(new C5797g());
        this.f28207i = new DeviceUtil();
        this.f28209k = new C5792b();
        this.f28211m = -1L;
        this.f28213o = true;
        this.f28214p = new StopWatch(false, 1, null);
        this.f28215q = new C5793c();
        this.f28216r = LazyJVM.m13021b(new C5795e());
        this.f28217s = true;
        this.f28218t = true;
        m12574d(context, attributeSet);
    }
}
