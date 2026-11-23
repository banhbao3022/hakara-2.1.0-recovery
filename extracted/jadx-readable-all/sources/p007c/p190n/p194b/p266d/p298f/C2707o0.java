package p007c.p190n.p194b.p266d.p298f;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.n.b.d.f.o0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2707o0 extends C2710p0 {

    /* JADX INFO: renamed from: e */
    public final Callable<String> f11774e;

    public /* synthetic */ C2707o0(Callable callable) {
        super(false, null, null);
        this.f11774e = callable;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.C2710p0
    /* JADX INFO: renamed from: a */
    public final String mo5558a() {
        try {
            return this.f11774e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
