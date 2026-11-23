package p007c.p043b.p044a.p045a.p046a.p049d;

import android.animation.Animator;
import android.os.Handler;
import android.view.View;
import p007c.p043b.p044a.p045a.p051b.PlayerConstants;
import p007c.p043b.p044a.p045a.p051b.PlayerConstants2;
import p007c.p043b.p044a.p045a.p051b.PlayerConstants3;
import p007c.p043b.p044a.p045a.p051b.PlayerConstants4;
import p007c.p043b.p044a.p045a.p051b.YouTubePlayer;
import p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.b.a.a.a.d.a, reason: use source file name */
/* JADX INFO: compiled from: FadeViewHelper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FadeViewHelper implements YouTubePlayerListener {

    /* JADX INFO: renamed from: f */
    public boolean f1856f;

    /* JADX INFO: renamed from: g */
    public boolean f1857g;

    /* JADX INFO: renamed from: h */
    public boolean f1858h;

    /* JADX INFO: renamed from: i */
    public Runnable f1859i;

    /* JADX INFO: renamed from: j */
    public boolean f1860j;

    /* JADX INFO: renamed from: k */
    public long f1861k;

    /* JADX INFO: renamed from: l */
    public long f1862l;

    /* JADX INFO: renamed from: m */
    public final View f1863m;

    /* JADX INFO: renamed from: c.b.a.a.a.d.a$a */
    /* JADX INFO: compiled from: FadeViewHelper.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.a.d.a$b */
    /* JADX INFO: compiled from: FadeViewHelper.kt */
    public static final class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f1865b;

        public b(float f) {
            this.f1865b = f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics2.m13090f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics2.m13090f(animator, "animator");
            if (this.f1865b == 0.0f) {
                FadeViewHelper.this.f1863m.setVisibility(8);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics2.m13090f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics2.m13090f(animator, "animator");
            if (this.f1865b == 1.0f) {
                FadeViewHelper.this.f1863m.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: c.b.a.a.a.d.a$c */
    /* JADX INFO: compiled from: FadeViewHelper.kt */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FadeViewHelper.this.m1314b(0.0f);
        }
    }

    static {
        new a(null);
    }

    public FadeViewHelper(View view) {
        Intrinsics2.m13090f(view, "targetView");
        this.f1863m = view;
        this.f1858h = true;
        this.f1859i = new c();
        this.f1861k = 300L;
        this.f1862l = 3000L;
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: a */
    public void mo1291a(YouTubePlayer youTubePlayer, float f) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
    }

    /* JADX INFO: renamed from: b */
    public final void m1314b(float f) {
        if (!this.f1857g || this.f1860j) {
            return;
        }
        this.f1858h = f != 0.0f;
        if (f == 1.0f && this.f1856f) {
            Handler handler = this.f1863m.getHandler();
            if (handler != null) {
                handler.postDelayed(this.f1859i, this.f1862l);
            }
        } else {
            Handler handler2 = this.f1863m.getHandler();
            if (handler2 != null) {
                handler2.removeCallbacks(this.f1859i);
            }
        }
        this.f1863m.animate().alpha(f).setDuration(this.f1861k).setListener(new b(f)).start();
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: c */
    public void mo1293c(YouTubePlayer youTubePlayer, PlayerConstants2 playerConstants2) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(playerConstants2, "playbackRate");
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: d */
    public void mo1294d(YouTubePlayer youTubePlayer) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: f */
    public void mo1296f(YouTubePlayer youTubePlayer, String str) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(str, "videoId");
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: g */
    public void mo1297g(YouTubePlayer youTubePlayer, PlayerConstants4 playerConstants4) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(playerConstants4, "state");
        int iOrdinal = playerConstants4.ordinal();
        if (iOrdinal == 2) {
            this.f1856f = false;
        } else if (iOrdinal == 3) {
            this.f1856f = true;
        } else if (iOrdinal == 4) {
            this.f1856f = false;
        }
        switch (playerConstants4) {
            case UNKNOWN:
                m1314b(1.0f);
                break;
            case UNSTARTED:
            case BUFFERING:
                m1314b(1.0f);
                this.f1857g = false;
                break;
            case ENDED:
                m1314b(1.0f);
                break;
            case PLAYING:
            case PAUSED:
            case VIDEO_CUED:
                this.f1857g = true;
                if (playerConstants4 != PlayerConstants4.PLAYING) {
                    Handler handler = this.f1863m.getHandler();
                    if (handler != null) {
                        handler.removeCallbacks(this.f1859i);
                    }
                } else {
                    Handler handler2 = this.f1863m.getHandler();
                    if (handler2 != null) {
                        handler2.postDelayed(this.f1859i, this.f1862l);
                    }
                }
                break;
        }
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: h */
    public void mo1298h(YouTubePlayer youTubePlayer) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: k */
    public void mo1301k(YouTubePlayer youTubePlayer, PlayerConstants playerConstants) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(playerConstants, "playbackQuality");
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: q */
    public void mo1307q(YouTubePlayer youTubePlayer, float f) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: s */
    public void mo1309s(YouTubePlayer youTubePlayer, PlayerConstants3 playerConstants3) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
        Intrinsics2.m13090f(playerConstants3, "error");
    }

    @Override // p007c.p043b.p044a.p045a.p051b.p053h.YouTubePlayerListener
    /* JADX INFO: renamed from: u */
    public void mo1311u(YouTubePlayer youTubePlayer, float f) {
        Intrinsics2.m13090f(youTubePlayer, "youTubePlayer");
    }
}
