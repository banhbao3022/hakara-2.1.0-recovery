package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vd2 extends um1<Integer, Long> {

    /* JADX INFO: renamed from: b */
    public long f20739b;

    /* JADX INFO: renamed from: c */
    public long f20740c;

    public vd2() {
        this.f20739b = -1L;
        this.f20740c = -1L;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.um1
    /* JADX INFO: renamed from: a */
    public final HashMap<Integer, Long> mo6993a() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, Long.valueOf(this.f20739b));
        map.put(1, Long.valueOf(this.f20740c));
        return map;
    }

    public vd2(String str) {
        this.f20739b = -1L;
        this.f20740c = -1L;
        HashMap mapM8512b = um1.m8512b(str);
        if (mapM8512b != null) {
            this.f20739b = ((Long) mapM8512b.get(0)).longValue();
            this.f20740c = ((Long) mapM8512b.get(1)).longValue();
        }
    }
}
