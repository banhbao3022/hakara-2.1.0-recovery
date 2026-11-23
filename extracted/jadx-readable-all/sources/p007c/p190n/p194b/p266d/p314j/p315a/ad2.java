package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ad2<T> implements zc2, vc2 {

    /* JADX INFO: renamed from: a */
    public static final ad2<Object> f12081a = new ad2<>(null);

    /* JADX INFO: renamed from: b */
    public final T f12082b;

    public ad2(T t) {
        this.f12082b = t;
    }

    /* JADX INFO: renamed from: b */
    public static <T> zc2<T> m5731b(T t) {
        Objects.requireNonNull(t, "instance cannot be null");
        return new ad2(t);
    }

    /* JADX INFO: renamed from: c */
    public static <T> zc2<T> m5732c(T t) {
        return t == null ? f12081a : new ad2(t);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final T mo4613a() {
        return this.f12082b;
    }
}
