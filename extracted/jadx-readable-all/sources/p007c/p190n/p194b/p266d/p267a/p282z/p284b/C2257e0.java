package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.content.Context;
import java.io.File;
import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.C3111hp;
import p007c.p190n.p194b.p266d.p314j.p315a.C3190ju;
import p007c.p190n.p194b.p266d.p314j.p315a.C3285me;
import p007c.p190n.p194b.p266d.p314j.p315a.C3311n3;
import p007c.p190n.p194b.p266d.p314j.p315a.C3328nk;
import p007c.p190n.p194b.p266d.p314j.p315a.C3368on;
import p007c.p190n.p194b.p266d.p314j.p315a.C3553tn;
import p007c.p190n.p194b.p266d.p314j.p315a.ji2;
import p007c.p190n.p194b.p266d.p314j.p315a.kv1;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.e0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2257e0 {

    /* JADX INFO: renamed from: a */
    public static C3311n3 f10703a;

    /* JADX INFO: renamed from: b */
    public static final Object f10704b = new Object();

    public C2257e0(Context context) {
        C3311n3 c3311n3;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f10704b) {
            try {
                if (f10703a == null) {
                    C3052g3.m6922a(context);
                    if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14404n2)).booleanValue()) {
                        c3311n3 = new C3311n3(new C3328nk(new File(context.getCacheDir(), "admob_volley"), 20971520), new C2289p(context, new C3111hp(null, null)), 4);
                        c3311n3.m7770a();
                    } else {
                        c3311n3 = new C3311n3(new C3328nk(new C3190ju(context.getApplicationContext()), 5242880), new C3285me(new C3111hp(null, null)), 4);
                        c3311n3.m7770a();
                    }
                    f10703a = c3311n3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final kv1<String> m4734a(int i, String str, Map<String, String> map, byte[] bArr) {
        byte[] bArr2 = null;
        C2248b0 c2248b0 = new C2248b0(null);
        C2308y c2308y = new C2308y(str, c2248b0);
        C3553tn c3553tn = new C3553tn(null);
        C2310z c2310z = new C2310z(i, str, c2248b0, c2308y, bArr, map, c3553tn);
        if (C3553tn.m8431d()) {
            try {
                Map<String, String> mapMo4829q = c2310z.mo4829q();
                if (bArr != null) {
                    bArr2 = bArr;
                }
                if (C3553tn.m8431d()) {
                    c3553tn.m8436f("onNetworkRequest", new C3368on(str, "GET", mapMo4829q, bArr2));
                }
            } catch (ji2 e) {
                C2622l.m5226A3(e.getMessage());
            }
        }
        f10703a.m7771b(c2310z);
        return c2248b0;
    }
}
