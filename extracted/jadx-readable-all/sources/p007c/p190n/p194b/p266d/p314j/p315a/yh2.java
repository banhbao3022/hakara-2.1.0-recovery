package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yh2 {

    /* JADX INFO: renamed from: a */
    public final Handler f21886a;

    /* JADX INFO: renamed from: b */
    public final zh2 f21887b;

    public yh2(Handler handler, zh2 zh2Var) {
        Objects.requireNonNull(handler);
        this.f21886a = handler;
        this.f21887b = zh2Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m8795a(ti2 ti2Var) {
        this.f21886a.post(new wh2(this, ti2Var));
    }
}
