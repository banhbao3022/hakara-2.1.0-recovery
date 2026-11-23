package p636z0.p644b.p653h;

/* JADX INFO: renamed from: z0.b.h.p0, reason: use source file name */
/* JADX INFO: compiled from: RtlSpacingHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class RtlSpacingHelper {

    /* JADX INFO: renamed from: a */
    public int f35145a = 0;

    /* JADX INFO: renamed from: b */
    public int f35146b = 0;

    /* JADX INFO: renamed from: c */
    public int f35147c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public int f35148d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e */
    public int f35149e = 0;

    /* JADX INFO: renamed from: f */
    public int f35150f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f35151g = false;

    /* JADX INFO: renamed from: h */
    public boolean f35152h = false;

    /* JADX INFO: renamed from: a */
    public void m14948a(int i, int i2) {
        this.f35147c = i;
        this.f35148d = i2;
        this.f35152h = true;
        if (this.f35151g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f35145a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f35146b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f35145a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f35146b = i2;
        }
    }
}
