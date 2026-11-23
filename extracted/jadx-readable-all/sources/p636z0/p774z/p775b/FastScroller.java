package p636z0.p774z.p775b;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.z.b.o, reason: use source file name */
/* JADX INFO: compiled from: FastScroller.java */
/* JADX INFO: loaded from: classes.dex */
public class FastScroller extends RecyclerView.AbstractC0159l implements RecyclerView.InterfaceC0164q {

    /* JADX INFO: renamed from: a */
    public static final int[] f39269a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b */
    public static final int[] f39270b = new int[0];

    /* JADX INFO: renamed from: B */
    public final ValueAnimator f39272B;

    /* JADX INFO: renamed from: C */
    public int f39273C;

    /* JADX INFO: renamed from: D */
    public final Runnable f39274D;

    /* JADX INFO: renamed from: E */
    public final RecyclerView.AbstractC0165r f39275E;

    /* JADX INFO: renamed from: c */
    public final int f39276c;

    /* JADX INFO: renamed from: d */
    public final int f39277d;

    /* JADX INFO: renamed from: e */
    public final StateListDrawable f39278e;

    /* JADX INFO: renamed from: f */
    public final Drawable f39279f;

    /* JADX INFO: renamed from: g */
    public final int f39280g;

    /* JADX INFO: renamed from: h */
    public final int f39281h;

    /* JADX INFO: renamed from: i */
    public final StateListDrawable f39282i;

    /* JADX INFO: renamed from: j */
    public final Drawable f39283j;

    /* JADX INFO: renamed from: k */
    public final int f39284k;

    /* JADX INFO: renamed from: l */
    public final int f39285l;

    /* JADX INFO: renamed from: m */
    public int f39286m;

    /* JADX INFO: renamed from: n */
    public int f39287n;

    /* JADX INFO: renamed from: o */
    public float f39288o;

    /* JADX INFO: renamed from: p */
    public int f39289p;

    /* JADX INFO: renamed from: q */
    public int f39290q;

    /* JADX INFO: renamed from: r */
    public float f39291r;

    /* JADX INFO: renamed from: u */
    public RecyclerView f39294u;

    /* JADX INFO: renamed from: s */
    public int f39292s = 0;

    /* JADX INFO: renamed from: t */
    public int f39293t = 0;

    /* JADX INFO: renamed from: v */
    public boolean f39295v = false;

    /* JADX INFO: renamed from: w */
    public boolean f39296w = false;

    /* JADX INFO: renamed from: x */
    public int f39297x = 0;

    /* JADX INFO: renamed from: y */
    public int f39298y = 0;

    /* JADX INFO: renamed from: z */
    public final int[] f39299z = new int[2];

    /* JADX INFO: renamed from: A */
    public final int[] f39271A = new int[2];

    /* JADX INFO: renamed from: z0.z.b.o$a */
    /* JADX INFO: compiled from: FastScroller.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FastScroller fastScroller = FastScroller.this;
            int i = fastScroller.f39273C;
            if (i == 1) {
                fastScroller.f39272B.cancel();
            } else if (i != 2) {
                return;
            }
            fastScroller.f39273C = 3;
            ValueAnimator valueAnimator = fastScroller.f39272B;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            fastScroller.f39272B.setDuration(HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
            fastScroller.f39272B.start();
        }
    }

    /* JADX INFO: renamed from: z0.z.b.o$b */
    /* JADX INFO: compiled from: FastScroller.java */
    public class b extends RecyclerView.AbstractC0165r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0165r
        /* JADX INFO: renamed from: b */
        public void mo782b(RecyclerView recyclerView, int i, int i2) {
            FastScroller fastScroller = FastScroller.this;
            int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int iComputeVerticalScrollRange = fastScroller.f39294u.computeVerticalScrollRange();
            int i3 = fastScroller.f39293t;
            fastScroller.f39295v = iComputeVerticalScrollRange - i3 > 0 && i3 >= fastScroller.f39276c;
            int iComputeHorizontalScrollRange = fastScroller.f39294u.computeHorizontalScrollRange();
            int i4 = fastScroller.f39292s;
            boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= fastScroller.f39276c;
            fastScroller.f39296w = z;
            boolean z2 = fastScroller.f39295v;
            if (!z2 && !z) {
                if (fastScroller.f39297x != 0) {
                    fastScroller.m17047j(0);
                    return;
                }
                return;
            }
            if (z2) {
                float f = i3;
                fastScroller.f39287n = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                fastScroller.f39286m = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
            }
            if (fastScroller.f39296w) {
                float f2 = iComputeHorizontalScrollOffset;
                float f3 = i4;
                fastScroller.f39290q = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                fastScroller.f39289p = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
            }
            int i5 = fastScroller.f39297x;
            if (i5 == 0 || i5 == 1) {
                fastScroller.m17047j(1);
            }
        }
    }

    /* JADX INFO: renamed from: z0.z.b.o$c */
    /* JADX INFO: compiled from: FastScroller.java */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f39302a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f39302a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f39302a) {
                this.f39302a = false;
                return;
            }
            if (((Float) FastScroller.this.f39272B.getAnimatedValue()).floatValue() == 0.0f) {
                FastScroller fastScroller = FastScroller.this;
                fastScroller.f39273C = 0;
                fastScroller.m17047j(0);
            } else {
                FastScroller fastScroller2 = FastScroller.this;
                fastScroller2.f39273C = 2;
                fastScroller2.f39294u.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: z0.z.b.o$d */
    /* JADX INFO: compiled from: FastScroller.java */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            FastScroller.this.f39278e.setAlpha(iFloatValue);
            FastScroller.this.f39279f.setAlpha(iFloatValue);
            FastScroller.this.f39294u.invalidate();
        }
    }

    public FastScroller(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f39272B = valueAnimatorOfFloat;
        this.f39273C = 0;
        this.f39274D = new a();
        b bVar = new b();
        this.f39275E = bVar;
        this.f39278e = stateListDrawable;
        this.f39279f = drawable;
        this.f39282i = stateListDrawable2;
        this.f39283j = drawable2;
        this.f39280g = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f39281h = Math.max(i, drawable.getIntrinsicWidth());
        this.f39284k = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f39285l = Math.max(i, drawable2.getIntrinsicWidth());
        this.f39276c = i2;
        this.f39277d = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f39294u;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            RecyclerView.AbstractC0160m abstractC0160m = recyclerView2.f987x;
            if (abstractC0160m != null) {
                abstractC0160m.mo529d("Cannot remove item decoration during a scroll  or layout");
            }
            recyclerView2.f916A.remove(this);
            if (recyclerView2.f916A.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m588Q();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f39294u;
            recyclerView3.f918B.remove(this);
            if (recyclerView3.f920C == this) {
                recyclerView3.f920C = null;
            }
            List<RecyclerView.AbstractC0165r> list = this.f39294u.f984v0;
            if (list != null) {
                list.remove(bVar);
            }
            m17043f();
        }
        this.f39294u = recyclerView;
        recyclerView.m605g(this);
        this.f39294u.f918B.add(this);
        this.f39294u.m607h(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0164q
    /* JADX INFO: renamed from: a */
    public void mo778a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f39297x == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM17045h = m17045h(motionEvent.getX(), motionEvent.getY());
            boolean zM17044g = m17044g(motionEvent.getX(), motionEvent.getY());
            if (zM17045h || zM17044g) {
                if (zM17044g) {
                    this.f39298y = 1;
                    this.f39291r = (int) motionEvent.getX();
                } else if (zM17045h) {
                    this.f39298y = 2;
                    this.f39288o = (int) motionEvent.getY();
                }
                m17047j(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f39297x == 2) {
            this.f39288o = 0.0f;
            this.f39291r = 0.0f;
            m17047j(1);
            this.f39298y = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f39297x == 2) {
            m17048k();
            if (this.f39298y == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f39271A;
                int i = this.f39277d;
                iArr[0] = i;
                iArr[1] = this.f39292s - i;
                float fMax = Math.max(iArr[0], Math.min(iArr[1], x));
                if (Math.abs(this.f39290q - fMax) >= 2.0f) {
                    int iM17046i = m17046i(this.f39291r, fMax, iArr, this.f39294u.computeHorizontalScrollRange(), this.f39294u.computeHorizontalScrollOffset(), this.f39292s);
                    if (iM17046i != 0) {
                        this.f39294u.scrollBy(iM17046i, 0);
                    }
                    this.f39291r = fMax;
                }
            }
            if (this.f39298y == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f39299z;
                int i2 = this.f39277d;
                iArr2[0] = i2;
                iArr2[1] = this.f39293t - i2;
                float fMax2 = Math.max(iArr2[0], Math.min(iArr2[1], y));
                if (Math.abs(this.f39287n - fMax2) < 2.0f) {
                    return;
                }
                int iM17046i2 = m17046i(this.f39288o, fMax2, iArr2, this.f39294u.computeVerticalScrollRange(), this.f39294u.computeVerticalScrollOffset(), this.f39293t);
                if (iM17046i2 != 0) {
                    this.f39294u.scrollBy(0, iM17046i2);
                }
                this.f39288o = fMax2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0164q
    /* JADX INFO: renamed from: b */
    public boolean mo779b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f39297x;
        if (i == 1) {
            boolean zM17045h = m17045h(motionEvent.getX(), motionEvent.getY());
            boolean zM17044g = m17044g(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (zM17045h || zM17044g)) {
                if (zM17044g) {
                    this.f39298y = 1;
                    this.f39291r = (int) motionEvent.getX();
                } else if (zM17045h) {
                    this.f39298y = 2;
                    this.f39288o = (int) motionEvent.getY();
                }
                m17047j(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0164q
    /* JADX INFO: renamed from: c */
    public void mo780c(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0159l
    /* JADX INFO: renamed from: e */
    public void mo702e(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0172y c0172y) {
        if (this.f39292s != this.f39294u.getWidth() || this.f39293t != this.f39294u.getHeight()) {
            this.f39292s = this.f39294u.getWidth();
            this.f39293t = this.f39294u.getHeight();
            m17047j(0);
            return;
        }
        if (this.f39273C != 0) {
            if (this.f39295v) {
                int i = this.f39292s;
                int i2 = this.f39280g;
                int i3 = i - i2;
                int i4 = this.f39287n;
                int i5 = this.f39286m;
                int i6 = i4 - (i5 / 2);
                this.f39278e.setBounds(0, 0, i2, i5);
                this.f39279f.setBounds(0, 0, this.f39281h, this.f39293t);
                RecyclerView recyclerView2 = this.f39294u;
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    this.f39279f.draw(canvas);
                    canvas.translate(this.f39280g, i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f39278e.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-this.f39280g, -i6);
                } else {
                    canvas.translate(i3, 0.0f);
                    this.f39279f.draw(canvas);
                    canvas.translate(0.0f, i6);
                    this.f39278e.draw(canvas);
                    canvas.translate(-i3, -i6);
                }
            }
            if (this.f39296w) {
                int i7 = this.f39293t;
                int i8 = this.f39284k;
                int i9 = i7 - i8;
                int i10 = this.f39290q;
                int i11 = this.f39289p;
                int i12 = i10 - (i11 / 2);
                this.f39282i.setBounds(0, 0, i11, i8);
                this.f39283j.setBounds(0, 0, this.f39292s, this.f39285l);
                canvas.translate(0.0f, i9);
                this.f39283j.draw(canvas);
                canvas.translate(i12, 0.0f);
                this.f39282i.draw(canvas);
                canvas.translate(-i12, -i9);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m17043f() {
        this.f39294u.removeCallbacks(this.f39274D);
    }

    /* JADX INFO: renamed from: g */
    public boolean m17044g(float f, float f2) {
        if (f2 >= this.f39293t - this.f39284k) {
            int i = this.f39290q;
            int i2 = this.f39289p;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean m17045h(float f, float f2) {
        RecyclerView recyclerView = this.f39294u;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (recyclerView.getLayoutDirection() == 1) {
            if (f > this.f39280g) {
                return false;
            }
        } else if (f < this.f39292s - this.f39280g) {
            return false;
        }
        int i = this.f39287n;
        int i2 = this.f39286m / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i2 + i));
    }

    /* JADX INFO: renamed from: i */
    public final int m17046i(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* JADX INFO: renamed from: j */
    public void m17047j(int i) {
        if (i == 2 && this.f39297x != 2) {
            this.f39278e.setState(f39269a);
            m17043f();
        }
        if (i == 0) {
            this.f39294u.invalidate();
        } else {
            m17048k();
        }
        if (this.f39297x == 2 && i != 2) {
            this.f39278e.setState(f39270b);
            m17043f();
            this.f39294u.postDelayed(this.f39274D, 1200);
        } else if (i == 1) {
            m17043f();
            this.f39294u.postDelayed(this.f39274D, 1500);
        }
        this.f39297x = i;
    }

    /* JADX INFO: renamed from: k */
    public void m17048k() {
        int i = this.f39273C;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.f39272B.cancel();
            }
        }
        this.f39273C = 1;
        ValueAnimator valueAnimator = this.f39272B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f39272B.setDuration(500L);
        this.f39272B.setStartDelay(0L);
        this.f39272B.start();
    }
}
