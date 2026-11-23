package p007c.p190n.p194b.p209b.p210a2;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.a2.g, reason: use source file name */
/* JADX INFO: compiled from: BaseDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseDataSource implements DataSource3 {

    /* JADX INFO: renamed from: a */
    public final boolean f6000a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<TransferListener> f6001b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c */
    public int f6002c;

    /* JADX INFO: renamed from: d */
    public DataSpec f6003d;

    public BaseDataSource(boolean z) {
        this.f6000a = z;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: c */
    public final void mo2915c(TransferListener transferListener) {
        Objects.requireNonNull(transferListener);
        if (this.f6001b.contains(transferListener)) {
            return;
        }
        this.f6001b.add(transferListener);
        this.f6002c++;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: j */
    public /* synthetic */ Map mo2916j() {
        return DataSource2.m2999a(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m2922q(int i) {
        DataSpec dataSpec = this.f6003d;
        int i2 = Util6.f6307a;
        for (int i3 = 0; i3 < this.f6002c; i3++) {
            this.f6001b.get(i3).mo2928f(this, dataSpec, this.f6000a, i);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2923r() {
        DataSpec dataSpec = this.f6003d;
        int i = Util6.f6307a;
        for (int i2 = 0; i2 < this.f6002c; i2++) {
            this.f6001b.get(i2).mo2926a(this, dataSpec, this.f6000a);
        }
        this.f6003d = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m2924s(DataSpec dataSpec) {
        for (int i = 0; i < this.f6002c; i++) {
            this.f6001b.get(i).mo2929h(this, dataSpec, this.f6000a);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2925t(DataSpec dataSpec) {
        this.f6003d = dataSpec;
        for (int i = 0; i < this.f6002c; i++) {
            this.f6001b.get(i).mo2927b(this, dataSpec, this.f6000a);
        }
    }
}
