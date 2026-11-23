package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.k.j4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4210j4 {

    /* JADX INFO: renamed from: a */
    public final AbstractC4154f4 f23249a;

    /* JADX INFO: renamed from: b */
    public int f23250b;

    /* JADX INFO: renamed from: c */
    public int f23251c;

    /* JADX INFO: renamed from: d */
    public int f23252d = 0;

    public C4210j4(AbstractC4154f4 abstractC4154f4) {
        Charset charset = C4127d5.f23112a;
        this.f23249a = abstractC4154f4;
        abstractC4154f4.f23157c = this;
    }

    /* JADX INFO: renamed from: i */
    public static void m9861i(int i) throws IOException {
        if ((i & 7) != 0) {
            throw C4239l5.m10001g();
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m9862m(int i) throws IOException {
        if ((i & 3) != 0) {
            throw C4239l5.m10001g();
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m9863A(List<Boolean> list) throws IOException {
        int iMo9600a;
        int iMo9600a2;
        if (!(list instanceof C4376v3)) {
            int i = this.f23250b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(this.f23249a.mo9612p()));
                    if (this.f23249a.mo9622z()) {
                        return;
                    } else {
                        iMo9600a = this.f23249a.mo9600a();
                    }
                } while (iMo9600a == this.f23250b);
                this.f23252d = iMo9600a;
                return;
            }
            if (i != 2) {
                throw C4239l5.m10000f();
            }
            int iMo9599A = this.f23249a.mo9599A() + this.f23249a.mo9616t();
            do {
                list.add(Boolean.valueOf(this.f23249a.mo9612p()));
            } while (this.f23249a.mo9599A() < iMo9599A);
            m9899r(iMo9599A);
            return;
        }
        C4376v3 c4376v3 = (C4376v3) list;
        int i2 = this.f23250b & 7;
        if (i2 == 0) {
            do {
                c4376v3.m10282f(this.f23249a.mo9612p());
                if (this.f23249a.mo9622z()) {
                    return;
                } else {
                    iMo9600a2 = this.f23249a.mo9600a();
                }
            } while (iMo9600a2 == this.f23250b);
            this.f23252d = iMo9600a2;
            return;
        }
        if (i2 != 2) {
            throw C4239l5.m10000f();
        }
        int iMo9599A2 = this.f23249a.mo9599A() + this.f23249a.mo9616t();
        do {
            c4376v3.m10282f(this.f23249a.mo9612p());
        } while (this.f23249a.mo9599A() < iMo9599A2);
        m9899r(iMo9599A2);
    }

    /* JADX INFO: renamed from: B */
    public final long m9864B() throws IOException {
        m9886c(1);
        return this.f23249a.mo9610n();
    }

    /* JADX INFO: renamed from: C */
    public final void m9865C(List<String> list) throws IOException {
        m9889f(list, false);
    }

    /* JADX INFO: renamed from: D */
    public final int m9866D() throws IOException {
        m9886c(5);
        return this.f23249a.mo9611o();
    }

    /* JADX INFO: renamed from: E */
    public final void m9867E(List<String> list) throws IOException {
        m9889f(list, true);
    }

    /* JADX INFO: renamed from: F */
    public final void m9868F(List<AbstractC4402x3> list) throws IOException {
        int iMo9600a;
        if ((this.f23250b & 7) != 2) {
            throw C4239l5.m10000f();
        }
        do {
            list.add(m9873K());
            if (this.f23249a.mo9622z()) {
                return;
            } else {
                iMo9600a = this.f23249a.mo9600a();
            }
        } while (iMo9600a == this.f23250b);
        this.f23252d = iMo9600a;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m9869G() throws IOException {
        m9886c(0);
        return this.f23249a.mo9612p();
    }

    /* JADX INFO: renamed from: H */
    public final void m9870H(List<Integer> list) throws IOException {
        int iMo9600a;
        int iMo9600a2;
        if (!(list instanceof C4141e5)) {
            int i = this.f23250b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.f23249a.mo9616t()));
                    if (this.f23249a.mo9622z()) {
                        return;
                    } else {
                        iMo9600a = this.f23249a.mo9600a();
                    }
                } while (iMo9600a == this.f23250b);
                this.f23252d = iMo9600a;
                return;
            }
            if (i != 2) {
                throw C4239l5.m10000f();
            }
            int iMo9599A = this.f23249a.mo9599A() + this.f23249a.mo9616t();
            do {
                list.add(Integer.valueOf(this.f23249a.mo9616t()));
            } while (this.f23249a.mo9599A() < iMo9599A);
            m9899r(iMo9599A);
            return;
        }
        C4141e5 c4141e5 = (C4141e5) list;
        int i2 = this.f23250b & 7;
        if (i2 == 0) {
            do {
                c4141e5.m9555j(this.f23249a.mo9616t());
                if (this.f23249a.mo9622z()) {
                    return;
                } else {
                    iMo9600a2 = this.f23249a.mo9600a();
                }
            } while (iMo9600a2 == this.f23250b);
            this.f23252d = iMo9600a2;
            return;
        }
        if (i2 != 2) {
            throw C4239l5.m10000f();
        }
        int iMo9599A2 = this.f23249a.mo9599A() + this.f23249a.mo9616t();
        do {
            c4141e5.m9555j(this.f23249a.mo9616t());
        } while (this.f23249a.mo9599A() < iMo9599A2);
        m9899r(iMo9599A2);
    }

    /* JADX INFO: renamed from: I */
    public final String m9871I() throws IOException {
        m9886c(2);
        return this.f23249a.mo9614r();
    }

    /* JADX INFO: renamed from: J */
    public final void m9872J(List<Integer> list) throws IOException {
        int iMo9600a;
        int iMo9600a2;
        if (!(list instanceof C4141e5)) {
            int i = this.f23250b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.f23249a.mo9617u()));
                    if (this.f23249a.mo9622z()) {
                        return;
                    } else {
                        iMo9600a = this.f23249a.mo9600a();
                    }
                } while (iMo9600a == this.f23250b);
                this.f23252d = iMo9600a;
                return;
            }
            if (i != 2) {
                throw C4239l5.m10000f();
            }
            int iMo9599A = this.f23249a.mo9599A() + this.f23249a.mo9616t();
            do {
                list.add(Integer.valueOf(this.f23249a.mo9617u()));
            } while (this.f23249a.mo9599A() < iMo9599A);
            m9899r(iMo9599A);
            return;
        }
        C4141e5 c4141e5 = (C4141e5) list;
        int i2 = this.f23250b & 7;
        if (i2 == 0) {
            do {
                c4141e5.m9555j(this.f23249a.mo9617u());
                if (this.f23249a.mo9622z()) {
                    return;
                } else {
                    iMo9600a2 = this.f23249a.mo9600a();
                }
            } while (iMo9600a2 == this.f23250b);
            this.f23252d = iMo9600a2;
            return;
        }
        if (i2 != 2) {
            throw C4239l5.m10000f();
        }
        int iMo9599A2 = this.f23249a.mo9599A() + this.f23249a.mo9616t();
        do {
            c4141e5.m9555j(this.f23249a.mo9617u());
        } while (this.f23249a.mo9599A() < iMo9599A2);
        m9899r(iMo9599A2);
    }

    /* JADX INFO: renamed from: K */
    public final AbstractC4402x3 m9873K() throws IOException {
        m9886c(2);
        return this.f23249a.mo9615s();
    }

    /* JADX INFO: renamed from: L */
    public final void m9874L(List<Integer> list) throws IOException {
        int iMo9600a;
        int iMo9600a2;
        if (!(list instanceof C4141e5)) {
            int i = this.f23250b & 7;
            if (i == 2) {
                int iMo9616t = this.f23249a.mo9616t();
                m9862m(iMo9616t);
                int iMo9599A = this.f23249a.mo9599A() + iMo9616t;
                do {
                    list.add(Integer.valueOf(this.f23249a.mo9618v()));
                } while (this.f23249a.mo9599A() < iMo9599A);
                return;
            }
            if (i != 5) {
                throw C4239l5.m10000f();
            }
            do {
                list.add(Integer.valueOf(this.f23249a.mo9618v()));
                if (this.f23249a.mo9622z()) {
                    return;
                } else {
                    iMo9600a = this.f23249a.mo9600a();
                }
            } while (iMo9600a == this.f23250b);
            this.f23252d = iMo9600a;
            return;
        }
        C4141e5 c4141e5 = (C4141e5) list;
        int i2 = this.f23250b & 7;
        if (i2 == 2) {
            int iMo9616t2 = this.f23249a.mo9616t();
            m9862m(iMo9616t2);
            int iMo9599A2 = this.f23249a.mo9599A() + iMo9616t2;
            do {
                c4141e5.m9555j(this.f23249a.mo9618v());
            } while (this.f23249a.mo9599A() < iMo9599A2);
            return;
        }
        if (i2 != 5) {
            throw C4239l5.m10000f();
        }
        do {
            c4141e5.m9555j(this.f23249a.mo9618v());
            if (this.f23249a.mo9622z()) {
                return;
            } else {
                iMo9600a2 = this.f23249a.mo9600a();
            }
        } while (iMo9600a2 == this.f23250b);
        this.f23252d = iMo9600a2;
    }

    /* JADX INFO: renamed from: M */
    public final int m9875M() throws IOException {
        m9886c(0);
        return this.f23249a.mo9616t();
    }

    /* JADX INFO: renamed from: N */
    public final void m9876N(List<Long> list) throws IOException {
        int iMo9600a;
        int iMo9600a2;
        if (!(list instanceof C4430z5)) {
            int i = this.f23250b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.f23249a.mo9619w()));
                    if (this.f23249a.mo9622z()) {
                        return;
                    } else {
                        iMo9600a = this.f23249a.mo9600a();
                    }
                } while (iMo9600a == this.f23250b);
                this.f23252d = iMo9600a;
                return;
            }
            if (i != 2) {
                throw C4239l5.m10000f();
            }
            int iMo9616t = this.f23249a.mo9616t();
            m9861i(iMo9616t);
            int iMo9599A = this.f23249a.mo9599A() + iMo9616t;
            do {
                list.add(Long.valueOf(this.f23249a.mo9619w()));
            } while (this.f23249a.mo9599A() < iMo9599A);
            return;
        }
        C4430z5 c4430z5 = (C4430z5) list;
        int i2 = this.f23250b & 7;
        if (i2 == 1) {
            do {
                c4430z5.m10343f(this.f23249a.mo9619w());
                if (this.f23249a.mo9622z()) {
                    return;
                } else {
                    iMo9600a2 = this.f23249a.mo9600a();
                }
            } while (iMo9600a2 == this.f23250b);
            this.f23252d = iMo9600a2;
            return;
        }
        if (i2 != 2) {
            throw C4239l5.m10000f();
        }
        int iMo9616t2 = this.f23249a.mo9616t();
        m9861i(iMo9616t2);
        int iMo9599A2 = this.f23249a.mo9599A() + iMo9616t2;
        do {
            c4430z5.m10343f(this.f23249a.mo9619w());
        } while (this.f23249a.mo9599A() < iMo9599A2);
    }

    /* JADX INFO: renamed from: O */
    public final int m9877O() throws IOException {
        m9886c(0);
        return this.f23249a.mo9617u();
    }

    /* JADX INFO: renamed from: P */
    public final void m9878P(List<Integer> list) throws IOException {
        int iMo9600a;
        int iMo9600a2;
        if (!(list instanceof C4141e5)) {
            int i = this.f23250b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.f23249a.mo9620x()));
                    if (this.f23249a.mo9622z()) {
                        return;
                    } else {
                        iMo9600a = this.f23249a.mo9600a();
                    }
                } while (iMo9600a == this.f23250b);
                this.f23252d = iMo9600a;
                return;
            }
            if (i != 2) {
                throw C4239l5.m10000f();
            }
            int iMo9599A = this.f23249a.mo9599A() + this.f23249a.mo9616t();
            do {
                list.add(Integer.valueOf(this.f23249a.mo9620x()));
            } while (this.f23249a.mo9599A() < iMo9599A);
            m9899r(iMo9599A);
            return;
        }
        C4141e5 c4141e5 = (C4141e5) list;
        int i2 = this.f23250b & 7;
        if (i2 == 0) {
            do {
                c4141e5.m9555j(this.f23249a.mo9620x());
                if (this.f23249a.mo9622z()) {
                    return;
                } else {
                    iMo9600a2 = this.f23249a.mo9600a();
                }
            } while (iMo9600a2 == this.f23250b);
            this.f23252d = iMo9600a2;
            return;
        }
        if (i2 != 2) {
            throw C4239l5.m10000f();
        }
        int iMo9599A2 = this.f23249a.mo9599A() + this.f23249a.mo9616t();
        do {
            c4141e5.m9555j(this.f23249a.mo9620x());
        } while (this.f23249a.mo9599A() < iMo9599A2);
        m9899r(iMo9599A2);
    }

    /* JADX INFO: renamed from: Q */
    public final int m9879Q() throws IOException {
        m9886c(5);
        return this.f23249a.mo9618v();
    }

    /* JADX INFO: renamed from: R */
    public final void m9880R(List<Long> list) throws IOException {
        int iMo9600a;
        int iMo9600a2;
        if (!(list instanceof C4430z5)) {
            int i = this.f23250b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.f23249a.mo9621y()));
                    if (this.f23249a.mo9622z()) {
                        return;
                    } else {
                        iMo9600a = this.f23249a.mo9600a();
                    }
                } while (iMo9600a == this.f23250b);
                this.f23252d = iMo9600a;
                return;
            }
            if (i != 2) {
                throw C4239l5.m10000f();
            }
            int iMo9599A = this.f23249a.mo9599A() + this.f23249a.mo9616t();
            do {
                list.add(Long.valueOf(this.f23249a.mo9621y()));
            } while (this.f23249a.mo9599A() < iMo9599A);
            m9899r(iMo9599A);
            return;
        }
        C4430z5 c4430z5 = (C4430z5) list;
        int i2 = this.f23250b & 7;
        if (i2 == 0) {
            do {
                c4430z5.m10343f(this.f23249a.mo9621y());
                if (this.f23249a.mo9622z()) {
                    return;
                } else {
                    iMo9600a2 = this.f23249a.mo9600a();
                }
            } while (iMo9600a2 == this.f23250b);
            this.f23252d = iMo9600a2;
            return;
        }
        if (i2 != 2) {
            throw C4239l5.m10000f();
        }
        int iMo9599A2 = this.f23249a.mo9599A() + this.f23249a.mo9616t();
        do {
            c4430z5.m10343f(this.f23249a.mo9621y());
        } while (this.f23249a.mo9599A() < iMo9599A2);
        m9899r(iMo9599A2);
    }

    /* JADX INFO: renamed from: S */
    public final long m9881S() throws IOException {
        m9886c(1);
        return this.f23249a.mo9619w();
    }

    /* JADX INFO: renamed from: T */
    public final int m9882T() throws IOException {
        m9886c(0);
        return this.f23249a.mo9620x();
    }

    /* JADX INFO: renamed from: U */
    public final long m9883U() throws IOException {
        m9886c(0);
        return this.f23249a.mo9621y();
    }

    /* JADX INFO: renamed from: a */
    public final int m9884a() throws IOException {
        int i = this.f23252d;
        if (i != 0) {
            this.f23250b = i;
            this.f23252d = 0;
        } else {
            this.f23250b = this.f23249a.mo9600a();
        }
        int i2 = this.f23250b;
        if (i2 == 0 || i2 == this.f23251c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    /* JADX INFO: renamed from: b */
    public final <T> T m9885b(InterfaceC4431z6<T> interfaceC4431z6, C4280o4 c4280o4) throws IOException {
        m9886c(2);
        return (T) m9894l(interfaceC4431z6, c4280o4);
    }

    /* JADX INFO: renamed from: c */
    public final void m9886c(int i) throws IOException {
        if ((this.f23250b & 7) != i) {
            throw C4239l5.m10000f();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9887d(List<Double> list) throws IOException {
        int iMo9600a;
        int iMo9600a2;
        if (!(list instanceof C4252m4)) {
            int i = this.f23250b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(this.f23249a.mo9602e()));
                    if (this.f23249a.mo9622z()) {
                        return;
                    } else {
                        iMo9600a = this.f23249a.mo9600a();
                    }
                } while (iMo9600a == this.f23250b);
                this.f23252d = iMo9600a;
                return;
            }
            if (i != 2) {
                throw C4239l5.m10000f();
            }
            int iMo9616t = this.f23249a.mo9616t();
            m9861i(iMo9616t);
            int iMo9599A = this.f23249a.mo9599A() + iMo9616t;
            do {
                list.add(Double.valueOf(this.f23249a.mo9602e()));
            } while (this.f23249a.mo9599A() < iMo9599A);
            return;
        }
        C4252m4 c4252m4 = (C4252m4) list;
        int i2 = this.f23250b & 7;
        if (i2 == 1) {
            do {
                c4252m4.m10006f(this.f23249a.mo9602e());
                if (this.f23249a.mo9622z()) {
                    return;
                } else {
                    iMo9600a2 = this.f23249a.mo9600a();
                }
            } while (iMo9600a2 == this.f23250b);
            this.f23252d = iMo9600a2;
            return;
        }
        if (i2 != 2) {
            throw C4239l5.m10000f();
        }
        int iMo9616t2 = this.f23249a.mo9616t();
        m9861i(iMo9616t2);
        int iMo9599A2 = this.f23249a.mo9599A() + iMo9616t2;
        do {
            c4252m4.m10006f(this.f23249a.mo9602e());
        } while (this.f23249a.mo9599A() < iMo9599A2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final <T> void m9888e(List<T> list, InterfaceC4431z6<T> interfaceC4431z6, C4280o4 c4280o4) throws IOException {
        int iMo9600a;
        int i = this.f23250b;
        if ((i & 7) != 2) {
            throw C4239l5.m10000f();
        }
        do {
            list.add(m9894l(interfaceC4431z6, c4280o4));
            if (this.f23249a.mo9622z() || this.f23252d != 0) {
                return;
            } else {
                iMo9600a = this.f23249a.mo9600a();
            }
        } while (iMo9600a == i);
        this.f23252d = iMo9600a;
    }

    /* JADX INFO: renamed from: f */
    public final void m9889f(List<String> list, boolean z) throws IOException {
        String strMo9613q;
        int iMo9600a;
        int iMo9600a2;
        if ((this.f23250b & 7) != 2) {
            throw C4239l5.m10000f();
        }
        if ((list instanceof InterfaceC4337s5) && !z) {
            InterfaceC4337s5 interfaceC4337s5 = (InterfaceC4337s5) list;
            do {
                interfaceC4337s5.mo10121o(m9873K());
                if (this.f23249a.mo9622z()) {
                    return;
                } else {
                    iMo9600a2 = this.f23249a.mo9600a();
                }
            } while (iMo9600a2 == this.f23250b);
            this.f23252d = iMo9600a2;
            return;
        }
        do {
            if (z) {
                strMo9613q = m9871I();
            } else {
                m9886c(2);
                strMo9613q = this.f23249a.mo9613q();
            }
            list.add(strMo9613q);
            if (this.f23249a.mo9622z()) {
                return;
            } else {
                iMo9600a = this.f23249a.mo9600a();
            }
        } while (iMo9600a == this.f23250b);
        this.f23252d = iMo9600a;
    }

    /* JADX INFO: renamed from: g */
    public final <K, V> void m9890g(Map<K, V> map, C4114c6<K, V> c4114c6, C4280o4 c4280o4) throws IOException {
        m9886c(2);
        this.f23249a.mo9605h(this.f23249a.mo9616t());
        Objects.requireNonNull(c4114c6);
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final <T> T m9891h(InterfaceC4431z6<T> interfaceC4431z6, C4280o4 c4280o4) throws IOException {
        m9886c(3);
        return (T) m9898q(interfaceC4431z6, c4280o4);
    }

    /* JADX INFO: renamed from: j */
    public final void m9892j(List<Float> list) throws IOException {
        int iMo9600a;
        int iMo9600a2;
        if (!(list instanceof C4085a5)) {
            int i = this.f23250b & 7;
            if (i == 2) {
                int iMo9616t = this.f23249a.mo9616t();
                m9862m(iMo9616t);
                int iMo9599A = this.f23249a.mo9599A() + iMo9616t;
                do {
                    list.add(Float.valueOf(this.f23249a.mo9604g()));
                } while (this.f23249a.mo9599A() < iMo9599A);
                return;
            }
            if (i != 5) {
                throw C4239l5.m10000f();
            }
            do {
                list.add(Float.valueOf(this.f23249a.mo9604g()));
                if (this.f23249a.mo9622z()) {
                    return;
                } else {
                    iMo9600a = this.f23249a.mo9600a();
                }
            } while (iMo9600a == this.f23250b);
            this.f23252d = iMo9600a;
            return;
        }
        C4085a5 c4085a5 = (C4085a5) list;
        int i2 = this.f23250b & 7;
        if (i2 == 2) {
            int iMo9616t2 = this.f23249a.mo9616t();
            m9862m(iMo9616t2);
            int iMo9599A2 = this.f23249a.mo9599A() + iMo9616t2;
            do {
                c4085a5.m9341f(this.f23249a.mo9604g());
            } while (this.f23249a.mo9599A() < iMo9599A2);
            return;
        }
        if (i2 != 5) {
            throw C4239l5.m10000f();
        }
        do {
            c4085a5.m9341f(this.f23249a.mo9604g());
            if (this.f23249a.mo9622z()) {
                return;
            } else {
                iMo9600a2 = this.f23249a.mo9600a();
            }
        } while (iMo9600a2 == this.f23250b);
        this.f23252d = iMo9600a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final <T> void m9893k(List<T> list, InterfaceC4431z6<T> interfaceC4431z6, C4280o4 c4280o4) throws IOException {
        int iMo9600a;
        int i = this.f23250b;
        if ((i & 7) != 3) {
            throw C4239l5.m10000f();
        }
        do {
            list.add(m9898q(interfaceC4431z6, c4280o4));
            if (this.f23249a.mo9622z() || this.f23252d != 0) {
                return;
            } else {
                iMo9600a = this.f23249a.mo9600a();
            }
        } while (iMo9600a == i);
        this.f23252d = iMo9600a;
    }

    /* JADX INFO: renamed from: l */
    public final <T> T m9894l(InterfaceC4431z6<T> interfaceC4431z6, C4280o4 c4280o4) throws IOException {
        int iMo9616t = this.f23249a.mo9616t();
        AbstractC4154f4 abstractC4154f4 = this.f23249a;
        if (abstractC4154f4.f23155a >= abstractC4154f4.f23156b) {
            throw new C4239l5("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo9605h = abstractC4154f4.mo9605h(iMo9616t);
        T tZza = interfaceC4431z6.zza();
        this.f23249a.f23155a++;
        interfaceC4431z6.mo10062h(tZza, this, c4280o4);
        interfaceC4431z6.mo10059e(tZza);
        this.f23249a.mo9601d(0);
        AbstractC4154f4 abstractC4154f5 = this.f23249a;
        abstractC4154f5.f23155a--;
        abstractC4154f5.mo9607j(iMo9605h);
        return tZza;
    }

    /* JADX INFO: renamed from: n */
    public final void m9895n(List<Long> list) throws IOException {
        int iMo9600a;
        int iMo9600a2;
        if (!(list instanceof C4430z5)) {
            int i = this.f23250b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.f23249a.mo9606i()));
                    if (this.f23249a.mo9622z()) {
                        return;
                    } else {
                        iMo9600a = this.f23249a.mo9600a();
                    }
                } while (iMo9600a == this.f23250b);
                this.f23252d = iMo9600a;
                return;
            }
            if (i != 2) {
                throw C4239l5.m10000f();
            }
            int iMo9599A = this.f23249a.mo9599A() + this.f23249a.mo9616t();
            do {
                list.add(Long.valueOf(this.f23249a.mo9606i()));
            } while (this.f23249a.mo9599A() < iMo9599A);
            m9899r(iMo9599A);
            return;
        }
        C4430z5 c4430z5 = (C4430z5) list;
        int i2 = this.f23250b & 7;
        if (i2 == 0) {
            do {
                c4430z5.m10343f(this.f23249a.mo9606i());
                if (this.f23249a.mo9622z()) {
                    return;
                } else {
                    iMo9600a2 = this.f23249a.mo9600a();
                }
            } while (iMo9600a2 == this.f23250b);
            this.f23252d = iMo9600a2;
            return;
        }
        if (i2 != 2) {
            throw C4239l5.m10000f();
        }
        int iMo9599A2 = this.f23249a.mo9599A() + this.f23249a.mo9616t();
        do {
            c4430z5.m10343f(this.f23249a.mo9606i());
        } while (this.f23249a.mo9599A() < iMo9599A2);
        m9899r(iMo9599A2);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m9896o() throws IOException {
        int i;
        if (this.f23249a.mo9622z() || (i = this.f23250b) == this.f23251c) {
            return false;
        }
        return this.f23249a.mo9603f(i);
    }

    /* JADX INFO: renamed from: p */
    public final double m9897p() throws IOException {
        m9886c(1);
        return this.f23249a.mo9602e();
    }

    /* JADX INFO: renamed from: q */
    public final <T> T m9898q(InterfaceC4431z6<T> interfaceC4431z6, C4280o4 c4280o4) throws IOException {
        int i = this.f23251c;
        this.f23251c = ((this.f23250b >>> 3) << 3) | 4;
        try {
            T tZza = interfaceC4431z6.zza();
            interfaceC4431z6.mo10062h(tZza, this, c4280o4);
            interfaceC4431z6.mo10059e(tZza);
            if (this.f23250b != this.f23251c) {
                throw C4239l5.m10001g();
            }
            this.f23251c = i;
            return tZza;
        } catch (Throwable th) {
            this.f23251c = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m9899r(int i) throws IOException {
        if (this.f23249a.mo9599A() != i) {
            throw C4239l5.m9995a();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m9900s(List<Long> list) throws IOException {
        int iMo9600a;
        int iMo9600a2;
        if (!(list instanceof C4430z5)) {
            int i = this.f23250b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.f23249a.mo9608l()));
                    if (this.f23249a.mo9622z()) {
                        return;
                    } else {
                        iMo9600a = this.f23249a.mo9600a();
                    }
                } while (iMo9600a == this.f23250b);
                this.f23252d = iMo9600a;
                return;
            }
            if (i != 2) {
                throw C4239l5.m10000f();
            }
            int iMo9599A = this.f23249a.mo9599A() + this.f23249a.mo9616t();
            do {
                list.add(Long.valueOf(this.f23249a.mo9608l()));
            } while (this.f23249a.mo9599A() < iMo9599A);
            m9899r(iMo9599A);
            return;
        }
        C4430z5 c4430z5 = (C4430z5) list;
        int i2 = this.f23250b & 7;
        if (i2 == 0) {
            do {
                c4430z5.m10343f(this.f23249a.mo9608l());
                if (this.f23249a.mo9622z()) {
                    return;
                } else {
                    iMo9600a2 = this.f23249a.mo9600a();
                }
            } while (iMo9600a2 == this.f23250b);
            this.f23252d = iMo9600a2;
            return;
        }
        if (i2 != 2) {
            throw C4239l5.m10000f();
        }
        int iMo9599A2 = this.f23249a.mo9599A() + this.f23249a.mo9616t();
        do {
            c4430z5.m10343f(this.f23249a.mo9608l());
        } while (this.f23249a.mo9599A() < iMo9599A2);
        m9899r(iMo9599A2);
    }

    /* JADX INFO: renamed from: t */
    public final float m9901t() throws IOException {
        m9886c(5);
        return this.f23249a.mo9604g();
    }

    /* JADX INFO: renamed from: u */
    public final void m9902u(List<Integer> list) throws IOException {
        int iMo9600a;
        int iMo9600a2;
        if (!(list instanceof C4141e5)) {
            int i = this.f23250b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.f23249a.mo9609m()));
                    if (this.f23249a.mo9622z()) {
                        return;
                    } else {
                        iMo9600a = this.f23249a.mo9600a();
                    }
                } while (iMo9600a == this.f23250b);
                this.f23252d = iMo9600a;
                return;
            }
            if (i != 2) {
                throw C4239l5.m10000f();
            }
            int iMo9599A = this.f23249a.mo9599A() + this.f23249a.mo9616t();
            do {
                list.add(Integer.valueOf(this.f23249a.mo9609m()));
            } while (this.f23249a.mo9599A() < iMo9599A);
            m9899r(iMo9599A);
            return;
        }
        C4141e5 c4141e5 = (C4141e5) list;
        int i2 = this.f23250b & 7;
        if (i2 == 0) {
            do {
                c4141e5.m9555j(this.f23249a.mo9609m());
                if (this.f23249a.mo9622z()) {
                    return;
                } else {
                    iMo9600a2 = this.f23249a.mo9600a();
                }
            } while (iMo9600a2 == this.f23250b);
            this.f23252d = iMo9600a2;
            return;
        }
        if (i2 != 2) {
            throw C4239l5.m10000f();
        }
        int iMo9599A2 = this.f23249a.mo9599A() + this.f23249a.mo9616t();
        do {
            c4141e5.m9555j(this.f23249a.mo9609m());
        } while (this.f23249a.mo9599A() < iMo9599A2);
        m9899r(iMo9599A2);
    }

    /* JADX INFO: renamed from: v */
    public final long m9903v() throws IOException {
        m9886c(0);
        return this.f23249a.mo9606i();
    }

    /* JADX INFO: renamed from: w */
    public final void m9904w(List<Long> list) throws IOException {
        int iMo9600a;
        int iMo9600a2;
        if (!(list instanceof C4430z5)) {
            int i = this.f23250b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.f23249a.mo9610n()));
                    if (this.f23249a.mo9622z()) {
                        return;
                    } else {
                        iMo9600a = this.f23249a.mo9600a();
                    }
                } while (iMo9600a == this.f23250b);
                this.f23252d = iMo9600a;
                return;
            }
            if (i != 2) {
                throw C4239l5.m10000f();
            }
            int iMo9616t = this.f23249a.mo9616t();
            m9861i(iMo9616t);
            int iMo9599A = this.f23249a.mo9599A() + iMo9616t;
            do {
                list.add(Long.valueOf(this.f23249a.mo9610n()));
            } while (this.f23249a.mo9599A() < iMo9599A);
            return;
        }
        C4430z5 c4430z5 = (C4430z5) list;
        int i2 = this.f23250b & 7;
        if (i2 == 1) {
            do {
                c4430z5.m10343f(this.f23249a.mo9610n());
                if (this.f23249a.mo9622z()) {
                    return;
                } else {
                    iMo9600a2 = this.f23249a.mo9600a();
                }
            } while (iMo9600a2 == this.f23250b);
            this.f23252d = iMo9600a2;
            return;
        }
        if (i2 != 2) {
            throw C4239l5.m10000f();
        }
        int iMo9616t2 = this.f23249a.mo9616t();
        m9861i(iMo9616t2);
        int iMo9599A2 = this.f23249a.mo9599A() + iMo9616t2;
        do {
            c4430z5.m10343f(this.f23249a.mo9610n());
        } while (this.f23249a.mo9599A() < iMo9599A2);
    }

    /* JADX INFO: renamed from: x */
    public final long m9905x() throws IOException {
        m9886c(0);
        return this.f23249a.mo9608l();
    }

    /* JADX INFO: renamed from: y */
    public final void m9906y(List<Integer> list) throws IOException {
        int iMo9600a;
        int iMo9600a2;
        if (!(list instanceof C4141e5)) {
            int i = this.f23250b & 7;
            if (i == 2) {
                int iMo9616t = this.f23249a.mo9616t();
                m9862m(iMo9616t);
                int iMo9599A = this.f23249a.mo9599A() + iMo9616t;
                do {
                    list.add(Integer.valueOf(this.f23249a.mo9611o()));
                } while (this.f23249a.mo9599A() < iMo9599A);
                return;
            }
            if (i != 5) {
                throw C4239l5.m10000f();
            }
            do {
                list.add(Integer.valueOf(this.f23249a.mo9611o()));
                if (this.f23249a.mo9622z()) {
                    return;
                } else {
                    iMo9600a = this.f23249a.mo9600a();
                }
            } while (iMo9600a == this.f23250b);
            this.f23252d = iMo9600a;
            return;
        }
        C4141e5 c4141e5 = (C4141e5) list;
        int i2 = this.f23250b & 7;
        if (i2 == 2) {
            int iMo9616t2 = this.f23249a.mo9616t();
            m9862m(iMo9616t2);
            int iMo9599A2 = this.f23249a.mo9599A() + iMo9616t2;
            do {
                c4141e5.m9555j(this.f23249a.mo9611o());
            } while (this.f23249a.mo9599A() < iMo9599A2);
            return;
        }
        if (i2 != 5) {
            throw C4239l5.m10000f();
        }
        do {
            c4141e5.m9555j(this.f23249a.mo9611o());
            if (this.f23249a.mo9622z()) {
                return;
            } else {
                iMo9600a2 = this.f23249a.mo9600a();
            }
        } while (iMo9600a2 == this.f23250b);
        this.f23252d = iMo9600a2;
    }

    /* JADX INFO: renamed from: z */
    public final int m9907z() throws IOException {
        m9886c(0);
        return this.f23249a.mo9609m();
    }
}
