package p007c.p190n.p194b.p266d.p330l;

import com.google.android.gms.common.api.Scope;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;
import p007c.p190n.p194b.p266d.p330l.p331b.C4747a;

/* JADX INFO: renamed from: c.n.b.d.l.d */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4760d {

    /* JADX INFO: renamed from: a */
    public static final C2628a.g<C4747a> f24651a;

    /* JADX INFO: renamed from: b */
    public static final C2628a.g<C4747a> f24652b;

    /* JADX INFO: renamed from: c */
    public static final C2628a.a<C4747a, C4746a> f24653c;

    /* JADX INFO: renamed from: d */
    public static final C2628a.a<C4747a, Object> f24654d;

    static {
        C2628a.g<C4747a> gVar = new C2628a.g<>();
        f24651a = gVar;
        C2628a.g<C4747a> gVar2 = new C2628a.g<>();
        f24652b = gVar2;
        C4759c c4759c = new C4759c();
        f24653c = c4759c;
        C4762f c4762f = new C4762f();
        f24654d = c4762f;
        new Scope("profile");
        new Scope("email");
        new C2628a("SignIn.API", c4759c, gVar);
        new C2628a("SignIn.INTERNAL_API", c4762f, gVar2);
    }
}
