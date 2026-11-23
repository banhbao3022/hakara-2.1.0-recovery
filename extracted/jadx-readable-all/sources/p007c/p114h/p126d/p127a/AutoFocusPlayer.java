package p007c.p114h.p126d.p127a;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import java.util.Objects;

/* JADX INFO: renamed from: c.h.d.a.c, reason: use source file name */
/* JADX INFO: compiled from: AutoFocusPlayer.java */
/* JADX INFO: loaded from: classes.dex */
public class AutoFocusPlayer extends MediaPlayer {

    /* JADX INFO: renamed from: a */
    public AudioFocusManager f3987a;

    /* JADX INFO: renamed from: b */
    public AudioFocusChangeListener f3988b = new a();

    /* JADX INFO: renamed from: c.h.d.a.c$a */
    /* JADX INFO: compiled from: AutoFocusPlayer.java */
    public class a implements AudioFocusChangeListener {
        public a() {
        }

        @Override // p007c.p114h.p126d.p127a.AudioFocusChangeListener
        /* JADX INFO: renamed from: a */
        public void mo2116a(int i) {
            if (i == -2 || i == -1) {
                AutoFocusPlayer.this.mo2118a();
            } else {
                if (i != 1) {
                    return;
                }
                AutoFocusPlayer.this.start();
            }
        }
    }

    public AutoFocusPlayer(Context context) {
        AudioFocusManager audioFocusManager = AudioFocusManager.b.f3986a;
        this.f3987a = audioFocusManager;
        Objects.requireNonNull(audioFocusManager);
        audioFocusManager.f3981a = (AudioManager) context.getSystemService("audio");
        AudioFocusManager audioFocusManager2 = this.f3987a;
        audioFocusManager2.f3983c.add(this.f3988b);
    }

    /* JADX INFO: renamed from: a */
    public void mo2118a() {
        if (isPlaying()) {
            pause();
        }
    }

    @Override // android.media.MediaPlayer
    public void release() {
        super.release();
        AudioFocusManager audioFocusManager = this.f3987a;
        audioFocusManager.f3983c.remove(this.f3988b);
    }

    @Override // android.media.MediaPlayer
    public void start() throws IllegalStateException {
        AudioFocusManager audioFocusManager = this.f3987a;
        if (audioFocusManager.f3982b == 1) {
            super.start();
            return;
        }
        synchronized (audioFocusManager) {
            if (audioFocusManager.f3982b != 1) {
                audioFocusManager.f3982b = audioFocusManager.f3981a.requestAudioFocus(audioFocusManager.f3984d, 3, 1);
            }
            audioFocusManager.m2117a();
        }
    }
}
