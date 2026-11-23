package p007c.p190n.p194b.p266d.p314j.p320f;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: c.n.b.d.j.f.o7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3956o7 extends AbstractList<String> implements InterfaceC3994s5, RandomAccess {

    /* JADX INFO: renamed from: f */
    public final InterfaceC3994s5 f22832f;

    public C3956o7(InterfaceC3994s5 interfaceC3994s5) {
        this.f22832f = interfaceC3994s5;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3994s5
    /* JADX INFO: renamed from: d */
    public final Object mo9179d(int i) {
        return this.f22832f.mo9179d(i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3994s5
    /* JADX INFO: renamed from: e */
    public final List<?> mo9180e() {
        return this.f22832f.mo9180e();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.f22832f.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new C3976q7(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new C3986r7(this, i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3994s5
    /* JADX INFO: renamed from: p */
    public final InterfaceC3994s5 mo9181p() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22832f.size();
    }
}
