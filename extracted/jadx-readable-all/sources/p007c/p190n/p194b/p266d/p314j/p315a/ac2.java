package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ac2 implements j82 {

    /* JADX INFO: renamed from: a */
    public static final j82 f12068a = new ac2();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j82
    /* JADX INFO: renamed from: b */
    public final boolean mo5728b(int i) {
        bc2 bc2Var;
        switch (i) {
            case 0:
                bc2Var = bc2.UNKNOWN;
                break;
            case 1:
                bc2Var = bc2.URL_PHISHING;
                break;
            case 2:
                bc2Var = bc2.URL_MALWARE;
                break;
            case 3:
                bc2Var = bc2.URL_UNWANTED;
                break;
            case 4:
                bc2Var = bc2.CLIENT_SIDE_PHISHING_URL;
                break;
            case 5:
                bc2Var = bc2.CLIENT_SIDE_MALWARE_URL;
                break;
            case 6:
                bc2Var = bc2.DANGEROUS_DOWNLOAD_RECOVERY;
                break;
            case 7:
                bc2Var = bc2.DANGEROUS_DOWNLOAD_WARNING;
                break;
            case 8:
                bc2Var = bc2.OCTAGON_AD;
                break;
            case 9:
                bc2Var = bc2.OCTAGON_AD_SB_MATCH;
                break;
            default:
                bc2Var = null;
                break;
        }
        return bc2Var != null;
    }
}
