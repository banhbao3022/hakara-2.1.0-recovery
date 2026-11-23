package p007c.p190n.p194b.p266d.p314j.p320f;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: renamed from: c.n.b.d.j.f.p5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3964p5 extends AbstractC3813a4<String> implements InterfaceC3994s5, RandomAccess {

    /* JADX INFO: renamed from: g */
    public static final C3964p5 f22838g;

    /* JADX INFO: renamed from: h */
    public final List<Object> f22839h;

    static {
        C3964p5 c3964p5 = new C3964p5();
        f22838g = c3964p5;
        c3964p5.f22505f = false;
    }

    public C3964p5() {
        this(10);
    }

    /* JADX INFO: renamed from: f */
    public static String m9185f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof AbstractC3823b4)) {
            Charset charset = C3814a5.f22506a;
            return new String((byte[]) obj, C3814a5.f22506a);
        }
        AbstractC3823b4 abstractC3823b4 = (AbstractC3823b4) obj;
        Objects.requireNonNull(abstractC3823b4);
        return abstractC3823b4.size() == 0 ? "" : abstractC3823b4.mo8946c(C3814a5.f22506a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m8928c();
        this.f22839h.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3813a4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3813a4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m8928c();
        this.f22839h.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3994s5
    /* JADX INFO: renamed from: d */
    public final Object mo9179d(int i) {
        return this.f22839h.get(i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3994s5
    /* JADX INFO: renamed from: e */
    public final List<?> mo9180e() {
        return Collections.unmodifiableList(this.f22839h);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object obj = this.f22839h.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC3823b4) {
            AbstractC3823b4 abstractC3823b4 = (AbstractC3823b4) obj;
            Objects.requireNonNull(abstractC3823b4);
            String strMo8946c = abstractC3823b4.size() == 0 ? "" : abstractC3823b4.mo8946c(C3814a5.f22506a);
            if (abstractC3823b4.mo8952t()) {
                this.f22839h.set(i, strMo8946c);
            }
            return strMo8946c;
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = C3814a5.f22506a;
        String str = new String(bArr, C3814a5.f22506a);
        if (C4033w7.f22982a.mo8943b(0, bArr, 0, bArr.length) == 0) {
            this.f22839h.set(i, str);
        }
        return str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3994s5
    /* JADX INFO: renamed from: p */
    public final InterfaceC3994s5 mo9181p() {
        return this.f22505f ? new C3956o7(this) : this;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3894i5
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC3894i5 mo8958r(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f22839h);
        return new C3964p5((ArrayList<Object>) arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m8928c();
        Object objRemove = this.f22839h.remove(i);
        ((AbstractList) this).modCount++;
        return m9185f(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        m8928c();
        return m9185f(this.f22839h.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22839h.size();
    }

    public C3964p5(int i) {
        this.f22839h = new ArrayList(i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3813a4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        m8928c();
        if (collection instanceof InterfaceC3994s5) {
            collection = ((InterfaceC3994s5) collection).mo9180e();
        }
        boolean zAddAll = this.f22839h.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public C3964p5(ArrayList<Object> arrayList) {
        this.f22839h = arrayList;
    }
}
