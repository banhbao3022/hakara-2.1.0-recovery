package p007c.p154j.p161l;

import com.facebook.stetho.common.Utf8Charset;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Future;
import p007c.p071d.p078c.p079a.outline;
import p007c.p154j.Error2;
import p007c.p154j.OnDownloadListener;
import p007c.p154j.OnProgressListener;
import p007c.p154j.OnStartOrResumeListener;
import p007c.p154j.p155g.Core2;
import p007c.p154j.p155g.DefaultExecutorSupplier;
import p007c.p154j.p159k.ComponentHolder;
import p007c.p154j.p159k.DownloadRequestQueue;
import p007c.p154j.p159k.DownloadRunnable;

/* JADX INFO: renamed from: c.j.l.a, reason: use source file name */
/* JADX INFO: compiled from: DownloadRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class DownloadRequest {

    /* JADX INFO: renamed from: a */
    public int f4457a;

    /* JADX INFO: renamed from: b */
    public String f4458b;

    /* JADX INFO: renamed from: c */
    public String f4459c;

    /* JADX INFO: renamed from: d */
    public String f4460d;

    /* JADX INFO: renamed from: e */
    public int f4461e;

    /* JADX INFO: renamed from: f */
    public Future f4462f;

    /* JADX INFO: renamed from: g */
    public long f4463g;

    /* JADX INFO: renamed from: h */
    public long f4464h;

    /* JADX INFO: renamed from: i */
    public int f4465i;

    /* JADX INFO: renamed from: j */
    public int f4466j;

    /* JADX INFO: renamed from: k */
    public String f4467k;

    /* JADX INFO: renamed from: l */
    public OnProgressListener f4468l;

    /* JADX INFO: renamed from: m */
    public OnDownloadListener f4469m;

    /* JADX INFO: renamed from: n */
    public OnStartOrResumeListener f4470n;

    /* JADX INFO: renamed from: o */
    public int f4471o;

    /* JADX INFO: renamed from: p */
    public int f4472p;

    /* JADX INFO: renamed from: c.j.l.a$a */
    /* JADX INFO: compiled from: DownloadRequest.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Error2 f4473f;

        public a(Error2 error2) {
            this.f4473f = error2;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDownloadListener onDownloadListener = DownloadRequest.this.f4469m;
            if (onDownloadListener != null) {
                onDownloadListener.mo2222b(this.f4473f);
            }
            DownloadRequest.m2241a(DownloadRequest.this);
        }
    }

    /* JADX INFO: renamed from: c.j.l.a$b */
    /* JADX INFO: compiled from: DownloadRequest.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OnStartOrResumeListener onStartOrResumeListener = DownloadRequest.this.f4470n;
            if (onStartOrResumeListener != null) {
                onStartOrResumeListener.mo2224a();
            }
        }
    }

    public DownloadRequest(DownloadRequestBuilder downloadRequestBuilder) {
        this.f4458b = downloadRequestBuilder.f4478a;
        this.f4459c = downloadRequestBuilder.f4479b;
        this.f4460d = downloadRequestBuilder.f4480c;
        this.f4457a = downloadRequestBuilder.f4481d;
        ComponentHolder componentHolder = ComponentHolder.f4430a;
        if (componentHolder.f4431b == 0) {
            synchronized (ComponentHolder.class) {
                if (componentHolder.f4431b == 0) {
                    componentHolder.f4431b = 20000;
                }
            }
        }
        this.f4465i = componentHolder.f4431b;
        if (componentHolder.f4432c == 0) {
            synchronized (ComponentHolder.class) {
                if (componentHolder.f4432c == 0) {
                    componentHolder.f4432c = 20000;
                }
            }
        }
        this.f4466j = componentHolder.f4432c;
        this.f4467k = null;
    }

    /* JADX INFO: renamed from: a */
    public static void m2241a(DownloadRequest downloadRequest) {
        downloadRequest.f4468l = null;
        downloadRequest.f4469m = null;
        downloadRequest.f4470n = null;
        DownloadRequestQueue.m2230a().f4437b.remove(Integer.valueOf(downloadRequest.f4471o));
    }

    /* JADX INFO: renamed from: b */
    public void m2242b(Error2 error2) {
        if (this.f4472p != 5) {
            this.f4472p = 6;
            ((DefaultExecutorSupplier) Core2.m2225a().f4416b).f4420d.execute(new a(error2));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2243c() {
        if (this.f4472p != 5) {
            ((DefaultExecutorSupplier) Core2.m2225a().f4416b).f4420d.execute(new b());
        }
    }

    /* JADX INFO: renamed from: d */
    public int m2244d(OnDownloadListener onDownloadListener) {
        this.f4469m = onDownloadListener;
        String str = this.f4458b;
        String str2 = this.f4459c;
        String str3 = this.f4460d;
        StringBuilder sbM1556G = outline.m1556G(str);
        String str4 = File.separator;
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(outline.m1553D(sbM1556G, str4, str2, str4, str3).getBytes(Utf8Charset.NAME));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b2 : bArrDigest) {
                int i = b2 & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            this.f4471o = sb.toString().hashCode();
            DownloadRequestQueue downloadRequestQueueM2230a = DownloadRequestQueue.m2230a();
            downloadRequestQueueM2230a.f4437b.put(Integer.valueOf(this.f4471o), this);
            this.f4472p = 1;
            this.f4461e = downloadRequestQueueM2230a.f4438c.incrementAndGet();
            this.f4462f = ((DefaultExecutorSupplier) Core2.m2225a().f4416b).f4418b.submit(new DownloadRunnable(this));
            return this.f4471o;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UnsupportedEncodingException", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("NoSuchAlgorithmException", e2);
        }
    }
}
