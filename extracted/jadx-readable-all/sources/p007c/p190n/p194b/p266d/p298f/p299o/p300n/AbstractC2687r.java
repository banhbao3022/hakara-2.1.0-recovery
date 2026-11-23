package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2606d;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a.b;
import p007c.p190n.p194b.p266d.p333n.C4782j;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.r */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2687r<A extends C2628a.b, ResultT> {

    /* JADX INFO: renamed from: a */
    public final C2606d[] f11746a;

    /* JADX INFO: renamed from: b */
    public final boolean f11747b;

    /* JADX INFO: renamed from: c.n.b.d.f.o.n.r$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class a<A extends C2628a.b, ResultT> {

        /* JADX INFO: renamed from: a */
        public InterfaceC2681o<A, C4782j<ResultT>> f11748a;

        /* JADX INFO: renamed from: b */
        public boolean f11749b = true;

        /* JADX INFO: renamed from: c */
        public C2606d[] f11750c;

        public a(C2690s0 c2690s0) {
        }

        /* JADX INFO: renamed from: a */
        public AbstractC2687r<A, ResultT> m5553a() {
            C2622l.m5344b(this.f11748a != null, "execute parameter required");
            return new C2692t0(this, this.f11750c, this.f11749b);
        }
    }

    @Deprecated
    public AbstractC2687r() {
        this.f11746a = null;
        this.f11747b = false;
    }

    /* JADX INFO: renamed from: a */
    public static <A extends C2628a.b, ResultT> a<A, ResultT> m5551a() {
        return new a<>(null);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo5552b(A a2, C4782j<ResultT> c4782j) throws RemoteException;

    public AbstractC2687r(C2606d[] c2606dArr, boolean z, C2690s0 c2690s0) {
        this.f11746a = c2606dArr;
        this.f11747b = z;
    }
}
