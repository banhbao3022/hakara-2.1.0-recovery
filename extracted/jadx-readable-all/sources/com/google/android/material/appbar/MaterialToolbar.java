package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p007c.p190n.p194b.p334e.p357q.ElevationOverlayProvider;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: U */
    public Integer f28761U;

    public MaterialToolbar(Context context) {
        this(context, null);
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
    public void setElevation(float f) {
        super.setElevation(f);
        C4799a.m11003n0(this, f);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f28761U != null) {
            drawable = C8162a.m16054Y(drawable);
            drawable.setTint(this.f28761U.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f28761U = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.m11090a(context, attributeSet, i, 2132017965), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayM11347d = ThemeEnforcement.m11347d(context2, attributeSet, C4801b.f24735G, i, 2132017965, new int[0]);
        if (typedArrayM11347d.hasValue(0)) {
            setNavigationIconTint(typedArrayM11347d.getColor(0, -1));
        }
        typedArrayM11347d.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.m11381q(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            materialShapeDrawable.f25574h.f25595b = new ElevationOverlayProvider(context2);
            materialShapeDrawable.m11365A();
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            materialShapeDrawable.m11380p(getElevation());
            setBackground(materialShapeDrawable);
        }
    }
}
