package p636z0.p774z.p775b;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: z0.z.b.n, reason: use source file name */
/* JADX INFO: compiled from: DiffUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class DiffUtil {

    /* JADX INFO: renamed from: a */
    public static final Comparator<c> f39246a = new a();

    /* JADX INFO: renamed from: z0.z.b.n$a */
    /* JADX INFO: compiled from: DiffUtil.java */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public int compare(c cVar, c cVar2) {
            return cVar.f39247a - cVar2.f39247a;
        }
    }

    /* JADX INFO: renamed from: z0.z.b.n$b */
    /* JADX INFO: compiled from: DiffUtil.java */
    public static abstract class b {
        /* JADX INFO: renamed from: a */
        public abstract boolean mo16987a(int i, int i2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo16988b(int i, int i2);

        /* JADX INFO: renamed from: c */
        public Object mo16989c(int i, int i2) {
            return null;
        }

        /* JADX INFO: renamed from: d */
        public abstract int mo16990d();

        /* JADX INFO: renamed from: e */
        public abstract int mo16991e();
    }

    /* JADX INFO: renamed from: z0.z.b.n$c */
    /* JADX INFO: compiled from: DiffUtil.java */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final int f39247a;

        /* JADX INFO: renamed from: b */
        public final int f39248b;

        /* JADX INFO: renamed from: c */
        public final int f39249c;

        public c(int i, int i2, int i3) {
            this.f39247a = i;
            this.f39248b = i2;
            this.f39249c = i3;
        }
    }

    /* JADX INFO: renamed from: z0.z.b.n$d */
    /* JADX INFO: compiled from: DiffUtil.java */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final List<c> f39250a;

        /* JADX INFO: renamed from: b */
        public final int[] f39251b;

        /* JADX INFO: renamed from: c */
        public final int[] f39252c;

        /* JADX INFO: renamed from: d */
        public final b f39253d;

        /* JADX INFO: renamed from: e */
        public final int f39254e;

        /* JADX INFO: renamed from: f */
        public final int f39255f;

        /* JADX INFO: renamed from: g */
        public final boolean f39256g;

        public d(b bVar, List<c> list, int[] iArr, int[] iArr2, boolean z) {
            int i;
            int i2;
            this.f39250a = list;
            this.f39251b = iArr;
            this.f39252c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f39253d = bVar;
            int iMo16991e = bVar.mo16991e();
            this.f39254e = iMo16991e;
            int iMo16990d = bVar.mo16990d();
            this.f39255f = iMo16990d;
            this.f39256g = z;
            c cVar = list.isEmpty() ? null : list.get(0);
            if (cVar == null || cVar.f39247a != 0 || cVar.f39248b != 0) {
                list.add(0, new c(0, 0, 0));
            }
            list.add(new c(iMo16991e, iMo16990d, 0));
            for (c cVar2 : list) {
                for (int i3 = 0; i3 < cVar2.f39249c; i3++) {
                    int i4 = cVar2.f39247a + i3;
                    int i5 = cVar2.f39248b + i3;
                    int i6 = this.f39253d.mo16987a(i4, i5) ? 1 : 2;
                    this.f39251b[i4] = (i5 << 4) | i6;
                    this.f39252c[i5] = (i4 << 4) | i6;
                }
            }
            if (this.f39256g) {
                int i7 = 0;
                for (c cVar3 : this.f39250a) {
                    while (true) {
                        i = cVar3.f39247a;
                        if (i7 < i) {
                            if (this.f39251b[i7] == 0) {
                                int size = this.f39250a.size();
                                int i8 = 0;
                                for (int i9 = 0; i9 < size; i9++) {
                                    c cVar4 = this.f39250a.get(i9);
                                    while (true) {
                                        i2 = cVar4.f39248b;
                                        if (i8 < i2) {
                                            if (this.f39252c[i8] == 0 && this.f39253d.mo16988b(i7, i8)) {
                                                int i10 = this.f39253d.mo16987a(i7, i8) ? 8 : 4;
                                                this.f39251b[i7] = (i8 << 4) | i10;
                                                this.f39252c[i8] = i10 | (i7 << 4);
                                                break;
                                            }
                                            i8++;
                                        }
                                    }
                                    i8 = cVar4.f39249c + i2;
                                }
                            }
                            i7++;
                        }
                    }
                    i7 = cVar3.f39249c + i;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public static f m17039a(Collection<f> collection, int i, boolean z) {
            f next;
            Iterator<f> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.f39257a == i && next.f39259c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f next2 = it.next();
                if (z) {
                    next2.f39258b--;
                } else {
                    next2.f39258b++;
                }
            }
            return next;
        }
    }

    /* JADX INFO: renamed from: z0.z.b.n$e */
    /* JADX INFO: compiled from: DiffUtil.java */
    public static abstract class e<T> {
        /* JADX INFO: renamed from: a */
        public abstract boolean mo13878a(T t, T t2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo13879b(T t, T t2);
    }

    /* JADX INFO: renamed from: z0.z.b.n$f */
    /* JADX INFO: compiled from: DiffUtil.java */
    public static class f {

        /* JADX INFO: renamed from: a */
        public int f39257a;

        /* JADX INFO: renamed from: b */
        public int f39258b;

        /* JADX INFO: renamed from: c */
        public boolean f39259c;

        public f(int i, int i2, boolean z) {
            this.f39257a = i;
            this.f39258b = i2;
            this.f39259c = z;
        }
    }

    /* JADX INFO: renamed from: z0.z.b.n$g */
    /* JADX INFO: compiled from: DiffUtil.java */
    public static class g {

        /* JADX INFO: renamed from: a */
        public int f39260a;

        /* JADX INFO: renamed from: b */
        public int f39261b;

        /* JADX INFO: renamed from: c */
        public int f39262c;

        /* JADX INFO: renamed from: d */
        public int f39263d;

        public g() {
        }

        /* JADX INFO: renamed from: a */
        public int m17040a() {
            return this.f39263d - this.f39262c;
        }

        /* JADX INFO: renamed from: b */
        public int m17041b() {
            return this.f39261b - this.f39260a;
        }

        public g(int i, int i2, int i3, int i4) {
            this.f39260a = i;
            this.f39261b = i2;
            this.f39262c = i3;
            this.f39263d = i4;
        }
    }

    /* JADX INFO: renamed from: z0.z.b.n$h */
    /* JADX INFO: compiled from: DiffUtil.java */
    public static class h {

        /* JADX INFO: renamed from: a */
        public int f39264a;

        /* JADX INFO: renamed from: b */
        public int f39265b;

        /* JADX INFO: renamed from: c */
        public int f39266c;

        /* JADX INFO: renamed from: d */
        public int f39267d;

        /* JADX INFO: renamed from: e */
        public boolean f39268e;

        /* JADX INFO: renamed from: a */
        public int m17042a() {
            return Math.min(this.f39266c - this.f39264a, this.f39267d - this.f39265b);
        }
    }
}
