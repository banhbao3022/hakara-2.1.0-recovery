package p636z0.p667e.p676b.p677v1;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback;
import p636z0.p693h.p694a.CallbackToFutureAdapter;

/* JADX INFO: renamed from: z0.e.b.v1.m0, reason: use source file name */
/* JADX INFO: compiled from: DeferrableSurfaces.java */
/* JADX INFO: loaded from: classes.dex */
public class DeferrableSurfaces implements FutureCallback<List<Surface>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f36209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter f36210b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ScheduledFuture f36211c;

    public DeferrableSurfaces(boolean z, CallbackToFutureAdapter callbackToFutureAdapter, ScheduledFuture scheduledFuture) {
        this.f36209a = z;
        this.f36210b = callbackToFutureAdapter;
        this.f36211c = scheduledFuture;
    }

    @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
    /* JADX INFO: renamed from: a */
    public void mo15090a(List<Surface> list) {
        ArrayList arrayList = new ArrayList(list);
        if (this.f36209a) {
            arrayList.removeAll(Collections.singleton(null));
        }
        this.f36210b.m15659a(arrayList);
        this.f36211c.cancel(true);
    }

    @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
    /* JADX INFO: renamed from: b */
    public void mo15091b(Throwable th) {
        this.f36210b.m15659a(Collections.unmodifiableList(Collections.emptyList()));
        this.f36211c.cancel(true);
    }
}
