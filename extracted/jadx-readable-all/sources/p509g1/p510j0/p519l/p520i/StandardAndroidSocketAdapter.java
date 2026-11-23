package p509g1.p510j0.p519l.p520i;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: g1.j0.l.i.l, reason: use source file name */
/* JADX INFO: compiled from: StandardAndroidSocketAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StandardAndroidSocketAdapter extends AndroidSocketAdapter2 {

    /* JADX INFO: renamed from: h */
    public static final a f30574h = new a(null);

    /* JADX INFO: renamed from: g1.j0.l.i.l$a */
    /* JADX INFO: compiled from: StandardAndroidSocketAdapter.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardAndroidSocketAdapter(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        Intrinsics2.m13090f(cls, "sslSocketClass");
        Intrinsics2.m13090f(cls2, "sslSocketFactoryClass");
        Intrinsics2.m13090f(cls3, "paramClass");
    }
}
