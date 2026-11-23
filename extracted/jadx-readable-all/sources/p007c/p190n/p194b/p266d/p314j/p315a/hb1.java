package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class hb1 implements ia1<ib1> {

    /* JADX INFO: renamed from: a */
    public final lv1 f14801a;

    public hb1(InterfaceC3511si interfaceC3511si, Context context, String str, lv1 lv1Var) {
        this.f14801a = lv1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<ib1> zza() {
        return this.f14801a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.gb1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ib1(new JSONObject());
            }
        });
    }
}
