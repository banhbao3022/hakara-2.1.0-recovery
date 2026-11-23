package p007c.p165l.p183m0.p184b;

import p007c.p165l.p178k0.DialogFeature;

/* JADX INFO: renamed from: c.l.m0.b.f, reason: use source file name */
/* JADX INFO: compiled from: MessageDialogFeature.java */
/* JADX INFO: loaded from: classes.dex */
public enum MessageDialogFeature implements DialogFeature {
    MESSAGE_DIALOG(20140204),
    PHOTOS(20140324),
    VIDEO(20141218),
    MESSENGER_GENERIC_TEMPLATE(20171115),
    MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE(20171115),
    MESSENGER_MEDIA_TEMPLATE(20171115);


    /* JADX INFO: renamed from: m */
    public int f5208m;

    MessageDialogFeature(int i) {
        this.f5208m = i;
    }

    @Override // p007c.p165l.p178k0.DialogFeature
    /* JADX INFO: renamed from: f */
    public int mo2470f() {
        return this.f5208m;
    }

    @Override // p007c.p165l.p178k0.DialogFeature
    /* JADX INFO: renamed from: h */
    public String mo2471h() {
        return "com.facebook.platform.action.request.MESSAGE_DIALOG";
    }
}
