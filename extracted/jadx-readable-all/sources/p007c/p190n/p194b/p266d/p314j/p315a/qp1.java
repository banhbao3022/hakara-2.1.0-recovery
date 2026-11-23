package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class qp1 extends op1 {

    /* JADX INFO: renamed from: a */
    public String f18403a;

    /* JADX INFO: renamed from: b */
    public Boolean f18404b;

    /* JADX INFO: renamed from: c */
    public Boolean f18405c;

    /* JADX INFO: renamed from: a */
    public final op1 m8222a(boolean z) {
        this.f18404b = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final pp1 m8223b() {
        String strConcat = this.f18403a == null ? " clientVersion" : "";
        if (this.f18404b == null) {
            strConcat = strConcat.concat(" shouldGetAdvertisingId");
        }
        if (this.f18405c == null) {
            strConcat = String.valueOf(strConcat).concat(" isGooglePlayServicesAvailable");
        }
        if (strConcat.isEmpty()) {
            return new rp1(this.f18403a, this.f18404b.booleanValue(), this.f18405c.booleanValue());
        }
        throw new IllegalStateException(strConcat.length() != 0 ? "Missing required properties:".concat(strConcat) : new String("Missing required properties:"));
    }
}
