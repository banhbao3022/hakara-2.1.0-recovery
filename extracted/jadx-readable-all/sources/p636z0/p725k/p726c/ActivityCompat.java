package p636z0.p725k.p726c;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: renamed from: z0.k.c.a, reason: use source file name */
/* JADX INFO: compiled from: ActivityCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class ActivityCompat extends ContextCompat {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f37660b = 0;

    /* JADX INFO: renamed from: z0.k.c.a$a */
    /* JADX INFO: compiled from: ActivityCompat.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String[] f37661f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Activity f37662g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ int f37663h;

        public a(String[] strArr, Activity activity, int i) {
            this.f37661f = strArr;
            this.f37662g = activity;
            this.f37663h = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f37661f.length];
            PackageManager packageManager = this.f37662g.getPackageManager();
            String packageName = this.f37662g.getPackageName();
            int length = this.f37661f.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f37661f[i], packageName);
            }
            ((b) this.f37662g).onRequestPermissionsResult(this.f37663h, this.f37661f, iArr);
        }
    }

    /* JADX INFO: renamed from: z0.k.c.a$b */
    /* JADX INFO: compiled from: ActivityCompat.java */
    public interface b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* JADX INFO: renamed from: z0.k.c.a$c */
    /* JADX INFO: compiled from: ActivityCompat.java */
    public interface c {
        /* JADX INFO: renamed from: c */
        void mo16083c(int i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static void m16082c(Activity activity, String[] strArr, int i) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException(outline.m1550A(outline.m1556G("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof c) {
                ((c) activity).mo16083c(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof b) {
            new Handler(Looper.getMainLooper()).post(new a(strArr, activity, i));
        }
    }
}
