package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.k.b3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4097b3<T> implements Serializable {
    /* JADX INFO: renamed from: a */
    public static <T> AbstractC4097b3<T> m9408a(T t) {
        Objects.requireNonNull(t);
        return new C4111c3(t);
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo9337b();

    /* JADX INFO: renamed from: c */
    public abstract T mo9338c();
}
