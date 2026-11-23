package p007c.p165l.p183m0.p184b;

import p007c.p165l.p178k0.DialogFeature;

/* JADX INFO: renamed from: c.l.m0.b.a, reason: use source file name */
/* JADX INFO: compiled from: CameraEffectFeature.java */
/* JADX INFO: loaded from: classes.dex */
public enum CameraEffectFeature implements DialogFeature {
    SHARE_CAMERA_EFFECT(20170417);


    /* JADX INFO: renamed from: h */
    public int f5187h;

    CameraEffectFeature(int i) {
        this.f5187h = i;
    }

    @Override // p007c.p165l.p178k0.DialogFeature
    /* JADX INFO: renamed from: f */
    public int mo2470f() {
        return this.f5187h;
    }

    @Override // p007c.p165l.p178k0.DialogFeature
    /* JADX INFO: renamed from: h */
    public String mo2471h() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }
}
