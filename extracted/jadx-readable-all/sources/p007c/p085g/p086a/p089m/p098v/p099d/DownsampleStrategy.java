package p007c.p085g.p086a.p089m.p098v.p099d;

import p007c.p085g.p086a.p089m.Option;

/* JADX INFO: renamed from: c.g.a.m.v.d.m, reason: use source file name */
/* JADX INFO: compiled from: DownsampleStrategy.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class DownsampleStrategy {

    /* JADX INFO: renamed from: a */
    public static final DownsampleStrategy f3552a;

    /* JADX INFO: renamed from: b */
    public static final DownsampleStrategy f3553b;

    /* JADX INFO: renamed from: c */
    public static final DownsampleStrategy f3554c;

    /* JADX INFO: renamed from: d */
    public static final DownsampleStrategy f3555d;

    /* JADX INFO: renamed from: e */
    public static final DownsampleStrategy f3556e;

    /* JADX INFO: renamed from: f */
    public static final Option<DownsampleStrategy> f3557f;

    /* JADX INFO: renamed from: g */
    public static final boolean f3558g;

    /* JADX INFO: renamed from: c.g.a.m.v.d.m$a */
    /* JADX INFO: compiled from: DownsampleStrategy.java */
    public static class a extends DownsampleStrategy {
        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public int mo1894a(int i, int i2, int i3, int i4) {
            return 2;
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo1895b(int i, int i2, int i3, int i4) {
            int iMin = Math.min(i2 / i4, i / i3);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.v.d.m$b */
    /* JADX INFO: compiled from: DownsampleStrategy.java */
    public static class b extends DownsampleStrategy {
        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public int mo1894a(int i, int i2, int i3, int i4) {
            return 1;
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo1895b(int i, int i2, int i3, int i4) {
            int iCeil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.v.d.m$c */
    /* JADX INFO: compiled from: DownsampleStrategy.java */
    public static class c extends DownsampleStrategy {
        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public int mo1894a(int i, int i2, int i3, int i4) {
            if (mo1895b(i, i2, i3, i4) == 1.0f) {
                return 2;
            }
            return DownsampleStrategy.f3552a.mo1894a(i, i2, i3, i4);
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo1895b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, DownsampleStrategy.f3552a.mo1895b(i, i2, i3, i4));
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.v.d.m$d */
    /* JADX INFO: compiled from: DownsampleStrategy.java */
    public static class d extends DownsampleStrategy {
        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public int mo1894a(int i, int i2, int i3, int i4) {
            return 2;
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo1895b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.v.d.m$e */
    /* JADX INFO: compiled from: DownsampleStrategy.java */
    public static class e extends DownsampleStrategy {
        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public int mo1894a(int i, int i2, int i3, int i4) {
            return DownsampleStrategy.f3558g ? 2 : 1;
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo1895b(int i, int i2, int i3, int i4) {
            if (DownsampleStrategy.f3558g) {
                return Math.min(i3 / i, i4 / i2);
            }
            int iMax = Math.max(i2 / i4, i / i3);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.v.d.m$f */
    /* JADX INFO: compiled from: DownsampleStrategy.java */
    public static class f extends DownsampleStrategy {
        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DownsampleStrategy
        /* JADX INFO: renamed from: a */
        public int mo1894a(int i, int i2, int i3, int i4) {
            return 2;
        }

        @Override // p007c.p085g.p086a.p089m.p098v.p099d.DownsampleStrategy
        /* JADX INFO: renamed from: b */
        public float mo1895b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    static {
        new a();
        new b();
        f3552a = new e();
        f3553b = new c();
        d dVar = new d();
        f3554c = dVar;
        f3555d = new f();
        f3556e = dVar;
        f3557f = Option.m1705a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f3558g = true;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo1894a(int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: b */
    public abstract float mo1895b(int i, int i2, int i3, int i4);
}
