package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.io.IOException;
import java.util.Objects;
import mtp.media.karaoke.R;
import org.json.JSONException;
import p007c.p043b.p044a.C0344b;
import p007c.p043b.p044a.p045a.p046a.DefaultPlayerUiController;
import p007c.p043b.p044a.p045a.p046a.PlayerUiController;
import p007c.p043b.p044a.p045a.p051b.YouTubePlayer;
import p007c.p043b.p044a.p045a.p051b.p052a.FullScreenHelper;
import p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener;
import p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerFullScreenListener;
import p007c.p043b.p044a.p045a.p051b.p054i.IFramePlayerOptions;
import p007c.p043b.p044a.p045a.p051b.p055j.SixteenByNineFrameLayout;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleObserver;
import p636z0.p759s.OnLifecycleEvent;

/* JADX INFO: compiled from: YouTubePlayerView.kt */
/* JADX INFO: loaded from: classes.dex */
public final class YouTubePlayerView extends SixteenByNineFrameLayout implements LifecycleObserver {

    /* JADX INFO: renamed from: f */
    public final LegacyYouTubePlayerView f29314f;

    /* JADX INFO: renamed from: g */
    public final FullScreenHelper f29315g;

    /* JADX INFO: renamed from: h */
    public boolean f29316h;

    /* JADX INFO: renamed from: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView$a */
    /* JADX INFO: compiled from: YouTubePlayerView.kt */
    public static final class C6005a implements YouTubePlayerFullScreenListener {
        public C6005a() {
        }

        @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerFullScreenListener
        /* JADX INFO: renamed from: l */
        public void mo1302l() {
            YouTubePlayerView.this.f29315g.m1317b();
        }

        @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerFullScreenListener
        /* JADX INFO: renamed from: n */
        public void mo1304n() {
            YouTubePlayerView.this.f29315g.m1316a();
        }
    }

    /* JADX INFO: renamed from: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView$b */
    /* JADX INFO: compiled from: YouTubePlayerView.kt */
    public static final class C6006b extends AbstractYouTubePlayerListener {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f29319g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ boolean f29320h;

        public C6006b(String str, boolean z) {
            this.f29319g = str;
            this.f29320h = z;
        }

        @Override // p007c.p043b.p044a.p045a.p051b.p053h.AbstractYouTubePlayerListener, p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
        /* JADX INFO: renamed from: h */
        public void mo1298h(YouTubePlayer youTubePlayer) {
            Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
            if (this.f29319g != null) {
                boolean z = YouTubePlayerView.this.f29314f.getCanPlay$core_release() && this.f29320h;
                String str = this.f29319g;
                Intrinsics2.m13090f(youTubePlayer, "$this$loadOrCueVideo");
                Intrinsics2.m13090f(str, "videoId");
                if (z) {
                    youTubePlayer.mo1322e(str, 0.0f);
                } else {
                    youTubePlayer.mo1321d(str, 0.0f);
                }
            }
            youTubePlayer.mo1319b(this);
        }
    }

    public /* synthetic */ YouTubePlayerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @OnLifecycleEvent(Lifecycle3.a.ON_RESUME)
    private final void onResume() {
        this.f29314f.onResume$core_release();
    }

    @OnLifecycleEvent(Lifecycle3.a.ON_STOP)
    private final void onStop() {
        this.f29314f.onStop$core_release();
    }

    public final boolean getEnableAutomaticInitialization() {
        return this.f29316h;
    }

    public final PlayerUiController getPlayerUiController() {
        return this.f29314f.getPlayerUiController();
    }

    @OnLifecycleEvent(Lifecycle3.a.ON_DESTROY)
    public final void release() {
        this.f29314f.release();
    }

    public final void setEnableAutomaticInitialization(boolean z) {
        this.f29316h = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet, int i) throws JSONException, IOException {
        super(context, attributeSet, i);
        Intrinsics2.m13090f(context, "context");
        LegacyYouTubePlayerView legacyYouTubePlayerView = new LegacyYouTubePlayerView(context);
        this.f29314f = legacyYouTubePlayerView;
        this.f29315g = new FullScreenHelper(this);
        addView(legacyYouTubePlayerView, new FrameLayout.LayoutParams(-1, -1));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C0344b.f1954b, 0, 0);
        this.f29316h = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(3, true);
        String string = typedArrayObtainStyledAttributes.getString(10);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(2, false);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(8, true);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(7, true);
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f29316h && z3) {
            throw new IllegalStateException("YouTubePlayerView: 'enableAutomaticInitialization' is false and 'useWebUi' is set to true. This is not possible, if you want to manually initialize YouTubePlayerView and use the web ui, you should manually initialize the YouTubePlayerView using 'initializeWithWebUi'");
        }
        if (string == null && z) {
            throw new IllegalStateException("YouTubePlayerView: videoId is not set but autoPlay is set to true. This combination is not possible.");
        }
        if (!z3) {
            legacyYouTubePlayerView.getPlayerUiController().mo1310t(z4).mo1299i(z5).mo1292b(z6).mo1308r(z7).mo1306p(z8).mo1300j(z9);
        }
        C6006b c6006b = new C6006b(string, z);
        if (this.f29316h) {
            if (z3) {
                Objects.requireNonNull(legacyYouTubePlayerView);
                Intrinsics2.m13090f(c6006b, "youTubePlayerListener");
                IFramePlayerOptions.a aVar = new IFramePlayerOptions.a();
                aVar.m1325a("controls", 1);
                IFramePlayerOptions iFramePlayerOptions = new IFramePlayerOptions(aVar.f1935a, null);
                legacyYouTubePlayerView.removeViews(1, legacyYouTubePlayerView.getChildCount() - 1);
                if (!legacyYouTubePlayerView.f29306o) {
                    legacyYouTubePlayerView.f29297f.mo1319b(legacyYouTubePlayerView.f29298g);
                    FullScreenHelper fullScreenHelper = legacyYouTubePlayerView.f29301j;
                    DefaultPlayerUiController defaultPlayerUiController = legacyYouTubePlayerView.f29298g;
                    Objects.requireNonNull(fullScreenHelper);
                    Intrinsics2.m13090f(defaultPlayerUiController, "fullScreenListener");
                    fullScreenHelper.f1874b.remove(defaultPlayerUiController);
                }
                legacyYouTubePlayerView.f29306o = true;
                Intrinsics2.m13086b(View.inflate(legacyYouTubePlayerView.getContext(), R.layout.ayp_empty_layout, legacyYouTubePlayerView), "View.inflate(context, layoutId, this)");
                legacyYouTubePlayerView.m12937e(c6006b, z2, iFramePlayerOptions);
            } else {
                Objects.requireNonNull(legacyYouTubePlayerView);
                Intrinsics2.m13090f(c6006b, "youTubePlayerListener");
                legacyYouTubePlayerView.m12937e(c6006b, z2, null);
            }
        }
        C6005a c6005a = new C6005a();
        Objects.requireNonNull(legacyYouTubePlayerView);
        Intrinsics2.m13090f(c6005a, "fullScreenListener");
        FullScreenHelper fullScreenHelper2 = legacyYouTubePlayerView.f29301j;
        Objects.requireNonNull(fullScreenHelper2);
        Intrinsics2.m13090f(c6005a, "fullScreenListener");
        fullScreenHelper2.f1874b.add(c6005a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context) {
        this(context, null, 0);
        Intrinsics2.m13090f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics2.m13090f(context, "context");
    }

    public /* synthetic */ YouTubePlayerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
