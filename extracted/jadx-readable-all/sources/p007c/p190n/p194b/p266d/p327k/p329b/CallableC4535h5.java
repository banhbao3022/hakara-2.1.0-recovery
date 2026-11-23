package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.n.b.d.k.b.h5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC4535h5 implements Callable<List<C4624oa>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C4480ca f23967a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f23968b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23969c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BinderC4463b5 f23970d;

    public CallableC4535h5(BinderC4463b5 binderC4463b5, C4480ca c4480ca, String str, String str2) {
        this.f23970d = binderC4463b5;
        this.f23967a = c4480ca;
        this.f23968b = str;
        this.f23969c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C4624oa> call() throws Exception {
        this.f23970d.f23726f.m10670R();
        return this.f23970d.f23726f.m10663K().m10561U(this.f23967a.f23798f, this.f23968b, this.f23969c);
    }
}
