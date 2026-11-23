package p623k1;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: k1.l, reason: use source file name */
/* JADX INFO: compiled from: Invocation.java */
/* JADX INFO: loaded from: classes2.dex */
public final class Invocation {

    /* JADX INFO: renamed from: a */
    public final Method f33172a;

    /* JADX INFO: renamed from: b */
    public final List<?> f33173b;

    public Invocation(Method method, List<?> list) {
        this.f33172a = method;
        this.f33173b = Collections.unmodifiableList(list);
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f33172a.getDeclaringClass().getName(), this.f33172a.getName(), this.f33173b);
    }
}
