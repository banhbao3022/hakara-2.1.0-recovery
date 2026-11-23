package p636z0.p667e.p668a.p670e;

import p636z0.p667e.p676b.ZoomState;

/* JADX INFO: renamed from: z0.e.a.e.v1, reason: use source file name */
/* JADX INFO: compiled from: ZoomStateImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class ZoomStateImpl implements ZoomState {

    /* JADX INFO: renamed from: a */
    public float f35703a;

    /* JADX INFO: renamed from: b */
    public final float f35704b;

    /* JADX INFO: renamed from: c */
    public final float f35705c;

    /* JADX INFO: renamed from: d */
    public float f35706d;

    public ZoomStateImpl(float f, float f2) {
        this.f35704b = f;
        this.f35705c = f2;
    }

    /* JADX INFO: renamed from: a */
    public void m15202a(float f) throws IllegalArgumentException {
        float f2 = this.f35704b;
        if (f <= f2) {
            float f3 = this.f35705c;
            if (f >= f3) {
                this.f35703a = f;
                float f4 = 0.0f;
                if (f2 != f3) {
                    if (f == f2) {
                        f4 = 1.0f;
                    } else if (f != f3) {
                        float f5 = 1.0f / f3;
                        f4 = ((1.0f / f) - f5) / ((1.0f / f2) - f5);
                    }
                }
                this.f35706d = f4;
                return;
            }
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + this.f35705c + " , " + this.f35704b + "]");
    }
}
