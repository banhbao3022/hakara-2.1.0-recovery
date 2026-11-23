package p007c.p190n.p194b.p334e.p343e0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p007c.p190n.p194b.p334e.p365y.RelativeCornerSize;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearanceModel;
import p636z0.p697i.p703c.ConstraintSet;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: c.n.b.e.e0.a, reason: use source file name */
/* JADX INFO: compiled from: RadialViewGroup.java */
/* JADX INFO: loaded from: classes.dex */
public class RadialViewGroup extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public MaterialShapeDrawable f24972A;

    /* JADX INFO: renamed from: y */
    public final Runnable f24973y;

    /* JADX INFO: renamed from: z */
    public int f24974z;

    /* JADX INFO: renamed from: c.n.b.e.e0.a$a */
    /* JADX INFO: compiled from: RadialViewGroup.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RadialViewGroup.this.m11107k();
        }
    }

    public RadialViewGroup(Context context) {
        this(context, null);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f24973y);
            handler.post(this.f24973y);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m11107k() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.m15851b(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i4 = this.f24974z;
                if (!constraintSet.f37049e.containsKey(Integer.valueOf(id))) {
                    constraintSet.f37049e.put(Integer.valueOf(id), new ConstraintSet.a());
                }
                ConstraintSet.b bVar = constraintSet.f37049e.get(Integer.valueOf(id)).f37053d;
                bVar.f37117y = R.id.circle_center;
                bVar.f37118z = i4;
                bVar.f37057A = f;
                f = (360.0f / (childCount - i)) + f;
            }
        }
        constraintSet.m15850a(this, true);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11107k();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f24973y);
            handler.post(this.f24973y);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f24972A.m11381q(ColorStateList.valueOf(i));
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f24972A = materialShapeDrawable;
        RelativeCornerSize relativeCornerSize = new RelativeCornerSize(0.5f);
        ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawable.f25574h.f25594a;
        Objects.requireNonNull(shapeAppearanceModel);
        ShapeAppearanceModel.b bVar = new ShapeAppearanceModel.b(shapeAppearanceModel);
        bVar.f25635e = relativeCornerSize;
        bVar.f25636f = relativeCornerSize;
        bVar.f25637g = relativeCornerSize;
        bVar.f25638h = relativeCornerSize;
        materialShapeDrawable.f25574h.f25594a = bVar.m11398a();
        materialShapeDrawable.invalidateSelf();
        this.f24972A.m11381q(ColorStateList.valueOf(-1));
        MaterialShapeDrawable materialShapeDrawable2 = this.f24972A;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        setBackground(materialShapeDrawable2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4801b.f24736H, i, 0);
        this.f24974z = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f24973y = new a();
        typedArrayObtainStyledAttributes.recycle();
    }
}
