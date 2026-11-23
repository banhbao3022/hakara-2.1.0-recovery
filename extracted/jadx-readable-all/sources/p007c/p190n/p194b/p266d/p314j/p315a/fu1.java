package p007c.p190n.p194b.p266d.p314j.p315a;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fu1<I, O> extends hu1<I, O, qu1<? super I, ? extends O>, kv1<? extends O>> {
    public fu1(kv1<? extends I> kv1Var, qu1<? super I, ? extends O> qu1Var) {
        super(kv1Var, qu1Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hu1
    /* JADX INFO: renamed from: t */
    public final /* bridge */ /* synthetic */ void mo6860t(Object obj) {
        m6533n((kv1) obj);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hu1
    /* JADX INFO: renamed from: u */
    public final /* bridge */ /* synthetic */ Object mo6861u(Object obj, @NullableDecl Object obj2) throws Exception {
        qu1 qu1Var = (qu1) obj;
        kv1<O> kv1VarMo4612a = qu1Var.mo4612a(obj2);
        C2622l.m5427r2(kv1VarMo4612a, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", qu1Var);
        return kv1VarMo4612a;
    }
}
