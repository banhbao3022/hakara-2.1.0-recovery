package p007c.p190n.p378c.p380b;

import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.c.b.l0, reason: use source file name */
/* JADX INFO: compiled from: RegularImmutableList.java */
/* JADX INFO: loaded from: classes.dex */
public class RegularImmutableList<E> extends ImmutableList2<E> {

    /* JADX INFO: renamed from: h */
    public static final ImmutableList2<Object> f26218h = new RegularImmutableList(new Object[0], 0);

    /* JADX INFO: renamed from: i */
    public final transient Object[] f26219i;

    /* JADX INFO: renamed from: j */
    public final transient int f26220j;

    public RegularImmutableList(Object[] objArr, int i) {
        this.f26219i = objArr;
        this.f26220j = i;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableList2, p007c.p190n.p378c.p380b.ImmutableCollection
    /* JADX INFO: renamed from: f */
    public int mo11618f(Object[] objArr, int i) {
        System.arraycopy(this.f26219i, 0, objArr, i, this.f26220j);
        return i + this.f26220j;
    }

    @Override // java.util.List
    public E get(int i) {
        C4799a.m10994j(i, this.f26220j);
        return (E) this.f26219i[i];
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection
    /* JADX INFO: renamed from: h */
    public Object[] mo11619h() {
        return this.f26219i;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection
    /* JADX INFO: renamed from: j */
    public int mo11620j() {
        return this.f26220j;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection
    /* JADX INFO: renamed from: m */
    public int mo11621m() {
        return 0;
    }

    @Override // p007c.p190n.p378c.p380b.ImmutableCollection
    /* JADX INFO: renamed from: q */
    public boolean mo11622q() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f26220j;
    }
}
