package p007c.p008a.p009a.p010a.p014h.p015d;

import android.content.Context;
import android.net.Uri;
import p007c.p008a.p009a.p010a.p014h.ListenerMux;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;

/* JADX INFO: renamed from: c.a.a.a.h.d.a, reason: use source file name */
/* JADX INFO: compiled from: AudioPlayerApi.kt */
/* JADX INFO: loaded from: classes.dex */
public interface AudioPlayerApi {
    /* JADX INFO: renamed from: a */
    void mo1003a();

    /* JADX INFO: renamed from: b */
    void mo1004b(Uri uri, MediaSource2 mediaSource2);

    /* JADX INFO: renamed from: c */
    void mo1005c();

    long getCurrentPosition();

    long getDuration();

    boolean isPlaying();

    void pause();

    void prepareAsync();

    void release();

    void reset();

    void setAudioStreamType(int i);

    void setListenerMux(ListenerMux listenerMux);

    void setVolume(float f, float f2);

    void setWakeMode(Context context, int i);

    void start();

    /* JADX INFO: renamed from: x */
    void mo1006x(long j2);
}
