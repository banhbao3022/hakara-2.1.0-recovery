package p477d1.p492w;

import java.io.File;
import p477d1.p492w.FileTreeWalk.b;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.w.i, reason: use source file name */
/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes.dex */
public class Utils7 extends FileTreeWalk3 {
    /* JADX INFO: renamed from: a */
    public static final boolean m13078a(File file) {
        Intrinsics2.m13089e(file, "$this$deleteRecursively");
        Intrinsics2.m13089e(file, "$this$walkBottomUp");
        FileTreeWalk2 fileTreeWalk2 = FileTreeWalk2.BOTTOM_UP;
        Intrinsics2.m13089e(file, "$this$walk");
        Intrinsics2.m13089e(fileTreeWalk2, "direction");
        FileTreeWalk.b bVar = new FileTreeWalk(file, fileTreeWalk2).new b();
        while (true) {
            boolean z = true;
            while (bVar.hasNext()) {
                File next = bVar.next();
                if (next.delete() || !next.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return z;
        }
    }
}
