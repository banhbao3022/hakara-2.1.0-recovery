package p007c.p085g.p086a;

import p007c.p085g.p086a.TransitionOptions;
import p007c.p085g.p086a.p108q.p110i.NoTransition;
import p007c.p085g.p086a.p108q.p110i.TransitionFactory;

/* JADX INFO: renamed from: c.g.a.j, reason: use source file name */
/* JADX INFO: compiled from: TransitionOptions.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class TransitionOptions<CHILD extends TransitionOptions<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: f */
    public TransitionFactory<? super TranscodeType> f2931f = (TransitionFactory<? super TranscodeType>) NoTransition.f3797b;

    /* JADX INFO: renamed from: a */
    public final CHILD m1660a() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            return (TransitionOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
