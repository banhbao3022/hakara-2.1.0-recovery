package p555j.p556a.p557a.p617j;

import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p553p.Scope2;
import p555j.p556a.p557a.p558a.p559a.p585o.SearchViewModel7;
import p555j.p556a.p557a.p606h.p614e.SearchRepository;

/* JADX INFO: renamed from: j.a.a.j.c0 */
/* JADX INFO: compiled from: ViewModelModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C7091c0 extends Lambda implements InterfaceC6168p<Scope2, DefinitionParameters, SearchViewModel7> {

    /* JADX INFO: renamed from: g */
    public static final C7091c0 f33020g = new C7091c0();

    public C7091c0() {
        super(2);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public SearchViewModel7 mo5l(Scope2 scope2, DefinitionParameters definitionParameters) {
        Scope2 scope3 = scope2;
        Intrinsics2.m13089e(scope3, "$receiver");
        Intrinsics2.m13089e(definitionParameters, "it");
        return new SearchViewModel7((SearchRepository) scope3.m13863c(Reflection.m13097a(SearchRepository.class), null, null));
    }
}
