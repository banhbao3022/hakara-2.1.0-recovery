package p636z0.p644b.p653h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import p636z0.p644b.C7463b;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.b.h.m, reason: use source file name */
/* JADX INFO: compiled from: AppCompatImageHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageHelper {

    /* JADX INFO: renamed from: a */
    public final ImageView f35119a;

    /* JADX INFO: renamed from: b */
    public TintInfo f35120b;

    /* JADX INFO: renamed from: c */
    public TintInfo f35121c;

    public AppCompatImageHelper(ImageView imageView) {
        this.f35119a = imageView;
    }

    /* JADX INFO: renamed from: a */
    public void m14926a() {
        Drawable drawable = this.f35119a.getDrawable();
        if (drawable != null) {
            DrawableUtils.m14886b(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 && i == 21) {
                if (this.f35121c == null) {
                    this.f35121c = new TintInfo();
                }
                TintInfo tintInfo = this.f35121c;
                tintInfo.f35241a = null;
                tintInfo.f35244d = false;
                tintInfo.f35242b = null;
                tintInfo.f35243c = false;
                ColorStateList imageTintList = this.f35119a.getImageTintList();
                if (imageTintList != null) {
                    tintInfo.f35244d = true;
                    tintInfo.f35241a = imageTintList;
                }
                PorterDuff.Mode imageTintMode = this.f35119a.getImageTintMode();
                if (imageTintMode != null) {
                    tintInfo.f35243c = true;
                    tintInfo.f35242b = imageTintMode;
                }
                if (tintInfo.f35244d || tintInfo.f35243c) {
                    AppCompatDrawableManager.m14907f(drawable, tintInfo, this.f35119a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            TintInfo tintInfo2 = this.f35120b;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.m14907f(drawable, tintInfo2, this.f35119a.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14927b(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        int iM15011m;
        Context context = this.f35119a.getContext();
        int[] iArr = C7463b.f34390f;
        TintTypedArray tintTypedArrayM14998r = TintTypedArray.m14998r(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f35119a;
        ViewCompat.m16326t(imageView, imageView.getContext(), iArr, attributeSet, tintTypedArrayM14998r.f35267b, i, 0);
        try {
            Drawable drawable3 = this.f35119a.getDrawable();
            if (drawable3 == null && (iM15011m = tintTypedArrayM14998r.m15011m(1, -1)) != -1 && (drawable3 = AppCompatResources.m14707b(this.f35119a.getContext(), iM15011m)) != null) {
                this.f35119a.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                DrawableUtils.m14886b(drawable3);
            }
            if (tintTypedArrayM14998r.m15014p(2)) {
                ImageView imageView2 = this.f35119a;
                ColorStateList colorStateListM15001c = tintTypedArrayM14998r.m15001c(2);
                int i2 = Build.VERSION.SDK_INT;
                imageView2.setImageTintList(colorStateListM15001c);
                if (i2 == 21 && (drawable2 = imageView2.getDrawable()) != null && imageView2.getImageTintList() != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView2.getDrawableState());
                    }
                    imageView2.setImageDrawable(drawable2);
                }
            }
            if (tintTypedArrayM14998r.m15014p(3)) {
                ImageView imageView3 = this.f35119a;
                PorterDuff.Mode modeM14887c = DrawableUtils.m14887c(tintTypedArrayM14998r.m15008j(3, -1), null);
                int i3 = Build.VERSION.SDK_INT;
                imageView3.setImageTintMode(modeM14887c);
                if (i3 == 21 && (drawable = imageView3.getDrawable()) != null && imageView3.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView3.getDrawableState());
                    }
                    imageView3.setImageDrawable(drawable);
                }
            }
        } finally {
            tintTypedArrayM14998r.f35267b.recycle();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m14928c(int i) {
        if (i != 0) {
            Drawable drawableM14707b = AppCompatResources.m14707b(this.f35119a.getContext(), i);
            if (drawableM14707b != null) {
                DrawableUtils.m14886b(drawableM14707b);
            }
            this.f35119a.setImageDrawable(drawableM14707b);
        } else {
            this.f35119a.setImageDrawable(null);
        }
        m14926a();
    }

    /* JADX INFO: renamed from: d */
    public void m14929d(ColorStateList colorStateList) {
        if (this.f35120b == null) {
            this.f35120b = new TintInfo();
        }
        TintInfo tintInfo = this.f35120b;
        tintInfo.f35241a = colorStateList;
        tintInfo.f35244d = true;
        m14926a();
    }

    /* JADX INFO: renamed from: e */
    public void m14930e(PorterDuff.Mode mode) {
        if (this.f35120b == null) {
            this.f35120b = new TintInfo();
        }
        TintInfo tintInfo = this.f35120b;
        tintInfo.f35242b = mode;
        tintInfo.f35243c = true;
        m14926a();
    }
}
