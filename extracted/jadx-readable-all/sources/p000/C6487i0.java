package p000;

import android.content.Context;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p509g1.Interceptor;
import p509g1.p523k0.HttpLoggingInterceptor;
import p526i1.p536d.p543c.p549l.Module;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p553p.Scope2;
import p555j.p556a.p557a.p617j.Interceptor2;
import p555j.p556a.p557a.p617j.NetworkModule5;

/* JADX INFO: renamed from: i0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C6487i0 extends Lambda implements InterfaceC6168p<Scope2, DefinitionParameters, Interceptor> {

    /* JADX INFO: renamed from: g */
    public static final C6487i0 f30765g = new C6487i0(0);

    /* JADX INFO: renamed from: h */
    public static final C6487i0 f30766h = new C6487i0(1);

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f30767i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6487i0(int i) {
        super(2);
        this.f30767i = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Interceptor mo5l(Scope2 scope2, DefinitionParameters definitionParameters) {
        int i = this.f30767i;
        int i2 = 1;
        HttpLoggingInterceptor.b bVar = null;
        Object[] objArr = 0;
        if (i == 0) {
            Intrinsics2.m13089e(scope2, "$receiver");
            Intrinsics2.m13089e(definitionParameters, "it");
            Module module = NetworkModule5.f33029a;
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(bVar, i2, objArr == true ? 1 : 0);
            HttpLoggingInterceptor.a aVar = HttpLoggingInterceptor.a.NONE;
            Intrinsics2.m13090f(aVar, "<set-?>");
            httpLoggingInterceptor.f30581b = aVar;
            return httpLoggingInterceptor;
        }
        if (i != 1) {
            throw null;
        }
        Scope2 scope3 = scope2;
        Intrinsics2.m13089e(scope3, "$receiver");
        Intrinsics2.m13089e(definitionParameters, "it");
        Context context = (Context) scope3.m13863c(Reflection.m13097a(Context.class), null, null);
        Module module2 = NetworkModule5.f33029a;
        Intrinsics2.m13089e(context, "context");
        return new Interceptor2(context);
    }
}
