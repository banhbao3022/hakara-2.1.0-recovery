package p500e1.p501a.p503c2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: e1.a.c2.c, reason: use source file name */
/* JADX INFO: compiled from: Atomic.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class Atomic2<T> extends Atomic3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29639a = AtomicReferenceFieldUpdater.newUpdater(Atomic2.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = Atomic.f29638a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p500e1.p501a.p503c2.Atomic3
    /* JADX INFO: renamed from: a */
    public final Object mo13131a(Object obj) {
        Object objMo13133c = this._consensus;
        Object obj2 = Atomic.f29638a;
        if (objMo13133c == obj2) {
            objMo13133c = mo13133c(obj);
            Object obj3 = this._consensus;
            if (obj3 != obj2) {
                objMo13133c = obj3;
            } else if (!f29639a.compareAndSet(this, obj2, objMo13133c)) {
                objMo13133c = this._consensus;
            }
        }
        mo13132b(obj, objMo13133c);
        return objMo13133c;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo13132b(T t, Object obj);

    /* JADX INFO: renamed from: c */
    public abstract Object mo13133c(T t);
}
