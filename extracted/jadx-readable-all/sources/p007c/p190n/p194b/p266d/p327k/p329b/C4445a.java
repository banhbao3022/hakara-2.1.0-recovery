package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: c.n.b.d.k.b.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4445a extends C4460b2 {

    /* JADX INFO: renamed from: b */
    public final Map<String, Long> f23688b;

    /* JADX INFO: renamed from: c */
    public final Map<String, Integer> f23689c;

    /* JADX INFO: renamed from: d */
    public long f23690d;

    public C4445a(C4707w4 c4707w4) {
        super(c4707w4);
        this.f23689c = new ArrayMap();
        this.f23688b = new ArrayMap();
    }

    /* JADX INFO: renamed from: t */
    public final void m10372t(long j2) {
        C4585l7 c4585l7M10628w = m10386q().m10628w(false);
        for (String str : this.f23688b.keySet()) {
            m10375w(str, j2 - this.f23688b.get(str).longValue(), c4585l7M10628w);
        }
        if (!this.f23688b.isEmpty()) {
            m10373u(j2 - this.f23690d, c4585l7M10628w);
        }
        m10376x(j2);
    }

    /* JADX INFO: renamed from: u */
    public final void m10373u(long j2, C4585l7 c4585l7) {
        if (c4585l7 == null) {
            mo10684l().f24426n.m10811a("Not logging ad exposure. No active activity");
            return;
        }
        if (j2 < 1000) {
            mo10684l().f24426n.m10812b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j2);
        C4573k7.m10622A(c4585l7, bundle, true);
        m10383i().m10517H("am", "_xa", bundle);
    }

    /* JADX INFO: renamed from: v */
    public final void m10374v(String str, long j2) {
        if (str == null || str.length() == 0) {
            mo10684l().f24418f.m10811a("Ad unit id must be a non-empty string");
        } else {
            mo10686n().m10758v(new RunnableC4447a1(this, str, j2));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m10375w(String str, long j2, C4585l7 c4585l7) {
        if (c4585l7 == null) {
            mo10684l().f24426n.m10811a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j2 < 1000) {
            mo10684l().f24426n.m10812b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j2);
        C4573k7.m10622A(c4585l7, bundle, true);
        m10383i().m10517H("am", "_xu", bundle);
    }

    /* JADX INFO: renamed from: x */
    public final void m10376x(long j2) {
        Iterator<String> it = this.f23688b.keySet().iterator();
        while (it.hasNext()) {
            this.f23688b.put(it.next(), Long.valueOf(j2));
        }
        if (this.f23688b.isEmpty()) {
            return;
        }
        this.f23690d = j2;
    }

    /* JADX INFO: renamed from: y */
    public final void m10377y(String str, long j2) {
        if (str == null || str.length() == 0) {
            mo10684l().f24418f.m10811a("Ad unit id must be a non-empty string");
        } else {
            mo10686n().m10758v(new RunnableC4735z(this, str, j2));
        }
    }
}
