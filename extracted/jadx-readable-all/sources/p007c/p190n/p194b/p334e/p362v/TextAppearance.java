package p007c.p190n.p194b.p334e.p362v;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p636z0.p725k.p727d.p728c.ResourcesCompat;

/* JADX INFO: renamed from: c.n.b.e.v.c, reason: use source file name */
/* JADX INFO: compiled from: TextAppearance.java */
/* JADX INFO: loaded from: classes.dex */
public class TextAppearance {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f25523a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f25524b;

    /* JADX INFO: renamed from: c */
    public final String f25525c;

    /* JADX INFO: renamed from: d */
    public final int f25526d;

    /* JADX INFO: renamed from: e */
    public final int f25527e;

    /* JADX INFO: renamed from: f */
    public final float f25528f;

    /* JADX INFO: renamed from: g */
    public final float f25529g;

    /* JADX INFO: renamed from: h */
    public final float f25530h;

    /* JADX INFO: renamed from: i */
    public final boolean f25531i;

    /* JADX INFO: renamed from: j */
    public final float f25532j;

    /* JADX INFO: renamed from: k */
    public float f25533k;

    /* JADX INFO: renamed from: l */
    public final int f25534l;

    /* JADX INFO: renamed from: m */
    public boolean f25535m = false;

    /* JADX INFO: renamed from: n */
    public Typeface f25536n;

    /* JADX INFO: renamed from: c.n.b.e.v.c$a */
    /* JADX INFO: compiled from: TextAppearance.java */
    public class a extends ResourcesCompat.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextAppearanceFontCallback f25537a;

        public a(TextAppearanceFontCallback textAppearanceFontCallback) {
            this.f25537a = textAppearanceFontCallback;
        }

        @Override // p636z0.p725k.p727d.p728c.ResourcesCompat.c
        /* JADX INFO: renamed from: d */
        public void mo11356d(int i) {
            TextAppearance.this.f25535m = true;
            this.f25537a.mo11338a(i);
        }

        @Override // p636z0.p725k.p727d.p728c.ResourcesCompat.c
        /* JADX INFO: renamed from: e */
        public void mo11357e(Typeface typeface) {
            TextAppearance textAppearance = TextAppearance.this;
            textAppearance.f25536n = Typeface.create(typeface, textAppearance.f25526d);
            TextAppearance textAppearance2 = TextAppearance.this;
            textAppearance2.f25535m = true;
            this.f25537a.mo11339b(textAppearance2.f25536n, false);
        }
    }

    public TextAppearance(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C4801b.f24742N);
        this.f25533k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f25523a = C4799a.m10961L(context, typedArrayObtainStyledAttributes, 3);
        C4799a.m10961L(context, typedArrayObtainStyledAttributes, 4);
        C4799a.m10961L(context, typedArrayObtainStyledAttributes, 5);
        this.f25526d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f25527e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f25534l = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f25525c = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f25524b = C4799a.m10961L(context, typedArrayObtainStyledAttributes, 6);
        this.f25528f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f25529g = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f25530h = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, C4801b.f24733E);
        this.f25531i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f25532j = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m11352a() {
        String str;
        if (this.f25536n == null && (str = this.f25525c) != null) {
            this.f25536n = Typeface.create(str, this.f25526d);
        }
        if (this.f25536n == null) {
            int i = this.f25527e;
            if (i == 1) {
                this.f25536n = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f25536n = Typeface.SERIF;
            } else if (i != 3) {
                this.f25536n = Typeface.DEFAULT;
            } else {
                this.f25536n = Typeface.MONOSPACE;
            }
            this.f25536n = Typeface.create(this.f25536n, this.f25526d);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m11353b(Context context, TextAppearanceFontCallback textAppearanceFontCallback) {
        m11352a();
        int i = this.f25534l;
        if (i == 0) {
            this.f25535m = true;
        }
        if (this.f25535m) {
            textAppearanceFontCallback.mo11339b(this.f25536n, true);
            return;
        }
        try {
            a aVar = new a(textAppearanceFontCallback);
            ThreadLocal<TypedValue> threadLocal = ResourcesCompat.f37835a;
            if (context.isRestricted()) {
                aVar.m16160a(-4, null);
            } else {
                ResourcesCompat.m16158a(context, i, new TypedValue(), 0, aVar, null, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f25535m = true;
            textAppearanceFontCallback.mo11338a(1);
        } catch (Exception e) {
            StringBuilder sbM1556G = outline.m1556G("Error loading font ");
            sbM1556G.append(this.f25525c);
            Log.d("TextAppearance", sbM1556G.toString(), e);
            this.f25535m = true;
            textAppearanceFontCallback.mo11338a(-3);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m11354c(Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
        m11352a();
        m11355d(textPaint, this.f25536n);
        m11353b(context, new TextAppearance2(this, textPaint, textAppearanceFontCallback));
        ColorStateList colorStateList = this.f25523a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f25530h;
        float f2 = this.f25528f;
        float f3 = this.f25529g;
        ColorStateList colorStateList2 = this.f25524b;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: d */
    public void m11355d(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f25526d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f25533k);
        if (this.f25531i) {
            textPaint.setLetterSpacing(this.f25532j);
        }
    }
}
