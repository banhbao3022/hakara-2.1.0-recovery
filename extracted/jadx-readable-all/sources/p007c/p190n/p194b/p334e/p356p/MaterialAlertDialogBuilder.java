package p007c.p190n.p194b.p334e.p356p;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AlertController;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p007c.p190n.p194b.p334e.p357q.ElevationOverlayProvider;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p007c.p190n.p194b.p334e.p362v.MaterialAttributes;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p636z0.p644b.p645c.AlertDialog;
import p636z0.p644b.p651g.ContextThemeWrapper;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: c.n.b.e.p.b, reason: use source file name */
/* JADX INFO: compiled from: MaterialAlertDialogBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class MaterialAlertDialogBuilder extends AlertDialog.a {

    /* JADX INFO: renamed from: c */
    public Drawable f25320c;

    /* JADX INFO: renamed from: d */
    public final Rect f25321d;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialAlertDialogBuilder(Context context, int i) {
        int i2;
        TypedValue typedValueM11349a = MaterialAttributes.m11349a(context, R.attr.materialAlertDialogTheme);
        int i3 = typedValueM11349a == null ? 0 : typedValueM11349a.data;
        Context contextM11090a = MaterialThemeOverlay.m11090a(context, null, R.attr.alertDialogStyle, 2132017440);
        contextM11090a = i3 != 0 ? new ContextThemeWrapper(contextM11090a, i3) : contextM11090a;
        if (i == 0) {
            TypedValue typedValueM11349a2 = MaterialAttributes.m11349a(context, R.attr.materialAlertDialogTheme);
            i2 = typedValueM11349a2 == null ? 0 : typedValueM11349a2.data;
        } else {
            i2 = i;
        }
        super(contextM11090a, i2);
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int[] iArr = C4801b.f24766u;
        ThemeEnforcement.m11344a(context2, null, R.attr.alertDialogStyle, 2132017440);
        ThemeEnforcement.m11345b(context2, null, iArr, R.attr.alertDialogStyle, 2132017440, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, 2132017440);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        if (context2.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.f25321d = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        int iM11351c = MaterialAttributes.m11351c(context2, R.attr.colorSurface, MaterialAlertDialogBuilder.class.getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, null, R.attr.alertDialogStyle, 2132017440);
        materialShapeDrawable.f25574h.f25595b = new ElevationOverlayProvider(context2);
        materialShapeDrawable.m11365A();
        materialShapeDrawable.m11381q(ColorStateList.valueOf(iM11351c));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                materialShapeDrawable.f25574h.f25594a = materialShapeDrawable.f25574h.f25594a.m11396f(dimension);
                materialShapeDrawable.invalidateSelf();
            }
        }
        this.f25320c = materialShapeDrawable;
    }

    @Override // p636z0.p644b.p645c.AlertDialog.a
    /* JADX INFO: renamed from: a */
    public AlertDialog.a mo11257a(boolean z) {
        this.f34424a.f233k = z;
        return this;
    }

    @Override // p636z0.p644b.p645c.AlertDialog.a
    /* JADX INFO: renamed from: b */
    public AlertDialog.a mo11258b(CharSequence charSequence) {
        this.f34424a.f228f = charSequence;
        return this;
    }

    @Override // p636z0.p644b.p645c.AlertDialog.a
    /* JADX INFO: renamed from: c */
    public AlertDialog.a mo11259c(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        AlertController.C0050b c0050b = this.f34424a;
        c0050b.f231i = charSequence;
        c0050b.f232j = onClickListener;
        return this;
    }

    @Override // p636z0.p644b.p645c.AlertDialog.a
    public AlertDialog create() {
        AlertDialog alertDialogCreate = super.create();
        Window window = alertDialogCreate.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f25320c;
        if (drawable instanceof MaterialShapeDrawable) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            ((MaterialShapeDrawable) drawable).m11380p(decorView.getElevation());
        }
        Drawable drawable2 = this.f25320c;
        Rect rect = this.f25321d;
        window.setBackgroundDrawable(new InsetDrawable(drawable2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new InsetDialogOnTouchListener(alertDialogCreate, this.f25321d));
        return alertDialogCreate;
    }

    @Override // p636z0.p644b.p645c.AlertDialog.a
    /* JADX INFO: renamed from: d */
    public AlertDialog.a mo11260d(DialogInterface.OnKeyListener onKeyListener) {
        this.f34424a.f234l = onKeyListener;
        return this;
    }

    @Override // p636z0.p644b.p645c.AlertDialog.a
    /* JADX INFO: renamed from: e */
    public AlertDialog.a mo11261e(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        AlertController.C0050b c0050b = this.f34424a;
        c0050b.f229g = charSequence;
        c0050b.f230h = onClickListener;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public MaterialAlertDialogBuilder m11262f(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setTitle(charSequence);
    }

    @Override // p636z0.p644b.p645c.AlertDialog.a
    public AlertDialog.a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(i, onClickListener);
    }

    @Override // p636z0.p644b.p645c.AlertDialog.a
    public AlertDialog.a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(i, onClickListener);
    }

    @Override // p636z0.p644b.p645c.AlertDialog.a
    public AlertDialog.a setTitle(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setTitle(charSequence);
    }

    @Override // p636z0.p644b.p645c.AlertDialog.a
    public AlertDialog.a setView(View view) {
        return (MaterialAlertDialogBuilder) super.setView(view);
    }

    public MaterialAlertDialogBuilder(Context context) {
        this(context, 0);
    }
}
