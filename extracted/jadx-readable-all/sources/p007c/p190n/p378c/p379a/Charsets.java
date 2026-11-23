package p007c.p190n.p378c.p379a;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: c.n.c.a.c, reason: use source file name */
/* JADX INFO: compiled from: Charsets.java */
/* JADX INFO: loaded from: classes.dex */
public final class Charsets {

    /* JADX INFO: renamed from: a */
    public static final Charset f26129a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    public static final Charset f26130b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c */
    public static final Charset f26131c = Charset.forName(Utf8Charset.NAME);

    /* JADX INFO: renamed from: d */
    public static final Charset f26132d;

    /* JADX INFO: renamed from: e */
    public static final Charset f26133e;

    static {
        Charset.forName("UTF-16BE");
        f26132d = Charset.forName("UTF-16LE");
        f26133e = Charset.forName("UTF-16");
    }
}
