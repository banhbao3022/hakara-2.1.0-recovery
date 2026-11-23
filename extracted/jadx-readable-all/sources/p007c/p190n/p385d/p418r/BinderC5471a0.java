package p007c.p190n.p385d.p418r;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.C4778g0;
import p007c.p190n.p194b.p266d.p333n.C4793u;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4771d;
import p007c.p190n.p385d.p428w.AbstractServiceC5542g;

/* JADX INFO: renamed from: c.n.d.r.a0 */
/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class BinderC5471a0 extends Binder {

    /* JADX INFO: renamed from: f */
    public final a f27044f;

    /* JADX INFO: renamed from: c.n.d.r.a0$a */
    /* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
    public interface a {
    }

    public BinderC5471a0(a aVar) {
        this.f27044f = aVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: a */
    public void m12061a(final ServiceConnectionC5477d0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
        }
        a aVar2 = this.f27044f;
        AbstractC4781i<Void> abstractC4781iM12186f = AbstractServiceC5542g.this.m12186f(aVar.f27058a);
        Executor executor = C5482h.f27066a;
        C4778g0 c4778g0 = (C4778g0) abstractC4781iM12186f;
        c4778g0.f24676b.m10927b(new C4793u(ExecutorC5481g.f27065f, new InterfaceC4771d(aVar) { // from class: c.n.d.r.z

            /* JADX INFO: renamed from: a */
            public final ServiceConnectionC5477d0.a f27117a;

            {
                this.f27117a = aVar;
            }

            @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4771d
            /* JADX INFO: renamed from: b */
            public void mo5171b(AbstractC4781i abstractC4781i) {
                this.f27117a.m12065a();
            }
        }));
        c4778g0.m10946s();
    }
}
