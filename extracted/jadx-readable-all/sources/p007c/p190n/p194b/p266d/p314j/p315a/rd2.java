package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rd2 {

    /* JADX INFO: renamed from: a */
    public static final String[] f18747a = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* JADX INFO: renamed from: b */
    public final String f18748b = "ad.doubleclick.net";

    /* JADX INFO: renamed from: c */
    public final String[] f18749c = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* JADX INFO: renamed from: d */
    public final tb2 f18750d;

    public rd2(tb2 tb2Var) {
        this.f18750d = tb2Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8271a(Uri uri) {
        Objects.requireNonNull(uri);
        try {
            String host = uri.getHost();
            String[] strArr = this.f18749c;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final Uri m8272b(Uri uri, Context context, View view, Activity activity) throws sd2 {
        try {
            return m8273c(uri, this.f18750d.mo4854c(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new sd2("Provided Uri is not in a valid state");
        }
    }

    /* JADX INFO: renamed from: c */
    public final Uri m8273c(Uri uri, String str) throws sd2 {
        Objects.requireNonNull(uri);
        try {
            try {
                if (uri.getHost().equals(this.f18748b)) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new sd2("Parameter already exists: dc_ms");
                    }
                    String string = uri.toString();
                    int iIndexOf = string.indexOf(";adurl");
                    if (iIndexOf != -1) {
                        int i = iIndexOf + 1;
                        return Uri.parse(string.substring(0, i) + "dc_ms=" + str + ";" + string.substring(i));
                    }
                    String encodedPath = uri.getEncodedPath();
                    int iIndexOf2 = string.indexOf(encodedPath);
                    return Uri.parse(string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string.substring(iIndexOf2 + encodedPath.length()));
                }
            } catch (UnsupportedOperationException unused) {
                throw new sd2("Provided Uri is not in a valid state");
            }
        } catch (NullPointerException unused2) {
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new sd2("Query parameter already exists: ms");
        }
        String string2 = uri.toString();
        int iIndexOf3 = string2.indexOf("&adurl");
        if (iIndexOf3 == -1) {
            iIndexOf3 = string2.indexOf("?adurl");
        }
        if (iIndexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i2 = iIndexOf3 + 1;
        return Uri.parse(string2.substring(0, i2) + "ms=" + str + "&" + string2.substring(i2));
    }
}
