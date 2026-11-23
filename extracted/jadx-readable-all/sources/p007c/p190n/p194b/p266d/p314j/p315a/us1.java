package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Arrays;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class us1<K, V> {

    /* JADX INFO: renamed from: a */
    public Object[] f20424a;

    /* JADX INFO: renamed from: b */
    public int f20425b;

    public us1() {
        this.f20424a = new Object[14];
        this.f20425b = 0;
    }

    public us1(int i) {
        this.f20424a = new Object[14];
        this.f20425b = 0;
    }

    /* JADX INFO: renamed from: a */
    public final us1<K, V> m8519a(K k, V v) {
        int i = this.f20425b + 1;
        int i2 = i + i;
        Object[] objArr = this.f20424a;
        int length = objArr.length;
        if (i2 > length) {
            this.f20424a = Arrays.copyOf(objArr, ps1.m8153a(length, i2));
        }
        C2622l.m5336Z0(k, v);
        Object[] objArr2 = this.f20424a;
        int i3 = this.f20425b;
        int i4 = i3 + i3;
        objArr2[i4] = k;
        objArr2[i4 + 1] = v;
        this.f20425b = i3 + 1;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final vs1<K, V> m8520b() {
        return gt1.m7029e(this.f20425b, this.f20424a);
    }
}
