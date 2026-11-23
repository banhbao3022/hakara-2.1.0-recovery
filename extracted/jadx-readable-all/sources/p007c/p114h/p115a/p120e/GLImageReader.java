package p007c.p114h.p115a.p120e;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageReader;
import android.opengl.EGLContext;
import android.os.Environment;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p114h.p115a.p118c.OnCaptureListener;
import p007c.p114h.p115a.p119d.CameraPreviewPresenter;
import p007c.p114h.p126d.p128b.EglCore;
import p007c.p114h.p126d.p128b.WindowSurface;
import p007c.p114h.p126d.p129c.p130a.GLImageFilter;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;
import p007c.p114h.p126d.p129c.p143i.TextureRotationUtils;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: c.h.a.e.f, reason: use source file name */
/* JADX INFO: compiled from: GLImageReader.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageReader {

    /* JADX INFO: renamed from: a */
    public WindowSurface f3934a;

    /* JADX INFO: renamed from: b */
    public EglCore f3935b;

    /* JADX INFO: renamed from: c */
    public ImageReader f3936c;

    /* JADX INFO: renamed from: d */
    public b f3937d;

    /* JADX INFO: renamed from: e */
    public GLImageFilter f3938e;

    /* JADX INFO: renamed from: f */
    public FloatBuffer f3939f = OpenGLUtils.m2178c(TextureRotationUtils.f4260a);

    /* JADX INFO: renamed from: g */
    public FloatBuffer f3940g = OpenGLUtils.m2178c(TextureRotationUtils.f4261b);

    /* JADX INFO: renamed from: c.h.a.e.f$a */
    /* JADX INFO: compiled from: GLImageReader.java */
    public class a implements ImageReader.OnImageAvailableListener {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [android.graphics.Bitmap] */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13, types: [java.io.BufferedOutputStream] */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v22 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6, types: [java.io.BufferedOutputStream] */
        /* JADX WARN: Type inference failed for: r3v7, types: [java.io.BufferedOutputStream, java.io.OutputStream] */
        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) throws Throwable {
            ?? bufferedOutputStream;
            File parentFile;
            if (GLImageReader.this.f3937d == null) {
                return;
            }
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            Image.Plane[] planes = imageAcquireNextImage.getPlanes();
            int width = imageAcquireNextImage.getWidth();
            int height = imageAcquireNextImage.getHeight();
            int pixelStride = planes[0].getPixelStride();
            int rowStride = planes[0].getRowStride();
            int i = rowStride - (pixelStride * width);
            byte[] bArr = new byte[rowStride * height];
            planes[0].getBuffer().get(bArr);
            int[] iArr = new int[width * height];
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < height; i4++) {
                int i5 = 0;
                while (i5 < width) {
                    iArr[i3] = ((bArr[i2] & 255) << 16) | 0 | ((bArr[i2 + 1] & 255) << 8) | (bArr[i2 + 2] & 255) | ((bArr[i2 + 3] & 255) << 24);
                    i2 += pixelStride;
                    i5++;
                    i3++;
                }
                i2 += i;
            }
            ?? CreateBitmap = Bitmap.createBitmap(iArr, width, height, Bitmap.Config.ARGB_8888);
            imageAcquireNextImage.close();
            OnCaptureListener onCaptureListener = ((C0858a) GLImageReader.this.f3937d).f3909a.f3928t.f3845e;
            if (onCaptureListener != null) {
                CameraPreviewPresenter cameraPreviewPresenter = (CameraPreviewPresenter) onCaptureListener;
                FragmentActivity fragmentActivity = cameraPreviewPresenter.f3893d;
                StringBuilder sbM1556G = outline.m1556G("mounted".equals(Environment.getExternalStorageState()) ? fragmentActivity.getExternalCacheDir().getAbsolutePath() : fragmentActivity.getCacheDir().getAbsolutePath());
                sbM1556G.append(File.separator);
                sbM1556G.append("HakaraCamera_");
                sbM1556G.append(System.currentTimeMillis());
                sbM1556G.append(".jpeg");
                String string = sbM1556G.toString();
                File file = new File(string);
                boolean zExists = file.getParentFile().exists();
                ?? r2 = file;
                if (!zExists) {
                    parentFile = file.getParentFile();
                    parentFile.mkdirs();
                }
                if (CreateBitmap != 0) {
                    r2 = parentFile;
                    r2 = 0;
                    r2 = 0;
                    r2 = 0;
                    try {
                        try {
                            try {
                                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(string));
                                try {
                                    r2 = 100;
                                    CreateBitmap.compress(Bitmap.CompressFormat.JPEG, 100, bufferedOutputStream);
                                    CreateBitmap.recycle();
                                    bufferedOutputStream.close();
                                } catch (FileNotFoundException e) {
                                    e = e;
                                    r2 = bufferedOutputStream;
                                    e.printStackTrace();
                                    if (r2 != 0) {
                                        r2.close();
                                        r2 = r2;
                                    }
                                    r2 = parentFile;
                                    Objects.requireNonNull(cameraPreviewPresenter.f3892c);
                                } catch (Throwable th) {
                                    th = th;
                                    if (bufferedOutputStream != 0) {
                                        try {
                                            bufferedOutputStream.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                            }
                        } catch (FileNotFoundException e2) {
                            e = e2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream = r2;
                    }
                }
                r2 = parentFile;
                Objects.requireNonNull(cameraPreviewPresenter.f3892c);
            }
        }
    }

    /* JADX INFO: renamed from: c.h.a.e.f$b */
    /* JADX INFO: compiled from: GLImageReader.java */
    public interface b {
    }

    public GLImageReader(EGLContext eGLContext, b bVar) {
        this.f3937d = bVar;
        this.f3935b = new EglCore(eGLContext, 1);
    }

    /* JADX INFO: renamed from: a */
    public void m2092a(int i, int i2) {
        if (this.f3936c == null) {
            ImageReader imageReaderNewInstance = ImageReader.newInstance(i, i2, 1, 1);
            this.f3936c = imageReaderNewInstance;
            imageReaderNewInstance.setOnImageAvailableListener(new a(), null);
            this.f3934a = new WindowSurface(this.f3935b, this.f3936c.getSurface(), true);
        }
        if (this.f3938e == null) {
            GLImageFilter gLImageFilter = new GLImageFilter(null);
            this.f3938e = gLImageFilter;
            gLImageFilter.mo2135n(i, i2);
            this.f3938e.mo2133i(i, i2);
        }
    }
}
