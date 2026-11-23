package p007c.p190n.p430e.p432e0;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: c.n.e.e0.v, reason: use source file name */
/* JADX INFO: compiled from: UnsafeAllocator.java */
/* JADX INFO: loaded from: classes.dex */
public class UnsafeAllocator extends UnsafeAllocator5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f27508a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f27509b;

    public UnsafeAllocator(Method method, Object obj) {
        this.f27508a = method;
        this.f27509b = obj;
    }

    @Override // p007c.p190n.p430e.p432e0.UnsafeAllocator5
    /* JADX INFO: renamed from: b */
    public <T> T mo12291b(Class<T> cls) throws Exception {
        UnsafeAllocator5.m12292a(cls);
        return (T) this.f27508a.invoke(this.f27509b, cls);
    }
}
