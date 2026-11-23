package p007c.p190n.p194b.p266d.p267a.p273d0.p274a;

import java.util.Locale;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p314j.p315a.zc2;

/* JADX INFO: renamed from: c.n.b.d.a.d0.a.x */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2166x implements zc2<String> {

    /* JADX INFO: renamed from: a */
    public final C2164v f10543a;

    public C2166x(C2164v c2164v) {
        this.f10543a = c2164v;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        String lowerCase = this.f10543a.f10541a.toLowerCase(Locale.ROOT);
        Objects.requireNonNull(lowerCase, "Cannot return null from a non-@Nullable @Provides method");
        return lowerCase;
    }
}
