package p007c.p190n.p194b.p266d.p267a.p273d0.p274a;

import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import p007c.p190n.p194b.p266d.p314j.p315a.zc2;

/* JADX INFO: renamed from: c.n.b.d.a.d0.a.y */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2167y implements zc2<Set<String>> {

    /* JADX INFO: renamed from: a */
    public final C2164v f10544a;

    public C2167y(C2164v c2164v) {
        this.f10544a = c2164v;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        C2164v c2164v = this.f10544a;
        Objects.requireNonNull(c2164v);
        HashSet hashSet = new HashSet();
        hashSet.add(c2164v.f10541a.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
