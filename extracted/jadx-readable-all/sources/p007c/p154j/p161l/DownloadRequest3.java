package p007c.p154j.p161l;

import java.util.Objects;

/* JADX INFO: renamed from: c.j.l.c, reason: use source file name */
/* JADX INFO: compiled from: DownloadRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class DownloadRequest3 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DownloadRequest f4477f;

    public DownloadRequest3(DownloadRequest downloadRequest) {
        this.f4477f = downloadRequest;
    }

    @Override // java.lang.Runnable
    public void run() {
        Objects.requireNonNull(this.f4477f);
    }
}
