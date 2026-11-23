package com.devbrackets.android.exomedia.core.video.exo;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import java.util.Map;
import p007c.p008a.p009a.p010a.ExoMedia3;
import p007c.p008a.p009a.p010a.p014h.ListenerMux;
import p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi;
import p007c.p008a.p009a.p010a.p014h.p018g.ExoMediaPlayer;
import p007c.p008a.p009a.p010a.p014h.p018g.WindowInfo;
import p007c.p008a.p009a.p010a.p014h.p019h.CaptionListener;
import p007c.p008a.p009a.p010a.p014h.p023k.ResizingTextureView;
import p007c.p008a.p009a.p010a.p014h.p023k.p024d.ExoVideoDelegate;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: compiled from: ExoTextureVideoView.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ExoTextureVideoView extends ResizingTextureView implements VideoViewApi {

    /* JADX INFO: renamed from: u */
    public final ExoVideoDelegate f28189u;

    /* JADX INFO: renamed from: v */
    public float f28190v;

    /* JADX INFO: renamed from: com.devbrackets.android.exomedia.core.video.exo.ExoTextureVideoView$a */
    /* JADX INFO: compiled from: ExoTextureVideoView.kt */
    public final class TextureViewSurfaceTextureListenerC5785a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC5785a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Intrinsics2.m13089e(surfaceTexture, "surfaceTexture");
            ExoTextureVideoView.this.getDelegate().m1179e(new Surface(surfaceTexture));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Intrinsics2.m13089e(surfaceTexture, "surfaceTexture");
            ExoTextureVideoView.this.getDelegate().m1178d();
            surfaceTexture.release();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            Intrinsics2.m13089e(surfaceTexture, "surfaceTexture");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            Intrinsics2.m13089e(surfaceTexture, "surfaceTexture");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoTextureVideoView(Context context) {
        super(context);
        Intrinsics2.m13089e(context, "context");
        Context context2 = getContext();
        Intrinsics2.m13088d(context2, "context");
        ExoVideoDelegate exoVideoDelegate = new ExoVideoDelegate(context2, this);
        this.f28189u = exoVideoDelegate;
        this.f28190v = exoVideoDelegate.f1614a.f1549x;
        setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC5785a());
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
        this.f28189u.m1181h(z);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    /* JADX INFO: renamed from: f */
    public void mo1095f() {
        ExoVideoDelegate exoVideoDelegate = this.f28189u;
        exoVideoDelegate.f1614a.m1112g();
        exoVideoDelegate.f1616c = false;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public Map<ExoMedia3, TrackGroupArray> getAvailableTracks() {
        return this.f28189u.m1175a();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public int getBufferedPercent() {
        return this.f28189u.f1614a.f1532g.mo2882g();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public long getCurrentPosition() {
        ExoVideoDelegate exoVideoDelegate = this.f28189u;
        ListenerMux listenerMux = exoVideoDelegate.f1615b;
        Intrinsics2.m13087c(listenerMux);
        if (listenerMux.f1513o) {
            return exoVideoDelegate.f1614a.m1110e();
        }
        return 0L;
    }

    public final ExoVideoDelegate getDelegate() {
        return this.f28189u;
    }

    public DrmSessionManager2 getDrmSessionManager() {
        return this.f28189u.f1614a.f1551z;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public long getDuration() {
        return this.f28189u.m1176b();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public float getPlaybackSpeed() {
        return this.f28189u.f1614a.f1532g.mo3330b().f6260b;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public float getVolume() {
        return this.f28190v;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public WindowInfo getWindowInfo() {
        return this.f28189u.m1177c();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public boolean isPlaying() {
        return this.f28189u.f1614a.f1532g.mo3334f();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void pause() {
        ExoVideoDelegate exoVideoDelegate = this.f28189u;
        exoVideoDelegate.f1614a.m1120p(false);
        exoVideoDelegate.f1616c = false;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void release() {
        this.f28189u.f1614a.m1112g();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void setCaptionListener(CaptionListener captionListener) {
        this.f28189u.f1614a.f1545t = captionListener;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void setDrmSessionManager(DrmSessionManager2 drmSessionManager2) {
        this.f28189u.f1614a.f1551z = drmSessionManager2;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void setListenerMux(ListenerMux listenerMux) {
        Intrinsics2.m13089e(listenerMux, "listenerMux");
        this.f28189u.m1180f(listenerMux);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void setRepeatMode(int i) {
        this.f28189u.f1614a.f1532g.setRepeatMode(i);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void setVideoUri(Uri uri) {
        ExoVideoDelegate.m1174g(this.f28189u, uri, null, 2);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void setVolume(float f) {
        this.f28190v = f;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    public void start() {
        ExoVideoDelegate exoVideoDelegate = this.f28189u;
        exoVideoDelegate.f1614a.m1120p(true);
        ListenerMux listenerMux = exoVideoDelegate.f1615b;
        if (listenerMux != null) {
            listenerMux.f1514p = false;
        }
        exoVideoDelegate.f1616c = true;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.VideoViewApi
    /* JADX INFO: renamed from: x */
    public void mo1096x(long j2) {
        ExoMediaPlayer.m1097i(this.f28189u.f1614a, j2, false, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoTextureVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        Context context2 = getContext();
        Intrinsics2.m13088d(context2, "context");
        ExoVideoDelegate exoVideoDelegate = new ExoVideoDelegate(context2, this);
        this.f28189u = exoVideoDelegate;
        this.f28190v = exoVideoDelegate.f1614a.f1549x;
        setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC5785a());
        m1172i(0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoTextureVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        Context context2 = getContext();
        Intrinsics2.m13088d(context2, "context");
        ExoVideoDelegate exoVideoDelegate = new ExoVideoDelegate(context2, this);
        this.f28189u = exoVideoDelegate;
        this.f28190v = exoVideoDelegate.f1614a.f1549x;
        setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC5785a());
        m1172i(0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoTextureVideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        Context context2 = getContext();
        Intrinsics2.m13088d(context2, "context");
        ExoVideoDelegate exoVideoDelegate = new ExoVideoDelegate(context2, this);
        this.f28189u = exoVideoDelegate;
        this.f28190v = exoVideoDelegate.f1614a.f1549x;
        setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC5785a());
        m1172i(0, 0);
    }
}
