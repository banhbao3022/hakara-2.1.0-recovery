package p007c.p190n.p194b.p334e.p359s;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p334e.p337c.AnimationUtils;
import p007c.p190n.p194b.p334e.p337c.AnimatorSetCompat;
import p007c.p190n.p194b.p334e.p337c.ImageMatrixProperty;
import p007c.p190n.p194b.p334e.p337c.MatrixEvaluator;
import p007c.p190n.p194b.p334e.p337c.MotionSpec;
import p007c.p190n.p194b.p334e.p360t.StateListAnimator;
import p007c.p190n.p194b.p334e.p364x.ShadowViewDelegate;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearanceModel;
import p007c.p190n.p194b.p334e.p365y.Shapeable;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: c.n.b.e.s.h, reason: use source file name */
/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButtonImpl3 {

    /* JADX INFO: renamed from: a */
    public static final TimeInterpolator f25366a = AnimationUtils.f24795c;

    /* JADX INFO: renamed from: b */
    public static final int[] f25367b = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: c */
    public static final int[] f25368c = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: d */
    public static final int[] f25369d = {R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: e */
    public static final int[] f25370e = {R.attr.state_hovered, R.attr.state_enabled};

    /* JADX INFO: renamed from: f */
    public static final int[] f25371f = {R.attr.state_enabled};

    /* JADX INFO: renamed from: g */
    public static final int[] f25372g = new int[0];

    /* JADX INFO: renamed from: A */
    public int f25373A;

    /* JADX INFO: renamed from: C */
    public ArrayList<Animator.AnimatorListener> f25375C;

    /* JADX INFO: renamed from: D */
    public ArrayList<Animator.AnimatorListener> f25376D;

    /* JADX INFO: renamed from: E */
    public ArrayList<e> f25377E;

    /* JADX INFO: renamed from: F */
    public final FloatingActionButton f25378F;

    /* JADX INFO: renamed from: G */
    public final ShadowViewDelegate f25379G;

    /* JADX INFO: renamed from: L */
    public ViewTreeObserver.OnPreDrawListener f25384L;

    /* JADX INFO: renamed from: h */
    public ShapeAppearanceModel f25385h;

    /* JADX INFO: renamed from: i */
    public MaterialShapeDrawable f25386i;

    /* JADX INFO: renamed from: j */
    public Drawable f25387j;

    /* JADX INFO: renamed from: k */
    public BorderDrawable f25388k;

    /* JADX INFO: renamed from: l */
    public Drawable f25389l;

    /* JADX INFO: renamed from: m */
    public boolean f25390m;

    /* JADX INFO: renamed from: o */
    public float f25392o;

    /* JADX INFO: renamed from: p */
    public float f25393p;

    /* JADX INFO: renamed from: q */
    public float f25394q;

    /* JADX INFO: renamed from: r */
    public int f25395r;

    /* JADX INFO: renamed from: s */
    public final StateListAnimator f25396s;

    /* JADX INFO: renamed from: t */
    public MotionSpec f25397t;

    /* JADX INFO: renamed from: u */
    public MotionSpec f25398u;

    /* JADX INFO: renamed from: v */
    public Animator f25399v;

    /* JADX INFO: renamed from: w */
    public MotionSpec f25400w;

    /* JADX INFO: renamed from: x */
    public MotionSpec f25401x;

    /* JADX INFO: renamed from: y */
    public float f25402y;

    /* JADX INFO: renamed from: n */
    public boolean f25391n = true;

    /* JADX INFO: renamed from: z */
    public float f25403z = 1.0f;

    /* JADX INFO: renamed from: B */
    public int f25374B = 0;

    /* JADX INFO: renamed from: H */
    public final Rect f25380H = new Rect();

    /* JADX INFO: renamed from: I */
    public final RectF f25381I = new RectF();

    /* JADX INFO: renamed from: J */
    public final RectF f25382J = new RectF();

    /* JADX INFO: renamed from: K */
    public final Matrix f25383K = new Matrix();

    /* JADX INFO: renamed from: c.n.b.e.s.h$a */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class a extends MatrixEvaluator {
        public a() {
        }

        @Override // p007c.p190n.p194b.p334e.p337c.MatrixEvaluator
        /* JADX INFO: renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            FloatingActionButtonImpl3.this.f25403z = f;
            return super.evaluate(f, matrix, matrix2);
        }

        @Override // p007c.p190n.p194b.p334e.p337c.MatrixEvaluator, android.animation.TypeEvaluator
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            FloatingActionButtonImpl3.this.f25403z = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.s.h$b */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class b extends h {
        public b(FloatingActionButtonImpl3 floatingActionButtonImpl3) {
            super(null);
        }

        @Override // p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl3.h
        /* JADX INFO: renamed from: a */
        public float mo11294a() {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.s.h$c */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class c extends h {
        public c() {
            super(null);
        }

        @Override // p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl3.h
        /* JADX INFO: renamed from: a */
        public float mo11294a() {
            FloatingActionButtonImpl3 floatingActionButtonImpl3 = FloatingActionButtonImpl3.this;
            return floatingActionButtonImpl3.f25392o + floatingActionButtonImpl3.f25393p;
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.s.h$d */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class d extends h {
        public d() {
            super(null);
        }

        @Override // p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl3.h
        /* JADX INFO: renamed from: a */
        public float mo11294a() {
            FloatingActionButtonImpl3 floatingActionButtonImpl3 = FloatingActionButtonImpl3.this;
            return floatingActionButtonImpl3.f25392o + floatingActionButtonImpl3.f25394q;
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.s.h$e */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo11295a();

        /* JADX INFO: renamed from: b */
        void mo11296b();
    }

    /* JADX INFO: renamed from: c.n.b.e.s.h$f */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public interface f {
    }

    /* JADX INFO: renamed from: c.n.b.e.s.h$g */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class g extends h {
        public g() {
            super(null);
        }

        @Override // p007c.p190n.p194b.p334e.p359s.FloatingActionButtonImpl3.h
        /* JADX INFO: renamed from: a */
        public float mo11294a() {
            return FloatingActionButtonImpl3.this.f25392o;
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.s.h$h */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public abstract class h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public boolean f25408a;

        /* JADX INFO: renamed from: b */
        public float f25409b;

        /* JADX INFO: renamed from: c */
        public float f25410c;

        public h(FloatingActionButtonImpl floatingActionButtonImpl) {
        }

        /* JADX INFO: renamed from: a */
        public abstract float mo11294a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FloatingActionButtonImpl3.this.m11293w((int) this.f25410c);
            this.f25408a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f25408a) {
                MaterialShapeDrawable materialShapeDrawable = FloatingActionButtonImpl3.this.f25386i;
                this.f25409b = materialShapeDrawable == null ? 0.0f : materialShapeDrawable.f25574h.f25608o;
                this.f25410c = mo11294a();
                this.f25408a = true;
            }
            FloatingActionButtonImpl3 floatingActionButtonImpl3 = FloatingActionButtonImpl3.this;
            float f = this.f25409b;
            floatingActionButtonImpl3.m11293w((int) ((valueAnimator.getAnimatedFraction() * (this.f25410c - f)) + f));
        }
    }

    public FloatingActionButtonImpl3(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        this.f25378F = floatingActionButton;
        this.f25379G = shadowViewDelegate;
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.f25396s = stateListAnimator;
        stateListAnimator.m11334a(f25367b, m11273c(new d()));
        stateListAnimator.m11334a(f25368c, m11273c(new c()));
        stateListAnimator.m11334a(f25369d, m11273c(new c()));
        stateListAnimator.m11334a(f25370e, m11273c(new c()));
        stateListAnimator.m11334a(f25371f, m11273c(new g()));
        stateListAnimator.m11334a(f25372g, m11273c(new b(this)));
        this.f25402y = floatingActionButton.getRotation();
    }

    /* JADX INFO: renamed from: a */
    public final void m11271a(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f25378F.getDrawable();
        if (drawable == null || this.f25373A == 0) {
            return;
        }
        RectF rectF = this.f25381I;
        RectF rectF2 = this.f25382J;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i = this.f25373A;
        rectF2.set(0.0f, 0.0f, i, i);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i2 = this.f25373A;
        matrix.postScale(f2, f2, i2 / 2.0f, i2 / 2.0f);
    }

    /* JADX INFO: renamed from: b */
    public final AnimatorSet m11272b(MotionSpec motionSpec, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25378F, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        motionSpec.m11039f("opacity").m11041a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f25378F, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        motionSpec.m11039f("scale").m11041a(objectAnimatorOfFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            objectAnimatorOfFloat2.setEvaluator(new FloatingActionButtonImpl4(this));
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f25378F, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        motionSpec.m11039f("scale").m11041a(objectAnimatorOfFloat3);
        if (i == 26) {
            objectAnimatorOfFloat3.setEvaluator(new FloatingActionButtonImpl4(this));
        }
        arrayList.add(objectAnimatorOfFloat3);
        m11271a(f4, this.f25383K);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f25378F, new ImageMatrixProperty(), new a(), new Matrix(this.f25383K));
        motionSpec.m11039f("iconScale").m11041a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.m11032a(animatorSet, arrayList);
        return animatorSet;
    }

    /* JADX INFO: renamed from: c */
    public final ValueAnimator m11273c(h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f25366a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* JADX INFO: renamed from: d */
    public float mo11274d() {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public void mo11275e(Rect rect) {
        int sizeDimension = this.f25390m ? (this.f25395r - this.f25378F.getSizeDimension()) / 2 : 0;
        float fMo11274d = this.f25391n ? mo11274d() + this.f25394q : 0.0f;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(fMo11274d));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(fMo11274d * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    /* JADX INFO: renamed from: f */
    public void mo11276f(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m11277g() {
        if (this.f25378F.getVisibility() == 0) {
            return this.f25374B == 1;
        }
        return this.f25374B != 2;
    }

    /* JADX INFO: renamed from: h */
    public boolean m11278h() {
        if (this.f25378F.getVisibility() != 0) {
            return this.f25374B == 2;
        }
        return this.f25374B != 1;
    }

    /* JADX INFO: renamed from: i */
    public void mo11279i() {
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public void mo11280j() {
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public void mo11281k(int[] iArr) {
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public void mo11282l(float f2, float f3, float f4) {
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public void m11283m() {
        ArrayList<e> arrayList = this.f25377E;
        if (arrayList != null) {
            Iterator<e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo11296b();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m11284n() {
        ArrayList<e> arrayList = this.f25377E;
        if (arrayList != null) {
            Iterator<e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo11295a();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m11285o(float f2) {
        this.f25403z = f2;
        Matrix matrix = this.f25383K;
        m11271a(f2, matrix);
        this.f25378F.setImageMatrix(matrix);
    }

    /* JADX INFO: renamed from: p */
    public void mo11286p(ColorStateList colorStateList) {
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public final void m11287q(ShapeAppearanceModel shapeAppearanceModel) {
        this.f25385h = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.f25386i;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.f25574h.f25594a = shapeAppearanceModel;
            materialShapeDrawable.invalidateSelf();
        }
        Object obj = this.f25387j;
        if (obj instanceof Shapeable) {
            ((Shapeable) obj).setShapeAppearanceModel(shapeAppearanceModel);
        }
        BorderDrawable borderDrawable = this.f25388k;
        if (borderDrawable != null) {
            borderDrawable.f25351o = shapeAppearanceModel;
            borderDrawable.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean mo11288r() {
        throw null;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11289s() {
        FloatingActionButton floatingActionButton = this.f25378F;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        return floatingActionButton.isLaidOut() && !this.f25378F.isInEditMode();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m11290t() {
        return !this.f25390m || this.f25378F.getSizeDimension() >= this.f25395r;
    }

    /* JADX INFO: renamed from: u */
    public void mo11291u() {
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public final void m11292v() {
        Rect rect = this.f25380H;
        mo11275e(rect);
        C8162a.m16063h(this.f25389l, "Didn't initialize content background");
        if (mo11288r()) {
            InsetDrawable insetDrawable = new InsetDrawable(this.f25389l, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.C5958b c5958b = (FloatingActionButton.C5958b) this.f25379G;
            Objects.requireNonNull(c5958b);
            super/*android.widget.ImageButton*/.setBackgroundDrawable(insetDrawable);
        } else {
            ShadowViewDelegate shadowViewDelegate = this.f25379G;
            Drawable drawable = this.f25389l;
            FloatingActionButton.C5958b c5958b2 = (FloatingActionButton.C5958b) shadowViewDelegate;
            Objects.requireNonNull(c5958b2);
            if (drawable != null) {
                super/*android.widget.ImageButton*/.setBackgroundDrawable(drawable);
            }
        }
        ShadowViewDelegate shadowViewDelegate2 = this.f25379G;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        FloatingActionButton.C5958b c5958b3 = (FloatingActionButton.C5958b) shadowViewDelegate2;
        FloatingActionButton.this.f28987r.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        int i5 = floatingActionButton.f28984o;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }

    /* JADX INFO: renamed from: w */
    public void m11293w(float f2) {
        MaterialShapeDrawable materialShapeDrawable = this.f25386i;
        if (materialShapeDrawable != null) {
            MaterialShapeDrawable.b bVar = materialShapeDrawable.f25574h;
            if (bVar.f25608o != f2) {
                bVar.f25608o = f2;
                materialShapeDrawable.m11365A();
            }
        }
    }
}
