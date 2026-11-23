package p007c.p190n.p378c.p379a;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: c.n.c.a.d, reason: use source file name */
/* JADX INFO: compiled from: Function.java */
/* JADX INFO: loaded from: classes.dex */
public interface Function<F, T> {
    @CanIgnoreReturnValue
    @NullableDecl
    T apply(@NullableDecl F f);
}
