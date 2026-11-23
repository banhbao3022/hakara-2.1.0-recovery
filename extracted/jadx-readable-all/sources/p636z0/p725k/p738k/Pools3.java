package p636z0.p725k.p738k;

/* JADX INFO: renamed from: z0.k.k.d, reason: use source file name */
/* JADX INFO: compiled from: Pools.java */
/* JADX INFO: loaded from: classes.dex */
public class Pools3<T> implements Pools2<T> {

    /* JADX INFO: renamed from: a */
    public final Object[] f37973a;

    /* JADX INFO: renamed from: b */
    public int f37974b;

    public Pools3(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f37973a = new Object[i];
    }

    @Override // p636z0.p725k.p738k.Pools2
    /* JADX INFO: renamed from: a */
    public T mo2057a() {
        int i = this.f37974b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f37973a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f37974b = i - 1;
        return t;
    }

    @Override // p636z0.p725k.p738k.Pools2
    /* JADX INFO: renamed from: b */
    public boolean mo2058b(T t) {
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.f37974b;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (this.f37973a[i2] == t) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        Object[] objArr = this.f37973a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f37974b = i + 1;
        return true;
    }
}
