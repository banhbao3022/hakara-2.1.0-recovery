package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rb1 implements ia1<sb1> {

    /* JADX INFO: renamed from: a */
    public final lv1 f18737a;

    public rb1(or2 or2Var, lv1 lv1Var, Context context, byte[] bArr) {
        this.f18737a = lv1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<sb1> zza() {
        return this.f18737a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.qb1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new sb1(new JSONObject());
            }
        });
    }
}
