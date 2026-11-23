package p007c.p165l.p183m0.p184b;

import p007c.p165l.p178k0.DialogFeature;

/* JADX INFO: renamed from: c.l.m0.b.v, reason: use source file name */
/* JADX INFO: compiled from: ShareStoryFeature.java */
/* JADX INFO: loaded from: classes.dex */
public enum ShareStoryFeature implements DialogFeature {
    SHARE_STORY_ASSET(20170417);


    /* JADX INFO: renamed from: h */
    public int f5247h;

    ShareStoryFeature(int i) {
        this.f5247h = i;
    }

    @Override // p007c.p165l.p178k0.DialogFeature
    /* JADX INFO: renamed from: f */
    public int mo2470f() {
        return this.f5247h;
    }

    @Override // p007c.p165l.p178k0.DialogFeature
    /* JADX INFO: renamed from: h */
    public String mo2471h() {
        return "com.facebook.platform.action.request.SHARE_STORY";
    }
}
