package p623k1;

import java.lang.annotation.Annotation;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: k1.d0, reason: use source file name */
/* JADX INFO: compiled from: SkipCallbackExecutorImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public final class SkipCallbackExecutorImpl implements SkipCallbackExecutor {

    /* JADX INFO: renamed from: a */
    public static final SkipCallbackExecutor f33136a = new SkipCallbackExecutorImpl();

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return SkipCallbackExecutor.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof SkipCallbackExecutor;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("@");
        sbM1556G.append(SkipCallbackExecutor.class.getName());
        sbM1556G.append("()");
        return sbM1556G.toString();
    }
}
