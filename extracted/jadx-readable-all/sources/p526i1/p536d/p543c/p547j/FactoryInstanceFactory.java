package p526i1.p536d.p543c.p547j;

import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p526i1.p536d.p543c.Koin;
import p526i1.p536d.p543c.p545h.BeanDefinition;

/* JADX INFO: renamed from: i1.d.c.j.a, reason: use source file name */
/* JADX INFO: compiled from: FactoryInstanceFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FactoryInstanceFactory<T> extends InstanceFactory2<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FactoryInstanceFactory(Koin koin, BeanDefinition<T> beanDefinition) {
        super(koin, beanDefinition);
        Intrinsics2.m13090f(koin, "koin");
        Intrinsics2.m13090f(beanDefinition, "beanDefinition");
    }

    @Override // p526i1.p536d.p543c.p547j.InstanceFactory2
    /* JADX INFO: renamed from: b */
    public void mo13846b() {
        InterfaceC6164l<T, Unit> interfaceC6164l = this.f30919b.f30906i.f30908a;
        if (interfaceC6164l != null) {
            interfaceC6164l.mo3b(null);
        }
    }

    @Override // p526i1.p536d.p543c.p547j.InstanceFactory2
    /* JADX INFO: renamed from: c */
    public T mo13847c(InstanceContext instanceContext) {
        Intrinsics2.m13090f(instanceContext, "context");
        return mo13848a(instanceContext);
    }
}
