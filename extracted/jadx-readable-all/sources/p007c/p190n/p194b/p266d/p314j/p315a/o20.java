package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class o20<AdT> implements p20<AdT> {

    /* JADX INFO: renamed from: a */
    public final Map<String, bx0<AdT>> f17504a;

    public o20(Map<String, bx0<AdT>> map) {
        this.f17504a = map;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.p20
    /* JADX INFO: renamed from: a */
    public final bx0<AdT> mo7493a(int i, String str) {
        return this.f17504a.get(str);
    }
}
