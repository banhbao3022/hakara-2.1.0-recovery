package p007c.p008a.p009a.p010a.p014h.p021j;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Arrays;
import p007c.p008a.p009a.p010a.p014h.p021j.p022b.MediaSourceBuilder;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.h.j.a, reason: use source file name */
/* JADX INFO: compiled from: MediaSourceProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public class MediaSourceProvider {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"DefaultLocale"})
    public static final String f1568a;

    /* JADX INFO: renamed from: b */
    public static final a f1569b = new a(null);

    /* JADX INFO: renamed from: c.a.a.a.h.j.a$a */
    /* JADX INFO: compiled from: MediaSourceProvider.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: c.a.a.a.h.j.a$b */
    /* JADX INFO: compiled from: MediaSourceProvider.kt */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final MediaSourceBuilder f1570a;

        /* JADX INFO: renamed from: b */
        public final String f1571b;

        /* JADX INFO: renamed from: c */
        public final String f1572c;

        /* JADX INFO: renamed from: d */
        public final String f1573d;

        public b(MediaSourceBuilder mediaSourceBuilder, String str, String str2, String str3) {
            Intrinsics2.m13089e(mediaSourceBuilder, "builder");
            this.f1570a = mediaSourceBuilder;
            this.f1571b = str;
            this.f1572c = str2;
            this.f1573d = str3;
        }
    }

    static {
        String str = String.format("ExoMedia %s (%d) / Android %s / %s", Arrays.copyOf(new Object[]{"5.0.0", 50000, Build.VERSION.RELEASE, Build.MODEL}, 4));
        Intrinsics2.m13088d(str, "java.lang.String.format(format, *args)");
        f1568a = str;
    }
}
