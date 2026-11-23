package p636z0.p667e.p676b.p677v1.p678r1.p680c;

import p007c.p190n.p378c.p383e.p384a.ListenableFuture;

/* JADX INFO: renamed from: z0.e.b.v1.r1.c.b, reason: use source file name */
/* JADX INFO: compiled from: AsyncFunction.java */
/* JADX INFO: loaded from: classes.dex */
@FunctionalInterface
public interface AsyncFunction<I, O> {
    ListenableFuture<O> apply(I i) throws Exception;
}
