package p636z0.p725k.p742m;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.k.m.a, reason: use source file name */
/* JADX INFO: compiled from: AutoScrollHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AutoScrollHelper implements View.OnTouchListener {

    /* JADX INFO: renamed from: f */
    public static final int f38098f = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: g */
    public final a f38099g;

    /* JADX INFO: renamed from: h */
    public final Interpolator f38100h;

    /* JADX INFO: renamed from: i */
    public final View f38101i;

    /* JADX INFO: renamed from: j */
    public Runnable f38102j;

    /* JADX INFO: renamed from: k */
    public float[] f38103k;

    /* JADX INFO: renamed from: l */
    public float[] f38104l;

    /* JADX INFO: renamed from: m */
    public int f38105m;

    /* JADX INFO: renamed from: n */
    public int f38106n;

    /* JADX INFO: renamed from: o */
    public float[] f38107o;

    /* JADX INFO: renamed from: p */
    public float[] f38108p;

    /* JADX INFO: renamed from: q */
    public float[] f38109q;

    /* JADX INFO: renamed from: r */
    public boolean f38110r;

    /* JADX INFO: renamed from: s */
    public boolean f38111s;

    /* JADX INFO: renamed from: t */
    public boolean f38112t;

    /* JADX INFO: renamed from: u */
    public boolean f38113u;

    /* JADX INFO: renamed from: v */
    public boolean f38114v;

    /* JADX INFO: renamed from: z0.k.m.a$a */
    /* JADX INFO: compiled from: AutoScrollHelper.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f38115a;

        /* JADX INFO: renamed from: b */
        public int f38116b;

        /* JADX INFO: renamed from: c */
        public float f38117c;

        /* JADX INFO: renamed from: d */
        public float f38118d;

        /* JADX INFO: renamed from: j */
        public float f38124j;

        /* JADX INFO: renamed from: k */
        public int f38125k;

        /* JADX INFO: renamed from: e */
        public long f38119e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i */
        public long f38123i = -1;

        /* JADX INFO: renamed from: f */
        public long f38120f = 0;

        /* JADX INFO: renamed from: g */
        public int f38121g = 0;

        /* JADX INFO: renamed from: h */
        public int f38122h = 0;

        /* JADX INFO: renamed from: a */
        public final float m16360a(long j2) {
            long j3 = this.f38119e;
            if (j2 < j3) {
                return 0.0f;
            }
            long j4 = this.f38123i;
            if (j4 < 0 || j2 < j4) {
                return AutoScrollHelper.m16352d((j2 - j3) / this.f38115a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f38124j;
            return (AutoScrollHelper.m16352d((j2 - j4) / this.f38125k, 0.0f, 1.0f) * f) + (1.0f - f);
        }
    }

    /* JADX INFO: renamed from: z0.k.m.a$b */
    /* JADX INFO: compiled from: AutoScrollHelper.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AutoScrollHelper autoScrollHelper = AutoScrollHelper.this;
            if (autoScrollHelper.f38113u) {
                if (autoScrollHelper.f38111s) {
                    autoScrollHelper.f38111s = false;
                    a aVar = autoScrollHelper.f38099g;
                    Objects.requireNonNull(aVar);
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar.f38119e = jCurrentAnimationTimeMillis;
                    aVar.f38123i = -1L;
                    aVar.f38120f = jCurrentAnimationTimeMillis;
                    aVar.f38124j = 0.5f;
                    aVar.f38121g = 0;
                    aVar.f38122h = 0;
                }
                a aVar2 = AutoScrollHelper.this.f38099g;
                if ((aVar2.f38123i > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f38123i + ((long) aVar2.f38125k)) || !AutoScrollHelper.this.m16359l()) {
                    AutoScrollHelper.this.f38113u = false;
                    return;
                }
                AutoScrollHelper autoScrollHelper2 = AutoScrollHelper.this;
                if (autoScrollHelper2.f38112t) {
                    autoScrollHelper2.f38112t = false;
                    Objects.requireNonNull(autoScrollHelper2);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    autoScrollHelper2.f38101i.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (aVar2.f38120f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fM16360a = aVar2.m16360a(jCurrentAnimationTimeMillis2);
                long j2 = jCurrentAnimationTimeMillis2 - aVar2.f38120f;
                aVar2.f38120f = jCurrentAnimationTimeMillis2;
                float f = j2 * ((fM16360a * 4.0f) + ((-4.0f) * fM16360a * fM16360a));
                int i = (int) (aVar2.f38117c * f);
                aVar2.f38121g = i;
                int i2 = (int) (f * aVar2.f38118d);
                aVar2.f38122h = i2;
                AutoScrollHelper.this.mo16358i(i, i2);
                View view = AutoScrollHelper.this.f38101i;
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                view.postOnAnimation(this);
            }
        }
    }

    public AutoScrollHelper(View view) {
        a aVar = new a();
        this.f38099g = aVar;
        this.f38100h = new AccelerateInterpolator();
        this.f38103k = new float[]{0.0f, 0.0f};
        this.f38104l = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f38107o = new float[]{0.0f, 0.0f};
        this.f38108p = new float[]{0.0f, 0.0f};
        this.f38109q = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f38101i = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f38109q;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.f38108p;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        this.f38105m = 1;
        float[] fArr3 = this.f38104l;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f38103k;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f38107o;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f38106n = f38098f;
        aVar.f38115a = HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
        aVar.f38116b = HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
    }

    /* JADX INFO: renamed from: d */
    public static float m16352d(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo16353a(int i);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo16354b(int i);

    /* JADX WARN: Code duplicated, block: B:12:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX INFO: renamed from: c */
    public final float m16355c(int i, float f, float f2, float f3) {
        float fM16352d;
        float interpolation;
        float fM16352d2 = m16352d(this.f38103k[i] * f2, 0.0f, this.f38104l[i]);
        float fM16356e = m16356e(f2 - f, fM16352d2) - m16356e(f, fM16352d2);
        if (fM16356e >= 0.0f) {
            if (fM16356e > 0.0f) {
                interpolation = this.f38100h.getInterpolation(fM16356e);
            } else {
                fM16352d = 0.0f;
            }
            if (fM16352d == 0.0f) {
                return 0.0f;
            }
            float f4 = this.f38107o[i];
            float f5 = this.f38108p[i];
            float f6 = this.f38109q[i];
            float f7 = f4 * f3;
            return fM16352d > 0.0f ? m16352d(fM16352d * f7, f5, f6) : -m16352d((-fM16352d) * f7, f5, f6);
        }
        interpolation = -this.f38100h.getInterpolation(-fM16356e);
        fM16352d = m16352d(interpolation, -1.0f, 1.0f);
        if (fM16352d == 0.0f) {
            return 0.0f;
        }
        float f8 = this.f38107o[i];
        float f9 = this.f38108p[i];
        float f10 = this.f38109q[i];
        float f11 = f8 * f3;
        if (fM16352d > 0.0f) {
        }
    }

    /* JADX INFO: renamed from: e */
    public final float m16356e(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f38105m;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f38113u && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: f */
    public final void m16357f() {
        int i = 0;
        if (this.f38111s) {
            this.f38113u = false;
            return;
        }
        a aVar = this.f38099g;
        Objects.requireNonNull(aVar);
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - aVar.f38119e);
        int i3 = aVar.f38116b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.f38125k = i;
        aVar.f38124j = aVar.m16360a(jCurrentAnimationTimeMillis);
        aVar.f38123i = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo16358i(int i, int i2);

    /* JADX INFO: renamed from: l */
    public boolean m16359l() {
        a aVar = this.f38099g;
        float f = aVar.f38118d;
        int iAbs = (int) (f / Math.abs(f));
        float f2 = aVar.f38117c;
        int iAbs2 = (int) (f2 / Math.abs(f2));
        return (iAbs != 0 && mo16354b(iAbs)) || (iAbs2 != 0 && mo16353a(iAbs2));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (!this.f38114v) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m16357f();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    m16357f();
                }
            }
            return false;
        }
        this.f38112t = true;
        this.f38110r = false;
        float fM16355c = m16355c(0, motionEvent.getX(), view.getWidth(), this.f38101i.getWidth());
        float fM16355c2 = m16355c(1, motionEvent.getY(), view.getHeight(), this.f38101i.getHeight());
        a aVar = this.f38099g;
        aVar.f38117c = fM16355c;
        aVar.f38118d = fM16355c2;
        if (!this.f38113u && m16359l()) {
            if (this.f38102j == null) {
                this.f38102j = new b();
            }
            this.f38113u = true;
            this.f38111s = true;
            if (this.f38110r || (i = this.f38106n) <= 0) {
                this.f38102j.run();
            } else {
                View view2 = this.f38101i;
                Runnable runnable = this.f38102j;
                long j2 = i;
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                view2.postOnAnimationDelayed(runnable, j2);
            }
            this.f38110r = true;
        }
        return false;
    }
}
