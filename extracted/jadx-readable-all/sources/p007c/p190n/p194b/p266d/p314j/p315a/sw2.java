package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import p007c.p190n.p194b.p266d.p267a.C2177g;
import p007c.p190n.p194b.p266d.p267a.C2190q;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class sw2 {

    /* JADX INFO: renamed from: a */
    public final C2177g[] f19727a;

    /* JADX INFO: renamed from: b */
    public final String f19728b;

    public sw2(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C2190q.f10580a);
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(1);
        boolean z = !TextUtils.isEmpty(string);
        boolean zIsEmpty = true ^ TextUtils.isEmpty(string2);
        if (z && !zIsEmpty) {
            this.f19727a = m8371a(string);
        } else {
            if (z || !zIsEmpty) {
                if (z) {
                    typedArrayObtainAttributes.recycle();
                    throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
                }
                typedArrayObtainAttributes.recycle();
                throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
            }
            this.f19727a = m8371a(string2);
        }
        String string3 = typedArrayObtainAttributes.getString(2);
        this.f19728b = string3;
        typedArrayObtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    /* JADX INFO: renamed from: a */
    public static C2177g[] m8371a(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        C2177g[] c2177gArr = new C2177g[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            String strTrim = strArrSplit[i].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    c2177gArr[i] = new C2177g("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : Integer.parseInt(strArrSplit2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException(strTrim.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(strTrim) : new String("Could not parse XML attribute \"adSize\": "));
                }
            } else if ("BANNER".equals(strTrim)) {
                c2177gArr[i] = C2177g.f10556a;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                c2177gArr[i] = C2177g.f10558c;
            } else if ("FULL_BANNER".equals(strTrim)) {
                c2177gArr[i] = C2177g.f10557b;
            } else if ("LEADERBOARD".equals(strTrim)) {
                c2177gArr[i] = C2177g.f10559d;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                c2177gArr[i] = C2177g.f10560e;
            } else if ("SMART_BANNER".equals(strTrim)) {
                c2177gArr[i] = C2177g.f10562g;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                c2177gArr[i] = C2177g.f10561f;
            } else if ("FLUID".equals(strTrim)) {
                c2177gArr[i] = C2177g.f10563h;
            } else {
                if (!"ICON".equals(strTrim)) {
                    throw new IllegalArgumentException(strTrim.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(strTrim) : new String("Could not parse XML attribute \"adSize\": "));
                }
                c2177gArr[i] = C2177g.f10565j;
            }
        }
        if (length == 0) {
            throw new IllegalArgumentException(str.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(str) : new String("Could not parse XML attribute \"adSize\": "));
        }
        return c2177gArr;
    }
}
