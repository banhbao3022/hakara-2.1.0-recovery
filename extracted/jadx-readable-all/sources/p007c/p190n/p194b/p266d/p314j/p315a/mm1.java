package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mm1 {

    /* JADX INFO: renamed from: a */
    public final String f16798a;

    /* JADX INFO: renamed from: b */
    public final String f16799b;

    public mm1(String str, String str2) {
        this.f16798a = str;
        this.f16799b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm1)) {
            return false;
        }
        mm1 mm1Var = (mm1) obj;
        return this.f16798a.equals(mm1Var.f16798a) && this.f16799b.equals(mm1Var.f16799b);
    }

    public final int hashCode() {
        String strValueOf = String.valueOf(this.f16798a);
        String strValueOf2 = String.valueOf(this.f16799b);
        return (strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf)).hashCode();
    }
}
