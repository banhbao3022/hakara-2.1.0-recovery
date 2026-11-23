package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yc2<T> implements gd2, vc2 {

    /* JADX INFO: renamed from: a */
    public static final Object f21852a = new Object();

    /* JADX INFO: renamed from: b */
    public volatile gd2<T> f21853b;

    /* JADX INFO: renamed from: c */
    public volatile Object f21854c = f21852a;

    public yc2(gd2<T> gd2Var) {
        this.f21853b = gd2Var;
    }

    /* JADX INFO: renamed from: b */
    public static <P extends gd2<T>, T> gd2<T> m8791b(P p) {
        Objects.requireNonNull(p);
        return p instanceof yc2 ? p : new yc2(p);
    }

    /* JADX INFO: renamed from: c */
    public static <P extends gd2<T>, T> vc2<T> m8792c(P p) {
        if (p instanceof vc2) {
            return (vc2) p;
        }
        Objects.requireNonNull(p);
        return new yc2(p);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final T mo4613a() {
        T tMo4613a = (T) this.f21854c;
        Object obj = f21852a;
        if (tMo4613a == obj) {
            synchronized (this) {
                tMo4613a = (T) this.f21854c;
                if (tMo4613a == obj) {
                    tMo4613a = this.f21853b.mo4613a();
                    Object obj2 = this.f21854c;
                    if (obj2 != obj && !(obj2 instanceof cd2) && obj2 != tMo4613a) {
                        String strValueOf = String.valueOf(obj2);
                        String strValueOf2 = String.valueOf(tMo4613a);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 118 + strValueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(strValueOf);
                        sb.append(" & ");
                        sb.append(strValueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.f21854c = tMo4613a;
                    this.f21853b = null;
                }
            }
        }
        return tMo4613a;
    }
}
