package p007c.p190n.p194b.p334e.p365y;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: c.n.b.e.y.b, reason: use source file name */
/* JADX INFO: compiled from: AdjustedCornerSize.java */
/* JADX INFO: loaded from: classes.dex */
public final class AdjustedCornerSize implements CornerSize {

    /* JADX INFO: renamed from: a */
    public final CornerSize f25566a;

    /* JADX INFO: renamed from: b */
    public final float f25567b;

    public AdjustedCornerSize(float f, CornerSize cornerSize) {
        while (cornerSize instanceof AdjustedCornerSize) {
            cornerSize = ((AdjustedCornerSize) cornerSize).f25566a;
            f += ((AdjustedCornerSize) cornerSize).f25567b;
        }
        this.f25566a = cornerSize;
        this.f25567b = f;
    }

    @Override // p007c.p190n.p194b.p334e.p365y.CornerSize
    /* JADX INFO: renamed from: a */
    public float mo11363a(RectF rectF) {
        return Math.max(0.0f, this.f25566a.mo11363a(rectF) + this.f25567b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdjustedCornerSize)) {
            return false;
        }
        AdjustedCornerSize adjustedCornerSize = (AdjustedCornerSize) obj;
        return this.f25566a.equals(adjustedCornerSize.f25566a) && this.f25567b == adjustedCornerSize.f25567b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25566a, Float.valueOf(this.f25567b)});
    }
}
