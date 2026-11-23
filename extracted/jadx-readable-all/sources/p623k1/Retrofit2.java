package p623k1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: k1.z, reason: use source file name */
/* JADX INFO: compiled from: Retrofit.java */
/* JADX INFO: loaded from: classes2.dex */
public class Retrofit2 implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final Platform2 f33295a = Platform2.f33237a;

    /* JADX INFO: renamed from: b */
    public final Object[] f33296b = new Object[0];

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Class f33297c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Retrofit f33298d;

    public Retrofit2(Retrofit retrofit, Class cls) {
        this.f33298d = retrofit;
        this.f33297c = cls;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f33296b;
        }
        return this.f33295a.f33238b && method.isDefault() ? this.f33295a.mo14307b(method, this.f33297c, obj, objArr) : this.f33298d.m14265b(method).mo14270a(objArr);
    }
}
