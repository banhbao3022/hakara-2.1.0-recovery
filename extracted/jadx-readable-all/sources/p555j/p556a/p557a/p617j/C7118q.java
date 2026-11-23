package p555j.p556a.p557a.p617j;

import mtp.media.karaoke.data.local.p627db.AppDatabase;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p549l.Module;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p553p.Scope2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: j.a.a.j.q */
/* JADX INFO: compiled from: RepositoryModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C7118q extends Lambda implements InterfaceC6168p<Scope2, DefinitionParameters, SkuDao> {

    /* JADX INFO: renamed from: g */
    public static final C7118q f33048g = new C7118q();

    public C7118q() {
        super(2);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public SkuDao mo5l(Scope2 scope2, DefinitionParameters definitionParameters) {
        Scope2 scope3 = scope2;
        Intrinsics2.m13089e(scope3, "$receiver");
        Intrinsics2.m13089e(definitionParameters, "it");
        AppDatabase appDatabase = (AppDatabase) scope3.m13863c(Reflection.m13097a(AppDatabase.class), null, null);
        Module module = C7130w.f33060a;
        Intrinsics2.m13089e(appDatabase, "appDatabase");
        return appDatabase.mo14348r();
    }
}
