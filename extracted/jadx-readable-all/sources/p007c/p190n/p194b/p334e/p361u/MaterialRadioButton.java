package p007c.p190n.p194b.p334e.p361u;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p636z0.p644b.p653h.AppCompatRadioButton;

/* JADX INFO: renamed from: c.n.b.e.u.a, reason: use source file name */
/* JADX INFO: compiled from: MaterialRadioButton.java */
/* JADX INFO: loaded from: classes.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* JADX INFO: renamed from: i */
    public static final int[][] f25517i = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: j */
    public ColorStateList f25518j;

    /* JADX INFO: renamed from: k */
    public boolean f25519k;

    public MaterialRadioButton(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f25518j == null) {
            int iM10960K = C4799a.m10960K(this, mtp.media.karaoke.R.attr.colorControlActivated);
            int iM10960K2 = C4799a.m10960K(this, mtp.media.karaoke.R.attr.colorOnSurface);
            int iM10960K3 = C4799a.m10960K(this, mtp.media.karaoke.R.attr.colorSurface);
            int[][] iArr = f25517i;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C4799a.m10989g0(iM10960K3, iM10960K, 1.0f);
            iArr2[1] = C4799a.m10989g0(iM10960K3, iM10960K2, 0.54f);
            iArr2[2] = C4799a.m10989g0(iM10960K3, iM10960K2, 0.38f);
            iArr2[3] = C4799a.m10989g0(iM10960K3, iM10960K2, 0.38f);
            this.f25518j = new ColorStateList(iArr, iArr2);
        }
        return this.f25518j;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f25519k && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f25519k = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, mtp.media.karaoke.R.attr.radioButtonStyle);
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.m11090a(context, attributeSet, i, 2132017901), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayM11347d = ThemeEnforcement.m11347d(context2, attributeSet, C4801b.f24731C, i, 2132017901, new int[0]);
        if (typedArrayM11347d.hasValue(0)) {
            setButtonTintList(C4799a.m10961L(context2, typedArrayM11347d, 0));
        }
        this.f25519k = typedArrayM11347d.getBoolean(1, false);
        typedArrayM11347d.recycle();
    }
}
