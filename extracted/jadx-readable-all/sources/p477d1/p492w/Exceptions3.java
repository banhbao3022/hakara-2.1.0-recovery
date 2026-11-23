package p477d1.p492w;

import java.io.File;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.w.b, reason: use source file name */
/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Exceptions3 extends Exceptions4 {
    public /* synthetic */ Exceptions3(File file, File file2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Exceptions3(File file, File file2, String str) {
        super(file, file2, str);
        Intrinsics2.m13089e(file, "file");
    }
}
