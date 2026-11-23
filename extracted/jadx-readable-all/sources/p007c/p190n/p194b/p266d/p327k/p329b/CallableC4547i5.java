package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.n.b.d.k.b.i5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC4547i5 implements Callable<List<C4734y9>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f23993a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f23994b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23995c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BinderC4463b5 f23996d;

    public CallableC4547i5(BinderC4463b5 binderC4463b5, String str, String str2, String str3) {
        this.f23996d = binderC4463b5;
        this.f23993a = str;
        this.f23994b = str2;
        this.f23995c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C4734y9> call() throws Exception {
        this.f23996d.f23726f.m10670R();
        return this.f23996d.f23726f.m10663K().m10546E(this.f23993a, this.f23994b, this.f23995c);
    }
}
