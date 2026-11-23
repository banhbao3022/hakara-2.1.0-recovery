package p007c.p190n.p194b.p367f.p368a.p370b;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p367f.p368a.p372c.C5076c;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5086d0;

/* JADX INFO: renamed from: c.n.b.f.a.b.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5032n1 {

    /* JADX INFO: renamed from: a */
    public final C5056u f25885a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5086d0<InterfaceC5037o2> f25886b;

    /* JADX INFO: renamed from: c */
    public final C5066x0 f25887c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5086d0<Executor> f25888d;

    /* JADX INFO: renamed from: e */
    public final C5027m0 f25889e;

    /* JADX INFO: renamed from: f */
    public final C5076c f25890f;

    public C5032n1(C5056u c5056u, InterfaceC5086d0<InterfaceC5037o2> interfaceC5086d0, C5066x0 c5066x0, InterfaceC5086d0<Executor> interfaceC5086d1, C5027m0 c5027m0, C5076c c5076c) {
        this.f25885a = c5056u;
        this.f25886b = interfaceC5086d0;
        this.f25887c = c5066x0;
        this.f25888d = interfaceC5086d1;
        this.f25889e = c5027m0;
        this.f25890f = c5076c;
    }

    /* JADX INFO: renamed from: a */
    public final void m11465a(final C5020k1 c5020k1) {
        File fileM11497n = this.f25885a.m11497n(c5020k1.f26031b, c5020k1.f25856c, c5020k1.f25857d);
        C5056u c5056u = this.f25885a;
        String str = c5020k1.f26031b;
        int i = c5020k1.f25856c;
        long j2 = c5020k1.f25857d;
        Objects.requireNonNull(c5056u);
        File file = new File(new File(c5056u.m11489e(str, i, j2), "_slices"), "_metadata");
        if (!fileM11497n.exists() || !file.exists()) {
            throw new C5011i0(String.format("Cannot find pack files to move for pack %s.", c5020k1.f26031b), c5020k1.f26030a);
        }
        File fileM11494k = this.f25885a.m11494k(c5020k1.f26031b, c5020k1.f25856c, c5020k1.f25857d);
        fileM11494k.mkdirs();
        if (!fileM11497n.renameTo(fileM11494k)) {
            throw new C5011i0("Cannot move merged pack files to final location.", c5020k1.f26030a);
        }
        new File(this.f25885a.m11494k(c5020k1.f26031b, c5020k1.f25856c, c5020k1.f25857d), "merge.tmp").delete();
        C5056u c5056u2 = this.f25885a;
        String str2 = c5020k1.f26031b;
        int i2 = c5020k1.f25856c;
        long j3 = c5020k1.f25857d;
        Objects.requireNonNull(c5056u2);
        File file2 = new File(c5056u2.m11494k(str2, i2, j3), "_metadata");
        file2.mkdirs();
        if (!file.renameTo(file2)) {
            throw new C5011i0("Cannot move metadata files to final location.", c5020k1.f26030a);
        }
        if (this.f25890f.m11525a()) {
            this.f25888d.m11529a().execute(new Runnable(this, c5020k1) { // from class: c.n.b.f.a.b.l1

                /* JADX INFO: renamed from: f */
                public final C5032n1 f25867f;

                /* JADX INFO: renamed from: g */
                public final C5020k1 f25868g;

                {
                    this.f25867f = this;
                    this.f25868g = c5020k1;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C5032n1 c5032n1 = this.f25867f;
                    C5020k1 c5020k2 = this.f25868g;
                    C5056u c5056u3 = c5032n1.f25885a;
                    String str3 = c5020k2.f26031b;
                    int i3 = c5020k2.f25856c;
                    long j4 = c5020k2.f25857d;
                    File fileM11487a = c5056u3.m11487a(str3);
                    if (fileM11487a.exists()) {
                        for (File file3 : fileM11487a.listFiles()) {
                            if (!file3.getName().equals(String.valueOf(i3)) && !file3.getName().equals("stale.tmp")) {
                                C5056u.m11486h(file3);
                            } else if (file3.getName().equals(String.valueOf(i3))) {
                                for (File file4 : file3.listFiles()) {
                                    if (!file4.getName().equals(String.valueOf(j4))) {
                                        C5056u.m11486h(file4);
                                    }
                                }
                            }
                        }
                    }
                }
            });
        } else {
            Executor executorM11529a = this.f25888d.m11529a();
            final C5056u c5056u3 = this.f25885a;
            c5056u3.getClass();
            executorM11529a.execute(new Runnable(c5056u3) { // from class: c.n.b.f.a.b.m1

                /* JADX INFO: renamed from: f */
                public final C5056u f25875f;

                {
                    this.f25875f = c5056u3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f25875f.m11502s();
                }
            });
        }
        final C5066x0 c5066x0 = this.f25887c;
        final String str3 = c5020k1.f26031b;
        final int i3 = c5020k1.f25856c;
        final long j4 = c5020k1.f25857d;
        c5066x0.m11511b(new InterfaceC5063w0(c5066x0, str3, i3, j4) { // from class: c.n.b.f.a.b.p0

            /* JADX INFO: renamed from: a */
            public final C5066x0 f25907a;

            /* JADX INFO: renamed from: b */
            public final String f25908b;

            /* JADX INFO: renamed from: c */
            public final int f25909c;

            /* JADX INFO: renamed from: d */
            public final long f25910d;

            {
                this.f25907a = c5066x0;
                this.f25908b = str3;
                this.f25909c = i3;
                this.f25910d = j4;
            }

            @Override // p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5063w0
            /* JADX INFO: renamed from: a */
            public final Object mo11466a() {
                final C5066x0 c5066x1 = this.f25907a;
                String str4 = this.f25908b;
                int i4 = this.f25909c;
                long j5 = this.f25910d;
                Objects.requireNonNull(c5066x1);
                final List listAsList = Arrays.asList(str4);
                C5057u0 c5057u0 = (C5057u0) ((Map) c5066x1.m11511b(new InterfaceC5063w0(c5066x1, listAsList) { // from class: c.n.b.f.a.b.r0

                    /* JADX INFO: renamed from: a */
                    public final C5066x0 f25941a;

                    /* JADX INFO: renamed from: b */
                    public final List f25942b;

                    {
                        this.f25941a = c5066x1;
                        this.f25942b = listAsList;
                    }

                    @Override // p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5063w0
                    /* JADX INFO: renamed from: a */
                    public final Object mo11466a() {
                        C5066x0 c5066x2 = this.f25941a;
                        List list = this.f25942b;
                        Objects.requireNonNull(c5066x2);
                        HashMap map = new HashMap();
                        for (C5057u0 c5057u1 : c5066x2.f26004f.values()) {
                            String str5 = c5057u1.f25978c.f25958a;
                            if (list.contains(str5)) {
                                C5057u0 c5057u2 = (C5057u0) map.get(str5);
                                if ((c5057u2 == null ? -1 : c5057u2.f25976a) < c5057u1.f25976a) {
                                    map.put(str5, c5057u1);
                                }
                            }
                        }
                        return map;
                    }
                })).get(str4);
                if (c5057u0 == null || C4799a.m10958I(c5057u0.f25978c.f25960c)) {
                    C5066x0.f25999a.m11533b(6, String.format("Could not find pack %s while trying to complete it", str4), new Object[0]);
                }
                C5056u c5056u4 = c5066x1.f26000b;
                if (c5056u4.m11489e(str4, i4, j5).exists()) {
                    C5056u.m11486h(c5056u4.m11489e(str4, i4, j5));
                }
                c5057u0.f25978c.f25960c = 4;
                return null;
            }
        });
        this.f25889e.m11459a(c5020k1.f26031b);
        this.f25886b.m11529a().mo11436d(c5020k1.f26030a, c5020k1.f26031b);
    }
}
