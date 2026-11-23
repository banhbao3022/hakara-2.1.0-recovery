package p555j.p556a.p557a.p617j;

import android.app.Application;
import android.content.res.Resources;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p537a.p538a.MissingAndroidContextException;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p553p.Scope2;

/* JADX INFO: renamed from: j.a.a.j.a, reason: use source file name */
/* JADX INFO: compiled from: AppModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AppModule extends Lambda implements InterfaceC6168p<Scope2, DefinitionParameters, Resources> {

    /* JADX INFO: renamed from: g */
    public static final AppModule f33013g = new AppModule();

    public AppModule() {
        super(2);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public Resources mo5l(Scope2 scope2, DefinitionParameters definitionParameters) throws MissingAndroidContextException {
        Scope2 scope3 = scope2;
        Intrinsics2.m13089e(scope3, "$receiver");
        Intrinsics2.m13089e(definitionParameters, "it");
        Intrinsics2.m13090f(scope3, "$this$androidApplication");
        try {
            return ((Application) scope3.m13863c(Reflection.m13097a(Application.class), null, null)).getResources();
        } catch (Exception unused) {
            throw new MissingAndroidContextException("Can't resolve Application instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }
}
