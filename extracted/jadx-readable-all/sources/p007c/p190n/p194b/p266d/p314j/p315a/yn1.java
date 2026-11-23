package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yn1 {

    /* JADX INFO: renamed from: a */
    public static final yn1 f21931a = new yn1();

    /* JADX INFO: renamed from: b */
    public final ArrayList<nn1> f21932b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<nn1> f21933c = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public final Collection<nn1> m8806a() {
        return Collections.unmodifiableCollection(this.f21932b);
    }

    /* JADX INFO: renamed from: b */
    public final Collection<nn1> m8807b() {
        return Collections.unmodifiableCollection(this.f21933c);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8808c() {
        return this.f21933c.size() > 0;
    }
}
