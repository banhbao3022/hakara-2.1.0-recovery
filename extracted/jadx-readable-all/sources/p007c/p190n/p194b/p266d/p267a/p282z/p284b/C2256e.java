package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.e */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2256e {

    /* JADX INFO: renamed from: a */
    public boolean f10701a = false;

    /* JADX INFO: renamed from: b */
    public float f10702b = 1.0f;

    /* JADX INFO: renamed from: c */
    public static float m4731c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized float m4732a() {
        float f;
        synchronized (this) {
            f = this.f10702b;
        }
        if (f >= 0.0f) {
            return f;
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m4733b() {
        return this.f10701a;
    }
}
