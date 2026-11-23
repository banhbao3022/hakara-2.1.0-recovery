package p007c.p190n.p194b.p334e.p365y;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: c.n.b.e.y.h, reason: use source file name */
/* JADX INFO: compiled from: RelativeCornerSize.java */
/* JADX INFO: loaded from: classes.dex */
public final class RelativeCornerSize implements CornerSize {

    /* JADX INFO: renamed from: a */
    public final float f25616a;

    public RelativeCornerSize(float f) {
        this.f25616a = f;
    }

    @Override // p007c.p190n.p194b.p334e.p365y.CornerSize
    /* JADX INFO: renamed from: a */
    public float mo11363a(RectF rectF) {
        return rectF.height() * this.f25616a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RelativeCornerSize) && this.f25616a == ((RelativeCornerSize) obj).f25616a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f25616a)});
    }
}
