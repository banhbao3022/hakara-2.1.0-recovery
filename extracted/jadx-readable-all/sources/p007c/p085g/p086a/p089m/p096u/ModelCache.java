package p007c.p085g.p086a.p089m.p096u;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import p007c.p085g.p086a.p112s.LruCache;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.m.u.m, reason: use source file name */
/* JADX INFO: compiled from: ModelCache.java */
/* JADX INFO: loaded from: classes.dex */
public class ModelCache<A, B> {

    /* JADX INFO: renamed from: a */
    public final LruCache<b<A>, B> f3428a;

    /* JADX INFO: renamed from: c.g.a.m.u.m$a */
    /* JADX INFO: compiled from: ModelCache.java */
    public class a extends LruCache<b<A>, B> {
        public a(ModelCache modelCache, long j2) {
            super(j2);
        }

        @Override // p007c.p085g.p086a.p112s.LruCache
        /* JADX INFO: renamed from: c */
        public void mo1782c(Object obj, Object obj2) {
            b<?> bVar = (b) obj;
            Objects.requireNonNull(bVar);
            Queue<b<?>> queue = b.f3429a;
            synchronized (queue) {
                queue.offer(bVar);
            }
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.u.m$b */
    /* JADX INFO: compiled from: ModelCache.java */
    public static final class b<A> {

        /* JADX INFO: renamed from: a */
        public static final Queue<b<?>> f3429a;

        /* JADX INFO: renamed from: b */
        public int f3430b;

        /* JADX INFO: renamed from: c */
        public int f3431c;

        /* JADX INFO: renamed from: d */
        public A f3432d;

        static {
            char[] cArr = Util4.f3828a;
            f3429a = new ArrayDeque(0);
        }

        /* JADX INFO: renamed from: a */
        public static <A> b<A> m1862a(A a, int i, int i2) {
            b<A> bVar;
            Queue<b<?>> queue = f3429a;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.f3432d = a;
            bVar.f3431c = i;
            bVar.f3430b = i2;
            return bVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3431c == bVar.f3431c && this.f3430b == bVar.f3430b && this.f3432d.equals(bVar.f3432d);
        }

        public int hashCode() {
            return this.f3432d.hashCode() + (((this.f3430b * 31) + this.f3431c) * 31);
        }
    }

    public ModelCache() {
        this(250L);
    }

    public ModelCache(long j2) {
        this.f3428a = new a(this, j2);
    }
}
