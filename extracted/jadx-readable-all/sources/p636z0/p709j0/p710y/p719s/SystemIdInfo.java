package p636z0.p709j0.p710y.p719s;

/* JADX INFO: renamed from: z0.j0.y.s.g, reason: use source file name */
/* JADX INFO: compiled from: SystemIdInfo.java */
/* JADX INFO: loaded from: classes.dex */
public class SystemIdInfo {

    /* JADX INFO: renamed from: a */
    public final String f37509a;

    /* JADX INFO: renamed from: b */
    public final int f37510b;

    public SystemIdInfo(String str, int i) {
        this.f37509a = str;
        this.f37510b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemIdInfo)) {
            return false;
        }
        SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
        if (this.f37510b != systemIdInfo.f37510b) {
            return false;
        }
        return this.f37509a.equals(systemIdInfo.f37509a);
    }

    public int hashCode() {
        return (this.f37509a.hashCode() * 31) + this.f37510b;
    }
}
