package p555j.p556a.p557a.p617j;

import android.app.Application;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p553p.Scope2;
import p555j.p556a.p557a.p558a.p559a.p591s.WalletViewModel5;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p614e.UserRepository;

/* JADX INFO: renamed from: j.a.a.j.w0 */
/* JADX INFO: compiled from: ViewModelModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C7131w0 extends Lambda implements InterfaceC6168p<Scope2, DefinitionParameters, WalletViewModel5> {

    /* JADX INFO: renamed from: g */
    public static final C7131w0 f33062g = new C7131w0();

    public C7131w0() {
        super(2);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public WalletViewModel5 mo5l(Scope2 scope2, DefinitionParameters definitionParameters) {
        Scope2 scope3 = scope2;
        Intrinsics2.m13089e(scope3, "$receiver");
        Intrinsics2.m13089e(definitionParameters, "it");
        return new WalletViewModel5((SkuDao) scope3.m13863c(Reflection.m13097a(SkuDao.class), null, null), (Application) scope3.m13863c(Reflection.m13097a(Application.class), null, null), (UserRepository) scope3.m13863c(Reflection.m13097a(UserRepository.class), null, null));
    }
}
