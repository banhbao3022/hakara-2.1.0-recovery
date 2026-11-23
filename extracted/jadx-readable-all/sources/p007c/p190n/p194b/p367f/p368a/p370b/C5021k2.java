package p007c.p190n.p194b.p367f.p368a.p370b;

import android.content.Context;
import java.util.Objects;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0;

/* JADX INFO: renamed from: c.n.b.f.a.b.k2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5021k2 implements InterfaceC5094h0<Context> {

    /* JADX INFO: renamed from: a */
    public final C5001f2 f25858a;

    public C5021k2(C5001f2 c5001f2) {
        this.f25858a = c5001f2;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Context mo11416a() {
        Context context = this.f25858a.f25784a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }
}
