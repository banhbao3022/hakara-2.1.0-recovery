package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rp1 extends pp1 {

    /* JADX INFO: renamed from: a */
    public final String f19022a;

    /* JADX INFO: renamed from: b */
    public final boolean f19023b;

    /* JADX INFO: renamed from: c */
    public final boolean f19024c;

    public /* synthetic */ rp1(String str, boolean z, boolean z2) {
        this.f19022a = str;
        this.f19023b = z;
        this.f19024c = z2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.pp1
    /* JADX INFO: renamed from: a */
    public final String mo8144a() {
        return this.f19022a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.pp1
    /* JADX INFO: renamed from: b */
    public final boolean mo8145b() {
        return this.f19023b;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.pp1
    /* JADX INFO: renamed from: c */
    public final boolean mo8146c() {
        return this.f19024c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pp1) {
            pp1 pp1Var = (pp1) obj;
            if (this.f19022a.equals(pp1Var.mo8144a()) && this.f19023b == pp1Var.mo8145b() && this.f19024c == pp1Var.mo8146c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f19022a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f19023b ? 1237 : 1231)) * 1000003) ^ (true == this.f19024c ? 1231 : 1237);
    }

    public final String toString() {
        String str = this.f19022a;
        boolean z = this.f19023b;
        boolean z2 = this.f19024c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
