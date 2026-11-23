package p007c.p154j.p159k;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;
import p007c.p008a.p009a.p010a.C0244f;
import p007c.p154j.Progress;
import p007c.p154j.p156h.DownloadModel;
import p007c.p154j.p156h.NoOpsDbHelper;
import p007c.p154j.p157i.ProgressHandler;
import p007c.p154j.p158j.DefaultHttpClient;
import p007c.p154j.p158j.HttpClient;
import p007c.p154j.p159k.p160e.FileDownloadRandomAccessFile;
import p007c.p154j.p161l.DownloadRequest;

/* JADX INFO: renamed from: c.j.k.d, reason: use source file name */
/* JADX INFO: compiled from: DownloadTask.java */
/* JADX INFO: loaded from: classes.dex */
public class DownloadTask {

    /* JADX INFO: renamed from: a */
    public final DownloadRequest f4442a;

    /* JADX INFO: renamed from: b */
    public ProgressHandler f4443b;

    /* JADX INFO: renamed from: c */
    public long f4444c;

    /* JADX INFO: renamed from: d */
    public long f4445d;

    /* JADX INFO: renamed from: e */
    public InputStream f4446e;

    /* JADX INFO: renamed from: f */
    public FileDownloadRandomAccessFile f4447f;

    /* JADX INFO: renamed from: g */
    public HttpClient f4448g;

    /* JADX INFO: renamed from: h */
    public long f4449h;

    /* JADX INFO: renamed from: i */
    public int f4450i;

    /* JADX INFO: renamed from: j */
    public String f4451j;

    /* JADX INFO: renamed from: k */
    public boolean f4452k;

    /* JADX INFO: renamed from: l */
    public String f4453l;

    public DownloadTask(DownloadRequest downloadRequest) {
        this.f4442a = downloadRequest;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2231a(DownloadModel downloadModel) throws IllegalAccessException, IOException {
        if (this.f4450i != 416) {
            String str = this.f4451j;
            return false;
        }
        m2235e();
        DownloadRequest downloadRequest = this.f4442a;
        downloadRequest.f4463g = 0L;
        downloadRequest.f4464h = 0L;
        HttpClient httpClientM2229b = ComponentHolder.f4430a.m2229b();
        this.f4448g = httpClientM2229b;
        ((DefaultHttpClient) httpClientM2229b).m2226a(this.f4442a);
        HttpClient httpClientM1018g = C0244f.m1018g(this.f4448g, this.f4442a);
        this.f4448g = httpClientM1018g;
        this.f4450i = ((DefaultHttpClient) httpClientM1018g).m2227b();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m2232b(FileDownloadRandomAccessFile fileDownloadRandomAccessFile) {
        HttpClient httpClient = this.f4448g;
        if (httpClient != null) {
            try {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        InputStream inputStream = this.f4446e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        if (fileDownloadRandomAccessFile != null) {
            try {
                try {
                    m2239i(fileDownloadRandomAccessFile);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } catch (Throwable th) {
                try {
                    fileDownloadRandomAccessFile.f4454a.close();
                    fileDownloadRandomAccessFile.f4456c.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                throw th;
            }
        }
        if (fileDownloadRandomAccessFile != null) {
            try {
                fileDownloadRandomAccessFile.f4454a.close();
                fileDownloadRandomAccessFile.f4456c.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m2233c(InputStream inputStream) throws Throwable {
        StringBuilder sb = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        } catch (IOException unused) {
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return sb.toString();
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException | NullPointerException unused2) {
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                } catch (IOException | NullPointerException unused3) {
                }
            } catch (IOException unused4) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public final void m2234d() {
        DownloadModel downloadModel = new DownloadModel();
        DownloadRequest downloadRequest = this.f4442a;
        int i = downloadRequest.f4471o;
        downloadModel.f4425a = this.f4451j;
        downloadModel.f4427c = downloadRequest.f4463g;
        downloadModel.f4426b = this.f4449h;
        System.currentTimeMillis();
        Objects.requireNonNull(ComponentHolder.f4430a.m2228a());
    }

    /* JADX INFO: renamed from: e */
    public final void m2235e() {
        File file = new File(this.f4453l);
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: f */
    public final DownloadModel m2236f() {
        NoOpsDbHelper noOpsDbHelperM2228a = ComponentHolder.f4430a.m2228a();
        int i = this.f4442a.f4471o;
        Objects.requireNonNull(noOpsDbHelperM2228a);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m2237g() {
        NoOpsDbHelper noOpsDbHelperM2228a = ComponentHolder.f4430a.m2228a();
        int i = this.f4442a.f4471o;
        Objects.requireNonNull(noOpsDbHelperM2228a);
    }

    /* JADX INFO: renamed from: h */
    public final void m2238h() {
        ProgressHandler progressHandler;
        DownloadRequest downloadRequest = this.f4442a;
        if (downloadRequest.f4472p == 5 || (progressHandler = this.f4443b) == null) {
            return;
        }
        progressHandler.obtainMessage(1, new Progress(downloadRequest.f4463g, this.f4449h)).sendToTarget();
    }

    /* JADX INFO: renamed from: i */
    public final void m2239i(FileDownloadRandomAccessFile fileDownloadRandomAccessFile) {
        boolean z;
        try {
            fileDownloadRandomAccessFile.f4454a.flush();
            fileDownloadRandomAccessFile.f4455b.sync();
            z = true;
        } catch (IOException e) {
            e.printStackTrace();
            z = false;
        }
        if (z && this.f4452k) {
            NoOpsDbHelper noOpsDbHelperM2228a = ComponentHolder.f4430a.m2228a();
            DownloadRequest downloadRequest = this.f4442a;
            int i = downloadRequest.f4471o;
            long j2 = downloadRequest.f4463g;
            System.currentTimeMillis();
            Objects.requireNonNull(noOpsDbHelperM2228a);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2240j(FileDownloadRandomAccessFile fileDownloadRandomAccessFile) {
        long j2 = this.f4442a.f4463g;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j3 = j2 - this.f4445d;
        long j4 = jCurrentTimeMillis - this.f4444c;
        if (j3 <= 65536 || j4 <= 2000) {
            return;
        }
        m2239i(fileDownloadRandomAccessFile);
        this.f4445d = j2;
        this.f4444c = jCurrentTimeMillis;
    }
}
