package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class cp2 {

    /* JADX INFO: renamed from: a */
    public final Handler f13077a;

    /* JADX INFO: renamed from: b */
    public final dp2 f13078b;

    public cp2(Handler handler, dp2 dp2Var) {
        Objects.requireNonNull(handler);
        this.f13077a = handler;
        this.f13078b = dp2Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m6221a(int i, int i2, int i3, float f) {
        this.f13077a.post(new yo2(this, i, i2, i3, f));
    }
}
