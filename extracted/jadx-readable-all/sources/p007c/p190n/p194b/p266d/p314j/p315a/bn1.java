package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bn1 {

    /* JADX INFO: renamed from: a */
    public final Executor f12748a;

    /* JADX INFO: renamed from: b */
    public final C3665wn f12749b;

    public bn1(Executor executor, C3665wn c3665wn) {
        this.f12748a = executor;
        this.f12749b = c3665wn;
    }

    /* JADX INFO: renamed from: a */
    public final void m6064a(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            m6065b(it.next());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6065b(String str) {
        this.f12748a.execute(new an1(this, str));
    }
}
