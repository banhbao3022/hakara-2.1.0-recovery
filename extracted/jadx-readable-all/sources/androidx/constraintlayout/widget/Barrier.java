package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p636z0.p697i.p700b.p701h.Barrier2;
import p636z0.p697i.p700b.p701h.ConstraintWidget;
import p636z0.p697i.p703c.C8022i;
import p636z0.p697i.p703c.ConstraintHelper;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* JADX INFO: renamed from: m */
    public int f520m;

    /* JADX INFO: renamed from: n */
    public int f521n;

    /* JADX INFO: renamed from: o */
    public Barrier2 f522o;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // p636z0.p697i.p703c.ConstraintHelper
    /* JADX INFO: renamed from: f */
    public void mo273f(AttributeSet attributeSet) {
        super.mo273f(attributeSet);
        this.f522o = new Barrier2();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8022i.f37164b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 14) {
                    this.f522o.f36786p0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 16) {
                    this.f522o.f36787q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f37029i = this.f522o;
        m15848k();
    }

    @Override // p636z0.p697i.p703c.ConstraintHelper
    /* JADX INFO: renamed from: g */
    public void mo274g(ConstraintWidget constraintWidget, boolean z) {
        int i = this.f520m;
        this.f521n = i;
        if (z) {
            if (i == 5) {
                this.f521n = 1;
            } else if (i == 6) {
                this.f521n = 0;
            }
        } else if (i == 5) {
            this.f521n = 0;
        } else if (i == 6) {
            this.f521n = 1;
        }
        if (constraintWidget instanceof Barrier2) {
            ((Barrier2) constraintWidget).f36785o0 = this.f521n;
        }
    }

    public int getMargin() {
        return this.f522o.f36787q0;
    }

    public int getType() {
        return this.f520m;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f522o.f36786p0 = z;
    }

    public void setDpMargin(int i) {
        this.f522o.f36787q0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f522o.f36787q0 = i;
    }

    public void setType(int i) {
        this.f520m = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
