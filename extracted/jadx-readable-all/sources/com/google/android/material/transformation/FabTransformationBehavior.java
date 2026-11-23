package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.p337c.AnimationUtils;
import p007c.p190n.p194b.p334e.p337c.AnimatorSetCompat;
import p007c.p190n.p194b.p334e.p337c.ArgbEvaluatorCompat;
import p007c.p190n.p194b.p334e.p337c.ChildrenAlphaProperty;
import p007c.p190n.p194b.p334e.p337c.DrawableAlphaProperty;
import p007c.p190n.p194b.p334e.p337c.MotionSpec;
import p007c.p190n.p194b.p334e.p337c.MotionTiming;
import p007c.p190n.p194b.p334e.p337c.Positioning;
import p007c.p190n.p194b.p334e.p345f0.FabTransformationBehavior2;
import p007c.p190n.p194b.p334e.p345f0.FabTransformationBehavior3;
import p007c.p190n.p194b.p334e.p345f0.FabTransformationBehavior4;
import p007c.p190n.p194b.p334e.p345f0.TransformationChildCard;
import p007c.p190n.p194b.p334e.p345f0.TransformationChildLayout;
import p007c.p190n.p194b.p334e.p353n.CircularRevealCompat;
import p007c.p190n.p194b.p334e.p353n.CircularRevealWidget;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c */
    public final Rect f29248c;

    /* JADX INFO: renamed from: d */
    public final RectF f29249d;

    /* JADX INFO: renamed from: e */
    public final RectF f29250e;

    /* JADX INFO: renamed from: f */
    public final int[] f29251f;

    /* JADX INFO: renamed from: g */
    public float f29252g;

    /* JADX INFO: renamed from: h */
    public float f29253h;

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public class C5992a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f29254a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f29255b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f29256c;

        public C5992a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f29254a = z;
            this.f29255b = view;
            this.f29256c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f29254a) {
                return;
            }
            this.f29255b.setVisibility(4);
            this.f29256c.setAlpha(1.0f);
            this.f29256c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f29254a) {
                this.f29255b.setVisibility(0);
                this.f29256c.setAlpha(0.0f);
                this.f29256c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    public static class C5993b {

        /* JADX INFO: renamed from: a */
        public MotionSpec f29257a;

        /* JADX INFO: renamed from: b */
        public Positioning f29258b;
    }

    public FabTransformationBehavior() {
        this.f29248c = new Rect();
        this.f29249d = new RectF();
        this.f29250e = new RectF();
        this.f29251f = new int[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* JADX INFO: renamed from: D */
    public AnimatorSet mo12897D(View view, View view2, boolean z, boolean z2) {
        C5993b c5993b;
        CircularRevealWidget circularRevealWidget;
        Animator animatorM11012s;
        MotionTiming motionTiming;
        ArrayList arrayList;
        ObjectAnimator objectAnimatorOfInt;
        C5993b c5993bMo12907N = mo12907N(view2.getContext(), z);
        if (z) {
            this.f29252g = view.getTranslationX();
            this.f29253h = view.getTranslationY();
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        m12905L(view, view2, z, z2, c5993bMo12907N, arrayList2);
        RectF rectF = this.f29249d;
        m12906M(view, view2, z, z2, c5993bMo12907N, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fM12899F = m12899F(view, view2, c5993bMo12907N.f29258b);
        float fM12900G = m12900G(view, view2, c5993bMo12907N.f29258b);
        Pair<MotionTiming, MotionTiming> pairM12898E = m12898E(fM12899F, fM12900G, z, c5993bMo12907N);
        MotionTiming motionTiming2 = (MotionTiming) pairM12898E.first;
        MotionTiming motionTiming3 = (MotionTiming) pairM12898E.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            fM12899F = this.f29252g;
        }
        fArr[0] = fM12899F;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            fM12900G = this.f29253h;
        }
        fArr2[0] = fM12900G;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        motionTiming2.m11041a(objectAnimatorOfFloat);
        motionTiming3.m11041a(objectAnimatorOfFloat2);
        arrayList2.add(objectAnimatorOfFloat);
        arrayList2.add(objectAnimatorOfFloat2);
        boolean z3 = view2 instanceof CircularRevealWidget;
        if (z3 && (view instanceof ImageView)) {
            CircularRevealWidget circularRevealWidget2 = (CircularRevealWidget) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.f24800a, 0);
                } else {
                    objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.f24800a, 255);
                }
                objectAnimatorOfInt.addUpdateListener(new FabTransformationBehavior2(this, view2));
                c5993bMo12907N.f29257a.m11039f("iconFade").m11041a(objectAnimatorOfInt);
                arrayList2.add(objectAnimatorOfInt);
                arrayList3.add(new FabTransformationBehavior3(this, circularRevealWidget2, drawable));
            }
        }
        if (z3) {
            CircularRevealWidget circularRevealWidget3 = (CircularRevealWidget) view2;
            Positioning positioning = c5993bMo12907N.f29258b;
            RectF rectF2 = this.f29249d;
            RectF rectF3 = this.f29250e;
            m12902I(view, rectF2);
            rectF2.offset(this.f29252g, this.f29253h);
            m12902I(view2, rectF3);
            rectF3.offset(-m12899F(view, view2, positioning), 0.0f);
            float fCenterX = rectF2.centerX() - rectF3.left;
            Positioning positioning2 = c5993bMo12907N.f29258b;
            RectF rectF4 = this.f29249d;
            RectF rectF5 = this.f29250e;
            m12902I(view, rectF4);
            rectF4.offset(this.f29252g, this.f29253h);
            m12902I(view2, rectF5);
            rectF5.offset(0.0f, -m12900G(view, view2, positioning2));
            float fCenterY = rectF4.centerY() - rectF5.top;
            ((FloatingActionButton) view).m12803g(this.f29248c);
            float fWidth2 = this.f29248c.width() / 2.0f;
            MotionTiming motionTimingM11039f = c5993bMo12907N.f29257a.m11039f("expansion");
            if (z) {
                if (!z2) {
                    circularRevealWidget3.setRevealInfo(new CircularRevealWidget.e(fCenterX, fCenterY, fWidth2));
                }
                if (z2) {
                    fWidth2 = circularRevealWidget3.getRevealInfo().f25198c;
                }
                float f = fWidth2;
                animatorM11012s = C4799a.m11012s(circularRevealWidget3, fCenterX, fCenterY, C4799a.m11018x(fCenterX, fCenterY, 0.0f, 0.0f, fWidth, fHeight));
                animatorM11012s.addListener(new FabTransformationBehavior4(this, circularRevealWidget3));
                motionTiming = motionTimingM11039f;
                long j2 = motionTiming.f24808a;
                int i = (int) fCenterX;
                int i2 = (int) fCenterY;
                if (j2 > 0) {
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i, i2, f, f);
                    animatorCreateCircularReveal.setStartDelay(0L);
                    animatorCreateCircularReveal.setDuration(j2);
                    arrayList2.add(animatorCreateCircularReveal);
                }
                circularRevealWidget = circularRevealWidget3;
                c5993b = c5993bMo12907N;
            } else {
                MotionTiming motionTiming4 = motionTimingM11039f;
                float f2 = circularRevealWidget3.getRevealInfo().f25198c;
                Animator animatorM11012s2 = C4799a.m11012s(circularRevealWidget3, fCenterX, fCenterY, fWidth2);
                long j3 = motionTiming4.f24808a;
                int i3 = (int) fCenterX;
                int i4 = (int) fCenterY;
                if (j3 > 0) {
                    Animator animatorCreateCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i3, i4, f2, f2);
                    animatorCreateCircularReveal2.setStartDelay(0L);
                    animatorCreateCircularReveal2.setDuration(j3);
                    arrayList2.add(animatorCreateCircularReveal2);
                }
                long j4 = motionTiming4.f24808a;
                long j5 = motionTiming4.f24809b;
                MotionSpec motionSpec = c5993bMo12907N.f29257a;
                int i5 = motionSpec.f24806a.f36667l;
                c5993b = c5993bMo12907N;
                int i6 = 0;
                long jMax = 0;
                while (i6 < i5) {
                    int i7 = i5;
                    MotionTiming motionTimingM15612l = motionSpec.f24806a.m15612l(i6);
                    jMax = Math.max(jMax, motionTimingM15612l.f24808a + motionTimingM15612l.f24809b);
                    i6++;
                    i5 = i7;
                    motionSpec = motionSpec;
                    circularRevealWidget3 = circularRevealWidget3;
                    motionTiming4 = motionTiming4;
                    i3 = i3;
                }
                MotionTiming motionTiming5 = motionTiming4;
                circularRevealWidget = circularRevealWidget3;
                int i8 = i3;
                long j6 = j4 + j5;
                if (j6 < jMax) {
                    Animator animatorCreateCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i8, i4, fWidth2, fWidth2);
                    animatorCreateCircularReveal3.setStartDelay(j6);
                    animatorCreateCircularReveal3.setDuration(jMax - j6);
                    arrayList2.add(animatorCreateCircularReveal3);
                }
                animatorM11012s = animatorM11012s2;
                motionTiming = motionTiming5;
            }
            motionTiming.m11041a(animatorM11012s);
            arrayList2.add(animatorM11012s);
            arrayList = arrayList3;
            arrayList.add(new CircularRevealCompat(circularRevealWidget));
        } else {
            c5993b = c5993bMo12907N;
            arrayList = arrayList3;
        }
        m12904K(view, view2, z, z2, c5993b, arrayList2);
        m12903J(view2, z, z2, c5993b, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.m11032a(animatorSet, arrayList2);
        animatorSet.addListener(new C5992a(this, z, view2, view));
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList.get(i9));
        }
        return animatorSet;
    }

    /* JADX INFO: renamed from: E */
    public final Pair<MotionTiming, MotionTiming> m12898E(float f, float f2, boolean z, C5993b c5993b) {
        MotionTiming motionTimingM11039f;
        MotionTiming motionTimingM11039f2;
        if (f == 0.0f || f2 == 0.0f) {
            motionTimingM11039f = c5993b.f29257a.m11039f("translationXLinear");
            motionTimingM11039f2 = c5993b.f29257a.m11039f("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            motionTimingM11039f = c5993b.f29257a.m11039f("translationXCurveDownwards");
            motionTimingM11039f2 = c5993b.f29257a.m11039f("translationYCurveDownwards");
        } else {
            motionTimingM11039f = c5993b.f29257a.m11039f("translationXCurveUpwards");
            motionTimingM11039f2 = c5993b.f29257a.m11039f("translationYCurveUpwards");
        }
        return new Pair<>(motionTimingM11039f, motionTimingM11039f2);
    }

    /* JADX INFO: renamed from: F */
    public final float m12899F(View view, View view2, Positioning positioning) {
        float fCenterX;
        float fCenterX2;
        RectF rectF = this.f29249d;
        RectF rectF2 = this.f29250e;
        m12902I(view, rectF);
        rectF.offset(this.f29252g, this.f29253h);
        m12902I(view2, rectF2);
        float f = 0.0f;
        int i = positioning.f24813a & 7;
        if (i == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else {
            if (i != 3) {
                if (i == 5) {
                    fCenterX = rectF2.right;
                    fCenterX2 = rectF.right;
                }
                return f + positioning.f24814b;
            }
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        }
        f = fCenterX - fCenterX2;
        return f + positioning.f24814b;
    }

    /* JADX INFO: renamed from: G */
    public final float m12900G(View view, View view2, Positioning positioning) {
        float fCenterY;
        float fCenterY2;
        RectF rectF = this.f29249d;
        RectF rectF2 = this.f29250e;
        m12902I(view, rectF);
        rectF.offset(this.f29252g, this.f29253h);
        m12902I(view2, rectF2);
        float f = 0.0f;
        int i = positioning.f24813a & 112;
        if (i == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else {
            if (i != 48) {
                if (i == 80) {
                    fCenterY = rectF2.bottom;
                    fCenterY2 = rectF.bottom;
                }
                return f + positioning.f24815c;
            }
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        }
        f = fCenterY - fCenterY2;
        return f + positioning.f24815c;
    }

    /* JADX INFO: renamed from: H */
    public final float m12901H(C5993b c5993b, MotionTiming motionTiming, float f, float f2) {
        long j2 = motionTiming.f24808a;
        long j3 = motionTiming.f24809b;
        MotionTiming motionTimingM11039f = c5993b.f29257a.m11039f("expansion");
        return AnimationUtils.m11030a(f, f2, motionTiming.m11042b().getInterpolation((((motionTimingM11039f.f24808a + motionTimingM11039f.f24809b) + 17) - j2) / j3));
    }

    /* JADX INFO: renamed from: I */
    public final void m12902I(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f29251f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* JADX INFO: renamed from: J */
    public final void m12903J(View view, boolean z, boolean z2, C5993b c5993b, List list) {
        ViewGroup viewGroupM12908O;
        ObjectAnimator objectAnimatorOfFloat;
        if (view instanceof ViewGroup) {
            boolean z3 = view instanceof CircularRevealWidget;
            View viewFindViewById = view.findViewById(R.id.mtrl_child_content_container);
            if (viewFindViewById != null) {
                viewGroupM12908O = m12908O(viewFindViewById);
            } else {
                viewGroupM12908O = ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) ? m12908O(((ViewGroup) view).getChildAt(0)) : m12908O(view);
            }
            if (viewGroupM12908O == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    ChildrenAlphaProperty.f24799a.set(viewGroupM12908O, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupM12908O, ChildrenAlphaProperty.f24799a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupM12908O, ChildrenAlphaProperty.f24799a, 0.0f);
            }
            c5993b.f29257a.m11039f("contentFade").m11041a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final void m12904K(View view, View view2, boolean z, boolean z2, C5993b c5993b, List list) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof CircularRevealWidget) {
            CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            ColorStateList backgroundTintList = view.getBackgroundTintList();
            int colorForState = backgroundTintList != null ? backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor()) : 0;
            int i = 16777215 & colorForState;
            if (z) {
                if (!z2) {
                    circularRevealWidget.setCircularRevealScrimColor(colorForState);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(circularRevealWidget, CircularRevealWidget.d.f25195a, i);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(circularRevealWidget, CircularRevealWidget.d.f25195a, colorForState);
            }
            objectAnimatorOfInt.setEvaluator(ArgbEvaluatorCompat.f24798a);
            c5993b.f29257a.m11039f("color").m11041a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: L */
    public final void m12905L(View view, View view2, boolean z, boolean z2, C5993b c5993b, List list) {
        ObjectAnimator objectAnimatorOfFloat;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        c5993b.f29257a.m11039f("elevation").m11041a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: M */
    public final void m12906M(View view, View view2, boolean z, boolean z2, C5993b c5993b, List list, RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fM12899F = m12899F(view, view2, c5993b.f29258b);
        float fM12900G = m12900G(view, view2, c5993b.f29258b);
        Pair<MotionTiming, MotionTiming> pairM12898E = m12898E(fM12899F, fM12900G, z, c5993b);
        MotionTiming motionTiming = (MotionTiming) pairM12898E.first;
        MotionTiming motionTiming2 = (MotionTiming) pairM12898E.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fM12899F);
                view2.setTranslationY(-fM12900G);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fM12901H = m12901H(c5993b, motionTiming, -fM12899F, 0.0f);
            float fM12901H2 = m12901H(c5993b, motionTiming2, -fM12900G, 0.0f);
            Rect rect = this.f29248c;
            view2.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.f29249d;
            rectF2.set(rect);
            RectF rectF3 = this.f29250e;
            m12902I(view2, rectF3);
            rectF3.offset(fM12901H, fM12901H2);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fM12899F);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fM12900G);
        }
        motionTiming.m11041a(objectAnimatorOfFloat);
        motionTiming2.m11041a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: N */
    public abstract C5993b mo12907N(Context context, boolean z);

    /* JADX INFO: renamed from: O */
    public final ViewGroup m12908O(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: d */
    public boolean mo312d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: f */
    public void mo314f(CoordinatorLayout.C0101f c0101f) {
        if (c0101f.f650h == 0) {
            c0101f.f650h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29248c = new Rect();
        this.f29249d = new RectF();
        this.f29250e = new RectF();
        this.f29251f = new int[2];
    }
}
