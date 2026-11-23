package p007c.p056c.p057a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p007c.p056c.p057a.p059b0.LottieCompositionCache;
import p007c.p056c.p057a.p064d0.LottieCompositionMoshiParser;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;
import p007c.p056c.p057a.p064d0.p065h0.JsonUtf8Reader;
import p007c.p056c.p057a.p066e0.Utils;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p524h1.JvmOkio;
import p524h1.RealBufferedSource;
import p524h1.Timeout2;

/* JADX INFO: renamed from: c.c.a.g, reason: use source file name */
/* JADX INFO: compiled from: LottieCompositionFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class LottieCompositionFactory {

    /* JADX INFO: renamed from: a */
    public static final Map<String, LottieTask2<LottieComposition>> f2378a = new HashMap();

    /* JADX INFO: renamed from: c.c.a.g$a */
    /* JADX INFO: compiled from: LottieCompositionFactory.java */
    public class a implements LottieListener<LottieComposition> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f2379a;

        public a(String str) {
            this.f2379a = str;
        }

        @Override // p007c.p056c.p057a.LottieListener
        /* JADX INFO: renamed from: a */
        public void mo1461a(LottieComposition lottieComposition) {
            LottieCompositionFactory.f2378a.remove(this.f2379a);
        }
    }

    /* JADX INFO: renamed from: c.c.a.g$b */
    /* JADX INFO: compiled from: LottieCompositionFactory.java */
    public class b implements LottieListener<Throwable> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f2380a;

        public b(String str) {
            this.f2380a = str;
        }

        @Override // p007c.p056c.p057a.LottieListener
        /* JADX INFO: renamed from: a */
        public void mo1461a(Throwable th) {
            LottieCompositionFactory.f2378a.remove(this.f2380a);
        }
    }

    /* JADX INFO: renamed from: c.c.a.g$c */
    /* JADX INFO: compiled from: LottieCompositionFactory.java */
    public class c implements Callable<LottieResult<LottieComposition>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LottieComposition f2381a;

        public c(LottieComposition lottieComposition) {
            this.f2381a = lottieComposition;
        }

        @Override // java.util.concurrent.Callable
        public LottieResult<LottieComposition> call() throws Exception {
            return new LottieResult<>(this.f2381a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static LottieTask2<LottieComposition> m1453a(String str, Callable<LottieResult<LottieComposition>> callable) {
        LottieComposition lottieCompositionM15597a;
        if (str == null) {
            lottieCompositionM15597a = null;
        } else {
            LottieCompositionCache lottieCompositionCache = LottieCompositionCache.f1995a;
            Objects.requireNonNull(lottieCompositionCache);
            lottieCompositionM15597a = lottieCompositionCache.f1996b.m15597a(str);
        }
        if (lottieCompositionM15597a != null) {
            return new LottieTask2<>(new c(lottieCompositionM15597a));
        }
        if (str != null) {
            Map<String, LottieTask2<LottieComposition>> map = f2378a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        LottieTask2<LottieComposition> lottieTask2 = new LottieTask2<>(callable);
        if (str != null) {
            lottieTask2.m1488b(new a(str));
            lottieTask2.m1487a(new b(str));
            f2378a.put(str, lottieTask2);
        }
        return lottieTask2;
    }

    /* JADX INFO: renamed from: b */
    public static LottieResult<LottieComposition> m1454b(Context context, String str, String str2) {
        try {
            return str.endsWith(".zip") ? m1458f(new ZipInputStream(context.getAssets().open(str)), str2) : m1455c(context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new LottieResult<>((Throwable) e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static LottieResult<LottieComposition> m1455c(InputStream inputStream, String str) {
        try {
            Intrinsics2.m13090f(inputStream, "$this$source");
            JvmOkio jvmOkio = new JvmOkio(inputStream, new Timeout2());
            Intrinsics2.m13090f(jvmOkio, "$this$buffer");
            RealBufferedSource realBufferedSource = new RealBufferedSource(jvmOkio);
            String[] strArr = JsonReader.f2261f;
            return m1456d(new JsonUtf8Reader(realBufferedSource), str, true);
        } finally {
            Utils.m1438b(inputStream);
        }
    }

    /* JADX INFO: renamed from: d */
    public static LottieResult<LottieComposition> m1456d(JsonReader jsonReader, String str, boolean z) {
        try {
            LottieComposition lottieCompositionM1413a = LottieCompositionMoshiParser.m1413a(jsonReader);
            if (str != null) {
                LottieCompositionCache lottieCompositionCache = LottieCompositionCache.f1995a;
                Objects.requireNonNull(lottieCompositionCache);
                lottieCompositionCache.f1996b.m15598b(str, lottieCompositionM1413a);
            }
            return new LottieResult<>(lottieCompositionM1413a);
        } catch (Exception e) {
            return new LottieResult<>((Throwable) e);
        } finally {
            if (z) {
                Utils.m1438b(jsonReader);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static LottieResult<LottieComposition> m1457e(Context context, int i, String str) {
        try {
            return m1455c(context.getResources().openRawResource(i), str);
        } catch (Resources.NotFoundException e) {
            return new LottieResult<>((Throwable) e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static LottieResult<LottieComposition> m1458f(ZipInputStream zipInputStream, String str) {
        try {
            return m1459g(zipInputStream, str);
        } finally {
            Utils.m1438b(zipInputStream);
        }
    }

    /* JADX INFO: renamed from: g */
    public static LottieResult<LottieComposition> m1459g(ZipInputStream zipInputStream, String str) {
        LottieImageAsset next;
        HashMap map = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            LottieComposition lottieComposition = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    Intrinsics2.m13090f(zipInputStream, "$this$source");
                    JvmOkio jvmOkio = new JvmOkio(zipInputStream, new Timeout2());
                    Intrinsics2.m13090f(jvmOkio, "$this$buffer");
                    RealBufferedSource realBufferedSource = new RealBufferedSource(jvmOkio);
                    String[] strArr = JsonReader.f2261f;
                    lottieComposition = m1456d(new JsonUtf8Reader(realBufferedSource), null, false).f2479a;
                } else if (name.contains(".png") || name.contains(".webp")) {
                    String[] strArrSplit = name.split("/");
                    map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (lottieComposition == null) {
                return new LottieResult<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator<LottieImageAsset> it = lottieComposition.f2346d.values().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!next.f2447d.equals(str2));
                if (next != null) {
                    next.f2448e = Utils.m1441e((Bitmap) entry.getValue(), next.f2444a, next.f2445b);
                }
            }
            for (Map.Entry<String, LottieImageAsset> entry2 : lottieComposition.f2346d.entrySet()) {
                if (entry2.getValue().f2448e == null) {
                    StringBuilder sbM1556G = outline.m1556G("There is no image for ");
                    sbM1556G.append(entry2.getValue().f2447d);
                    return new LottieResult<>((Throwable) new IllegalStateException(sbM1556G.toString()));
                }
            }
            if (str != null) {
                LottieCompositionCache lottieCompositionCache = LottieCompositionCache.f1995a;
                Objects.requireNonNull(lottieCompositionCache);
                lottieCompositionCache.f1996b.m15598b(str, lottieComposition);
            }
            return new LottieResult<>(lottieComposition);
        } catch (IOException e) {
            return new LottieResult<>((Throwable) e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m1460h(Context context, int i) {
        StringBuilder sbM1556G = outline.m1556G("rawRes");
        sbM1556G.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sbM1556G.append(i);
        return sbM1556G.toString();
    }
}
