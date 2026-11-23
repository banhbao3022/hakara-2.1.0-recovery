package p477d1.p480c0;

import java.util.Iterator;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.c0.g, reason: use source file name */
/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes.dex */
public class Sequences3 extends SequencesJVM2 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: d1.c0.g$a */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a<T> implements Sequence<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f29446a;

        public a(Iterator it) {
            this.f29446a = it;
        }

        @Override // p477d1.p480c0.Sequence
        public Iterator<T> iterator() {
            return this.f29446a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final <T> Sequence<T> m12976a(Iterator<? extends T> it) {
        Intrinsics2.m13089e(it, "$this$asSequence");
        a aVar = new a(it);
        Intrinsics2.m13089e(aVar, "$this$constrainOnce");
        return aVar instanceof SequencesJVM ? aVar : new SequencesJVM(aVar);
    }
}
