package p007c.p190n.p194b.p367f.p368a.p370b;

import java.io.File;
import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;

/* JADX INFO: renamed from: c.n.b.f.a.b.i1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5012i1 {

    /* JADX INFO: renamed from: a */
    public static final C5089f f25826a = new C5089f("MergeSliceTaskHandler");

    /* JADX INFO: renamed from: b */
    public final C5056u f25827b;

    public C5012i1(C5056u c5056u) {
        this.f25827b = c5056u;
    }

    /* JADX INFO: renamed from: b */
    public static void m11455b(File file, File file2) {
        if (!file.isDirectory()) {
            if (file2.exists()) {
                String strValueOf = String.valueOf(file2);
                throw new C5011i0(outline.m1550A(new StringBuilder(strValueOf.length() + 51), "File clashing with existing file from other slice: ", strValueOf));
            }
            if (file.renameTo(file2)) {
                return;
            }
            String strValueOf2 = String.valueOf(file);
            throw new C5011i0(outline.m1550A(new StringBuilder(strValueOf2.length() + 21), "Unable to move file: ", strValueOf2));
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            m11455b(file3, new File(file2, file3.getName()));
        }
        if (file.delete()) {
            return;
        }
        String strValueOf3 = String.valueOf(file);
        throw new C5011i0(outline.m1550A(new StringBuilder(strValueOf3.length() + 28), "Unable to delete directory: ", strValueOf3));
    }

    /* JADX INFO: renamed from: a */
    public final void m11456a(C5008h1 c5008h1) {
        File fileM11496m = this.f25827b.m11496m(c5008h1.f26031b, c5008h1.f25818c, c5008h1.f25819d, c5008h1.f25820e);
        if (!fileM11496m.exists()) {
            throw new C5011i0(String.format("Cannot find verified files for slice %s.", c5008h1.f25820e), c5008h1.f26030a);
        }
        File fileM11497n = this.f25827b.m11497n(c5008h1.f26031b, c5008h1.f25818c, c5008h1.f25819d);
        if (!fileM11497n.exists()) {
            fileM11497n.mkdirs();
        }
        m11455b(fileM11496m, fileM11497n);
        try {
            this.f25827b.m11499p(c5008h1.f26031b, c5008h1.f25818c, c5008h1.f25819d, this.f25827b.m11498o(c5008h1.f26031b, c5008h1.f25818c, c5008h1.f25819d) + 1);
        } catch (IOException e) {
            f25826a.m11533b(6, "Writing merge checkpoint failed with %s.", new Object[]{e.getMessage()});
            throw new C5011i0("Writing merge checkpoint failed.", e, c5008h1.f26030a);
        }
    }
}
