package p007c.p154j.p161l;

import p007c.p154j.OnDownloadListener;

/* JADX INFO: renamed from: c.j.l.b, reason: use source file name */
/* JADX INFO: compiled from: DownloadRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class DownloadRequest2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DownloadRequest f4476f;

    public DownloadRequest2(DownloadRequest downloadRequest) {
        this.f4476f = downloadRequest;
    }

    @Override // java.lang.Runnable
    public void run() {
        OnDownloadListener onDownloadListener = this.f4476f.f4469m;
        if (onDownloadListener != null) {
            onDownloadListener.mo2221a();
        }
        DownloadRequest.m2241a(this.f4476f);
    }
}
