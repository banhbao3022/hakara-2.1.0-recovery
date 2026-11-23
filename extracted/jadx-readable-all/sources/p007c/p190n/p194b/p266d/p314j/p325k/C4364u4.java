package p007c.p190n.p194b.p266d.p314j.p325k;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4390w4;

/* JADX INFO: renamed from: c.n.b.d.j.k.u4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4364u4<T extends InterfaceC4390w4<T>> {

    /* JADX INFO: renamed from: a */
    public static final C4364u4 f23499a = new C4364u4(true);

    /* JADX INFO: renamed from: b */
    public final C4087a7<T, Object> f23500b;

    /* JADX INFO: renamed from: c */
    public boolean f23501c;

    /* JADX INFO: renamed from: d */
    public boolean f23502d;

    public C4364u4(boolean z) {
        int i = C4087a7.f23031f;
        this.f23500b = new C4115c7(0);
        m10273h();
        m10273h();
    }

    /* JADX INFO: renamed from: a */
    public static int m10265a(InterfaceC4390w4<?> interfaceC4390w4, Object obj) {
        EnumC4432z7 enumC4432z7Mo9434a = interfaceC4390w4.mo9434a();
        int iZza = interfaceC4390w4.zza();
        if (!interfaceC4390w4.mo9437e()) {
            return m10266b(enumC4432z7Mo9434a, iZza, obj);
        }
        int iM10266b = 0;
        if (interfaceC4390w4.mo9436c()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM10266b += m10270g(enumC4432z7Mo9434a, it.next());
            }
            return AbstractC4238l4.m9944D(iZza) + iM10266b + AbstractC4238l4.m9951L(iM10266b);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iM10266b += m10266b(enumC4432z7Mo9434a, iZza, it2.next());
        }
        return iM10266b;
    }

    /* JADX INFO: renamed from: b */
    public static int m10266b(EnumC4432z7 enumC4432z7, int i, Object obj) {
        int iM9944D = AbstractC4238l4.m9944D(i);
        if (enumC4432z7 == EnumC4432z7.f23666o) {
            InterfaceC4240l6 interfaceC4240l6 = (InterfaceC4240l6) obj;
            if (interfaceC4240l6 instanceof AbstractC4307q3) {
            }
            iM9944D <<= 1;
        }
        return m10270g(enumC4432z7, obj) + iM9944D;
    }

    /* JADX INFO: renamed from: d */
    public static Object m10267d(Object obj) {
        if (obj instanceof InterfaceC4282o6) {
            return ((InterfaceC4282o6) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX INFO: renamed from: e */
    public static void m10268e(EnumC4432z7 enumC4432z7, Object obj) {
        boolean z;
        Charset charset = C4127d5.f23112a;
        Objects.requireNonNull(obj);
        switch (C4350t4.f23469a[enumC4432z7.f23676y.ordinal()]) {
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
                if ((obj instanceof AbstractC4402x3) || (obj instanceof byte[])) {
                    z = true;
                } else {
                    z = false;
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC4155f5)) {
                    z = true;
                } else {
                    z = false;
                }
                break;
            case 9:
                if ((obj instanceof InterfaceC4240l6) || (obj instanceof C4253m5)) {
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

    /* JADX INFO: renamed from: f */
    public static <T extends InterfaceC4390w4<T>> boolean m10269f(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo9435b() == EnumC4172g8.MESSAGE) {
            if (key.mo9437e()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC4240l6) it.next()).mo9417e()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof InterfaceC4240l6)) {
                    if (value instanceof C4253m5) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((InterfaceC4240l6) value).mo9417e()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static int m10270g(EnumC4432z7 enumC4432z7, Object obj) {
        int iMo9420i;
        int iM9951L;
        switch (C4350t4.f23470b[enumC4432z7.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                Logger logger = AbstractC4238l4.f23285a;
                return 8;
            case 2:
                ((Float) obj).floatValue();
                Logger logger2 = AbstractC4238l4.f23285a;
                return 4;
            case 3:
                return AbstractC4238l4.m9946F(((Long) obj).longValue());
            case 4:
                return AbstractC4238l4.m9946F(((Long) obj).longValue());
            case 5:
                return AbstractC4238l4.m9947H(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                Logger logger3 = AbstractC4238l4.f23285a;
                return 8;
            case 7:
                ((Integer) obj).intValue();
                Logger logger4 = AbstractC4238l4.f23285a;
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                Logger logger5 = AbstractC4238l4.f23285a;
                return 1;
            case 9:
                Logger logger6 = AbstractC4238l4.f23285a;
                return ((InterfaceC4240l6) obj).mo9420i();
            case 10:
                if (!(obj instanceof C4253m5)) {
                    Logger logger7 = AbstractC4238l4.f23285a;
                    iMo9420i = ((InterfaceC4240l6) obj).mo9420i();
                    iM9951L = AbstractC4238l4.m9951L(iMo9420i);
                } else {
                    Logger logger8 = AbstractC4238l4.f23285a;
                    iMo9420i = ((C4253m5) obj).m10168a();
                    iM9951L = AbstractC4238l4.m9951L(iMo9420i);
                }
                break;
            case 11:
                return obj instanceof AbstractC4402x3 ? AbstractC4238l4.m9966p((AbstractC4402x3) obj) : AbstractC4238l4.m9967q((String) obj);
            case 12:
                if (obj instanceof AbstractC4402x3) {
                    return AbstractC4238l4.m9966p((AbstractC4402x3) obj);
                }
                Logger logger9 = AbstractC4238l4.f23285a;
                iMo9420i = ((byte[]) obj).length;
                iM9951L = AbstractC4238l4.m9951L(iMo9420i);
                break;
            case 13:
                return AbstractC4238l4.m9951L(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger10 = AbstractC4238l4.f23285a;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger11 = AbstractC4238l4.f23285a;
                return 8;
            case 16:
                return AbstractC4238l4.m9954O(((Integer) obj).intValue());
            case 17:
                return AbstractC4238l4.m9950K(((Long) obj).longValue());
            case 18:
                return obj instanceof InterfaceC4155f5 ? AbstractC4238l4.m9947H(((InterfaceC4155f5) obj).zza()) : AbstractC4238l4.m9947H(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iM9951L + iMo9420i;
    }

    /* JADX INFO: renamed from: k */
    public static int m10271k(Map.Entry<T, Object> entry) {
        int iM9952M;
        int iM9951L;
        int iMo9420i;
        int iM9951L2;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.mo9435b() != EnumC4172g8.MESSAGE || key.mo9437e() || key.mo9436c()) {
            return m10265a(key, value);
        }
        if (value instanceof C4253m5) {
            int iZza = entry.getKey().zza();
            iM9952M = AbstractC4238l4.m9952M(2, iZza) + (AbstractC4238l4.m9951L(8) << 1);
            iM9951L = AbstractC4238l4.m9951L(24);
            iMo9420i = ((C4253m5) value).m10168a();
            iM9951L2 = AbstractC4238l4.m9951L(iMo9420i);
        } else {
            int iZza2 = entry.getKey().zza();
            iM9952M = AbstractC4238l4.m9952M(2, iZza2) + (AbstractC4238l4.m9951L(8) << 1);
            iM9951L = AbstractC4238l4.m9951L(24);
            iMo9420i = ((InterfaceC4240l6) value).mo9420i();
            iM9951L2 = AbstractC4238l4.m9951L(iMo9420i);
        }
        return iM9951L2 + iMo9420i + iM9951L + iM9952M;
    }

    /* JADX INFO: renamed from: c */
    public final Object m10272c(T t) {
        Object obj = this.f23500b.get(t);
        if (!(obj instanceof C4253m5)) {
            return obj;
        }
        int i = C4253m5.f23316c;
        throw new NoSuchMethodError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C4364u4 c4364u4 = new C4364u4();
        for (int i = 0; i < this.f23500b.m9350e(); i++) {
            Map.Entry<K, Object> entryM9349d = this.f23500b.m9349d(i);
            c4364u4.m10274i((InterfaceC4390w4) entryM9349d.getKey(), entryM9349d.getValue());
        }
        Iterator it = this.f23500b.m9352g().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c4364u4.m10274i((InterfaceC4390w4) entry.getKey(), entry.getValue());
        }
        c4364u4.f23502d = this.f23502d;
        return c4364u4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4364u4) {
            return this.f23500b.equals(((C4364u4) obj).f23500b);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m10273h() {
        if (this.f23501c) {
            return;
        }
        this.f23500b.mo9348c();
        this.f23501c = true;
    }

    public final int hashCode() {
        return this.f23500b.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m10274i(T t, Object obj) {
        if (!t.mo9437e()) {
            m10268e(t.mo9434a(), obj);
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
                m10268e(t.mo9434a(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof C4253m5) {
            this.f23502d = true;
        }
        this.f23500b.put(t, obj);
    }

    /* JADX INFO: renamed from: j */
    public final void m10275j(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C4253m5) {
            int i = C4253m5.f23316c;
            throw new NoSuchMethodError();
        }
        if (key.mo9437e()) {
            Object objM10272c = m10272c(key);
            if (objM10272c == null) {
                objM10272c = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM10272c).add(m10267d(it.next()));
            }
            this.f23500b.put(key, objM10272c);
            return;
        }
        if (key.mo9435b() != EnumC4172g8.MESSAGE) {
            this.f23500b.put(key, m10267d(value));
            return;
        }
        Object objM10272c2 = m10272c(key);
        if (objM10272c2 == null) {
            this.f23500b.put(key, m10267d(value));
        } else {
            this.f23500b.put(key, objM10272c2 instanceof InterfaceC4282o6 ? key.mo9439r((InterfaceC4282o6) objM10272c2, (InterfaceC4282o6) value) : ((AbstractC4099b5.b) key.mo9438p(((InterfaceC4240l6) objM10272c2).mo9415b(), (InterfaceC4240l6) value)).m9433t());
        }
    }

    /* JADX INFO: renamed from: l */
    public final Iterator<Map.Entry<T, Object>> m10276l() {
        return this.f23502d ? new C4323r5(this.f23500b.entrySet().iterator()) : this.f23500b.entrySet().iterator();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m10277m() {
        for (int i = 0; i < this.f23500b.m9350e(); i++) {
            if (!m10269f(this.f23500b.m9349d(i))) {
                return false;
            }
        }
        Iterator it = this.f23500b.m9352g().iterator();
        while (it.hasNext()) {
            if (!m10269f((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public C4364u4() {
        int i = C4087a7.f23031f;
        this.f23500b = new C4115c7(16);
    }
}
