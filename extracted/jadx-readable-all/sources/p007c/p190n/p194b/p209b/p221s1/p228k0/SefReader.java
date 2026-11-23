package p007c.p190n.p194b.p209b.p221s1.p228k0;

import java.util.ArrayList;
import java.util.List;
import p007c.p190n.p378c.p379a.CharMatcher;
import p007c.p190n.p378c.p379a.Splitter2;
import p007c.p190n.p378c.p379a.Splitter3;

/* JADX INFO: renamed from: c.n.b.b.s1.k0.k, reason: use source file name */
/* JADX INFO: compiled from: SefReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class SefReader {

    /* JADX INFO: renamed from: a */
    public static final Splitter3 f7970a = new Splitter3(new Splitter2(new CharMatcher.b(':')));

    /* JADX INFO: renamed from: b */
    public static final Splitter3 f7971b = new Splitter3(new Splitter2(new CharMatcher.b('*')));

    /* JADX INFO: renamed from: c */
    public final List<a> f7972c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public int f7973d = 0;

    /* JADX INFO: renamed from: e */
    public int f7974e;

    /* JADX INFO: renamed from: c.n.b.b.s1.k0.k$a */
    /* JADX INFO: compiled from: SefReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f7975a;

        /* JADX INFO: renamed from: b */
        public final int f7976b;

        public a(int i, long j2, int i2) {
            this.f7975a = j2;
            this.f7976b = i2;
        }
    }
}
