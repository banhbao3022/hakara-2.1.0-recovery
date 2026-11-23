package p007c.p085g.p086a.p089m;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: renamed from: c.g.a.m.k, reason: use source file name */
/* JADX INFO: compiled from: Key.java */
/* JADX INFO: loaded from: classes.dex */
public interface Key {

    /* JADX INFO: renamed from: a */
    public static final Charset f3032a = Charset.forName(Utf8Charset.NAME);

    /* JADX INFO: renamed from: a */
    void mo1703a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
