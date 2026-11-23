package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gh2 {

    /* JADX INFO: renamed from: a */
    public static final gh2 f14588a = new gh2(1.0f, 1.0f);

    /* JADX INFO: renamed from: b */
    public final float f14589b;

    /* JADX INFO: renamed from: c */
    public final float f14590c = 1.0f;

    /* JADX INFO: renamed from: d */
    public final int f14591d;

    public gh2(float f, float f2) {
        this.f14589b = f;
        this.f14591d = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && gh2.class == obj.getClass() && this.f14589b == ((gh2) obj).f14589b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(1.0f) + ((Float.floatToRawIntBits(this.f14589b) + 527) * 31);
    }
}
