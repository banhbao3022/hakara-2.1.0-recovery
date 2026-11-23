package p007c.p056c.p057a.p059b0.p061k;

import android.graphics.Paint;
import java.util.List;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.p059b0.p060j.AnimatableColorValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableFloatValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableIntegerValue;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p068z.p069b.Content;
import p007c.p056c.p057a.p068z.p069b.StrokeContent;

/* JADX INFO: renamed from: c.c.a.b0.k.p, reason: use source file name */
/* JADX INFO: compiled from: ShapeStroke.java */
/* JADX INFO: loaded from: classes.dex */
public class ShapeStroke implements ContentModel {

    /* JADX INFO: renamed from: a */
    public final String f2108a;

    /* JADX INFO: renamed from: b */
    public final AnimatableFloatValue f2109b;

    /* JADX INFO: renamed from: c */
    public final List<AnimatableFloatValue> f2110c;

    /* JADX INFO: renamed from: d */
    public final AnimatableColorValue f2111d;

    /* JADX INFO: renamed from: e */
    public final AnimatableIntegerValue f2112e;

    /* JADX INFO: renamed from: f */
    public final AnimatableFloatValue f2113f;

    /* JADX INFO: renamed from: g */
    public final a f2114g;

    /* JADX INFO: renamed from: h */
    public final b f2115h;

    /* JADX INFO: renamed from: i */
    public final float f2116i;

    /* JADX INFO: renamed from: j */
    public final boolean f2117j;

    /* JADX INFO: renamed from: c.c.a.b0.k.p$a */
    /* JADX INFO: compiled from: ShapeStroke.java */
    public enum a {
        BUTT,
        ROUND,
        UNKNOWN;

        /* JADX INFO: renamed from: f */
        public Paint.Cap m1343f() {
            int iOrdinal = ordinal();
            if (iOrdinal != 0) {
                return iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* JADX INFO: renamed from: c.c.a.b0.k.p$b */
    /* JADX INFO: compiled from: ShapeStroke.java */
    public enum b {
        MITER,
        ROUND,
        BEVEL;

        /* JADX INFO: renamed from: f */
        public Paint.Join m1344f() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return Paint.Join.MITER;
            }
            if (iOrdinal == 1) {
                return Paint.Join.ROUND;
            }
            if (iOrdinal != 2) {
                return null;
            }
            return Paint.Join.BEVEL;
        }
    }

    public ShapeStroke(String str, AnimatableFloatValue animatableFloatValue, List<AnimatableFloatValue> list, AnimatableColorValue animatableColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue2, a aVar, b bVar, float f, boolean z) {
        this.f2108a = str;
        this.f2109b = animatableFloatValue;
        this.f2110c = list;
        this.f2111d = animatableColorValue;
        this.f2112e = animatableIntegerValue;
        this.f2113f = animatableFloatValue2;
        this.f2114g = aVar;
        this.f2115h = bVar;
        this.f2116i = f;
        this.f2117j = z;
    }

    @Override // p007c.p056c.p057a.p059b0.p061k.ContentModel
    /* JADX INFO: renamed from: a */
    public Content mo1342a(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2) {
        return new StrokeContent(lottieDrawable, baseLayer2, this);
    }
}
