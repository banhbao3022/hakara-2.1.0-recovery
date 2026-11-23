package p636z0.p685e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: z0.e0.b, reason: use source file name */
/* JADX INFO: compiled from: ChangeBounds.java */
/* JADX INFO: loaded from: classes.dex */
public class ChangeBounds extends Transition3 {

    /* JADX INFO: renamed from: D */
    public static final String[] f36379D = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: E */
    public static final Property<Drawable, PointF> f36380E = new a(PointF.class, "boundsOrigin");

    /* JADX INFO: renamed from: F */
    public static final Property<j, PointF> f36381F = new b(PointF.class, "topLeft");

    /* JADX INFO: renamed from: G */
    public static final Property<j, PointF> f36382G = new c(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: H */
    public static final Property<View, PointF> f36383H = new d(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: I */
    public static final Property<View, PointF> f36384I = new e(PointF.class, "topLeft");

    /* JADX INFO: renamed from: J */
    public static final Property<View, PointF> f36385J = new f(PointF.class, "position");

    /* JADX INFO: renamed from: K */
    public static RectEvaluator f36386K = new RectEvaluator();

    /* JADX INFO: renamed from: L */
    public int[] f36387L;

    /* JADX INFO: renamed from: M */
    public boolean f36388M;

    /* JADX INFO: renamed from: z0.e0.b$a */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public static class a extends Property<Drawable, PointF> {

        /* JADX INFO: renamed from: a */
        public Rect f36389a;

        public a(Class cls, String str) {
            super(cls, str);
            this.f36389a = new Rect();
        }

        @Override // android.util.Property
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f36389a);
            Rect rect = this.f36389a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.f36389a);
            this.f36389a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.f36389a);
        }
    }

    /* JADX INFO: renamed from: z0.e0.b$b */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public static class b extends Property<j, PointF> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(j jVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(j jVar, PointF pointF) {
            j jVar2 = jVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(jVar2);
            jVar2.f36400a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            jVar2.f36401b = iRound;
            int i = jVar2.f36405f + 1;
            jVar2.f36405f = i;
            if (i == jVar2.f36406g) {
                ViewUtils6.m15531b(jVar2.f36404e, jVar2.f36400a, iRound, jVar2.f36402c, jVar2.f36403d);
                jVar2.f36405f = 0;
                jVar2.f36406g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: z0.e0.b$c */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public static class c extends Property<j, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(j jVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(j jVar, PointF pointF) {
            j jVar2 = jVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(jVar2);
            jVar2.f36402c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            jVar2.f36403d = iRound;
            int i = jVar2.f36406g + 1;
            jVar2.f36406g = i;
            if (jVar2.f36405f == i) {
                ViewUtils6.m15531b(jVar2.f36404e, jVar2.f36400a, jVar2.f36401b, jVar2.f36402c, iRound);
                jVar2.f36405f = 0;
                jVar2.f36406g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: z0.e0.b$d */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public static class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            ViewUtils6.m15531b(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* JADX INFO: renamed from: z0.e0.b$e */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            ViewUtils6.m15531b(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* JADX INFO: renamed from: z0.e0.b$f */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            ViewUtils6.m15531b(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: z0.e0.b$g */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j f36390a;
        private j mViewBounds;

        public g(ChangeBounds changeBounds, j jVar) {
            this.f36390a = jVar;
            this.mViewBounds = jVar;
        }
    }

    /* JADX INFO: renamed from: z0.e0.b$h */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f36391a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f36392b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Rect f36393c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f36394d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f36395e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f36396f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f36397g;

        public h(ChangeBounds changeBounds, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f36392b = view;
            this.f36393c = rect;
            this.f36394d = i;
            this.f36395e = i2;
            this.f36396f = i3;
            this.f36397g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f36391a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f36391a) {
                return;
            }
            View view = this.f36392b;
            Rect rect = this.f36393c;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            view.setClipBounds(rect);
            ViewUtils6.m15531b(this.f36392b, this.f36394d, this.f36395e, this.f36396f, this.f36397g);
        }
    }

    /* JADX INFO: renamed from: z0.e0.b$i */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public class i extends TransitionListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f36398a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewGroup f36399b;

        public i(ChangeBounds changeBounds, ViewGroup viewGroup) {
            this.f36399b = viewGroup;
        }

        @Override // p636z0.p685e0.TransitionListenerAdapter, p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: b */
        public void mo12474b(Transition3 transition3) {
            ViewGroupUtils.m15529a(this.f36399b, false);
        }

        @Override // p636z0.p685e0.TransitionListenerAdapter, p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: c */
        public void mo12475c(Transition3 transition3) {
            if (!this.f36398a) {
                ViewGroupUtils.m15529a(this.f36399b, false);
            }
            transition3.mo15518z(this);
        }

        @Override // p636z0.p685e0.TransitionListenerAdapter, p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: d */
        public void mo12476d(Transition3 transition3) {
            ViewGroupUtils.m15529a(this.f36399b, false);
            this.f36398a = true;
        }

        @Override // p636z0.p685e0.TransitionListenerAdapter, p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: e */
        public void mo12477e(Transition3 transition3) {
            ViewGroupUtils.m15529a(this.f36399b, true);
        }
    }

    /* JADX INFO: renamed from: z0.e0.b$j */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public static class j {

        /* JADX INFO: renamed from: a */
        public int f36400a;

        /* JADX INFO: renamed from: b */
        public int f36401b;

        /* JADX INFO: renamed from: c */
        public int f36402c;

        /* JADX INFO: renamed from: d */
        public int f36403d;

        /* JADX INFO: renamed from: e */
        public View f36404e;

        /* JADX INFO: renamed from: f */
        public int f36405f;

        /* JADX INFO: renamed from: g */
        public int f36406g;

        public j(View view) {
            this.f36404e = view;
        }
    }

    public ChangeBounds() {
        this.f36387L = new int[2];
        this.f36388M = false;
    }

    /* JADX INFO: renamed from: O */
    public final void m15460O(TransitionValues transitionValues) {
        View view = transitionValues.f36493b;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        transitionValues.f36492a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        transitionValues.f36492a.put("android:changeBounds:parent", transitionValues.f36493b.getParent());
        if (this.f36388M) {
            transitionValues.f36492a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: e */
    public void mo11341e(TransitionValues transitionValues) {
        m15460O(transitionValues);
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: j */
    public void mo11342j(TransitionValues transitionValues) {
        m15460O(transitionValues);
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: n */
    public Animator mo11343n(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i2;
        View view;
        ObjectAnimator objectAnimatorM16953t;
        int i3;
        Rect rect;
        boolean z;
        int i4;
        char c2;
        ObjectAnimator objectAnimator;
        Animator animator;
        Animator animatorM16953t;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        Map<String, Object> map = transitionValues.f36492a;
        Map<String, Object> map2 = transitionValues2.f36492a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = transitionValues2.f36493b;
        Rect rect2 = (Rect) transitionValues.f36492a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) transitionValues2.f36492a.get("android:changeBounds:bounds");
        int i5 = rect2.left;
        int i6 = rect3.left;
        int i7 = rect2.top;
        int i8 = rect3.top;
        int i9 = rect2.right;
        int i10 = rect3.right;
        int i11 = rect2.bottom;
        int i12 = rect3.bottom;
        int i13 = i9 - i5;
        int i14 = i11 - i7;
        int i15 = i10 - i6;
        int i16 = i12 - i8;
        Rect rect4 = (Rect) transitionValues.f36492a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) transitionValues2.f36492a.get("android:changeBounds:clip");
        if ((i13 == 0 || i14 == 0) && (i15 == 0 || i16 == 0)) {
            i2 = 0;
        } else {
            i2 = (i5 == i6 && i7 == i8) ? 0 : 1;
            if (i9 != i10 || i11 != i12) {
                i2++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i2++;
        }
        int i17 = i2;
        if (i17 <= 0) {
            return null;
        }
        if (this.f36388M) {
            ViewUtils6.m15531b(view, i5, i7, Math.max(i13, i15) + i5, Math.max(i14, i16) + i7);
            if (i5 == i6 && i7 == i8) {
                objectAnimatorM16953t = null;
            } else {
                view = view2;
                objectAnimatorM16953t = C8462c.m16953t(view, f36385J, this.f36448C.mo15490a(i5, i7, i6, i8));
            }
            if (rect4 == null) {
                i3 = 0;
                rect = new Rect(0, 0, i13, i14);
            } else {
                i3 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i3, i3, i15, i16) : rect5;
            if (rect.equals(rect6)) {
                z = true;
                i4 = 2;
                c2 = 0;
                objectAnimator = null;
            } else {
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                view.setClipBounds(rect);
                RectEvaluator rectEvaluator = f36386K;
                Object[] objArr = new Object[2];
                objArr[i3] = rect;
                objArr[1] = rect6;
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", rectEvaluator, objArr);
                c2 = 0;
                z = true;
                i4 = 2;
                objectAnimatorOfObject.addListener(new h(this, view, rect5, i6, i8, i10, i12));
                objectAnimator = objectAnimatorOfObject;
            }
            boolean z2 = TransitionUtils.f36489a;
            if (objectAnimatorM16953t == null) {
                animator = objectAnimator;
            } else if (objectAnimator == null) {
                animator = objectAnimatorM16953t;
            } else {
                AnimatorSet animatorSet = new AnimatorSet();
                Animator[] animatorArr = new Animator[i4];
                animatorArr[c2] = objectAnimatorM16953t;
                animatorArr[z ? 1 : 0] = objectAnimator;
                animatorSet.playTogether(animatorArr);
                animator = animatorSet;
            }
        } else {
            ViewUtils6.m15531b(view, i5, i7, i9, i11);
            if (i17 != 2) {
                animatorM16953t = (i5 == i6 && i7 == i8) ? C8462c.m16953t(view, f36383H, this.f36448C.mo15490a(i9, i11, i10, i12)) : C8462c.m16953t(view, f36384I, this.f36448C.mo15490a(i5, i7, i6, i8));
            } else if (i13 == i15 && i14 == i16) {
                animatorM16953t = C8462c.m16953t(view, f36385J, this.f36448C.mo15490a(i5, i7, i6, i8));
            } else {
                j jVar = new j(view);
                ObjectAnimator objectAnimatorM16953t2 = C8462c.m16953t(jVar, f36381F, this.f36448C.mo15490a(i5, i7, i6, i8));
                ObjectAnimator objectAnimatorM16953t3 = C8462c.m16953t(jVar, f36382G, this.f36448C.mo15490a(i9, i11, i10, i12));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(objectAnimatorM16953t2, objectAnimatorM16953t3);
                animatorSet2.addListener(new g(this, jVar));
                animatorM16953t = animatorSet2;
            }
            z = true;
            animator = animatorM16953t;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            ViewGroupUtils.m15529a(viewGroup4, z);
            mo15505a(new i(this, viewGroup4));
        }
        return animator;
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: s */
    public String[] mo15461s() {
        return f36379D;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36387L = new int[2];
        this.f36388M = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.f36439b);
        boolean z = C8162a.m16033D((XmlResourceParser) attributeSet, "resizeClip") ? typedArrayObtainStyledAttributes.getBoolean(0, false) : false;
        typedArrayObtainStyledAttributes.recycle();
        this.f36388M = z;
    }
}
