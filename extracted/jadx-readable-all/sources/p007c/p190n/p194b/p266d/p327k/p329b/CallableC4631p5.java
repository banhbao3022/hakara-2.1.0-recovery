package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.n.b.d.k.b.p5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC4631p5 implements Callable<List<C4734y9>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C4480ca f24268a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BinderC4463b5 f24269b;

    public CallableC4631p5(BinderC4463b5 binderC4463b5, C4480ca c4480ca) {
        this.f24269b = binderC4463b5;
        this.f24268a = c4480ca;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C4734y9> call() throws Exception {
        this.f24269b.f23726f.m10670R();
        return this.f24269b.f23726f.m10663K().m10544C(this.f24268a.f23798f);
    }
}
