package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p636z0.p686f.C7945b;
import p636z0.p686f.p687c.CardViewApi21Impl;
import p636z0.p686f.p687c.CardViewDelegate;
import p636z0.p686f.p687c.CardViewImpl;
import p636z0.p686f.p687c.RoundRectDrawable;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final int[] f509f = {R.attr.colorBackground};

    /* JADX INFO: renamed from: g */
    public static final CardViewImpl f510g = new CardViewApi21Impl();

    /* JADX INFO: renamed from: h */
    public boolean f511h;

    /* JADX INFO: renamed from: i */
    public boolean f512i;

    /* JADX INFO: renamed from: j */
    public int f513j;

    /* JADX INFO: renamed from: k */
    public int f514k;

    /* JADX INFO: renamed from: l */
    public final Rect f515l;

    /* JADX INFO: renamed from: m */
    public final Rect f516m;

    /* JADX INFO: renamed from: n */
    public final CardViewDelegate f517n;

    /* JADX INFO: renamed from: androidx.cardview.widget.CardView$a */
    public class C0093a implements CardViewDelegate {

        /* JADX INFO: renamed from: a */
        public Drawable f518a;

        public C0093a() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m271a() {
            return CardView.this.getPreventCornerOverlap();
        }

        /* JADX INFO: renamed from: b */
        public void m272b(int i, int i2, int i3, int i4) {
            CardView.this.f516m.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f515l;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((RoundRectDrawable) ((C0093a) this.f517n).f518a).f36519h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f515l.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f515l.left;
    }

    public int getContentPaddingRight() {
        return this.f515l.right;
    }

    public int getContentPaddingTop() {
        return this.f515l.top;
    }

    public float getMaxCardElevation() {
        return ((RoundRectDrawable) ((C0093a) this.f517n).f518a).f36516e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f512i;
    }

    public float getRadius() {
        return ((RoundRectDrawable) ((C0093a) this.f517n).f518a).f36512a;
    }

    public boolean getUseCompatPadding() {
        return this.f511h;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        CardViewDelegate cardViewDelegate = this.f517n;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) ((C0093a) cardViewDelegate).f518a;
        roundRectDrawable.m15545b(colorStateListValueOf);
        roundRectDrawable.invalidateSelf();
    }

    public void setCardElevation(float f) {
        CardView.this.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        ((CardViewApi21Impl) f510g).m15542b(this.f517n, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f514k = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f513j = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f512i) {
            this.f512i = z;
            CardViewImpl cardViewImpl = f510g;
            CardViewDelegate cardViewDelegate = this.f517n;
            CardViewApi21Impl cardViewApi21Impl = (CardViewApi21Impl) cardViewImpl;
            cardViewApi21Impl.m15542b(cardViewDelegate, cardViewApi21Impl.m15541a(cardViewDelegate).f36516e);
        }
    }

    public void setRadius(float f) {
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) ((C0093a) this.f517n).f518a;
        if (f == roundRectDrawable.f36512a) {
            return;
        }
        roundRectDrawable.f36512a = f;
        roundRectDrawable.m15546c(null);
        roundRectDrawable.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f511h != z) {
            this.f511h = z;
            CardViewImpl cardViewImpl = f510g;
            CardViewDelegate cardViewDelegate = this.f517n;
            CardViewApi21Impl cardViewApi21Impl = (CardViewApi21Impl) cardViewImpl;
            cardViewApi21Impl.m15542b(cardViewDelegate, cardViewApi21Impl.m15541a(cardViewDelegate).f36516e);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, mtp.media.karaoke.R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.f515l = rect;
        this.f516m = new Rect();
        C0093a c0093a = new C0093a();
        this.f517n = c0093a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7945b.f36511a, i, mtp.media.karaoke.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f509f);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(mtp.media.karaoke.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(mtp.media.karaoke.R.color.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f511h = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f512i = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f513j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f514k = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        CardViewApi21Impl cardViewApi21Impl = (CardViewApi21Impl) f510g;
        RoundRectDrawable roundRectDrawable = new RoundRectDrawable(colorStateListValueOf, dimension);
        C0093a c0093a2 = c0093a;
        c0093a2.f518a = roundRectDrawable;
        CardView.this.setBackgroundDrawable(roundRectDrawable);
        CardView cardView = CardView.this;
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        cardViewApi21Impl.m15542b(c0093a, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) ((C0093a) this.f517n).f518a;
        roundRectDrawable.m15545b(colorStateList);
        roundRectDrawable.invalidateSelf();
    }
}
