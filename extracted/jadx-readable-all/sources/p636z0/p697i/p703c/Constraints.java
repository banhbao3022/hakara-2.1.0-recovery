package p636z0.p697i.p703c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Objects;

/* JADX INFO: renamed from: z0.i.c.e, reason: use source file name */
/* JADX INFO: compiled from: Constraints.java */
/* JADX INFO: loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* JADX INFO: renamed from: f */
    public ConstraintSet f37146f;

    public Constraints(Context context) {
        super(context);
        setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public ConstraintSet getConstraintSet() {
        if (this.f37146f == null) {
            this.f37146f = new ConstraintSet();
        }
        ConstraintSet constraintSet = this.f37146f;
        Objects.requireNonNull(constraintSet);
        int childCount = getChildCount();
        constraintSet.f37049e.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            a aVar = (a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (constraintSet.f37048d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!constraintSet.f37049e.containsKey(Integer.valueOf(id))) {
                constraintSet.f37049e.put(Integer.valueOf(id), new ConstraintSet.a());
            }
            ConstraintSet.a aVar2 = constraintSet.f37049e.get(Integer.valueOf(id));
            if (childAt instanceof ConstraintHelper) {
                ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                aVar2.m15857c(id, aVar);
                if (constraintHelper instanceof Barrier) {
                    ConstraintSet.b bVar = aVar2.f37053d;
                    bVar.f37091e0 = 1;
                    Barrier barrier = (Barrier) constraintHelper;
                    bVar.f37087c0 = barrier.getType();
                    aVar2.f37053d.f37093f0 = barrier.getReferencedIds();
                    aVar2.f37053d.f37089d0 = barrier.getMargin();
                }
            }
            aVar2.m15857c(id, aVar);
        }
        return this.f37146f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0094a(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.v("Constraints", " ################# init");
        setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Log.v("Constraints", " ################# init");
        setVisibility(8);
    }

    /* JADX INFO: renamed from: z0.i.c.e$a */
    /* JADX INFO: compiled from: Constraints.java */
    public static class a extends ConstraintLayout.C0094a {

        /* JADX INFO: renamed from: n0 */
        public float f37147n0;

        /* JADX INFO: renamed from: o0 */
        public boolean f37148o0;

        /* JADX INFO: renamed from: p0 */
        public float f37149p0;

        /* JADX INFO: renamed from: q0 */
        public float f37150q0;

        /* JADX INFO: renamed from: r0 */
        public float f37151r0;

        /* JADX INFO: renamed from: s0 */
        public float f37152s0;

        /* JADX INFO: renamed from: t0 */
        public float f37153t0;

        /* JADX INFO: renamed from: u0 */
        public float f37154u0;

        /* JADX INFO: renamed from: v0 */
        public float f37155v0;

        /* JADX INFO: renamed from: w0 */
        public float f37156w0;

        /* JADX INFO: renamed from: x0 */
        public float f37157x0;

        /* JADX INFO: renamed from: y0 */
        public float f37158y0;

        /* JADX INFO: renamed from: z0 */
        public float f37159z0;

        public a(int i, int i2) {
            super(i, i2);
            this.f37147n0 = 1.0f;
            this.f37148o0 = false;
            this.f37149p0 = 0.0f;
            this.f37150q0 = 0.0f;
            this.f37151r0 = 0.0f;
            this.f37152s0 = 0.0f;
            this.f37153t0 = 1.0f;
            this.f37154u0 = 1.0f;
            this.f37155v0 = 0.0f;
            this.f37156w0 = 0.0f;
            this.f37157x0 = 0.0f;
            this.f37158y0 = 0.0f;
            this.f37159z0 = 0.0f;
        }

        public a(a aVar) {
            super((ConstraintLayout.C0094a) aVar);
            this.f37147n0 = 1.0f;
            this.f37148o0 = false;
            this.f37149p0 = 0.0f;
            this.f37150q0 = 0.0f;
            this.f37151r0 = 0.0f;
            this.f37152s0 = 0.0f;
            this.f37153t0 = 1.0f;
            this.f37154u0 = 1.0f;
            this.f37155v0 = 0.0f;
            this.f37156w0 = 0.0f;
            this.f37157x0 = 0.0f;
            this.f37158y0 = 0.0f;
            this.f37159z0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f37147n0 = 1.0f;
            this.f37148o0 = false;
            this.f37149p0 = 0.0f;
            this.f37150q0 = 0.0f;
            this.f37151r0 = 0.0f;
            this.f37152s0 = 0.0f;
            this.f37153t0 = 1.0f;
            this.f37154u0 = 1.0f;
            this.f37155v0 = 0.0f;
            this.f37156w0 = 0.0f;
            this.f37157x0 = 0.0f;
            this.f37158y0 = 0.0f;
            this.f37159z0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8022i.f37166d);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.f37147n0 = typedArrayObtainStyledAttributes.getFloat(index, this.f37147n0);
                } else if (index == 28) {
                    this.f37149p0 = typedArrayObtainStyledAttributes.getFloat(index, this.f37149p0);
                    this.f37148o0 = true;
                } else if (index == 23) {
                    this.f37151r0 = typedArrayObtainStyledAttributes.getFloat(index, this.f37151r0);
                } else if (index == 24) {
                    this.f37152s0 = typedArrayObtainStyledAttributes.getFloat(index, this.f37152s0);
                } else if (index == 22) {
                    this.f37150q0 = typedArrayObtainStyledAttributes.getFloat(index, this.f37150q0);
                } else if (index == 20) {
                    this.f37153t0 = typedArrayObtainStyledAttributes.getFloat(index, this.f37153t0);
                } else if (index == 21) {
                    this.f37154u0 = typedArrayObtainStyledAttributes.getFloat(index, this.f37154u0);
                } else if (index == 16) {
                    this.f37155v0 = typedArrayObtainStyledAttributes.getFloat(index, this.f37155v0);
                } else if (index == 17) {
                    this.f37156w0 = typedArrayObtainStyledAttributes.getFloat(index, this.f37156w0);
                } else if (index == 18) {
                    this.f37157x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f37157x0);
                } else if (index == 19) {
                    this.f37158y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f37158y0);
                } else if (index == 27) {
                    this.f37159z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f37159z0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
