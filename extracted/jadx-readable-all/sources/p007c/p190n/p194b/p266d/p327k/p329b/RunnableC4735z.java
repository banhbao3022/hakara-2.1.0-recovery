package p007c.p190n.p194b.p266d.p327k.p329b;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.k.b.z */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4735z implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f24615f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f24616g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4445a f24617h;

    public RunnableC4735z(C4445a c4445a, String str, long j2) {
        this.f24617h = c4445a;
        this.f24615f = str;
        this.f24616g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4445a c4445a = this.f24617h;
        String str = this.f24615f;
        long j2 = this.f24616g;
        c4445a.mo10381b();
        C2622l.m5359e(str);
        Integer num = c4445a.f23689c.get(str);
        if (num == null) {
            c4445a.mo10684l().f24418f.m10812b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C4585l7 c4585l7M10628w = c4445a.m10386q().m10628w(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            c4445a.f23689c.put(str, Integer.valueOf(iIntValue));
            return;
        }
        c4445a.f23689c.remove(str);
        Long l = c4445a.f23688b.get(str);
        if (l == null) {
            c4445a.mo10684l().f24418f.m10811a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j2 - l.longValue();
            c4445a.f23688b.remove(str);
            c4445a.m10375w(str, jLongValue, c4585l7M10628w);
        }
        if (c4445a.f23689c.isEmpty()) {
            long j3 = c4445a.f23690d;
            if (j3 == 0) {
                c4445a.mo10684l().f24418f.m10811a("First ad exposure time was never set");
            } else {
                c4445a.m10373u(j2 - j3, c4585l7M10628w);
                c4445a.f23690d = 0L;
            }
        }
    }
}
