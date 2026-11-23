package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.p337c.MotionSpec;
import p007c.p190n.p194b.p334e.p337c.Positioning;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: i */
    public Map<View, Integer> f29263i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* JADX INFO: renamed from: C */
    public boolean mo12896C(View view, View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f29263i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0101f) && (((CoordinatorLayout.C0101f) childAt.getLayoutParams()).f643a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (z) {
                        this.f29263i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        AtomicInteger atomicInteger = ViewCompat.f38073a;
                        childAt.setImportantForAccessibility(4);
                    } else {
                        Map<View, Integer> map = this.f29263i;
                        if (map != null && map.containsKey(childAt)) {
                            int iIntValue = this.f29263i.get(childAt).intValue();
                            AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                            childAt.setImportantForAccessibility(iIntValue);
                        }
                    }
                }
            }
            if (!z) {
                this.f29263i = null;
            }
        }
        super.mo12896C(view, view2, z, z2);
        return true;
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* JADX INFO: renamed from: N */
    public FabTransformationBehavior.C5993b mo12907N(Context context, boolean z) {
        int i = z ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.C5993b c5993b = new FabTransformationBehavior.C5993b();
        c5993b.f29257a = MotionSpec.m11035b(context, i);
        c5993b.f29258b = new Positioning(17, 0.0f, 0.0f);
        return c5993b;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
