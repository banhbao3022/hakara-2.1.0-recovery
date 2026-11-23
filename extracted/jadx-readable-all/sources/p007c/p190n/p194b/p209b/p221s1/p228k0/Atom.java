package p007c.p190n.p194b.p209b.p221s1.p228k0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;

/* JADX INFO: renamed from: c.n.b.b.s1.k0.d, reason: use source file name */
/* JADX INFO: compiled from: Atom.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class Atom {

    /* JADX INFO: renamed from: a */
    public final int f7853a;

    /* JADX INFO: renamed from: c.n.b.b.s1.k0.d$a */
    /* JADX INFO: compiled from: Atom.java */
    public static final class a extends Atom {

        /* JADX INFO: renamed from: b */
        public final long f7854b;

        /* JADX INFO: renamed from: c */
        public final List<b> f7855c;

        /* JADX INFO: renamed from: d */
        public final List<a> f7856d;

        public a(int i, long j2) {
            super(i);
            this.f7854b = j2;
            this.f7855c = new ArrayList();
            this.f7856d = new ArrayList();
        }

        /* JADX INFO: renamed from: b */
        public a m3809b(int i) {
            int size = this.f7856d.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = this.f7856d.get(i2);
                if (aVar.f7853a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public b m3810c(int i) {
            int size = this.f7855c.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = this.f7855c.get(i2);
                if (bVar.f7853a == i) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p228k0.Atom
        public String toString() {
            return Atom.m3808a(this.f7853a) + " leaves: " + Arrays.toString(this.f7855c.toArray()) + " containers: " + Arrays.toString(this.f7856d.toArray());
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.k0.d$b */
    /* JADX INFO: compiled from: Atom.java */
    public static final class b extends Atom {

        /* JADX INFO: renamed from: b */
        public final ParsableByteArray f7857b;

        public b(int i, ParsableByteArray parsableByteArray) {
            super(i);
            this.f7857b = parsableByteArray;
        }
    }

    public Atom(int i) {
        this.f7853a = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m3808a(int i) {
        StringBuilder sbM1556G = outline.m1556G("");
        sbM1556G.append((char) ((i >> 24) & 255));
        sbM1556G.append((char) ((i >> 16) & 255));
        sbM1556G.append((char) ((i >> 8) & 255));
        sbM1556G.append((char) (i & 255));
        return sbM1556G.toString();
    }

    public String toString() {
        return m3808a(this.f7853a);
    }
}
