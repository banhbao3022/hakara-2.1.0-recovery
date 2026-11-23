package p007c.p190n.p430e.p432e0;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: c.n.e.e0.x, reason: use source file name */
/* JADX INFO: compiled from: UnsafeAllocator.java */
/* JADX INFO: loaded from: classes.dex */
public class UnsafeAllocator3 extends UnsafeAllocator5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f27512a;

    public UnsafeAllocator3(Method method) {
        this.f27512a = method;
    }

    @Override // p007c.p190n.p430e.p432e0.UnsafeAllocator5
    /* JADX INFO: renamed from: b */
    public <T> T mo12291b(Class<T> cls) throws Exception {
        UnsafeAllocator5.m12292a(cls);
        return (T) this.f27512a.invoke(null, cls, Object.class);
    }
}
