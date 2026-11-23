package p007c.p056c.p057a.p059b0.p062l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.p059b0.KeyPath;
import p007c.p056c.p057a.p059b0.p061k.ShapeGroup;
import p007c.p056c.p057a.p068z.p069b.ContentGroup;

/* JADX INFO: renamed from: c.c.a.b0.l.g, reason: use source file name */
/* JADX INFO: compiled from: ShapeLayer.java */
/* JADX INFO: loaded from: classes.dex */
public class ShapeLayer extends BaseLayer2 {

    /* JADX INFO: renamed from: x */
    public final ContentGroup f2205x;

    public ShapeLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        ContentGroup contentGroup = new ContentGroup(lottieDrawable, this, new ShapeGroup("__container", layer.f2168a, false));
        this.f2205x = contentGroup;
        contentGroup.mo1346b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2, p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: d */
    public void mo1347d(RectF rectF, Matrix matrix, boolean z) {
        super.mo1347d(rectF, matrix, z);
        this.f2205x.mo1347d(rectF, this.f2148m, z);
    }

    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2
    /* JADX INFO: renamed from: k */
    public void mo1352k(Canvas canvas, Matrix matrix, int i) {
        this.f2205x.mo1349f(canvas, matrix, i);
    }

    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2
    /* JADX INFO: renamed from: o */
    public void mo1356o(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        this.f2205x.mo1337c(keyPath, i, list, keyPath2);
    }
}
