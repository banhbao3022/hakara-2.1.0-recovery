package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p007c.p190n.p194b.p334e.p365y.AbsoluteCornerSize;
import p007c.p190n.p194b.p334e.p365y.CornerSize;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearanceModel;
import p636z0.p725k.p739l.AccessibilityDelegateCompat;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: f */
    public static final String f28892f = MaterialButtonToggleGroup.class.getSimpleName();

    /* JADX INFO: renamed from: g */
    public final List<C5935d> f28893g;

    /* JADX INFO: renamed from: h */
    public final C5934c f28894h;

    /* JADX INFO: renamed from: i */
    public final C5937f f28895i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet<InterfaceC5936e> f28896j;

    /* JADX INFO: renamed from: k */
    public final Comparator<MaterialButton> f28897k;

    /* JADX INFO: renamed from: l */
    public Integer[] f28898l;

    /* JADX INFO: renamed from: m */
    public boolean f28899m;

    /* JADX INFO: renamed from: n */
    public boolean f28900n;

    /* JADX INFO: renamed from: o */
    public boolean f28901o;

    /* JADX INFO: renamed from: p */
    public int f28902p;

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    public class C5932a implements Comparator<MaterialButton> {
        public C5932a() {
        }

        @Override // java.util.Comparator
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int iCompareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton3)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton4)));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    public class C5933b extends AccessibilityDelegateCompat {
        public C5933b() {
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: d */
        public void mo382d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f37977b.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f38018b);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            String str = MaterialButtonToggleGroup.f28892f;
            Objects.requireNonNull(materialButtonToggleGroup);
            int i = -1;
            if (view instanceof MaterialButton) {
                int i2 = 0;
                for (int i3 = 0; i3 < materialButtonToggleGroup.getChildCount(); i3++) {
                    if (materialButtonToggleGroup.getChildAt(i3) == view) {
                        i = i2;
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.m12763d(i3)) {
                        i2++;
                    }
                }
            }
            accessibilityNodeInfoCompat.m16273q(AccessibilityNodeInfoCompat.c.m16278a(0, 1, i, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    public class C5934c implements MaterialButton.InterfaceC5929a {
        public C5934c(C5932a c5932a) {
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC5929a
        /* JADX INFO: renamed from: a */
        public void mo12759a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            if (materialButtonToggleGroup.f28899m) {
                return;
            }
            if (materialButtonToggleGroup.f28900n) {
                materialButtonToggleGroup.f28902p = z ? materialButton.getId() : -1;
            }
            if (MaterialButtonToggleGroup.this.m12765f(materialButton.getId(), z)) {
                MaterialButtonToggleGroup.this.m12761b(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    public static class C5935d {

        /* JADX INFO: renamed from: a */
        public static final CornerSize f28906a = new AbsoluteCornerSize(0.0f);

        /* JADX INFO: renamed from: b */
        public CornerSize f28907b;

        /* JADX INFO: renamed from: c */
        public CornerSize f28908c;

        /* JADX INFO: renamed from: d */
        public CornerSize f28909d;

        /* JADX INFO: renamed from: e */
        public CornerSize f28910e;

        public C5935d(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
            this.f28907b = cornerSize;
            this.f28908c = cornerSize3;
            this.f28909d = cornerSize4;
            this.f28910e = cornerSize2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    public interface InterfaceC5936e {
        /* JADX INFO: renamed from: a */
        void mo12767a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$f */
    public class C5937f implements MaterialButton.InterfaceC5930b {
        public C5937f(C5932a c5932a) {
        }
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m12763d(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m12763d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m12763d(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setCheckedId(int i) {
        this.f28902p = i;
        m12761b(i, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.f28879k.add(this.f28894h);
        materialButton.setOnPressedChangeListenerInternal(this.f28895i);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m12760a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButtonM12762c = m12762c(i);
            int iMin = Math.min(materialButtonM12762c.getStrokeWidth(), m12762c(i - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButtonM12762c.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButtonM12762c.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f28892f, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            m12765f(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        ShapeAppearanceModel shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f28893g.add(new C5935d(shapeAppearanceModel.f25623f, shapeAppearanceModel.f25626i, shapeAppearanceModel.f25624g, shapeAppearanceModel.f25625h));
        ViewCompat.m16327u(materialButton, new C5933b());
    }

    /* JADX INFO: renamed from: b */
    public final void m12761b(int i, boolean z) {
        Iterator<InterfaceC5936e> it = this.f28896j.iterator();
        while (it.hasNext()) {
            it.next().mo12767a(this, i, z);
        }
    }

    /* JADX INFO: renamed from: c */
    public final MaterialButton m12762c(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12763d(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f28897k);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m12762c(i), Integer.valueOf(i));
        }
        this.f28898l = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m12764e(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof MaterialButton) {
            this.f28899m = true;
            ((MaterialButton) viewFindViewById).setChecked(z);
            this.f28899m = false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m12765f(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.f28901o && checkedButtonIds.isEmpty()) {
            m12764e(i, true);
            this.f28902p = i;
            return false;
        }
        if (z && this.f28900n) {
            checkedButtonIds.remove(Integer.valueOf(i));
            Iterator<Integer> it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                m12764e(iIntValue, false);
                m12761b(iIntValue, false);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m12766g() {
        C5935d c5935d;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButtonM12762c = m12762c(i);
            if (materialButtonM12762c.getVisibility() != 8) {
                ShapeAppearanceModel shapeAppearanceModel = materialButtonM12762c.getShapeAppearanceModel();
                Objects.requireNonNull(shapeAppearanceModel);
                ShapeAppearanceModel.b bVar = new ShapeAppearanceModel.b(shapeAppearanceModel);
                C5935d c5935d2 = this.f28893g.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    if (i == firstVisibleChildIndex) {
                        if (z) {
                            CornerSize cornerSize = C5935d.f28906a;
                            if (C4799a.m10975Z(this)) {
                                CornerSize cornerSize2 = C5935d.f28906a;
                                c5935d = new C5935d(cornerSize2, cornerSize2, c5935d2.f28908c, c5935d2.f28909d);
                            } else {
                                CornerSize cornerSize3 = c5935d2.f28907b;
                                CornerSize cornerSize4 = c5935d2.f28910e;
                                CornerSize cornerSize5 = C5935d.f28906a;
                                c5935d = new C5935d(cornerSize3, cornerSize4, cornerSize5, cornerSize5);
                            }
                        } else {
                            CornerSize cornerSize6 = c5935d2.f28907b;
                            CornerSize cornerSize7 = C5935d.f28906a;
                            c5935d = new C5935d(cornerSize6, cornerSize7, c5935d2.f28908c, cornerSize7);
                        }
                    } else if (i != lastVisibleChildIndex) {
                        c5935d2 = null;
                    } else if (z) {
                        CornerSize cornerSize8 = C5935d.f28906a;
                        if (C4799a.m10975Z(this)) {
                            CornerSize cornerSize9 = c5935d2.f28907b;
                            CornerSize cornerSize10 = c5935d2.f28910e;
                            CornerSize cornerSize11 = C5935d.f28906a;
                            c5935d = new C5935d(cornerSize9, cornerSize10, cornerSize11, cornerSize11);
                        } else {
                            CornerSize cornerSize12 = C5935d.f28906a;
                            c5935d = new C5935d(cornerSize12, cornerSize12, c5935d2.f28908c, c5935d2.f28909d);
                        }
                    } else {
                        CornerSize cornerSize13 = C5935d.f28906a;
                        c5935d = new C5935d(cornerSize13, c5935d2.f28910e, cornerSize13, c5935d2.f28909d);
                    }
                    c5935d2 = c5935d;
                }
                if (c5935d2 == null) {
                    bVar.m11399c(0.0f);
                } else {
                    bVar.f25635e = c5935d2.f28907b;
                    bVar.f25638h = c5935d2.f28910e;
                    bVar.f25636f = c5935d2.f28908c;
                    bVar.f25637g = c5935d2.f28909d;
                }
                materialButtonM12762c.setShapeAppearanceModel(bVar.m11398a());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f28900n) {
            return this.f28902p;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButtonM12762c = m12762c(i);
            if (materialButtonM12762c.isChecked()) {
                arrayList.add(Integer.valueOf(materialButtonM12762c.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f28898l;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(f28892f, "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f28902p;
        if (i != -1) {
            m12764e(i, true);
            m12765f(i, true);
            setCheckedId(i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) AccessibilityNodeInfoCompat.b.m16277a(1, getVisibleButtonCount(), false, this.f28900n ? 1 : 2).f38033a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        m12766g();
        m12760a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.f28879k.remove(this.f28894h);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f28893g.remove(iIndexOfChild);
        }
        m12766g();
        m12760a();
    }

    public void setSelectionRequired(boolean z) {
        this.f28901o = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f28900n != z) {
            this.f28900n = z;
            this.f28899m = true;
            for (int i = 0; i < getChildCount(); i++) {
                MaterialButton materialButtonM12762c = m12762c(i);
                materialButtonM12762c.setChecked(false);
                m12761b(materialButtonM12762c.getId(), false);
            }
            this.f28899m = false;
            setCheckedId(-1);
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.m11090a(context, attributeSet, i, 2132017908), attributeSet, i);
        this.f28893g = new ArrayList();
        this.f28894h = new C5934c(null);
        this.f28895i = new C5937f(null);
        this.f28896j = new LinkedHashSet<>();
        this.f28897k = new C5932a();
        this.f28899m = false;
        TypedArray typedArrayM11347d = ThemeEnforcement.m11347d(getContext(), attributeSet, C4801b.f24769x, i, 2132017908, new int[0]);
        setSingleSelection(typedArrayM11347d.getBoolean(2, false));
        this.f28902p = typedArrayM11347d.getResourceId(0, -1);
        this.f28901o = typedArrayM11347d.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayM11347d.recycle();
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
