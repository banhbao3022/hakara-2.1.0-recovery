package p636z0.p725k.p738k;

/* JADX INFO: renamed from: z0.k.k.e, reason: use source file name */
/* JADX INFO: compiled from: Pools.java */
/* JADX INFO: loaded from: classes.dex */
public class Pools4<T> extends Pools3<T> {

    /* JADX INFO: renamed from: c */
    public final Object f37975c;

    public Pools4(int i) {
        super(i);
        this.f37975c = new Object();
    }

    @Override // p636z0.p725k.p738k.Pools3, p636z0.p725k.p738k.Pools2
    /* JADX INFO: renamed from: a */
    public T mo2057a() {
        T t;
        synchronized (this.f37975c) {
            t = (T) super.mo2057a();
        }
        return t;
    }

    @Override // p636z0.p725k.p738k.Pools3, p636z0.p725k.p738k.Pools2
    /* JADX INFO: renamed from: b */
    public boolean mo2058b(T t) {
        boolean zMo2058b;
        synchronized (this.f37975c) {
            zMo2058b = super.mo2058b(t);
        }
        return zMo2058b;
    }
}
