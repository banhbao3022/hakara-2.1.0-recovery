package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.n.b.d.k.b.f5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC4511f5 implements Callable<List<C4734y9>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C4480ca f23912a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f23913b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23914c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BinderC4463b5 f23915d;

    public CallableC4511f5(BinderC4463b5 binderC4463b5, C4480ca c4480ca, String str, String str2) {
        this.f23915d = binderC4463b5;
        this.f23912a = c4480ca;
        this.f23913b = str;
        this.f23914c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C4734y9> call() throws Exception {
        this.f23915d.f23726f.m10670R();
        return this.f23915d.f23726f.m10663K().m10546E(this.f23912a.f23798f, this.f23913b, this.f23914c);
    }
}
