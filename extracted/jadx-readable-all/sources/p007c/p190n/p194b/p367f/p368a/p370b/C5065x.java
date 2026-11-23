package p007c.p190n.p194b.p367f.p368a.p370b;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.f.a.b.x */
/* JADX INFO: loaded from: classes.dex */
public final class C5065x extends AbstractC4982b {

    /* JADX INFO: renamed from: b */
    public final int f25996b;

    /* JADX INFO: renamed from: c */
    public final String f25997c;

    /* JADX INFO: renamed from: d */
    public final String f25998d;

    public C5065x(int i, String str, String str2) {
        this.f25996b = i;
        this.f25997c = str;
        this.f25998d = str2;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.AbstractC4982b
    /* JADX INFO: renamed from: a */
    public final String mo11422a() {
        return this.f25998d;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.AbstractC4982b
    /* JADX INFO: renamed from: b */
    public final int mo11423b() {
        return this.f25996b;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.AbstractC4982b
    /* JADX INFO: renamed from: c */
    public final String mo11424c() {
        return this.f25997c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4982b) {
            AbstractC4982b abstractC4982b = (AbstractC4982b) obj;
            if (this.f25996b == abstractC4982b.mo11423b() && ((str = this.f25997c) != null ? str.equals(abstractC4982b.mo11424c()) : abstractC4982b.mo11424c() == null)) {
                String str2 = this.f25998d;
                String strMo11422a = abstractC4982b.mo11422a();
                if (str2 != null ? str2.equals(strMo11422a) : strMo11422a == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f25996b ^ 1000003) * 1000003;
        String str = this.f25997c;
        int iHashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f25998d;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.f25996b;
        String str = this.f25997c;
        String str2 = this.f25998d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        return outline.m1552C(sb, ", assetsPath=", str2, "}");
    }
}
