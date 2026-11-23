package p001a1.p002a.p003a;

import android.graphics.Bitmap;
import p001a1.p002a.p003a.p004e.Compression;
import p001a1.p002a.p003a.p004e.DefaultConstraint;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: a1.a.a.a, reason: use source file name */
/* JADX INFO: compiled from: Compressor.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Compressor extends Lambda implements InterfaceC6164l<Compression, Unit> {

    /* JADX INFO: renamed from: g */
    public static final Compressor f3g = new Compressor();

    public Compressor() {
        super(1);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(Compression compression) {
        Compression compression2 = compression;
        Intrinsics2.m13090f(compression2, "$receiver");
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        Intrinsics2.m13090f(compression2, "$this$default");
        Intrinsics2.m13090f(compressFormat, "format");
        DefaultConstraint defaultConstraint = new DefaultConstraint(612, 816, compressFormat, 80);
        Intrinsics2.m13090f(defaultConstraint, "constraint");
        compression2.f10a.add(defaultConstraint);
        return Unit.f29502a;
    }
}
