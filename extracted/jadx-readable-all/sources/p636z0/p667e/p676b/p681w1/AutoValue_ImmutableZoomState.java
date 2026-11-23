package p636z0.p667e.p676b.p681w1;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.e.b.w1.a, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_ImmutableZoomState.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_ImmutableZoomState extends ImmutableZoomState {

    /* JADX INFO: renamed from: a */
    public final float f36330a;

    /* JADX INFO: renamed from: b */
    public final float f36331b;

    /* JADX INFO: renamed from: c */
    public final float f36332c;

    /* JADX INFO: renamed from: d */
    public final float f36333d;

    public AutoValue_ImmutableZoomState(float f, float f2, float f3, float f4) {
        this.f36330a = f;
        this.f36331b = f2;
        this.f36332c = f3;
        this.f36333d = f4;
    }

    @Override // p636z0.p667e.p676b.p681w1.ImmutableZoomState
    /* JADX INFO: renamed from: b */
    public float mo15443b() {
        return this.f36333d;
    }

    @Override // p636z0.p667e.p676b.p681w1.ImmutableZoomState
    /* JADX INFO: renamed from: c */
    public float mo15444c() {
        return this.f36331b;
    }

    @Override // p636z0.p667e.p676b.p681w1.ImmutableZoomState
    /* JADX INFO: renamed from: d */
    public float mo15445d() {
        return this.f36332c;
    }

    @Override // p636z0.p667e.p676b.p681w1.ImmutableZoomState
    /* JADX INFO: renamed from: e */
    public float mo15446e() {
        return this.f36330a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableZoomState)) {
            return false;
        }
        ImmutableZoomState immutableZoomState = (ImmutableZoomState) obj;
        return Float.floatToIntBits(this.f36330a) == Float.floatToIntBits(immutableZoomState.mo15446e()) && Float.floatToIntBits(this.f36331b) == Float.floatToIntBits(immutableZoomState.mo15444c()) && Float.floatToIntBits(this.f36332c) == Float.floatToIntBits(immutableZoomState.mo15445d()) && Float.floatToIntBits(this.f36333d) == Float.floatToIntBits(immutableZoomState.mo15443b());
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f36330a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f36331b)) * 1000003) ^ Float.floatToIntBits(this.f36332c)) * 1000003) ^ Float.floatToIntBits(this.f36333d);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ImmutableZoomState{zoomRatio=");
        sbM1556G.append(this.f36330a);
        sbM1556G.append(", maxZoomRatio=");
        sbM1556G.append(this.f36331b);
        sbM1556G.append(", minZoomRatio=");
        sbM1556G.append(this.f36332c);
        sbM1556G.append(", linearZoom=");
        sbM1556G.append(this.f36333d);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
