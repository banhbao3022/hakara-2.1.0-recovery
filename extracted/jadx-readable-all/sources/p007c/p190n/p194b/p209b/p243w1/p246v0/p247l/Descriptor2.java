package p007c.p190n.p194b.p209b.p243w1.p246v0.p247l;

import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.w1.v0.l.d, reason: use source file name */
/* JADX INFO: compiled from: Descriptor.java */
/* JADX INFO: loaded from: classes.dex */
public final class Descriptor2 {

    /* JADX INFO: renamed from: a */
    public final String f9279a;

    /* JADX INFO: renamed from: b */
    public final String f9280b;

    /* JADX INFO: renamed from: c */
    public final String f9281c;

    public Descriptor2(String str, String str2, String str3) {
        this.f9279a = str;
        this.f9280b = str2;
        this.f9281c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Descriptor2.class != obj.getClass()) {
            return false;
        }
        Descriptor2 descriptor2 = (Descriptor2) obj;
        return Util6.m3113a(this.f9279a, descriptor2.f9279a) && Util6.m3113a(this.f9280b, descriptor2.f9280b) && Util6.m3113a(this.f9281c, descriptor2.f9281c);
    }

    public int hashCode() {
        int iHashCode = this.f9279a.hashCode() * 31;
        String str = this.f9280b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9281c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
