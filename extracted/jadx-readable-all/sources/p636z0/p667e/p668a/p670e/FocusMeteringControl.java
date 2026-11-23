package p636z0.p667e.p668a.p670e;

import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p636z0.p693h.p694a.CallbackToFutureAdapter;

/* JADX INFO: renamed from: z0.e.a.e.j1, reason: use source file name */
/* JADX INFO: compiled from: FocusMeteringControl.java */
/* JADX INFO: loaded from: classes.dex */
public class FocusMeteringControl {

    /* JADX INFO: renamed from: a */
    public final Camera2CameraControlImpl f35501a;

    /* JADX INFO: renamed from: b */
    public final Executor f35502b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f35503c = false;

    /* JADX INFO: renamed from: d */
    public Camera2CameraControlImpl.c f35504d = null;

    /* JADX INFO: renamed from: e */
    public MeteringRectangle[] f35505e = new MeteringRectangle[0];

    /* JADX INFO: renamed from: f */
    public MeteringRectangle[] f35506f = new MeteringRectangle[0];

    /* JADX INFO: renamed from: g */
    public MeteringRectangle[] f35507g = new MeteringRectangle[0];

    /* JADX INFO: renamed from: h */
    public MeteringRectangle[] f35508h = new MeteringRectangle[0];

    /* JADX INFO: renamed from: i */
    public MeteringRectangle[] f35509i = new MeteringRectangle[0];

    /* JADX INFO: renamed from: j */
    public MeteringRectangle[] f35510j = new MeteringRectangle[0];

    /* JADX INFO: renamed from: k */
    public CallbackToFutureAdapter<Void> f35511k = null;

    public FocusMeteringControl(Camera2CameraControlImpl camera2CameraControlImpl, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f35501a = camera2CameraControlImpl;
        this.f35502b = executor;
    }
}
