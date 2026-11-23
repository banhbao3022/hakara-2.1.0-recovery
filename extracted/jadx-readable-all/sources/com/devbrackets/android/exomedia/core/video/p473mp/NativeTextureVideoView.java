package com.devbrackets.android.exomedia.core.video.p473mp;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import java.util.Map;
import java.util.Objects;
import p007c.p008a.p009a.p010a.ExoMedia3;
import p007c.p008a.p009a.p010a.p014h.ListenerMux;
import p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi;
import p007c.p008a.p009a.p010a.p014h.p018g.WindowInfo;
import p007c.p008a.p009a.p010a.p014h.p019h.CaptionListener;
import p007c.p008a.p009a.p010a.p014h.p023k.ResizingTextureView;
import p007c.p008a.p009a.p010a.p014h.p023k.p025e.NativeVideoDelegate;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p477d1.Lazy3;
import p477d1.LazyJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: compiled from: NativeTextureVideoView.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NativeTextureVideoView extends ResizingTextureView implements NativeVideoDelegate.a, VideoViewApi {

    /* JADX INFO: renamed from: u */
    public View.OnTouchListener f28197u;

    /* JADX INFO: renamed from: v */
    public final Lazy3 f28198v;

    /* JADX INFO: renamed from: w */
    public float f28199w;

    /* JADX INFO: renamed from: com.devbrackets.android.exomedia.core.video.mp.NativeTextureVideoView$a */
    /* JADX INFO: compiled from: NativeTextureVideoView.kt */
    public final class TextureViewSurfaceTextureListenerC5788a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC5788a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Intrinsics2.m13089e(surfaceTexture, "surfaceTexture");
            NativeVideoDelegate delegate = NativeTextureVideoView.this.getDelegate();
            Surface surface = new Surface(surfaceTexture);
            Objects.requireNonNull(delegate);
            Intrinsics2.m13089e(surface, "surface");
            MediaPlayer mediaPlayer = delegate.f1622c;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(surface);
            }
            if (delegate.f1623d) {
                delegate.m1192k();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Intrinsics2.m13089e(surfaceTexture, "surface");
            surfaceTexture.release();
            NativeTextureVideoView.this.getDelegate().m1194m();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            Intrinsics2.m13089e(surfaceTexture, "surface");
            NativeTextureVideoView.this.getDelegate().m1187f(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            Intrinsics2.m13089e(surfaceTexture, "surface");
        }
    }

    /* JADX INFO: renamed from: com.devbrackets.android.exomedia.core.video.mp.NativeTextureVideoView$b */
    /* JADX INFO: compiled from: NativeTextureVideoView.kt */
    public static final class C5789b extends Lambda implements InterfaceC6153a<NativeVideoDelegate> {
        public C5789b() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public NativeVideoDelegate mo2c() {
            Context context = NativeTextureVideoView.this.getContext();
            Intrinsics2.m13088d(context, "context");
            NativeTextureVideoView nativeTextureVideoView = NativeTextureVideoView.this;
            return new NativeVideoDelegate(context, nativeTextureVideoView, nativeTextureVideoView);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeTextureVideoView(Context context) {
        super(context);
        Intrinsics2.m13089e(context, "context");
        this.f28198v = LazyJVM.m13021b(new C5789b());
        this.f28199w = getDelegate().f1626g;
        setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC5788a());
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        m1172i(0, 0);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    /* JADX INFO: renamed from: a */
    public void mo1092a(int i, int i2, float f) {
        if (m1172i((int) (i * f), i2)) {
            requestLayout();
        }
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    /* JADX INFO: renamed from: c */
    public void mo1094c(boolean z) {
        getDelegate().m1193l(z);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p023k.p025e.NativeVideoDelegate.a
    /* JADX INFO: renamed from: d */
    public void mo1195d(int i, int i2) {
        if (m1172i(i, i2)) {
            requestLayout();
        }
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    /* JADX INFO: renamed from: f */
    public void mo1095f() {
        getDelegate().m1194m();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public Map<ExoMedia3, TrackGroupArray> getAvailableTracks() {
        return null;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public int getBufferedPercent() {
        NativeVideoDelegate delegate = getDelegate();
        if (delegate.f1622c != null) {
            return delegate.f1625f;
        }
        return 0;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public long getCurrentPosition() {
        return getDelegate().m1182a();
    }

    public final NativeVideoDelegate getDelegate() {
        return (NativeVideoDelegate) this.f28198v.getValue();
    }

    public DrmSessionManager2 getDrmSessionManager() {
        return null;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public long getDuration() {
        return getDelegate().m1183b();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public float getPlaybackSpeed() {
        return getDelegate().m1184c();
    }

    public final View.OnTouchListener getTouchListener() {
        return this.f28197u;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public float getVolume() {
        return this.f28199w;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public WindowInfo getWindowInfo() {
        Objects.requireNonNull(getDelegate());
        return null;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public boolean isPlaying() {
        return getDelegate().m1185d();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics2.m13089e(motionEvent, "ev");
        View.OnTouchListener onTouchListener = this.f28197u;
        return (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) || super.onTouchEvent(motionEvent);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void pause() {
        getDelegate().m1188g();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void release() {
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void setCaptionListener(CaptionListener captionListener) {
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void setDrmSessionManager(DrmSessionManager2 drmSessionManager2) {
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void setListenerMux(ListenerMux listenerMux) {
        Intrinsics2.m13089e(listenerMux, "listenerMux");
        NativeVideoDelegate delegate = getDelegate();
        delegate.f1627h = listenerMux;
        delegate.f1629j = listenerMux;
        delegate.f1629j = listenerMux;
        delegate.f1630k = listenerMux;
        delegate.f1631l = listenerMux;
        delegate.f1632m = listenerMux;
        delegate.f1633n = listenerMux;
    }

    public final void setOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        getDelegate().f1631l = onBufferingUpdateListener;
    }

    public final void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        getDelegate().f1629j = onCompletionListener;
    }

    public final void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        getDelegate().f1633n = onErrorListener;
    }

    public final void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        getDelegate().f1634o = onInfoListener;
    }

    public final void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        getDelegate().f1630k = onPreparedListener;
    }

    public final void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        getDelegate().f1632m = onSeekCompleteListener;
    }

    @Override // android.view.View, p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f28197u = onTouchListener;
        super.setOnTouchListener(onTouchListener);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void setRepeatMode(int i) {
    }

    public final void setTouchListener(View.OnTouchListener onTouchListener) {
        this.f28197u = onTouchListener;
    }

    public final void setVideoURI(Uri uri) {
        NativeVideoDelegate delegate = getDelegate();
        Intrinsics2.m13087c(uri);
        delegate.m1191j(uri, null);
        requestLayout();
        invalidate();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void setVideoUri(Uri uri) {
        NativeVideoDelegate delegate = getDelegate();
        Intrinsics2.m13087c(uri);
        delegate.m1191j(uri, null);
        requestLayout();
        invalidate();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void setVolume(float f) {
        this.f28199w = f;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void start() {
        getDelegate().m1192k();
        requestFocus();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    /* JADX INFO: renamed from: x */
    public void mo1096x(long j2) {
        getDelegate().m1189h(j2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeTextureVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f28198v = LazyJVM.m13021b(new C5789b());
        this.f28199w = getDelegate().f1626g;
        setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC5788a());
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        m1172i(0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeTextureVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f28198v = LazyJVM.m13021b(new C5789b());
        this.f28199w = getDelegate().f1626g;
        setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC5788a());
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        m1172i(0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public NativeTextureVideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f28198v = LazyJVM.m13021b(new C5789b());
        this.f28199w = getDelegate().f1626g;
        setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC5788a());
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        m1172i(0, 0);
    }
}
