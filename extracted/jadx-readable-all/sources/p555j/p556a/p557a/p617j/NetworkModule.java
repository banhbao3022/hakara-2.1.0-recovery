package p555j.p556a.p557a.p617j;

import android.content.Context;
import java.io.File;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p509g1.Cache2;
import p526i1.p536d.p543c.p549l.Module;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p553p.Scope2;

/* JADX INFO: renamed from: j.a.a.j.d, reason: use source file name */
/* JADX INFO: compiled from: NetworkModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NetworkModule extends Lambda implements InterfaceC6168p<Scope2, DefinitionParameters, Cache2> {

    /* JADX INFO: renamed from: g */
    public static final NetworkModule f33021g = new NetworkModule();

    public NetworkModule() {
        super(2);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public Cache2 mo5l(Scope2 scope2, DefinitionParameters definitionParameters) {
        Scope2 scope3 = scope2;
        Intrinsics2.m13089e(scope3, "$receiver");
        Intrinsics2.m13089e(definitionParameters, "it");
        Context context = (Context) scope3.m13863c(Reflection.m13097a(Context.class), null, null);
        Module module = NetworkModule5.f33029a;
        Intrinsics2.m13089e(context, "context");
        File cacheDir = context.getCacheDir();
        Intrinsics2.m13088d(cacheDir, "context.cacheDir");
        return new Cache2(cacheDir, 10485760);
    }
}
