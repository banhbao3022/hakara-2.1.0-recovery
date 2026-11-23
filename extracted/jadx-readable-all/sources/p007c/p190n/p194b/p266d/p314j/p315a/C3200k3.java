package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.k3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C3200k3 {
    /* JADX INFO: renamed from: a */
    public static final void m7431a(final C3163j3 c3163j3, C3089h3 c3089h3) {
        File externalStorageDirectory;
        if (c3089h3.f14726c == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(c3089h3.f14727d)) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        Context context = c3089h3.f14726c;
        String str = c3089h3.f14727d;
        String str2 = c3089h3.f14724a;
        Map<String, String> map = c3089h3.f14725b;
        c3163j3.f15454e = context;
        c3163j3.f15455f = str;
        c3163j3.f15453d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c3163j3.f15457h = atomicBoolean;
        atomicBoolean.set(C3238l4.f16276c.m6603d().booleanValue());
        if (c3163j3.f15457h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            c3163j3.f15458i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            c3163j3.f15451b.put(entry.getKey(), entry.getValue());
        }
        C2962do.f13330a.execute(new Runnable(c3163j3) { // from class: c.n.b.d.j.a.i3

            /* JADX INFO: renamed from: f */
            public final C3163j3 f15080f;

            {
                this.f15080f = c3163j3;
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                Map<String, String> map2;
                C3163j3 c3163j4 = this.f15080f;
                Objects.requireNonNull(c3163j4);
                while (true) {
                    try {
                        C3533t3 c3533t3Take = c3163j4.f15450a.take();
                        C3496s3 c3496s3M8397b = c3533t3Take.m8397b();
                        if (!TextUtils.isEmpty(c3496s3M8397b.f19457a)) {
                            LinkedHashMap<String, String> linkedHashMap = c3163j4.f15451b;
                            synchronized (c3533t3Take.f19757c) {
                                C2330u.f10884a.f10893h.m6644a();
                                map2 = c3533t3Take.f19756b;
                            }
                            c3163j4.m7317b(c3163j4.m7316a(linkedHashMap, map2), c3496s3M8397b);
                        }
                    } catch (InterruptedException e) {
                        C2622l.m5241D3("CsiReporter:reporter interrupted", e);
                        return;
                    }
                }
            }
        });
        Map<String, AbstractC3385p3> map2 = c3163j3.f15452c;
        AbstractC3385p3 abstractC3385p3 = AbstractC3385p3.f17818b;
        map2.put("action", abstractC3385p3);
        c3163j3.f15452c.put("ad_format", abstractC3385p3);
        c3163j3.f15452c.put("e", AbstractC3385p3.f17819c);
    }
}
