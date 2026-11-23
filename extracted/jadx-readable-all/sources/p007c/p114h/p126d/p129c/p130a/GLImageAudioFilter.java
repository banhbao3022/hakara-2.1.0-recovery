package p007c.p114h.p126d.p129c.p130a;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import java.util.HashSet;
import java.util.Set;
import p007c.p114h.p126d.p127a.AutoFocusPlayer;

/* JADX INFO: renamed from: c.h.d.c.a.a, reason: use source file name */
/* JADX INFO: compiled from: GLImageAudioFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageAudioFilter extends GLImageFilter {

    /* JADX INFO: renamed from: A */
    public Set<MediaPlayer> f3997A;

    /* JADX INFO: renamed from: B */
    public MediaPlayer.OnPreparedListener f3998B;

    /* JADX INFO: renamed from: v */
    public Uri f3999v;

    /* JADX INFO: renamed from: w */
    public boolean f4000w;

    /* JADX INFO: renamed from: x */
    public boolean f4001x;

    /* JADX INFO: renamed from: y */
    public c f4002y;

    /* JADX INFO: renamed from: z */
    public MediaPlayer f4003z;

    /* JADX INFO: renamed from: c.h.d.c.a.a$a */
    /* JADX INFO: compiled from: GLImageAudioFilter.java */
    public class a implements MediaPlayer.OnPreparedListener {

        /* JADX INFO: renamed from: c.h.d.c.a.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GLImageAudioFilter.java */
        public class RunnableC8507a implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ MediaPlayer f4005f;

            public RunnableC8507a(MediaPlayer mediaPlayer) {
                this.f4005f = mediaPlayer;
            }

            @Override // java.lang.Runnable
            public void run() {
                MediaPlayer mediaPlayer;
                c cVar = c.INIT;
                GLImageAudioFilter gLImageAudioFilter = GLImageAudioFilter.this;
                if (gLImageAudioFilter.f4001x && gLImageAudioFilter.f4002y == cVar && (mediaPlayer = gLImageAudioFilter.f4003z) != null) {
                    mediaPlayer.start();
                    GLImageAudioFilter.this.f4002y = c.PLAYING;
                } else if (gLImageAudioFilter.f4002y == cVar) {
                    gLImageAudioFilter.f4002y = c.PREPARED;
                }
                GLImageAudioFilter gLImageAudioFilter2 = GLImageAudioFilter.this;
                MediaPlayer mediaPlayer2 = gLImageAudioFilter2.f4003z;
                MediaPlayer mediaPlayer3 = this.f4005f;
                if (mediaPlayer2 == mediaPlayer3 || !gLImageAudioFilter2.f3997A.contains(mediaPlayer3)) {
                    return;
                }
                this.f4005f.stop();
                this.f4005f.release();
            }
        }

        public a() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            GLImageAudioFilter.this.m2143p(new RunnableC8507a(mediaPlayer));
        }
    }

    /* JADX INFO: renamed from: c.h.d.c.a.a$b */
    /* JADX INFO: compiled from: GLImageAudioFilter.java */
    public class b extends AutoFocusPlayer {

        /* JADX INFO: renamed from: c */
        public final GLImageAudioFilter f4007c;

        public b(GLImageAudioFilter gLImageAudioFilter, Context context, GLImageAudioFilter gLImageAudioFilter2) {
            super(context);
            this.f4007c = gLImageAudioFilter2;
        }

        @Override // p007c.p114h.p126d.p127a.AutoFocusPlayer
        /* JADX INFO: renamed from: a */
        public void mo2118a() {
            if (isPlaying()) {
                pause();
            }
            if (isPlaying()) {
                this.f4007c.m2127u();
            }
        }
    }

    /* JADX INFO: renamed from: c.h.d.c.a.a$c */
    /* JADX INFO: compiled from: GLImageAudioFilter.java */
    public enum c {
        RELEASE("release", 0),
        INIT("init", 1),
        PREPARED("prepared", 2),
        PLAYING("playing", 3);

        c(String str, int i) {
        }
    }

    public GLImageAudioFilter(Context context) {
        super(context);
        this.f4000w = false;
        this.f4001x = false;
        this.f4002y = c.RELEASE;
        this.f4003z = null;
        this.f3997A = new HashSet();
        this.f3998B = new a();
    }

    @Override // p007c.p114h.p126d.p129c.p130a.GLImageFilter
    /* JADX INFO: renamed from: o */
    public void mo2126o() {
        super.mo2126o();
        m2127u();
        MediaPlayer mediaPlayer = this.f4003z;
        if (mediaPlayer != null && this.f4002y == c.PREPARED) {
            mediaPlayer.stop();
            this.f4003z.release();
            this.f3997A.remove(this.f4003z);
        }
        this.f4003z = null;
        this.f4002y = c.RELEASE;
    }

    /* JADX INFO: renamed from: u */
    public void m2127u() {
        MediaPlayer mediaPlayer = this.f4003z;
        if (mediaPlayer != null && this.f4002y == c.PLAYING) {
            mediaPlayer.pause();
            this.f4002y = c.PREPARED;
        }
        this.f4001x = false;
    }

    public GLImageAudioFilter(Context context, String str, String str2) {
        super(context, str, str2);
        this.f4000w = false;
        this.f4001x = false;
        this.f4002y = c.RELEASE;
        this.f4003z = null;
        this.f3997A = new HashSet();
        this.f3998B = new a();
    }
}
