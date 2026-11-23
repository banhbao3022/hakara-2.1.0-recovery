package p007c.p154j.p155g;

import java.util.concurrent.FutureTask;
import p007c.p154j.p159k.DownloadRunnable;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: c.j.g.d, reason: use source file name */
/* JADX INFO: compiled from: DownloadFutureTask.java */
/* JADX INFO: loaded from: classes.dex */
public class DownloadFutureTask extends FutureTask<DownloadRunnable> implements Comparable<DownloadFutureTask> {

    /* JADX INFO: renamed from: f */
    public final DownloadRunnable f4421f;

    public DownloadFutureTask(DownloadRunnable downloadRunnable) {
        super(downloadRunnable, null);
        this.f4421f = downloadRunnable;
    }

    @Override // java.lang.Comparable
    public int compareTo(DownloadFutureTask downloadFutureTask) {
        DownloadRunnable downloadRunnable = this.f4421f;
        int i = downloadRunnable.f4439f;
        DownloadRunnable downloadRunnable2 = downloadFutureTask.f4421f;
        int i2 = downloadRunnable2.f4439f;
        return i == i2 ? downloadRunnable.f4440g - downloadRunnable2.f4440g : C7804v0.m15315d(i2) - C7804v0.m15315d(i);
    }
}
