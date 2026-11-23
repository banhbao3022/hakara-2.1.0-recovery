package p477d1.p483s;

import java.util.Iterator;
import p477d1.p480c0.Sequence;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: d1.s.r, reason: use source file name */
/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Sequences5<T> implements Sequence<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterable f29517a;

    public Sequences5(Iterable iterable) {
        this.f29517a = iterable;
    }

    @Override // p477d1.p480c0.Sequence
    public Iterator<T> iterator() {
        return this.f29517a.iterator();
    }
}
