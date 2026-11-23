package p007c.p085g.p086a.p089m;

import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.g.a.m.m, reason: use source file name */
/* JADX INFO: compiled from: Option.java */
/* JADX INFO: loaded from: classes.dex */
public final class Option<T> {

    /* JADX INFO: renamed from: a */
    public static final b<Object> f3034a = new a();

    /* JADX INFO: renamed from: b */
    public final T f3035b;

    /* JADX INFO: renamed from: c */
    public final b<T> f3036c;

    /* JADX INFO: renamed from: d */
    public final String f3037d;

    /* JADX INFO: renamed from: e */
    public volatile byte[] f3038e;

    /* JADX INFO: renamed from: c.g.a.m.m$a */
    /* JADX INFO: compiled from: Option.java */
    public class a implements b<Object> {
        @Override // p007c.p085g.p086a.p089m.Option.b
        /* JADX INFO: renamed from: a */
        public void mo1706a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.m$b */
    /* JADX INFO: compiled from: Option.java */
    public interface b<T> {
        /* JADX INFO: renamed from: a */
        void mo1706a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public Option(String str, T t, b<T> bVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f3037d = str;
        this.f3035b = t;
        Objects.requireNonNull(bVar, "Argument must not be null");
        this.f3036c = bVar;
    }

    /* JADX INFO: renamed from: a */
    public static <T> Option<T> m1705a(String str, T t) {
        return new Option<>(str, t, f3034a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Option) {
            return this.f3037d.equals(((Option) obj).f3037d);
        }
        return false;
    }

    public int hashCode() {
        return this.f3037d.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Option{key='");
        sbM1556G.append(this.f3037d);
        sbM1556G.append('\'');
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
