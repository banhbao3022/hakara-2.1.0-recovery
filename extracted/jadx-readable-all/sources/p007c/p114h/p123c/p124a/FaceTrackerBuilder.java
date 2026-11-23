package p007c.p114h.p123c.p124a;

import p007c.p114h.p123c.p125b.FaceTrackerCallback;

/* JADX INFO: renamed from: c.h.c.a.e, reason: use source file name */
/* JADX INFO: compiled from: FaceTrackerBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public final class FaceTrackerBuilder {

    /* JADX INFO: renamed from: a */
    public FaceTracker f3979a;

    /* JADX INFO: renamed from: b */
    public FaceTrackParam f3980b;

    public FaceTrackerBuilder(FaceTracker faceTracker, FaceTrackerCallback faceTrackerCallback) {
        this.f3979a = faceTracker;
        FaceTrackParam faceTrackParam = FaceTrackParam.b.f3962a;
        this.f3980b = faceTrackParam;
        faceTrackParam.f3961a = faceTrackerCallback;
    }
}
