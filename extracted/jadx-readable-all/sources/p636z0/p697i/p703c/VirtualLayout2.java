package p636z0.p697i.p703c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: z0.i.c.j, reason: use source file name */
/* JADX INFO: compiled from: VirtualLayout.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class VirtualLayout2 extends ConstraintHelper {

    /* JADX INFO: renamed from: m */
    public boolean f37174m;

    /* JADX INFO: renamed from: n */
    public boolean f37175n;

    public VirtualLayout2(Context context) {
        super(context);
    }

    @Override // p636z0.p697i.p703c.ConstraintHelper
    /* JADX INFO: renamed from: f */
    public void mo273f(AttributeSet attributeSet) {
        super.mo273f(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8022i.f37164b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f37174m = true;
                } else if (index == 13) {
                    this.f37175n = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p636z0.p697i.p703c.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f37174m || this.f37175n) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f37027g; i++) {
                View viewM277d = constraintLayout.m277d(this.f37026f[i]);
                if (viewM277d != null) {
                    if (this.f37174m) {
                        viewM277d.setVisibility(visibility);
                    }
                    if (this.f37175n && elevation > 0.0f) {
                        viewM277d.setTranslationZ(viewM277d.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m15843d();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m15843d();
    }

    public VirtualLayout2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLayout2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
