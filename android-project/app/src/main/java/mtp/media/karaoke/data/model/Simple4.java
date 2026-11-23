package mtp.media.karaoke.data.model;

import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: mtp.media.karaoke.data.model.Link, reason: use source file name */
/* JADX INFO: compiled from: Simple.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Simple4 {
    private String text;
    private String url;

    public Simple4(String str, String str2) {
        Intrinsics2.m13089e(str, "text");
        Intrinsics2.m13089e(str2, "url");
        this.text = str;
        this.url = str2;
    }

    public static /* synthetic */ Simple4 copy$default(Simple4 simple4, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simple4.text;
        }
        if ((i & 2) != 0) {
            str2 = simple4.url;
        }
        return simple4.copy(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.url;
    }

    public final Simple4 copy(String str, String str2) {
        Intrinsics2.m13089e(str, "text");
        Intrinsics2.m13089e(str2, "url");
        return new Simple4(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Simple4)) {
            return false;
        }
        Simple4 simple4 = (Simple4) obj;
        return Intrinsics2.m13085a(this.text, simple4.text) && Intrinsics2.m13085a(this.url, simple4.url);
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setText(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.text = str;
    }

    public final void setUrl(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.url = str;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Link(text=");
        sbM1556G.append(this.text);
        sbM1556G.append(", url=");
        return outline.m1550A(sbM1556G, this.url, ")");
    }
}
