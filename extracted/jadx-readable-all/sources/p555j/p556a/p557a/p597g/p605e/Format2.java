package p555j.p556a.p557a.p597g.p605e;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: j.a.a.g.e.a, reason: use source file name */
/* JADX INFO: compiled from: Format.java */
/* JADX INFO: loaded from: classes.dex */
public class Format2 {

    /* JADX INFO: renamed from: a */
    public int f32199a;

    /* JADX INFO: renamed from: b */
    public String f32200b;

    /* JADX INFO: renamed from: c */
    public int f32201c;

    /* JADX INFO: renamed from: d */
    public int f32202d;

    /* JADX INFO: renamed from: e */
    public int f32203e;

    /* JADX INFO: renamed from: f */
    public boolean f32204f;

    /* JADX INFO: renamed from: g */
    public boolean f32205g;

    public Format2(int i, String str, int i2, boolean z) {
        this.f32199a = i;
        this.f32200b = str;
        this.f32201c = i2;
        this.f32202d = 30;
        this.f32203e = -1;
        this.f32204f = z;
        this.f32205g = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Format2.class != obj.getClass()) {
            return false;
        }
        Format2 format2 = (Format2) obj;
        if (this.f32199a != format2.f32199a || this.f32201c != format2.f32201c || this.f32202d != format2.f32202d || this.f32203e != format2.f32203e || this.f32204f != format2.f32204f || this.f32205g != format2.f32205g) {
            return false;
        }
        String str = this.f32200b;
        String str2 = format2.f32200b;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        int i = this.f32199a * 31;
        String str = this.f32200b;
        return ((((((((((((((i + (str != null ? str.hashCode() : 0)) * 31) + this.f32201c) * 31) + this.f32202d) * 31) + 0) * 31) + 0) * 31) + this.f32203e) * 31) + (this.f32204f ? 1 : 0)) * 31) + (this.f32205g ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Format{itag=");
        sbM1556G.append(this.f32199a);
        sbM1556G.append(", ext='");
        sbM1556G.append(this.f32200b);
        sbM1556G.append('\'');
        sbM1556G.append(", height=");
        sbM1556G.append(this.f32201c);
        sbM1556G.append(", fps=");
        sbM1556G.append(this.f32202d);
        sbM1556G.append(", vCodec=");
        sbM1556G.append((Object) null);
        sbM1556G.append(", aCodec=");
        sbM1556G.append((Object) null);
        sbM1556G.append(", audioBitrate=");
        sbM1556G.append(this.f32203e);
        sbM1556G.append(", isDashContainer=");
        sbM1556G.append(this.f32204f);
        sbM1556G.append(", isHlsContent=");
        sbM1556G.append(this.f32205g);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }

    public Format2(int i, String str, int i2, int i3, int i4, boolean z) {
        this.f32199a = i;
        this.f32200b = str;
        this.f32201c = -1;
        this.f32202d = 30;
        this.f32203e = i4;
        this.f32204f = z;
        this.f32205g = false;
    }

    public Format2(int i, String str, int i2, int i3, boolean z) {
        this.f32199a = i;
        this.f32200b = str;
        this.f32201c = i2;
        this.f32202d = 30;
        this.f32203e = i3;
        this.f32204f = z;
        this.f32205g = false;
    }

    public Format2(int i, String str, int i2, int i3, boolean z, boolean z2) {
        this.f32199a = i;
        this.f32200b = str;
        this.f32201c = i2;
        this.f32202d = 30;
        this.f32203e = i3;
        this.f32204f = z;
        this.f32205g = z2;
    }

    public Format2(int i, String str, int i2, int i3, int i4, int i5, boolean z) {
        this.f32199a = i;
        this.f32200b = str;
        this.f32201c = i2;
        this.f32203e = -1;
        this.f32202d = i4;
        this.f32204f = z;
        this.f32205g = false;
    }
}
