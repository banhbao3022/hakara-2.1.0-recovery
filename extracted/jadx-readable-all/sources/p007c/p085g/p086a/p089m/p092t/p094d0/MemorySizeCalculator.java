package p007c.p085g.p086a.p089m.p092t.p094d0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.g.a.m.t.d0.i, reason: use source file name */
/* JADX INFO: compiled from: MemorySizeCalculator.java */
/* JADX INFO: loaded from: classes.dex */
public final class MemorySizeCalculator {

    /* JADX INFO: renamed from: a */
    public final int f3169a;

    /* JADX INFO: renamed from: b */
    public final int f3170b;

    /* JADX INFO: renamed from: c */
    public final Context f3171c;

    /* JADX INFO: renamed from: d */
    public final int f3172d;

    /* JADX INFO: renamed from: c.g.a.m.t.d0.i$a */
    /* JADX INFO: compiled from: MemorySizeCalculator.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final int f3173a;

        /* JADX INFO: renamed from: b */
        public final Context f3174b;

        /* JADX INFO: renamed from: c */
        public ActivityManager f3175c;

        /* JADX INFO: renamed from: d */
        public c f3176d;

        /* JADX INFO: renamed from: f */
        public float f3178f;

        /* JADX INFO: renamed from: e */
        public float f3177e = 2.0f;

        /* JADX INFO: renamed from: g */
        public float f3179g = 0.4f;

        /* JADX INFO: renamed from: h */
        public float f3180h = 0.33f;

        /* JADX INFO: renamed from: i */
        public int f3181i = 4194304;

        static {
            f3173a = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f3178f = f3173a;
            this.f3174b = context;
            this.f3175c = (ActivityManager) context.getSystemService("activity");
            this.f3176d = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !this.f3175c.isLowRamDevice()) {
                return;
            }
            this.f3178f = 0.0f;
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.d0.i$b */
    /* JADX INFO: compiled from: MemorySizeCalculator.java */
    public static final class b implements c {

        /* JADX INFO: renamed from: a */
        public final DisplayMetrics f3182a;

        public b(DisplayMetrics displayMetrics) {
            this.f3182a = displayMetrics;
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.d0.i$c */
    /* JADX INFO: compiled from: MemorySizeCalculator.java */
    public interface c {
    }

    public MemorySizeCalculator(a aVar) {
        this.f3171c = aVar.f3174b;
        int i = aVar.f3175c.isLowRamDevice() ? aVar.f3181i / 2 : aVar.f3181i;
        this.f3172d = i;
        ActivityManager activityManager = aVar.f3175c;
        int iRound = Math.round(activityManager.getMemoryClass() * 1024 * 1024 * (activityManager.isLowRamDevice() ? aVar.f3180h : aVar.f3179g));
        DisplayMetrics displayMetrics = ((b) aVar.f3176d).f3182a;
        float f = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(aVar.f3178f * f);
        int iRound3 = Math.round(f * aVar.f3177e);
        int i2 = iRound - i;
        int i3 = iRound3 + iRound2;
        if (i3 <= i2) {
            this.f3170b = iRound3;
            this.f3169a = iRound2;
        } else {
            float f2 = i2;
            float f3 = aVar.f3178f;
            float f4 = aVar.f3177e;
            float f5 = f2 / (f3 + f4);
            this.f3170b = Math.round(f4 * f5);
            this.f3169a = Math.round(f5 * aVar.f3178f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sbM1556G = outline.m1556G("Calculation complete, Calculated memory cache size: ");
            sbM1556G.append(m1783a(this.f3170b));
            sbM1556G.append(", pool size: ");
            sbM1556G.append(m1783a(this.f3169a));
            sbM1556G.append(", byte array size: ");
            sbM1556G.append(m1783a(i));
            sbM1556G.append(", memory class limited? ");
            sbM1556G.append(i3 > iRound);
            sbM1556G.append(", max size: ");
            sbM1556G.append(m1783a(iRound));
            sbM1556G.append(", memoryClass: ");
            sbM1556G.append(aVar.f3175c.getMemoryClass());
            sbM1556G.append(", isLowMemoryDevice: ");
            sbM1556G.append(aVar.f3175c.isLowRamDevice());
            Log.d("MemorySizeCalculator", sbM1556G.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m1783a(int i) {
        return Formatter.formatFileSize(this.f3171c, i);
    }
}
