package p007c.p085g.p086a.p108q.p109h;

import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p108q.SingleRequest;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.q.h.g, reason: use source file name */
/* JADX INFO: compiled from: SimpleTarget.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class SimpleTarget<Z> extends BaseTarget<Z> {

    /* JADX INFO: renamed from: g */
    public final int f3781g;

    /* JADX INFO: renamed from: h */
    public final int f3782h;

    public SimpleTarget() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: a */
    public void mo2023a(SizeReadyCallback sizeReadyCallback) {
    }

    @Override // p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: i */
    public final void mo2024i(SizeReadyCallback sizeReadyCallback) throws Throwable {
        if (Util4.m2054i(this.f3781g, this.f3782h)) {
            ((SingleRequest) sizeReadyCallback).mo2005a(this.f3781g, this.f3782h);
        } else {
            StringBuilder sbM1556G = outline.m1556G("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
            sbM1556G.append(this.f3781g);
            sbM1556G.append(" and height: ");
            throw new IllegalArgumentException(outline.m1603y(sbM1556G, this.f3782h, ", either provide dimensions in the constructor or call override()"));
        }
    }

    public SimpleTarget(int i, int i2) {
        this.f3781g = i;
        this.f3782h = i2;
    }
}
