package p007c.p187m.p188a.p189a;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.facebook.stetho.websocket.CloseCodes;
import p007c.p187m.p188a.p189a.PhotoViewAttacher.f;

/* JADX INFO: renamed from: c.m.a.a.a, reason: use source file name */
/* JADX INFO: compiled from: CustomGestureDetector.java */
/* JADX INFO: loaded from: classes.dex */
public class CustomGestureDetector {

    /* JADX INFO: renamed from: a */
    public int f5430a = -1;

    /* JADX INFO: renamed from: b */
    public int f5431b = 0;

    /* JADX INFO: renamed from: c */
    public final ScaleGestureDetector f5432c;

    /* JADX INFO: renamed from: d */
    public VelocityTracker f5433d;

    /* JADX INFO: renamed from: e */
    public boolean f5434e;

    /* JADX INFO: renamed from: f */
    public float f5435f;

    /* JADX INFO: renamed from: g */
    public float f5436g;

    /* JADX INFO: renamed from: h */
    public final float f5437h;

    /* JADX INFO: renamed from: i */
    public final float f5438i;

    /* JADX INFO: renamed from: j */
    public OnGestureListener f5439j;

    /* JADX INFO: renamed from: c.m.a.a.a$a */
    /* JADX INFO: compiled from: CustomGestureDetector.java */
    public class a implements ScaleGestureDetector.OnScaleGestureListener {
        public a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            ((PhotoViewAttacher.a) CustomGestureDetector.this.f5439j).m2731a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public CustomGestureDetector(Context context, OnGestureListener onGestureListener) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5438i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5437h = viewConfiguration.getScaledTouchSlop();
        this.f5439j = onGestureListener;
        this.f5432c = new ScaleGestureDetector(context, new a());
    }

    /* JADX INFO: renamed from: a */
    public final float m2708a(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f5431b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m2709b(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f5431b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m2710c() {
        return this.f5432c.isInProgress();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00df  */
    /* JADX INFO: renamed from: d */
    public final boolean m2711d(MotionEvent motionEvent) {
        int iRound;
        int i;
        int iRound2;
        int i2;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f5430a = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f5433d = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.f5435f = m2708a(motionEvent);
            this.f5436g = m2709b(motionEvent);
            this.f5434e = false;
        } else if (action == 1) {
            this.f5430a = -1;
            if (this.f5434e && this.f5433d != null) {
                this.f5435f = m2708a(motionEvent);
                this.f5436g = m2709b(motionEvent);
                this.f5433d.addMovement(motionEvent);
                this.f5433d.computeCurrentVelocity(CloseCodes.NORMAL_CLOSURE);
                float xVelocity = this.f5433d.getXVelocity();
                float yVelocity = this.f5433d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f5438i) {
                    PhotoViewAttacher.a aVar = (PhotoViewAttacher.a) this.f5439j;
                    PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
                    photoViewAttacher.f5446D = photoViewAttacher.new f(photoViewAttacher.f5458m.getContext());
                    PhotoViewAttacher photoViewAttacher2 = PhotoViewAttacher.this;
                    PhotoViewAttacher.f fVar = photoViewAttacher2.f5446D;
                    int iM2724i = photoViewAttacher2.m2724i(photoViewAttacher2.f5458m);
                    PhotoViewAttacher photoViewAttacher3 = PhotoViewAttacher.this;
                    int iM2723f = photoViewAttacher3.m2723f(photoViewAttacher3.f5458m);
                    int i3 = (int) (-xVelocity);
                    int i4 = (int) (-yVelocity);
                    RectF rectFM2720c = PhotoViewAttacher.this.m2720c();
                    if (rectFM2720c != null) {
                        int iRound3 = Math.round(-rectFM2720c.left);
                        float f = iM2724i;
                        if (f < rectFM2720c.width()) {
                            iRound = Math.round(rectFM2720c.width() - f);
                            i = 0;
                        } else {
                            iRound = iRound3;
                            i = iRound;
                        }
                        int iRound4 = Math.round(-rectFM2720c.top);
                        float f2 = iM2723f;
                        if (f2 < rectFM2720c.height()) {
                            iRound2 = Math.round(rectFM2720c.height() - f2);
                            i2 = 0;
                        } else {
                            iRound2 = iRound4;
                            i2 = iRound2;
                        }
                        fVar.f5483g = iRound3;
                        fVar.f5484h = iRound4;
                        if (iRound3 != iRound || iRound4 != iRound2) {
                            fVar.f5482f.fling(iRound3, iRound4, i3, i4, i, iRound, i2, iRound2, 0, 0);
                        }
                    }
                    PhotoViewAttacher photoViewAttacher4 = PhotoViewAttacher.this;
                    photoViewAttacher4.f5458m.post(photoViewAttacher4.f5446D);
                }
            }
            VelocityTracker velocityTracker = this.f5433d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5433d = null;
            }
        } else if (action == 2) {
            float fM2708a = m2708a(motionEvent);
            float fM2709b = m2709b(motionEvent);
            float f3 = fM2708a - this.f5435f;
            float f4 = fM2709b - this.f5436g;
            if (!this.f5434e) {
                this.f5434e = Math.sqrt((double) ((f4 * f4) + (f3 * f3))) >= ((double) this.f5437h);
            }
            if (this.f5434e) {
                PhotoViewAttacher.a aVar2 = (PhotoViewAttacher.a) this.f5439j;
                if (!PhotoViewAttacher.this.f5460o.m2710c()) {
                    OnViewDragListener onViewDragListener = PhotoViewAttacher.this.f5445C;
                    if (onViewDragListener != null) {
                        onViewDragListener.mo2716a(f3, f4);
                    }
                    PhotoViewAttacher.this.f5463r.postTranslate(f3, f4);
                    PhotoViewAttacher.this.m2718a();
                    ViewParent parent = PhotoViewAttacher.this.f5458m.getParent();
                    PhotoViewAttacher photoViewAttacher5 = PhotoViewAttacher.this;
                    if (photoViewAttacher5.f5456k && !photoViewAttacher5.f5460o.m2710c()) {
                        PhotoViewAttacher photoViewAttacher6 = PhotoViewAttacher.this;
                        if (!photoViewAttacher6.f5457l) {
                            int i5 = photoViewAttacher6.f5447E;
                            if ((i5 == 2 || ((i5 == 0 && f3 >= 1.0f) || (i5 == 1 && f3 <= -1.0f))) && parent != null) {
                                parent.requestDisallowInterceptTouchEvent(false);
                            }
                        } else if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    } else if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
                this.f5435f = fM2708a;
                this.f5436g = fM2709b;
                VelocityTracker velocityTracker2 = this.f5433d;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.f5430a = -1;
            VelocityTracker velocityTracker3 = this.f5433d;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f5433d = null;
            }
        } else if (action == 6) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            if (motionEvent.getPointerId(action2) == this.f5430a) {
                int i6 = action2 == 0 ? 1 : 0;
                this.f5430a = motionEvent.getPointerId(i6);
                this.f5435f = motionEvent.getX(i6);
                this.f5436g = motionEvent.getY(i6);
            }
        }
        int i7 = this.f5430a;
        this.f5431b = motionEvent.findPointerIndex(i7 != -1 ? i7 : 0);
        return true;
    }
}
