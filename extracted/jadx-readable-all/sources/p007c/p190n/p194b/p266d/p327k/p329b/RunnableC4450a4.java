package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.k.b.a4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4450a4 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final InterfaceC4462b4 f23697f;

    /* JADX INFO: renamed from: g */
    public final int f23698g;

    /* JADX INFO: renamed from: h */
    public final Throwable f23699h;

    /* JADX INFO: renamed from: i */
    public final byte[] f23700i;

    /* JADX INFO: renamed from: j */
    public final String f23701j;

    /* JADX INFO: renamed from: k */
    public final Map<String, List<String>> f23702k;

    public RunnableC4450a4(String str, InterfaceC4462b4 interfaceC4462b4, int i, Throwable th, byte[] bArr, Map map, C4728y3 c4728y3) {
        Objects.requireNonNull(interfaceC4462b4, "null reference");
        this.f23697f = interfaceC4462b4;
        this.f23698g = i;
        this.f23699h = th;
        this.f23700i = bArr;
        this.f23701j = str;
        this.f23702k = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23697f.mo10389a(this.f23701j, this.f23698g, this.f23699h, this.f23700i, this.f23702k);
    }
}
