package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class u50 implements zc2<Context> {

    /* JADX INFO: renamed from: a */
    public final t50 f20217a;

    /* JADX INFO: renamed from: b */
    public final gd2<Context> f20218b;

    public u50(t50 t50Var, gd2<Context> gd2Var) {
        this.f20217a = t50Var;
        this.f20218b = gd2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        t50 t50Var = this.f20217a;
        ((hj1) this.f20218b).m7137b();
        Context context = t50Var.f19767a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }
}
