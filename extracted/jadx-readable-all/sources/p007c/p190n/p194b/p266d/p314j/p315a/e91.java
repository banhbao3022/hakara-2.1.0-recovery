package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class e91 implements ia1<f91> {

    /* JADX INFO: renamed from: a */
    public final lv1 f13531a;

    /* JADX INFO: renamed from: b */
    public final Bundle f13532b;

    public e91(lv1 lv1Var, Bundle bundle) {
        this.f13531a = lv1Var;
        this.f13532b = bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<f91> zza() {
        return this.f13531a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.d91

            /* JADX INFO: renamed from: a */
            public final e91 f13194a;

            {
                this.f13194a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new f91(this.f13194a.f13532b);
            }
        });
    }
}
