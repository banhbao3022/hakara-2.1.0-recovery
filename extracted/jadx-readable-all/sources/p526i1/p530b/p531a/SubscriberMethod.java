package p526i1.p530b.p531a;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: i1.b.a.o, reason: use source file name */
/* JADX INFO: compiled from: SubscriberMethod.java */
/* JADX INFO: loaded from: classes2.dex */
public class SubscriberMethod {

    /* JADX INFO: renamed from: a */
    public final Method f30838a;

    /* JADX INFO: renamed from: b */
    public final ThreadMode f30839b;

    /* JADX INFO: renamed from: c */
    public final Class<?> f30840c;

    /* JADX INFO: renamed from: d */
    public final int f30841d;

    /* JADX INFO: renamed from: e */
    public final boolean f30842e;

    /* JADX INFO: renamed from: f */
    public String f30843f;

    public SubscriberMethod(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f30838a = method;
        this.f30839b = threadMode;
        this.f30840c = cls;
        this.f30841d = i;
        this.f30842e = z;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m13827a() {
        if (this.f30843f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f30838a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f30838a.getName());
            sb.append('(');
            sb.append(this.f30840c.getName());
            this.f30843f = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubscriberMethod)) {
            return false;
        }
        m13827a();
        SubscriberMethod subscriberMethod = (SubscriberMethod) obj;
        subscriberMethod.m13827a();
        return this.f30843f.equals(subscriberMethod.f30843f);
    }

    public int hashCode() {
        return this.f30838a.hashCode();
    }
}
