package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ws1<E> {

    /* JADX INFO: renamed from: a */
    public Object[] f21349a;

    /* JADX INFO: renamed from: b */
    public int f21350b;

    /* JADX INFO: renamed from: c */
    public boolean f21351c;

    /* JADX INFO: renamed from: d */
    @NullableDecl
    public Object[] f21352d;

    /* JADX INFO: renamed from: e */
    public int f21353e;

    public ws1() {
        this.f21349a = new Object[4];
        this.f21350b = 0;
    }

    /* JADX INFO: renamed from: b */
    private final ws1<E> m8687b(E e) {
        m8690e(this.f21350b + 1);
        Object[] objArr = this.f21349a;
        int i = this.f21350b;
        this.f21350b = i + 1;
        objArr[i] = e;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    private final ps1<E> m8688c(Iterable<? extends E> iterable) {
        m8690e(iterable.size() + this.f21350b);
        if (iterable instanceof qs1) {
            this.f21350b = ((qs1) iterable).mo6095s(this.f21349a, this.f21350b);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m8689d(it.next());
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final ws1<E> m8689d(E e) {
        Objects.requireNonNull(e);
        if (this.f21352d != null) {
            int iM8752u = xs1.m8752u(this.f21350b);
            int length = this.f21352d.length;
            if (iM8752u <= length) {
                int i = length - 1;
                int iHashCode = e.hashCode();
                int iM5466z1 = C2622l.m5466z1(iHashCode);
                while (true) {
                    int i2 = iM5466z1 & i;
                    Object[] objArr = this.f21352d;
                    Object obj = objArr[i2];
                    if (obj != null) {
                        if (obj.equals(e)) {
                            break;
                        }
                        iM5466z1 = i2 + 1;
                    } else {
                        objArr[i2] = e;
                        this.f21353e += iHashCode;
                        m8687b(e);
                        break;
                    }
                }
                return this;
            }
        }
        this.f21352d = null;
        m8687b(e);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m8690e(int i) {
        Object[] objArr = this.f21349a;
        int length = objArr.length;
        if (length < i) {
            this.f21349a = Arrays.copyOf(objArr, ps1.m8153a(length, i));
            this.f21351c = false;
        } else if (this.f21351c) {
            this.f21349a = (Object[]) objArr.clone();
            this.f21351c = false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final ws1<E> m8691f(Iterable<? extends E> iterable) {
        if (this.f21352d != null) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                m8689d(it.next());
            }
        } else {
            m8688c(iterable);
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final xs1<E> m8692g() {
        xs1<E> xs1VarM8753y;
        int i = this.f21350b;
        if (i == 0) {
            return ht1.f15008i;
        }
        if (i == 1) {
            return new it1(this.f21349a[0]);
        }
        if (this.f21352d == null || xs1.m8752u(i) != this.f21352d.length) {
            xs1VarM8753y = xs1.m8753y(this.f21350b, this.f21349a);
            this.f21350b = xs1VarM8753y.size();
        } else {
            int i2 = this.f21350b;
            Object[] objArrCopyOf = this.f21349a;
            int length = objArrCopyOf.length;
            if (i2 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            int i3 = this.f21353e;
            Object[] objArr = this.f21352d;
            xs1VarM8753y = new ht1<>(objArrCopyOf, i3, objArr, objArr.length - 1, this.f21350b);
        }
        this.f21351c = true;
        this.f21352d = null;
        return xs1VarM8753y;
    }

    public ws1(int i) {
        this.f21349a = new Object[i];
        this.f21350b = 0;
        this.f21352d = new Object[xs1.m8752u(i)];
    }
}
