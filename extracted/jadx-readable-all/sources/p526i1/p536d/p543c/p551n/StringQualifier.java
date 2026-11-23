package p526i1.p536d.p543c.p551n;

import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: i1.d.c.n.b, reason: use source file name */
/* JADX INFO: compiled from: StringQualifier.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StringQualifier implements Qualifier {

    /* JADX INFO: renamed from: a */
    public final String f30933a;

    public StringQualifier(String str) {
        Intrinsics2.m13090f(str, "value");
        this.f30933a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof StringQualifier) && Intrinsics2.m13085a(this.f30933a, ((StringQualifier) obj).f30933a);
        }
        return true;
    }

    @Override // p526i1.p536d.p543c.p551n.Qualifier
    public String getValue() {
        return this.f30933a;
    }

    public int hashCode() {
        String str = this.f30933a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return this.f30933a;
    }
}
