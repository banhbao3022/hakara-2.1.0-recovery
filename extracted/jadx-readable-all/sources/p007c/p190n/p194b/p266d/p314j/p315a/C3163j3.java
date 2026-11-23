package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.j3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C3163j3 {

    /* JADX INFO: renamed from: d */
    public String f15453d;

    /* JADX INFO: renamed from: e */
    public Context f15454e;

    /* JADX INFO: renamed from: f */
    public String f15455f;

    /* JADX INFO: renamed from: h */
    public AtomicBoolean f15457h;

    /* JADX INFO: renamed from: i */
    public File f15458i;

    /* JADX INFO: renamed from: a */
    public final BlockingQueue<C3533t3> f15450a = new ArrayBlockingQueue(100);

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap<String, String> f15451b = new LinkedHashMap<>();

    /* JADX INFO: renamed from: c */
    public final Map<String, AbstractC3385p3> f15452c = new HashMap();

    /* JADX INFO: renamed from: g */
    public final HashSet<String> f15456g = new HashSet<>(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    /* JADX INFO: renamed from: a */
    public final Map<String, String> m7316a(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String str = (String) linkedHashMap.get(key);
            AbstractC3385p3 abstractC3385p3 = this.f15452c.get(key);
            if (abstractC3385p3 == null) {
                abstractC3385p3 = AbstractC3385p3.f17817a;
            }
            linkedHashMap.put(key, abstractC3385p3.mo7572a(str, value));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: b */
    public final void m7317b(Map<String, String> map, C3496s3 c3496s3) throws Throwable {
        FileOutputStream fileOutputStream;
        Uri.Builder builderBuildUpon = Uri.parse(this.f15453d).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (c3496s3 != null) {
            StringBuilder sb = new StringBuilder(string);
            if (!TextUtils.isEmpty(c3496s3.f19457a)) {
                sb.append("&it=");
                sb.append(c3496s3.f19457a);
            }
            if (!TextUtils.isEmpty(c3496s3.f19458b)) {
                sb.append("&blat=");
                sb.append(c3496s3.f19458b);
            }
            string = sb.toString();
        }
        if (!this.f15457h.get()) {
            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
            C2267h1.m4751j(this.f15454e, this.f15455f, string);
            return;
        }
        File file = this.f15458i;
        if (file == null) {
            C2622l.m5226A3("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, true);
                try {
                    fileOutputStream.write(string.getBytes());
                    fileOutputStream.write(10);
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        C2622l.m5241D3("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream2 = fileOutputStream;
                    C2622l.m5241D3("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e3) {
                            C2622l.m5241D3("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            C2622l.m5241D3("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }
}
