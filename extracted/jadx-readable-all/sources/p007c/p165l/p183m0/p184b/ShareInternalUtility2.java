package p007c.p165l.p183m0.p184b;

import android.os.Bundle;
import java.util.List;
import java.util.UUID;
import p007c.p165l.p178k0.NativeAppCallAttachmentStore;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p183m0.p185c.ShareMedia;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: c.l.m0.b.p, reason: use source file name */
/* JADX INFO: compiled from: ShareInternalUtility.java */
/* JADX INFO: loaded from: classes.dex */
public final class ShareInternalUtility2 implements Utility.c<ShareMedia, Bundle> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UUID f5233a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f5234b;

    public ShareInternalUtility2(UUID uuid, List list) {
        this.f5233a = uuid;
        this.f5234b = list;
    }

    @Override // p007c.p165l.p178k0.Utility.c
    public Bundle apply(ShareMedia shareMedia) {
        ShareMedia shareMedia2 = shareMedia;
        NativeAppCallAttachmentStore.b bVarM2633a = ShareInternalUtility4.m2633a(this.f5233a, shareMedia2);
        this.f5234b.add(bVarM2633a);
        Bundle bundle = new Bundle();
        bundle.putString("type", C7804v0.m15324m(shareMedia2.mo2648a()));
        bundle.putString("uri", bVarM2633a.f5051b);
        String strM2637e = ShareInternalUtility4.m2637e(bVarM2633a.f5054e);
        if (strM2637e != null) {
            Utility.m2434G(bundle, "extension", strM2637e);
        }
        return bundle;
    }
}
