package p636z0.p748n;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: z0.n.b, reason: use source file name */
/* JADX INFO: compiled from: CallbackRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class CallbackRegistry<C, T, A> implements Cloneable {

    /* JADX INFO: renamed from: f */
    public List<C> f38194f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public long f38195g = 0;

    /* JADX INFO: renamed from: h */
    public long[] f38196h;

    /* JADX INFO: renamed from: i */
    public int f38197i;

    /* JADX INFO: renamed from: j */
    public final a<C, T, A> f38198j;

    /* JADX INFO: renamed from: z0.n.b$a */
    /* JADX INFO: compiled from: CallbackRegistry.java */
    public static abstract class a<C, T, A> {
        /* JADX INFO: renamed from: a */
        public abstract void mo406a(C c2, T t, int i, A a);
    }

    public CallbackRegistry(a<C, T, A> aVar) {
        this.f38198j = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16397a(int i) {
        int i2;
        if (i < 64) {
            return ((1 << i) & this.f38195g) != 0;
        }
        long[] jArr = this.f38196h;
        if (jArr != null && (i2 = (i / 64) - 1) < jArr.length) {
            return ((1 << (i % 64)) & jArr[i2]) != 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m16398b(T t, int i, A a2) {
        this.f38197i++;
        int size = this.f38194f.size();
        long[] jArr = this.f38196h;
        int length = jArr == null ? -1 : jArr.length - 1;
        m16400e(t, i, null, length);
        m16399d(t, i, null, (length + 2) * 64, size, 0L);
        int i2 = this.f38197i - 1;
        this.f38197i = i2;
        if (i2 == 0) {
            long[] jArr2 = this.f38196h;
            if (jArr2 != null) {
                for (int length2 = jArr2.length - 1; length2 >= 0; length2--) {
                    long j2 = this.f38196h[length2];
                    if (j2 != 0) {
                        m16401g((length2 + 1) * 64, j2);
                        this.f38196h[length2] = 0;
                    }
                }
            }
            long j3 = this.f38195g;
            if (j3 != 0) {
                m16401g(0, j3);
                this.f38195g = 0L;
            }
        }
    }

    public Object clone() throws CloneNotSupportedException {
        CallbackRegistry callbackRegistry;
        CloneNotSupportedException e;
        synchronized (this) {
            try {
                callbackRegistry = (CallbackRegistry) super.clone();
                try {
                    callbackRegistry.f38195g = 0L;
                    callbackRegistry.f38196h = null;
                    callbackRegistry.f38197i = 0;
                    callbackRegistry.f38194f = new ArrayList();
                    int size = this.f38194f.size();
                    for (int i = 0; i < size; i++) {
                        if (!m16397a(i)) {
                            callbackRegistry.f38194f.add(this.f38194f.get(i));
                        }
                    }
                } catch (CloneNotSupportedException e2) {
                    e = e2;
                    e.printStackTrace();
                }
            } catch (CloneNotSupportedException e3) {
                callbackRegistry = null;
                e = e3;
            }
        }
        return callbackRegistry;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public final void m16399d(T t, int i, A a2, int i2, int i3, long j2) {
        long j3 = 1;
        while (i2 < i3) {
            if ((j2 & j3) == 0) {
                this.f38198j.mo406a(this.f38194f.get(i2), t, i, a2);
            }
            j3 <<= 1;
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16400e(T t, int i, A a2, int i2) {
        if (i2 < 0) {
            m16399d(t, i, a2, 0, Math.min(64, this.f38194f.size()), this.f38195g);
            return;
        }
        long j2 = this.f38196h[i2];
        int i3 = (i2 + 1) * 64;
        int iMin = Math.min(this.f38194f.size(), i3 + 64);
        m16400e(t, i, a2, i2 - 1);
        m16399d(t, i, a2, i3, iMin, j2);
    }

    /* JADX INFO: renamed from: g */
    public final void m16401g(int i, long j2) {
        long j3 = Long.MIN_VALUE;
        for (int i2 = (i + 64) - 1; i2 >= i; i2--) {
            if ((j2 & j3) != 0) {
                this.f38194f.remove(i2);
            }
            j3 >>>= 1;
        }
    }
}
