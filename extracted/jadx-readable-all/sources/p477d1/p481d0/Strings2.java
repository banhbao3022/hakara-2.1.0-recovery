package p477d1.p481d0;

import p477d1.Tuples;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: d1.d0.r, reason: use source file name */
/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Strings2 extends Lambda implements InterfaceC6168p<CharSequence, Integer, Tuples<? extends Integer, ? extends Integer>> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ char[] f29473g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f29474h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Strings2(char[] cArr, boolean z) {
        super(2);
        this.f29473g = cArr;
        this.f29474h = z;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public Tuples<? extends Integer, ? extends Integer> mo5l(CharSequence charSequence, Integer num) {
        CharSequence charSequence2 = charSequence;
        int iIntValue = num.intValue();
        Intrinsics2.m13089e(charSequence2, "$receiver");
        int iM13013w = Strings5.m13013w(charSequence2, this.f29473g, iIntValue, this.f29474h);
        if (iM13013w < 0) {
            return null;
        }
        return new Tuples<>(Integer.valueOf(iM13013w), 1);
    }
}
