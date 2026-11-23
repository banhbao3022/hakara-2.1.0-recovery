package p007c.p190n.p194b.p266d.p314j.p315a;

import android.location.Location;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2121o;

/* JADX INFO: renamed from: c.n.b.d.j.a.qe */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3433qe implements InterfaceC2121o {

    /* JADX INFO: renamed from: a */
    public final Date f18252a;

    /* JADX INFO: renamed from: b */
    public final int f18253b;

    /* JADX INFO: renamed from: c */
    public final Set<String> f18254c;

    /* JADX INFO: renamed from: d */
    public final boolean f18255d;

    /* JADX INFO: renamed from: e */
    public final Location f18256e;

    /* JADX INFO: renamed from: f */
    public final int f18257f;

    /* JADX INFO: renamed from: g */
    public final C3165j5 f18258g;

    /* JADX INFO: renamed from: i */
    public final boolean f18260i;

    /* JADX INFO: renamed from: h */
    public final List<String> f18259h = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final Map<String, Boolean> f18261j = new HashMap();

    public C3433qe(Date date, int i, Set<String> set, Location location, boolean z, int i2, C3165j5 c3165j5, List<String> list, boolean z2, int i3, String str) {
        this.f18252a = date;
        this.f18253b = i;
        this.f18254c = set;
        this.f18256e = location;
        this.f18255d = z;
        this.f18257f = i2;
        this.f18258g = c3165j5;
        this.f18260i = z2;
        if (list != null) {
            for (String str2 : list) {
                if (str2.startsWith("custom:")) {
                    String[] strArrSplit = str2.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            this.f18261j.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(strArrSplit[2])) {
                            this.f18261j.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f18259h.add(str2);
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e
    /* JADX INFO: renamed from: a */
    public final int mo4604a() {
        return this.f18257f;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e
    @Deprecated
    /* JADX INFO: renamed from: b */
    public final boolean mo4605b() {
        return this.f18260i;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e
    @Deprecated
    /* JADX INFO: renamed from: c */
    public final Date mo4606c() {
        return this.f18252a;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e
    /* JADX INFO: renamed from: d */
    public final boolean mo4607d() {
        return this.f18255d;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e
    /* JADX INFO: renamed from: e */
    public final Set<String> mo4608e() {
        return this.f18254c;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e
    /* JADX INFO: renamed from: f */
    public final Location mo4609f() {
        return this.f18256e;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e
    @Deprecated
    /* JADX INFO: renamed from: g */
    public final int mo4610g() {
        return this.f18253b;
    }
}
