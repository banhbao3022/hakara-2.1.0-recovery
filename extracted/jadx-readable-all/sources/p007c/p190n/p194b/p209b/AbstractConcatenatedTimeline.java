package p007c.p190n.p194b.p209b;

import android.util.Pair;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p243w1.ShuffleOrder;

/* JADX INFO: renamed from: c.n.b.b.z, reason: use source file name */
/* JADX INFO: compiled from: AbstractConcatenatedTimeline.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractConcatenatedTimeline extends Timeline {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f10369b = 0;

    /* JADX INFO: renamed from: c */
    public final int f10370c;

    /* JADX INFO: renamed from: d */
    public final ShuffleOrder f10371d;

    /* JADX INFO: renamed from: e */
    public final boolean f10372e;

    public AbstractConcatenatedTimeline(boolean z, ShuffleOrder shuffleOrder) {
        this.f10372e = z;
        this.f10371d = shuffleOrder;
        this.f10370c = shuffleOrder.mo4179a();
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: a */
    public int mo3456a(boolean z) {
        if (this.f10370c == 0) {
            return -1;
        }
        if (this.f10372e) {
            z = false;
        }
        int iMo4181c = z ? this.f10371d.mo4181c() : 0;
        while (mo3363z(iMo4181c).m3470q()) {
            iMo4181c = m4549x(iMo4181c, z);
            if (iMo4181c == -1) {
                return -1;
            }
        }
        return mo3363z(iMo4181c).mo3456a(z) + mo3362w(iMo4181c);
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: b */
    public final int mo3457b(Object obj) {
        int iMo3457b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iMo3357r = mo3357r(obj2);
        if (iMo3357r == -1 || (iMo3457b = mo3363z(iMo3357r).mo3457b(obj3)) == -1) {
            return -1;
        }
        return mo3361v(iMo3357r) + iMo3457b;
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: c */
    public int mo3458c(boolean z) {
        int i = this.f10370c;
        if (i == 0) {
            return -1;
        }
        if (this.f10372e) {
            z = false;
        }
        int iMo4185g = z ? this.f10371d.mo4185g() : i - 1;
        while (mo3363z(iMo4185g).m3470q()) {
            iMo4185g = m4550y(iMo4185g, z);
            if (iMo4185g == -1) {
                return -1;
            }
        }
        return mo3363z(iMo4185g).mo3458c(z) + mo3362w(iMo4185g);
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: e */
    public int mo3460e(int i, int i2, boolean z) {
        if (this.f10372e) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iMo3359t = mo3359t(i);
        int iMo3362w = mo3362w(iMo3359t);
        int iMo3460e = mo3363z(iMo3359t).mo3460e(i - iMo3362w, i2 != 2 ? i2 : 0, z);
        if (iMo3460e != -1) {
            return iMo3362w + iMo3460e;
        }
        int iM4549x = m4549x(iMo3359t, z);
        while (iM4549x != -1 && mo3363z(iM4549x).m3470q()) {
            iM4549x = m4549x(iM4549x, z);
        }
        if (iM4549x != -1) {
            return mo3363z(iM4549x).mo3456a(z) + mo3362w(iM4549x);
        }
        if (i2 == 2) {
            return mo3456a(z);
        }
        return -1;
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: g */
    public final Timeline.b mo3462g(int i, Timeline.b bVar, boolean z) {
        int iMo3358s = mo3358s(i);
        int iMo3362w = mo3362w(iMo3358s);
        mo3363z(iMo3358s).mo3462g(i - mo3361v(iMo3358s), bVar, z);
        bVar.f6746c += iMo3362w;
        if (z) {
            Object objMo3360u = mo3360u(iMo3358s);
            Object obj = bVar.f6745b;
            Objects.requireNonNull(obj);
            bVar.f6745b = Pair.create(objMo3360u, obj);
        }
        return bVar;
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: h */
    public final Timeline.b mo3463h(Object obj, Timeline.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iMo3357r = mo3357r(obj2);
        int iMo3362w = mo3362w(iMo3357r);
        mo3363z(iMo3357r).mo3463h(obj3, bVar);
        bVar.f6746c += iMo3362w;
        bVar.f6745b = obj;
        return bVar;
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: l */
    public int mo3466l(int i, int i2, boolean z) {
        if (this.f10372e) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iMo3359t = mo3359t(i);
        int iMo3362w = mo3362w(iMo3359t);
        int iMo3466l = mo3363z(iMo3359t).mo3466l(i - iMo3362w, i2 != 2 ? i2 : 0, z);
        if (iMo3466l != -1) {
            return iMo3362w + iMo3466l;
        }
        int iM4550y = m4550y(iMo3359t, z);
        while (iM4550y != -1 && mo3363z(iM4550y).m3470q()) {
            iM4550y = m4550y(iM4550y, z);
        }
        if (iM4550y != -1) {
            return mo3363z(iM4550y).mo3458c(z) + mo3362w(iM4550y);
        }
        if (i2 == 2) {
            return mo3458c(z);
        }
        return -1;
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: m */
    public final Object mo3467m(int i) {
        int iMo3358s = mo3358s(i);
        return Pair.create(mo3360u(iMo3358s), mo3363z(iMo3358s).mo3467m(i - mo3361v(iMo3358s)));
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: o */
    public final Timeline.c mo3469o(int i, Timeline.c cVar, long j2) {
        int iMo3359t = mo3359t(i);
        int iMo3362w = mo3362w(iMo3359t);
        int iMo3361v = mo3361v(iMo3359t);
        mo3363z(iMo3359t).mo3469o(i - iMo3362w, cVar, j2);
        Object objMo3360u = mo3360u(iMo3359t);
        if (!Timeline.c.f6750a.equals(cVar.f6752c)) {
            objMo3360u = Pair.create(objMo3360u, cVar.f6752c);
        }
        cVar.f6752c = objMo3360u;
        cVar.f6764o += iMo3361v;
        cVar.f6765p += iMo3361v;
        return cVar;
    }

    /* JADX INFO: renamed from: r */
    public abstract int mo3357r(Object obj);

    /* JADX INFO: renamed from: s */
    public abstract int mo3358s(int i);

    /* JADX INFO: renamed from: t */
    public abstract int mo3359t(int i);

    /* JADX INFO: renamed from: u */
    public abstract Object mo3360u(int i);

    /* JADX INFO: renamed from: v */
    public abstract int mo3361v(int i);

    /* JADX INFO: renamed from: w */
    public abstract int mo3362w(int i);

    /* JADX INFO: renamed from: x */
    public final int m4549x(int i, boolean z) {
        if (z) {
            return this.f10371d.mo4183e(i);
        }
        if (i < this.f10370c - 1) {
            return i + 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public final int m4550y(int i, boolean z) {
        if (z) {
            return this.f10371d.mo4182d(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public abstract Timeline mo3363z(int i);
}
