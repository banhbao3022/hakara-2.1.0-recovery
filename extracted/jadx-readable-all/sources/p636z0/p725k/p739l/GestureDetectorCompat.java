package p636z0.p725k.p739l;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

/* JADX INFO: renamed from: z0.k.l.e, reason: use source file name */
/* JADX INFO: compiled from: GestureDetectorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class GestureDetectorCompat {

    /* JADX INFO: renamed from: a */
    public final a f38056a;

    /* JADX INFO: renamed from: z0.k.l.e$a */
    /* JADX INFO: compiled from: GestureDetectorCompat.java */
    public interface a {
    }

    /* JADX INFO: renamed from: z0.k.l.e$b */
    /* JADX INFO: compiled from: GestureDetectorCompat.java */
    public static class b implements a {

        /* JADX INFO: renamed from: a */
        public final GestureDetector f38057a;

        public b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f38057a = new GestureDetector(context, onGestureListener, handler);
        }
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f38056a = new b(context, onGestureListener, handler);
    }
}
