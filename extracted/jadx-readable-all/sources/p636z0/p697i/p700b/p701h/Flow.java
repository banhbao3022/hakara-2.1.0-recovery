package p636z0.p697i.p700b.p701h;

import java.util.ArrayList;
import java.util.Objects;
import p636z0.p697i.p700b.LinearSystem;

/* JADX INFO: renamed from: z0.i.b.h.g, reason: use source file name */
/* JADX INFO: compiled from: Flow.java */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {

    /* JADX INFO: renamed from: p0 */
    public int f36915p0 = -1;

    /* JADX INFO: renamed from: q0 */
    public int f36916q0 = -1;

    /* JADX INFO: renamed from: r0 */
    public int f36917r0 = -1;

    /* JADX INFO: renamed from: s0 */
    public int f36918s0 = -1;

    /* JADX INFO: renamed from: t0 */
    public int f36919t0 = -1;

    /* JADX INFO: renamed from: u0 */
    public int f36920u0 = -1;

    /* JADX INFO: renamed from: v0 */
    public float f36921v0 = 0.5f;

    /* JADX INFO: renamed from: w0 */
    public float f36922w0 = 0.5f;

    /* JADX INFO: renamed from: x0 */
    public float f36923x0 = 0.5f;

    /* JADX INFO: renamed from: y0 */
    public float f36924y0 = 0.5f;

    /* JADX INFO: renamed from: z0 */
    public float f36925z0 = 0.5f;

    /* JADX INFO: renamed from: A0 */
    public float f36911A0 = 0.5f;

    /* JADX INFO: renamed from: B0 */
    public int f36912B0 = 2;

    /* JADX INFO: renamed from: C0 */
    public int f36913C0 = 2;

    /* JADX INFO: renamed from: D0 */
    public ArrayList<a> f36914D0 = new ArrayList<>();

    /* JADX INFO: renamed from: z0.i.b.h.g$a */
    /* JADX INFO: compiled from: Flow.java */
    public class a {

        /* JADX INFO: renamed from: a */
        public int f36926a;

        /* JADX INFO: renamed from: b */
        public ConstraintAnchor f36927b;

        /* JADX INFO: renamed from: c */
        public ConstraintAnchor f36928c;

        /* JADX INFO: renamed from: d */
        public ConstraintAnchor f36929d;

        /* JADX INFO: renamed from: e */
        public ConstraintAnchor f36930e;

        public a(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.f36926a = 0;
            this.f36926a = i;
            this.f36927b = constraintAnchor;
            this.f36928c = constraintAnchor2;
            this.f36929d = constraintAnchor3;
            this.f36930e = constraintAnchor4;
            Objects.requireNonNull(Flow.this);
        }
    }

    @Override // p636z0.p697i.p700b.p701h.ConstraintWidget
    /* JADX INFO: renamed from: e */
    public void mo15722e(LinearSystem linearSystem, boolean z) {
        super.mo15722e(linearSystem, z);
        ConstraintWidget constraintWidget = this.f36844Q;
        if (constraintWidget != null) {
        }
        if (this.f36914D0.size() > 0) {
            Objects.requireNonNull(this.f36914D0.get(0));
        }
        this.f36941o0 = false;
    }
}
