package p007c.p190n.p194b.p266d.p314j.p325k;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: renamed from: c.n.b.d.j.k.t5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4351t5 extends AbstractC4335s3<String> implements InterfaceC4337s5, RandomAccess {

    /* JADX INFO: renamed from: g */
    public static final C4351t5 f23471g;

    /* JADX INFO: renamed from: h */
    public final List<Object> f23472h;

    static {
        C4351t5 c4351t5 = new C4351t5();
        f23471g = c4351t5;
        c4351t5.f23452f = false;
    }

    public C4351t5() {
        this(10);
    }

    /* JADX INFO: renamed from: f */
    public static String m10221f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof AbstractC4402x3)) {
            Charset charset = C4127d5.f23112a;
            return new String((byte[]) obj, C4127d5.f23112a);
        }
        AbstractC4402x3 abstractC4402x3 = (AbstractC4402x3) obj;
        Objects.requireNonNull(abstractC4402x3);
        return abstractC4402x3.mo9502f() == 0 ? "" : abstractC4402x3.mo9542q(C4127d5.f23112a);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4337s5
    /* JADX INFO: renamed from: A */
    public final Object mo10118A(int i) {
        return this.f23472h.get(i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4337s5
    /* JADX INFO: renamed from: a */
    public final List<?> mo10119a() {
        return Collections.unmodifiableList(this.f23472h);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m10203c();
        this.f23472h.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4197i5
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC4197i5 mo9340b(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f23472h);
        return new C4351t5((ArrayList<Object>) arrayList);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m10203c();
        this.f23472h.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object obj = this.f23472h.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC4402x3) {
            AbstractC4402x3 abstractC4402x3 = (AbstractC4402x3) obj;
            Objects.requireNonNull(abstractC4402x3);
            String strMo9542q = abstractC4402x3.mo9502f() == 0 ? "" : abstractC4402x3.mo9542q(C4127d5.f23112a);
            if (abstractC4402x3.mo9544v()) {
                this.f23472h.set(i, strMo9542q);
            }
            return strMo9542q;
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = C4127d5.f23112a;
        String str = new String(bArr, C4127d5.f23112a);
        if (C4367u7.f23503a.mo10290a(0, bArr, 0, bArr.length) == 0) {
            this.f23472h.set(i, str);
        }
        return str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4337s5
    /* JADX INFO: renamed from: n */
    public final InterfaceC4337s5 mo10120n() {
        return this.f23452f ? new C4283o7(this) : this;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4337s5
    /* JADX INFO: renamed from: o */
    public final void mo10121o(AbstractC4402x3 abstractC4402x3) {
        m10203c();
        this.f23472h.add(abstractC4402x3);
        ((AbstractList) this).modCount++;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m10203c();
        Object objRemove = this.f23472h.remove(i);
        ((AbstractList) this).modCount++;
        return m10221f(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        m10203c();
        return m10221f(this.f23472h.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23472h.size();
    }

    public C4351t5(int i) {
        this.f23472h = new ArrayList(i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        m10203c();
        if (collection instanceof InterfaceC4337s5) {
            collection = ((InterfaceC4337s5) collection).mo10119a();
        }
        boolean zAddAll = this.f23472h.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public C4351t5(ArrayList<Object> arrayList) {
        this.f23472h = arrayList;
    }
}
