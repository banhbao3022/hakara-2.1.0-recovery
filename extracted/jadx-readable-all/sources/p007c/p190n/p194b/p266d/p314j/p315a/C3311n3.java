package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: c.n.b.d.j.a.n3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3311n3 {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f17006a;

    /* JADX INFO: renamed from: b */
    public final Set<AbstractC3679x0<?>> f17007b;

    /* JADX INFO: renamed from: c */
    public final PriorityBlockingQueue<AbstractC3679x0<?>> f17008c;

    /* JADX INFO: renamed from: d */
    public final PriorityBlockingQueue<AbstractC3679x0<?>> f17009d;

    /* JADX INFO: renamed from: e */
    public final gk2 f17010e;

    /* JADX INFO: renamed from: f */
    public final ps2 f17011f;

    /* JADX INFO: renamed from: g */
    public final nt2[] f17012g;

    /* JADX INFO: renamed from: h */
    public fm2 f17013h;

    /* JADX INFO: renamed from: i */
    public final List<InterfaceC3384p2> f17014i;

    /* JADX INFO: renamed from: j */
    public final List<InterfaceC3568u1> f17015j;

    /* JADX INFO: renamed from: k */
    public final vq2 f17016k;

    public C3311n3(gk2 gk2Var, ps2 ps2Var, int i) {
        vq2 vq2Var = new vq2(new Handler(Looper.getMainLooper()));
        this.f17006a = new AtomicInteger();
        this.f17007b = new HashSet();
        this.f17008c = new PriorityBlockingQueue<>();
        this.f17009d = new PriorityBlockingQueue<>();
        this.f17014i = new ArrayList();
        this.f17015j = new ArrayList();
        this.f17010e = gk2Var;
        this.f17011f = ps2Var;
        this.f17012g = new nt2[4];
        this.f17016k = vq2Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m7770a() {
        fm2 fm2Var = this.f17013h;
        if (fm2Var != null) {
            fm2Var.f14063j = true;
            fm2Var.interrupt();
        }
        nt2[] nt2VarArr = this.f17012g;
        for (int i = 0; i < 4; i++) {
            nt2 nt2Var = nt2VarArr[i];
            if (nt2Var != null) {
                nt2Var.f17272i = true;
                nt2Var.interrupt();
            }
        }
        fm2 fm2Var2 = new fm2(this.f17008c, this.f17009d, this.f17010e, this.f17016k, null);
        this.f17013h = fm2Var2;
        fm2Var2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            nt2 nt2Var2 = new nt2(this.f17009d, this.f17011f, this.f17010e, this.f17016k, null);
            this.f17012g[i2] = nt2Var2;
            nt2Var2.start();
        }
    }

    /* JADX INFO: renamed from: b */
    public final <T> AbstractC3679x0<T> m7771b(AbstractC3679x0<T> abstractC3679x0) {
        abstractC3679x0.f21410m = this;
        synchronized (this.f17007b) {
            this.f17007b.add(abstractC3679x0);
        }
        abstractC3679x0.f21409l = Integer.valueOf(this.f17006a.incrementAndGet());
        abstractC3679x0.m8702f("add-to-queue");
        m7772c(abstractC3679x0, 0);
        this.f17008c.add(abstractC3679x0);
        return abstractC3679x0;
    }

    /* JADX INFO: renamed from: c */
    public final void m7772c(AbstractC3679x0<?> abstractC3679x0, int i) {
        synchronized (this.f17015j) {
            Iterator<InterfaceC3568u1> it = this.f17015j.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }
}
