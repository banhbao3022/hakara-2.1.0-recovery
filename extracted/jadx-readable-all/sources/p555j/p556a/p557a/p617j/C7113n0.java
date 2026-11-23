package p555j.p556a.p557a.p617j;

import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p553p.Scope2;
import p555j.p556a.p557a.p558a.p559a.p578j.p580j.PresentViewModel;
import p555j.p556a.p557a.p606h.p614e.GiftRepository;

/* JADX INFO: renamed from: j.a.a.j.n0 */
/* JADX INFO: compiled from: ViewModelModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C7113n0 extends Lambda implements InterfaceC6168p<Scope2, DefinitionParameters, PresentViewModel> {

    /* JADX INFO: renamed from: g */
    public static final C7113n0 f33043g = new C7113n0();

    public C7113n0() {
        super(2);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public PresentViewModel mo5l(Scope2 scope2, DefinitionParameters definitionParameters) {
        Scope2 scope3 = scope2;
        Intrinsics2.m13089e(scope3, "$receiver");
        Intrinsics2.m13089e(definitionParameters, "it");
        return new PresentViewModel((GiftRepository) scope3.m13863c(Reflection.m13097a(GiftRepository.class), null, null));
    }
}
