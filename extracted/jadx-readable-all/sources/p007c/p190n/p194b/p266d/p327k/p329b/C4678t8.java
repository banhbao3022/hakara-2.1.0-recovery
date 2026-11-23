package p007c.p190n.p194b.p266d.p327k.p329b;

import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p280x.C2211a;
import p007c.p190n.p194b.p266d.p314j.p325k.C4145e9;

/* JADX INFO: renamed from: c.n.b.d.k.b.t8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4678t8 extends AbstractC4587l9 {

    /* JADX INFO: renamed from: d */
    public String f24461d;

    /* JADX INFO: renamed from: e */
    public boolean f24462e;

    /* JADX INFO: renamed from: f */
    public long f24463f;

    public C4678t8(C4611n9 c4611n9) {
        super(c4611n9);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4587l9
    /* JADX INFO: renamed from: p */
    public final boolean mo10577p() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final Pair<String, Boolean> m10779s(String str, C4481d c4481d) {
        return (C4145e9.m9566a() && this.f24476a.f24534h.m10417k(C4647r.f24315J0) && !c4481d.m10492j()) ? new Pair<>("", Boolean.FALSE) : m10781u(str);
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public final String m10780t(String str) {
        mo10381b();
        String str2 = (String) m10781u(str).first;
        MessageDigest messageDigestM10869x0 = C4723x9.m10869x0();
        if (messageDigestM10869x0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM10869x0.digest(str2.getBytes())));
    }

    @Deprecated
    /* JADX INFO: renamed from: u */
    public final Pair<String, Boolean> m10781u(String str) {
        mo10381b();
        long jMo5621a = this.f24476a.f24541o.mo5621a();
        if (this.f24461d != null && jMo5621a < this.f24463f) {
            return new Pair<>(this.f24461d, Boolean.valueOf(this.f24462e));
        }
        C4469c c4469c = this.f24476a.f24534h;
        Objects.requireNonNull(c4469c);
        this.f24463f = jMo5621a + c4469c.m10416i(str, C4647r.f24339b);
        try {
            C2211a.a aVarM4656b = C2211a.m4656b(this.f24476a.f24528b);
            String str2 = aVarM4656b.f10624a;
            this.f24461d = str2;
            this.f24462e = aVarM4656b.f10625b;
            if (str2 == null) {
                this.f24461d = "";
            }
        } catch (Exception e) {
            mo10684l().f24425m.m10812b("Unable to get advertising id", e);
            this.f24461d = "";
        }
        return new Pair<>(this.f24461d, Boolean.valueOf(this.f24462e));
    }
}
