package p007c.p190n.p194b.p266d.p327k.p329b;

import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;

/* JADX INFO: renamed from: c.n.b.d.k.b.l3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4581l3<V> {

    /* JADX INFO: renamed from: a */
    public static final Object f24102a = new Object();

    /* JADX INFO: renamed from: b */
    public final String f24103b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4557j3<V> f24104c;

    /* JADX INFO: renamed from: d */
    public final V f24105d;

    /* JADX INFO: renamed from: e */
    public final V f24106e;

    /* JADX INFO: renamed from: f */
    public final Object f24107f = new Object();

    /* JADX INFO: renamed from: g */
    public volatile V f24108g = null;

    /* JADX WARN: Multi-variable type inference failed */
    public C4581l3(String str, Object obj, Object obj2, InterfaceC4557j3 interfaceC4557j3, C4533h3 c4533h3) {
        this.f24103b = str;
        this.f24105d = obj;
        this.f24106e = obj2;
        this.f24104c = interfaceC4557j3;
    }

    /* JADX INFO: renamed from: a */
    public final V m10638a(V v) {
        synchronized (this.f24107f) {
        }
        if (v != null) {
            return v;
        }
        if (C4340s8.f23453a == null) {
            return this.f24105d;
        }
        synchronized (f24102a) {
            if (C4588la.m10646a()) {
                return this.f24108g == null ? this.f24105d : this.f24108g;
            }
            try {
                for (C4581l3<?> c4581l3 : C4647r.f24337a) {
                    if (C4588la.m10646a()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V v2 = null;
                    try {
                        InterfaceC4557j3<?> interfaceC4557j3 = c4581l3.f24104c;
                        if (interfaceC4557j3 != null) {
                            v2 = (V) interfaceC4557j3.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (f24102a) {
                        c4581l3.f24108g = v2;
                    }
                }
            } catch (SecurityException unused2) {
            }
            InterfaceC4557j3<V> interfaceC4557j4 = this.f24104c;
            if (interfaceC4557j4 == null) {
                return this.f24105d;
            }
            try {
                return interfaceC4557j4.zza();
            } catch (IllegalStateException unused3) {
                return this.f24105d;
            } catch (SecurityException unused4) {
                return this.f24105d;
            }
        }
    }
}
