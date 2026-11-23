package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.d82;
import p007c.p190n.p194b.p266d.p314j.p315a.g82;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g82<MessageType extends g82<MessageType, BuilderType>, BuilderType extends d82<MessageType, BuilderType>> extends t62<MessageType, BuilderType> {
    private static final Map<Object, g82<?, ?>> zzb = new ConcurrentHashMap();
    public pa2 zzc = pa2.f17890a;
    public int zzd = -1;

    /* JADX INFO: renamed from: i */
    public static <T extends g82<T, ?>> T m6950i(T t) throws r82 {
        if (t.m6964p()) {
            return t;
        }
        throw new r82(new na2(t).getMessage());
    }

    /* JADX INFO: renamed from: j */
    public static Object m6951j(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: k */
    public static k82 m6952k(k82 k82Var) {
        h82 h82Var = (h82) k82Var;
        int i = h82Var.f14789i;
        return h82Var.mo5705l(i == 0 ? 10 : i + i);
    }

    /* JADX INFO: renamed from: l */
    public static <E> o82<E> m6953l(o82<E> o82Var) {
        int size = o82Var.size();
        return o82Var.mo5705l(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: renamed from: m */
    public static <T extends g82<T, ?>> T m6954m(T t, byte[] bArr, int i, int i2, s72 s72Var) throws r82 {
        T t2 = (T) t.mo5663u(4, null, null);
        try {
            ba2 ba2VarM8349a = s92.f19505a.m8349a(t2.getClass());
            ba2VarM8349a.mo5956l(t2, bArr, 0, i2, new w62(s72Var));
            ba2VarM8349a.mo5952h(t2);
            if (t2.zza == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof r82) {
                throw ((r82) e.getCause());
            }
            throw new r82(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw r82.m8260a();
        }
    }

    /* JADX INFO: renamed from: n */
    public static <T extends g82<T, ?>> T m6955n(T t, g72 g72Var, s72 s72Var) throws r82 {
        try {
            j72 j72VarMo5715D = g72Var.mo5715D();
            T t2 = (T) t.mo5663u(4, null, null);
            try {
                try {
                    ba2 ba2VarM8349a = s92.f19505a.m8349a(t2.getClass());
                    k72 k72Var = j72VarMo5715D.f15506b;
                    if (k72Var == null) {
                        k72Var = new k72(j72VarMo5715D);
                    }
                    ba2VarM8349a.mo5954j(t2, k72Var, s72Var);
                    ba2VarM8349a.mo5952h(t2);
                    try {
                        j72VarMo5715D.mo7080g(0);
                        m6950i(t2);
                        return t2;
                    } catch (r82 e) {
                        throw e;
                    }
                } catch (IOException e2) {
                    if (e2.getCause() instanceof r82) {
                        throw ((r82) e2.getCause());
                    }
                    throw new r82(e2.getMessage());
                }
            } catch (RuntimeException e3) {
                if (e3.getCause() instanceof r82) {
                    throw ((r82) e3.getCause());
                }
                throw e3;
            }
        } catch (r82 e4) {
            throw e4;
        }
    }

    /* JADX INFO: renamed from: s */
    public static <T extends g82> T m6956s(Class<T> cls) {
        Map<Object, g82<?, ?>> map = zzb;
        g82<?, ?> g82Var = map.get(cls);
        if (g82Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                g82Var = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (g82Var == null) {
            g82Var = (g82) ((g82) za2.m8856e(cls)).mo5663u(6, null, null);
            if (g82Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, g82Var);
        }
        return g82Var;
    }

    /* JADX INFO: renamed from: t */
    public static <T extends g82> void m6957t(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.l92
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ s62 mo6958a() {
        d82 d82Var = (d82) mo5663u(5, null, null);
        d82Var.m6301p(this);
        return d82Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.t62
    /* JADX INFO: renamed from: c */
    public final int mo6959c() {
        return this.zzd;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.l92
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ s62 mo6960d() {
        return (d82) mo5663u(5, null, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.l92
    /* JADX INFO: renamed from: e */
    public final int mo6961e() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int iMo5948c = s92.f19505a.m8349a(getClass()).mo5948c(this);
        this.zzd = iMo5948c;
        return iMo5948c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return s92.f19505a.m8349a(getClass()).mo5953i(this, (g82) obj);
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.t62
    /* JADX INFO: renamed from: f */
    public final void mo6962f(int i) {
        this.zzd = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.m92
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ l92 mo6294g() {
        return (g82) mo5663u(6, null, null);
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iMo5949e = s92.f19505a.m8349a(getClass()).mo5949e(this);
        this.zza = iMo5949e;
        return iMo5949e;
    }

    /* JADX INFO: renamed from: o */
    public final <MessageType extends g82<MessageType, BuilderType>, BuilderType extends d82<MessageType, BuilderType>> BuilderType m6963o() {
        return (BuilderType) mo5663u(5, null, null);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m6964p() {
        byte bByteValue = ((Byte) mo5663u(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo5951g = s92.f19505a.m8349a(getClass()).mo5951g(this);
        mo5663u(2, true != zMo5951g ? null : this, null);
        return zMo5951g;
    }

    /* JADX INFO: renamed from: q */
    public final BuilderType m6965q() {
        BuilderType buildertype = (BuilderType) mo5663u(5, null, null);
        buildertype.m6301p(this);
        return buildertype;
    }

    /* JADX INFO: renamed from: r */
    public final void m6966r(o72 o72Var) throws IOException {
        ba2 ba2VarM8349a = s92.f19505a.m8349a(getClass());
        p72 p72Var = o72Var.f17553c;
        if (p72Var == null) {
            p72Var = new p72(o72Var);
        }
        ba2VarM8349a.mo5955k(this, p72Var);
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        C2622l.m5462y2(this, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public abstract Object mo5663u(int i, Object obj, Object obj2);
}
