package p636z0.p667e.p676b.p677v1.p678r1.p680c;

import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p655c.p656a.p659c.Function3;

/* JADX INFO: Add missing generic type declarations: [I, O] */
/* JADX INFO: renamed from: z0.e.b.v1.r1.c.f, reason: use source file name */
/* JADX INFO: compiled from: Futures.java */
/* JADX INFO: loaded from: classes.dex */
public class Futures<I, O> implements AsyncFunction<I, O> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function3 f36276a;

    public Futures(Function3 function3) {
        this.f36276a = function3;
    }

    @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.AsyncFunction
    public ListenableFuture<O> apply(I i) {
        return Futures2.m15428c(this.f36276a.apply(i));
    }
}
