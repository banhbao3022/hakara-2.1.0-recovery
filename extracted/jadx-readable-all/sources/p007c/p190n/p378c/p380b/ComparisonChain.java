package p007c.p190n.p378c.p380b;

import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: c.n.c.b.n, reason: use source file name */
/* JADX INFO: compiled from: ComparisonChain.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ComparisonChain {

    /* JADX INFO: renamed from: a */
    public static final ComparisonChain f26236a = new a();

    /* JADX INFO: renamed from: b */
    public static final ComparisonChain f26237b = new b(-1);

    /* JADX INFO: renamed from: c */
    public static final ComparisonChain f26238c = new b(1);

    /* JADX INFO: renamed from: c.n.c.b.n$a */
    /* JADX INFO: compiled from: ComparisonChain.java */
    public static class a extends ComparisonChain {
        public a() {
            super(null);
        }

        @Override // p007c.p190n.p378c.p380b.ComparisonChain
        /* JADX INFO: renamed from: a */
        public ComparisonChain mo11630a(int i, int i2) {
            int i3;
            if (i < i2) {
                i3 = -1;
            } else {
                i3 = i > i2 ? 1 : 0;
            }
            return m11635f(i3);
        }

        @Override // p007c.p190n.p378c.p380b.ComparisonChain
        /* JADX INFO: renamed from: b */
        public <T> ComparisonChain mo11631b(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator) {
            return m11635f(comparator.compare(t, t2));
        }

        @Override // p007c.p190n.p378c.p380b.ComparisonChain
        /* JADX INFO: renamed from: c */
        public ComparisonChain mo11632c(boolean z, boolean z2) {
            int i;
            if (z == z2) {
                i = 0;
            } else {
                i = z ? 1 : -1;
            }
            return m11635f(i);
        }

        @Override // p007c.p190n.p378c.p380b.ComparisonChain
        /* JADX INFO: renamed from: d */
        public ComparisonChain mo11633d(boolean z, boolean z2) {
            int i;
            if (z2 == z) {
                i = 0;
            } else {
                i = z2 ? 1 : -1;
            }
            return m11635f(i);
        }

        @Override // p007c.p190n.p378c.p380b.ComparisonChain
        /* JADX INFO: renamed from: e */
        public int mo11634e() {
            return 0;
        }

        /* JADX INFO: renamed from: f */
        public ComparisonChain m11635f(int i) {
            if (i < 0) {
                return ComparisonChain.f26237b;
            }
            return i > 0 ? ComparisonChain.f26238c : ComparisonChain.f26236a;
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.n$b */
    /* JADX INFO: compiled from: ComparisonChain.java */
    public static final class b extends ComparisonChain {

        /* JADX INFO: renamed from: d */
        public final int f26239d;

        public b(int i) {
            super(null);
            this.f26239d = i;
        }

        @Override // p007c.p190n.p378c.p380b.ComparisonChain
        /* JADX INFO: renamed from: a */
        public ComparisonChain mo11630a(int i, int i2) {
            return this;
        }

        @Override // p007c.p190n.p378c.p380b.ComparisonChain
        /* JADX INFO: renamed from: b */
        public <T> ComparisonChain mo11631b(@NullableDecl T t, @NullableDecl T t2, @NullableDecl Comparator<T> comparator) {
            return this;
        }

        @Override // p007c.p190n.p378c.p380b.ComparisonChain
        /* JADX INFO: renamed from: c */
        public ComparisonChain mo11632c(boolean z, boolean z2) {
            return this;
        }

        @Override // p007c.p190n.p378c.p380b.ComparisonChain
        /* JADX INFO: renamed from: d */
        public ComparisonChain mo11633d(boolean z, boolean z2) {
            return this;
        }

        @Override // p007c.p190n.p378c.p380b.ComparisonChain
        /* JADX INFO: renamed from: e */
        public int mo11634e() {
            return this.f26239d;
        }
    }

    public ComparisonChain(a aVar) {
    }

    /* JADX INFO: renamed from: a */
    public abstract ComparisonChain mo11630a(int i, int i2);

    /* JADX INFO: renamed from: b */
    public abstract <T> ComparisonChain mo11631b(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator);

    /* JADX INFO: renamed from: c */
    public abstract ComparisonChain mo11632c(boolean z, boolean z2);

    /* JADX INFO: renamed from: d */
    public abstract ComparisonChain mo11633d(boolean z, boolean z2);

    /* JADX INFO: renamed from: e */
    public abstract int mo11634e();
}
