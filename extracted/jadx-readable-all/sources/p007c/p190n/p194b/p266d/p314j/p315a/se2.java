package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class se2 extends um1<Integer, Long> {

    /* JADX INFO: renamed from: b */
    public Long f19540b;

    /* JADX INFO: renamed from: c */
    public Long f19541c;

    /* JADX INFO: renamed from: d */
    public Long f19542d;

    /* JADX INFO: renamed from: e */
    public Long f19543e;

    public se2() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.um1
    /* JADX INFO: renamed from: a */
    public final HashMap<Integer, Long> mo6993a() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, this.f19540b);
        map.put(1, this.f19541c);
        map.put(2, this.f19542d);
        map.put(3, this.f19543e);
        return map;
    }

    public se2(String str) {
        HashMap mapM8512b = um1.m8512b(str);
        if (mapM8512b != null) {
            this.f19540b = (Long) mapM8512b.get(0);
            this.f19541c = (Long) mapM8512b.get(1);
            this.f19542d = (Long) mapM8512b.get(2);
            this.f19543e = (Long) mapM8512b.get(3);
        }
    }
}
