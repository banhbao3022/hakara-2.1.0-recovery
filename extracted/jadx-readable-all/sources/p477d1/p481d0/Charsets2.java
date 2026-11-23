package p477d1.p481d0;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.charset.Charset;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.d0.c, reason: use source file name */
/* JADX INFO: compiled from: Charsets.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Charsets2 {

    /* JADX INFO: renamed from: a */
    public static final Charset f29452a;

    /* JADX INFO: renamed from: b */
    public static Charset f29453b;

    /* JADX INFO: renamed from: c */
    public static Charset f29454c;

    /* JADX INFO: renamed from: d */
    public static final Charsets2 f29455d = null;

    static {
        Charset charsetForName = Charset.forName(Utf8Charset.NAME);
        Intrinsics2.m13088d(charsetForName, "Charset.forName(\"UTF-8\")");
        f29452a = charsetForName;
        Intrinsics2.m13088d(Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        Intrinsics2.m13088d(Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        Intrinsics2.m13088d(Charset.forName("UTF-16LE"), "Charset.forName(\"UTF-16LE\")");
        Intrinsics2.m13088d(Charset.forName("US-ASCII"), "Charset.forName(\"US-ASCII\")");
        Intrinsics2.m13088d(Charset.forName("ISO-8859-1"), "Charset.forName(\"ISO-8859-1\")");
    }
}
