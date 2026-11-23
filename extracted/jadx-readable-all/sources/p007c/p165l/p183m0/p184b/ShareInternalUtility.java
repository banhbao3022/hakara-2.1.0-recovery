package p007c.p165l.p183m0.p184b;

import android.os.Bundle;
import p007c.p165l.p178k0.NativeAppCallAttachmentStore;
import p007c.p165l.p178k0.Utility;

/* JADX INFO: renamed from: c.l.m0.b.o, reason: use source file name */
/* JADX INFO: compiled from: ShareInternalUtility.java */
/* JADX INFO: loaded from: classes.dex */
public final class ShareInternalUtility implements Utility.c<NativeAppCallAttachmentStore.b, Bundle> {
    @Override // p007c.p165l.p178k0.Utility.c
    public Bundle apply(NativeAppCallAttachmentStore.b bVar) {
        NativeAppCallAttachmentStore.b bVar2 = bVar;
        Bundle bundle = new Bundle();
        bundle.putString("uri", bVar2.f5051b);
        String strM2637e = ShareInternalUtility4.m2637e(bVar2.f5054e);
        if (strM2637e != null) {
            Utility.m2434G(bundle, "extension", strM2637e);
        }
        return bundle;
    }
}
