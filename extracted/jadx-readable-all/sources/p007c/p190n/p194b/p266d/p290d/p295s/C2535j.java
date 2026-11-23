package p007c.p190n.p194b.p266d.p290d.p295s;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;

/* JADX INFO: renamed from: c.n.b.d.d.s.j */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2535j {

    /* JADX INFO: renamed from: a */
    public static final C2628a.g<C2522c0> f11422a = new C2628a.g<>();

    /* JADX INFO: renamed from: b */
    public static final C2628a.g<C2532h0> f11423b = new C2628a.g<>();

    static {
        new C2628a.g();
        new C2628a.g();
        new C2628a.g();
        new C2628a.g();
        try {
            Charset.forName(Utf8Charset.NAME);
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
        }
        C2516a.m5116f("com.google.cast.multizone");
    }
}
