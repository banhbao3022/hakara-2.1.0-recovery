package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gs0 implements zc2<String> {

    /* JADX INFO: renamed from: a */
    public final gd2<Context> f14658a;

    public gs0(gd2<Context> gd2Var) {
        this.f14658a = gd2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String mo4613a() {
        String packageName = ((hj1) this.f14658a).m7137b().getPackageName();
        Objects.requireNonNull(packageName, "Cannot return null from a non-@Nullable @Provides method");
        return packageName;
    }
}
