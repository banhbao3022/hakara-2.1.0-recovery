package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.Closeable;
import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.a.ez */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3010ez extends mc2 implements Closeable {
    static {
        tc2.m8414b(C3010ez.class);
    }

    public C3010ez(nc2 nc2Var, InterfaceC3046fy interfaceC3046fy) throws IOException {
        C3076gr c3076gr = (C3076gr) nc2Var;
        long jLimit = c3076gr.f14647f.limit();
        this.f16721h = nc2Var;
        this.f16723j = c3076gr.m7017c();
        c3076gr.m7018f(c3076gr.m7017c() + jLimit);
        this.f16724k = c3076gr.m7017c();
        this.f16720g = interfaceC3046fy;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mc2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.mc2
    public final String toString() {
        String string = this.f16721h.toString();
        return outline.m1552C(new StringBuilder(String.valueOf(string).length() + 7), "model(", string, ")");
    }
}
