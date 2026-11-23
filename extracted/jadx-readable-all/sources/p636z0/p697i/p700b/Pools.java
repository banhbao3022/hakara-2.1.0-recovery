package p636z0.p697i.p700b;

/* JADX INFO: renamed from: z0.i.b.e, reason: use source file name */
/* JADX INFO: compiled from: Pools.java */
/* JADX INFO: loaded from: classes.dex */
public class Pools<T> {

    /* JADX INFO: renamed from: a */
    public final Object[] f36755a;

    /* JADX INFO: renamed from: b */
    public int f36756b;

    public Pools(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f36755a = new Object[i];
    }

    /* JADX INFO: renamed from: a */
    public T m15709a() {
        int i = this.f36756b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f36755a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f36756b = i - 1;
        return t;
    }

    /* JADX INFO: renamed from: b */
    public boolean m15710b(T t) {
        int i = this.f36756b;
        Object[] objArr = this.f36755a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f36756b = i + 1;
        return true;
    }
}
