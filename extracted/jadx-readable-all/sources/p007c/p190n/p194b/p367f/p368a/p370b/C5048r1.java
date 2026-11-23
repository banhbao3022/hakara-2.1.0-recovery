package p007c.p190n.p194b.p367f.p368a.p370b;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p367f.p368a.p373d.C5084c0;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5086d0;

/* JADX INFO: renamed from: c.n.b.f.a.b.r1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5048r1 {

    /* JADX INFO: renamed from: a */
    public static final C5089f f25943a = new C5089f("PatchSliceTaskHandler");

    /* JADX INFO: renamed from: b */
    public final C5056u f25944b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5086d0<InterfaceC5037o2> f25945c;

    public C5048r1(C5056u c5056u, InterfaceC5086d0<InterfaceC5037o2> interfaceC5086d0) {
        this.f25944b = c5056u;
        this.f25945c = interfaceC5086d0;
    }

    /* JADX INFO: renamed from: a */
    public final void m11470a(C5044q1 c5044q1) {
        File fileM11494k = this.f25944b.m11494k(c5044q1.f26031b, c5044q1.f25922c, c5044q1.f25923d);
        C5056u c5056u = this.f25944b;
        String str = c5044q1.f26031b;
        int i = c5044q1.f25922c;
        long j2 = c5044q1.f25923d;
        String str2 = c5044q1.f25927h;
        Objects.requireNonNull(c5056u);
        File file = new File(new File(c5056u.m11494k(str, i, j2), "_metadata"), str2);
        try {
            InputStream gZIPInputStream = c5044q1.f25929j;
            if (c5044q1.f25926g == 2) {
                gZIPInputStream = new GZIPInputStream(gZIPInputStream, 8192);
            }
            try {
                C5062w c5062w = new C5062w(fileM11494k, file);
                File fileM11495l = this.f25944b.m11495l(c5044q1.f26031b, c5044q1.f25924e, c5044q1.f25925f, c5044q1.f25927h);
                if (!fileM11495l.exists()) {
                    fileM11495l.mkdirs();
                }
                C5055t1 c5055t1 = new C5055t1(this.f25944b, c5044q1.f26031b, c5044q1.f25924e, c5044q1.f25925f, c5044q1.f25927h);
                C4799a.m10987f0(c5062w, gZIPInputStream, new C5023l0(fileM11495l, c5055t1), c5044q1.f25928i);
                c5055t1.m11474d(0);
                gZIPInputStream.close();
                f25943a.m11533b(4, "Patching and extraction finished for slice %s of pack %s.", new Object[]{c5044q1.f25927h, c5044q1.f26031b});
                this.f25945c.m11529a().mo11435c(c5044q1.f26030a, c5044q1.f26031b, c5044q1.f25927h, 0);
                try {
                    c5044q1.f25929j.close();
                } catch (IOException unused) {
                    f25943a.m11533b(5, "Could not close file for slice %s of pack %s.", new Object[]{c5044q1.f25927h, c5044q1.f26031b});
                }
            } catch (Throwable th) {
                try {
                    gZIPInputStream.close();
                } catch (Throwable th2) {
                    C5084c0.f26038a.mo11527a(th, th2);
                }
                throw th;
            }
        } catch (IOException e) {
            f25943a.m11533b(6, "IOException during patching %s.", new Object[]{e.getMessage()});
            throw new C5011i0(String.format("Error patching slice %s of pack %s.", c5044q1.f25927h, c5044q1.f26031b), e, c5044q1.f26030a);
        }
    }
}
