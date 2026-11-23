package p526i1.p536d.p543c;

import java.util.List;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: i1.d.c.d, reason: use source file name */
/* JADX INFO: compiled from: KoinApplication.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class KoinApplication3 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ KoinApplication f30892g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f30893h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinApplication3(KoinApplication koinApplication, List list) {
        super(0);
        this.f30892g = koinApplication;
        this.f30893h = list;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        KoinApplication koinApplication = this.f30892g;
        koinApplication.f30890b.m13843b(this.f30893h);
        return Unit.f29502a;
    }
}
