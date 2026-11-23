package p636z0.p667e.p676b;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.Objects;
import java.util.concurrent.Executor;
import p636z0.p667e.p676b.p677v1.ImageReaderProxy;
import p636z0.p667e.p676b.p677v1.p678r1.MainThreadAsyncHandler;

/* JADX INFO: renamed from: z0.e.b.j0, reason: use source file name */
/* JADX INFO: compiled from: AndroidImageReaderProxy.java */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidImageReaderProxy implements ImageReaderProxy {

    /* JADX INFO: renamed from: a */
    public final ImageReader f35915a;

    public AndroidImageReaderProxy(ImageReader imageReader) {
        this.f35915a = imageReader;
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    /* JADX INFO: renamed from: a */
    public synchronized Surface mo15266a() {
        return this.f35915a.getSurface();
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    /* JADX INFO: renamed from: c */
    public synchronized ImageProxy mo15267c() {
        Image imageAcquireLatestImage;
        try {
            imageAcquireLatestImage = this.f35915a.acquireLatestImage();
        } catch (RuntimeException e) {
            if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                throw e;
            }
            imageAcquireLatestImage = null;
        }
        if (imageAcquireLatestImage == null) {
            return null;
        }
        return new AndroidImageProxy(imageAcquireLatestImage);
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    public synchronized void close() {
        this.f35915a.close();
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    /* JADX INFO: renamed from: d */
    public synchronized void mo15268d() {
        this.f35915a.setOnImageAvailableListener(null, null);
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    /* JADX INFO: renamed from: e */
    public synchronized int mo15269e() {
        return this.f35915a.getMaxImages();
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    /* JADX INFO: renamed from: f */
    public synchronized ImageProxy mo15270f() {
        Image imageAcquireNextImage;
        try {
            imageAcquireNextImage = this.f35915a.acquireNextImage();
        } catch (RuntimeException e) {
            if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                throw e;
            }
            imageAcquireNextImage = null;
        }
        if (imageAcquireNextImage == null) {
            return null;
        }
        return new AndroidImageProxy(imageAcquireNextImage);
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageReaderProxy
    /* JADX INFO: renamed from: g */
    public synchronized void mo15271g(final ImageReaderProxy.a aVar, final Executor executor) {
        this.f35915a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: z0.e.b.b
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                final AndroidImageReaderProxy androidImageReaderProxy = this.f35866a;
                Executor executor2 = executor;
                final ImageReaderProxy.a aVar2 = aVar;
                Objects.requireNonNull(androidImageReaderProxy);
                executor2.execute(new Runnable() { // from class: z0.e.b.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidImageReaderProxy androidImageReaderProxy2 = androidImageReaderProxy;
                        ImageReaderProxy.a aVar3 = aVar2;
                        Objects.requireNonNull(androidImageReaderProxy2);
                        aVar3.mo15254a(androidImageReaderProxy2);
                    }
                });
            }
        }, MainThreadAsyncHandler.m15419a());
    }
}
