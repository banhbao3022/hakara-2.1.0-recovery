package p007c.p056c.p057a.p068z.p069b;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.p059b0.KeyPath;
import p007c.p056c.p057a.p059b0.KeyPathElement;
import p007c.p056c.p057a.p059b0.p060j.AnimatableTransform;
import p007c.p056c.p057a.p059b0.p061k.ContentModel;
import p007c.p056c.p057a.p059b0.p061k.ShapeGroup;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p066e0.Utils;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p056c.p057a.p068z.LPaint;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.TransformKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.z.b.d, reason: use source file name */
/* JADX INFO: compiled from: ContentGroup.java */
/* JADX INFO: loaded from: classes.dex */
public class ContentGroup implements DrawingContent, PathContent, BaseKeyframeAnimation.b, KeyPathElement {

    /* JADX INFO: renamed from: a */
    public Paint f2515a;

    /* JADX INFO: renamed from: b */
    public RectF f2516b;

    /* JADX INFO: renamed from: c */
    public final Matrix f2517c;

    /* JADX INFO: renamed from: d */
    public final Path f2518d;

    /* JADX INFO: renamed from: e */
    public final RectF f2519e;

    /* JADX INFO: renamed from: f */
    public final String f2520f;

    /* JADX INFO: renamed from: g */
    public final boolean f2521g;

    /* JADX INFO: renamed from: h */
    public final List<Content> f2522h;

    /* JADX INFO: renamed from: i */
    public final LottieDrawable f2523i;

    /* JADX INFO: renamed from: j */
    public List<PathContent> f2524j;

    /* JADX INFO: renamed from: k */
    public TransformKeyframeAnimation f2525k;

    public ContentGroup(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2, ShapeGroup shapeGroup) {
        AnimatableTransform animatableTransform;
        String str = shapeGroup.f2101a;
        boolean z = shapeGroup.f2103c;
        List<ContentModel> list = shapeGroup.f2102b;
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            Content contentMo1342a = list.get(i).mo1342a(lottieDrawable, baseLayer2);
            if (contentMo1342a != null) {
                arrayList.add(contentMo1342a);
            }
        }
        List<ContentModel> list2 = shapeGroup.f2102b;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            ContentModel contentModel = list2.get(i2);
            if (contentModel instanceof AnimatableTransform) {
                animatableTransform = (AnimatableTransform) contentModel;
                this(lottieDrawable, baseLayer2, str, z, arrayList, animatableTransform);
            }
        }
        animatableTransform = null;
        this(lottieDrawable, baseLayer2, str, z, arrayList, animatableTransform);
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.b
    /* JADX INFO: renamed from: a */
    public void mo1345a() {
        this.f2523i.invalidateSelf();
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    /* JADX INFO: renamed from: b */
    public void mo1346b(List<Content> list, List<Content> list2) {
        ArrayList arrayList = new ArrayList(this.f2522h.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.f2522h.size() - 1; size >= 0; size--) {
            Content content = this.f2522h.get(size);
            content.mo1346b(arrayList, this.f2522h.subList(0, size));
            arrayList.add(content);
        }
    }

    @Override // p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: c */
    public void mo1337c(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        if (keyPath.m1334e(this.f2520f, i)) {
            if (!"__container".equals(this.f2520f)) {
                keyPath2 = keyPath2.m1330a(this.f2520f);
                if (keyPath.m1332c(this.f2520f, i)) {
                    list.add(keyPath2.m1336g(this));
                }
            }
            if (keyPath.m1335f(this.f2520f, i)) {
                int iM1333d = keyPath.m1333d(this.f2520f, i) + i;
                for (int i2 = 0; i2 < this.f2522h.size(); i2++) {
                    Content content = this.f2522h.get(i2);
                    if (content instanceof KeyPathElement) {
                        ((KeyPathElement) content).mo1337c(keyPath, iM1333d, list, keyPath2);
                    }
                }
            }
        }
    }

    @Override // p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: d */
    public void mo1347d(RectF rectF, Matrix matrix, boolean z) {
        this.f2517c.set(matrix);
        TransformKeyframeAnimation transformKeyframeAnimation = this.f2525k;
        if (transformKeyframeAnimation != null) {
            this.f2517c.preConcat(transformKeyframeAnimation.m1524e());
        }
        this.f2519e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f2522h.size() - 1; size >= 0; size--) {
            Content content = this.f2522h.get(size);
            if (content instanceof DrawingContent) {
                ((DrawingContent) content).mo1347d(this.f2519e, this.f2517c, z);
                rectF.union(this.f2519e);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public List<PathContent> m1492e() {
        if (this.f2524j == null) {
            this.f2524j = new ArrayList();
            for (int i = 0; i < this.f2522h.size(); i++) {
                Content content = this.f2522h.get(i);
                if (content instanceof PathContent) {
                    this.f2524j.add((PathContent) content);
                }
            }
        }
        return this.f2524j;
    }

    @Override // p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: f */
    public void mo1349f(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        if (this.f2521g) {
            return;
        }
        this.f2517c.set(matrix);
        TransformKeyframeAnimation transformKeyframeAnimation = this.f2525k;
        if (transformKeyframeAnimation != null) {
            this.f2517c.preConcat(transformKeyframeAnimation.m1524e());
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f2525k.f2669j;
            i = (int) (((((baseKeyframeAnimation == null ? 100 : baseKeyframeAnimation.mo1504e().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z2 = false;
        if (this.f2523i.f2414y) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= this.f2522h.size()) {
                    z = false;
                    break;
                } else {
                    if ((this.f2522h.get(i2) instanceof DrawingContent) && (i3 = i3 + 1) >= 2) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z && i != 255) {
                z2 = true;
            }
        }
        if (z2) {
            this.f2516b.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo1347d(this.f2516b, this.f2517c, true);
            this.f2515a.setAlpha(i);
            Utils.m1442f(canvas, this.f2516b, this.f2515a, 31);
        }
        if (z2) {
            i = 255;
        }
        for (int size = this.f2522h.size() - 1; size >= 0; size--) {
            Content content = this.f2522h.get(size);
            if (content instanceof DrawingContent) {
                ((DrawingContent) content).mo1349f(canvas, this.f2517c, i);
            }
        }
        if (z2) {
            canvas.restore();
        }
    }

    @Override // p007c.p056c.p057a.p068z.p069b.PathContent
    /* JADX INFO: renamed from: g */
    public Path mo1493g() {
        this.f2517c.reset();
        TransformKeyframeAnimation transformKeyframeAnimation = this.f2525k;
        if (transformKeyframeAnimation != null) {
            this.f2517c.set(transformKeyframeAnimation.m1524e());
        }
        this.f2518d.reset();
        if (this.f2521g) {
            return this.f2518d;
        }
        for (int size = this.f2522h.size() - 1; size >= 0; size--) {
            Content content = this.f2522h.get(size);
            if (content instanceof PathContent) {
                this.f2518d.addPath(((PathContent) content).mo1493g(), this.f2517c);
            }
        }
        return this.f2518d;
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    public String getName() {
        return this.f2520f;
    }

    @Override // p007c.p056c.p057a.p059b0.KeyPathElement
    /* JADX INFO: renamed from: h */
    public <T> void mo1338h(T t, LottieValueCallback<T> lottieValueCallback) {
        TransformKeyframeAnimation transformKeyframeAnimation = this.f2525k;
        if (transformKeyframeAnimation != null) {
            transformKeyframeAnimation.m1522c(t, lottieValueCallback);
        }
    }

    public ContentGroup(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2, String str, boolean z, List<Content> list, AnimatableTransform animatableTransform) {
        this.f2515a = new LPaint();
        this.f2516b = new RectF();
        this.f2517c = new Matrix();
        this.f2518d = new Path();
        this.f2519e = new RectF();
        this.f2520f = str;
        this.f2523i = lottieDrawable;
        this.f2521g = z;
        this.f2522h = list;
        if (animatableTransform != null) {
            TransformKeyframeAnimation transformKeyframeAnimation = new TransformKeyframeAnimation(animatableTransform);
            this.f2525k = transformKeyframeAnimation;
            transformKeyframeAnimation.m1520a(baseLayer2);
            this.f2525k.m1521b(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Content content = list.get(size);
            if (content instanceof GreedyContent) {
                arrayList.add((GreedyContent) content);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((GreedyContent) arrayList.get(size2)).mo1498e(list.listIterator(list.size()));
            }
        }
    }
}
