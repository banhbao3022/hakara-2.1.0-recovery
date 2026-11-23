package p007c.p190n.p194b.p334e.p349j;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.p363w.RippleUtils;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearanceModel;
import p007c.p190n.p194b.p334e.p365y.Shapeable;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: c.n.b.e.j.a, reason: use source file name */
/* JADX INFO: compiled from: MaterialButtonHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonHelper {

    /* JADX INFO: renamed from: a */
    public final MaterialButton f25068a;

    /* JADX INFO: renamed from: b */
    public ShapeAppearanceModel f25069b;

    /* JADX INFO: renamed from: c */
    public int f25070c;

    /* JADX INFO: renamed from: d */
    public int f25071d;

    /* JADX INFO: renamed from: e */
    public int f25072e;

    /* JADX INFO: renamed from: f */
    public int f25073f;

    /* JADX INFO: renamed from: g */
    public int f25074g;

    /* JADX INFO: renamed from: h */
    public int f25075h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f25076i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f25077j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f25078k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f25079l;

    /* JADX INFO: renamed from: m */
    public Drawable f25080m;

    /* JADX INFO: renamed from: n */
    public boolean f25081n = false;

    /* JADX INFO: renamed from: o */
    public boolean f25082o = false;

    /* JADX INFO: renamed from: p */
    public boolean f25083p = false;

    /* JADX INFO: renamed from: q */
    public boolean f25084q;

    /* JADX INFO: renamed from: r */
    public LayerDrawable f25085r;

    /* JADX INFO: renamed from: s */
    public int f25086s;

    public MaterialButtonHelper(MaterialButton materialButton, ShapeAppearanceModel shapeAppearanceModel) {
        this.f25068a = materialButton;
        this.f25069b = shapeAppearanceModel;
    }

    /* JADX INFO: renamed from: a */
    public Shapeable m11127a() {
        LayerDrawable layerDrawable = this.f25085r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f25085r.getNumberOfLayers() > 2 ? (Shapeable) this.f25085r.getDrawable(2) : (Shapeable) this.f25085r.getDrawable(1);
    }

    /* JADX INFO: renamed from: b */
    public MaterialShapeDrawable m11128b() {
        return m11129c(false);
    }

    /* JADX INFO: renamed from: c */
    public final MaterialShapeDrawable m11129c(boolean z) {
        LayerDrawable layerDrawable = this.f25085r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.f25085r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    /* JADX INFO: renamed from: d */
    public final MaterialShapeDrawable m11130d() {
        return m11129c(true);
    }

    /* JADX INFO: renamed from: e */
    public void m11131e(ShapeAppearanceModel shapeAppearanceModel) {
        this.f25069b = shapeAppearanceModel;
        if (m11128b() != null) {
            MaterialShapeDrawable materialShapeDrawableM11128b = m11128b();
            materialShapeDrawableM11128b.f25574h.f25594a = shapeAppearanceModel;
            materialShapeDrawableM11128b.invalidateSelf();
        }
        if (m11130d() != null) {
            MaterialShapeDrawable materialShapeDrawableM11130d = m11130d();
            materialShapeDrawableM11130d.f25574h.f25594a = shapeAppearanceModel;
            materialShapeDrawableM11130d.invalidateSelf();
        }
        if (m11127a() != null) {
            m11127a().setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11132f(int i, int i2) {
        MaterialButton materialButton = this.f25068a;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = this.f25068a.getPaddingTop();
        int paddingEnd = this.f25068a.getPaddingEnd();
        int paddingBottom = this.f25068a.getPaddingBottom();
        int i3 = this.f25072e;
        int i4 = this.f25073f;
        this.f25073f = i2;
        this.f25072e = i;
        if (!this.f25082o) {
            m11133g();
        }
        this.f25068a.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    /* JADX INFO: renamed from: g */
    public final void m11133g() {
        MaterialButton materialButton = this.f25068a;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f25069b);
        materialShapeDrawable.m11378n(this.f25068a.getContext());
        materialShapeDrawable.setTintList(this.f25077j);
        PorterDuff.Mode mode = this.f25076i;
        if (mode != null) {
            materialShapeDrawable.setTintMode(mode);
        }
        materialShapeDrawable.m11387w(this.f25075h, this.f25078k);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.f25069b);
        materialShapeDrawable2.setTint(0);
        materialShapeDrawable2.m11386v(this.f25075h, this.f25081n ? C4799a.m10960K(this.f25068a, R.attr.colorSurface) : 0);
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.f25069b);
        this.f25080m = materialShapeDrawable3;
        materialShapeDrawable3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.m11360c(this.f25079l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable}), this.f25070c, this.f25072e, this.f25071d, this.f25073f), this.f25080m);
        this.f25085r = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        MaterialShapeDrawable materialShapeDrawableM11128b = m11128b();
        if (materialShapeDrawableM11128b != null) {
            materialShapeDrawableM11128b.m11380p(this.f25086s);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m11134h() {
        MaterialShapeDrawable materialShapeDrawableM11128b = m11128b();
        MaterialShapeDrawable materialShapeDrawableM11130d = m11130d();
        if (materialShapeDrawableM11128b != null) {
            materialShapeDrawableM11128b.m11387w(this.f25075h, this.f25078k);
            if (materialShapeDrawableM11130d != null) {
                materialShapeDrawableM11130d.m11386v(this.f25075h, this.f25081n ? C4799a.m10960K(this.f25068a, R.attr.colorSurface) : 0);
            }
        }
    }
}
