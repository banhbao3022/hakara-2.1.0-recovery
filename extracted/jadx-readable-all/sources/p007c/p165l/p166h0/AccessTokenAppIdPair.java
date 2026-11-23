package p007c.p165l.p166h0;

import java.io.Serializable;
import java.util.HashSet;
import p007c.p165l.AccessToken;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.a, reason: use source file name */
/* JADX INFO: compiled from: AccessTokenAppIdPair.java */
/* JADX INFO: loaded from: classes.dex */
public class AccessTokenAppIdPair implements Serializable {

    /* JADX INFO: renamed from: f */
    public final String f4585f;

    /* JADX INFO: renamed from: g */
    public final String f4586g;

    /* JADX INFO: renamed from: c.l.h0.a$b */
    /* JADX INFO: compiled from: AccessTokenAppIdPair.java */
    public static class b implements Serializable {

        /* JADX INFO: renamed from: f */
        public final String f4587f;

        /* JADX INFO: renamed from: g */
        public final String f4588g;

        public b(String str, String str2, a aVar) {
            this.f4587f = str;
            this.f4588g = str2;
        }

        private Object readResolve() {
            return new AccessTokenAppIdPair(this.f4587f, this.f4588g);
        }
    }

    public AccessTokenAppIdPair(String str, String str2) {
        this.f4585f = Utility.m2466y(str) ? null : str;
        this.f4586g = str2;
    }

    private Object writeReplace() {
        return new b(this.f4585f, this.f4586g, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccessTokenAppIdPair)) {
            return false;
        }
        AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) obj;
        return Utility.m2443b(accessTokenAppIdPair.f4585f, this.f4585f) && Utility.m2443b(accessTokenAppIdPair.f4586g, this.f4586g);
    }

    public int hashCode() {
        String str = this.f4585f;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f4586g;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AccessTokenAppIdPair(AccessToken accessToken) {
        String str = accessToken.f4499n;
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        this(str, FacebookSdk.f5354c);
    }
}
