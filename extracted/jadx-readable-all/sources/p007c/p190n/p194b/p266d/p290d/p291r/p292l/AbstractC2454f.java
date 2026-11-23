package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import android.content.Context;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.f */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2454f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2497y f11233a = new a(null);

    /* JADX INFO: renamed from: c.n.b.d.d.r.l.f$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public class a extends InterfaceC2497y.a {
        public a(C2480k0 c2480k0) {
        }

        @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.InterfaceC2497y
        /* JADX INFO: renamed from: O3 */
        public final int[] mo5037O3() {
            return AbstractC2454f.this.m5056a();
        }

        @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.InterfaceC2497y
        /* JADX INFO: renamed from: v1 */
        public final List<C2452e> mo5038v1() {
            return AbstractC2454f.this.m5057b();
        }
    }

    public AbstractC2454f(Context context) {
        context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public abstract int[] m5056a();

    /* JADX INFO: renamed from: b */
    public abstract List<C2452e> m5057b();
}
