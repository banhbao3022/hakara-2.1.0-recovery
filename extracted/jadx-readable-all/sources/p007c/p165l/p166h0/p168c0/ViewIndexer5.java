package p007c.p165l.p166h0.p168c0;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.l.h0.c0.n, reason: use source file name */
/* JADX INFO: compiled from: ViewIndexer.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewIndexer5 {

    /* JADX INFO: renamed from: a */
    public static final String f4659a = "c.l.h0.c0.n";

    /* JADX INFO: renamed from: c */
    public WeakReference<Activity> f4661c;

    /* JADX INFO: renamed from: d */
    public Timer f4662d;

    /* JADX INFO: renamed from: e */
    public String f4663e = null;

    /* JADX INFO: renamed from: b */
    public final Handler f4660b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c.l.h0.c0.n$a */
    /* JADX INFO: compiled from: ViewIndexer.java */
    public static class a implements Callable<String> {

        /* JADX INFO: renamed from: a */
        public WeakReference<View> f4664a;

        public a(View view) {
            this.f4664a = new WeakReference<>(view);
        }

        @Override // java.util.concurrent.Callable
        public String call() throws Exception {
            View view = this.f4664a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        }
    }

    public ViewIndexer5(Activity activity) {
        this.f4661c = new WeakReference<>(activity);
    }
}
