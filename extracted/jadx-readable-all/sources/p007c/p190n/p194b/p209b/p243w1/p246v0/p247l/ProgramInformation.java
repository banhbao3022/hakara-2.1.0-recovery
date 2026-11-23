package p007c.p190n.p194b.p209b.p243w1.p246v0.p247l;

import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.w1.v0.l.g, reason: use source file name */
/* JADX INFO: compiled from: ProgramInformation.java */
/* JADX INFO: loaded from: classes.dex */
public class ProgramInformation {

    /* JADX INFO: renamed from: a */
    public final String f9290a;

    /* JADX INFO: renamed from: b */
    public final String f9291b;

    /* JADX INFO: renamed from: c */
    public final String f9292c;

    /* JADX INFO: renamed from: d */
    public final String f9293d;

    /* JADX INFO: renamed from: e */
    public final String f9294e;

    public ProgramInformation(String str, String str2, String str3, String str4, String str5) {
        this.f9290a = str;
        this.f9291b = str2;
        this.f9292c = str3;
        this.f9293d = str4;
        this.f9294e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProgramInformation.class != obj.getClass()) {
            return false;
        }
        ProgramInformation programInformation = (ProgramInformation) obj;
        return Util6.m3113a(this.f9290a, programInformation.f9290a) && Util6.m3113a(this.f9291b, programInformation.f9291b) && Util6.m3113a(this.f9292c, programInformation.f9292c) && Util6.m3113a(this.f9293d, programInformation.f9293d) && Util6.m3113a(this.f9294e, programInformation.f9294e);
    }

    public int hashCode() {
        String str = this.f9290a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9291b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9292c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f9293d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f9294e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
