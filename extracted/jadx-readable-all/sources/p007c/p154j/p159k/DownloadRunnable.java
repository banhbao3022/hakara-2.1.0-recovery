package p007c.p154j.p159k;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import p007c.p008a.p009a.p010a.C0244f;
import p007c.p154j.Error2;
import p007c.p154j.Response2;
import p007c.p154j.p155g.Core2;
import p007c.p154j.p155g.DefaultExecutorSupplier;
import p007c.p154j.p157i.ProgressHandler;
import p007c.p154j.p158j.DefaultHttpClient;
import p007c.p154j.p158j.HttpClient;
import p007c.p154j.p159k.p160e.FileDownloadRandomAccessFile;
import p007c.p154j.p161l.DownloadRequest;
import p007c.p154j.p161l.DownloadRequest2;
import p007c.p154j.p161l.DownloadRequest3;

/* JADX INFO: renamed from: c.j.k.c, reason: use source file name */
/* JADX INFO: compiled from: DownloadRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public class DownloadRunnable implements Runnable {

    /* JADX INFO: renamed from: f */
    public final int f4439f;

    /* JADX INFO: renamed from: g */
    public final int f4440g;

    /* JADX INFO: renamed from: h */
    public final DownloadRequest f4441h;

    public DownloadRunnable(DownloadRequest downloadRequest) {
        this.f4441h = downloadRequest;
        this.f4439f = downloadRequest.f4457a;
        this.f4440g = downloadRequest.f4461e;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j2;
        DownloadRequest downloadRequest = this.f4441h;
        downloadRequest.f4472p = 2;
        DownloadTask downloadTask = new DownloadTask(downloadRequest);
        Response2 response2 = new Response2();
        int i = downloadRequest.f4472p;
        if (i == 5) {
            response2.f4414d = true;
        } else {
            try {
                if (i == 3) {
                    response2.f4413c = true;
                } else {
                    try {
                        if (downloadRequest.f4468l != null) {
                            downloadTask.f4443b = new ProgressHandler(downloadRequest.f4468l);
                        }
                        downloadTask.f4453l = C0244f.m1019h(downloadRequest.f4459c, downloadRequest.f4460d);
                        File file = new File(downloadTask.f4453l);
                        downloadTask.m2236f();
                        HttpClient httpClientM2229b = ComponentHolder.f4430a.m2229b();
                        downloadTask.f4448g = httpClientM2229b;
                        ((DefaultHttpClient) httpClientM2229b).m2226a(downloadRequest);
                        int i2 = downloadRequest.f4472p;
                        if (i2 == 5) {
                            response2.f4414d = true;
                        } else if (i2 == 3) {
                            response2.f4413c = true;
                        } else {
                            HttpClient httpClientM1018g = C0244f.m1018g(downloadTask.f4448g, downloadRequest);
                            downloadTask.f4448g = httpClientM1018g;
                            downloadTask.f4450i = ((DefaultHttpClient) httpClientM1018g).m2227b();
                            downloadTask.f4451j = ((DefaultHttpClient) downloadTask.f4448g).f4429f.getHeaderField("ETag");
                            downloadTask.m2231a(null);
                            int i3 = downloadTask.f4450i;
                            if (i3 >= 200 && i3 < 300) {
                                boolean z = i3 == 206;
                                downloadTask.f4452k = z;
                                downloadTask.f4449h = downloadRequest.f4464h;
                                if (!z) {
                                    downloadTask.m2235e();
                                }
                                if (downloadTask.f4449h == 0) {
                                    try {
                                        j2 = Long.parseLong(((DefaultHttpClient) downloadTask.f4448g).f4429f.getHeaderField(HttpHeaders.CONTENT_LENGTH));
                                    } catch (NumberFormatException unused) {
                                        j2 = -1;
                                    }
                                    downloadTask.f4449h = j2;
                                    downloadTask.f4442a.f4464h = j2;
                                }
                                if (downloadTask.f4452k) {
                                    downloadTask.m2234d();
                                }
                                DownloadRequest downloadRequest2 = downloadTask.f4442a;
                                int i4 = downloadRequest2.f4472p;
                                if (i4 == 5) {
                                    response2.f4414d = true;
                                } else if (i4 == 3) {
                                    response2.f4413c = true;
                                } else {
                                    downloadRequest2.m2243c();
                                    downloadTask.f4446e = ((DefaultHttpClient) downloadTask.f4448g).f4429f.getInputStream();
                                    byte[] bArr = new byte[4096];
                                    if (!file.exists() && (file.getParentFile() == null || file.getParentFile().exists() || file.getParentFile().mkdirs())) {
                                        file.createNewFile();
                                    }
                                    FileDownloadRandomAccessFile fileDownloadRandomAccessFile = new FileDownloadRandomAccessFile(file);
                                    downloadTask.f4447f = fileDownloadRandomAccessFile;
                                    if (downloadTask.f4452k) {
                                        long j3 = downloadTask.f4442a.f4463g;
                                        if (j3 != 0) {
                                            fileDownloadRandomAccessFile.f4456c.seek(j3);
                                        }
                                    }
                                    int i5 = downloadTask.f4442a.f4472p;
                                    if (i5 == 5) {
                                        response2.f4414d = true;
                                    } else if (i5 == 3) {
                                        response2.f4413c = true;
                                    } else {
                                        while (true) {
                                            int i6 = downloadTask.f4446e.read(bArr, 0, 4096);
                                            if (i6 == -1) {
                                                DownloadRequest downloadRequest3 = downloadTask.f4442a;
                                                C0244f.m1024m(downloadTask.f4453l, C0244f.m1017f(downloadRequest3.f4459c, downloadRequest3.f4460d));
                                                response2.f4412b = true;
                                                if (!downloadTask.f4452k) {
                                                    break;
                                                }
                                                downloadTask.m2237g();
                                                break;
                                            }
                                            downloadTask.f4447f.f4454a.write(bArr, 0, i6);
                                            downloadTask.f4442a.f4463g += (long) i6;
                                            downloadTask.m2238h();
                                            downloadTask.m2240j(downloadTask.f4447f);
                                            int i7 = downloadTask.f4442a.f4472p;
                                            if (i7 == 5) {
                                                response2.f4414d = true;
                                                break;
                                            } else if (i7 == 3) {
                                                downloadTask.m2239i(downloadTask.f4447f);
                                                response2.f4413c = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                Error2 error2 = new Error2();
                                URLConnection uRLConnection = ((DefaultHttpClient) downloadTask.f4448g).f4429f;
                                error2.f4407a = downloadTask.m2233c(uRLConnection instanceof HttpURLConnection ? ((HttpURLConnection) uRLConnection).getErrorStream() : null);
                                error2.f4408b = ((DefaultHttpClient) downloadTask.f4448g).f4429f.getHeaderFields();
                                response2.f4411a = error2;
                            }
                        }
                    } catch (IOException | IllegalAccessException unused2) {
                        if (!downloadTask.f4452k) {
                            downloadTask.m2235e();
                        }
                        response2.f4411a = new Error2();
                    }
                }
            } finally {
                downloadTask.m2232b(downloadTask.f4447f);
            }
        }
        if (response2.f4412b) {
            DownloadRequest downloadRequest4 = this.f4441h;
            if (downloadRequest4.f4472p != 5) {
                downloadRequest4.f4472p = 4;
                ((DefaultExecutorSupplier) Core2.m2225a().f4416b).f4420d.execute(new DownloadRequest2(downloadRequest4));
                return;
            }
            return;
        }
        if (response2.f4413c) {
            DownloadRequest downloadRequest5 = this.f4441h;
            if (downloadRequest5.f4472p != 5) {
                ((DefaultExecutorSupplier) Core2.m2225a().f4416b).f4420d.execute(new DownloadRequest3(downloadRequest5));
                return;
            }
            return;
        }
        Error2 error3 = response2.f4411a;
        if (error3 != null) {
            this.f4441h.m2242b(error3);
        } else {
            if (response2.f4414d) {
                return;
            }
            this.f4441h.m2242b(new Error2());
        }
    }
}
