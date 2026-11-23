package p007c.p190n.p194b.p334e.p342e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.p360t.TextDrawableHelper;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p007c.p190n.p194b.p334e.p362v.TextAppearance;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: c.n.b.e.e.a, reason: use source file name */
/* JADX INFO: compiled from: BadgeDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class BadgeDrawable extends Drawable implements TextDrawableHelper.b {

    /* JADX INFO: renamed from: f */
    public final WeakReference<Context> f24944f;

    /* JADX INFO: renamed from: g */
    public final MaterialShapeDrawable f24945g;

    /* JADX INFO: renamed from: h */
    public final TextDrawableHelper f24946h;

    /* JADX INFO: renamed from: i */
    public final Rect f24947i;

    /* JADX INFO: renamed from: j */
    public final float f24948j;

    /* JADX INFO: renamed from: k */
    public final float f24949k;

    /* JADX INFO: renamed from: l */
    public final float f24950l;

    /* JADX INFO: renamed from: m */
    public final a f24951m;

    /* JADX INFO: renamed from: n */
    public float f24952n;

    /* JADX INFO: renamed from: o */
    public float f24953o;

    /* JADX INFO: renamed from: p */
    public int f24954p;

    /* JADX INFO: renamed from: q */
    public float f24955q;

    /* JADX INFO: renamed from: r */
    public float f24956r;

    /* JADX INFO: renamed from: s */
    public float f24957s;

    /* JADX INFO: renamed from: t */
    public WeakReference<View> f24958t;

    /* JADX INFO: renamed from: u */
    public WeakReference<FrameLayout> f24959u;

    public BadgeDrawable(Context context) {
        TextAppearance textAppearance;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f24944f = weakReference;
        ThemeEnforcement.m11346c(context, ThemeEnforcement.f25507b, "Theme.MaterialComponents");
        Resources resources = context.getResources();
        this.f24947i = new Rect();
        this.f24945g = new MaterialShapeDrawable();
        this.f24948j = resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius);
        this.f24950l = resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.f24949k = resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius);
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.f24946h = textDrawableHelper;
        textDrawableHelper.f25498a.setTextAlign(Paint.Align.CENTER);
        this.f24951m = new a(context);
        Context context3 = weakReference.get();
        if (context3 == null || textDrawableHelper.f25503f == (textAppearance = new TextAppearance(context3, 2132017607)) || (context2 = weakReference.get()) == null) {
            return;
        }
        textDrawableHelper.m11337b(textAppearance, context2);
        m11103m();
    }

    @Override // p007c.p190n.p194b.p334e.p360t.TextDrawableHelper.b
    /* JADX INFO: renamed from: a */
    public void mo11091a() {
        invalidateSelf();
    }

    /* JADX INFO: renamed from: b */
    public final String m11092b() {
        if (m11095e() <= this.f24954p) {
            return NumberFormat.getInstance().format(m11095e());
        }
        Context context = this.f24944f.get();
        return context == null ? "" : context.getString(R.string.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.f24954p), "+");
    }

    /* JADX INFO: renamed from: c */
    public CharSequence m11093c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!m11096f()) {
            return this.f24951m.f24965k;
        }
        if (this.f24951m.f24966l <= 0 || (context = this.f24944f.get()) == null) {
            return null;
        }
        int iM11095e = m11095e();
        int i = this.f24954p;
        return iM11095e <= i ? context.getResources().getQuantityString(this.f24951m.f24966l, m11095e(), Integer.valueOf(m11095e())) : context.getString(this.f24951m.f24967m, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: d */
    public FrameLayout m11094d() {
        WeakReference<FrameLayout> weakReference = this.f24959u;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || this.f24951m.f24962h == 0 || !isVisible()) {
            return;
        }
        this.f24945g.draw(canvas);
        if (m11096f()) {
            Rect rect = new Rect();
            String strM11092b = m11092b();
            this.f24946h.f25498a.getTextBounds(strM11092b, 0, strM11092b.length(), rect);
            canvas.drawText(strM11092b, this.f24952n, this.f24953o + (rect.height() / 2), this.f24946h.f25498a);
        }
    }

    /* JADX INFO: renamed from: e */
    public int m11095e() {
        if (m11096f()) {
            return this.f24951m.f24963i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public boolean m11096f() {
        return this.f24951m.f24963i != -1;
    }

    /* JADX INFO: renamed from: g */
    public void m11097g(int i) {
        this.f24951m.f24960f = i;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        MaterialShapeDrawable materialShapeDrawable = this.f24945g;
        if (materialShapeDrawable.f25574h.f25597d != colorStateListValueOf) {
            materialShapeDrawable.m11381q(colorStateListValueOf);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f24951m.f24962h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f24947i.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f24947i.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public void m11098h(int i) {
        a aVar = this.f24951m;
        if (aVar.f24968n != i) {
            aVar.f24968n = i;
            WeakReference<View> weakReference = this.f24958t;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.f24958t.get();
            WeakReference<FrameLayout> weakReference2 = this.f24959u;
            m11102l(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m11099i(int i) {
        this.f24951m.f24961g = i;
        if (this.f24946h.f25498a.getColor() != i) {
            this.f24946h.f25498a.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m11100j(int i) {
        a aVar = this.f24951m;
        if (aVar.f24964j != i) {
            aVar.f24964j = i;
            this.f24954p = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
            this.f24946h.f25501d = true;
            m11103m();
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m11101k(int i) {
        int iMax = Math.max(0, i);
        a aVar = this.f24951m;
        if (aVar.f24963i != iMax) {
            aVar.f24963i = iMax;
            this.f24946h.f25501d = true;
            m11103m();
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m11102l(View view, FrameLayout frameLayout) {
        this.f24958t = new WeakReference<>(view);
        this.f24959u = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        m11103m();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: m */
    public final void m11103m() {
        Context context = this.f24944f.get();
        WeakReference<View> weakReference = this.f24958t;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f24947i);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.f24959u;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        a aVar = this.f24951m;
        int i = aVar.f24968n;
        if (i == 8388691 || i == 8388693) {
            this.f24953o = rect2.bottom - aVar.f24971q;
        } else {
            this.f24953o = rect2.top + aVar.f24971q;
        }
        if (m11095e() <= 9) {
            float f = !m11096f() ? this.f24948j : this.f24949k;
            this.f24955q = f;
            this.f24957s = f;
            this.f24956r = f;
        } else {
            float f2 = this.f24949k;
            this.f24955q = f2;
            this.f24957s = f2;
            this.f24956r = (this.f24946h.m11336a(m11092b()) / 2.0f) + this.f24950l;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(m11096f() ? R.dimen.mtrl_badge_text_horizontal_edge_offset : R.dimen.mtrl_badge_horizontal_edge_offset);
        int i2 = this.f24951m.f24968n;
        if (i2 == 8388659 || i2 == 8388691) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            this.f24952n = view.getLayoutDirection() == 0 ? (rect2.left - this.f24956r) + dimensionPixelSize + this.f24951m.f24970p : ((rect2.right + this.f24956r) - dimensionPixelSize) - this.f24951m.f24970p;
        } else {
            AtomicInteger atomicInteger2 = ViewCompat.f38073a;
            this.f24952n = view.getLayoutDirection() == 0 ? ((rect2.right + this.f24956r) - dimensionPixelSize) - this.f24951m.f24970p : (rect2.left - this.f24956r) + dimensionPixelSize + this.f24951m.f24970p;
        }
        Rect rect3 = this.f24947i;
        float f3 = this.f24952n;
        float f4 = this.f24953o;
        float f5 = this.f24956r;
        float f6 = this.f24957s;
        rect3.set((int) (f3 - f5), (int) (f4 - f6), (int) (f3 + f5), (int) (f4 + f6));
        MaterialShapeDrawable materialShapeDrawable = this.f24945g;
        materialShapeDrawable.f25574h.f25594a = materialShapeDrawable.f25574h.f25594a.m11396f(this.f24955q);
        materialShapeDrawable.invalidateSelf();
        if (rect.equals(this.f24947i)) {
            return;
        }
        this.f24945g.setBounds(this.f24947i);
    }

    @Override // android.graphics.drawable.Drawable, p007c.p190n.p194b.p334e.p360t.TextDrawableHelper.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f24951m.f24962h = i;
        this.f24946h.f25498a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX INFO: renamed from: c.n.b.e.e.a$a */
    /* JADX INFO: compiled from: BadgeDrawable.java */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C8518a();

        /* JADX INFO: renamed from: f */
        public int f24960f;

        /* JADX INFO: renamed from: g */
        public int f24961g;

        /* JADX INFO: renamed from: h */
        public int f24962h;

        /* JADX INFO: renamed from: i */
        public int f24963i;

        /* JADX INFO: renamed from: j */
        public int f24964j;

        /* JADX INFO: renamed from: k */
        public CharSequence f24965k;

        /* JADX INFO: renamed from: l */
        public int f24966l;

        /* JADX INFO: renamed from: m */
        public int f24967m;

        /* JADX INFO: renamed from: n */
        public int f24968n;

        /* JADX INFO: renamed from: o */
        public boolean f24969o;

        /* JADX INFO: renamed from: p */
        public int f24970p;

        /* JADX INFO: renamed from: q */
        public int f24971q;

        /* JADX INFO: renamed from: c.n.b.e.e.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BadgeDrawable.java */
        public static class C8518a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(Context context) {
            this.f24962h = 255;
            this.f24963i = -1;
            this.f24961g = new TextAppearance(context, 2132017607).f25523a.getDefaultColor();
            this.f24965k = context.getString(R.string.mtrl_badge_numberless_content_description);
            this.f24966l = R.plurals.mtrl_badge_content_description;
            this.f24967m = R.string.mtrl_exceed_max_badge_number_content_description;
            this.f24969o = true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f24960f);
            parcel.writeInt(this.f24961g);
            parcel.writeInt(this.f24962h);
            parcel.writeInt(this.f24963i);
            parcel.writeInt(this.f24964j);
            parcel.writeString(this.f24965k.toString());
            parcel.writeInt(this.f24966l);
            parcel.writeInt(this.f24968n);
            parcel.writeInt(this.f24970p);
            parcel.writeInt(this.f24971q);
            parcel.writeInt(this.f24969o ? 1 : 0);
        }

        public a(Parcel parcel) {
            this.f24962h = 255;
            this.f24963i = -1;
            this.f24960f = parcel.readInt();
            this.f24961g = parcel.readInt();
            this.f24962h = parcel.readInt();
            this.f24963i = parcel.readInt();
            this.f24964j = parcel.readInt();
            this.f24965k = parcel.readString();
            this.f24966l = parcel.readInt();
            this.f24968n = parcel.readInt();
            this.f24970p = parcel.readInt();
            this.f24971q = parcel.readInt();
            this.f24969o = parcel.readInt() != 0;
        }
    }
}
