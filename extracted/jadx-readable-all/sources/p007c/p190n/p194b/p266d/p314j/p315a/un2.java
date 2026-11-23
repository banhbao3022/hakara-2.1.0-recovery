package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class un2 {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f20381a;

    /* JADX INFO: renamed from: b */
    public rn2<? extends sn2> f20382b;

    /* JADX INFO: renamed from: c */
    public IOException f20383c;

    public un2(String str) {
        int i = jo2.f15673a;
        this.f20381a = Executors.newSingleThreadExecutor(new io2());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8513a() {
        return this.f20382b != null;
    }

    /* JADX INFO: renamed from: b */
    public final void m8514b(int i) throws IOException {
        IOException iOException = this.f20383c;
        if (iOException != null) {
            throw iOException;
        }
        rn2<? extends sn2> rn2Var = this.f20382b;
        if (rn2Var != null) {
            int i2 = rn2Var.f18971h;
            IOException iOException2 = rn2Var.f18973j;
            if (iOException2 != null && rn2Var.f18974k > i2) {
                throw iOException2;
            }
        }
    }
}
