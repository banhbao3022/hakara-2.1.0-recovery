package p007c.p056c.p057a.p059b0.p062l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import p007c.p056c.p057a.LottieDrawable;

/* JADX INFO: renamed from: c.c.a.b0.l.f, reason: use source file name */
/* JADX INFO: compiled from: NullLayer.java */
/* JADX INFO: loaded from: classes.dex */
public class NullLayer extends BaseLayer2 {
    public NullLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
    }

    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2, p007c.p056c.p057a.p068z.p069b.DrawingContent
    /* JADX INFO: renamed from: d */
    public void mo1347d(RectF rectF, Matrix matrix, boolean z) {
        super.mo1347d(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // p007c.p056c.p057a.p059b0.p062l.BaseLayer2
    /* JADX INFO: renamed from: k */
    public void mo1352k(Canvas canvas, Matrix matrix, int i) {
    }
}
