package p007c.p190n.p194b.p266d.p314j.p320f;

import android.content.Context;
import java.util.List;
import p007c.p190n.p194b.p266d.p289c.C2370a;
import p007c.p190n.p194b.p266d.p290d.p291r.AbstractC2436h;
import p007c.p190n.p194b.p266d.p290d.p291r.AbstractC2442k;
import p007c.p190n.p194b.p266d.p290d.p291r.C2424b;
import p007c.p190n.p194b.p266d.p290d.p291r.C2426c;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.p293i.C2470k;

/* JADX INFO: renamed from: c.n.b.d.j.f.i */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3888i extends AbstractC2442k {

    /* JADX INFO: renamed from: d */
    public final C2424b f22698d;

    /* JADX INFO: renamed from: e */
    public final BinderC3958p f22699e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3907j8 f22700f;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3888i(Context context, C2424b c2424b, BinderC3958p binderC3958p) {
        String strM4939a;
        if (c2424b.m5002H().isEmpty()) {
            String str = c2424b.f11152f;
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            strM4939a = C2370a.m4939a("com.google.android.gms.cast.CATEGORY_CAST", str, null);
        } else {
            String str2 = c2424b.f11152f;
            List<String> listM5002H = c2424b.m5002H();
            if (str2 == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (listM5002H == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            strM4939a = C2370a.m4939a("com.google.android.gms.cast.CATEGORY_CAST", str2, listM5002H);
        }
        super(context, strM4939a);
        this.f22698d = c2424b;
        this.f22699e = binderC3958p;
        this.f22700f = new C3838d();
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.AbstractC2442k
    /* JADX INFO: renamed from: a */
    public final AbstractC2436h mo5034a(String str) {
        return new C2426c(this.f11194a, this.f11195b, str, this.f22698d, this.f22700f, new C2470k(this.f11194a, this.f22698d, this.f22699e));
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.AbstractC2442k
    /* JADX INFO: renamed from: b */
    public final boolean mo5035b() {
        return this.f22698d.f11156j;
    }
}
