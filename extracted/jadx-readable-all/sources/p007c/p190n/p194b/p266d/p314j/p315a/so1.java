package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class so1 extends um1<Integer, Object> {

    /* JADX INFO: renamed from: b */
    public String f19634b;

    /* JADX INFO: renamed from: c */
    public long f19635c;

    /* JADX INFO: renamed from: d */
    public String f19636d;

    /* JADX INFO: renamed from: e */
    public String f19637e;

    /* JADX INFO: renamed from: f */
    public String f19638f;

    public so1() {
        this.f19634b = "E";
        this.f19635c = -1L;
        this.f19636d = "E";
        this.f19637e = "E";
        this.f19638f = "E";
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.um1
    /* JADX INFO: renamed from: a */
    public final HashMap<Integer, Object> mo6993a() {
        HashMap<Integer, Object> map = new HashMap<>();
        map.put(0, this.f19634b);
        map.put(4, this.f19638f);
        map.put(3, this.f19637e);
        map.put(2, this.f19636d);
        map.put(1, Long.valueOf(this.f19635c));
        return map;
    }

    public so1(String str) {
        this.f19634b = "E";
        this.f19635c = -1L;
        this.f19636d = "E";
        this.f19637e = "E";
        this.f19638f = "E";
        HashMap mapM8512b = um1.m8512b(str);
        if (mapM8512b != null) {
            this.f19634b = mapM8512b.get(0) == null ? "E" : (String) mapM8512b.get(0);
            this.f19635c = mapM8512b.get(1) != null ? ((Long) mapM8512b.get(1)).longValue() : -1L;
            this.f19636d = mapM8512b.get(2) == null ? "E" : (String) mapM8512b.get(2);
            this.f19637e = mapM8512b.get(3) == null ? "E" : (String) mapM8512b.get(3);
            this.f19638f = mapM8512b.get(4) != null ? (String) mapM8512b.get(4) : "E";
        }
    }
}
