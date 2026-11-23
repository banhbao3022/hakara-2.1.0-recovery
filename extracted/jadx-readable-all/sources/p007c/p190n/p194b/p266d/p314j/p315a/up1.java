package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class up1 {

    /* JADX INFO: renamed from: a */
    public final Context f20398a;

    /* JADX INFO: renamed from: b */
    public final Looper f20399b;

    public up1(Context context, Looper looper) {
        this.f20398a = context;
        this.f20399b = looper;
    }

    /* JADX INFO: renamed from: a */
    public final void m8517a(String str) {
        jq1 jq1VarM7723v = mq1.m7723v();
        String packageName = this.f20398a.getPackageName();
        if (jq1VarM7723v.f13191h) {
            jq1VarM7723v.m6298m();
            jq1VarM7723v.f13191h = false;
        }
        mq1.m7726z((mq1) jq1VarM7723v.f13190g, packageName);
        lq1 lq1Var = lq1.BLOCKED_IMPRESSION;
        if (jq1VarM7723v.f13191h) {
            jq1VarM7723v.m6298m();
            jq1VarM7723v.f13191h = false;
        }
        mq1.m7725y((mq1) jq1VarM7723v.f13190g, lq1Var);
        gq1 gq1VarM7153v = hq1.m7153v();
        if (gq1VarM7153v.f13191h) {
            gq1VarM7153v.m6298m();
            gq1VarM7153v.f13191h = false;
        }
        hq1.m7156z((hq1) gq1VarM7153v.f13190g, str);
        fq1 fq1Var = fq1.BLOCKED_REASON_BACKGROUND;
        if (gq1VarM7153v.f13191h) {
            gq1VarM7153v.m6298m();
            gq1VarM7153v.f13191h = false;
        }
        hq1.m7155y((hq1) gq1VarM7153v.f13190g, fq1Var);
        if (jq1VarM7723v.f13191h) {
            jq1VarM7723v.m6298m();
            jq1VarM7723v.f13191h = false;
        }
        mq1.m7722A((mq1) jq1VarM7723v.f13190g, gq1VarM7153v.m6300o());
        vp1 vp1Var = new vp1(this.f20398a, this.f20399b, jq1VarM7723v.m6300o());
        synchronized (vp1Var.f20903c) {
            if (!vp1Var.f20904d) {
                vp1Var.f20904d = true;
                vp1Var.f20901a.m5578o();
            }
        }
    }
}
