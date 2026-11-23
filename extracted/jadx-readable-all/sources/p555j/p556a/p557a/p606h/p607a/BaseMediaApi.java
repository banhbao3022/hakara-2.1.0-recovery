package p555j.p556a.p557a.p606h.p607a;

import p007c.p008a.p009a.p010a.p027i.OnBufferUpdateListener;
import p007c.p008a.p009a.p010a.p027i.OnCompletionListener2;
import p007c.p008a.p009a.p010a.p027i.OnErrorListener2;
import p007c.p008a.p009a.p010a.p027i.OnPreparedListener2;
import p007c.p008a.p009a.p010a.p027i.OnSeekCompletionListener;
import p007c.p008a.p009a.p029b.p030a.MediaPlayerApi;
import p007c.p008a.p009a.p029b.p039d.MediaStatusListener;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.h.a.c, reason: use source file name */
/* JADX INFO: compiled from: BaseMediaApi.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMediaApi implements MediaPlayerApi<MediaItem4>, OnPreparedListener2, OnCompletionListener2, OnErrorListener2, OnSeekCompletionListener, OnBufferUpdateListener {

    /* JADX INFO: renamed from: f */
    public boolean f32253f;

    /* JADX INFO: renamed from: g */
    public int f32254g;

    /* JADX INFO: renamed from: h */
    public MediaStatusListener<MediaItem4> f32255h;

    @Override // p007c.p008a.p009a.p010a.p027i.OnPreparedListener2
    /* JADX INFO: renamed from: a */
    public void mo1207a() {
        this.f32253f = true;
        MediaStatusListener<MediaItem4> mediaStatusListener = this.f32255h;
        if (mediaStatusListener != null) {
            mediaStatusListener.mo1241b(this);
        }
    }

    @Override // p007c.p008a.p009a.p029b.p030a.MediaPlayerApi
    /* JADX INFO: renamed from: c */
    public void mo1215c(MediaStatusListener<MediaItem4> mediaStatusListener) {
        Intrinsics2.m13089e(mediaStatusListener, "listener");
        this.f32255h = mediaStatusListener;
    }

    @Override // p007c.p008a.p009a.p010a.p027i.OnBufferUpdateListener
    /* JADX INFO: renamed from: e */
    public void mo1062e(int i) {
        this.f32254g = i;
        MediaStatusListener<MediaItem4> mediaStatusListener = this.f32255h;
        if (mediaStatusListener != null) {
            mediaStatusListener.mo1243d(this, i);
        }
    }

    @Override // p007c.p008a.p009a.p010a.p027i.OnErrorListener2
    /* JADX INFO: renamed from: f */
    public boolean mo1206f(Exception exc) {
        MediaStatusListener<MediaItem4> mediaStatusListener = this.f32255h;
        return mediaStatusListener != null && mediaStatusListener.mo1242c(this);
    }

    @Override // p007c.p008a.p009a.p010a.p027i.OnCompletionListener2
    /* JADX INFO: renamed from: g */
    public void mo1205g() {
        MediaStatusListener<MediaItem4> mediaStatusListener = this.f32255h;
        if (mediaStatusListener != null) {
            mediaStatusListener.mo1240a(this);
        }
    }

    @Override // p007c.p008a.p009a.p010a.p027i.OnSeekCompletionListener
    /* JADX INFO: renamed from: s */
    public void mo1081s() {
        MediaStatusListener<MediaItem4> mediaStatusListener = this.f32255h;
        if (mediaStatusListener != null) {
            mediaStatusListener.mo1244e(this);
        }
    }
}
