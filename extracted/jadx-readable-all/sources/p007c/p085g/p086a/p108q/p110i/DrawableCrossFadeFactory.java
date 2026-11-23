package p007c.p085g.p086a.p108q.p110i;

import android.graphics.drawable.Drawable;
import p007c.p085g.p086a.p089m.DataSource;

/* JADX INFO: renamed from: c.g.a.q.i.a, reason: use source file name */
/* JADX INFO: compiled from: DrawableCrossFadeFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class DrawableCrossFadeFactory implements TransitionFactory<Drawable> {

    /* JADX INFO: renamed from: a */
    public final int f3791a;

    /* JADX INFO: renamed from: b */
    public DrawableCrossFadeTransition f3792b;

    /* JADX INFO: renamed from: c.g.a.q.i.a$a */
    /* JADX INFO: compiled from: DrawableCrossFadeFactory.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f3793a;

        public a() {
            this(300);
        }

        public a(int i) {
            this.f3793a = i;
        }
    }

    public DrawableCrossFadeFactory(int i, boolean z) {
        this.f3791a = i;
    }

    @Override // p007c.p085g.p086a.p108q.p110i.TransitionFactory
    /* JADX INFO: renamed from: a */
    public Transition<Drawable> mo2031a(DataSource dataSource, boolean z) {
        if (dataSource == DataSource.MEMORY_CACHE) {
            return NoTransition.f3796a;
        }
        if (this.f3792b == null) {
            this.f3792b = new DrawableCrossFadeTransition(this.f3791a, false);
        }
        return this.f3792b;
    }
}
