package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rw1<P> {

    /* JADX INFO: renamed from: a */
    public final P f19408a;

    /* JADX INFO: renamed from: b */
    public final byte[] f19409b;

    /* JADX INFO: renamed from: c */
    public final h32 f19410c;

    /* JADX INFO: renamed from: d */
    public final l42 f19411d;

    /* JADX WARN: Multi-variable type inference failed */
    public rw1(Object obj, byte[] bArr, h32 h32Var, l42 l42Var) {
        this.f19408a = obj;
        this.f19409b = Arrays.copyOf(bArr, bArr.length);
        this.f19410c = h32Var;
        this.f19411d = l42Var;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m8334a() {
        byte[] bArr = this.f19409b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
