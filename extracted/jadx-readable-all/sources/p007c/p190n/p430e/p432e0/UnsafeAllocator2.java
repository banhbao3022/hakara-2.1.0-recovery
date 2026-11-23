package p007c.p190n.p430e.p432e0;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: c.n.e.e0.w, reason: use source file name */
/* JADX INFO: compiled from: UnsafeAllocator.java */
/* JADX INFO: loaded from: classes.dex */
public class UnsafeAllocator2 extends UnsafeAllocator5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f27510a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f27511b;

    public UnsafeAllocator2(Method method, int i) {
        this.f27510a = method;
        this.f27511b = i;
    }

    @Override // p007c.p190n.p430e.p432e0.UnsafeAllocator5
    /* JADX INFO: renamed from: b */
    public <T> T mo12291b(Class<T> cls) throws Exception {
        UnsafeAllocator5.m12292a(cls);
        return (T) this.f27510a.invoke(null, cls, Integer.valueOf(this.f27511b));
    }
}
