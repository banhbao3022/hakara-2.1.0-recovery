package p636z0.p725k.p739l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import java.util.Locale;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.k.l.c, reason: use source file name */
/* JADX INFO: compiled from: ContentInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class ContentInfoCompat {

    /* JADX INFO: renamed from: a */
    public final ClipData f38037a;

    /* JADX INFO: renamed from: b */
    public final int f38038b;

    /* JADX INFO: renamed from: c */
    public final int f38039c;

    /* JADX INFO: renamed from: d */
    public final Uri f38040d;

    /* JADX INFO: renamed from: e */
    public final Bundle f38041e;

    public ContentInfoCompat(a aVar) {
        ClipData clipData = aVar.f38042a;
        Objects.requireNonNull(clipData);
        this.f38037a = clipData;
        int i = aVar.f38043b;
        if (i < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 3));
        }
        if (i > 3) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 3));
        }
        this.f38038b = i;
        int i2 = aVar.f38044c;
        if ((i2 & 1) == i2) {
            this.f38039c = i2;
            this.f38040d = aVar.f38045d;
            this.f38041e = aVar.f38046e;
        } else {
            StringBuilder sbM1556G = outline.m1556G("Requested flags 0x");
            sbM1556G.append(Integer.toHexString(i2));
            sbM1556G.append(", but only 0x");
            sbM1556G.append(Integer.toHexString(1));
            sbM1556G.append(" are allowed");
            throw new IllegalArgumentException(sbM1556G.toString());
        }
    }

    public String toString() {
        String strValueOf;
        String string;
        StringBuilder sbM1556G = outline.m1556G("ContentInfoCompat{clip=");
        sbM1556G.append(this.f38037a.getDescription());
        sbM1556G.append(", source=");
        int i = this.f38038b;
        if (i == 0) {
            strValueOf = "SOURCE_APP";
        } else if (i == 1) {
            strValueOf = "SOURCE_CLIPBOARD";
        } else if (i != 2) {
            strValueOf = i != 3 ? String.valueOf(i) : "SOURCE_DRAG_AND_DROP";
        } else {
            strValueOf = "SOURCE_INPUT_METHOD";
        }
        sbM1556G.append(strValueOf);
        sbM1556G.append(", flags=");
        int i2 = this.f38039c;
        sbM1556G.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
        if (this.f38040d == null) {
            string = "";
        } else {
            StringBuilder sbM1556G2 = outline.m1556G(", hasLinkUri(");
            sbM1556G2.append(this.f38040d.toString().length());
            sbM1556G2.append(")");
            string = sbM1556G2.toString();
        }
        sbM1556G.append(string);
        return outline.m1550A(sbM1556G, this.f38041e != null ? ", hasExtras" : "", "}");
    }

    /* JADX INFO: renamed from: z0.k.l.c$a */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public ClipData f38042a;

        /* JADX INFO: renamed from: b */
        public int f38043b;

        /* JADX INFO: renamed from: c */
        public int f38044c;

        /* JADX INFO: renamed from: d */
        public Uri f38045d;

        /* JADX INFO: renamed from: e */
        public Bundle f38046e;

        public a(ContentInfoCompat contentInfoCompat) {
            this.f38042a = contentInfoCompat.f38037a;
            this.f38043b = contentInfoCompat.f38038b;
            this.f38044c = contentInfoCompat.f38039c;
            this.f38045d = contentInfoCompat.f38040d;
            this.f38046e = contentInfoCompat.f38041e;
        }

        public a(ClipData clipData, int i) {
            this.f38042a = clipData;
            this.f38043b = i;
        }
    }
}
