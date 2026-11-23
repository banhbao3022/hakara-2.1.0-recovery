package p007c.p190n.p194b.p266d.p298f.p299o;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p007c.p190n.p194b.p266d.p298f.C2606d;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a.d;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c;
import p007c.p190n.p194b.p266d.p298f.p302q.C2720d;
import p007c.p190n.p194b.p266d.p298f.p302q.InterfaceC2745m;

/* JADX INFO: renamed from: c.n.b.d.f.o.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2628a<O extends d> {

    /* JADX INFO: renamed from: a */
    public final a<?, O> f11605a;

    /* JADX INFO: renamed from: b */
    public final g<?> f11606b;

    /* JADX INFO: renamed from: c */
    public final String f11607c;

    /* JADX INFO: renamed from: c.n.b.d.f.o.a$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static abstract class a<T extends f, O> extends e<T, O> {
        @Deprecated
        /* JADX INFO: renamed from: a */
        public T mo4938a(Context context, Looper looper, C2720d c2720d, O o, AbstractC2632e.a aVar, AbstractC2632e.b bVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.f.o.a$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface b {
    }

    /* JADX INFO: renamed from: c.n.b.d.f.o.a$c */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class c<C extends b> {
    }

    /* JADX INFO: renamed from: c.n.b.d.f.o.a$d */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface d {

        /* JADX INFO: renamed from: c.n.b.d.f.o.a$d$a */
        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface a extends d {
            /* JADX INFO: renamed from: u */
            Account m5470u();
        }

        /* JADX INFO: renamed from: c.n.b.d.f.o.a$d$b */
        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface b extends d {
            /* JADX INFO: renamed from: h */
            GoogleSignInAccount m5471h();
        }

        /* JADX INFO: renamed from: c.n.b.d.f.o.a$d$c */
        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public static final class c implements d {
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.f.o.a$e */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static abstract class e<T extends b, O> {
    }

    /* JADX INFO: renamed from: c.n.b.d.f.o.a$f */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface f extends b {
        /* JADX INFO: renamed from: J */
        void mo5133J();

        /* JADX INFO: renamed from: a */
        Set<Scope> mo5472a();

        /* JADX INFO: renamed from: b */
        void m5473b(InterfaceC2745m interfaceC2745m, Set<Scope> set);

        /* JADX INFO: renamed from: d */
        boolean m5474d();

        /* JADX INFO: renamed from: e */
        String m5475e();

        /* JADX INFO: renamed from: f */
        void m5476f(AbstractC2717c.c cVar);

        /* JADX INFO: renamed from: g */
        void m5477g(AbstractC2717c.e eVar);

        /* JADX INFO: renamed from: j */
        boolean m5478j();

        /* JADX INFO: renamed from: k */
        int mo4925k();

        /* JADX INFO: renamed from: l */
        C2606d[] m5479l();

        /* JADX INFO: renamed from: m */
        boolean mo5480m();

        /* JADX INFO: renamed from: u0 */
        boolean m5481u0();
    }

    /* JADX INFO: renamed from: c.n.b.d.f.o.a$g */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class g<C extends f> extends c<C> {
    }

    /* JADX INFO: renamed from: c.n.b.d.f.o.a$h */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface h<T extends IInterface> extends b {
        /* JADX INFO: renamed from: h */
        String m5482h();

        /* JADX INFO: renamed from: i */
        T m5483i(IBinder iBinder);

        /* JADX INFO: renamed from: n */
        String m5484n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> C2628a(String str, a<C, O> aVar, g<C> gVar) {
        C2622l.m5379i(aVar, "Cannot construct an Api with a null ClientBuilder");
        C2622l.m5379i(gVar, "Cannot construct an Api with a null ClientKey");
        this.f11607c = str;
        this.f11605a = aVar;
        this.f11606b = gVar;
    }
}
