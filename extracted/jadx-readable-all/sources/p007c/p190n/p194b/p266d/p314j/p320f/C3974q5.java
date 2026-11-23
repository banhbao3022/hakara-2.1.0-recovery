package p007c.p190n.p194b.p266d.p314j.p320f;

/* JADX INFO: renamed from: c.n.b.d.j.f.q5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C3974q5 {

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC3895i6 f22850a;

    /* JADX INFO: renamed from: b */
    public volatile AbstractC3823b4 f22851b;

    static {
        C3933m4.m9111a();
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC3895i6 m9200a(InterfaceC3895i6 interfaceC3895i6) {
        if (this.f22850a == null) {
            synchronized (this) {
                if (this.f22850a == null) {
                    try {
                        this.f22850a = interfaceC3895i6;
                        this.f22851b = AbstractC3823b4.f22519f;
                    } catch (C3884h5 unused) {
                        this.f22850a = interfaceC3895i6;
                        this.f22851b = AbstractC3823b4.f22519f;
                    }
                }
            }
        }
        return this.f22850a;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC3823b4 m9201b() {
        if (this.f22851b != null) {
            return this.f22851b;
        }
        synchronized (this) {
            if (this.f22851b != null) {
                return this.f22851b;
            }
            if (this.f22850a == null) {
                this.f22851b = AbstractC3823b4.f22519f;
            } else {
                this.f22851b = this.f22850a.mo9041a();
            }
            return this.f22851b;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m9202c() {
        if (this.f22851b != null) {
            return this.f22851b.size();
        }
        if (this.f22850a != null) {
            return this.f22850a.mo9043e();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3974q5)) {
            return false;
        }
        C3974q5 c3974q5 = (C3974q5) obj;
        InterfaceC3895i6 interfaceC3895i6 = this.f22850a;
        InterfaceC3895i6 interfaceC3895i7 = c3974q5.f22850a;
        if (interfaceC3895i6 == null && interfaceC3895i7 == null) {
            return m9201b().equals(c3974q5.m9201b());
        }
        if (interfaceC3895i6 == null || interfaceC3895i7 == null) {
            return interfaceC3895i6 != null ? interfaceC3895i6.equals(c3974q5.m9200a(interfaceC3895i6.mo9049d())) : m9200a(interfaceC3895i7.mo9049d()).equals(interfaceC3895i7);
        }
        return interfaceC3895i6.equals(interfaceC3895i7);
    }

    public int hashCode() {
        return 1;
    }
}
