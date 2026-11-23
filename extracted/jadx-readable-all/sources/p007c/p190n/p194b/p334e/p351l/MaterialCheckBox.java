package p007c.p190n.p194b.p334e.p351l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p636z0.p644b.p653h.AppCompatCheckBox;

/* JADX INFO: renamed from: c.n.b.e.l.a, reason: use source file name */
/* JADX INFO: compiled from: MaterialCheckBox.java */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* JADX INFO: renamed from: i */
    public static final int[][] f25116i = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: j */
    public ColorStateList f25117j;

    /* JADX INFO: renamed from: k */
    public boolean f25118k;

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f25117j == null) {
            int[][] iArr = f25116i;
            int[] iArr2 = new int[iArr.length];
            int iM10960K = C4799a.m10960K(this, mtp.media.karaoke.R.attr.colorControlActivated);
            int iM10960K2 = C4799a.m10960K(this, mtp.media.karaoke.R.attr.colorSurface);
            int iM10960K3 = C4799a.m10960K(this, mtp.media.karaoke.R.attr.colorOnSurface);
            iArr2[0] = C4799a.m10989g0(iM10960K2, iM10960K, 1.0f);
            iArr2[1] = C4799a.m10989g0(iM10960K2, iM10960K3, 0.54f);
            iArr2[2] = C4799a.m10989g0(iM10960K2, iM10960K3, 0.38f);
            iArr2[3] = C4799a.m10989g0(iM10960K2, iM10960K3, 0.38f);
            this.f25117j = new ColorStateList(iArr, iArr2);
        }
        return this.f25117j;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f25118k && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f25118k = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, mtp.media.karaoke.R.attr.checkboxStyle);
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.m11090a(context, attributeSet, i, 2132017900), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayM11347d = ThemeEnforcement.m11347d(context2, attributeSet, C4801b.f24730B, i, 2132017900, new int[0]);
        if (typedArrayM11347d.hasValue(0)) {
            setButtonTintList(C4799a.m10961L(context2, typedArrayM11347d, 0));
        }
        this.f25118k = typedArrayM11347d.getBoolean(1, false);
        typedArrayM11347d.recycle();
    }
}
