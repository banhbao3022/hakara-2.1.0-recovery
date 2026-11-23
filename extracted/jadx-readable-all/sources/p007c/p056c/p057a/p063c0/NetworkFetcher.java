package p007c.p056c.p057a.p063c0;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;
import p007c.p056c.p057a.LottieComposition;
import p007c.p056c.p057a.LottieCompositionFactory;
import p007c.p056c.p057a.LottieResult;
import p007c.p056c.p057a.p066e0.Logger2;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.c0.c, reason: use source file name */
/* JADX INFO: compiled from: NetworkFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public class NetworkFetcher {

    /* JADX INFO: renamed from: a */
    public final Context f2237a;

    /* JADX INFO: renamed from: b */
    public final String f2238b;

    /* JADX INFO: renamed from: c */
    public final NetworkCache f2239c;

    public NetworkFetcher(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.f2237a = applicationContext;
        this.f2238b = str;
        if (str2 == null) {
            this.f2239c = null;
        } else {
            this.f2239c = new NetworkCache(applicationContext);
        }
    }

    /* JADX INFO: renamed from: a */
    public final LottieResult<LottieComposition> m1369a() throws IOException {
        StringBuilder sbM1556G = outline.m1556G("Fetching ");
        sbM1556G.append(this.f2238b);
        Logger2.m1419a(sbM1556G.toString());
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f2238b).openConnection();
        httpURLConnection.setRequestMethod("GET");
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null && httpURLConnection.getResponseCode() == 200) {
                LottieResult<LottieComposition> lottieResultM1371c = m1371c(httpURLConnection);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(lottieResultM1371c.f2479a != null);
                Logger2.m1419a(sb.toString());
                return lottieResultM1371c;
            }
            return new LottieResult<>((Throwable) new IllegalArgumentException("Unable to fetch " + this.f2238b + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + m1370b(httpURLConnection)));
        } catch (Exception e) {
            return new LottieResult<>((Throwable) e);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m1370b(HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.getResponseCode();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            sb.append(line);
                            sb.append('\n');
                        } else {
                            try {
                                break;
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    bufferedReader.close();
                    throw th;
                }
                bufferedReader.close();
            } catch (Exception unused2) {
            }
            throw th;
        }
        bufferedReader.close();
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public final LottieResult<LottieComposition> m1371c(HttpURLConnection httpURLConnection) throws IOException {
        FileExtension fileExtension;
        LottieResult<LottieComposition> lottieResultM1455c;
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            contentType = "application/json";
        }
        if (contentType.contains("application/zip")) {
            Logger2.m1419a("Handling zip response.");
            fileExtension = FileExtension.ZIP;
            NetworkCache networkCache = this.f2239c;
            lottieResultM1455c = networkCache == null ? LottieCompositionFactory.m1458f(new ZipInputStream(httpURLConnection.getInputStream()), null) : LottieCompositionFactory.m1458f(new ZipInputStream(new FileInputStream(networkCache.m1368c(this.f2238b, httpURLConnection.getInputStream(), fileExtension))), this.f2238b);
        } else {
            Logger2.m1419a("Received json response.");
            fileExtension = FileExtension.JSON;
            NetworkCache networkCache2 = this.f2239c;
            lottieResultM1455c = networkCache2 == null ? LottieCompositionFactory.m1455c(httpURLConnection.getInputStream(), null) : LottieCompositionFactory.m1455c(new FileInputStream(new File(networkCache2.m1368c(this.f2238b, httpURLConnection.getInputStream(), fileExtension).getAbsolutePath())), this.f2238b);
        }
        NetworkCache networkCache3 = this.f2239c;
        if (networkCache3 != null && lottieResultM1455c.f2479a != null) {
            File file = new File(networkCache3.m1367b(), NetworkCache.m1366a(this.f2238b, fileExtension, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            Logger2.m1419a("Copying temp file to real file (" + file2 + ")");
            if (!zRenameTo) {
                StringBuilder sbM1556G = outline.m1556G("Unable to rename cache file ");
                sbM1556G.append(file.getAbsolutePath());
                sbM1556G.append(" to ");
                sbM1556G.append(file2.getAbsolutePath());
                sbM1556G.append(".");
                Logger2.m1420b(sbM1556G.toString());
            }
        }
        return lottieResultM1455c;
    }
}
