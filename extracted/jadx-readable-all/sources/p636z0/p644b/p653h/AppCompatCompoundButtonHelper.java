package p636z0.p644b.p653h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import p636z0.p644b.C7463b;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.b.h.i, reason: use source file name */
/* JADX INFO: compiled from: AppCompatCompoundButtonHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatCompoundButtonHelper {

    /* JADX INFO: renamed from: a */
    public final CompoundButton f35048a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f35049b = null;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f35050c = null;

    /* JADX INFO: renamed from: d */
    public boolean f35051d = false;

    /* JADX INFO: renamed from: e */
    public boolean f35052e = false;

    /* JADX INFO: renamed from: f */
    public boolean f35053f;

    public AppCompatCompoundButtonHelper(CompoundButton compoundButton) {
        this.f35048a = compoundButton;
    }

    /* JADX INFO: renamed from: a */
    public void m14894a() {
        Drawable drawableM16074s = C8162a.m16074s(this.f35048a);
        if (drawableM16074s != null) {
            if (this.f35051d || this.f35052e) {
                Drawable drawableMutate = C8162a.m16054Y(drawableM16074s).mutate();
                if (this.f35051d) {
                    drawableMutate.setTintList(this.f35049b);
                }
                if (this.f35052e) {
                    drawableMutate.setTintMode(this.f35050c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f35048a.getDrawableState());
                }
                this.f35048a.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14895b(AttributeSet attributeSet, int i) {
        int iM15011m;
        int iM15011m2;
        Context context = this.f35048a.getContext();
        int[] iArr = C7463b.f34396l;
        TintTypedArray tintTypedArrayM14998r = TintTypedArray.m14998r(context, attributeSet, iArr, i, 0);
        CompoundButton compoundButton = this.f35048a;
        ViewCompat.m16326t(compoundButton, compoundButton.getContext(), iArr, attributeSet, tintTypedArrayM14998r.f35267b, i, 0);
        boolean z = true;
        try {
            if (!tintTypedArrayM14998r.m15014p(1) || (iM15011m2 = tintTypedArrayM14998r.m15011m(1, 0)) == 0) {
                z = false;
            } else {
                try {
                    CompoundButton compoundButton2 = this.f35048a;
                    compoundButton2.setButtonDrawable(AppCompatResources.m14707b(compoundButton2.getContext(), iM15011m2));
                } catch (Resources.NotFoundException unused) {
                    z = false;
                }
            }
            if (!z && tintTypedArrayM14998r.m15014p(0) && (iM15011m = tintTypedArrayM14998r.m15011m(0, 0)) != 0) {
                CompoundButton compoundButton3 = this.f35048a;
                compoundButton3.setButtonDrawable(AppCompatResources.m14707b(compoundButton3.getContext(), iM15011m));
            }
            if (tintTypedArrayM14998r.m15014p(2)) {
                this.f35048a.setButtonTintList(tintTypedArrayM14998r.m15001c(2));
            }
            if (tintTypedArrayM14998r.m15014p(3)) {
                this.f35048a.setButtonTintMode(DrawableUtils.m14887c(tintTypedArrayM14998r.m15008j(3, -1), null));
            }
        } finally {
            tintTypedArrayM14998r.f35267b.recycle();
        }
    }
}
