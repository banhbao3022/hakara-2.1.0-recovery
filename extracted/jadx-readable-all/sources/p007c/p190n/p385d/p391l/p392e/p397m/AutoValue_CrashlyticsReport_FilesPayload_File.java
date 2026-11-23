package p007c.p190n.p385d.p391l.p392e.p397m;

import java.util.Arrays;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.m.e, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_CrashlyticsReport_FilesPayload_File extends CrashlyticsReport.c.b {

    /* JADX INFO: renamed from: a */
    public final String f26721a;

    /* JADX INFO: renamed from: b */
    public final byte[] f26722b;

    /* JADX INFO: renamed from: c.n.d.l.e.m.e$b */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
    public static final class b extends CrashlyticsReport.c.b.a {

        /* JADX INFO: renamed from: a */
        public String f26723a;

        /* JADX INFO: renamed from: b */
        public byte[] f26724b;

        /* JADX INFO: renamed from: a */
        public CrashlyticsReport.c.b m11855a() {
            String strM1599u = this.f26723a == null ? " filename" : "";
            if (this.f26724b == null) {
                strM1599u = outline.m1599u(strM1599u, " contents");
            }
            if (strM1599u.isEmpty()) {
                return new AutoValue_CrashlyticsReport_FilesPayload_File(this.f26723a, this.f26724b, null);
            }
            throw new IllegalStateException(outline.m1599u("Missing required properties:", strM1599u));
        }

        /* JADX INFO: renamed from: b */
        public CrashlyticsReport.c.b.a m11856b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.f26724b = bArr;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public CrashlyticsReport.c.b.a m11857c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.f26723a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_FilesPayload_File(String str, byte[] bArr, a aVar) {
        this.f26721a = str;
        this.f26722b = bArr;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.c.b
    /* JADX INFO: renamed from: a */
    public byte[] mo11853a() {
        return this.f26722b;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport.c.b
    /* JADX INFO: renamed from: b */
    public String mo11854b() {
        return this.f26721a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.c.b)) {
            return false;
        }
        CrashlyticsReport.c.b bVar = (CrashlyticsReport.c.b) obj;
        if (this.f26721a.equals(bVar.mo11854b())) {
            if (Arrays.equals(this.f26722b, bVar instanceof AutoValue_CrashlyticsReport_FilesPayload_File ? ((AutoValue_CrashlyticsReport_FilesPayload_File) bVar).f26722b : bVar.mo11853a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f26721a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f26722b);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("File{filename=");
        sbM1556G.append(this.f26721a);
        sbM1556G.append(", contents=");
        sbM1556G.append(Arrays.toString(this.f26722b));
        sbM1556G.append("}");
        return sbM1556G.toString();
    }
}
