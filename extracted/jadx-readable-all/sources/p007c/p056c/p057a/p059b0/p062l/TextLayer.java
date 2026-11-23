package p007c.p056c.p057a.p059b0.p062l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p007c.p056c.p057a.LottieComposition;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.LottieProperty;
import p007c.p056c.p057a.TextDelegate;
import p007c.p056c.p057a.p058a0.FontAssetManager;
import p007c.p056c.p057a.p059b0.DocumentData;
import p007c.p056c.p057a.p059b0.Font;
import p007c.p056c.p057a.p059b0.FontCharacter;
import p007c.p056c.p057a.p059b0.MutablePair;
import p007c.p056c.p057a.p059b0.p060j.AnimatableColorValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableFloatValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableTextProperties;
import p007c.p056c.p057a.p059b0.p061k.ShapeGroup;
import p007c.p056c.p057a.p066e0.Utils;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p056c.p057a.p068z.p069b.ContentGroup;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.TextKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.ValueCallbackKeyframeAnimation;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p691g.LongSparseArray;

/* JADX INFO: renamed from: c.c.a.b0.l.i, reason: use source file name */
/* JADX INFO: compiled from: TextLayer.java */
/* JADX INFO: loaded from: classes.dex */
public class TextLayer extends BaseLayer2 {

    /* JADX INFO: renamed from: A */
    public final Paint f2212A;

    /* JADX INFO: renamed from: B */
    public final Paint f2213B;

    /* JADX INFO: renamed from: C */
    public final Map<FontCharacter, List<ContentGroup>> f2214C;

    /* JADX INFO: renamed from: D */
    public final LongSparseArray<String> f2215D;

    /* JADX INFO: renamed from: E */
    public final TextKeyframeAnimation f2216E;

    /* JADX INFO: renamed from: F */
    public final LottieDrawable f2217F;

    /* JADX INFO: renamed from: G */
    public final LottieComposition f2218G;

    /* JADX INFO: renamed from: H */
    public BaseKeyframeAnimation<Integer, Integer> f2219H;

    /* JADX INFO: renamed from: I */
    public BaseKeyframeAnimation<Integer, Integer> f2220I;

    /* JADX INFO: renamed from: J */
    public BaseKeyframeAnimation<Integer, Integer> f2221J;

    /* JADX INFO: renamed from: K */
    public BaseKeyframeAnimation<Integer, Integer> f2222K;

    /* JADX INFO: renamed from: L */
    public BaseKeyframeAnimation<Float, Float> f2223L;

    /* JADX INFO: renamed from: M */
    public BaseKeyframeAnimation<Float, Float> f2224M;

    /* JADX INFO: renamed from: N */
    public BaseKeyframeAnimation<Float, Float> f2225N;

    /* JADX INFO: renamed from: O */
    public BaseKeyframeAnimation<Float, Float> f2226O;

    /* JADX INFO: renamed from: P */
    public BaseKeyframeAnimation<Float, Float> f2227P;

    /* JADX INFO: renamed from: x */
    public final StringBuilder f2228x;

    /* JADX INFO: renamed from: y */
    public final RectF f2229y;

    /* JADX INFO: renamed from: z */
    public final Matrix f2230z;

    /* JADX INFO: renamed from: c.c.a.b0.l.i$a */
    /* JADX INFO: compiled from: TextLayer.java */
    public class a extends Paint {
        public a(TextLayer textLayer, int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* JADX INFO: renamed from: c.c.a.b0.l.i$b */
    /* JADX INFO: compiled from: TextLayer.java */
    public class b extends Paint {
        public b(TextLayer textLayer, int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    public TextLayer(LottieDrawable lottieDrawable, Layer layer) {
        AnimatableFloatValue animatableFloatValue;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableColorValue animatableColorValue;
        AnimatableColorValue animatableColorValue2;
        super(lottieDrawable, layer);
        this.f2228x = new StringBuilder(2);
        this.f2229y = new RectF();
        this.f2230z = new Matrix();
        this.f2212A = new a(this, 1);
        this.f2213B = new b(this, 1);
        this.f2214C = new HashMap();
        this.f2215D = new LongSparseArray<>();
        this.f2217F = lottieDrawable;
        this.f2218G = layer.f2169b;
        TextKeyframeAnimation textKeyframeAnimation = new TextKeyframeAnimation(layer.f2184q.f2018a);
        this.f2216E = textKeyframeAnimation;
        textKeyframeAnimation.f2629a.add(this);
        m1348e(textKeyframeAnimation);
        AnimatableTextProperties animatableTextProperties = layer.f2185r;
        if (animatableTextProperties != null && (animatableColorValue2 = animatableTextProperties.f2005a) != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationMo1339a = animatableColorValue2.mo1339a();
            this.f2219H = baseKeyframeAnimationMo1339a;
            baseKeyframeAnimationMo1339a.f2629a.add(this);
            m1348e(this.f2219H);
        }
        if (animatableTextProperties != null && (animatableColorValue = animatableTextProperties.f2006b) != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationMo1339a2 = animatableColorValue.mo1339a();
            this.f2221J = baseKeyframeAnimationMo1339a2;
            baseKeyframeAnimationMo1339a2.f2629a.add(this);
            m1348e(this.f2221J);
        }
        if (animatableTextProperties != null && (animatableFloatValue2 = animatableTextProperties.f2007c) != null) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationMo1339a3 = animatableFloatValue2.mo1339a();
            this.f2223L = baseKeyframeAnimationMo1339a3;
            baseKeyframeAnimationMo1339a3.f2629a.add(this);
            m1348e(this.f2223L);
        }
        if (animatableTextProperties == null || (animatableFloatValue = animatableTextProperties.f2008d) == null) {
            return;
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationMo1339a4 = animatableFloatValue.mo1339a();
        this.f2225N = baseKeyframeAnimationMo1339a4;
        baseKeyframeAnimationMo1339a4.f2629a.add(this);
        m1348e(this.f2225N);
    }

    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2, p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: d */
    public void mo1347d(RectF rectF, Matrix matrix, boolean z) {
        super.mo1347d(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.f2218G.f2352j.width(), this.f2218G.f2352j.height());
    }

    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2, p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: h */
    public <T> void mo1338h(T t, LottieValueCallback<T> lottieValueCallback) {
        this.f2157v.m1522c(t, lottieValueCallback);
        if (t == LottieProperty.f2453a) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f2220I;
            if (baseKeyframeAnimation != null) {
                this.f2156u.remove(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.f2220I = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f2220I = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.f2629a.add(this);
            m1348e(this.f2220I);
            return;
        }
        if (t == LottieProperty.f2454b) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.f2222K;
            if (baseKeyframeAnimation2 != null) {
                this.f2156u.remove(baseKeyframeAnimation2);
            }
            if (lottieValueCallback == null) {
                this.f2222K = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f2222K = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.f2629a.add(this);
            m1348e(this.f2222K);
            return;
        }
        if (t == LottieProperty.f2467o) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.f2224M;
            if (baseKeyframeAnimation3 != null) {
                this.f2156u.remove(baseKeyframeAnimation3);
            }
            if (lottieValueCallback == null) {
                this.f2224M = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f2224M = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.f2629a.add(this);
            m1348e(this.f2224M);
            return;
        }
        if (t == LottieProperty.f2468p) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation4 = this.f2226O;
            if (baseKeyframeAnimation4 != null) {
                this.f2156u.remove(baseKeyframeAnimation4);
            }
            if (lottieValueCallback == null) {
                this.f2226O = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f2226O = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.f2629a.add(this);
            m1348e(this.f2226O);
            return;
        }
        if (t == LottieProperty.f2450B) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation5 = this.f2227P;
            if (baseKeyframeAnimation5 != null) {
                this.f2156u.remove(baseKeyframeAnimation5);
            }
            if (lottieValueCallback == null) {
                this.f2227P = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation5 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f2227P = valueCallbackKeyframeAnimation5;
            valueCallbackKeyframeAnimation5.f2629a.add(this);
            m1348e(this.f2227P);
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:139:0x0411  */
    /* JADX WARN: Code duplicated, block: B:142:0x0420  */
    /* JADX WARN: Code duplicated, block: B:154:0x044e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0452 A[LOOP:7: B:140:0x041a->B:157:0x0452, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:160:0x0464  */
    /* JADX WARN: Code duplicated, block: B:161:0x046d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0476 A[LOOP:8: B:162:0x0474->B:163:0x0476, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:167:0x0499  */
    /* JADX WARN: Code duplicated, block: B:168:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:189:0x045b A[EDGE_INSN: B:189:0x045b->B:158:0x045b BREAK  A[LOOP:7: B:140:0x041a->B:157:0x0452], SYNTHETIC] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2
    /* JADX INFO: renamed from: k */
    public void mo1352k(Canvas canvas, Matrix matrix, int i) {
        FontAssetManager fontAssetManager;
        float fFloatValue;
        float fM1439c;
        List<String> listM1364u;
        int size;
        int i2;
        String str;
        int length;
        int iCodePointAt;
        int iCharCount;
        long j2;
        int iCharCount2;
        String string;
        int iCodePointAt2;
        boolean z;
        int i3;
        int i4;
        String str2;
        List<ContentGroup> list;
        float fFloatValue2;
        canvas.save();
        if (!this.f2217F.m1484w()) {
            canvas.concat(matrix);
        }
        DocumentData documentDataMo1504e = this.f2216E.mo1504e();
        Font font = this.f2218G.f2347e.get(documentDataMo1504e.f1970b);
        if (font == null) {
            canvas.restore();
            return;
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f2220I;
        if (baseKeyframeAnimation != null) {
            this.f2212A.setColor(baseKeyframeAnimation.mo1504e().intValue());
        } else {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.f2219H;
            if (baseKeyframeAnimation2 != null) {
                this.f2212A.setColor(baseKeyframeAnimation2.mo1504e().intValue());
            } else {
                this.f2212A.setColor(documentDataMo1504e.f1976h);
            }
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation3 = this.f2222K;
        if (baseKeyframeAnimation3 != null) {
            this.f2213B.setColor(baseKeyframeAnimation3.mo1504e().intValue());
        } else {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation4 = this.f2221J;
            if (baseKeyframeAnimation4 != null) {
                this.f2213B.setColor(baseKeyframeAnimation4.mo1504e().intValue());
            } else {
                this.f2213B.setColor(documentDataMo1504e.f1977i);
            }
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation5 = this.f2157v.f2669j;
        int iIntValue = ((baseKeyframeAnimation5 == null ? 100 : baseKeyframeAnimation5.mo1504e().intValue()) * 255) / 100;
        this.f2212A.setAlpha(iIntValue);
        this.f2213B.setAlpha(iIntValue);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation6 = this.f2224M;
        if (baseKeyframeAnimation6 != null) {
            this.f2213B.setStrokeWidth(baseKeyframeAnimation6.mo1504e().floatValue());
        } else {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation7 = this.f2223L;
            if (baseKeyframeAnimation7 != null) {
                this.f2213B.setStrokeWidth(baseKeyframeAnimation7.mo1504e().floatValue());
            } else {
                this.f2213B.setStrokeWidth(Utils.m1439c() * documentDataMo1504e.f1978j * Utils.m1440d(matrix));
            }
        }
        if (this.f2217F.m1484w()) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation8 = this.f2227P;
            float fFloatValue3 = (baseKeyframeAnimation8 != null ? baseKeyframeAnimation8.mo1504e().floatValue() : documentDataMo1504e.f1971c) / 100.0f;
            float fM1440d = Utils.m1440d(matrix);
            String str3 = documentDataMo1504e.f1969a;
            float fM1439c2 = Utils.m1439c() * documentDataMo1504e.f1974f;
            List<String> listM1364u2 = m1364u(str3);
            int size2 = listM1364u2.size();
            int i5 = 0;
            while (i5 < size2) {
                String str4 = listM1364u2.get(i5);
                float fM1439c3 = 0.0f;
                int i6 = 0;
                while (i6 < str4.length()) {
                    FontCharacter fontCharacterM15616e = this.f2218G.f2349g.m15616e(FontCharacter.m1329a(str4.charAt(i6), font.f1984a, font.f1986c));
                    if (fontCharacterM15616e != null) {
                        fM1439c3 = (float) ((fontCharacterM15616e.f1989c * ((double) fFloatValue3) * ((double) Utils.m1439c()) * ((double) fM1440d)) + ((double) fM1439c3));
                    }
                    i6++;
                    str4 = str4;
                    fM1439c2 = fM1439c2;
                    i5 = i5;
                }
                float f = fM1439c2;
                int i7 = i5;
                String str5 = str4;
                canvas.save();
                m1361r(documentDataMo1504e.f1972d, canvas, fM1439c3);
                canvas.translate(0.0f, (i7 * f) - (((size2 - 1) * f) / 2.0f));
                int i8 = 0;
                while (i8 < str5.length()) {
                    String str6 = str5;
                    FontCharacter fontCharacterM15616e2 = this.f2218G.f2349g.m15616e(FontCharacter.m1329a(str6.charAt(i8), font.f1984a, font.f1986c));
                    if (fontCharacterM15616e2 == null) {
                        listM1364u2 = listM1364u2;
                        i4 = size2;
                        str2 = str6;
                    } else {
                        if (this.f2214C.containsKey(fontCharacterM15616e2)) {
                            list = this.f2214C.get(fontCharacterM15616e2);
                            i4 = size2;
                            str2 = str6;
                        } else {
                            List<ShapeGroup> list2 = fontCharacterM15616e2.f1987a;
                            int size3 = list2.size();
                            ArrayList arrayList = new ArrayList(size3);
                            int i9 = 0;
                            while (i9 < size3) {
                                arrayList.add(new ContentGroup(this.f2217F, this, list2.get(i9)));
                                i9++;
                                str6 = str6;
                                size2 = size2;
                                list2 = list2;
                            }
                            i4 = size2;
                            str2 = str6;
                            this.f2214C.put(fontCharacterM15616e2, arrayList);
                            list = arrayList;
                        }
                        int i10 = 0;
                        while (i10 < list.size()) {
                            Path pathMo1493g = list.get(i10).mo1493g();
                            pathMo1493g.computeBounds(this.f2229y, false);
                            this.f2230z.set(matrix);
                            List<ContentGroup> list3 = list;
                            this.f2230z.preTranslate(0.0f, (-documentDataMo1504e.f1975g) * Utils.m1439c());
                            this.f2230z.preScale(fFloatValue3, fFloatValue3);
                            pathMo1493g.transform(this.f2230z);
                            if (documentDataMo1504e.f1979k) {
                                m1363t(pathMo1493g, this.f2212A, canvas);
                                m1363t(pathMo1493g, this.f2213B, canvas);
                            } else {
                                m1363t(pathMo1493g, this.f2213B, canvas);
                                m1363t(pathMo1493g, this.f2212A, canvas);
                            }
                            i10++;
                            list = list3;
                        }
                        float fM1439c4 = Utils.m1439c() * ((float) fontCharacterM15616e2.f1989c) * fFloatValue3 * fM1440d;
                        float f2 = documentDataMo1504e.f1973e / 10.0f;
                        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation9 = this.f2226O;
                        if (baseKeyframeAnimation9 != null) {
                            fFloatValue2 = baseKeyframeAnimation9.mo1504e().floatValue();
                        } else {
                            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation10 = this.f2225N;
                            if (baseKeyframeAnimation10 != null) {
                                fFloatValue2 = baseKeyframeAnimation10.mo1504e().floatValue();
                            }
                            canvas.translate((f2 * fM1440d) + fM1439c4, 0.0f);
                        }
                        f2 += fFloatValue2;
                        canvas.translate((f2 * fM1440d) + fM1439c4, 0.0f);
                    }
                    i8++;
                    listM1364u2 = listM1364u2;
                    str5 = str2;
                    size2 = i4;
                }
                canvas.restore();
                i5 = i7 + 1;
                fM1439c2 = f;
            }
        } else {
            Utils.m1440d(matrix);
            LottieDrawable lottieDrawable = this.f2217F;
            String str7 = font.f1984a;
            String str8 = font.f1986c;
            Typeface typefaceCreate = null;
            if (lottieDrawable.getCallback() == null) {
                fontAssetManager = null;
            } else {
                if (lottieDrawable.f2407r == null) {
                    lottieDrawable.f2407r = new FontAssetManager(lottieDrawable.getCallback(), lottieDrawable.f2408s);
                }
                fontAssetManager = lottieDrawable.f2407r;
            }
            int i11 = 1;
            if (fontAssetManager != null) {
                MutablePair<String> mutablePair = fontAssetManager.f1955a;
                mutablePair.f2000a = str7;
                mutablePair.f2001b = str8;
                typefaceCreate = fontAssetManager.f1956b.get(mutablePair);
                if (typefaceCreate == null) {
                    typefaceCreate = fontAssetManager.f1957c.get(str7);
                    if (typefaceCreate == null) {
                        StringBuilder sbM1561L = outline.m1561L("fonts/", str7);
                        sbM1561L.append(fontAssetManager.f1960f);
                        typefaceCreate = Typeface.createFromAsset(fontAssetManager.f1958d, sbM1561L.toString());
                        fontAssetManager.f1957c.put(str7, typefaceCreate);
                    }
                    boolean zContains = str8.contains("Italic");
                    boolean zContains2 = str8.contains("Bold");
                    if (zContains && zContains2) {
                        i3 = 3;
                    } else if (zContains) {
                        i3 = 2;
                    } else {
                        i3 = zContains2 ? 1 : 0;
                    }
                    if (typefaceCreate.getStyle() != i3) {
                        typefaceCreate = Typeface.create(typefaceCreate, i3);
                    }
                    fontAssetManager.f1956b.put(fontAssetManager.f1955a, typefaceCreate);
                }
            }
            if (typefaceCreate != null) {
                String str9 = documentDataMo1504e.f1969a;
                TextDelegate textDelegate = this.f2217F.f2409t;
                if (textDelegate != null) {
                    if (textDelegate.f2497b && textDelegate.f2496a.containsKey(str9)) {
                        str9 = textDelegate.f2496a.get(str9);
                    } else if (textDelegate.f2497b) {
                        textDelegate.f2496a.put(str9, str9);
                    }
                }
                this.f2212A.setTypeface(typefaceCreate);
                BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation11 = this.f2227P;
                float fFloatValue4 = baseKeyframeAnimation11 != null ? baseKeyframeAnimation11.mo1504e().floatValue() : documentDataMo1504e.f1971c;
                this.f2212A.setTextSize(Utils.m1439c() * fFloatValue4);
                this.f2213B.setTypeface(this.f2212A.getTypeface());
                this.f2213B.setTextSize(this.f2212A.getTextSize());
                float fM1439c5 = Utils.m1439c() * documentDataMo1504e.f1974f;
                float f3 = documentDataMo1504e.f1973e / 10.0f;
                BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation12 = this.f2226O;
                if (baseKeyframeAnimation12 != null) {
                    fFloatValue = baseKeyframeAnimation12.mo1504e().floatValue();
                } else {
                    BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation13 = this.f2225N;
                    if (baseKeyframeAnimation13 != null) {
                        fFloatValue = baseKeyframeAnimation13.mo1504e().floatValue();
                    }
                    fM1439c = ((Utils.m1439c() * f3) * fFloatValue4) / 100.0f;
                    listM1364u = m1364u(str9);
                    size = listM1364u.size();
                    i2 = 0;
                    while (i2 < size) {
                        str = listM1364u.get(i2);
                        float length2 = ((str.length() - i11) * fM1439c) + this.f2213B.measureText(str);
                        canvas.save();
                        m1361r(documentDataMo1504e.f1972d, canvas, length2);
                        canvas.translate(0.0f, (i2 * fM1439c5) - (((size - 1) * fM1439c5) / 2.0f));
                        length = 0;
                        while (length < str.length()) {
                            iCodePointAt = str.codePointAt(length);
                            iCharCount = Character.charCount(iCodePointAt) + length;
                            while (iCharCount < str.length()) {
                                iCodePointAt2 = str.codePointAt(iCharCount);
                                if (Character.getType(iCodePointAt2) != 16 || Character.getType(iCodePointAt2) == 27 || Character.getType(iCodePointAt2) == 6 || Character.getType(iCodePointAt2) == 28 || Character.getType(iCodePointAt2) == 19) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    break;
                                }
                                iCharCount += Character.charCount(iCodePointAt2);
                                iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                            }
                            j2 = iCodePointAt;
                            if (this.f2215D.m15587e(j2)) {
                                string = this.f2215D.m15589i(j2);
                            } else {
                                this.f2228x.setLength(0);
                                iCharCount2 = length;
                                while (iCharCount2 < iCharCount) {
                                    int iCodePointAt3 = str.codePointAt(iCharCount2);
                                    this.f2228x.appendCodePoint(iCodePointAt3);
                                    iCharCount2 += Character.charCount(iCodePointAt3);
                                }
                                string = this.f2228x.toString();
                                this.f2215D.m15593m(j2, string);
                            }
                            length += string.length();
                            if (documentDataMo1504e.f1979k) {
                                m1362s(string, this.f2212A, canvas);
                                m1362s(string, this.f2213B, canvas);
                            } else {
                                m1362s(string, this.f2213B, canvas);
                                m1362s(string, this.f2212A, canvas);
                            }
                            canvas.translate(this.f2212A.measureText(string) + fM1439c, 0.0f);
                        }
                        canvas.restore();
                        i2++;
                        i11 = 1;
                    }
                }
                f3 += fFloatValue;
                fM1439c = ((Utils.m1439c() * f3) * fFloatValue4) / 100.0f;
                listM1364u = m1364u(str9);
                size = listM1364u.size();
                i2 = 0;
                while (i2 < size) {
                    str = listM1364u.get(i2);
                    float length3 = ((str.length() - i11) * fM1439c) + this.f2213B.measureText(str);
                    canvas.save();
                    m1361r(documentDataMo1504e.f1972d, canvas, length3);
                    canvas.translate(0.0f, (i2 * fM1439c5) - (((size - 1) * fM1439c5) / 2.0f));
                    length = 0;
                    while (length < str.length()) {
                        iCodePointAt = str.codePointAt(length);
                        iCharCount = Character.charCount(iCodePointAt) + length;
                        while (iCharCount < str.length()) {
                            iCodePointAt2 = str.codePointAt(iCharCount);
                            if (Character.getType(iCodePointAt2) != 16) {
                                z = true;
                            } else {
                                z = true;
                            }
                            if (!z) {
                                break;
                                break;
                            } else {
                                iCharCount += Character.charCount(iCodePointAt2);
                                iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                            }
                        }
                        j2 = iCodePointAt;
                        if (this.f2215D.m15587e(j2)) {
                            string = this.f2215D.m15589i(j2);
                        } else {
                            this.f2228x.setLength(0);
                            iCharCount2 = length;
                            while (iCharCount2 < iCharCount) {
                                int iCodePointAt4 = str.codePointAt(iCharCount2);
                                this.f2228x.appendCodePoint(iCodePointAt4);
                                iCharCount2 += Character.charCount(iCodePointAt4);
                            }
                            string = this.f2228x.toString();
                            this.f2215D.m15593m(j2, string);
                        }
                        length += string.length();
                        if (documentDataMo1504e.f1979k) {
                            m1362s(string, this.f2212A, canvas);
                            m1362s(string, this.f2213B, canvas);
                        } else {
                            m1362s(string, this.f2213B, canvas);
                            m1362s(string, this.f2212A, canvas);
                        }
                        canvas.translate(this.f2212A.measureText(string) + fM1439c, 0.0f);
                    }
                    canvas.restore();
                    i2++;
                    i11 = 1;
                }
            }
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: r */
    public final void m1361r(DocumentData.a aVar, Canvas canvas, float f) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 1) {
            canvas.translate(-f, 0.0f);
        } else {
            if (iOrdinal != 2) {
                return;
            }
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1362s(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    /* JADX INFO: renamed from: t */
    public final void m1363t(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* JADX INFO: renamed from: u */
    public final List<String> m1364u(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }
}
