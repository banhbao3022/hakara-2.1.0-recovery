package p007c.p190n.p194b.p334e.p350k;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import java.util.Objects;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p363w.RippleUtils;
import p007c.p190n.p194b.p334e.p365y.CornerTreatment;
import p007c.p190n.p194b.p334e.p365y.CutCornerTreatment;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p007c.p190n.p194b.p334e.p365y.RoundedCornerTreatment;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearanceModel;
import p636z0.p686f.p687c.CardViewApi21Impl;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: c.n.b.e.k.b, reason: use source file name */
/* JADX INFO: compiled from: MaterialCardViewHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCardViewHelper {

    /* JADX INFO: renamed from: a */
    public static final int[] f25095a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    public static final double f25096b = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: c */
    public final MaterialCardView f25097c;

    /* JADX INFO: renamed from: e */
    public final MaterialShapeDrawable f25099e;

    /* JADX INFO: renamed from: f */
    public final MaterialShapeDrawable f25100f;

    /* JADX INFO: renamed from: g */
    public int f25101g;

    /* JADX INFO: renamed from: h */
    public int f25102h;

    /* JADX INFO: renamed from: i */
    public int f25103i;

    /* JADX INFO: renamed from: j */
    public Drawable f25104j;

    /* JADX INFO: renamed from: k */
    public Drawable f25105k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f25106l;

    /* JADX INFO: renamed from: m */
    public ColorStateList f25107m;

    /* JADX INFO: renamed from: n */
    public ShapeAppearanceModel f25108n;

    /* JADX INFO: renamed from: o */
    public ColorStateList f25109o;

    /* JADX INFO: renamed from: p */
    public Drawable f25110p;

    /* JADX INFO: renamed from: q */
    public LayerDrawable f25111q;

    /* JADX INFO: renamed from: r */
    public MaterialShapeDrawable f25112r;

    /* JADX INFO: renamed from: s */
    public MaterialShapeDrawable f25113s;

    /* JADX INFO: renamed from: u */
    public boolean f25115u;

    /* JADX INFO: renamed from: d */
    public final Rect f25098d = new Rect();

    /* JADX INFO: renamed from: t */
    public boolean f25114t = false;

    /* JADX INFO: renamed from: c.n.b.e.k.b$a */
    /* JADX INFO: compiled from: MaterialCardViewHelper.java */
    public class a extends InsetDrawable {
        public a(MaterialCardViewHelper materialCardViewHelper, Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public MaterialCardViewHelper(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f25097c = materialCardView;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(materialCardView.getContext(), attributeSet, i, i2);
        this.f25099e = materialShapeDrawable;
        materialShapeDrawable.m11378n(materialCardView.getContext());
        materialShapeDrawable.m11384t(-12303292);
        ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawable.f25574h.f25594a;
        Objects.requireNonNull(shapeAppearanceModel);
        ShapeAppearanceModel.b bVar = new ShapeAppearanceModel.b(shapeAppearanceModel);
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C4801b.f24752g, i, mtp.media.karaoke.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            bVar.m11399c(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f25100f = new MaterialShapeDrawable();
        m11145h(bVar.m11398a());
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final float m11138a() {
        float fM11139b = m11139b(this.f25108n.f25619b, this.f25099e.m11376l());
        CornerTreatment cornerTreatment = this.f25108n.f25620c;
        MaterialShapeDrawable materialShapeDrawable = this.f25099e;
        float fMax = Math.max(fM11139b, m11139b(cornerTreatment, materialShapeDrawable.f25574h.f25594a.f25624g.mo11363a(materialShapeDrawable.m11372h())));
        CornerTreatment cornerTreatment2 = this.f25108n.f25621d;
        MaterialShapeDrawable materialShapeDrawable2 = this.f25099e;
        float fM11139b2 = m11139b(cornerTreatment2, materialShapeDrawable2.f25574h.f25594a.f25625h.mo11363a(materialShapeDrawable2.m11372h()));
        CornerTreatment cornerTreatment3 = this.f25108n.f25622e;
        MaterialShapeDrawable materialShapeDrawable3 = this.f25099e;
        return Math.max(fMax, Math.max(fM11139b2, m11139b(cornerTreatment3, materialShapeDrawable3.f25574h.f25594a.f25626i.mo11363a(materialShapeDrawable3.m11372h()))));
    }

    /* JADX INFO: renamed from: b */
    public final float m11139b(CornerTreatment cornerTreatment, float f) {
        if (cornerTreatment instanceof RoundedCornerTreatment) {
            return (float) ((1.0d - f25096b) * ((double) f));
        }
        if (cornerTreatment instanceof CutCornerTreatment) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public final float m11140c() {
        return this.f25097c.getMaxCardElevation() + (m11147j() ? m11138a() : 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public final float m11141d() {
        return (this.f25097c.getMaxCardElevation() * 1.5f) + (m11147j() ? m11138a() : 0.0f);
    }

    /* JADX INFO: renamed from: e */
    public final Drawable m11142e() {
        if (this.f25110p == null) {
            int[] iArr = RippleUtils.f25542a;
            this.f25113s = new MaterialShapeDrawable(this.f25108n);
            this.f25110p = new RippleDrawable(this.f25106l, null, this.f25113s);
        }
        if (this.f25111q == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable = this.f25105k;
            if (drawable != null) {
                stateListDrawable.addState(f25095a, drawable);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f25110p, this.f25100f, stateListDrawable});
            this.f25111q = layerDrawable;
            layerDrawable.setId(2, mtp.media.karaoke.R.id.mtrl_card_checked_layer_id);
        }
        return this.f25111q;
    }

    /* JADX INFO: renamed from: f */
    public final Drawable m11143f(Drawable drawable) {
        int iCeil;
        int i;
        if (this.f25097c.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil(m11141d());
            iCeil = (int) Math.ceil(m11140c());
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new a(this, drawable, iCeil, i, iCeil, i);
    }

    /* JADX INFO: renamed from: g */
    public void m11144g(Drawable drawable) {
        this.f25105k = drawable;
        if (drawable != null) {
            Drawable drawableM16054Y = C8162a.m16054Y(drawable.mutate());
            this.f25105k = drawableM16054Y;
            drawableM16054Y.setTintList(this.f25107m);
        }
        if (this.f25111q != null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable2 = this.f25105k;
            if (drawable2 != null) {
                stateListDrawable.addState(f25095a, drawable2);
            }
            this.f25111q.setDrawableByLayerId(mtp.media.karaoke.R.id.mtrl_card_checked_layer_id, stateListDrawable);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m11145h(ShapeAppearanceModel shapeAppearanceModel) {
        this.f25108n = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.f25099e;
        materialShapeDrawable.f25574h.f25594a = shapeAppearanceModel;
        materialShapeDrawable.invalidateSelf();
        MaterialShapeDrawable materialShapeDrawable2 = this.f25099e;
        materialShapeDrawable2.f25573C = !materialShapeDrawable2.m11379o();
        MaterialShapeDrawable materialShapeDrawable3 = this.f25100f;
        if (materialShapeDrawable3 != null) {
            materialShapeDrawable3.f25574h.f25594a = shapeAppearanceModel;
            materialShapeDrawable3.invalidateSelf();
        }
        MaterialShapeDrawable materialShapeDrawable4 = this.f25113s;
        if (materialShapeDrawable4 != null) {
            materialShapeDrawable4.f25574h.f25594a = shapeAppearanceModel;
            materialShapeDrawable4.invalidateSelf();
        }
        MaterialShapeDrawable materialShapeDrawable5 = this.f25112r;
        if (materialShapeDrawable5 != null) {
            materialShapeDrawable5.f25574h.f25594a = shapeAppearanceModel;
            materialShapeDrawable5.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m11146i() {
        return this.f25097c.getPreventCornerOverlap() && !this.f25099e.m11379o();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11147j() {
        return this.f25097c.getPreventCornerOverlap() && this.f25099e.m11379o() && this.f25097c.getUseCompatPadding();
    }

    /* JADX INFO: renamed from: k */
    public void m11148k() {
        float cardViewRadius = 0.0f;
        float fM11138a = m11146i() || m11147j() ? m11138a() : 0.0f;
        if (this.f25097c.getPreventCornerOverlap() && this.f25097c.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f25096b) * ((double) this.f25097c.getCardViewRadius()));
        }
        int i = (int) (fM11138a - cardViewRadius);
        MaterialCardView materialCardView = this.f25097c;
        Rect rect = this.f25098d;
        materialCardView.f515l.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        ((CardViewApi21Impl) CardView.f510g).m15543c(materialCardView.f517n);
    }

    /* JADX INFO: renamed from: l */
    public void m11149l() {
        if (!this.f25114t) {
            this.f25097c.setBackgroundInternal(m11143f(this.f25099e));
        }
        this.f25097c.setForeground(m11143f(this.f25104j));
    }

    /* JADX INFO: renamed from: m */
    public final void m11150m() {
        int[] iArr = RippleUtils.f25542a;
        Drawable drawable = this.f25110p;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(this.f25106l);
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = this.f25112r;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.m11381q(this.f25106l);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m11151n() {
        this.f25100f.m11387w(this.f25103i, this.f25109o);
    }
}
