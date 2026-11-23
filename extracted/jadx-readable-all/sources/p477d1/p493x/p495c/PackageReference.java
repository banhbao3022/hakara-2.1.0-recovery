package p477d1.p493x.p495c;

/* JADX INFO: renamed from: d1.x.c.l, reason: use source file name */
/* JADX INFO: compiled from: PackageReference.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PackageReference implements ClassBasedDeclarationContainer {

    /* JADX INFO: renamed from: a */
    public final Class<?> f29601a;

    public PackageReference(Class<?> cls, String str) {
        Intrinsics2.m13089e(cls, "jClass");
        Intrinsics2.m13089e(str, "moduleName");
        this.f29601a = cls;
    }

    @Override // p477d1.p493x.p495c.ClassBasedDeclarationContainer
    /* JADX INFO: renamed from: b */
    public Class<?> mo13082b() {
        return this.f29601a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof PackageReference) && Intrinsics2.m13085a(this.f29601a, ((PackageReference) obj).f29601a);
    }

    public int hashCode() {
        return this.f29601a.hashCode();
    }

    public String toString() {
        return this.f29601a.toString() + " (Kotlin reflection is not available)";
    }
}
