package p007c.p165l.p183m0.p184b;

import p007c.p165l.p178k0.DialogFeature;

/* JADX INFO: renamed from: c.l.m0.b.i, reason: use source file name */
/* JADX INFO: compiled from: OpenGraphActionDialogFeature.java */
/* JADX INFO: loaded from: classes.dex */
public enum OpenGraphActionDialogFeature implements DialogFeature {
    OG_ACTION_DIALOG(20130618);


    /* JADX INFO: renamed from: h */
    public int f5212h;

    OpenGraphActionDialogFeature(int i) {
        this.f5212h = i;
    }

    @Override // p007c.p165l.p178k0.DialogFeature
    /* JADX INFO: renamed from: f */
    public int mo2470f() {
        return this.f5212h;
    }

    @Override // p007c.p165l.p178k0.DialogFeature
    /* JADX INFO: renamed from: h */
    public String mo2471h() {
        return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    }
}
