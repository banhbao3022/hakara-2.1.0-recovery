package p636z0.p667e.p676b.p677v1;

import java.util.HashMap;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: z0.e.b.v1.w0, reason: use source file name */
/* JADX INFO: compiled from: LiveDataObservable.java */
/* JADX INFO: loaded from: classes.dex */
public final class LiveDataObservable<T> {

    /* JADX INFO: renamed from: a */
    public final MutableLiveData<a<T>> f36309a = new MutableLiveData<>();

    /* JADX INFO: renamed from: z0.e.b.v1.w0$a */
    /* JADX INFO: compiled from: LiveDataObservable.java */
    public static final class a<T> {

        /* JADX INFO: renamed from: a */
        public T f36310a;

        public a(T t, Throwable th) {
            this.f36310a = t;
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("[Result: <");
            StringBuilder sbM1556G2 = outline.m1556G("Value: ");
            sbM1556G2.append(this.f36310a);
            sbM1556G.append(sbM1556G2.toString());
            sbM1556G.append(">]");
            return sbM1556G.toString();
        }
    }

    public LiveDataObservable() {
        new HashMap();
    }
}
