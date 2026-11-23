package p007c.p114h.p115a.p116a;

import android.annotation.SuppressLint;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p114h.p115a.p119d.CameraPreviewPresenter;
import p007c.p114h.p123c.p124a.FaceTracker;
import p007c.p114h.p123c.p124a.FaceTracker3;
import p636z0.p667e.p676b.ImageAnalysis;
import p636z0.p667e.p676b.ImageProxy;

/* JADX INFO: renamed from: c.h.a.a.k, reason: use source file name */
/* JADX INFO: compiled from: PreviewCallbackAnalyzer.java */
/* JADX INFO: loaded from: classes.dex */
public class PreviewCallbackAnalyzer implements ImageAnalysis.a {

    /* JADX INFO: renamed from: a */
    public PreviewCallback f3862a;

    public PreviewCallbackAnalyzer(PreviewCallback previewCallback) {
        this.f3862a = previewCallback;
    }

    @Override // p636z0.p667e.p676b.ImageAnalysis.a
    @SuppressLint({"UnsafeExperimentalUsageError"})
    /* JADX INFO: renamed from: a */
    public void mo2064a(ImageProxy imageProxy) {
        int i;
        System.currentTimeMillis();
        if (this.f3862a != null && imageProxy.mo15263j0() != null) {
            Image imageMo15263j0 = imageProxy.mo15263j0();
            int format = imageMo15263j0.getFormat();
            int i2 = 1;
            if (!(format == 17 || format == 35 || format == 842094169)) {
                StringBuilder sbM1556G = outline.m1556G("can't convert Image to byte array, format ");
                sbM1556G.append(imageMo15263j0.getFormat());
                throw new RuntimeException(sbM1556G.toString());
            }
            Rect cropRect = imageMo15263j0.getCropRect();
            int format2 = imageMo15263j0.getFormat();
            int iWidth = cropRect.width();
            int iHeight = cropRect.height();
            Image.Plane[] planes = imageMo15263j0.getPlanes();
            int i3 = iWidth * iHeight;
            byte[] bArr = new byte[(ImageFormat.getBitsPerPixel(format2) * i3) / 8];
            byte[] bArr2 = new byte[planes[0].getRowStride()];
            int i4 = 0;
            int i5 = 0;
            int i6 = 1;
            while (i4 < planes.length) {
                if (i4 != 0) {
                    if (i4 == i2) {
                        i5 = i3 + 1;
                    } else if (i4 == 2) {
                        i5 = i3;
                    }
                    i6 = 2;
                } else {
                    i5 = 0;
                    i6 = 1;
                }
                ByteBuffer buffer = planes[i4].getBuffer();
                int rowStride = planes[i4].getRowStride();
                int pixelStride = planes[i4].getPixelStride();
                int i7 = i4 == 0 ? 0 : 1;
                int i8 = iWidth >> i7;
                Image.Plane[] planeArr = planes;
                int i9 = iHeight >> i7;
                int i10 = iWidth;
                int i11 = iHeight;
                buffer.position(((cropRect.left >> i7) * pixelStride) + ((cropRect.top >> i7) * rowStride));
                for (int i12 = 0; i12 < i9; i12++) {
                    if (pixelStride == 1 && i6 == 1) {
                        buffer.get(bArr, i5, i8);
                        i5 += i8;
                        i = i8;
                    } else {
                        i = ((i8 - 1) * pixelStride) + 1;
                        buffer.get(bArr2, 0, i);
                        for (int i13 = 0; i13 < i8; i13++) {
                            bArr[i5] = bArr2[i13 * pixelStride];
                            i5 += i6;
                        }
                    }
                    if (i12 < i9 - 1) {
                        buffer.position((buffer.position() + rowStride) - i);
                    }
                }
                i4++;
                i2 = 1;
                planes = planeArr;
                iWidth = i10;
                iHeight = i11;
            }
            CameraPreviewPresenter cameraPreviewPresenter = (CameraPreviewPresenter) this.f3862a;
            Objects.requireNonNull(cameraPreviewPresenter);
            FaceTracker faceTracker = FaceTracker.b.f3965a;
            int iM2063c = ((CameraXController) cameraPreviewPresenter.f3906q).m2063c();
            int iM2062b = ((CameraXController) cameraPreviewPresenter.f3906q).m2062b();
            synchronized (faceTracker.f3963a) {
                FaceTracker.c cVar = faceTracker.f3964b;
                if (cVar != null) {
                    cVar.m2115a();
                    cVar.f3969i.post(new FaceTracker3(cVar, bArr, iM2063c, iM2062b));
                }
            }
        }
        imageProxy.close();
    }
}
