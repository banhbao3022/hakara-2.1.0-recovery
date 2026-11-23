package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class eb1 implements ia1<fb1> {

    /* JADX INFO: renamed from: a */
    public final Executor f13539a;

    /* JADX INFO: renamed from: b */
    public final String f13540b;

    public eb1(C3701xm c3701xm, Executor executor, String str, PackageInfo packageInfo, int i, byte[] bArr) {
        this.f13539a = executor;
        this.f13540b = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<fb1> zza() {
        return cw0.m6247q(cw0.m6250t(cw0.m6231a(this.f13540b), cb1.f12971a, this.f13539a), Throwable.class, new qu1(this) { // from class: c.n.b.d.j.a.db1

            /* JADX INFO: renamed from: a */
            public final eb1 f13203a;

            {
                this.f13203a = this;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                return cw0.m6231a(new fb1(this.f13203a.f13540b));
            }
        }, this.f13539a);
    }
}
