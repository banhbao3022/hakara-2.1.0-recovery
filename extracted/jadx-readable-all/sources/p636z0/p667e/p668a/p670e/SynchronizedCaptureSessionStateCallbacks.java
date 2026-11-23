package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: z0.e.a.e.s1, reason: use source file name */
/* JADX INFO: compiled from: SynchronizedCaptureSessionStateCallbacks.java */
/* JADX INFO: loaded from: classes.dex */
public final class SynchronizedCaptureSessionStateCallbacks extends SynchronizedCaptureSession.a {

    /* JADX INFO: renamed from: a */
    public final List<SynchronizedCaptureSession.a> f35677a;

    /* JADX INFO: renamed from: z0.e.a.e.s1$a */
    /* JADX INFO: compiled from: SynchronizedCaptureSessionStateCallbacks.java */
    public static class a extends SynchronizedCaptureSession.a {

        /* JADX INFO: renamed from: a */
        public final CameraCaptureSession.StateCallback f35678a;

        public a(List<CameraCaptureSession.StateCallback> list) {
            this.f35678a = list.isEmpty() ? new CameraCaptureSessionStateCallbacks2() : list.size() == 1 ? list.get(0) : new CameraCaptureSessionStateCallbacks(list);
        }

        @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
        /* JADX INFO: renamed from: k */
        public void mo15154k(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f35678a.onActive(synchronizedCaptureSession.mo15148d().m15206a());
        }

        @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
        /* JADX INFO: renamed from: l */
        public void mo15155l(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f35678a.onCaptureQueueEmpty(synchronizedCaptureSession.mo15148d().m15206a());
        }

        @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
        /* JADX INFO: renamed from: m */
        public void mo15092m(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f35678a.onClosed(synchronizedCaptureSession.mo15148d().m15206a());
        }

        @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
        /* JADX INFO: renamed from: n */
        public void mo15093n(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f35678a.onConfigureFailed(synchronizedCaptureSession.mo15148d().m15206a());
        }

        @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
        /* JADX INFO: renamed from: o */
        public void mo15094o(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f35678a.onConfigured(synchronizedCaptureSession.mo15148d().m15206a());
        }

        @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
        /* JADX INFO: renamed from: p */
        public void mo15095p(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f35678a.onReady(synchronizedCaptureSession.mo15148d().m15206a());
        }

        @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
        /* JADX INFO: renamed from: q */
        public void mo15156q(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
            this.f35678a.onSurfacePrepared(synchronizedCaptureSession.mo15148d().m15206a(), surface);
        }
    }

    public SynchronizedCaptureSessionStateCallbacks(List<SynchronizedCaptureSession.a> list) {
        ArrayList arrayList = new ArrayList();
        this.f35677a = arrayList;
        arrayList.addAll(list);
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
    /* JADX INFO: renamed from: k */
    public void mo15154k(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator<SynchronizedCaptureSession.a> it = this.f35677a.iterator();
        while (it.hasNext()) {
            it.next().mo15154k(synchronizedCaptureSession);
        }
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
    /* JADX INFO: renamed from: l */
    public void mo15155l(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator<SynchronizedCaptureSession.a> it = this.f35677a.iterator();
        while (it.hasNext()) {
            it.next().mo15155l(synchronizedCaptureSession);
        }
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
    /* JADX INFO: renamed from: m */
    public void mo15092m(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator<SynchronizedCaptureSession.a> it = this.f35677a.iterator();
        while (it.hasNext()) {
            it.next().mo15092m(synchronizedCaptureSession);
        }
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
    /* JADX INFO: renamed from: n */
    public void mo15093n(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator<SynchronizedCaptureSession.a> it = this.f35677a.iterator();
        while (it.hasNext()) {
            it.next().mo15093n(synchronizedCaptureSession);
        }
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
    /* JADX INFO: renamed from: o */
    public void mo15094o(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator<SynchronizedCaptureSession.a> it = this.f35677a.iterator();
        while (it.hasNext()) {
            it.next().mo15094o(synchronizedCaptureSession);
        }
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
    /* JADX INFO: renamed from: p */
    public void mo15095p(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator<SynchronizedCaptureSession.a> it = this.f35677a.iterator();
        while (it.hasNext()) {
            it.next().mo15095p(synchronizedCaptureSession);
        }
    }

    @Override // p636z0.p667e.p668a.p670e.SynchronizedCaptureSession.a
    /* JADX INFO: renamed from: q */
    public void mo15156q(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        Iterator<SynchronizedCaptureSession.a> it = this.f35677a.iterator();
        while (it.hasNext()) {
            it.next().mo15156q(synchronizedCaptureSession, surface);
        }
    }
}
