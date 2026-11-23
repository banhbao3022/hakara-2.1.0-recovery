package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.n.b.d.k.b.k5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC4571k5 implements Callable<List<C4624oa>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f24059a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f24060b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f24061c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BinderC4463b5 f24062d;

    public CallableC4571k5(BinderC4463b5 binderC4463b5, String str, String str2, String str3) {
        this.f24062d = binderC4463b5;
        this.f24059a = str;
        this.f24060b = str2;
        this.f24061c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C4624oa> call() throws Exception {
        this.f24062d.f23726f.m10670R();
        return this.f24062d.f23726f.m10663K().m10561U(this.f24059a, this.f24060b, this.f24061c);
    }
}
