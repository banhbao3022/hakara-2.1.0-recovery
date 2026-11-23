package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class k41 implements r80 {

    /* JADX INFO: renamed from: f */
    public final AtomicReference<InterfaceC2864b1> f15882f = new AtomicReference<>();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.r80
    /* JADX INFO: renamed from: a */
    public final void mo6968a(final lw2 lw2Var) {
        cw0.m6234d(this.f15882f, new ze1(lw2Var) { // from class: c.n.b.d.j.a.j41

            /* JADX INFO: renamed from: a */
            public final lw2 f15474a;

            {
                this.f15474a = lw2Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.ze1
            /* JADX INFO: renamed from: a */
            public final void mo5685a(Object obj) throws RemoteException {
                ((InterfaceC2864b1) obj).mo5908o4(this.f15474a);
            }
        });
    }
}
