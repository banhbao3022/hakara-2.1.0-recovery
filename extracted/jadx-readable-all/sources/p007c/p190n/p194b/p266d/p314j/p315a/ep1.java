package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ep1 extends ap1 {
    /* JADX WARN: Multi-variable type inference failed */
    public ep1(to1 to1Var, to1 to1Var2, HashSet<String> hashSet, JSONObject jSONObject, long j2) {
        super(to1Var, to1Var2, hashSet, jSONObject, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bp1
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        m6659b(str);
        cp1 cp1Var = this.f12766a;
        if (cp1Var != null) {
            cp1Var.f13076d = null;
            cp1Var.m6220b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6659b(String str) {
        yn1 yn1Var = yn1.f21931a;
        if (yn1Var != null) {
            for (nn1 nn1Var : yn1Var.m8806a()) {
                if (this.f12247c.contains(nn1Var.f17182h)) {
                    lo1 lo1Var = nn1Var.f17179e;
                    if (this.f12249e >= lo1Var.f16432b && lo1Var.f16433c != 3) {
                        lo1Var.f16433c = 3;
                        eo1.m6651a(lo1Var.m7596c(), "setNativeViewHierarchy", str);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ String doInBackground(Object[] objArr) {
        return this.f12248d.toString();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ap1, p007c.p190n.p194b.p266d.p314j.p315a.bp1, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        m6659b(str2);
        super.onPostExecute(str2);
    }
}
