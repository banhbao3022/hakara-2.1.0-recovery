package p477d1.p481d0;

import p477d1.p478a0.Ranges;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: d1.d0.t, reason: use source file name */
/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Strings4 extends Lambda implements InterfaceC6164l<Ranges, String> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CharSequence f29477g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Strings4(CharSequence charSequence) {
        super(1);
        this.f29477g = charSequence;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public String mo3b(Ranges ranges) {
        Ranges ranges2 = ranges;
        Intrinsics2.m13089e(ranges2, "it");
        return Strings5.m13002E(this.f29477g, ranges2);
    }
}
