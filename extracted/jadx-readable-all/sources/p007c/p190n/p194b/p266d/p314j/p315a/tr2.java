package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tr2 {

    /* JADX INFO: renamed from: a */
    public final String f19974a;

    /* JADX INFO: renamed from: b */
    public final String f19975b;

    public tr2(String str, String str2) {
        this.f19974a = str;
        this.f19975b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tr2.class == obj.getClass()) {
            tr2 tr2Var = (tr2) obj;
            if (TextUtils.equals(this.f19974a, tr2Var.f19974a) && TextUtils.equals(this.f19975b, tr2Var.f19975b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19975b.hashCode() + (this.f19974a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.f19974a;
        String str2 = this.f19975b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        outline.m1572W(sb, "Header[name=", str, ",value=", str2);
        sb.append("]");
        return sb.toString();
    }
}
