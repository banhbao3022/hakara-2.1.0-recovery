package p509g1;

import java.io.IOException;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.p511d.JavaNetAuthenticator;

/* JADX INFO: renamed from: g1.b, reason: use source file name */
/* JADX INFO: compiled from: Authenticator.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface Authenticator {

    /* JADX INFO: renamed from: a */
    public static final Authenticator f29909a;

    /* JADX INFO: renamed from: g1.b$a */
    /* JADX INFO: compiled from: Authenticator.kt */
    public static final class a {

        /* JADX INFO: renamed from: g1.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Authenticator.kt */
        public static final class C8541a implements Authenticator {
            @Override // p509g1.Authenticator
            /* JADX INFO: renamed from: a */
            public Request3 mo13301a(Route route, Response3 response3) {
                Intrinsics2.m13090f(response3, "response");
                return null;
            }
        }

        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        f29909a = new a.C8541a();
        new JavaNetAuthenticator(null, 1, null);
    }

    /* JADX INFO: renamed from: a */
    Request3 mo13301a(Route route, Response3 response3) throws IOException;
}
