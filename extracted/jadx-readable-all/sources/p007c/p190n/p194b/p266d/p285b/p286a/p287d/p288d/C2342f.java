package p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p636z0.p760t.p762b.AsyncTaskLoader;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.d.f */
/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2342f extends AsyncTaskLoader<Void> {

    /* JADX INFO: renamed from: k */
    public Semaphore f10940k;

    /* JADX INFO: renamed from: l */
    public Set<AbstractC2632e> f10941l;

    public C2342f(Context context, Set<AbstractC2632e> set) {
        super(context);
        this.f10940k = new Semaphore(0);
        this.f10941l = set;
    }

    @Override // p636z0.p760t.p762b.Loader2
    /* JADX INFO: renamed from: c */
    public final void mo4921c() {
        this.f10940k.drainPermits();
        m16757g();
    }

    @Override // p636z0.p760t.p762b.AsyncTaskLoader
    /* JADX INFO: renamed from: f */
    public final Void mo4922f() {
        Iterator<AbstractC2632e> it = this.f10941l.iterator();
        if (it.hasNext()) {
            Objects.requireNonNull(it.next());
            throw new UnsupportedOperationException();
        }
        try {
            this.f10940k.tryAcquire(0, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }
}
