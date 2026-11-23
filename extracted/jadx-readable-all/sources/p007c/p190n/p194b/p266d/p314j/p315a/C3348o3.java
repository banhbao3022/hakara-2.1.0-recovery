package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.a.o3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3348o3 extends AbstractC3385p3 {
    /* JADX INFO: renamed from: b */
    public static final String m7957b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < str.length() && str.charAt(i2) == ',') {
            i2++;
        }
        while (length > 0) {
            int i3 = length - 1;
            if (str.charAt(i3) != ',') {
                break;
            }
            length = i3;
        }
        if (length < i2) {
            return null;
        }
        if (i2 != 0) {
            i = i2;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3385p3
    /* JADX INFO: renamed from: a */
    public final String mo7572a(String str, String str2) {
        String strM7957b = m7957b(str);
        String strM7957b2 = m7957b(str2);
        if (TextUtils.isEmpty(strM7957b)) {
            return strM7957b2;
        }
        if (TextUtils.isEmpty(strM7957b2)) {
            return strM7957b;
        }
        return outline.m1552C(new StringBuilder(String.valueOf(strM7957b).length() + 1 + String.valueOf(strM7957b2).length()), strM7957b, ",", strM7957b2);
    }
}
