package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ge2 extends um1<Integer, Object> {

    /* JADX INFO: renamed from: b */
    public Long f14547b;

    /* JADX INFO: renamed from: c */
    public Boolean f14548c;

    /* JADX INFO: renamed from: d */
    public Boolean f14549d;

    public ge2() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.um1
    /* JADX INFO: renamed from: a */
    public final HashMap<Integer, Object> mo6993a() {
        HashMap<Integer, Object> map = new HashMap<>();
        map.put(0, this.f14547b);
        map.put(1, this.f14548c);
        map.put(2, this.f14549d);
        return map;
    }

    public ge2(String str) {
        HashMap mapM8512b = um1.m8512b(str);
        if (mapM8512b != null) {
            this.f14547b = (Long) mapM8512b.get(0);
            this.f14548c = (Boolean) mapM8512b.get(1);
            this.f14549d = (Boolean) mapM8512b.get(2);
        }
    }
}
