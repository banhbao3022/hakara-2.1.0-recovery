package p007c.p190n.p194b.p334e.p347h;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p334e.p342e.BadgeDrawable;
import p007c.p190n.p194b.p334e.p342e.BadgeUtils;
import p007c.p190n.p194b.p334e.p360t.TextScale;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p644b.p651g.p652i.MenuItemImpl;
import p636z0.p644b.p651g.p652i.MenuView;
import p636z0.p685e0.AutoTransition;
import p636z0.p685e0.TransitionSet;
import p636z0.p725k.p738k.Pools2;
import p636z0.p725k.p738k.Pools4;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;
import p636z0.p754q.p755a.p756a.FastOutSlowInInterpolator;

/* JADX INFO: renamed from: c.n.b.e.h.c, reason: use source file name */
/* JADX INFO: compiled from: BottomNavigationMenuView.java */
/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationMenuView extends ViewGroup implements MenuView {

    /* JADX INFO: renamed from: f */
    public static final int[] f25020f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g */
    public static final int[] f25021g = {-16842910};

    /* JADX INFO: renamed from: A */
    public int f25022A;

    /* JADX INFO: renamed from: B */
    public Drawable f25023B;

    /* JADX INFO: renamed from: C */
    public int f25024C;

    /* JADX INFO: renamed from: D */
    public int[] f25025D;

    /* JADX INFO: renamed from: E */
    public SparseArray<BadgeDrawable> f25026E;

    /* JADX INFO: renamed from: F */
    public BottomNavigationPresenter f25027F;

    /* JADX INFO: renamed from: G */
    public MenuBuilder f25028G;

    /* JADX INFO: renamed from: h */
    public final TransitionSet f25029h;

    /* JADX INFO: renamed from: i */
    public final int f25030i;

    /* JADX INFO: renamed from: j */
    public final int f25031j;

    /* JADX INFO: renamed from: k */
    public final int f25032k;

    /* JADX INFO: renamed from: l */
    public final int f25033l;

    /* JADX INFO: renamed from: m */
    public final int f25034m;

    /* JADX INFO: renamed from: n */
    public final View.OnClickListener f25035n;

    /* JADX INFO: renamed from: o */
    public final Pools2<BottomNavigationItemView> f25036o;

    /* JADX INFO: renamed from: p */
    public final SparseArray<View.OnTouchListener> f25037p;

    /* JADX INFO: renamed from: q */
    public boolean f25038q;

    /* JADX INFO: renamed from: r */
    public int f25039r;

    /* JADX INFO: renamed from: s */
    public BottomNavigationItemView[] f25040s;

    /* JADX INFO: renamed from: t */
    public int f25041t;

    /* JADX INFO: renamed from: u */
    public int f25042u;

    /* JADX INFO: renamed from: v */
    public ColorStateList f25043v;

    /* JADX INFO: renamed from: w */
    public int f25044w;

    /* JADX INFO: renamed from: x */
    public ColorStateList f25045x;

    /* JADX INFO: renamed from: y */
    public final ColorStateList f25046y;

    /* JADX INFO: renamed from: z */
    public int f25047z;

    /* JADX INFO: renamed from: c.n.b.e.h.c$a */
    /* JADX INFO: compiled from: BottomNavigationMenuView.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MenuItemImpl itemData = ((BottomNavigationItemView) view).getItemData();
            BottomNavigationMenuView bottomNavigationMenuView = BottomNavigationMenuView.this;
            if (bottomNavigationMenuView.f25028G.m14785s(itemData, bottomNavigationMenuView.f25027F, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public BottomNavigationMenuView(Context context) {
        this(context, null);
    }

    private BottomNavigationItemView getNewItem() {
        BottomNavigationItemView bottomNavigationItemViewMo2057a = this.f25036o.mo2057a();
        return bottomNavigationItemViewMo2057a == null ? new BottomNavigationItemView(getContext()) : bottomNavigationItemViewMo2057a;
    }

    private void setBadgeIfNeeded(BottomNavigationItemView bottomNavigationItemView) {
        BadgeDrawable badgeDrawable;
        int id = bottomNavigationItemView.getId();
        if ((id != -1) && (badgeDrawable = this.f25026E.get(id)) != null) {
            bottomNavigationItemView.setBadge(badgeDrawable);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: a */
    public void m11118a() {
        removeAllViews();
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f25040s;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                if (bottomNavigationItemView != null) {
                    this.f25036o.mo2058b(bottomNavigationItemView);
                    ImageView imageView = bottomNavigationItemView.f25009m;
                    if (bottomNavigationItemView.m11116b()) {
                        if (imageView != null) {
                            bottomNavigationItemView.setClipChildren(true);
                            bottomNavigationItemView.setClipToPadding(true);
                            BadgeUtils.m11105b(bottomNavigationItemView.f25018v, imageView);
                        }
                        bottomNavigationItemView.f25018v = null;
                    }
                }
            }
        }
        if (this.f25028G.size() == 0) {
            this.f25041t = 0;
            this.f25042u = 0;
            this.f25040s = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f25028G.size(); i++) {
            hashSet.add(Integer.valueOf(this.f25028G.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f25026E.size(); i2++) {
            int iKeyAt = this.f25026E.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.f25026E.delete(iKeyAt);
            }
        }
        this.f25040s = new BottomNavigationItemView[this.f25028G.size()];
        boolean zM11120d = m11120d(this.f25039r, this.f25028G.m14778l().size());
        for (int i3 = 0; i3 < this.f25028G.size(); i3++) {
            this.f25027F.f25051h = true;
            this.f25028G.getItem(i3).setCheckable(true);
            this.f25027F.f25051h = false;
            BottomNavigationItemView newItem = getNewItem();
            this.f25040s[i3] = newItem;
            newItem.setIconTintList(this.f25043v);
            newItem.setIconSize(this.f25044w);
            newItem.setTextColor(this.f25046y);
            newItem.setTextAppearanceInactive(this.f25047z);
            newItem.setTextAppearanceActive(this.f25022A);
            newItem.setTextColor(this.f25045x);
            Drawable drawable = this.f25023B;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f25024C);
            }
            newItem.setShifting(zM11120d);
            newItem.setLabelVisibilityMode(this.f25039r);
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.f25028G.getItem(i3);
            newItem.mo144d(menuItemImpl, 0);
            newItem.setItemPosition(i3);
            int i4 = menuItemImpl.f34850a;
            newItem.setOnTouchListener(this.f25037p.get(i4));
            newItem.setOnClickListener(this.f25035n);
            int i5 = this.f25041t;
            if (i5 != 0 && i4 == i5) {
                this.f25042u = i3;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.f25028G.size() - 1, this.f25042u);
        this.f25042u = iMin;
        this.f25028G.getItem(iMin).setChecked(true);
    }

    @Override // p636z0.p644b.p651g.p652i.MenuView
    /* JADX INFO: renamed from: b */
    public void mo151b(MenuBuilder menuBuilder) {
        this.f25028G = menuBuilder;
    }

    /* JADX INFO: renamed from: c */
    public ColorStateList m11119c(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM14706a = AppCompatResources.m14706a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(mtp.media.karaoke.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListM14706a.getDefaultColor();
        int[] iArr = f25021g;
        return new ColorStateList(new int[][]{iArr, f25020f, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListM14706a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11120d(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f25026E;
    }

    public ColorStateList getIconTintList() {
        return this.f25043v;
    }

    public Drawable getItemBackground() {
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f25040s;
        return (bottomNavigationItemViewArr == null || bottomNavigationItemViewArr.length <= 0) ? this.f25023B : bottomNavigationItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f25024C;
    }

    public int getItemIconSize() {
        return this.f25044w;
    }

    public int getItemTextAppearanceActive() {
        return this.f25022A;
    }

    public int getItemTextAppearanceInactive() {
        return this.f25047z;
    }

    public ColorStateList getItemTextColor() {
        return this.f25045x;
    }

    public int getLabelVisibilityMode() {
        return this.f25039r;
    }

    public int getSelectedItemId() {
        return this.f25041t;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) AccessibilityNodeInfoCompat.b.m16277a(1, this.f25028G.m14778l().size(), false, 1).f38033a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                if (getLayoutDirection() == 1) {
                    int i8 = i5 - measuredWidth;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i6);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i6);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f25028G.m14778l().size();
        int childCount = getChildCount();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f25034m, 1073741824);
        if (m11120d(this.f25039r, size2) && this.f25038q) {
            View childAt = getChildAt(this.f25042u);
            int iMax = this.f25033l;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f25032k, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i3 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = Math.min(size - (this.f25031j * i3), Math.min(iMax, this.f25032k));
            int i4 = size - iMin;
            int iMin2 = Math.min(i4 / (i3 == 0 ? 1 : i3), this.f25030i);
            int i5 = i4 - (i3 * iMin2);
            int i6 = 0;
            while (i6 < childCount) {
                if (getChildAt(i6).getVisibility() != 8) {
                    int[] iArr = this.f25025D;
                    iArr[i6] = i6 == this.f25042u ? iMin : iMin2;
                    if (i5 > 0) {
                        iArr[i6] = iArr[i6] + 1;
                        i5--;
                    }
                } else {
                    this.f25025D[i6] = 0;
                }
                i6++;
            }
        } else {
            int iMin3 = Math.min(size / (size2 == 0 ? 1 : size2), this.f25032k);
            int i7 = size - (size2 * iMin3);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getVisibility() != 8) {
                    int[] iArr2 = this.f25025D;
                    iArr2[i8] = iMin3;
                    if (i7 > 0) {
                        iArr2[i8] = iArr2[i8] + 1;
                        i7--;
                    }
                } else {
                    this.f25025D[i8] = 0;
                }
            }
        }
        int measuredWidth = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f25025D[i9], 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(measuredWidth, View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), 0), View.resolveSizeAndState(this.f25034m, iMakeMeasureSpec, 0));
    }

    public void setBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        this.f25026E = sparseArray;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f25040s;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setBadge(sparseArray.get(bottomNavigationItemView.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f25043v = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f25040s;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f25023B = drawable;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f25040s;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f25024C = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f25040s;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setItemBackground(i);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f25038q = z;
    }

    public void setItemIconSize(int i) {
        this.f25044w = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f25040s;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f25022A = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f25040s;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f25045x;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f25047z = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f25040s;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f25045x;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f25045x = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f25040s;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f25039r = i;
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.f25027F = bottomNavigationPresenter;
    }

    public BottomNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25036o = new Pools4(5);
        this.f25037p = new SparseArray<>(5);
        this.f25041t = 0;
        this.f25042u = 0;
        this.f25026E = new SparseArray<>(5);
        Resources resources = getResources();
        this.f25030i = resources.getDimensionPixelSize(mtp.media.karaoke.R.dimen.design_bottom_navigation_item_max_width);
        this.f25031j = resources.getDimensionPixelSize(mtp.media.karaoke.R.dimen.design_bottom_navigation_item_min_width);
        this.f25032k = resources.getDimensionPixelSize(mtp.media.karaoke.R.dimen.design_bottom_navigation_active_item_max_width);
        this.f25033l = resources.getDimensionPixelSize(mtp.media.karaoke.R.dimen.design_bottom_navigation_active_item_min_width);
        this.f25034m = resources.getDimensionPixelSize(mtp.media.karaoke.R.dimen.design_bottom_navigation_height);
        this.f25046y = m11119c(R.attr.textColorSecondary);
        AutoTransition autoTransition = new AutoTransition();
        this.f25029h = autoTransition;
        autoTransition.m15528S(0);
        autoTransition.m15526Q(115L);
        autoTransition.m15527R(new FastOutSlowInInterpolator());
        autoTransition.m15524O(new TextScale());
        this.f25035n = new a();
        this.f25025D = new int[5];
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        setImportantForAccessibility(1);
    }
}
