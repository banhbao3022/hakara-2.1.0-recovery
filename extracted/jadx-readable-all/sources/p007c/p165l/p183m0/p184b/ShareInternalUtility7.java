package p007c.p165l.p183m0.p184b;

import java.util.UUID;
import p007c.p165l.p178k0.NativeAppCallAttachmentStore;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p183m0.p185c.SharePhoto;

/* JADX INFO: renamed from: c.l.m0.b.u, reason: use source file name */
/* JADX INFO: compiled from: ShareInternalUtility.java */
/* JADX INFO: loaded from: classes.dex */
public final class ShareInternalUtility7 implements Utility.c<SharePhoto, NativeAppCallAttachmentStore.b> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UUID f5244a;

    public ShareInternalUtility7(UUID uuid) {
        this.f5244a = uuid;
    }

    @Override // p007c.p165l.p178k0.Utility.c
    public NativeAppCallAttachmentStore.b apply(SharePhoto sharePhoto) {
        return ShareInternalUtility4.m2633a(this.f5244a, sharePhoto);
    }
}
