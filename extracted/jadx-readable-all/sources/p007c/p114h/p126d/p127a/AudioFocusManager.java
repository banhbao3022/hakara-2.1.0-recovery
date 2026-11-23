package p007c.p114h.p126d.p127a;

import android.media.AudioManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: c.h.d.a.b, reason: use source file name */
/* JADX INFO: compiled from: AudioFocusManager.java */
/* JADX INFO: loaded from: classes.dex */
public class AudioFocusManager {

    /* JADX INFO: renamed from: a */
    public AudioManager f3981a;

    /* JADX INFO: renamed from: b */
    public int f3982b = -2;

    /* JADX INFO: renamed from: c */
    public Set<AudioFocusChangeListener> f3983c = new HashSet();

    /* JADX INFO: renamed from: d */
    public AudioManager.OnAudioFocusChangeListener f3984d = new a();

    /* JADX INFO: renamed from: c.h.d.a.b$a */
    /* JADX INFO: compiled from: AudioFocusManager.java */
    public class a implements AudioManager.OnAudioFocusChangeListener {
        public a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i == -1) {
                AudioFocusManager audioFocusManager = AudioFocusManager.this;
                audioFocusManager.f3981a.abandonAudioFocus(audioFocusManager.f3984d);
            }
            AudioFocusManager.this.m2117a();
        }
    }

    /* JADX INFO: renamed from: c.h.d.a.b$b */
    /* JADX INFO: compiled from: AudioFocusManager.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static AudioFocusManager f3986a = new AudioFocusManager(null);
    }

    public AudioFocusManager(a aVar) {
    }

    /* JADX INFO: renamed from: a */
    public final void m2117a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f3983c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((AudioFocusChangeListener) it.next()).mo2116a(this.f3982b);
        }
    }
}
