package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p007c.p190n.p194b.p334e.p347h.BottomNavigationMenu;
import p007c.p190n.p194b.p334e.p347h.BottomNavigationMenuView;
import p007c.p190n.p194b.p334e.p347h.BottomNavigationPresenter;
import p007c.p190n.p194b.p334e.p347h.BottomNavigationView2;
import p007c.p190n.p194b.p334e.p357q.ElevationOverlayProvider;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p007c.p190n.p194b.p334e.p363w.RippleUtils;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p636z0.p644b.p651g.SupportMenuInflater;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p644b.p651g.p652i.MenuPresenter;
import p636z0.p644b.p653h.TintTypedArray;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p745m.p746a.AbsSavedState;

/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public final MenuBuilder f28812f;

    /* JADX INFO: renamed from: g */
    public final BottomNavigationMenuView f28813g;

    /* JADX INFO: renamed from: h */
    public final BottomNavigationPresenter f28814h;

    /* JADX INFO: renamed from: i */
    public ColorStateList f28815i;

    /* JADX INFO: renamed from: j */
    public MenuInflater f28816j;

    /* JADX INFO: renamed from: k */
    public InterfaceC5922c f28817k;

    /* JADX INFO: renamed from: l */
    public InterfaceC5921b f28818l;

    /* JADX INFO: renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    public class C5920a implements MenuBuilder.a {
        public C5920a() {
        }

        @Override // p636z0.p644b.p651g.p652i.MenuBuilder.a
        /* JADX INFO: renamed from: a */
        public boolean mo188a(MenuBuilder menuBuilder, MenuItem menuItem) {
            if (BottomNavigationView.this.f28818l == null || menuItem.getItemId() != BottomNavigationView.this.getSelectedItemId()) {
                InterfaceC5922c interfaceC5922c = BottomNavigationView.this.f28817k;
                return (interfaceC5922c == null || interfaceC5922c.mo12730a(menuItem)) ? false : true;
            }
            BottomNavigationView.this.f28818l.m12729a(menuItem);
            return true;
        }

        @Override // p636z0.p644b.p651g.p652i.MenuBuilder.a
        /* JADX INFO: renamed from: b */
        public void mo189b(MenuBuilder menuBuilder) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    public interface InterfaceC5921b {
        /* JADX INFO: renamed from: a */
        void m12729a(MenuItem menuItem);
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$c */
    public interface InterfaceC5922c {
        /* JADX INFO: renamed from: a */
        boolean mo12730a(MenuItem menuItem);
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$d */
    public static class C5923d extends AbsSavedState {
        public static final Parcelable.Creator<C5923d> CREATOR = new a();

        /* JADX INFO: renamed from: h */
        public Bundle f28820h;

        /* JADX INFO: renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$d$a */
        public static class a implements Parcelable.ClassLoaderCreator<C5923d> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C5923d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C5923d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C5923d[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C5923d(parcel, null);
            }
        }

        public C5923d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p636z0.p745m.p746a.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f38150g, i);
            parcel.writeBundle(this.f28820h);
        }

        public C5923d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f28820h = parcel.readBundle(classLoader == null ? C5923d.class.getClassLoader() : classLoader);
        }
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        if (this.f28816j == null) {
            this.f28816j = new SupportMenuInflater(getContext());
        }
        return this.f28816j;
    }

    public Drawable getItemBackground() {
        return this.f28813g.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f28813g.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f28813g.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f28813g.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.f28815i;
    }

    public int getItemTextAppearanceActive() {
        return this.f28813g.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f28813g.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f28813g.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f28813g.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f28812f;
    }

    public int getSelectedItemId() {
        return this.f28813g.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            C4799a.m11005o0(this, (MaterialShapeDrawable) background);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C5923d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5923d c5923d = (C5923d) parcelable;
        super.onRestoreInstanceState(c5923d.f38150g);
        MenuBuilder menuBuilder = this.f28812f;
        Bundle bundle = c5923d.f28820h;
        Objects.requireNonNull(menuBuilder);
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || menuBuilder.f34839v.isEmpty()) {
            return;
        }
        for (WeakReference<MenuPresenter> weakReference : menuBuilder.f34839v) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                menuBuilder.f34839v.remove(weakReference);
            } else {
                int iMo250w = menuPresenter.mo250w();
                if (iMo250w > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(iMo250w)) != null) {
                    menuPresenter.mo246D(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableMo248F;
        C5923d c5923d = new C5923d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        c5923d.f28820h = bundle;
        MenuBuilder menuBuilder = this.f28812f;
        if (!menuBuilder.f34839v.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            for (WeakReference<MenuPresenter> weakReference : menuBuilder.f34839v) {
                MenuPresenter menuPresenter = weakReference.get();
                if (menuPresenter == null) {
                    menuBuilder.f34839v.remove(weakReference);
                } else {
                    int iMo250w = menuPresenter.mo250w();
                    if (iMo250w > 0 && (parcelableMo248F = menuPresenter.mo248F()) != null) {
                        sparseArray.put(iMo250w, parcelableMo248F);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return c5923d;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C4799a.m11003n0(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f28813g.setItemBackground(drawable);
        this.f28815i = null;
    }

    public void setItemBackgroundResource(int i) {
        this.f28813g.setItemBackgroundRes(i);
        this.f28815i = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView = this.f28813g;
        if (bottomNavigationMenuView.f25038q != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            this.f28814h.mo251x(false);
        }
    }

    public void setItemIconSize(int i) {
        this.f28813g.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f28813g.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f28815i == colorStateList) {
            if (colorStateList != null || this.f28813g.getItemBackground() == null) {
                return;
            }
            this.f28813g.setItemBackground(null);
            return;
        }
        this.f28815i = colorStateList;
        if (colorStateList == null) {
            this.f28813g.setItemBackground(null);
        } else {
            this.f28813g.setItemBackground(new RippleDrawable(RippleUtils.m11358a(colorStateList), null, null));
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f28813g.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f28813g.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f28813g.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f28813g.getLabelVisibilityMode() != i) {
            this.f28813g.setLabelVisibilityMode(i);
            this.f28814h.mo251x(false);
        }
    }

    public void setOnNavigationItemReselectedListener(InterfaceC5921b interfaceC5921b) {
        this.f28818l = interfaceC5921b;
    }

    public void setOnNavigationItemSelectedListener(InterfaceC5922c interfaceC5922c) {
        this.f28817k = interfaceC5922c;
    }

    public void setSelectedItemId(int i) {
        MenuItem menuItemFindItem = this.f28812f.findItem(i);
        if (menuItemFindItem == null || this.f28812f.m14785s(menuItemFindItem, this.f28814h, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.m11090a(context, attributeSet, i, 2132017846), attributeSet, i);
        BottomNavigationPresenter bottomNavigationPresenter = new BottomNavigationPresenter();
        this.f28814h = bottomNavigationPresenter;
        Context context2 = getContext();
        BottomNavigationMenu bottomNavigationMenu = new BottomNavigationMenu(context2);
        this.f28812f = bottomNavigationMenu;
        BottomNavigationMenuView bottomNavigationMenuView = new BottomNavigationMenuView(context2);
        this.f28813g = bottomNavigationMenuView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        bottomNavigationMenuView.setLayoutParams(layoutParams);
        bottomNavigationPresenter.f25050g = bottomNavigationMenuView;
        bottomNavigationPresenter.f25052i = 1;
        bottomNavigationMenuView.setPresenter(bottomNavigationPresenter);
        bottomNavigationMenu.m14768b(bottomNavigationPresenter, bottomNavigationMenu.f34819b);
        getContext();
        bottomNavigationPresenter.f25049f = bottomNavigationMenu;
        bottomNavigationPresenter.f25050g.f25028G = bottomNavigationMenu;
        int[] iArr = C4801b.f24750e;
        ThemeEnforcement.m11344a(context2, attributeSet, i, 2132017846);
        ThemeEnforcement.m11345b(context2, attributeSet, iArr, i, 2132017846, 8, 7);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, 2132017846);
        TintTypedArray tintTypedArray = new TintTypedArray(context2, typedArrayObtainStyledAttributes);
        if (tintTypedArray.m15014p(5)) {
            bottomNavigationMenuView.setIconTintList(tintTypedArray.m15001c(5));
        } else {
            bottomNavigationMenuView.setIconTintList(bottomNavigationMenuView.m11119c(android.R.attr.textColorSecondary));
        }
        setItemIconSize(tintTypedArray.m15004f(4, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_icon_size)));
        if (tintTypedArray.m15014p(8)) {
            setItemTextAppearanceInactive(tintTypedArray.m15011m(8, 0));
        }
        if (tintTypedArray.m15014p(7)) {
            setItemTextAppearanceActive(tintTypedArray.m15011m(7, 0));
        }
        if (tintTypedArray.m15014p(9)) {
            setItemTextColor(tintTypedArray.m15001c(9));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                materialShapeDrawable.m11381q(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            materialShapeDrawable.f25574h.f25595b = new ElevationOverlayProvider(context2);
            materialShapeDrawable.m11365A();
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            setBackground(materialShapeDrawable);
        }
        if (tintTypedArray.m15014p(1)) {
            setElevation(tintTypedArray.m15004f(1, 0));
        }
        getBackground().mutate().setTintList(C4799a.m10962M(context2, tintTypedArray, 0));
        setLabelVisibilityMode(tintTypedArray.m15009k(10, -1));
        setItemHorizontalTranslationEnabled(tintTypedArray.m14999a(3, true));
        int iM15011m = tintTypedArray.m15011m(2, 0);
        if (iM15011m != 0) {
            bottomNavigationMenuView.setItemBackgroundRes(iM15011m);
        } else {
            setItemRippleColor(C4799a.m10962M(context2, tintTypedArray, 6));
        }
        if (tintTypedArray.m15014p(11)) {
            int iM15011m2 = tintTypedArray.m15011m(11, 0);
            bottomNavigationPresenter.f25051h = true;
            getMenuInflater().inflate(iM15011m2, bottomNavigationMenu);
            bottomNavigationPresenter.f25051h = false;
            bottomNavigationPresenter.mo251x(true);
        }
        typedArrayObtainStyledAttributes.recycle();
        addView(bottomNavigationMenuView, layoutParams);
        bottomNavigationMenu.f34823f = new C5920a();
        C4799a.m11019y(this, new BottomNavigationView2(this));
    }
}
