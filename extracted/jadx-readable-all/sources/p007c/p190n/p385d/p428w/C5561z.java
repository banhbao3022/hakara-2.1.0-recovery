package p007c.p190n.p385d.p428w;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.w.z */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5561z {

    /* JADX INFO: renamed from: a */
    public static final Pattern f27300a = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: b */
    public final String f27301b;

    /* JADX INFO: renamed from: c */
    public final String f27302c;

    /* JADX INFO: renamed from: d */
    public final String f27303d;

    public C5561z(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f27300a.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", strSubstring, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.f27301b = strSubstring;
        this.f27302c = str;
        this.f27303d = outline.m1552C(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()), str, "!", str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5561z)) {
            return false;
        }
        C5561z c5561z = (C5561z) obj;
        return this.f27301b.equals(c5561z.f27301b) && this.f27302c.equals(c5561z.f27302c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f27302c, this.f27301b});
    }
}
