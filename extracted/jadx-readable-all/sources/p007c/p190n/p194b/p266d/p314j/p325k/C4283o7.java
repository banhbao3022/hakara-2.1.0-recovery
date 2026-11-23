package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: c.n.b.d.j.k.o7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4283o7 extends AbstractList<String> implements InterfaceC4337s5, RandomAccess {

    /* JADX INFO: renamed from: f */
    public final InterfaceC4337s5 f23385f;

    public C4283o7(InterfaceC4337s5 interfaceC4337s5) {
        this.f23385f = interfaceC4337s5;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4337s5
    /* JADX INFO: renamed from: A */
    public final Object mo10118A(int i) {
        return this.f23385f.mo10118A(i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4337s5
    /* JADX INFO: renamed from: a */
    public final List<?> mo10119a() {
        return this.f23385f.mo10119a();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.f23385f.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new C4311q7(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new C4325r7(this, i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4337s5
    /* JADX INFO: renamed from: n */
    public final InterfaceC4337s5 mo10120n() {
        return this;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4337s5
    /* JADX INFO: renamed from: o */
    public final void mo10121o(AbstractC4402x3 abstractC4402x3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23385f.size();
    }
}
