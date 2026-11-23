package p636z0.p667e.p676b.p677v1;

import android.view.Surface;
import java.util.concurrent.Executor;
import p636z0.p667e.p676b.ImageProxy;

/* JADX INFO: renamed from: z0.e.b.v1.t0, reason: use source file name */
/* JADX INFO: compiled from: ImageReaderProxy.java */
/* JADX INFO: loaded from: classes.dex */
public interface ImageReaderProxy {

    /* JADX INFO: renamed from: z0.e.b.v1.t0$a */
    /* JADX INFO: compiled from: ImageReaderProxy.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo15254a(ImageReaderProxy imageReaderProxy);
    }

    /* JADX INFO: renamed from: a */
    Surface mo15266a();

    /* JADX INFO: renamed from: c */
    ImageProxy mo15267c();

    void close();

    /* JADX INFO: renamed from: d */
    void mo15268d();

    /* JADX INFO: renamed from: e */
    int mo15269e();

    /* JADX INFO: renamed from: f */
    ImageProxy mo15270f();

    /* JADX INFO: renamed from: g */
    void mo15271g(a aVar, Executor executor);
}
