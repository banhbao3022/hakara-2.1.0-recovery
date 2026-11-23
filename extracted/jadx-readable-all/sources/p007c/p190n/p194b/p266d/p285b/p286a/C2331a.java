package p007c.p190n.p194b.p266d.p285b.p286a;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d.C2344h;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d.C2345i;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;
import p007c.p190n.p194b.p266d.p314j.p317c.C3797e;
import p007c.p190n.p194b.p266d.p314j.p317c.C3798f;
import p007c.p190n.p194b.p266d.p314j.p318d.C3804d;

/* JADX INFO: renamed from: c.n.b.d.b.a.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2331a {

    /* JADX INFO: renamed from: a */
    public static final C2628a.g<C3798f> f10912a;

    /* JADX INFO: renamed from: b */
    public static final C2628a.g<C2344h> f10913b;

    /* JADX INFO: renamed from: c */
    public static final C2628a.a<C3798f, a> f10914c;

    /* JADX INFO: renamed from: d */
    public static final C2628a.a<C2344h, GoogleSignInOptions> f10915d;

    /* JADX INFO: renamed from: e */
    public static final C2628a<GoogleSignInOptions> f10916e;

    /* JADX INFO: renamed from: c.n.b.d.b.a.a$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    @Deprecated
    public static class a implements C2628a.d {

        /* JADX INFO: renamed from: f */
        public static final a f10917f = new a(new C8514a());

        /* JADX INFO: renamed from: g */
        public final String f10918g;

        /* JADX INFO: renamed from: h */
        public final boolean f10919h;

        /* JADX INFO: renamed from: i */
        public final String f10920i;

        public a(C8514a c8514a) {
            this.f10918g = c8514a.f10921a;
            this.f10919h = c8514a.f10922b.booleanValue();
            this.f10920i = c8514a.f10923c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C2622l.m5459y(this.f10918g, aVar.f10918g) && this.f10919h == aVar.f10919h && C2622l.m5459y(this.f10920i, aVar.f10920i);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f10918g, Boolean.valueOf(this.f10919h), this.f10920i});
        }

        /* JADX INFO: renamed from: c.n.b.d.b.a.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
        @Deprecated
        public static class C8514a {

            /* JADX INFO: renamed from: a */
            public String f10921a;

            /* JADX INFO: renamed from: b */
            public Boolean f10922b;

            /* JADX INFO: renamed from: c */
            public String f10923c;

            public C8514a() {
                this.f10922b = Boolean.FALSE;
            }

            public C8514a(a aVar) {
                this.f10922b = Boolean.FALSE;
                this.f10921a = aVar.f10918g;
                this.f10922b = Boolean.valueOf(aVar.f10919h);
                this.f10923c = aVar.f10920i;
            }
        }
    }

    static {
        C2628a.g<C3798f> gVar = new C2628a.g<>();
        f10912a = gVar;
        C2628a.g<C2344h> gVar2 = new C2628a.g<>();
        f10913b = gVar2;
        C2368f c2368f = new C2368f();
        f10914c = c2368f;
        C2369g c2369g = new C2369g();
        f10915d = c2369g;
        C2628a<C2333c> c2628a = C2332b.f10926c;
        new C2628a("Auth.CREDENTIALS_API", c2368f, gVar);
        f10916e = new C2628a<>("Auth.GOOGLE_SIGN_IN_API", c2369g, gVar2);
        C3804d c3804d = C2332b.f10927d;
        new C3797e();
        new C2345i();
    }
}
