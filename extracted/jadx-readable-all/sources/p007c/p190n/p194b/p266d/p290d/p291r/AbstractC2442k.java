package p007c.p190n.p194b.p266d.p290d.p291r;

import android.content.Context;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.r.k */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2442k {

    /* JADX INFO: renamed from: a */
    public final Context f11194a;

    /* JADX INFO: renamed from: b */
    public final String f11195b;

    /* JADX INFO: renamed from: c */
    public final a f11196c = new a(null);

    /* JADX INFO: renamed from: c.n.b.d.d.r.k$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public class a extends AbstractBinderC2502n {
        public a(C2506r c2506r) {
        }
    }

    public AbstractC2442k(Context context, String str) {
        Objects.requireNonNull(context, "null reference");
        this.f11194a = context.getApplicationContext();
        C2622l.m5359e(str);
        this.f11195b = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC2436h mo5034a(String str);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo5035b();
}
