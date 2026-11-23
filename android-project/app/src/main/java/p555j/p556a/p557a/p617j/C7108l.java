package p555j.p556a.p557a.p617j;

import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p553p.Scope2;
import p555j.p556a.p557a.p606h.p609c.p610a.KeywordDao;
import p555j.p556a.p557a.p606h.p613d.ApiService;
import p555j.p556a.p557a.p606h.p614e.SearchRepository;
import p555j.p556a.p557a.p606h.p614e.p615h.SearchRepositoryImpl;

/* JADX INFO: renamed from: j.a.a.j.l */
/* JADX INFO: compiled from: RepositoryModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C7108l extends Lambda implements InterfaceC6168p<Scope2, DefinitionParameters, SearchRepository> {

    /* JADX INFO: renamed from: g */
    public static final C7108l f33038g = new C7108l();

    public C7108l() {
        super(2);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public SearchRepository mo5l(Scope2 scope2, DefinitionParameters definitionParameters) {
        Scope2 scope3 = scope2;
        Intrinsics2.m13089e(scope3, "$receiver");
        Intrinsics2.m13089e(definitionParameters, "it");
        return new SearchRepositoryImpl((ApiService) scope3.m13863c(Reflection.m13097a(ApiService.class), null, null), (KeywordDao) scope3.m13863c(Reflection.m13097a(KeywordDao.class), null, null));
    }
}
