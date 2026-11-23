package p555j.p556a.p557a.p597g.p605e;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: j.a.a.g.e.d, reason: use source file name */
/* JADX INFO: compiled from: YtFile.java */
/* JADX INFO: loaded from: classes.dex */
public class YtFile {

    /* JADX INFO: renamed from: a */
    public Format2 f32250a;

    /* JADX INFO: renamed from: b */
    public String f32251b;

    public YtFile(Format2 format2, String str) {
        this.f32251b = "";
        this.f32250a = format2;
        this.f32251b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || YtFile.class != obj.getClass()) {
            return false;
        }
        YtFile ytFile = (YtFile) obj;
        Format2 format2 = this.f32250a;
        if (format2 == null ? ytFile.f32250a != null : !format2.equals(ytFile.f32250a)) {
            return false;
        }
        String str = this.f32251b;
        String str2 = ytFile.f32251b;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        Format2 format2 = this.f32250a;
        int iHashCode = (format2 != null ? format2.hashCode() : 0) * 31;
        String str = this.f32251b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("YtFile{format=");
        sbM1556G.append(this.f32250a);
        sbM1556G.append(", url='");
        sbM1556G.append(this.f32251b);
        sbM1556G.append('\'');
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
