package p007c.p190n.p194b.p266d.p314j.p325k;

/* JADX INFO: renamed from: c.n.b.d.j.k.q5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C4309q5 {

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC4240l6 f23418a;

    /* JADX INFO: renamed from: b */
    public volatile AbstractC4402x3 f23419b;

    static {
        C4280o4.m10117a();
    }

    /* JADX INFO: renamed from: a */
    public final int m10168a() {
        if (this.f23419b != null) {
            return this.f23419b.mo9502f();
        }
        if (this.f23418a != null) {
            return this.f23418a.mo9420i();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC4240l6 m10169b(InterfaceC4240l6 interfaceC4240l6) {
        if (this.f23418a == null) {
            synchronized (this) {
                if (this.f23418a == null) {
                    try {
                        this.f23418a = interfaceC4240l6;
                        this.f23419b = AbstractC4402x3.f23614f;
                    } catch (C4239l5 unused) {
                        this.f23418a = interfaceC4240l6;
                        this.f23419b = AbstractC4402x3.f23614f;
                    }
                }
            }
        }
        return this.f23418a;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC4402x3 m10170c() {
        if (this.f23419b != null) {
            return this.f23419b;
        }
        synchronized (this) {
            if (this.f23419b != null) {
                return this.f23419b;
            }
            if (this.f23418a == null) {
                this.f23419b = AbstractC4402x3.f23614f;
            } else {
                this.f23419b = this.f23418a.mo10003a();
            }
            return this.f23419b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4309q5)) {
            return false;
        }
        C4309q5 c4309q5 = (C4309q5) obj;
        InterfaceC4240l6 interfaceC4240l6 = this.f23418a;
        InterfaceC4240l6 interfaceC4240l7 = c4309q5.f23418a;
        if (interfaceC4240l6 == null && interfaceC4240l7 == null) {
            return m10170c().equals(c4309q5.m10170c());
        }
        if (interfaceC4240l6 == null || interfaceC4240l7 == null) {
            return interfaceC4240l6 != null ? interfaceC4240l6.equals(c4309q5.m10169b(interfaceC4240l6.mo9418g())) : m10169b(interfaceC4240l7.mo9418g()).equals(interfaceC4240l7);
        }
        return interfaceC4240l6.equals(interfaceC4240l7);
    }

    public int hashCode() {
        return 1;
    }
}
