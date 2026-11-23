package p636z0.p644b.p653h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p644b.C7463b;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.b.h.e, reason: use source file name */
/* JADX INFO: compiled from: AppCompatBackgroundHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatBackgroundHelper {

    /* JADX INFO: renamed from: a */
    public final View f35007a;

    /* JADX INFO: renamed from: d */
    public TintInfo f35010d;

    /* JADX INFO: renamed from: e */
    public TintInfo f35011e;

    /* JADX INFO: renamed from: f */
    public TintInfo f35012f;

    /* JADX INFO: renamed from: c */
    public int f35009c = -1;

    /* JADX INFO: renamed from: b */
    public final AppCompatDrawableManager f35008b = AppCompatDrawableManager.m14904a();

    public AppCompatBackgroundHelper(View view) {
        this.f35007a = view;
    }

    /* JADX INFO: renamed from: a */
    public void m14876a() {
        Drawable background = this.f35007a.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 ? i == 21 : this.f35010d != null) {
                if (this.f35012f == null) {
                    this.f35012f = new TintInfo();
                }
                TintInfo tintInfo = this.f35012f;
                tintInfo.f35241a = null;
                tintInfo.f35244d = false;
                tintInfo.f35242b = null;
                tintInfo.f35243c = false;
                View view = this.f35007a;
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    tintInfo.f35244d = true;
                    tintInfo.f35241a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = this.f35007a.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    tintInfo.f35243c = true;
                    tintInfo.f35242b = backgroundTintMode;
                }
                if (tintInfo.f35244d || tintInfo.f35243c) {
                    AppCompatDrawableManager.m14907f(background, tintInfo, this.f35007a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            TintInfo tintInfo2 = this.f35011e;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.m14907f(background, tintInfo2, this.f35007a.getDrawableState());
                return;
            }
            TintInfo tintInfo3 = this.f35010d;
            if (tintInfo3 != null) {
                AppCompatDrawableManager.m14907f(background, tintInfo3, this.f35007a.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public ColorStateList m14877b() {
        TintInfo tintInfo = this.f35011e;
        if (tintInfo != null) {
            return tintInfo.f35241a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode m14878c() {
        TintInfo tintInfo = this.f35011e;
        if (tintInfo != null) {
            return tintInfo.f35242b;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m14879d(AttributeSet attributeSet, int i) {
        Context context = this.f35007a.getContext();
        int[] iArr = C7463b.f34409y;
        TintTypedArray tintTypedArrayM14998r = TintTypedArray.m14998r(context, attributeSet, iArr, i, 0);
        View view = this.f35007a;
        ViewCompat.m16326t(view, view.getContext(), iArr, attributeSet, tintTypedArrayM14998r.f35267b, i, 0);
        try {
            if (tintTypedArrayM14998r.m15014p(0)) {
                this.f35009c = tintTypedArrayM14998r.m15011m(0, -1);
                ColorStateList colorStateListM14909d = this.f35008b.m14909d(this.f35007a.getContext(), this.f35009c);
                if (colorStateListM14909d != null) {
                    m14882g(colorStateListM14909d);
                }
            }
            if (tintTypedArrayM14998r.m15014p(1)) {
                View view2 = this.f35007a;
                ColorStateList colorStateListM15001c = tintTypedArrayM14998r.m15001c(1);
                int i2 = Build.VERSION.SDK_INT;
                view2.setBackgroundTintList(colorStateListM15001c);
                if (i2 == 21) {
                    Drawable background = view2.getBackground();
                    boolean z = (view2.getBackgroundTintList() == null && view2.getBackgroundTintMode() == null) ? false : true;
                    if (background != null && z) {
                        if (background.isStateful()) {
                            background.setState(view2.getDrawableState());
                        }
                        view2.setBackground(background);
                    }
                }
            }
            if (tintTypedArrayM14998r.m15014p(2)) {
                View view3 = this.f35007a;
                PorterDuff.Mode modeM14887c = DrawableUtils.m14887c(tintTypedArrayM14998r.m15008j(2, -1), null);
                int i3 = Build.VERSION.SDK_INT;
                view3.setBackgroundTintMode(modeM14887c);
                if (i3 == 21) {
                    Drawable background2 = view3.getBackground();
                    boolean z2 = (view3.getBackgroundTintList() == null && view3.getBackgroundTintMode() == null) ? false : true;
                    if (background2 != null && z2) {
                        if (background2.isStateful()) {
                            background2.setState(view3.getDrawableState());
                        }
                        view3.setBackground(background2);
                    }
                }
            }
        } finally {
            tintTypedArrayM14998r.f35267b.recycle();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m14880e() {
        this.f35009c = -1;
        m14882g(null);
        m14876a();
    }

    /* JADX INFO: renamed from: f */
    public void m14881f(int i) {
        this.f35009c = i;
        AppCompatDrawableManager appCompatDrawableManager = this.f35008b;
        m14882g(appCompatDrawableManager != null ? appCompatDrawableManager.m14909d(this.f35007a.getContext(), i) : null);
        m14876a();
    }

    /* JADX INFO: renamed from: g */
    public void m14882g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f35010d == null) {
                this.f35010d = new TintInfo();
            }
            TintInfo tintInfo = this.f35010d;
            tintInfo.f35241a = colorStateList;
            tintInfo.f35244d = true;
        } else {
            this.f35010d = null;
        }
        m14876a();
    }

    /* JADX INFO: renamed from: h */
    public void m14883h(ColorStateList colorStateList) {
        if (this.f35011e == null) {
            this.f35011e = new TintInfo();
        }
        TintInfo tintInfo = this.f35011e;
        tintInfo.f35241a = colorStateList;
        tintInfo.f35244d = true;
        m14876a();
    }

    /* JADX INFO: renamed from: i */
    public void m14884i(PorterDuff.Mode mode) {
        if (this.f35011e == null) {
            this.f35011e = new TintInfo();
        }
        TintInfo tintInfo = this.f35011e;
        tintInfo.f35242b = mode;
        tintInfo.f35243c = true;
        m14876a();
    }
}
