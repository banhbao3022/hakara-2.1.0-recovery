package p007c.p085g.p086a.p108q.p110i;

import p007c.p085g.p086a.p089m.DataSource;

/* JADX INFO: renamed from: c.g.a.q.i.c, reason: use source file name */
/* JADX INFO: compiled from: NoTransition.java */
/* JADX INFO: loaded from: classes.dex */
public class NoTransition<R> implements Transition<R> {

    /* JADX INFO: renamed from: a */
    public static final NoTransition<?> f3796a = new NoTransition<>();

    /* JADX INFO: renamed from: b */
    public static final TransitionFactory<?> f3797b = new a();

    /* JADX INFO: renamed from: c.g.a.q.i.c$a */
    /* JADX INFO: compiled from: NoTransition.java */
    public static class a<R> implements TransitionFactory<R> {
        @Override // p007c.p085g.p086a.p108q.p110i.TransitionFactory
        /* JADX INFO: renamed from: a */
        public Transition<R> mo2031a(DataSource dataSource, boolean z) {
            return NoTransition.f3796a;
        }
    }

    @Override // p007c.p085g.p086a.p108q.p110i.Transition
    /* JADX INFO: renamed from: a */
    public boolean mo2032a(Object obj, Transition.a aVar) {
        return false;
    }
}
