package p555j.p556a.p557a.p617j;

import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p553p.Scope2;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p606h.p614e.UserRepository;

/* JADX INFO: renamed from: j.a.a.j.v0 */
/* JADX INFO: compiled from: ViewModelModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C7129v0 extends Lambda implements InterfaceC6168p<Scope2, DefinitionParameters, ProfileViewModel6> {

    /* JADX INFO: renamed from: g */
    public static final C7129v0 f33059g = new C7129v0();

    public C7129v0() {
        super(2);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public ProfileViewModel6 mo5l(Scope2 scope2, DefinitionParameters definitionParameters) {
        Scope2 scope3 = scope2;
        Intrinsics2.m13089e(scope3, "$receiver");
        Intrinsics2.m13089e(definitionParameters, "it");
        return new ProfileViewModel6((UserRepository) scope3.m13863c(Reflection.m13097a(UserRepository.class), null, null));
    }
}
