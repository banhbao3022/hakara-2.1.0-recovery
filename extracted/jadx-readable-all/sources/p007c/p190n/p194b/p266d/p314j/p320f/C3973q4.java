package p007c.p190n.p194b.p266d.p314j.p320f;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;
import p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3993s4;

/* JADX INFO: renamed from: c.n.b.d.j.f.q4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3973q4<T extends InterfaceC3993s4<T>> {

    /* JADX INFO: renamed from: a */
    public static final C3973q4 f22846a = new C3973q4(true);

    /* JADX INFO: renamed from: b */
    public final C3816a7<T, Object> f22847b;

    /* JADX INFO: renamed from: c */
    public boolean f22848c;

    /* JADX INFO: renamed from: d */
    public boolean f22849d;

    public C3973q4(boolean z) {
        int i = C3816a7.f22508f;
        this.f22847b = new C3836c7(0);
        m9199m();
        m9199m();
    }

    /* JADX INFO: renamed from: c */
    public static int m9187c(EnumC3837c8 enumC3837c8, int i, Object obj) {
        int iM9073i = AbstractC3923l4.m9073i(i);
        if (enumC3837c8 == EnumC3837c8.f22543o) {
            InterfaceC3895i6 interfaceC3895i6 = (InterfaceC3895i6) obj;
            if (interfaceC3895i6 instanceof AbstractC4047y3) {
            }
            iM9073i <<= 1;
        }
        return m9190h(enumC3837c8, obj) + iM9073i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX INFO: renamed from: f */
    public static void m9188f(EnumC3837c8 enumC3837c8, Object obj) {
        boolean z;
        Charset charset = C3814a5.f22506a;
        Objects.requireNonNull(obj);
        switch (C4003t4.f22876a[enumC3837c8.f22553y.ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if ((obj instanceof AbstractC3823b4) || (obj instanceof byte[])) {
                    z = true;
                } else {
                    z = false;
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC3834c5)) {
                    z = true;
                } else {
                    z = false;
                }
                break;
            case 9:
                if ((obj instanceof InterfaceC3895i6) || (obj instanceof C3934m5)) {
                    z = true;
                } else {
                    z = false;
                }
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m9189g(InterfaceC3993s4<?> interfaceC3993s4, Object obj) {
        EnumC3837c8 enumC3837c8Mo9217k = interfaceC3993s4.mo9217k();
        int iMo9214d = interfaceC3993s4.mo9214d();
        if (!interfaceC3993s4.mo9218n()) {
            return m9187c(enumC3837c8Mo9217k, iMo9214d, obj);
        }
        int iM9187c = 0;
        if (interfaceC3993s4.mo9215g()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM9187c += m9190h(enumC3837c8Mo9217k, it.next());
            }
            return AbstractC3923l4.m9073i(iMo9214d) + iM9187c + AbstractC3923l4.m9075k(iM9187c);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iM9187c += m9187c(enumC3837c8Mo9217k, iMo9214d, it2.next());
        }
        return iM9187c;
    }

    /* JADX INFO: renamed from: h */
    public static int m9190h(EnumC3837c8 enumC3837c8, Object obj) {
        int iMo9043e;
        int iM9075k;
        switch (C4003t4.f22877b[enumC3837c8.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                Logger logger = AbstractC3923l4.f22763a;
                return 8;
            case 2:
                ((Float) obj).floatValue();
                Logger logger2 = AbstractC3923l4.f22763a;
                return 4;
            case 3:
                return AbstractC3923l4.m9069S(((Long) obj).longValue());
            case 4:
                return AbstractC3923l4.m9069S(((Long) obj).longValue());
            case 5:
                return AbstractC3923l4.m9074j(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                Logger logger3 = AbstractC3923l4.f22763a;
                return 8;
            case 7:
                ((Integer) obj).intValue();
                Logger logger4 = AbstractC3923l4.f22763a;
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                Logger logger5 = AbstractC3923l4.f22763a;
                return 1;
            case 9:
                Logger logger6 = AbstractC3923l4.f22763a;
                return ((InterfaceC3895i6) obj).mo9043e();
            case 10:
                if (!(obj instanceof C3934m5)) {
                    Logger logger7 = AbstractC3923l4.f22763a;
                    iMo9043e = ((InterfaceC3895i6) obj).mo9043e();
                    iM9075k = AbstractC3923l4.m9075k(iMo9043e);
                } else {
                    Logger logger8 = AbstractC3923l4.f22763a;
                    iMo9043e = ((C3934m5) obj).m9202c();
                    iM9075k = AbstractC3923l4.m9075k(iMo9043e);
                }
                break;
            case 11:
                return obj instanceof AbstractC3823b4 ? AbstractC3923l4.m9080p((AbstractC3823b4) obj) : AbstractC3923l4.m9077m((String) obj);
            case 12:
                if (obj instanceof AbstractC3823b4) {
                    return AbstractC3923l4.m9080p((AbstractC3823b4) obj);
                }
                Logger logger9 = AbstractC3923l4.f22763a;
                iMo9043e = ((byte[]) obj).length;
                iM9075k = AbstractC3923l4.m9075k(iMo9043e);
                break;
            case 13:
                return AbstractC3923l4.m9075k(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger10 = AbstractC3923l4.f22763a;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger11 = AbstractC3923l4.f22763a;
                return 8;
            case 16:
                return AbstractC3923l4.m9076l(((Integer) obj).intValue());
            case 17:
                return AbstractC3923l4.m9070T(((Long) obj).longValue());
            case 18:
                return obj instanceof InterfaceC3834c5 ? AbstractC3923l4.m9074j(((InterfaceC3834c5) obj).mo8924d()) : AbstractC3923l4.m9074j(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iM9075k + iMo9043e;
    }

    /* JADX INFO: renamed from: i */
    public static <T extends InterfaceC3993s4<T>> boolean m9191i(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo9216i() == EnumC3867f8.MESSAGE) {
            if (key.mo9218n()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC3895i6) it.next()).mo9050i()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof InterfaceC3895i6)) {
                    if (value instanceof C3934m5) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((InterfaceC3895i6) value).mo9050i()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static int m9192k(Map.Entry<T, Object> entry) {
        int iM9064L;
        int iM9073i;
        int iMo9043e;
        int iM9075k;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.mo9216i() != EnumC3867f8.MESSAGE || key.mo9218n() || key.mo9215g()) {
            return m9189g(key, value);
        }
        if (value instanceof C3934m5) {
            int iMo9214d = entry.getKey().mo9214d();
            iM9064L = AbstractC3923l4.m9064L(2, iMo9214d) + (AbstractC3923l4.m9073i(1) << 1);
            iM9073i = AbstractC3923l4.m9073i(3);
            iMo9043e = ((C3934m5) value).m9202c();
            iM9075k = AbstractC3923l4.m9075k(iMo9043e);
        } else {
            int iMo9214d2 = entry.getKey().mo9214d();
            iM9064L = AbstractC3923l4.m9064L(2, iMo9214d2) + (AbstractC3923l4.m9073i(1) << 1);
            iM9073i = AbstractC3923l4.m9073i(3);
            iMo9043e = ((InterfaceC3895i6) value).mo9043e();
            iM9075k = AbstractC3923l4.m9075k(iMo9043e);
        }
        return iM9075k + iMo9043e + iM9073i + iM9064L;
    }

    /* JADX INFO: renamed from: l */
    public static Object m9193l(Object obj) {
        if (obj instanceof InterfaceC3945n6) {
            return ((InterfaceC3945n6) obj).mo9157H();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9194a() {
        for (int i = 0; i < this.f22847b.m8937f(); i++) {
            if (!m9191i(this.f22847b.m8934c(i))) {
                return false;
            }
        }
        Iterator it = this.f22847b.m8938g().iterator();
        while (it.hasNext()) {
            if (!m9191i((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final Iterator<Map.Entry<T, Object>> m9195b() {
        return this.f22849d ? new C3944n5(this.f22847b.entrySet().iterator()) : this.f22847b.entrySet().iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C3973q4 c3973q4 = new C3973q4();
        for (int i = 0; i < this.f22847b.m8937f(); i++) {
            Map.Entry<K, Object> entryM8934c = this.f22847b.m8934c(i);
            c3973q4.m9197e((InterfaceC3993s4) entryM8934c.getKey(), entryM8934c.getValue());
        }
        Iterator it = this.f22847b.m8938g().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c3973q4.m9197e((InterfaceC3993s4) entry.getKey(), entry.getValue());
        }
        c3973q4.f22849d = this.f22849d;
        return c3973q4;
    }

    /* JADX INFO: renamed from: d */
    public final Object m9196d(T t) {
        Object obj = this.f22847b.get(t);
        if (!(obj instanceof C3934m5)) {
            return obj;
        }
        int i = C3934m5.f22790c;
        throw new NoSuchMethodError();
    }

    /* JADX INFO: renamed from: e */
    public final void m9197e(T t, Object obj) {
        if (!t.mo9218n()) {
            m9188f(t.mo9217k(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m9188f(t.mo9217k(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof C3934m5) {
            this.f22849d = true;
        }
        this.f22847b.put(t, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3973q4) {
            return this.f22847b.equals(((C3973q4) obj).f22847b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22847b.hashCode();
    }

    /* JADX INFO: renamed from: j */
    public final void m9198j(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C3934m5) {
            int i = C3934m5.f22790c;
            throw new NoSuchMethodError();
        }
        if (key.mo9218n()) {
            Object objM9196d = m9196d(key);
            if (objM9196d == null) {
                objM9196d = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM9196d).add(m9193l(it.next()));
            }
            this.f22847b.put(key, objM9196d);
            return;
        }
        if (key.mo9216i() != EnumC3867f8.MESSAGE) {
            this.f22847b.put(key, m9193l(value));
            return;
        }
        Object objM9196d2 = m9196d(key);
        if (objM9196d2 == null) {
            this.f22847b.put(key, m9193l(value));
        } else {
            this.f22847b.put(key, objM9196d2 instanceof InterfaceC3945n6 ? key.mo9219o((InterfaceC3945n6) objM9196d2, (InterfaceC3945n6) value) : ((AbstractC4057z4.a) key.mo9220t(((InterfaceC3895i6) objM9196d2).mo9042b(), (InterfaceC3895i6) value)).m9326p());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m9199m() {
        if (this.f22848c) {
            return;
        }
        this.f22847b.mo8936e();
        this.f22848c = true;
    }

    public C3973q4() {
        int i = C3816a7.f22508f;
        this.f22847b = new C3836c7(16);
    }
}
