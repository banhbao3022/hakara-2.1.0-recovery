package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class z10 implements zc2<v10> {

    /* JADX INFO: renamed from: a */
    public final gd2<l20> f22148a;

    /* JADX INFO: renamed from: b */
    public final gd2<InterfaceC2908c7> f22149b;

    /* JADX INFO: renamed from: c */
    public final gd2<Runnable> f22150c;

    /* JADX INFO: renamed from: d */
    public final gd2<Executor> f22151d;

    public z10(gd2<l20> gd2Var, gd2<InterfaceC2908c7> gd2Var2, gd2<Runnable> gd2Var3, gd2<Executor> gd2Var4) {
        this.f22148a = gd2Var;
        this.f22149b = gd2Var2;
        this.f22150c = gd2Var3;
        this.f22151d = gd2Var4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        l20 l20VarMo4613a = ((h40) this.f22148a).mo4613a();
        InterfaceC2908c7 interfaceC2908c7 = ((y10) this.f22149b).f21728a.f20976a;
        Objects.requireNonNull(interfaceC2908c7, "Cannot return null from a non-@Nullable @Provides method");
        return new v10(l20VarMo4613a, interfaceC2908c7, ((x10) this.f22150c).f21419a.f20977b, this.f22151d.mo4613a());
    }
}
