package p007c.p190n.p194b.p266d.p314j.p320f;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4;
import p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4.a;

/* JADX INFO: renamed from: c.n.b.d.j.f.z4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4057z4<MessageType extends AbstractC4057z4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC4029w3<MessageType, BuilderType> {
    private static Map<Object, AbstractC4057z4<?, ?>> zzbna = new ConcurrentHashMap();
    public C3936m7 zzbmy = C3936m7.f22806a;
    private int zzbmz = -1;

    /* JADX INFO: renamed from: c.n.b.d.j.f.z4$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static abstract class a<MessageType extends AbstractC4057z4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC4020v3<MessageType, BuilderType> {

        /* JADX INFO: renamed from: f */
        public final MessageType f23001f;

        /* JADX INFO: renamed from: g */
        public MessageType f23002g;

        /* JADX INFO: renamed from: h */
        public boolean f23003h = false;

        public a(MessageType messagetype) {
            this.f23001f = messagetype;
            this.f23002g = (MessageType) messagetype.mo8926h(4, null, null);
        }

        /* JADX INFO: renamed from: m */
        public static void m9322m(MessageType messagetype, MessageType messagetype2) {
            C4005t6.f22879a.m9223b(messagetype).mo9127f(messagetype, messagetype2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4020v3
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            a aVar = (a) this.f23001f.mo8926h(5, null, null);
            aVar.m9323l((AbstractC4057z4) m9325o());
            return aVar;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3915k6
        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC3895i6 mo9049d() {
            return this.f23001f;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4020v3
        /* JADX INFO: renamed from: j */
        public final /* synthetic */ AbstractC4020v3 mo9281j(AbstractC4029w3 abstractC4029w3) {
            m9323l((AbstractC4057z4) abstractC4029w3);
            return this;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4020v3
        /* JADX INFO: renamed from: k */
        public final /* synthetic */ AbstractC4020v3 clone() {
            return (a) clone();
        }

        /* JADX INFO: renamed from: l */
        public final BuilderType m9323l(MessageType messagetype) {
            if (this.f23003h) {
                m9324n();
                this.f23003h = false;
            }
            m9322m(this.f23002g, messagetype);
            return this;
        }

        /* JADX INFO: renamed from: n */
        public void m9324n() {
            MessageType messagetype = (MessageType) this.f23002g.mo8926h(4, null, null);
            C4005t6.f22879a.m9223b(messagetype).mo9127f(messagetype, this.f23002g);
            this.f23002g = messagetype;
        }

        /* JADX INFO: renamed from: o */
        public InterfaceC3895i6 m9325o() {
            if (this.f23003h) {
                return this.f23002g;
            }
            MessageType messagetype = this.f23002g;
            C4005t6.f22879a.m9223b(messagetype).mo9124c(messagetype);
            this.f23003h = true;
            return this.f23002g;
        }

        /* JADX INFO: renamed from: p */
        public InterfaceC3895i6 m9326p() {
            AbstractC4057z4 abstractC4057z4 = (AbstractC4057z4) m9325o();
            if (abstractC4057z4.mo9050i()) {
                return abstractC4057z4;
            }
            throw new C3926l7(abstractC4057z4);
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.f.z4$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends AbstractC4057z4<MessageType, BuilderType> implements InterfaceC3915k6 {
        public C3973q4<e> zzbnb = C3973q4.f22846a;
    }

    /* JADX INFO: renamed from: c.n.b.d.j.f.z4$c */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static class c<T extends AbstractC4057z4<T, ?>> extends C4038x3<T> {
        public c(T t) {
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.f.z4$d */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final enum d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23004a = {1, 2, 3, 4, 5, 6, 7};
    }

    /* JADX INFO: renamed from: c.n.b.d.j.f.z4$e */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static final class e implements InterfaceC3993s4<e> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3993s4
        /* JADX INFO: renamed from: d */
        public final int mo9214d() {
            throw new NoSuchMethodError();
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3993s4
        /* JADX INFO: renamed from: g */
        public final boolean mo9215g() {
            throw new NoSuchMethodError();
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3993s4
        /* JADX INFO: renamed from: i */
        public final EnumC3867f8 mo9216i() {
            throw new NoSuchMethodError();
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3993s4
        /* JADX INFO: renamed from: k */
        public final EnumC3837c8 mo9217k() {
            throw new NoSuchMethodError();
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3993s4
        /* JADX INFO: renamed from: n */
        public final boolean mo9218n() {
            throw new NoSuchMethodError();
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3993s4
        /* JADX INFO: renamed from: o */
        public final InterfaceC3945n6 mo9219o(InterfaceC3945n6 interfaceC3945n6, InterfaceC3945n6 interfaceC3945n7) {
            throw new NoSuchMethodError();
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3993s4
        /* JADX INFO: renamed from: t */
        public final InterfaceC3925l6 mo9220t(InterfaceC3925l6 interfaceC3925l6, InterfaceC3895i6 interfaceC3895i6) {
            throw new NoSuchMethodError();
        }
    }

    /* JADX INFO: renamed from: j */
    public static Object m9318j(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
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
    public static <T extends AbstractC4057z4<?, ?>> void m9319k(Class<T> cls, T t) {
        zzbna.put(cls, t);
    }

    /* JADX INFO: renamed from: l */
    public static <T extends AbstractC4057z4<?, ?>> T m9320l(Class<T> cls) {
        AbstractC4057z4<?, ?> abstractC4057z4 = zzbna.get(cls);
        if (abstractC4057z4 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC4057z4 = zzbna.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (abstractC4057z4 == null) {
            abstractC4057z4 = (T) ((AbstractC4057z4) C4015u7.m9241g(cls)).mo8926h(6, null, null);
            if (abstractC4057z4 == null) {
                throw new IllegalStateException();
            }
            zzbna.put(cls, abstractC4057z4);
        }
        return (T) abstractC4057z4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3895i6
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC3925l6 mo9042b() {
        a aVar = (a) mo8926h(5, null, null);
        aVar.m9323l(this);
        return aVar;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4029w3
    /* JADX INFO: renamed from: c */
    public final void mo9287c(int i) {
        this.zzbmz = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3915k6
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC3895i6 mo9049d() {
        return (AbstractC4057z4) mo8926h(6, null, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3895i6
    /* JADX INFO: renamed from: e */
    public final int mo9043e() {
        if (this.zzbmz == -1) {
            this.zzbmz = C4005t6.f22879a.m9223b(this).mo9123b(this);
        }
        return this.zzbmz;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C4005t6.f22879a.m9223b(this).mo9126e(this, (AbstractC4057z4) obj);
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4029w3
    /* JADX INFO: renamed from: f */
    public final int mo9288f() {
        return this.zzbmz;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3895i6
    /* JADX INFO: renamed from: g */
    public final void mo9044g(AbstractC3923l4 abstractC3923l4) throws IOException {
        InterfaceC4059z6 interfaceC4059z6M9223b = C4005t6.f22879a.m9223b(this);
        C3943n4 c3943n4 = abstractC3923l4.f22765c;
        if (c3943n4 == null) {
            c3943n4 = new C3943n4(abstractC3923l4);
        }
        interfaceC4059z6M9223b.mo9125d(this, c3943n4);
    }

    /* JADX INFO: renamed from: h */
    public abstract Object mo8926h(int i, Object obj, Object obj2);

    public int hashCode() {
        int i = this.zzbiv;
        if (i != 0) {
            return i;
        }
        int iMo9128g = C4005t6.f22879a.m9223b(this).mo9128g(this);
        this.zzbiv = iMo9128g;
        return iMo9128g;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3915k6
    /* JADX INFO: renamed from: i */
    public final boolean mo9050i() {
        byte bByteValue = ((Byte) mo8926h(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo9122a = C4005t6.f22879a.m9223b(this).mo9122a(this);
        mo8926h(2, zMo9122a ? this : null, null);
        return zMo9122a;
    }

    /* JADX INFO: renamed from: m */
    public final <MessageType extends AbstractC4057z4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType m9321m() {
        return (BuilderType) mo8926h(5, null, null);
    }

    public String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        C2622l.m5328X0(this, sb, 0);
        return sb.toString();
    }
}
