package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class sn1 {

    /* JADX INFO: renamed from: a */
    public final String f19627a;

    /* JADX INFO: renamed from: b */
    public final String f19628b;

    public sn1(String str, String str2) {
        this.f19627a = str;
        this.f19628b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static sn1 m8357a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        return new sn1(str, str2);
    }
}
