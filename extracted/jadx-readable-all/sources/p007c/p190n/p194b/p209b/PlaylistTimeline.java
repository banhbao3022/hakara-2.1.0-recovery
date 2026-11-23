package p007c.p190n.p194b.p209b;

import java.util.Collection;
import java.util.HashMap;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p243w1.ShuffleOrder;

/* JADX INFO: renamed from: c.n.b.b.f1, reason: use source file name */
/* JADX INFO: compiled from: PlaylistTimeline.java */
/* JADX INFO: loaded from: classes.dex */
public final class PlaylistTimeline extends AbstractConcatenatedTimeline {

    /* JADX INFO: renamed from: f */
    public final int f6603f;

    /* JADX INFO: renamed from: g */
    public final int f6604g;

    /* JADX INFO: renamed from: h */
    public final int[] f6605h;

    /* JADX INFO: renamed from: i */
    public final int[] f6606i;

    /* JADX INFO: renamed from: j */
    public final Timeline[] f6607j;

    /* JADX INFO: renamed from: k */
    public final Object[] f6608k;

    /* JADX INFO: renamed from: l */
    public final HashMap<Object, Integer> f6609l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistTimeline(Collection<? extends MediaSourceInfoHolder> collection, ShuffleOrder shuffleOrder) {
        super(false, shuffleOrder);
        int iMo3356p = 0;
        int size = collection.size();
        this.f6605h = new int[size];
        this.f6606i = new int[size];
        this.f6607j = new Timeline[size];
        this.f6608k = new Object[size];
        this.f6609l = new HashMap<>();
        int iMo3355i = 0;
        int i = 0;
        for (MediaSourceInfoHolder mediaSourceInfoHolder : collection) {
            this.f6607j[i] = mediaSourceInfoHolder.mo3382b();
            this.f6606i[i] = iMo3356p;
            this.f6605h[i] = iMo3355i;
            iMo3356p += this.f6607j[i].mo3356p();
            iMo3355i += this.f6607j[i].mo3355i();
            this.f6608k[i] = mediaSourceInfoHolder.mo3381a();
            this.f6609l.put(this.f6608k[i], Integer.valueOf(i));
            i++;
        }
        this.f6603f = iMo3356p;
        this.f6604g = iMo3355i;
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: i */
    public int mo3355i() {
        return this.f6604g;
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: p */
    public int mo3356p() {
        return this.f6603f;
    }

    @Override // p007c.p190n.p194b.p209b.AbstractConcatenatedTimeline
    /* JADX INFO: renamed from: r */
    public int mo3357r(Object obj) {
        Integer num = this.f6609l.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // p007c.p190n.p194b.p209b.AbstractConcatenatedTimeline
    /* JADX INFO: renamed from: s */
    public int mo3358s(int i) {
        return Util6.m3117e(this.f6605h, i + 1, false, false);
    }

    @Override // p007c.p190n.p194b.p209b.AbstractConcatenatedTimeline
    /* JADX INFO: renamed from: t */
    public int mo3359t(int i) {
        return Util6.m3117e(this.f6606i, i + 1, false, false);
    }

    @Override // p007c.p190n.p194b.p209b.AbstractConcatenatedTimeline
    /* JADX INFO: renamed from: u */
    public Object mo3360u(int i) {
        return this.f6608k[i];
    }

    @Override // p007c.p190n.p194b.p209b.AbstractConcatenatedTimeline
    /* JADX INFO: renamed from: v */
    public int mo3361v(int i) {
        return this.f6605h[i];
    }

    @Override // p007c.p190n.p194b.p209b.AbstractConcatenatedTimeline
    /* JADX INFO: renamed from: w */
    public int mo3362w(int i) {
        return this.f6606i[i];
    }

    @Override // p007c.p190n.p194b.p209b.AbstractConcatenatedTimeline
    /* JADX INFO: renamed from: z */
    public Timeline mo3363z(int i) {
        return this.f6607j[i];
    }
}
