package p007c.p190n.p194b.p367f.p368a.p370b;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p367f.p368a.p372c.C5076c;
import p007c.p190n.p194b.p367f.p368a.p373d.C5084c0;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;

/* JADX INFO: renamed from: c.n.b.f.a.b.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4980a1 {

    /* JADX INFO: renamed from: a */
    public static final C5089f f25697a = new C5089f("ExtractorTaskFinder");

    /* JADX INFO: renamed from: b */
    public final C5066x0 f25698b;

    /* JADX INFO: renamed from: c */
    public final C5056u f25699c;

    /* JADX INFO: renamed from: d */
    public final C4983b0 f25700d;

    /* JADX INFO: renamed from: e */
    public final C5076c f25701e;

    public C4980a1(C5066x0 c5066x0, C5056u c5056u, C4983b0 c4983b0, C5076c c5076c) {
        this.f25698b = c5066x0;
        this.f25699c = c5056u;
        this.f25700d = c4983b0;
        this.f25701e = c5076c;
    }

    /* JADX INFO: renamed from: a */
    public final C5072z0 m11419a() {
        C5072z0 c5044q1;
        int iM11480j;
        try {
            this.f25698b.f26005g.lock();
            ArrayList arrayList = new ArrayList();
            for (C5057u0 c5057u0 : this.f25698b.f26004f.values()) {
                if (C4799a.m10967R(c5057u0.f25978c.f25960c)) {
                    arrayList.add(c5057u0);
                }
            }
            C5003g0 c5003g0 = null;
            if (!arrayList.isEmpty()) {
                int i = 2;
                if (this.f25701e.m11525a()) {
                    Map<String, Long> mapM11492i = this.f25699c.m11492i();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            c5044q1 = null;
                            break;
                        }
                        C5057u0 c5057u1 = (C5057u0) it.next();
                        Long l = (Long) ((HashMap) mapM11492i).get(c5057u1.f25978c.f25958a);
                        if (l != null && c5057u1.f25978c.f25959b == l.longValue()) {
                            f25697a.m11533b(3, "Found promote pack task for session %s with pack %s.", new Object[]{Integer.valueOf(c5057u1.f25976a), c5057u1.f25978c.f25958a});
                            int i2 = c5057u1.f25976a;
                            String str = c5057u1.f25978c.f25958a;
                            this.f25699c.m11503t(str);
                            c5044q1 = new C5072z0(i2, str, null);
                            break;
                        }
                    }
                    if (c5044q1 == null) {
                    }
                    this.f25698b.f26005g.unlock();
                    return c5044q1;
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        c5044q1 = null;
                        break;
                    }
                    C5057u0 c5057u2 = (C5057u0) it2.next();
                    try {
                        C5056u c5056u = this.f25699c;
                        C5054t0 c5054t0 = c5057u2.f25978c;
                        if (c5056u.m11498o(c5054t0.f25958a, c5057u2.f25977b, c5054t0.f25959b) == c5057u2.f25978c.f25962e.size()) {
                            f25697a.m11533b(3, "Found final move task for session %s with pack %s.", new Object[]{Integer.valueOf(c5057u2.f25976a), c5057u2.f25978c.f25958a});
                            int i3 = c5057u2.f25976a;
                            C5054t0 c5054t1 = c5057u2.f25978c;
                            c5044q1 = new C5020k1(i3, c5054t1.f25958a, c5057u2.f25977b, c5054t1.f25959b);
                            break;
                        }
                    } catch (IOException e) {
                        throw new C5011i0(String.format("Failed to check number of completed merges for session %s, pack %s", Integer.valueOf(c5057u2.f25976a), c5057u2.f25978c.f25958a), e, c5057u2.f25976a);
                    }
                }
                if (c5044q1 == null) {
                    Iterator it3 = arrayList.iterator();
                    loop3: while (true) {
                        if (!it3.hasNext()) {
                            c5044q1 = null;
                            break;
                        }
                        C5057u0 c5057u3 = (C5057u0) it3.next();
                        if (C4799a.m10967R(c5057u3.f25978c.f25960c)) {
                            for (C5060v0 c5060v0 : c5057u3.f25978c.f25962e) {
                                C5056u c5056u2 = this.f25699c;
                                C5054t0 c5054t2 = c5057u3.f25978c;
                                if (c5056u2.m11496m(c5054t2.f25958a, c5057u3.f25977b, c5054t2.f25959b, c5060v0.f25982a).exists()) {
                                    f25697a.m11533b(3, "Found merge task for session %s with pack %s and slice %s.", new Object[]{Integer.valueOf(c5057u3.f25976a), c5057u3.f25978c.f25958a, c5060v0.f25982a});
                                    int i4 = c5057u3.f25976a;
                                    C5054t0 c5054t3 = c5057u3.f25978c;
                                    c5044q1 = new C5008h1(i4, c5054t3.f25958a, c5057u3.f25977b, c5054t3.f25959b, c5060v0.f25982a);
                                    break loop3;
                                }
                            }
                        }
                    }
                    if (c5044q1 == null) {
                        Iterator it4 = arrayList.iterator();
                        loop5: while (true) {
                            if (!it4.hasNext()) {
                                c5044q1 = null;
                                break;
                            }
                            C5057u0 c5057u4 = (C5057u0) it4.next();
                            if (C4799a.m10967R(c5057u4.f25978c.f25960c)) {
                                for (C5060v0 c5060v1 : c5057u4.f25978c.f25962e) {
                                    if (m11420b(c5057u4, c5060v1)) {
                                        C5056u c5056u3 = this.f25699c;
                                        C5054t0 c5054t4 = c5057u4.f25978c;
                                        if (c5056u3.m11495l(c5054t4.f25958a, c5057u4.f25977b, c5054t4.f25959b, c5060v1.f25982a).exists()) {
                                            f25697a.m11533b(3, "Found verify task for session %s with pack %s and slice %s.", new Object[]{Integer.valueOf(c5057u4.f25976a), c5057u4.f25978c.f25958a, c5060v1.f25982a});
                                            int i5 = c5057u4.f25976a;
                                            C5054t0 c5054t5 = c5057u4.f25978c;
                                            c5044q1 = new C5064w1(i5, c5054t5.f25958a, c5057u4.f25977b, c5054t5.f25959b, c5060v1.f25982a, c5060v1.f25983b);
                                            break loop5;
                                        }
                                    }
                                }
                            }
                        }
                        if (c5044q1 == null) {
                            Iterator it5 = arrayList.iterator();
                            loop7: while (true) {
                                char c2 = 4;
                                if (!it5.hasNext()) {
                                    c5003g0 = null;
                                    break;
                                }
                                C5057u0 c5057u5 = (C5057u0) it5.next();
                                if (C4799a.m10967R(c5057u5.f25978c.f25960c)) {
                                    for (C5060v0 c5060v2 : c5057u5.f25978c.f25962e) {
                                        int i6 = c5060v2.f25987f;
                                        if (!(i6 == 1 || i6 == i)) {
                                            C5056u c5056u4 = this.f25699c;
                                            C5054t0 c5054t6 = c5057u5.f25978c;
                                            try {
                                                iM11480j = new C5055t1(c5056u4, c5054t6.f25958a, c5057u5.f25977b, c5054t6.f25959b, c5060v2.f25982a).m11480j();
                                            } catch (IOException e2) {
                                                f25697a.m11533b(6, "Slice checkpoint corrupt, restarting extraction. %s", new Object[]{e2});
                                                iM11480j = 0;
                                            }
                                            if (iM11480j != -1 && c5060v2.f25985d.get(iM11480j).f25949a) {
                                                C5089f c5089f = f25697a;
                                                Object[] objArr = new Object[5];
                                                objArr[0] = Integer.valueOf(c5060v2.f25986e);
                                                objArr[1] = Integer.valueOf(c5057u5.f25976a);
                                                objArr[i] = c5057u5.f25978c.f25958a;
                                                objArr[3] = c5060v2.f25982a;
                                                objArr[c2] = Integer.valueOf(iM11480j);
                                                c5089f.m11533b(3, "Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", objArr);
                                                InputStream inputStreamM11425a = this.f25700d.m11425a(c5057u5.f25976a, c5057u5.f25978c.f25958a, c5060v2.f25982a, iM11480j);
                                                int i7 = c5057u5.f25976a;
                                                C5054t0 c5054t7 = c5057u5.f25978c;
                                                String str2 = c5054t7.f25958a;
                                                int i8 = c5057u5.f25977b;
                                                long j2 = c5054t7.f25959b;
                                                String str3 = c5060v2.f25982a;
                                                int i9 = c5060v2.f25986e;
                                                int size = c5060v2.f25985d.size();
                                                C5054t0 c5054t8 = c5057u5.f25978c;
                                                c5003g0 = new C5003g0(i7, str2, i8, j2, str3, i9, iM11480j, size, c5054t8.f25961d, c5054t8.f25960c, inputStreamM11425a);
                                                break loop7;
                                            }
                                            c2 = 4;
                                            i = 2;
                                        }
                                    }
                                }
                            }
                            if (c5003g0 == null) {
                                Iterator it6 = arrayList.iterator();
                                loop9: while (true) {
                                    if (!it6.hasNext()) {
                                        c5044q1 = null;
                                        break;
                                    }
                                    C5057u0 c5057u6 = (C5057u0) it6.next();
                                    if (C4799a.m10967R(c5057u6.f25978c.f25960c)) {
                                        for (C5060v0 c5060v3 : c5057u6.f25978c.f25962e) {
                                            int i10 = c5060v3.f25987f;
                                            if ((i10 == 1 || i10 == 2) && c5060v3.f25985d.get(0).f25949a && !m11420b(c5057u6, c5060v3)) {
                                                f25697a.m11533b(3, "Found patch slice task using patch format %s for session %s, pack %s, slice %s.", new Object[]{Integer.valueOf(c5060v3.f25987f), Integer.valueOf(c5057u6.f25976a), c5057u6.f25978c.f25958a, c5060v3.f25982a});
                                                InputStream inputStreamM11425a2 = this.f25700d.m11425a(c5057u6.f25976a, c5057u6.f25978c.f25958a, c5060v3.f25982a, 0);
                                                int i11 = c5057u6.f25976a;
                                                String str4 = c5057u6.f25978c.f25958a;
                                                c5044q1 = new C5044q1(i11, str4, this.f25699c.m11503t(str4), this.f25699c.m11504u(c5057u6.f25978c.f25958a), c5057u6.f25977b, c5057u6.f25978c.f25959b, c5060v3.f25987f, c5060v3.f25982a, c5060v3.f25984c, inputStreamM11425a2);
                                                break loop9;
                                            }
                                        }
                                    }
                                }
                                if (c5044q1 == null) {
                                    this.f25698b.f26005g.unlock();
                                    return null;
                                }
                            }
                        }
                    }
                }
                this.f25698b.f26005g.unlock();
                return c5044q1;
            }
            this.f25698b.f26005g.unlock();
            return c5003g0;
        } catch (Throwable th) {
            this.f25698b.f26005g.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11420b(C5057u0 c5057u0, C5060v0 c5060v0) {
        C5056u c5056u = this.f25699c;
        C5054t0 c5054t0 = c5057u0.f25978c;
        File fileM11500q = c5056u.m11500q(c5054t0.f25958a, c5057u0.f25977b, c5054t0.f25959b, c5060v0.f25982a);
        if (fileM11500q.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(fileM11500q);
                try {
                    Properties properties = new Properties();
                    properties.load(fileInputStream);
                    fileInputStream.close();
                    if (properties.getProperty("fileStatus") == null) {
                        C5055t1.f25963a.m11533b(6, "Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                    } else if (Integer.parseInt(properties.getProperty("fileStatus")) == 4) {
                        return true;
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        C5084c0.f26038a.mo11527a(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C5055t1.f25963a.m11533b(6, "Could not read checkpoint while checking if extraction finished. %s", new Object[]{e});
            }
        }
        return false;
    }
}
