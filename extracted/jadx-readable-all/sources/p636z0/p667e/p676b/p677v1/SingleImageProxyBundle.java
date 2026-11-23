package p636z0.p667e.p676b.p677v1;

import p636z0.p667e.p676b.ImageInfo;
import p636z0.p667e.p676b.ImageProxy;

/* JADX INFO: renamed from: z0.e.b.v1.i1, reason: use source file name */
/* JADX INFO: compiled from: SingleImageProxyBundle.java */
/* JADX INFO: loaded from: classes.dex */
public final class SingleImageProxyBundle {

    /* JADX INFO: renamed from: a */
    public final ImageProxy f36177a;

    public SingleImageProxyBundle(ImageProxy imageProxy, String str) {
        ImageInfo imageInfoMo15262Z = imageProxy.mo15262Z();
        if (imageInfoMo15262Z == null) {
            throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
        }
        Integer num = imageInfoMo15262Z.mo15259a().f36213b.get(str);
        if (num == null) {
            throw new IllegalArgumentException("ImageProxy has no associated tag");
        }
        num.intValue();
        this.f36177a = imageProxy;
    }
}
