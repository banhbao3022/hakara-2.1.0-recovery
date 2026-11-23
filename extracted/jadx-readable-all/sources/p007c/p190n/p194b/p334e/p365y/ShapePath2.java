package p007c.p190n.p194b.p334e.p365y;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;
import p007c.p190n.p194b.p334e.p364x.ShadowRenderer;

/* JADX INFO: renamed from: c.n.b.e.y.l, reason: use source file name */
/* JADX INFO: compiled from: ShapePath.java */
/* JADX INFO: loaded from: classes.dex */
public class ShapePath2 extends ShapePath3.f {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f25656b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Matrix f25657c;

    public ShapePath2(ShapePath3 shapePath3, List list, Matrix matrix) {
        this.f25656b = list;
        this.f25657c = matrix;
    }

    @Override // p007c.p190n.p194b.p334e.p365y.ShapePath3.f
    /* JADX INFO: renamed from: a */
    public void mo11406a(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
        Iterator it = this.f25656b.iterator();
        while (it.hasNext()) {
            ((ShapePath3.f) it.next()).mo11406a(this.f25657c, shadowRenderer, i, canvas);
        }
    }
}
