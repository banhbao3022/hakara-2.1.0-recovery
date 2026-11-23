package p636z0.p697i.p703c;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p697i.p700b.p701h.ConstraintWidget;
import p636z0.p697i.p700b.p701h.Helper;

/* JADX INFO: renamed from: z0.i.c.b, reason: use source file name */
/* JADX INFO: compiled from: ConstraintHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* JADX INFO: renamed from: f */
    public int[] f37026f;

    /* JADX INFO: renamed from: g */
    public int f37027g;

    /* JADX INFO: renamed from: h */
    public Context f37028h;

    /* JADX INFO: renamed from: i */
    public Helper f37029i;

    /* JADX INFO: renamed from: j */
    public String f37030j;

    /* JADX INFO: renamed from: k */
    public String f37031k;

    /* JADX INFO: renamed from: l */
    public HashMap<Integer, String> f37032l;

    public ConstraintHelper(Context context) {
        super(context);
        this.f37026f = new int[32];
        this.f37032l = new HashMap<>();
        this.f37028h = context;
        mo273f(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m15840a(String str) {
        if (str == null || str.length() == 0 || this.f37028h == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int identifier = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objM276c = constraintLayout.m276c(0, strTrim);
            if (objM276c instanceof Integer) {
                identifier = ((Integer) objM276c).intValue();
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = m15844e(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = C8021h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = this.f37028h.getResources().getIdentifier(strTrim, "id", this.f37028h.getPackageName());
        }
        if (identifier != 0) {
            this.f37032l.put(Integer.valueOf(identifier), strTrim);
            m15841b(identifier);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    /* JADX INFO: renamed from: b */
    public final void m15841b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f37027g + 1;
        int[] iArr = this.f37026f;
        if (i2 > iArr.length) {
            this.f37026f = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f37026f;
        int i3 = this.f37027g;
        iArr2[i3] = i;
        this.f37027g = i3 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m15842c(String str) {
        if (str == null || str.length() == 0 || this.f37028h == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.C0094a) && strTrim.equals(((ConstraintLayout.C0094a) layoutParams).f563V)) {
                if (childAt.getId() == -1) {
                    StringBuilder sbM1556G = outline.m1556G("to use ConstraintTag view ");
                    sbM1556G.append(childAt.getClass().getSimpleName());
                    sbM1556G.append(" must have an ID");
                    Log.w("ConstraintHelper", sbM1556G.toString());
                } else {
                    m15841b(childAt.getId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m15843d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f37027g; i++) {
            View viewM277d = constraintLayout.m277d(this.f37026f[i]);
            if (viewM277d != null) {
                viewM277d.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewM277d.setTranslationZ(viewM277d.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m15844e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || (resources = this.f37028h.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String resourceEntryName = null;
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public void mo273f(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8022i.f37164b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f37030j = string;
                    setIds(string);
                } else if (index == 20) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f37031k = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo274g(ConstraintWidget constraintWidget, boolean z) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f37026f, this.f37027g);
    }

    /* JADX INFO: renamed from: h */
    public void m15845h() {
    }

    /* JADX INFO: renamed from: i */
    public void m15846i() {
    }

    /* JADX INFO: renamed from: j */
    public void m15847j() {
    }

    /* JADX INFO: renamed from: k */
    public void m15848k() {
        if (this.f37029i == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0094a) {
            ((ConstraintLayout.C0094a) layoutParams).f593m0 = (ConstraintWidget) this.f37029i;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f37030j;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f37031k;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f37030j = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f37027g = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m15840a(str.substring(i));
                return;
            } else {
                m15840a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f37031k = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f37027g = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m15842c(str.substring(i));
                return;
            } else {
                m15842c(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f37030j = null;
        this.f37027g = 0;
        for (int i : iArr) {
            m15841b(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f37030j == null) {
            m15841b(i);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37026f = new int[32];
        this.f37032l = new HashMap<>();
        this.f37028h = context;
        mo273f(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37026f = new int[32];
        this.f37032l = new HashMap<>();
        this.f37028h = context;
        mo273f(attributeSet);
    }
}
