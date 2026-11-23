package p007c.p190n.p194b.p334e.p352m;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.p337c.MotionSpec;
import p007c.p190n.p194b.p334e.p357q.ElevationOverlayProvider;
import p007c.p190n.p194b.p334e.p360t.TextDrawableHelper;
import p007c.p190n.p194b.p334e.p362v.TextAppearance;
import p007c.p190n.p194b.p334e.p363w.RippleUtils;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p636z0.p725k.C8162a;
import p636z0.p725k.p729e.ColorUtils;
import p636z0.p725k.p729e.p730l.TintAwareDrawable;
import p636z0.p725k.p729e.p730l.WrappedDrawable;

/* JADX INFO: renamed from: c.n.b.e.m.b, reason: use source file name */
/* JADX INFO: compiled from: ChipDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class ChipDrawable extends MaterialShapeDrawable implements TintAwareDrawable, Drawable.Callback, TextDrawableHelper.b {

    /* JADX INFO: renamed from: D */
    public static final int[] f25120D = {R.attr.state_enabled};

    /* JADX INFO: renamed from: E */
    public static final ShapeDrawable f25121E = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A0 */
    public int f25122A0;

    /* JADX INFO: renamed from: B0 */
    public int f25123B0;

    /* JADX INFO: renamed from: C0 */
    public ColorFilter f25124C0;

    /* JADX INFO: renamed from: D0 */
    public PorterDuffColorFilter f25125D0;

    /* JADX INFO: renamed from: E0 */
    public ColorStateList f25126E0;

    /* JADX INFO: renamed from: F */
    public ColorStateList f25127F;

    /* JADX INFO: renamed from: F0 */
    public PorterDuff.Mode f25128F0;

    /* JADX INFO: renamed from: G */
    public ColorStateList f25129G;

    /* JADX INFO: renamed from: G0 */
    public int[] f25130G0;

    /* JADX INFO: renamed from: H */
    public float f25131H;

    /* JADX INFO: renamed from: H0 */
    public boolean f25132H0;

    /* JADX INFO: renamed from: I */
    public float f25133I;

    /* JADX INFO: renamed from: I0 */
    public ColorStateList f25134I0;

    /* JADX INFO: renamed from: J */
    public ColorStateList f25135J;

    /* JADX INFO: renamed from: J0 */
    public WeakReference<a> f25136J0;

    /* JADX INFO: renamed from: K */
    public float f25137K;

    /* JADX INFO: renamed from: K0 */
    public TextUtils.TruncateAt f25138K0;

    /* JADX INFO: renamed from: L */
    public ColorStateList f25139L;

    /* JADX INFO: renamed from: L0 */
    public boolean f25140L0;

    /* JADX INFO: renamed from: M */
    public CharSequence f25141M;

    /* JADX INFO: renamed from: M0 */
    public int f25142M0;

    /* JADX INFO: renamed from: N */
    public boolean f25143N;

    /* JADX INFO: renamed from: N0 */
    public boolean f25144N0;

    /* JADX INFO: renamed from: O */
    public Drawable f25145O;

    /* JADX INFO: renamed from: P */
    public ColorStateList f25146P;

    /* JADX INFO: renamed from: Q */
    public float f25147Q;

    /* JADX INFO: renamed from: R */
    public boolean f25148R;

    /* JADX INFO: renamed from: S */
    public boolean f25149S;

    /* JADX INFO: renamed from: T */
    public Drawable f25150T;

    /* JADX INFO: renamed from: U */
    public Drawable f25151U;

    /* JADX INFO: renamed from: V */
    public ColorStateList f25152V;

    /* JADX INFO: renamed from: W */
    public float f25153W;

    /* JADX INFO: renamed from: X */
    public CharSequence f25154X;

    /* JADX INFO: renamed from: Y */
    public boolean f25155Y;

    /* JADX INFO: renamed from: Z */
    public boolean f25156Z;

    /* JADX INFO: renamed from: a0 */
    public Drawable f25157a0;

    /* JADX INFO: renamed from: b0 */
    public ColorStateList f25158b0;

    /* JADX INFO: renamed from: c0 */
    public MotionSpec f25159c0;

    /* JADX INFO: renamed from: d0 */
    public MotionSpec f25160d0;

    /* JADX INFO: renamed from: e0 */
    public float f25161e0;

    /* JADX INFO: renamed from: f0 */
    public float f25162f0;

    /* JADX INFO: renamed from: g0 */
    public float f25163g0;

    /* JADX INFO: renamed from: h0 */
    public float f25164h0;

    /* JADX INFO: renamed from: i0 */
    public float f25165i0;

    /* JADX INFO: renamed from: j0 */
    public float f25166j0;

    /* JADX INFO: renamed from: k0 */
    public float f25167k0;

    /* JADX INFO: renamed from: l0 */
    public float f25168l0;

    /* JADX INFO: renamed from: m0 */
    public final Context f25169m0;

    /* JADX INFO: renamed from: n0 */
    public final Paint f25170n0;

    /* JADX INFO: renamed from: o0 */
    public final Paint.FontMetrics f25171o0;

    /* JADX INFO: renamed from: p0 */
    public final RectF f25172p0;

    /* JADX INFO: renamed from: q0 */
    public final PointF f25173q0;

    /* JADX INFO: renamed from: r0 */
    public final Path f25174r0;

    /* JADX INFO: renamed from: s0 */
    public final TextDrawableHelper f25175s0;

    /* JADX INFO: renamed from: t0 */
    public int f25176t0;

    /* JADX INFO: renamed from: u0 */
    public int f25177u0;

    /* JADX INFO: renamed from: v0 */
    public int f25178v0;

    /* JADX INFO: renamed from: w0 */
    public int f25179w0;

    /* JADX INFO: renamed from: x0 */
    public int f25180x0;

    /* JADX INFO: renamed from: y0 */
    public int f25181y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f25182z0;

    /* JADX INFO: renamed from: c.n.b.e.m.b$a */
    /* JADX INFO: compiled from: ChipDrawable.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo11198a();
    }

    public ChipDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f25133I = -1.0f;
        this.f25170n0 = new Paint(1);
        this.f25171o0 = new Paint.FontMetrics();
        this.f25172p0 = new RectF();
        this.f25173q0 = new PointF();
        this.f25174r0 = new Path();
        this.f25123B0 = 255;
        this.f25128F0 = PorterDuff.Mode.SRC_IN;
        this.f25136J0 = new WeakReference<>(null);
        this.f25574h.f25595b = new ElevationOverlayProvider(context);
        m11365A();
        this.f25169m0 = context;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.f25175s0 = textDrawableHelper;
        this.f25141M = "";
        textDrawableHelper.f25498a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f25120D;
        setState(iArr);
        m11184h0(iArr);
        this.f25140L0 = true;
        int[] iArr2 = RippleUtils.f25542a;
        f25121E.setTint(-1);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m11152K(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: L */
    public static boolean m11153L(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: B */
    public final void m11154B(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C8162a.m16043N(drawable, C8162a.m16075t(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f25150T) {
            if (drawable.isStateful()) {
                drawable.setState(this.f25130G0);
            }
            drawable.setTintList(this.f25152V);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.f25145O;
        if (drawable == drawable2 && this.f25148R) {
            drawable2.setTintList(this.f25146P);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060 A[PHI: r1
  0x0060: PHI (r1v3 float) = (r1v2 float), (r1v2 float), (r1v10 float) binds: [B:15:0x003f, B:16:0x0041, B:18:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: C */
    public final void m11155C(Rect rect, RectF rectF) {
        float intrinsicHeight;
        rectF.setEmpty();
        if (m11195s0() || m11194r0()) {
            float f = this.f25161e0 + this.f25162f0;
            float fM11162J = m11162J();
            if (C8162a.m16075t(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + fM11162J;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - fM11162J;
            }
            Drawable drawable = this.f25182z0 ? this.f25157a0 : this.f25145O;
            float fCeil = this.f25147Q;
            if (fCeil > 0.0f || drawable == null) {
                intrinsicHeight = fCeil;
            } else {
                fCeil = (float) Math.ceil(C4799a.m11020z(this.f25169m0, 24));
                if (drawable.getIntrinsicHeight() <= fCeil) {
                    intrinsicHeight = drawable.getIntrinsicHeight();
                } else {
                    intrinsicHeight = fCeil;
                }
            }
            float fExactCenterY = rect.exactCenterY() - (intrinsicHeight / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + intrinsicHeight;
        }
    }

    /* JADX INFO: renamed from: D */
    public float m11156D() {
        if (!m11195s0() && !m11194r0()) {
            return 0.0f;
        }
        return m11162J() + this.f25162f0 + this.f25163g0;
    }

    /* JADX INFO: renamed from: E */
    public final void m11157E(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m11196t0()) {
            float f = this.f25168l0 + this.f25167k0;
            if (C8162a.m16075t(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.f25153W;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.f25153W;
            }
            float fExactCenterY = rect.exactCenterY();
            float f4 = this.f25153W;
            float f5 = fExactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m11158F(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m11196t0()) {
            float f = this.f25168l0 + this.f25167k0 + this.f25153W + this.f25166j0 + this.f25165i0;
            if (C8162a.m16075t(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* JADX INFO: renamed from: G */
    public float m11159G() {
        if (m11196t0()) {
            return this.f25166j0 + this.f25153W + this.f25167k0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: H */
    public float m11160H() {
        return this.f25144N0 ? m11376l() : this.f25133I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public Drawable m11161I() {
        Drawable drawable = this.f25150T;
        if (drawable != 0) {
            return drawable instanceof WrappedDrawable ? ((WrappedDrawable) drawable).mo16197b() : drawable;
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final float m11162J() {
        Drawable drawable = this.f25182z0 ? this.f25157a0 : this.f25145O;
        float f = this.f25147Q;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    /* JADX INFO: renamed from: M */
    public void m11163M() {
        a aVar = this.f25136J0.get();
        if (aVar != null) {
            aVar.mo11198a();
        }
    }

    /* JADX INFO: renamed from: N */
    public final boolean m11164N(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f25127F;
        int iM11369e = m11369e(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f25176t0) : 0);
        boolean state = true;
        if (this.f25176t0 != iM11369e) {
            this.f25176t0 = iM11369e;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f25129G;
        int iM11369e2 = m11369e(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f25177u0) : 0);
        if (this.f25177u0 != iM11369e2) {
            this.f25177u0 = iM11369e2;
            zOnStateChange = true;
        }
        int iM16163b = ColorUtils.m16163b(iM11369e2, iM11369e);
        if ((this.f25178v0 != iM16163b) | (this.f25574h.f25597d == null)) {
            this.f25178v0 = iM16163b;
            m11381q(ColorStateList.valueOf(iM16163b));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f25135J;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f25179w0) : 0;
        if (this.f25179w0 != colorForState) {
            this.f25179w0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f25134I0 == null || !RippleUtils.m11361d(iArr)) ? 0 : this.f25134I0.getColorForState(iArr, this.f25180x0);
        if (this.f25180x0 != colorForState2) {
            this.f25180x0 = colorForState2;
            if (this.f25132H0) {
                zOnStateChange = true;
            }
        }
        TextAppearance textAppearance = this.f25175s0.f25503f;
        int colorForState3 = (textAppearance == null || (colorStateList = textAppearance.f25523a) == null) ? 0 : colorStateList.getColorForState(iArr, this.f25181y0);
        if (this.f25181y0 != colorForState3) {
            this.f25181y0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (state2[i] == 16842912) {
                    z = true;
                    break;
                }
                i++;
            }
        } else {
            z = false;
            break;
        }
        boolean z3 = z && this.f25155Y;
        if (this.f25182z0 == z3 || this.f25157a0 == null) {
            z2 = false;
        } else {
            float fM11156D = m11156D();
            this.f25182z0 = z3;
            if (fM11156D != m11156D()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                zOnStateChange = true;
                z2 = false;
            }
        }
        ColorStateList colorStateList5 = this.f25126E0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f25122A0) : 0;
        if (this.f25122A0 != colorForState4) {
            this.f25122A0 = colorForState4;
            this.f25125D0 = C4799a.m11013s0(this, this.f25126E0, this.f25128F0);
        } else {
            state = zOnStateChange;
        }
        if (m11153L(this.f25145O)) {
            state |= this.f25145O.setState(iArr);
        }
        if (m11153L(this.f25157a0)) {
            state |= this.f25157a0.setState(iArr);
        }
        if (m11153L(this.f25150T)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f25150T.setState(iArr3);
        }
        int[] iArr4 = RippleUtils.f25542a;
        if (m11153L(this.f25151U)) {
            state |= this.f25151U.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            m11163M();
        }
        return state;
    }

    /* JADX INFO: renamed from: O */
    public void m11165O(boolean z) {
        if (this.f25155Y != z) {
            this.f25155Y = z;
            float fM11156D = m11156D();
            if (!z && this.f25182z0) {
                this.f25182z0 = false;
            }
            float fM11156D2 = m11156D();
            invalidateSelf();
            if (fM11156D != fM11156D2) {
                m11163M();
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public void m11166P(Drawable drawable) {
        if (this.f25157a0 != drawable) {
            float fM11156D = m11156D();
            this.f25157a0 = drawable;
            float fM11156D2 = m11156D();
            m11197u0(this.f25157a0);
            m11154B(this.f25157a0);
            invalidateSelf();
            if (fM11156D != fM11156D2) {
                m11163M();
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m11167Q(ColorStateList colorStateList) {
        if (this.f25158b0 != colorStateList) {
            this.f25158b0 = colorStateList;
            if (this.f25156Z && this.f25157a0 != null && this.f25155Y) {
                this.f25157a0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: R */
    public void m11168R(boolean z) {
        if (this.f25156Z != z) {
            boolean zM11194r0 = m11194r0();
            this.f25156Z = z;
            boolean zM11194r1 = m11194r0();
            if (zM11194r0 != zM11194r1) {
                if (zM11194r1) {
                    m11154B(this.f25157a0);
                } else {
                    m11197u0(this.f25157a0);
                }
                invalidateSelf();
                m11163M();
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m11169S(ColorStateList colorStateList) {
        if (this.f25129G != colorStateList) {
            this.f25129G = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: T */
    public void m11170T(float f) {
        if (this.f25133I != f) {
            this.f25133I = f;
            this.f25574h.f25594a = this.f25574h.f25594a.m11396f(f);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: U */
    public void m11171U(float f) {
        if (this.f25168l0 != f) {
            this.f25168l0 = f;
            invalidateSelf();
            m11163M();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [c.n.b.e.m.b, c.n.b.e.y.g] */
    /* JADX INFO: renamed from: V */
    public void m11172V(Drawable drawable) {
        ?? Mo16197b;
        Object obj = this.f25145O;
        if (obj == null) {
            Mo16197b = 0;
        } else if (obj instanceof WrappedDrawable) {
            Mo16197b = obj;
            Mo16197b = ((WrappedDrawable) obj).mo16197b();
        }
        if (Mo16197b != drawable) {
            float fM11156D = m11156D();
            this.f25145O = drawable != null ? C8162a.m16054Y(drawable).mutate() : null;
            float fM11156D2 = m11156D();
            m11197u0(Mo16197b);
            if (m11195s0()) {
                m11154B(this.f25145O);
            }
            invalidateSelf();
            if (fM11156D != fM11156D2) {
                m11163M();
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public void m11173W(float f) {
        if (this.f25147Q != f) {
            float fM11156D = m11156D();
            this.f25147Q = f;
            float fM11156D2 = m11156D();
            invalidateSelf();
            if (fM11156D != fM11156D2) {
                m11163M();
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public void m11174X(ColorStateList colorStateList) {
        this.f25148R = true;
        if (this.f25146P != colorStateList) {
            this.f25146P = colorStateList;
            if (m11195s0()) {
                this.f25145O.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m11175Y(boolean z) {
        if (this.f25143N != z) {
            boolean zM11195s0 = m11195s0();
            this.f25143N = z;
            boolean zM11195s1 = m11195s0();
            if (zM11195s0 != zM11195s1) {
                if (zM11195s1) {
                    m11154B(this.f25145O);
                } else {
                    m11197u0(this.f25145O);
                }
                invalidateSelf();
                m11163M();
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m11176Z(float f) {
        if (this.f25131H != f) {
            this.f25131H = f;
            invalidateSelf();
            m11163M();
        }
    }

    @Override // p007c.p190n.p194b.p334e.p360t.TextDrawableHelper.b
    /* JADX INFO: renamed from: a */
    public void mo11091a() {
        m11163M();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: a0 */
    public void m11177a0(float f) {
        if (this.f25161e0 != f) {
            this.f25161e0 = f;
            invalidateSelf();
            m11163M();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m11178b0(ColorStateList colorStateList) {
        if (this.f25135J != colorStateList) {
            this.f25135J = colorStateList;
            if (this.f25144N0) {
                m11388x(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m11179c0(float f) {
        if (this.f25137K != f) {
            this.f25137K = f;
            this.f25170n0.setStrokeWidth(f);
            if (this.f25144N0) {
                this.f25574h.f25605l = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m11180d0(Drawable drawable) {
        Drawable drawableM11161I = m11161I();
        if (drawableM11161I != drawable) {
            float fM11159G = m11159G();
            this.f25150T = drawable != null ? C8162a.m16054Y(drawable).mutate() : null;
            int[] iArr = RippleUtils.f25542a;
            this.f25151U = new RippleDrawable(RippleUtils.m11360c(this.f25139L), this.f25150T, f25121E);
            float fM11159G2 = m11159G();
            m11197u0(drawableM11161I);
            if (m11196t0()) {
                m11154B(this.f25150T);
            }
            invalidateSelf();
            if (fM11159G != fM11159G2) {
                m11163M();
            }
        }
    }

    @Override // p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        int iSaveLayerAlpha;
        int i2;
        int i3;
        int i4;
        int i5;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f25123B0) == 0) {
            return;
        }
        if (i < 255) {
            float f = bounds.left;
            float f2 = bounds.top;
            float f3 = bounds.right;
            float f4 = bounds.bottom;
            iSaveLayerAlpha = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f, f2, f3, f4, i) : canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
        } else {
            iSaveLayerAlpha = 0;
        }
        if (!this.f25144N0) {
            this.f25170n0.setColor(this.f25176t0);
            this.f25170n0.setStyle(Paint.Style.FILL);
            this.f25172p0.set(bounds);
            canvas.drawRoundRect(this.f25172p0, m11160H(), m11160H(), this.f25170n0);
        }
        if (!this.f25144N0) {
            this.f25170n0.setColor(this.f25177u0);
            this.f25170n0.setStyle(Paint.Style.FILL);
            Paint paint = this.f25170n0;
            ColorFilter colorFilter = this.f25124C0;
            if (colorFilter == null) {
                colorFilter = this.f25125D0;
            }
            paint.setColorFilter(colorFilter);
            this.f25172p0.set(bounds);
            canvas.drawRoundRect(this.f25172p0, m11160H(), m11160H(), this.f25170n0);
        }
        if (this.f25144N0) {
            super.draw(canvas);
        }
        if (this.f25137K > 0.0f && !this.f25144N0) {
            this.f25170n0.setColor(this.f25179w0);
            this.f25170n0.setStyle(Paint.Style.STROKE);
            if (!this.f25144N0) {
                Paint paint2 = this.f25170n0;
                ColorFilter colorFilter2 = this.f25124C0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f25125D0;
                }
                paint2.setColorFilter(colorFilter2);
            }
            RectF rectF = this.f25172p0;
            float f5 = bounds.left;
            float f6 = this.f25137K / 2.0f;
            rectF.set(f5 + f6, bounds.top + f6, bounds.right - f6, bounds.bottom - f6);
            float f7 = this.f25133I - (this.f25137K / 2.0f);
            canvas.drawRoundRect(this.f25172p0, f7, f7, this.f25170n0);
        }
        this.f25170n0.setColor(this.f25180x0);
        this.f25170n0.setStyle(Paint.Style.FILL);
        this.f25172p0.set(bounds);
        if (this.f25144N0) {
            m11367c(new RectF(bounds), this.f25174r0);
            i2 = 0;
            m11371g(canvas, this.f25170n0, this.f25174r0, this.f25574h.f25594a, m11372h());
        } else {
            canvas.drawRoundRect(this.f25172p0, m11160H(), m11160H(), this.f25170n0);
            i2 = 0;
        }
        if (m11195s0()) {
            m11155C(bounds, this.f25172p0);
            RectF rectF2 = this.f25172p0;
            float f8 = rectF2.left;
            float f9 = rectF2.top;
            canvas.translate(f8, f9);
            this.f25145O.setBounds(i2, i2, (int) this.f25172p0.width(), (int) this.f25172p0.height());
            this.f25145O.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (m11194r0()) {
            m11155C(bounds, this.f25172p0);
            RectF rectF3 = this.f25172p0;
            float f10 = rectF3.left;
            float f11 = rectF3.top;
            canvas.translate(f10, f11);
            this.f25157a0.setBounds(i2, i2, (int) this.f25172p0.width(), (int) this.f25172p0.height());
            this.f25157a0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
        if (!this.f25140L0 || this.f25141M == null) {
            i3 = iSaveLayerAlpha;
            i4 = 255;
            i5 = 0;
        } else {
            PointF pointF = this.f25173q0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.f25141M != null) {
                float fM11156D = m11156D() + this.f25161e0 + this.f25164h0;
                if (C8162a.m16075t(this) == 0) {
                    pointF.x = bounds.left + fM11156D;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - fM11156D;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                this.f25175s0.f25498a.getFontMetrics(this.f25171o0);
                Paint.FontMetrics fontMetrics = this.f25171o0;
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            RectF rectF4 = this.f25172p0;
            rectF4.setEmpty();
            if (this.f25141M != null) {
                float fM11156D2 = m11156D() + this.f25161e0 + this.f25164h0;
                float fM11159G = m11159G() + this.f25168l0 + this.f25165i0;
                if (C8162a.m16075t(this) == 0) {
                    rectF4.left = bounds.left + fM11156D2;
                    rectF4.right = bounds.right - fM11159G;
                } else {
                    rectF4.left = bounds.left + fM11159G;
                    rectF4.right = bounds.right - fM11156D2;
                }
                rectF4.top = bounds.top;
                rectF4.bottom = bounds.bottom;
            }
            TextDrawableHelper textDrawableHelper = this.f25175s0;
            if (textDrawableHelper.f25503f != null) {
                textDrawableHelper.f25498a.drawableState = getState();
                TextDrawableHelper textDrawableHelper2 = this.f25175s0;
                textDrawableHelper2.f25503f.m11354c(this.f25169m0, textDrawableHelper2.f25498a, textDrawableHelper2.f25499b);
            }
            this.f25175s0.f25498a.setTextAlign(align);
            boolean z = Math.round(this.f25175s0.m11336a(this.f25141M.toString())) > Math.round(this.f25172p0.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.f25172p0);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.f25141M;
            if (z && this.f25138K0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f25175s0.f25498a, this.f25172p0.width(), this.f25138K0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF2 = this.f25173q0;
            i5 = 0;
            i4 = 255;
            i3 = iSaveLayerAlpha;
            canvas.drawText(charSequence, 0, length, pointF2.x, pointF2.y, this.f25175s0.f25498a);
            if (z) {
                canvas.restoreToCount(iSave);
            }
        }
        if (m11196t0()) {
            m11157E(bounds, this.f25172p0);
            RectF rectF5 = this.f25172p0;
            float f12 = rectF5.left;
            float f13 = rectF5.top;
            canvas.translate(f12, f13);
            this.f25150T.setBounds(i5, i5, (int) this.f25172p0.width(), (int) this.f25172p0.height());
            int[] iArr = RippleUtils.f25542a;
            this.f25151U.setBounds(this.f25150T.getBounds());
            this.f25151U.jumpToCurrentState();
            this.f25151U.draw(canvas);
            canvas.translate(-f12, -f13);
        }
        if (this.f25123B0 < i4) {
            canvas.restoreToCount(i3);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m11181e0(float f) {
        if (this.f25167k0 != f) {
            this.f25167k0 = f;
            invalidateSelf();
            if (m11196t0()) {
                m11163M();
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m11182f0(float f) {
        if (this.f25153W != f) {
            this.f25153W = f;
            invalidateSelf();
            if (m11196t0()) {
                m11163M();
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m11183g0(float f) {
        if (this.f25166j0 != f) {
            this.f25166j0 = f;
            invalidateSelf();
            if (m11196t0()) {
                m11163M();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f25123B0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f25124C0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f25131H;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(m11159G() + this.f25175s0.m11336a(this.f25141M.toString()) + m11156D() + this.f25161e0 + this.f25164h0 + this.f25165i0 + this.f25168l0), this.f25142M0);
    }

    @Override // p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f25144N0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f25131H, this.f25133I);
        } else {
            outline.setRoundRect(bounds, this.f25133I);
        }
        outline.setAlpha(this.f25123B0 / 255.0f);
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m11184h0(int[] iArr) {
        if (Arrays.equals(this.f25130G0, iArr)) {
            return false;
        }
        this.f25130G0 = iArr;
        if (m11196t0()) {
            return m11164N(getState(), iArr);
        }
        return false;
    }

    /* JADX INFO: renamed from: i0 */
    public void m11185i0(ColorStateList colorStateList) {
        if (this.f25152V != colorStateList) {
            this.f25152V = colorStateList;
            if (m11196t0()) {
                this.f25150T.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        if (m11152K(this.f25127F) || m11152K(this.f25129G) || m11152K(this.f25135J)) {
            return true;
        }
        if (this.f25132H0 && m11152K(this.f25134I0)) {
            return true;
        }
        TextAppearance textAppearance = this.f25175s0.f25503f;
        if ((textAppearance == null || (colorStateList = textAppearance.f25523a) == null || !colorStateList.isStateful()) ? false : true) {
            return true;
        }
        return (this.f25156Z && this.f25157a0 != null && this.f25155Y) || m11153L(this.f25145O) || m11153L(this.f25157a0) || m11152K(this.f25126E0);
    }

    /* JADX INFO: renamed from: j0 */
    public void m11186j0(boolean z) {
        if (this.f25149S != z) {
            boolean zM11196t0 = m11196t0();
            this.f25149S = z;
            boolean zM11196t1 = m11196t0();
            if (zM11196t0 != zM11196t1) {
                if (zM11196t1) {
                    m11154B(this.f25150T);
                } else {
                    m11197u0(this.f25150T);
                }
                invalidateSelf();
                m11163M();
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m11187k0(float f) {
        if (this.f25163g0 != f) {
            float fM11156D = m11156D();
            this.f25163g0 = f;
            float fM11156D2 = m11156D();
            invalidateSelf();
            if (fM11156D != fM11156D2) {
                m11163M();
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m11188l0(float f) {
        if (this.f25162f0 != f) {
            float fM11156D = m11156D();
            this.f25162f0 = f;
            float fM11156D2 = m11156D();
            invalidateSelf();
            if (fM11156D != fM11156D2) {
                m11163M();
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m11189m0(ColorStateList colorStateList) {
        if (this.f25139L != colorStateList) {
            this.f25139L = colorStateList;
            this.f25134I0 = this.f25132H0 ? RippleUtils.m11360c(colorStateList) : null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m11190n0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f25141M, charSequence)) {
            return;
        }
        this.f25141M = charSequence;
        this.f25175s0.f25501d = true;
        invalidateSelf();
        m11163M();
    }

    /* JADX INFO: renamed from: o0 */
    public void m11191o0(float f) {
        if (this.f25165i0 != f) {
            this.f25165i0 = f;
            invalidateSelf();
            m11163M();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m11195s0()) {
            zOnLayoutDirectionChanged |= C8162a.m16043N(this.f25145O, i);
        }
        if (m11194r0()) {
            zOnLayoutDirectionChanged |= C8162a.m16043N(this.f25157a0, i);
        }
        if (m11196t0()) {
            zOnLayoutDirectionChanged |= C8162a.m16043N(this.f25150T, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (m11195s0()) {
            zOnLevelChange |= this.f25145O.setLevel(i);
        }
        if (m11194r0()) {
            zOnLevelChange |= this.f25157a0.setLevel(i);
        }
        if (m11196t0()) {
            zOnLevelChange |= this.f25150T.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable, android.graphics.drawable.Drawable, p007c.p190n.p194b.p334e.p360t.TextDrawableHelper.b
    public boolean onStateChange(int[] iArr) {
        if (this.f25144N0) {
            super.onStateChange(iArr);
        }
        return m11164N(iArr, this.f25130G0);
    }

    /* JADX INFO: renamed from: p0 */
    public void m11192p0(float f) {
        if (this.f25164h0 != f) {
            this.f25164h0 = f;
            invalidateSelf();
            m11163M();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m11193q0(boolean z) {
        if (this.f25132H0 != z) {
            this.f25132H0 = z;
            this.f25134I0 = z ? RippleUtils.m11360c(this.f25139L) : null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m11194r0() {
        return this.f25156Z && this.f25157a0 != null && this.f25182z0;
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m11195s0() {
        return this.f25143N && this.f25145O != null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f25123B0 != i) {
            this.f25123B0 = i;
            invalidateSelf();
        }
    }

    @Override // p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f25124C0 != colorFilter) {
            this.f25124C0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f25126E0 != colorStateList) {
            this.f25126E0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f25128F0 != mode) {
            this.f25128F0 = mode;
            this.f25125D0 = C4799a.m11013s0(this, this.f25126E0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m11195s0()) {
            visible |= this.f25145O.setVisible(z, z2);
        }
        if (m11194r0()) {
            visible |= this.f25157a0.setVisible(z, z2);
        }
        if (m11196t0()) {
            visible |= this.f25150T.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m11196t0() {
        return this.f25149S && this.f25150T != null;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m11197u0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
