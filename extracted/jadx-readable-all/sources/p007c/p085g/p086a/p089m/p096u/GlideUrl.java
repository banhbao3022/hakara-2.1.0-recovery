package p007c.p085g.p086a.p089m.p096u;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Objects;
import p007c.p085g.p086a.p089m.Key;

/* JADX INFO: renamed from: c.g.a.m.u.g, reason: use source file name */
/* JADX INFO: compiled from: GlideUrl.java */
/* JADX INFO: loaded from: classes.dex */
public class GlideUrl implements Key {

    /* JADX INFO: renamed from: b */
    public final Headers f3409b;

    /* JADX INFO: renamed from: c */
    public final URL f3410c;

    /* JADX INFO: renamed from: d */
    public final String f3411d;

    /* JADX INFO: renamed from: e */
    public String f3412e;

    /* JADX INFO: renamed from: f */
    public URL f3413f;

    /* JADX INFO: renamed from: g */
    public volatile byte[] f3414g;

    /* JADX INFO: renamed from: h */
    public int f3415h;

    public GlideUrl(URL url) {
        this(url, Headers.f3416a);
    }

    @Override // p007c.p085g.p086a.p089m.Key
    /* JADX INFO: renamed from: a */
    public void mo1703a(MessageDigest messageDigest) {
        if (this.f3414g == null) {
            this.f3414g = m1856c().getBytes(Key.f3032a);
        }
        messageDigest.update(this.f3414g);
    }

    /* JADX INFO: renamed from: c */
    public String m1856c() {
        String str = this.f3411d;
        if (str != null) {
            return str;
        }
        URL url = this.f3410c;
        Objects.requireNonNull(url, "Argument must not be null");
        return url.toString();
    }

    /* JADX INFO: renamed from: d */
    public URL m1857d() throws MalformedURLException {
        if (this.f3413f == null) {
            if (TextUtils.isEmpty(this.f3412e)) {
                String string = this.f3411d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f3410c;
                    Objects.requireNonNull(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f3412e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f3413f = new URL(this.f3412e);
        }
        return this.f3413f;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof GlideUrl)) {
            return false;
        }
        GlideUrl glideUrl = (GlideUrl) obj;
        return m1856c().equals(glideUrl.m1856c()) && this.f3409b.equals(glideUrl.f3409b);
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public int hashCode() {
        if (this.f3415h == 0) {
            int iHashCode = m1856c().hashCode();
            this.f3415h = iHashCode;
            this.f3415h = this.f3409b.hashCode() + (iHashCode * 31);
        }
        return this.f3415h;
    }

    public String toString() {
        return m1856c();
    }

    public GlideUrl(String str) {
        this(str, Headers.f3416a);
    }

    public GlideUrl(URL url, Headers headers) {
        Objects.requireNonNull(url, "Argument must not be null");
        this.f3410c = url;
        this.f3411d = null;
        Objects.requireNonNull(headers, "Argument must not be null");
        this.f3409b = headers;
    }

    public GlideUrl(String str, Headers headers) {
        this.f3410c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f3411d = str;
            Objects.requireNonNull(headers, "Argument must not be null");
            this.f3409b = headers;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
