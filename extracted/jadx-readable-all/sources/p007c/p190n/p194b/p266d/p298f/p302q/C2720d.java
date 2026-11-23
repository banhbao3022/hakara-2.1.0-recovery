package p007c.p190n.p194b.p266d.p298f.p302q;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;
import p007c.p190n.p194b.p266d.p330l.C4746a;
import p636z0.p691g.ArraySet2;

/* JADX INFO: renamed from: c.n.b.d.f.q.d */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2720d {

    /* JADX INFO: renamed from: a */
    public final Account f11824a;

    /* JADX INFO: renamed from: b */
    public final Set<Scope> f11825b;

    /* JADX INFO: renamed from: c */
    public final Set<Scope> f11826c;

    /* JADX INFO: renamed from: d */
    public final Map<C2628a<?>, b> f11827d;

    /* JADX INFO: renamed from: e */
    public final View f11828e;

    /* JADX INFO: renamed from: f */
    public final String f11829f;

    /* JADX INFO: renamed from: g */
    public final String f11830g;

    /* JADX INFO: renamed from: h */
    public final C4746a f11831h;

    /* JADX INFO: renamed from: i */
    public Integer f11832i;

    /* JADX INFO: renamed from: c.n.b.d.f.q.d$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public Account f11833a;

        /* JADX INFO: renamed from: b */
        public ArraySet2<Scope> f11834b;

        /* JADX INFO: renamed from: c */
        public String f11835c;

        /* JADX INFO: renamed from: d */
        public String f11836d;

        /* JADX INFO: renamed from: e */
        public C4746a f11837e = C4746a.f24636f;

        /* JADX INFO: renamed from: a */
        public final C2720d m5584a() {
            return new C2720d(this.f11833a, this.f11834b, null, 0, null, this.f11835c, this.f11836d, this.f11837e, false);
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.f.q.d$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Set<Scope> f11838a;

        public b(Set<Scope> set) {
            Objects.requireNonNull(set, "null reference");
            this.f11838a = Collections.unmodifiableSet(set);
        }
    }

    public C2720d(Account account, Set<Scope> set, Map<C2628a<?>, b> map, int i, View view, String str, String str2, C4746a c4746a) {
        this(account, set, map, i, view, str, str2, c4746a, false);
    }

    public C2720d(Account account, Set<Scope> set, Map<C2628a<?>, b> map, int i, View view, String str, String str2, C4746a c4746a, boolean z) {
        this.f11824a = account;
        Set<Scope> setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f11825b = setEmptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f11827d = map;
        this.f11828e = view;
        this.f11829f = str;
        this.f11830g = str2;
        this.f11831h = c4746a;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator<b> it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().f11838a);
        }
        this.f11826c = Collections.unmodifiableSet(hashSet);
    }
}
