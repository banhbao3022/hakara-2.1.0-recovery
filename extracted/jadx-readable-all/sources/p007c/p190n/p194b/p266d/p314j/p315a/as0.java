package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class as0 implements zc2<ApplicationInfo> {

    /* JADX INFO: renamed from: a */
    public final gd2<Context> f12261a;

    public as0(gd2<Context> gd2Var) {
        this.f12261a = gd2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ApplicationInfo mo4613a() {
        ApplicationInfo applicationInfo = this.f12261a.mo4613a().getApplicationInfo();
        Objects.requireNonNull(applicationInfo, "Cannot return null from a non-@Nullable @Provides method");
        return applicationInfo;
    }
}
