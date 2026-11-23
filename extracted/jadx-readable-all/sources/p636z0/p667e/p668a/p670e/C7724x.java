package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: renamed from: z0.e.a.e.x */
/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7724x implements CameraBurstCaptureCallback.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CaptureSession f35828a;

    /* JADX INFO: renamed from: a */
    public final void m15241a(CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        CaptureSession captureSession = this.f35828a;
        synchronized (captureSession.f35442a) {
            if (captureSession.f35453l == CaptureSession.c.f35462j) {
                captureSession.m15086f();
            }
        }
    }
}
