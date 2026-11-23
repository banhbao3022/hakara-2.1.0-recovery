package p007c.p165l.p183m0.p184b;

import p007c.p165l.p178k0.DialogFeature;

/* JADX INFO: renamed from: c.l.m0.b.m, reason: use source file name */
/* JADX INFO: compiled from: ShareDialogFeature.java */
/* JADX INFO: loaded from: classes.dex */
public enum ShareDialogFeature implements DialogFeature {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);


    /* JADX INFO: renamed from: m */
    public int f5225m;

    ShareDialogFeature(int i) {
        this.f5225m = i;
    }

    @Override // p007c.p165l.p178k0.DialogFeature
    /* JADX INFO: renamed from: f */
    public int mo2470f() {
        return this.f5225m;
    }

    @Override // p007c.p165l.p178k0.DialogFeature
    /* JADX INFO: renamed from: h */
    public String mo2471h() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }
}
