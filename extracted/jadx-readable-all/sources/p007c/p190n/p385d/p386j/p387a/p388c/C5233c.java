package p007c.p190n.p385d.p386j.p387a.p388c;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p007c.p190n.p194b.p266d.p327k.p329b.C4741z5;

/* JADX INFO: renamed from: c.n.d.j.a.c.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5233c {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f26334a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* JADX INFO: renamed from: b */
    public static final List<String> f26335b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c */
    public static final List<String> f26336c = Arrays.asList("auto", "app", "am");

    /* JADX INFO: renamed from: d */
    public static final List<String> f26337d = Arrays.asList("_r", "_dbg");

    /* JADX INFO: renamed from: e */
    public static final List<String> f26338e;

    /* JADX INFO: renamed from: f */
    public static final List<String> f26339f;

    static {
        String[][] strArr = {C4741z5.f24622a, C4741z5.f24623b};
        int length = 0;
        for (int i = 0; i < 2; i++) {
            length += strArr[i].length;
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr[0], length);
        int length2 = strArr[0].length;
        for (int i2 = 1; i2 < 2; i2++) {
            String[] strArr2 = strArr[i2];
            int length3 = strArr2.length;
            System.arraycopy(strArr2, 0, objArrCopyOf, length2, length3);
            length2 += length3;
        }
        f26338e = Arrays.asList((String[]) objArrCopyOf);
        f26339f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11680a(String str) {
        return !f26336c.contains(str);
    }
}
