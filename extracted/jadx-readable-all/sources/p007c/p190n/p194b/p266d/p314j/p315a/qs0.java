package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class qs0 implements dv1<di1> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rs0 f18430a;

    public qs0(rs0 rs0Var) {
        this.f18430a = rs0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: a */
    public final void mo4616a(Throwable th) {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14236N3)).booleanValue()) {
            Matcher matcher = rs0.f19055a.matcher(th.getMessage());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                tv0 tv0Var = this.f18430a.f19060f;
                int i = Integer.parseInt(strGroup);
                synchronized (tv0Var.f20081e) {
                    tv0Var.f20077a = i;
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: b */
    public final void mo4617b(di1 di1Var) {
        di1 di1Var2 = di1Var;
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14236N3)).booleanValue()) {
            tv0 tv0Var = this.f18430a.f19060f;
            int i = di1Var2.f13281b.f12695b.f20321e;
            synchronized (tv0Var.f20081e) {
                tv0Var.f20077a = i;
            }
            tv0 tv0Var2 = this.f18430a.f19060f;
            long j2 = di1Var2.f13281b.f12695b.f20322f;
            synchronized (tv0Var2.f20082f) {
                tv0Var2.f20078b = j2;
            }
        }
    }
}
