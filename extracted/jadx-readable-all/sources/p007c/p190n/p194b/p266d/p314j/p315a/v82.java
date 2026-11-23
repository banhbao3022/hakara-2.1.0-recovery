package p007c.p190n.p194b.p266d.p314j.p315a;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class v82 extends u62<String> implements RandomAccess, w82 {

    /* JADX INFO: renamed from: g */
    public static final v82 f20712g;

    /* JADX INFO: renamed from: h */
    public final List<Object> f20713h;

    static {
        v82 v82Var = new v82(10);
        f20712g = v82Var;
        v82Var.f20226f = false;
    }

    public v82() {
        this(10);
    }

    /* JADX INFO: renamed from: h */
    public static String m8539h(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof g72) {
            g72 g72Var = (g72) obj;
            return g72Var.mo5719m() == 0 ? "" : g72Var.mo5725y(p82.f17879a);
        }
        Charset charset = p82.f17879a;
        return new String((byte[]) obj, p82.f17879a);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w82
    /* JADX INFO: renamed from: J */
    public final void mo8410J(g72 g72Var) {
        m8471c();
        this.f20713h.add(g72Var);
        ((AbstractList) this).modCount++;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w82
    /* JADX INFO: renamed from: Y */
    public final Object mo8411Y(int i) {
        return this.f20713h.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m8471c();
        this.f20713h.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        m8471c();
        if (collection instanceof w82) {
            collection = ((w82) collection).mo8412g();
        }
        boolean zAddAll = this.f20713h.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m8471c();
        this.f20713h.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.f20713h.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof g72) {
            g72 g72Var = (g72) obj;
            String strMo5725y = g72Var.mo5719m() == 0 ? "" : g72Var.mo5725y(p82.f17879a);
            if (g72Var.mo5726z()) {
                this.f20713h.set(i, strMo5725y);
            }
            return strMo5725y;
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = p82.f17879a;
        String str = new String(bArr, p82.f17879a);
        if (cb2.f12972a.m5727a(0, bArr, 0, bArr.length) == 0) {
            this.f20713h.set(i, str);
        }
        return str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w82
    /* JADX INFO: renamed from: g */
    public final List<?> mo8412g() {
        return Collections.unmodifiableList(this.f20713h);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w82
    /* JADX INFO: renamed from: i */
    public final w82 mo8413i() {
        return this.f20226f ? new ta2(this) : this;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o82
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ o82 mo5705l(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f20713h);
        return new v82((ArrayList<Object>) arrayList);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m8471c();
        Object objRemove = this.f20713h.remove(i);
        ((AbstractList) this).modCount++;
        return m8539h(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        m8471c();
        return m8539h(this.f20713h.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20713h.size();
    }

    public v82(int i) {
        this.f20713h = new ArrayList(i);
    }

    public v82(ArrayList<Object> arrayList) {
        this.f20713h = arrayList;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
