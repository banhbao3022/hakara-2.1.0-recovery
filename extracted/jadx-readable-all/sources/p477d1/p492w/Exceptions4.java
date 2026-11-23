package p477d1.p492w;

import java.io.File;
import java.io.IOException;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.w.c, reason: use source file name */
/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes.dex */
public class Exceptions4 extends IOException {
    public Exceptions4(File file, File file2, String str) {
        Intrinsics2.m13089e(file, "file");
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String string = sb.toString();
        Intrinsics2.m13088d(string, "sb.toString()");
        super(string);
    }

    public /* synthetic */ Exceptions4(File file, File file2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }
}
