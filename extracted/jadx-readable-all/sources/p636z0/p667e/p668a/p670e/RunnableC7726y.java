package p636z0.p667e.p668a.p670e;

import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: renamed from: z0.e.a.e.y */
/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7726y implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CaptureSessionRepository.a f35830f;

    @Override // java.lang.Runnable
    public final void run() {
        CaptureSessionRepository.a aVar = this.f35830f;
        Objects.requireNonNull(aVar);
        LinkedHashSet<SynchronizedCaptureSession> linkedHashSet = new LinkedHashSet();
        synchronized (aVar.f35477a.f35471b) {
            linkedHashSet.addAll(new LinkedHashSet(aVar.f35477a.f35474e));
            linkedHashSet.addAll(new LinkedHashSet(aVar.f35477a.f35472c));
        }
        for (SynchronizedCaptureSession synchronizedCaptureSession : linkedHashSet) {
            synchronizedCaptureSession.mo15146b().mo15092m(synchronizedCaptureSession);
        }
    }
}
