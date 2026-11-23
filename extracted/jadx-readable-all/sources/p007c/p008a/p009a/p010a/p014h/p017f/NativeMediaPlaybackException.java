package p007c.p008a.p009a.p010a.p014h.p017f;

import android.media.MediaPlayer;

/* JADX INFO: renamed from: c.a.a.a.h.f.a, reason: use source file name */
/* JADX INFO: compiled from: NativeMediaPlaybackException.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NativeMediaPlaybackException extends Exception {
    public NativeMediaPlaybackException(int i, int i2) {
        super(MediaPlayer.class.getName() + " has had the error " + i + " with extras " + i2);
    }
}
