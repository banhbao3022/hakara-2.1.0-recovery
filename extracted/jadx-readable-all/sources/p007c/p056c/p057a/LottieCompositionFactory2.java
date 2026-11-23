package p007c.p056c.p057a;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import p007c.p056c.p057a.p063c0.FileExtension;
import p007c.p056c.p057a.p063c0.NetworkCache;
import p007c.p056c.p057a.p063c0.NetworkFetcher;
import p007c.p056c.p057a.p066e0.Logger2;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p738k.Pair;

/* JADX INFO: renamed from: c.c.a.h, reason: use source file name */
/* JADX INFO: compiled from: LottieCompositionFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class LottieCompositionFactory2 implements Callable<LottieResult<LottieComposition>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f2382a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f2383b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f2384c;

    public LottieCompositionFactory2(Context context, String str, String str2) {
        this.f2382a = context;
        this.f2383b = str;
        this.f2384c = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public LottieResult<LottieComposition> call() throws Exception {
        Pair pair;
        NetworkFetcher networkFetcher = new NetworkFetcher(this.f2382a, this.f2383b, this.f2384c);
        FileExtension fileExtension = FileExtension.ZIP;
        NetworkCache networkCache = networkFetcher.f2239c;
        LottieComposition lottieComposition = null;
        if (networkCache != null) {
            String str = networkFetcher.f2238b;
            try {
                File fileM1367b = networkCache.m1367b();
                FileExtension fileExtension2 = FileExtension.JSON;
                File file = new File(fileM1367b, NetworkCache.m1366a(str, fileExtension2, false));
                if (!file.exists()) {
                    file = new File(networkCache.m1367b(), NetworkCache.m1366a(str, fileExtension, false));
                    if (!file.exists()) {
                        file = null;
                    }
                }
                if (file == null) {
                    pair = null;
                } else {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    if (file.getAbsolutePath().endsWith(".zip")) {
                        fileExtension2 = fileExtension;
                    }
                    StringBuilder sbM1562M = outline.m1562M("Cache hit for ", str, " at ");
                    sbM1562M.append(file.getAbsolutePath());
                    Logger2.m1419a(sbM1562M.toString());
                    pair = new Pair(fileExtension2, fileInputStream);
                }
            } catch (FileNotFoundException unused) {
            }
            if (pair != null) {
                FileExtension fileExtension3 = (FileExtension) pair.f37971a;
                InputStream inputStream = (InputStream) pair.f37972b;
                LottieComposition lottieComposition2 = (fileExtension3 == fileExtension ? LottieCompositionFactory.m1458f(new ZipInputStream(inputStream), networkFetcher.f2238b) : LottieCompositionFactory.m1455c(inputStream, networkFetcher.f2238b)).f2479a;
                if (lottieComposition2 != null) {
                    lottieComposition = lottieComposition2;
                }
            }
        }
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        StringBuilder sbM1556G = outline.m1556G("Animation for ");
        sbM1556G.append(networkFetcher.f2238b);
        sbM1556G.append(" not found in cache. Fetching from network.");
        Logger2.m1419a(sbM1556G.toString());
        try {
            return networkFetcher.m1369a();
        } catch (IOException e) {
            return new LottieResult<>((Throwable) e);
        }
    }
}
