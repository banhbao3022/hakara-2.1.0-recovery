package p555j.p556a.p557a.p617j;

import android.content.Context;
import android.content.SharedPreferences;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p549l.Module;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p553p.Scope2;

/* JADX INFO: renamed from: j.a.a.j.r */
/* JADX INFO: compiled from: RepositoryModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C7120r extends Lambda implements InterfaceC6168p<Scope2, DefinitionParameters, SharedPreferences> {

    /* JADX INFO: renamed from: g */
    public static final C7120r f33050g = new C7120r();

    public C7120r() {
        super(2);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public SharedPreferences mo5l(Scope2 scope2, DefinitionParameters definitionParameters) {
        Scope2 scope3 = scope2;
        Intrinsics2.m13089e(scope3, "$receiver");
        Intrinsics2.m13089e(definitionParameters, "it");
        Context context = (Context) scope3.m13863c(Reflection.m13097a(Context.class), null, null);
        Module module = C7130w.f33060a;
        Intrinsics2.m13089e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName(), 0);
        Intrinsics2.m13088d(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
