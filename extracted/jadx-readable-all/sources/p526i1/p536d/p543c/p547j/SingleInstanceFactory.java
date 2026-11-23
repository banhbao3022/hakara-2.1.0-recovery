package p526i1.p536d.p543c.p547j;

import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p526i1.p536d.p543c.Koin;
import p526i1.p536d.p543c.p545h.BeanDefinition;

/* JADX INFO: renamed from: i1.d.c.j.d, reason: use source file name */
/* JADX INFO: compiled from: SingleInstanceFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SingleInstanceFactory<T> extends InstanceFactory2<T> {

    /* JADX INFO: renamed from: c */
    public T f30920c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleInstanceFactory(Koin koin, BeanDefinition<T> beanDefinition) {
        super(koin, beanDefinition);
        Intrinsics2.m13090f(koin, "koin");
        Intrinsics2.m13090f(beanDefinition, "beanDefinition");
    }

    @Override // p526i1.p536d.p543c.p547j.InstanceFactory2
    /* JADX INFO: renamed from: a */
    public T mo13848a(InstanceContext instanceContext) {
        T t;
        Intrinsics2.m13090f(instanceContext, "context");
        synchronized (this) {
            t = this.f30920c;
            if (t == null) {
                t = (T) super.mo13848a(instanceContext);
            }
        }
        return t;
    }

    @Override // p526i1.p536d.p543c.p547j.InstanceFactory2
    /* JADX INFO: renamed from: b */
    public void mo13846b() {
        InterfaceC6164l<T, Unit> interfaceC6164l = this.f30919b.f30906i.f30908a;
        if (interfaceC6164l != null) {
            interfaceC6164l.mo3b(this.f30920c);
        }
        this.f30920c = null;
    }

    @Override // p526i1.p536d.p543c.p547j.InstanceFactory2
    /* JADX INFO: renamed from: c */
    public T mo13847c(InstanceContext instanceContext) {
        Intrinsics2.m13090f(instanceContext, "context");
        if (!(this.f30920c != null)) {
            this.f30920c = mo13848a(instanceContext);
        }
        T t = this.f30920c;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }
}
