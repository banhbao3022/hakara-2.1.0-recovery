package p007c.p190n.p194b.p266d.p314j.p315a;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class e92 implements ca2 {

    /* JADX INFO: renamed from: a */
    public static final k92 f13533a = new c92();

    /* JADX INFO: renamed from: b */
    public final k92 f13534b;

    public e92() {
        k92 k92Var;
        k92[] k92VarArr = new k92[2];
        k92VarArr[0] = c82.f12957a;
        try {
            k92Var = (k92) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            k92Var = f13533a;
        }
        k92VarArr[1] = k92Var;
        d92 d92Var = new d92(k92VarArr);
        Charset charset = p82.f17879a;
        this.f13534b = d92Var;
    }
}
