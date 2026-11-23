package p007c.p190n.p194b.p266d.p327k.p329b;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.k.b.a1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4447a1 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f23692f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f23693g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4445a f23694h;

    public RunnableC4447a1(C4445a c4445a, String str, long j2) {
        this.f23694h = c4445a;
        this.f23692f = str;
        this.f23693g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4445a c4445a = this.f23694h;
        String str = this.f23692f;
        long j2 = this.f23693g;
        c4445a.mo10381b();
        C2622l.m5359e(str);
        if (c4445a.f23689c.isEmpty()) {
            c4445a.f23690d = j2;
        }
        Integer num = c4445a.f23689c.get(str);
        if (num != null) {
            c4445a.f23689c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c4445a.f23689c.size() >= 100) {
            c4445a.mo10684l().f24421i.m10811a("Too many ads visible");
        } else {
            c4445a.f23689c.put(str, 1);
            c4445a.f23688b.put(str, Long.valueOf(j2));
        }
    }
}
