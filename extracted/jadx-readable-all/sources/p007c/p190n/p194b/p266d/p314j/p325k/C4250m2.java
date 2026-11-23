package p007c.p190n.p194b.p266d.p314j.p325k;

import android.net.Uri;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: c.n.b.d.j.k.m2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4250m2 {

    /* JADX INFO: renamed from: a */
    public static final ArrayMap<String, Uri> f23311a = new ArrayMap<>();

    /* JADX INFO: renamed from: a */
    public static synchronized Uri m10005a(String str) {
        Uri orDefault;
        ArrayMap<String, Uri> arrayMap = f23311a;
        orDefault = arrayMap.getOrDefault(str, null);
        if (orDefault == null) {
            String strValueOf = String.valueOf(Uri.encode(str));
            orDefault = Uri.parse(strValueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf) : new String("content://com.google.android.gms.phenotype/"));
            arrayMap.put(str, orDefault);
        }
        return orDefault;
    }
}
