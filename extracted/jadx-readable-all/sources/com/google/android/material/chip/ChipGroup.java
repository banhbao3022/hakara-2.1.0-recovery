package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p007c.p190n.p194b.p334e.p360t.FlowLayout;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: classes.dex */
public class ChipGroup extends FlowLayout {

    /* JADX INFO: renamed from: j */
    public int f28933j;

    /* JADX INFO: renamed from: k */
    public int f28934k;

    /* JADX INFO: renamed from: l */
    public boolean f28935l;

    /* JADX INFO: renamed from: m */
    public boolean f28936m;

    /* JADX INFO: renamed from: n */
    public InterfaceC5943d f28937n;

    /* JADX INFO: renamed from: o */
    public final C5941b f28938o;

    /* JADX INFO: renamed from: p */
    public ViewGroupOnHierarchyChangeListenerC5944e f28939p;

    /* JADX INFO: renamed from: q */
    public int f28940q;

    /* JADX INFO: renamed from: r */
    public boolean f28941r;

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$b */
    public class C5941b implements CompoundButton.OnCheckedChangeListener {
        public C5941b(C5940a c5940a) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ChipGroup chipGroup = ChipGroup.this;
            if (chipGroup.f28941r) {
                return;
            }
            if (chipGroup.getCheckedChipIds().isEmpty()) {
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.f28936m) {
                    chipGroup2.m12786e(compoundButton.getId(), true);
                    ChipGroup chipGroup3 = ChipGroup.this;
                    chipGroup3.f28940q = compoundButton.getId();
                    InterfaceC5943d interfaceC5943d = chipGroup3.f28937n;
                    return;
                }
            }
            int id = compoundButton.getId();
            if (!z) {
                ChipGroup chipGroup4 = ChipGroup.this;
                if (chipGroup4.f28940q == id) {
                    chipGroup4.setCheckedId(-1);
                    return;
                }
                return;
            }
            ChipGroup chipGroup5 = ChipGroup.this;
            int i = chipGroup5.f28940q;
            if (i != -1 && i != id && chipGroup5.f28935l) {
                chipGroup5.m12786e(i, false);
            }
            ChipGroup.this.setCheckedId(id);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C5942c extends ViewGroup.MarginLayoutParams {
        public C5942c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C5942c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C5942c(int i, int i2) {
            super(i, i2);
        }

        public C5942c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface InterfaceC5943d {
        /* JADX INFO: renamed from: a */
        void m12787a(ChipGroup chipGroup, int i);
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$e */
    public class ViewGroupOnHierarchyChangeListenerC5944e implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: f */
        public ViewGroup.OnHierarchyChangeListener f28943f;

        public ViewGroupOnHierarchyChangeListenerC5944e(C5940a c5940a) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    AtomicInteger atomicInteger = ViewCompat.f38073a;
                    view2.setId(View.generateViewId());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).m12785d(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.f28938o);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f28943f;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f28943f;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f28940q = i;
        InterfaceC5943d interfaceC5943d = this.f28937n;
        if (interfaceC5943d == null || !this.f28935l) {
            return;
        }
        interfaceC5943d.m12787a(this, i);
    }

    @Override // p007c.p190n.p194b.p334e.p360t.FlowLayout
    /* JADX INFO: renamed from: a */
    public boolean mo11332a() {
        return this.f25471h;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f28940q;
                if (i2 != -1 && this.f28935l) {
                    m12786e(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C5942c);
    }

    /* JADX INFO: renamed from: d */
    public void m12785d(int i) {
        int i2 = this.f28940q;
        if (i == i2) {
            return;
        }
        if (i2 != -1 && this.f28935l) {
            m12786e(i2, false);
        }
        if (i != -1) {
            m12786e(i, true);
        }
        setCheckedId(i);
    }

    /* JADX INFO: renamed from: e */
    public final void m12786e(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof Chip) {
            this.f28941r = true;
            ((Chip) viewFindViewById).setChecked(z);
            this.f28941r = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C5942c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C5942c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f28935l) {
            return this.f28940q;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f28935l) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f28933j;
    }

    public int getChipSpacingVertical() {
        return this.f28934k;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f28940q;
        if (i != -1) {
            m12786e(i, true);
            setCheckedId(this.f28940q);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) AccessibilityNodeInfoCompat.b.m16277a(getRowCount(), this.f25471h ? getChipCount() : -1, false, this.f28935l ? 1 : 2).f38033a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f28933j != i) {
            this.f28933j = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f28934k != i) {
            this.f28934k = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(InterfaceC5943d interfaceC5943d) {
        this.f28937n = interfaceC5943d;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f28939p.f28943f = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f28936m = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // p007c.p190n.p194b.p334e.p360t.FlowLayout
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.f28935l != z) {
            this.f28935l = z;
            this.f28941r = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f28941r = false;
            setCheckedId(-1);
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C5942c(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.m11090a(context, attributeSet, i, 2132017894), attributeSet, i);
        this.f28938o = new C5941b(null);
        this.f28939p = new ViewGroupOnHierarchyChangeListenerC5944e(null);
        this.f28940q = -1;
        this.f28941r = false;
        TypedArray typedArrayM11347d = ThemeEnforcement.m11347d(getContext(), attributeSet, C4801b.f24754i, i, 2132017894, new int[0]);
        int dimensionPixelOffset = typedArrayM11347d.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayM11347d.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayM11347d.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayM11347d.getBoolean(5, false));
        setSingleSelection(typedArrayM11347d.getBoolean(6, false));
        setSelectionRequired(typedArrayM11347d.getBoolean(4, false));
        int resourceId = typedArrayM11347d.getResourceId(0, -1);
        if (resourceId != -1) {
            this.f28940q = resourceId;
        }
        typedArrayM11347d.recycle();
        super.setOnHierarchyChangeListener(this.f28939p);
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
