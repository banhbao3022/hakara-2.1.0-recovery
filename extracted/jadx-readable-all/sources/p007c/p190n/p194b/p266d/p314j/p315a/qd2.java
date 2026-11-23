package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class qd2 extends pd2 {
    public qd2(Context context, String str, boolean z, int i) {
        super(context, str, z, i);
    }

    /* JADX INFO: renamed from: r */
    public static qd2 m8201r(String str, Context context, boolean z, int i) {
        synchronized (pd2.class) {
            if (!pd2.f17934E) {
                pd2.f17935F = System.currentTimeMillis() / 1000;
                pc2.f17907f = pd2.m8098l(context, z);
                pd2.f17934E = true;
            }
        }
        synchronized (pd2.class) {
            if (pd2.f17936z == null && pd2.m8101q(i)) {
                qp1 qp1Var = new qp1();
                qp1Var.m8222a(false);
                qp1Var.f18405c = Boolean.TRUE;
                Objects.requireNonNull(str, "Null clientVersion");
                qp1Var.f18403a = str;
                qp1Var.f18404b = Boolean.valueOf(z);
                pp1 pp1VarM8223b = qp1Var.m8223b();
                np1 np1VarM7912a = np1.m7912a(context, Executors.newFixedThreadPool(1), true);
                pd2.f17931B = np1VarM7912a;
                pd2.f17936z = x82.m8726l(context, np1VarM7912a, pp1VarM8223b, Executors.newCachedThreadPool());
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
                pd2.f17930A = executorServiceNewFixedThreadPool;
                executorServiceNewFixedThreadPool.execute(new id2());
            }
        }
        return new qd2(context, str, z, i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.pd2
    /* JADX INFO: renamed from: n */
    public final List<Callable<Void>> mo8104n(pe2 pe2Var, Context context, go0 go0Var, df0 df0Var) {
        if (pe2Var.f17948c == null || !this.f17937G) {
            return super.mo8104n(pe2Var, context, go0Var, null);
        }
        int iM8112d = pe2Var.m8112d();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo8104n(pe2Var, context, go0Var, null));
        arrayList.add(new df2(pe2Var, "HDBr8nc5ubdBn1y5M6IpuatOFh1+XK9blifaQQrU1HNvfw3hhdVJEUnkWE7sod57", "A6vbZ9nEwiHcLSfXI6B1ZE45FocqpxNzrogO6LWG5xM=", go0Var, iM8112d, 24));
        return arrayList;
    }
}
