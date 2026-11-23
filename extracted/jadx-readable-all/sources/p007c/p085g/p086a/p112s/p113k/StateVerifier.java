package p007c.p085g.p086a.p112s.p113k;

/* JADX INFO: renamed from: c.g.a.s.k.d, reason: use source file name */
/* JADX INFO: compiled from: StateVerifier.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class StateVerifier {

    /* JADX INFO: renamed from: c.g.a.s.k.d$b */
    /* JADX INFO: compiled from: StateVerifier.java */
    public static class b extends StateVerifier {

        /* JADX INFO: renamed from: a */
        public volatile boolean f3835a;

        public b() {
            super(null);
        }

        @Override // p007c.p085g.p086a.p112s.p113k.StateVerifier
        /* JADX INFO: renamed from: a */
        public void mo2059a() {
            if (this.f3835a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public StateVerifier(a aVar) {
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2059a();
}
