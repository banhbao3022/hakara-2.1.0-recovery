package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a72 implements Iterator {
    /* JADX INFO: renamed from: a */
    public abstract byte mo5700a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Byte.valueOf(mo5700a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
