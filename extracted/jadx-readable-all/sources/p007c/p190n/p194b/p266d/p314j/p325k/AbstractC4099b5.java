package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5.b;

/* JADX INFO: renamed from: c.n.b.d.j.k.b5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4099b5<MessageType extends AbstractC4099b5<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends AbstractC4293p3<MessageType, BuilderType> {
    private static Map<Object, AbstractC4099b5<?, ?>> zzd = new ConcurrentHashMap();
    public C4255m7 zzb = C4255m7.f23317a;
    private int zzc = -1;

    /* JADX INFO: renamed from: c.n.b.d.j.k.b5$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static class a<T extends AbstractC4099b5<T, ?>> extends C4349t3<T> {
        public a(T t) {
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.k.b5$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static abstract class b<MessageType extends AbstractC4099b5<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends AbstractC4321r3<MessageType, BuilderType> {

        /* JADX INFO: renamed from: f */
        public final MessageType f23085f;

        /* JADX INFO: renamed from: g */
        public MessageType f23086g;

        /* JADX INFO: renamed from: h */
        public boolean f23087h = false;

        public b(MessageType messagetype) {
            this.f23085f = messagetype;
            this.f23086g = (MessageType) messagetype.mo9399n(4, null, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4321r3
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            b bVar = (b) this.f23085f.mo9399n(5, null, null);
            bVar.m9429p((AbstractC4099b5) m9432s());
            return bVar;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4254m6
        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC4240l6 mo9418g() {
            return this.f23085f;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4321r3
        /* JADX INFO: renamed from: j */
        public final /* synthetic */ AbstractC4321r3 mo9424j(AbstractC4293p3 abstractC4293p3) {
            m9429p((AbstractC4099b5) abstractC4293p3);
            return this;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4321r3
        /* JADX INFO: renamed from: k */
        public final AbstractC4321r3 mo9425k(AbstractC4154f4 abstractC4154f4, C4280o4 c4280o4) throws IOException {
            if (this.f23087h) {
                m9431r();
                this.f23087h = false;
            }
            try {
                InterfaceC4431z6 interfaceC4431z6M10312b = C4392w6.f23587a.m10312b(this.f23086g);
                MessageType messagetype = this.f23086g;
                C4210j4 c4210j4 = abstractC4154f4.f23157c;
                if (c4210j4 == null) {
                    c4210j4 = new C4210j4(abstractC4154f4);
                }
                interfaceC4431z6M10312b.mo10062h(messagetype, c4210j4, c4280o4);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4321r3
        /* JADX INFO: renamed from: l */
        public final /* synthetic */ AbstractC4321r3 mo9426l(byte[] bArr, int i, int i2) throws C4239l5 {
            m9430q(bArr, i2, C4280o4.m10117a());
            return this;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4321r3
        /* JADX INFO: renamed from: m */
        public final /* synthetic */ AbstractC4321r3 mo9427m(byte[] bArr, int i, int i2, C4280o4 c4280o4) throws C4239l5 {
            m9430q(bArr, i2, c4280o4);
            return this;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4321r3
        /* JADX INFO: renamed from: o */
        public final /* synthetic */ AbstractC4321r3 clone() {
            return (b) clone();
        }

        /* JADX INFO: renamed from: p */
        public final BuilderType m9429p(MessageType messagetype) {
            if (this.f23087h) {
                m9431r();
                this.f23087h = false;
            }
            MessageType messagetype2 = this.f23086g;
            C4392w6.f23587a.m10312b(messagetype2).mo10063i(messagetype2, messagetype);
            return this;
        }

        /* JADX INFO: renamed from: q */
        public final b m9430q(byte[] bArr, int i, C4280o4 c4280o4) throws C4239l5 {
            if (this.f23087h) {
                m9431r();
                this.f23087h = false;
            }
            try {
                C4392w6.f23587a.m10312b(this.f23086g).mo10061g(this.f23086g, bArr, 0, i, new C4389w3(c4280o4));
                return this;
            } catch (C4239l5 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw C4239l5.m9995a();
            }
        }

        /* JADX INFO: renamed from: r */
        public void m9431r() {
            MessageType messagetype = (MessageType) this.f23086g.mo9399n(4, null, null);
            C4392w6.f23587a.m10312b(messagetype).mo10063i(messagetype, this.f23086g);
            this.f23086g = messagetype;
        }

        /* JADX INFO: renamed from: s */
        public InterfaceC4240l6 m9432s() {
            if (this.f23087h) {
                return this.f23086g;
            }
            MessageType messagetype = this.f23086g;
            C4392w6.f23587a.m10312b(messagetype).mo10059e(messagetype);
            this.f23087h = true;
            return this.f23086g;
        }

        /* JADX INFO: renamed from: t */
        public InterfaceC4240l6 m9433t() {
            AbstractC4099b5 abstractC4099b5 = (AbstractC4099b5) m9432s();
            if (abstractC4099b5.mo9417e()) {
                return abstractC4099b5;
            }
            throw new C4241l7(abstractC4099b5);
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.k.b5$c */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static final class c implements InterfaceC4390w4<c> {
        @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4390w4
        /* JADX INFO: renamed from: a */
        public final EnumC4432z7 mo9434a() {
            throw new NoSuchMethodError();
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4390w4
        /* JADX INFO: renamed from: b */
        public final EnumC4172g8 mo9435b() {
            throw new NoSuchMethodError();
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4390w4
        /* JADX INFO: renamed from: c */
        public final boolean mo9436c() {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4390w4
        /* JADX INFO: renamed from: e */
        public final boolean mo9437e() {
            throw new NoSuchMethodError();
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4390w4
        /* JADX INFO: renamed from: p */
        public final InterfaceC4226k6 mo9438p(InterfaceC4226k6 interfaceC4226k6, InterfaceC4240l6 interfaceC4240l6) {
            throw new NoSuchMethodError();
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4390w4
        /* JADX INFO: renamed from: r */
        public final InterfaceC4282o6 mo9439r(InterfaceC4282o6 interfaceC4282o6, InterfaceC4282o6 interfaceC4282o7) {
            throw new NoSuchMethodError();
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4390w4
        public final int zza() {
            throw new NoSuchMethodError();
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.k.b5$d */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends AbstractC4099b5<MessageType, BuilderType> implements InterfaceC4254m6 {
        public C4364u4<c> zzc = C4364u4.f23499a;

        /* JADX INFO: renamed from: s */
        public final C4364u4<c> m9440s() {
            C4364u4<c> c4364u4 = this.zzc;
            if (c4364u4.f23501c) {
                this.zzc = (C4364u4) c4364u4.clone();
            }
            return this.zzc;
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.k.b5$e */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static final enum e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23088a = {1, 2, 3, 4, 5, 6, 7};

        /* JADX INFO: renamed from: a */
        public static int[] m9441a() {
            return (int[]) f23088a.clone();
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.k.b5$f */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static class f<ContainingType extends InterfaceC4240l6, Type> extends C4294p4<ContainingType, Type> {
    }

    /* JADX INFO: renamed from: k */
    public static <T extends AbstractC4099b5<?, ?>> T m9409k(Class<T> cls) {
        AbstractC4099b5<?, ?> abstractC4099b5 = zzd.get(cls);
        if (abstractC4099b5 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC4099b5 = zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (abstractC4099b5 == null) {
            abstractC4099b5 = (T) ((AbstractC4099b5) C4353t7.m10224c(cls)).mo9399n(6, null, null);
            if (abstractC4099b5 == null) {
                throw new IllegalStateException();
            }
            zzd.put(cls, abstractC4099b5);
        }
        return (T) abstractC4099b5;
    }

    /* JADX INFO: renamed from: l */
    public static <E> InterfaceC4197i5<E> m9410l(InterfaceC4197i5<E> interfaceC4197i5) {
        int size = interfaceC4197i5.size();
        return interfaceC4197i5.mo9340b(size == 0 ? 10 : size << 1);
    }

    /* JADX INFO: renamed from: m */
    public static InterfaceC4211j5 m9411m(InterfaceC4211j5 interfaceC4211j5) {
        int i = ((C4430z5) interfaceC4211j5).f23656i;
        return ((C4430z5) interfaceC4211j5).mo9340b(i == 0 ? 10 : i << 1);
    }

    /* JADX INFO: renamed from: o */
    public static Object m9412o(Method method, Object obj, Object... objArr) {
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

    /* JADX INFO: renamed from: p */
    public static <T extends AbstractC4099b5<?, ?>> void m9413p(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4240l6
    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ InterfaceC4226k6 mo9414E0() {
        return (b) mo9399n(5, null, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4240l6
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC4226k6 mo9415b() {
        b bVar = (b) mo9399n(5, null, null);
        bVar.m9429p(this);
        return bVar;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4240l6
    /* JADX INFO: renamed from: d */
    public final void mo9416d(AbstractC4238l4 abstractC4238l4) throws IOException {
        InterfaceC4431z6 interfaceC4431z6M10312b = C4392w6.f23587a.m10312b(this);
        C4266n4 c4266n4 = abstractC4238l4.f23287c;
        if (c4266n4 == null) {
            c4266n4 = new C4266n4(abstractC4238l4);
        }
        interfaceC4431z6M10312b.mo10057c(this, c4266n4);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4254m6
    /* JADX INFO: renamed from: e */
    public final boolean mo9417e() {
        byte bByteValue = ((Byte) mo9399n(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo10058d = C4392w6.f23587a.m10312b(this).mo10058d(this);
        mo9399n(2, zMo10058d ? this : null, null);
        return zMo10058d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C4392w6.f23587a.m10312b(this).mo10060f(this, (AbstractC4099b5) obj);
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4254m6
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC4240l6 mo9418g() {
        return (AbstractC4099b5) mo9399n(6, null, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4293p3
    /* JADX INFO: renamed from: h */
    public final int mo9419h() {
        return this.zzc;
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iMo10055a = C4392w6.f23587a.m10312b(this).mo10055a(this);
        this.zza = iMo10055a;
        return iMo10055a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4240l6
    /* JADX INFO: renamed from: i */
    public final int mo9420i() {
        if (this.zzc == -1) {
            this.zzc = C4392w6.f23587a.m10312b(this).mo10056b(this);
        }
        return this.zzc;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4293p3
    /* JADX INFO: renamed from: j */
    public final void mo9421j(int i) {
        this.zzc = i;
    }

    /* JADX INFO: renamed from: n */
    public abstract Object mo9399n(int i, Object obj, Object obj2);

    /* JADX INFO: renamed from: q */
    public final <MessageType extends AbstractC4099b5<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType m9422q() {
        return (BuilderType) mo9399n(5, null, null);
    }

    /* JADX INFO: renamed from: r */
    public final BuilderType m9423r() {
        BuilderType buildertype = (BuilderType) mo9399n(5, null, null);
        buildertype.m9429p(this);
        return buildertype;
    }

    public String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        C2622l.m5332Y0(this, sb, 0);
        return sb.toString();
    }
}
