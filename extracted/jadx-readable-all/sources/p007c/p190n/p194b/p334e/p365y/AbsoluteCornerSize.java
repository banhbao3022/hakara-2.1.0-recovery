package p007c.p190n.p194b.p334e.p365y;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: c.n.b.e.y.a, reason: use source file name */
/* JADX INFO: compiled from: AbsoluteCornerSize.java */
/* JADX INFO: loaded from: classes.dex */
public final class AbsoluteCornerSize implements CornerSize {

    /* JADX INFO: renamed from: a */
    public final float f25565a;

    public AbsoluteCornerSize(float f) {
        this.f25565a = f;
    }

    @Override // p007c.p190n.p194b.p334e.p365y.CornerSize
    /* JADX INFO: renamed from: a */
    public float mo11363a(RectF rectF) {
        return this.f25565a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbsoluteCornerSize) && this.f25565a == ((AbsoluteCornerSize) obj).f25565a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f25565a)});
    }
}
