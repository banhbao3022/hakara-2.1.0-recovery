package p007c.p190n.p194b.p266d.p298f.p302q;

import android.app.PendingIntent;
import android.os.Bundle;
import p007c.p190n.p194b.p266d.p298f.C2602b;

/* JADX INFO: renamed from: c.n.b.d.f.q.h0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2733h0 extends AbstractC2754q0<Boolean> {

    /* JADX INFO: renamed from: d */
    public final int f11874d;

    /* JADX INFO: renamed from: e */
    public final Bundle f11875e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC2717c f11876f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2733h0(AbstractC2717c abstractC2717c, int i, Bundle bundle) {
        super(abstractC2717c, Boolean.TRUE);
        this.f11876f = abstractC2717c;
        this.f11874d = i;
        this.f11875e = bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2754q0
    /* JADX INFO: renamed from: a */
    public final void mo5594a() {
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2754q0
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo5595b(Boolean bool) {
        C2602b c2602b;
        if (this.f11874d != 0) {
            this.f11876f.m5570B(1, null);
            Bundle bundle = this.f11875e;
            c2602b = new C2602b(this.f11874d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        } else {
            if (mo5596d()) {
                return;
            }
            this.f11876f.m5570B(1, null);
            c2602b = new C2602b(8, null);
        }
        mo5597e(c2602b);
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo5596d();

    /* JADX INFO: renamed from: e */
    public abstract void mo5597e(C2602b c2602b);
}
