package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.content.Context;
import java.util.regex.Pattern;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3679x0;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C2872b9;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.C3285me;
import p007c.p190n.p194b.p266d.p314j.p315a.C3321nd;
import p007c.p190n.p194b.p266d.p314j.p315a.C3331nn;
import p007c.p190n.p194b.p266d.p314j.p315a.C3725y9;
import p007c.p190n.p194b.p266d.p314j.p315a.gx2;
import p007c.p190n.p194b.p266d.p314j.p315a.lv2;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.p */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2289p extends C3285me {

    /* JADX INFO: renamed from: b */
    public final Context f10762b;

    public C2289p(Context context, C3321nd c3321nd) {
        super(c3321nd);
        this.f10762b = context;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.C3285me, p007c.p190n.p194b.p266d.p314j.p315a.ps2
    /* JADX INFO: renamed from: a */
    public final lv2 mo4798a(AbstractC3679x0<?> abstractC3679x0) throws C2872b9 {
        if (abstractC3679x0.f21404g == 0) {
            if (Pattern.matches((String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14411o2), abstractC3679x0.f21405h)) {
                C3331nn c3331nn = gx2.f14692a.f14693b;
                if (C3331nn.m7888f(this.f10762b, 13400000)) {
                    lv2 lv2VarMo4798a = new C3725y9(this.f10762b).mo4798a(abstractC3679x0);
                    if (lv2VarMo4798a != null) {
                        String strValueOf = String.valueOf(abstractC3679x0.f21405h);
                        C2096e.m4590z(strValueOf.length() != 0 ? "Got gmscore asset response: ".concat(strValueOf) : new String("Got gmscore asset response: "));
                        return lv2VarMo4798a;
                    }
                    String strValueOf2 = String.valueOf(abstractC3679x0.f21405h);
                    C2096e.m4590z(strValueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(strValueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.mo4798a(abstractC3679x0);
    }
}
