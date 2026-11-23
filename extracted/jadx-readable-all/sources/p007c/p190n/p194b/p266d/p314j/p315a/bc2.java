package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public enum bc2 implements i82 {
    UNKNOWN(0),
    URL_PHISHING(1),
    URL_MALWARE(2),
    URL_UNWANTED(3),
    CLIENT_SIDE_PHISHING_URL(4),
    CLIENT_SIDE_MALWARE_URL(5),
    DANGEROUS_DOWNLOAD_RECOVERY(6),
    DANGEROUS_DOWNLOAD_WARNING(7),
    OCTAGON_AD(8),
    OCTAGON_AD_SB_MATCH(9);


    /* JADX INFO: renamed from: q */
    public final int f12568q;

    bc2(int i) {
        this.f12568q = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + bc2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f12568q + " name=" + name() + '>';
    }
}
