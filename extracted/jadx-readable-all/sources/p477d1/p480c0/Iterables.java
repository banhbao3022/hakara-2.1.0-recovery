package p477d1.p480c0;

import java.util.Iterator;
import p477d1.p493x.p495c.p496v.KMarkers;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: d1.c0.i, reason: use source file name */
/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Iterables<T> implements Iterable<T>, KMarkers {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Sequence f29447f;

    public Iterables(Sequence sequence) {
        this.f29447f = sequence;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f29447f.iterator();
    }
}
