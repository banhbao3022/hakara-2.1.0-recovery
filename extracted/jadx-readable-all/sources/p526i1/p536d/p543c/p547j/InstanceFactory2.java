package p526i1.p536d.p543c.p547j;

import java.util.ArrayList;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p481d0.Strings5;
import p477d1.p483s._Collections;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p526i1.p536d.p543c.Koin;
import p526i1.p536d.p543c.p545h.BeanDefinition;
import p526i1.p536d.p543c.p546i.InstanceCreationException;
import p526i1.p536d.p543c.p548k.Logger6;
import p526i1.p536d.p543c.p548k.Logger7;

/* JADX INFO: renamed from: i1.d.c.j.c, reason: use source file name */
/* JADX INFO: compiled from: InstanceFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class InstanceFactory2<T> {

    /* JADX INFO: renamed from: a */
    public final Koin f30918a;

    /* JADX INFO: renamed from: b */
    public final BeanDefinition<T> f30919b;

    /* JADX INFO: renamed from: i1.d.c.j.c$a */
    /* JADX INFO: compiled from: InstanceFactory.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public InstanceFactory2(Koin koin, BeanDefinition<T> beanDefinition) {
        Intrinsics2.m13090f(koin, "_koin");
        Intrinsics2.m13090f(beanDefinition, "beanDefinition");
        this.f30918a = koin;
        this.f30919b = beanDefinition;
    }

    /* JADX INFO: renamed from: a */
    public T mo13848a(InstanceContext instanceContext) throws InstanceCreationException {
        Intrinsics2.m13090f(instanceContext, "context");
        if (this.f30918a.f30887b.m13854e(Logger6.DEBUG)) {
            Logger7 logger7 = this.f30918a.f30887b;
            StringBuilder sbM1556G = outline.m1556G("| create instance for ");
            sbM1556G.append(this.f30919b);
            logger7.m13850a(sbM1556G.toString());
        }
        try {
            return this.f30919b.f30901d.mo5l(instanceContext.f30916b, instanceContext.f30915a);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(e.toString());
            sb.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            Intrinsics2.m13086b(stackTrace, "e.stackTrace");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                Intrinsics2.m13086b(stackTraceElement, "it");
                String className = stackTraceElement.getClassName();
                Intrinsics2.m13086b(className, "it.className");
                if (!(!Strings5.m13006p(className, "sun.reflect", false, 2))) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb.append(_Collections.m13046k(arrayList, "\n\t", null, null, 0, null, null, 62));
            String string = sb.toString();
            Logger7 logger8 = this.f30918a.f30887b;
            StringBuilder sbM1556G2 = outline.m1556G("Instance creation error : could not create instance for ");
            sbM1556G2.append(this.f30919b);
            sbM1556G2.append(": ");
            sbM1556G2.append(string);
            logger8.m13852c(sbM1556G2.toString());
            StringBuilder sbM1556G3 = outline.m1556G("Could not create instance for ");
            sbM1556G3.append(this.f30919b);
            throw new InstanceCreationException(sbM1556G3.toString(), e);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo13846b();

    /* JADX INFO: renamed from: c */
    public abstract T mo13847c(InstanceContext instanceContext);
}
