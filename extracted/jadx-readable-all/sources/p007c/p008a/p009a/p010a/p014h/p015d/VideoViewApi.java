package p007c.p008a.p009a.p010a.p014h.p015d;

import android.net.Uri;
import android.view.View;
import java.util.Map;
import p007c.p008a.p009a.p010a.ExoMedia3;
import p007c.p008a.p009a.p010a.p014h.ListenerMux;
import p007c.p008a.p009a.p010a.p014h.p018g.WindowInfo;
import p007c.p008a.p009a.p010a.p014h.p019h.CaptionListener;
import p007c.p008a.p009a.p010a.p014h.p023k.p026f.ScaleType;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;

/* JADX INFO: renamed from: c.a.a.a.h.d.b, reason: use source file name */
/* JADX INFO: compiled from: VideoViewApi.kt */
/* JADX INFO: loaded from: classes.dex */
public interface VideoViewApi {
    /* JADX INFO: renamed from: a */
    void mo1092a(int i, int i2, float f);

    /* JADX INFO: renamed from: b */
    void m1093b(int i, boolean z);

    /* JADX INFO: renamed from: c */
    void mo1094c(boolean z);

    /* JADX INFO: renamed from: f */
    void mo1095f();

    Map<ExoMedia3, TrackGroupArray> getAvailableTracks();

    int getBufferedPercent();

    long getCurrentPosition();

    long getDuration();

    float getPlaybackSpeed();

    float getVolume();

    WindowInfo getWindowInfo();

    boolean isPlaying();

    void pause();

    void release();

    void setCaptionListener(CaptionListener captionListener);

    void setDrmSessionManager(DrmSessionManager2 drmSessionManager2);

    void setListenerMux(ListenerMux listenerMux);

    void setMeasureBasedOnAspectRatioEnabled(boolean z);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRepeatMode(int i);

    void setScaleType(ScaleType scaleType);

    void setVideoUri(Uri uri);

    void setVolume(float f);

    void start();

    /* JADX INFO: renamed from: x */
    void mo1096x(long j2);
}
