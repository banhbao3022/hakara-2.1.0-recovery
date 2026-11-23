package p007c.p190n.p194b.p367f.p368a.p369a;

import android.content.Context;
import java.util.Objects;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0;
import p007c.p190n.p194b.p367f.p368a.p376g.C5136a;

/* JADX INFO: renamed from: c.n.b.f.a.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C4976c implements InterfaceC5094h0<?> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5094h0 f25693a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f25694b = 0;

    public C4976c(InterfaceC5094h0<C4974a> interfaceC5094h0) {
        this.f25693a = interfaceC5094h0;
    }

    public C4976c(InterfaceC5094h0<Context> interfaceC5094h0, byte[] bArr) {
        this.f25693a = interfaceC5094h0;
    }

    public C4976c(InterfaceC5094h0<Context> interfaceC5094h0, char[] cArr) {
        this.f25693a = interfaceC5094h0;
    }

    public C4976c(InterfaceC5094h0<Context> interfaceC5094h0, short[] sArr) {
        this.f25693a = interfaceC5094h0;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0
    /* JADX INFO: renamed from: a */
    public final Object mo11416a() {
        int i = this.f25694b;
        if (i == 0) {
            C4974a c4974a = (C4974a) this.f25693a.mo11416a();
            Objects.requireNonNull(c4974a, "Cannot return null from a non-@Nullable @Provides method");
            return c4974a;
        }
        if (i == 1) {
            Objects.requireNonNull((C4977d) this.f25693a);
            throw null;
        }
        if (i != 2) {
            return new C5136a((Context) this.f25693a.mo11416a());
        }
        Objects.requireNonNull((C4977d) this.f25693a);
        throw null;
    }
}
