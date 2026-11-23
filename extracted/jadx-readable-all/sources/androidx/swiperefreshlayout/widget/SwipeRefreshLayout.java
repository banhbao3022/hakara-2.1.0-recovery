package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p665d0.p666a.CircleImageView;
import p636z0.p665d0.p666a.CircularProgressDrawable3;
import p636z0.p665d0.p666a.SwipeRefreshLayout2;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p725k.p739l.NestedScrollingChild;
import p636z0.p725k.p739l.NestedScrollingChildHelper;
import p636z0.p725k.p739l.NestedScrollingParentHelper;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements NestedScrollingChild {

    /* JADX INFO: renamed from: f */
    public static final String f1171f = SwipeRefreshLayout.class.getSimpleName();

    /* JADX INFO: renamed from: g */
    public static final int[] f1172g = {R.attr.enabled};

    /* JADX INFO: renamed from: A */
    public int f1173A;

    /* JADX INFO: renamed from: B */
    public int f1174B;

    /* JADX INFO: renamed from: C */
    public int f1175C;

    /* JADX INFO: renamed from: D */
    public int f1176D;

    /* JADX INFO: renamed from: E */
    public int f1177E;

    /* JADX INFO: renamed from: F */
    public CircularProgressDrawable3 f1178F;

    /* JADX INFO: renamed from: G */
    public Animation f1179G;

    /* JADX INFO: renamed from: H */
    public Animation f1180H;

    /* JADX INFO: renamed from: I */
    public Animation f1181I;

    /* JADX INFO: renamed from: J */
    public Animation f1182J;

    /* JADX INFO: renamed from: K */
    public boolean f1183K;

    /* JADX INFO: renamed from: L */
    public int f1184L;

    /* JADX INFO: renamed from: M */
    public InterfaceC0189g f1185M;

    /* JADX INFO: renamed from: N */
    public Animation.AnimationListener f1186N;

    /* JADX INFO: renamed from: O */
    public final Animation f1187O;

    /* JADX INFO: renamed from: P */
    public final Animation f1188P;

    /* JADX INFO: renamed from: h */
    public View f1189h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0190h f1190i;

    /* JADX INFO: renamed from: j */
    public boolean f1191j;

    /* JADX INFO: renamed from: k */
    public int f1192k;

    /* JADX INFO: renamed from: l */
    public float f1193l;

    /* JADX INFO: renamed from: m */
    public float f1194m;

    /* JADX INFO: renamed from: n */
    public final NestedScrollingParentHelper f1195n;

    /* JADX INFO: renamed from: o */
    public final NestedScrollingChildHelper f1196o;

    /* JADX INFO: renamed from: p */
    public final int[] f1197p;

    /* JADX INFO: renamed from: q */
    public final int[] f1198q;

    /* JADX INFO: renamed from: r */
    public boolean f1199r;

    /* JADX INFO: renamed from: s */
    public int f1200s;

    /* JADX INFO: renamed from: t */
    public int f1201t;

    /* JADX INFO: renamed from: u */
    public float f1202u;

    /* JADX INFO: renamed from: v */
    public float f1203v;

    /* JADX INFO: renamed from: w */
    public boolean f1204w;

    /* JADX INFO: renamed from: x */
    public int f1205x;

    /* JADX INFO: renamed from: y */
    public final DecelerateInterpolator f1206y;

    /* JADX INFO: renamed from: z */
    public CircleImageView f1207z;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    public class AnimationAnimationListenerC0183a implements Animation.AnimationListener {
        public AnimationAnimationListenerC0183a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InterfaceC0190h interfaceC0190h;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f1191j) {
                swipeRefreshLayout.m875h();
                return;
            }
            swipeRefreshLayout.f1178F.setAlpha(255);
            SwipeRefreshLayout.this.f1178F.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.f1183K && (interfaceC0190h = swipeRefreshLayout2.f1190i) != null) {
                interfaceC0190h.mo881a();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f1201t = swipeRefreshLayout3.f1207z.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    public class C0184b extends Animation {
        public C0184b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    public class C0185c extends Animation {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f1210f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f1211g;

        public C0185c(int i, int i2) {
            this.f1210f = i;
            this.f1211g = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            CircularProgressDrawable3 circularProgressDrawable3 = SwipeRefreshLayout.this.f1178F;
            int i = this.f1210f;
            circularProgressDrawable3.setAlpha((int) (((this.f1211g - i) * f) + i));
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    public class AnimationAnimationListenerC0186d implements Animation.AnimationListener {
        public AnimationAnimationListenerC0186d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Objects.requireNonNull(SwipeRefreshLayout.this);
            SwipeRefreshLayout.this.m879l(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    public class C0187e extends Animation {
        public C0187e() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            Objects.requireNonNull(SwipeRefreshLayout.this);
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = swipeRefreshLayout.f1176D - Math.abs(swipeRefreshLayout.f1175C);
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i = swipeRefreshLayout2.f1174B;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i + ((int) ((iAbs - i) * f))) - swipeRefreshLayout2.f1207z.getTop());
            CircularProgressDrawable3 circularProgressDrawable3 = SwipeRefreshLayout.this.f1178F;
            float f2 = 1.0f - f;
            CircularProgressDrawable3.a aVar = circularProgressDrawable3.f35384i;
            if (f2 != aVar.f35405p) {
                aVar.f35405p = f2;
            }
            circularProgressDrawable3.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    public class C0188f extends Animation {
        public C0188f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.m873f(f);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    public interface InterfaceC0189g {
        /* JADX INFO: renamed from: a */
        boolean m880a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    public interface InterfaceC0190h {
        /* JADX INFO: renamed from: a */
        void mo881a();
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private void setColorViewAlpha(int i) {
        this.f1207z.getBackground().setAlpha(i);
        CircularProgressDrawable3 circularProgressDrawable3 = this.f1178F;
        circularProgressDrawable3.f35384i.f35409t = i;
        circularProgressDrawable3.invalidateSelf();
    }

    /* JADX INFO: renamed from: a */
    public boolean m868a() {
        InterfaceC0189g interfaceC0189g = this.f1185M;
        if (interfaceC0189g != null) {
            return interfaceC0189g.m880a(this, this.f1189h);
        }
        View view = this.f1189h;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: b */
    public final void m869b() {
        if (this.f1189h == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f1207z)) {
                    this.f1189h = childAt;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m870c(float f) {
        if (f > this.f1193l) {
            m876i(true, true);
            return;
        }
        this.f1191j = false;
        CircularProgressDrawable3 circularProgressDrawable3 = this.f1178F;
        CircularProgressDrawable3.a aVar = circularProgressDrawable3.f35384i;
        aVar.f35394e = 0.0f;
        aVar.f35395f = 0.0f;
        circularProgressDrawable3.invalidateSelf();
        AnimationAnimationListenerC0186d animationAnimationListenerC0186d = new AnimationAnimationListenerC0186d();
        this.f1174B = this.f1201t;
        this.f1188P.reset();
        this.f1188P.setDuration(200L);
        this.f1188P.setInterpolator(this.f1206y);
        CircleImageView circleImageView = this.f1207z;
        circleImageView.f35375f = animationAnimationListenerC0186d;
        circleImageView.clearAnimation();
        this.f1207z.startAnimation(this.f1188P);
        CircularProgressDrawable3 circularProgressDrawable4 = this.f1178F;
        CircularProgressDrawable3.a aVar2 = circularProgressDrawable4.f35384i;
        if (aVar2.f35403n) {
            aVar2.f35403n = false;
        }
        circularProgressDrawable4.invalidateSelf();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m871d(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1196o.m16291a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1196o.m16292b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1196o.m16293c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1196o.m16295e(i, i2, i3, i4, iArr);
    }

    /* JADX INFO: renamed from: e */
    public final void m872e(float f) {
        CircularProgressDrawable3 circularProgressDrawable3 = this.f1178F;
        CircularProgressDrawable3.a aVar = circularProgressDrawable3.f35384i;
        if (!aVar.f35403n) {
            aVar.f35403n = true;
        }
        circularProgressDrawable3.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.f1193l));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.f1193l;
        int i = this.f1177E;
        if (i <= 0) {
            i = this.f1176D;
        }
        float f2 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.f1175C + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        if (this.f1207z.getVisibility() != 0) {
            this.f1207z.setVisibility(0);
        }
        this.f1207z.setScaleX(1.0f);
        this.f1207z.setScaleY(1.0f);
        if (f < this.f1193l) {
            if (this.f1178F.f35384i.f35409t > 76 && !m871d(this.f1181I)) {
                this.f1181I = m877j(this.f1178F.f35384i.f35409t, 76);
            }
        } else if (this.f1178F.f35384i.f35409t < 255 && !m871d(this.f1182J)) {
            this.f1182J = m877j(this.f1178F.f35384i.f35409t, 255);
        }
        CircularProgressDrawable3 circularProgressDrawable4 = this.f1178F;
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        CircularProgressDrawable3.a aVar2 = circularProgressDrawable4.f35384i;
        aVar2.f35394e = 0.0f;
        aVar2.f35395f = fMin2;
        circularProgressDrawable4.invalidateSelf();
        CircularProgressDrawable3 circularProgressDrawable5 = this.f1178F;
        float fMin3 = Math.min(1.0f, fMax);
        CircularProgressDrawable3.a aVar3 = circularProgressDrawable5.f35384i;
        if (fMin3 != aVar3.f35405p) {
            aVar3.f35405p = fMin3;
        }
        circularProgressDrawable5.invalidateSelf();
        CircularProgressDrawable3 circularProgressDrawable6 = this.f1178F;
        circularProgressDrawable6.f35384i.f35396g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        circularProgressDrawable6.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.f1201t);
    }

    /* JADX INFO: renamed from: f */
    public void m873f(float f) {
        int i = this.f1174B;
        setTargetOffsetTopAndBottom((i + ((int) ((this.f1175C - i) * f))) - this.f1207z.getTop());
    }

    /* JADX INFO: renamed from: g */
    public final void m874g(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1205x) {
            this.f1205x = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f1173A;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1195n.m16301a();
    }

    public int getProgressCircleDiameter() {
        return this.f1184L;
    }

    public int getProgressViewEndOffset() {
        return this.f1176D;
    }

    public int getProgressViewStartOffset() {
        return this.f1175C;
    }

    /* JADX INFO: renamed from: h */
    public void m875h() {
        this.f1207z.clearAnimation();
        this.f1178F.stop();
        this.f1207z.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f1175C - this.f1201t);
        this.f1201t = this.f1207z.getTop();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f1196o.m16298h(0);
    }

    /* JADX INFO: renamed from: i */
    public final void m876i(boolean z, boolean z2) {
        if (this.f1191j != z) {
            this.f1183K = z2;
            m869b();
            this.f1191j = z;
            if (!z) {
                m879l(this.f1186N);
                return;
            }
            int i = this.f1201t;
            Animation.AnimationListener animationListener = this.f1186N;
            this.f1174B = i;
            this.f1187O.reset();
            this.f1187O.setDuration(200L);
            this.f1187O.setInterpolator(this.f1206y);
            if (animationListener != null) {
                this.f1207z.f35375f = animationListener;
            }
            this.f1207z.clearAnimation();
            this.f1207z.startAnimation(this.f1187O);
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f1196o.f38065d;
    }

    /* JADX INFO: renamed from: j */
    public final Animation m877j(int i, int i2) {
        C0185c c0185c = new C0185c(i, i2);
        c0185c.setDuration(300L);
        CircleImageView circleImageView = this.f1207z;
        circleImageView.f35375f = null;
        circleImageView.clearAnimation();
        this.f1207z.startAnimation(c0185c);
        return c0185c;
    }

    /* JADX INFO: renamed from: k */
    public final void m878k(float f) {
        float f2 = this.f1203v;
        float f3 = f - f2;
        int i = this.f1192k;
        if (f3 <= i || this.f1204w) {
            return;
        }
        this.f1202u = f2 + i;
        this.f1204w = true;
        this.f1178F.setAlpha(76);
    }

    /* JADX INFO: renamed from: l */
    public void m879l(Animation.AnimationListener animationListener) {
        C0184b c0184b = new C0184b();
        this.f1180H = c0184b;
        c0184b.setDuration(150L);
        CircleImageView circleImageView = this.f1207z;
        circleImageView.f35375f = animationListener;
        circleImageView.clearAnimation();
        this.f1207z.startAnimation(this.f1180H);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m875h();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m869b();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || m868a() || this.f1191j || this.f1199r) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.f1175C - this.f1207z.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f1205x = pointerId;
            this.f1204w = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.f1203v = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.f1204w = false;
            this.f1205x = -1;
        } else if (actionMasked == 2) {
            int i = this.f1205x;
            if (i == -1) {
                Log.e(f1171f, "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            m878k(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked == 3) {
            this.f1204w = false;
            this.f1205x = -1;
        } else if (actionMasked == 6) {
            m874g(motionEvent);
        }
        return this.f1204w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f1189h == null) {
            m869b();
        }
        View view = this.f1189h;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f1207z.getMeasuredWidth();
        int measuredHeight2 = this.f1207z.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f1201t;
        this.f1207z.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1189h == null) {
            m869b();
        }
        View view = this.f1189h;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f1207z.measure(View.MeasureSpec.makeMeasureSpec(this.f1184L, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f1184L, 1073741824));
        this.f1173A = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f1207z) {
                this.f1173A = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f1194m;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f1194m = 0.0f;
                } else {
                    this.f1194m = f - f2;
                    iArr[1] = i2;
                }
                m872e(this.f1194m);
            }
        }
        int[] iArr2 = this.f1197p;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f1198q);
        int i5 = i4 + this.f1198q[1];
        if (i5 >= 0 || m868a()) {
            return;
        }
        float fAbs = this.f1194m + Math.abs(i5);
        this.f1194m = fAbs;
        m872e(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1195n.f38067a = i;
        startNestedScroll(i & 2);
        this.f1194m = 0.0f;
        this.f1199r = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f1191j || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f1195n.m16302b(0);
        this.f1199r = false;
        float f = this.f1194m;
        if (f > 0.0f) {
            m870c(f);
            this.f1194m = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || m868a() || this.f1191j || this.f1199r) {
            return false;
        }
        if (actionMasked == 0) {
            this.f1205x = motionEvent.getPointerId(0);
            this.f1204w = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1205x);
                if (iFindPointerIndex < 0) {
                    Log.e(f1171f, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f1204w) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.f1202u) * 0.5f;
                    this.f1204w = false;
                    m870c(y);
                }
                this.f1205x = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f1205x);
                if (iFindPointerIndex2 < 0) {
                    Log.e(f1171f, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                m878k(y2);
                if (this.f1204w) {
                    float f = (y2 - this.f1202u) * 0.5f;
                    if (f <= 0.0f) {
                        return false;
                    }
                    m872e(f);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f1171f, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f1205x = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    m874g(motionEvent);
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.f1189h;
        if (view != null) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (!view.isNestedScrollingEnabled()) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.f1207z.setScaleX(f);
        this.f1207z.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m869b();
        CircularProgressDrawable3 circularProgressDrawable3 = this.f1178F;
        CircularProgressDrawable3.a aVar = circularProgressDrawable3.f35384i;
        aVar.f35398i = iArr;
        aVar.m15066a(0);
        circularProgressDrawable3.f35384i.m15066a(0);
        circularProgressDrawable3.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = ContextCompat.m16134b(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f1193l = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m875h();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        NestedScrollingChildHelper nestedScrollingChildHelper = this.f1196o;
        if (nestedScrollingChildHelper.f38065d) {
            View view = nestedScrollingChildHelper.f38064c;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            view.stopNestedScroll();
        }
        nestedScrollingChildHelper.f38065d = z;
    }

    public void setOnChildScrollUpCallback(InterfaceC0189g interfaceC0189g) {
        this.f1185M = interfaceC0189g;
    }

    public void setOnRefreshListener(InterfaceC0190h interfaceC0190h) {
        this.f1190i = interfaceC0190h;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f1207z.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(ContextCompat.m16134b(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f1191j == z) {
            m876i(z, false);
            return;
        }
        this.f1191j = z;
        setTargetOffsetTopAndBottom((this.f1176D + this.f1175C) - this.f1201t);
        this.f1183K = false;
        Animation.AnimationListener animationListener = this.f1186N;
        this.f1207z.setVisibility(0);
        this.f1178F.setAlpha(255);
        SwipeRefreshLayout2 swipeRefreshLayout2 = new SwipeRefreshLayout2(this);
        this.f1179G = swipeRefreshLayout2;
        swipeRefreshLayout2.setDuration(this.f1200s);
        if (animationListener != null) {
            this.f1207z.f35375f = animationListener;
        }
        this.f1207z.clearAnimation();
        this.f1207z.startAnimation(this.f1179G);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f1184L = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f1184L = (int) (displayMetrics.density * 40.0f);
            }
            this.f1207z.setImageDrawable(null);
            this.f1178F.m15064c(i);
            this.f1207z.setImageDrawable(this.f1178F);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f1177E = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f1207z.bringToFront();
        ViewCompat.m16320n(this.f1207z, i);
        this.f1201t = this.f1207z.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f1196o.m16299i(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f1196o.m16300j(0);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1191j = false;
        this.f1193l = -1.0f;
        this.f1197p = new int[2];
        this.f1198q = new int[2];
        this.f1205x = -1;
        this.f1173A = -1;
        this.f1186N = new AnimationAnimationListenerC0183a();
        this.f1187O = new C0187e();
        this.f1188P = new C0188f();
        this.f1192k = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f1200s = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f1206y = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f1184L = (int) (displayMetrics.density * 40.0f);
        this.f1207z = new CircleImageView(getContext(), -328966);
        CircularProgressDrawable3 circularProgressDrawable3 = new CircularProgressDrawable3(getContext());
        this.f1178F = circularProgressDrawable3;
        circularProgressDrawable3.m15064c(1);
        this.f1207z.setImageDrawable(this.f1178F);
        this.f1207z.setVisibility(8);
        addView(this.f1207z);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f1176D = i;
        this.f1193l = i;
        this.f1195n = new NestedScrollingParentHelper(this);
        this.f1196o = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f1184L;
        this.f1201t = i2;
        this.f1175C = i2;
        m873f(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1172g);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }
}
