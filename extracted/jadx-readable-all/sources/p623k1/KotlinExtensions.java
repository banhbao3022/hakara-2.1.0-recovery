package p623k1;

import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: k1.m, reason: use source file name */
/* JADX INFO: compiled from: KotlinExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class KotlinExtensions extends Lambda implements InterfaceC6164l<Throwable, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Call2 f33174g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinExtensions(Call2 call2) {
        super(1);
        this.f33174g = call2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(Throwable th) {
        this.f33174g.cancel();
        return Unit.f29502a;
    }
}
