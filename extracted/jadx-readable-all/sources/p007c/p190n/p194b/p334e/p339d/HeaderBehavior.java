package p007c.p190n.p194b.p334e.p339d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: c.n.b.e.d.f, reason: use source file name */
/* JADX INFO: compiled from: HeaderBehavior.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* JADX INFO: renamed from: c */
    public Runnable f24918c;

    /* JADX INFO: renamed from: d */
    public OverScroller f24919d;

    /* JADX INFO: renamed from: e */
    public boolean f24920e;

    /* JADX INFO: renamed from: f */
    public int f24921f;

    /* JADX INFO: renamed from: g */
    public int f24922g;

    /* JADX INFO: renamed from: h */
    public int f24923h;

    /* JADX INFO: renamed from: i */
    public VelocityTracker f24924i;

    /* JADX INFO: renamed from: c.n.b.e.d.f$a */
    /* JADX INFO: compiled from: HeaderBehavior.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final CoordinatorLayout f24925f;

        /* JADX INFO: renamed from: g */
        public final V f24926g;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.f24925f = coordinatorLayout;
            this.f24926g = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f24926g == null || (overScroller = HeaderBehavior.this.f24919d) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                HeaderBehavior.this.mo11076I(this.f24925f, this.f24926g);
                return;
            }
            HeaderBehavior headerBehavior = HeaderBehavior.this;
            headerBehavior.m11078K(this.f24925f, this.f24926g, headerBehavior.f24919d.getCurrY());
            V v = this.f24926g;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            v.postOnAnimation(this);
        }
    }

    public HeaderBehavior() {
        this.f24921f = -1;
        this.f24923h = -1;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: A */
    public boolean mo308A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f24921f);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int i = this.f24922g - y;
                this.f24922g = y;
                m11077J(coordinatorLayout, v, i, mo11073F(v), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f24921f = motionEvent.getPointerId(i2);
                    this.f24922g = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.f24924i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f24920e || z;
        }
        VelocityTracker velocityTracker3 = this.f24924i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f24924i.computeCurrentVelocity(CloseCodes.NORMAL_CLOSURE);
            float yVelocity = this.f24924i.getYVelocity(this.f24921f);
            int i3 = -mo11074G(v);
            Runnable runnable = this.f24918c;
            if (runnable != null) {
                v.removeCallbacks(runnable);
                this.f24918c = null;
            }
            if (this.f24919d == null) {
                this.f24919d = new OverScroller(v.getContext());
            }
            this.f24919d.fling(0, m11085B(), 0, Math.round(yVelocity), 0, 0, i3, 0);
            if (this.f24919d.computeScrollOffset()) {
                a aVar = new a(coordinatorLayout, v);
                this.f24918c = aVar;
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                v.postOnAnimation(aVar);
            } else {
                mo11076I(coordinatorLayout, v);
            }
            z = true;
        }
        this.f24920e = false;
        this.f24921f = -1;
        velocityTracker = this.f24924i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f24924i = null;
        }
        velocityTracker2 = this.f24924i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f24920e) {
            return true;
        }
        z = false;
        this.f24920e = false;
        this.f24921f = -1;
        velocityTracker = this.f24924i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f24924i = null;
        }
        velocityTracker2 = this.f24924i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f24920e) {
            return true;
        }
    }

    /* JADX INFO: renamed from: E */
    public boolean mo11072E(V v) {
        return false;
    }

    /* JADX INFO: renamed from: F */
    public int mo11073F(V v) {
        return -v.getHeight();
    }

    /* JADX INFO: renamed from: G */
    public int mo11074G(V v) {
        return v.getHeight();
    }

    /* JADX INFO: renamed from: H */
    public int mo11075H() {
        return m11085B();
    }

    /* JADX INFO: renamed from: I */
    public void mo11076I(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* JADX INFO: renamed from: J */
    public final int m11077J(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo11079L(coordinatorLayout, v, mo11075H() - i, i2, i3);
    }

    /* JADX INFO: renamed from: K */
    public int m11078K(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo11079L(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: L */
    public int mo11079L(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int iM16066k;
        int iM11085B = m11085B();
        if (i2 == 0 || iM11085B < i2 || iM11085B > i3 || iM11085B == (iM16066k = C8162a.m16066k(i, i2, i3))) {
            return 0;
        }
        m11086D(iM16066k);
        return iM11085B - iM16066k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: j */
    public boolean mo318j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f24923h < 0) {
            this.f24923h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f24920e) {
            int i = this.f24921f;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.f24922g) > this.f24923h) {
                this.f24922g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f24921f = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo11072E(v) && coordinatorLayout.m297q(v, x, y2);
            this.f24920e = z;
            if (z) {
                this.f24922g = y2;
                this.f24921f = motionEvent.getPointerId(0);
                if (this.f24924i == null) {
                    this.f24924i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f24919d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f24919d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f24924i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24921f = -1;
        this.f24923h = -1;
    }
}
