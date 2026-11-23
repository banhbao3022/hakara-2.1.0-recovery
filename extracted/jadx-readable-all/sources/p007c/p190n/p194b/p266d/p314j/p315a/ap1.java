package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collection;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ap1 extends bp1 {

    /* JADX INFO: renamed from: c */
    public final HashSet<String> f12247c;

    /* JADX INFO: renamed from: d */
    public final JSONObject f12248d;

    /* JADX INFO: renamed from: e */
    public final long f12249e;

    /* JADX WARN: Multi-variable type inference failed */
    public ap1(to1 to1Var, to1 to1Var2, HashSet<String> hashSet, JSONObject jSONObject, long j2) {
        super(to1Var, null);
        this.f12247c = new HashSet<>((Collection) to1Var2);
        this.f12248d = hashSet;
        this.f12249e = jSONObject;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bp1, android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(String str) {
        onPostExecute(str);
    }
}
