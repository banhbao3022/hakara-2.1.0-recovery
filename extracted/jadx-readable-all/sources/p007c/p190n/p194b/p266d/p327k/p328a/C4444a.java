package p007c.p190n.p194b.p266d.p327k.p328a;

import android.os.BadParcelableException;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p314j.p325k.C4122d0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4136e0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4177h;
import p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4464b6;

/* JADX INFO: renamed from: c.n.b.d.k.a.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C4444a {

    /* JADX INFO: renamed from: a */
    public final C4177h f23687a;

    /* JADX INFO: renamed from: c.n.b.d.k.a.a$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
    public interface a extends InterfaceC4464b6 {
    }

    public C4444a(C4177h c4177h) {
        this.f23687a = c4177h;
    }

    /* JADX INFO: renamed from: a */
    public void m10370a(a aVar) {
        C4177h c4177h = this.f23687a;
        Objects.requireNonNull(c4177h);
        synchronized (c4177h.f23200g) {
            for (int i = 0; i < c4177h.f23200g.size(); i++) {
                if (aVar.equals(c4177h.f23200g.get(i).first)) {
                    Log.w(c4177h.f23196c, "OnEventListener already registered.");
                    return;
                }
            }
            C4177h.c cVar = new C4177h.c(aVar);
            c4177h.f23200g.add(new Pair<>(aVar, cVar));
            if (c4177h.f23204k != null) {
                try {
                    c4177h.f23204k.registerOnMeasurementEventListener(cVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(c4177h.f23196c, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            c4177h.f23198e.execute(new C4122d0(c4177h, cVar));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m10371b(String str, String str2, Object obj) {
        C4177h c4177h = this.f23687a;
        Objects.requireNonNull(c4177h);
        c4177h.f23198e.execute(new C4136e0(c4177h, str, str2, obj, true));
    }
}
