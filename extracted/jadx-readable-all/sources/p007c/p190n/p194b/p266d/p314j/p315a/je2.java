package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class je2 extends um1<Integer, Long> {

    /* JADX INFO: renamed from: b */
    public Long f15584b;

    /* JADX INFO: renamed from: c */
    public Long f15585c;

    public je2() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.um1
    /* JADX INFO: renamed from: a */
    public final HashMap<Integer, Long> mo6993a() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, this.f15584b);
        map.put(1, this.f15585c);
        return map;
    }

    public je2(String str) {
        HashMap mapM8512b = um1.m8512b(str);
        if (mapM8512b != null) {
            this.f15584b = (Long) mapM8512b.get(0);
            this.f15585c = (Long) mapM8512b.get(1);
        }
    }
}
