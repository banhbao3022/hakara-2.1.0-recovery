package p007c.p190n.p385d.p429x;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.x.a, reason: use source file name */
/* JADX INFO: compiled from: AutoValue_LibraryVersion.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoValue_LibraryVersion extends LibraryVersion {

    /* JADX INFO: renamed from: a */
    public final String f27304a;

    /* JADX INFO: renamed from: b */
    public final String f27305b;

    public AutoValue_LibraryVersion(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f27304a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f27305b = str2;
    }

    @Override // p007c.p190n.p385d.p429x.LibraryVersion
    /* JADX INFO: renamed from: a */
    public String mo12207a() {
        return this.f27304a;
    }

    @Override // p007c.p190n.p385d.p429x.LibraryVersion
    /* JADX INFO: renamed from: b */
    public String mo12208b() {
        return this.f27305b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LibraryVersion)) {
            return false;
        }
        LibraryVersion libraryVersion = (LibraryVersion) obj;
        return this.f27304a.equals(libraryVersion.mo12207a()) && this.f27305b.equals(libraryVersion.mo12208b());
    }

    public int hashCode() {
        return ((this.f27304a.hashCode() ^ 1000003) * 1000003) ^ this.f27305b.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("LibraryVersion{libraryName=");
        sbM1556G.append(this.f27304a);
        sbM1556G.append(", version=");
        return outline.m1550A(sbM1556G, this.f27305b, "}");
    }
}
