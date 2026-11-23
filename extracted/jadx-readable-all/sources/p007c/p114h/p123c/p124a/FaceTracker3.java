package p007c.p114h.p123c.p124a;

import android.util.SparseArray;
import p007c.p114h.p115a.p119d.CameraPreviewPresenter;
import p007c.p114h.p123c.p125b.FaceTrackerCallback;
import p007c.p114h.p144e.LandmarkEngine;
import p007c.p114h.p144e.OneFace;

/* JADX INFO: renamed from: c.h.c.a.d, reason: use source file name */
/* JADX INFO: compiled from: FaceTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class FaceTracker3 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ byte[] f3975f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3976g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3977h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ FaceTracker.c f3978i;

    public FaceTracker3(FaceTracker.c cVar, byte[] bArr, int i, int i2) {
        this.f3978i = cVar;
        this.f3975f = bArr;
        this.f3976g = i;
        this.f3977h = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f3978i) {
            FaceTrackParam faceTrackParam = FaceTrackParam.b.f3962a;
            LandmarkEngine landmarkEngine = LandmarkEngine.b.f4266a;
            synchronized (landmarkEngine.f4264a) {
                if (landmarkEngine.f4265b.size() > 0) {
                    SparseArray<OneFace> sparseArray = landmarkEngine.f4265b;
                    sparseArray.removeAtRange(0, sparseArray.size() - 0);
                }
            }
            FaceTrackerCallback faceTrackerCallback = faceTrackParam.f3961a;
            if (faceTrackerCallback != null) {
                ((CameraPreviewPresenter) faceTrackerCallback).f3907r.m2087d().sendEmptyMessage(4);
            }
        }
    }
}
