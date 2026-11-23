package p555j.p556a.p557a.p617j;

import android.content.SharedPreferences;
import p007c.p190n.p430e.Gson6;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p553p.Scope2;
import p555j.p556a.p557a.p606h.p609c.p612c.AppPrefs;
import p555j.p556a.p557a.p606h.p609c.p612c.PrefHelper;

/* JADX INFO: renamed from: j.a.a.j.s */
/* JADX INFO: compiled from: RepositoryModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C7122s extends Lambda implements InterfaceC6168p<Scope2, DefinitionParameters, PrefHelper> {

    /* JADX INFO: renamed from: g */
    public static final C7122s f33052g = new C7122s();

    public C7122s() {
        super(2);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public PrefHelper mo5l(Scope2 scope2, DefinitionParameters definitionParameters) {
        Scope2 scope3 = scope2;
        Intrinsics2.m13089e(scope3, "$receiver");
        Intrinsics2.m13089e(definitionParameters, "it");
        return new AppPrefs((SharedPreferences) scope3.m13863c(Reflection.m13097a(SharedPreferences.class), null, null), (Gson6) scope3.m13863c(Reflection.m13097a(Gson6.class), null, null));
    }
}
