package p636z0.p725k.p736i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p636z0.p691g.LruCache2;
import p636z0.p691g.SimpleArrayMap;
import p636z0.p725k.p729e.TypefaceCompat;
import p636z0.p725k.p738k.Consumer2;

/* JADX INFO: renamed from: z0.k.i.j, reason: use source file name */
/* JADX INFO: compiled from: FontRequestWorker.java */
/* JADX INFO: loaded from: classes.dex */
public class FontRequestWorker5 {

    /* JADX INFO: renamed from: a */
    public static final LruCache2<String, Typeface> f37918a = new LruCache2<>(16);

    /* JADX INFO: renamed from: b */
    public static final ExecutorService f37919b;

    /* JADX INFO: renamed from: c */
    public static final Object f37920c;

    /* JADX INFO: renamed from: d */
    public static final SimpleArrayMap<String, ArrayList<Consumer2<a>>> f37921d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new RequestExecutor("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f37919b = threadPoolExecutor;
        f37920c = new Object();
        f37921d = new SimpleArrayMap<>();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0035 A[EDGE_INSN: B:23:0x0035->B:28:0x003e BREAK  A[LOOP:0: B:19:0x002b->B:25:0x0039]] */
    /* JADX INFO: renamed from: a */
    public static a m16206a(String str, Context context, FontRequest fontRequest, int i) {
        int i2;
        Typeface typefaceM15597a = f37918a.m15597a(str);
        if (typefaceM15597a != null) {
            return new a(typefaceM15597a);
        }
        try {
            FontsContractCompat fontsContractCompatM16205a = FontProvider.m16205a(context, fontRequest, null);
            int i3 = fontsContractCompatM16205a.f37924a;
            int i4 = 1;
            if (i3 == 0) {
                FontsContractCompat2[] fontsContractCompat2Arr = fontsContractCompatM16205a.f37925b;
                if (fontsContractCompat2Arr == null || fontsContractCompat2Arr.length == 0) {
                    i2 = i4;
                    break;
                }
                int length = fontsContractCompat2Arr.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        i4 = 0;
                        i2 = i4;
                        break;
                    }
                    int i6 = fontsContractCompat2Arr[i5].f37930e;
                    if (i6 != 0) {
                        if (i6 >= 0) {
                            i2 = i6;
                            break;
                        }
                        i2 = -3;
                        break;
                    }
                    i5++;
                }
            } else {
                if (i3 != 1) {
                    i2 = -3;
                    break;
                }
                i2 = -2;
            }
            if (i2 != 0) {
                return new a(i2);
            }
            Typeface typefaceMo16179b = TypefaceCompat.f37857a.mo16179b(context, null, fontsContractCompatM16205a.f37925b, i);
            if (typefaceMo16179b == null) {
                return new a(-3);
            }
            f37918a.m15598b(str, typefaceMo16179b);
            return new a(typefaceMo16179b);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }

    /* JADX INFO: renamed from: z0.k.i.j$a */
    /* JADX INFO: compiled from: FontRequestWorker.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Typeface f37922a;

        /* JADX INFO: renamed from: b */
        public final int f37923b;

        public a(int i) {
            this.f37922a = null;
            this.f37923b = i;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f37922a = typeface;
            this.f37923b = 0;
        }
    }
}
