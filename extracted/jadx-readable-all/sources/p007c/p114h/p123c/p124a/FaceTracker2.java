package p007c.p114h.p123c.p124a;

import android.content.Context;
import android.util.Log;

/* JADX INFO: renamed from: c.h.c.a.c, reason: use source file name */
/* JADX INFO: compiled from: FaceTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class FaceTracker2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Context f3970f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3971g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3972h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f3973i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ FaceTracker.c f3974j;

    public FaceTracker2(FaceTracker.c cVar, Context context, int i, int i2, int i3) {
        this.f3974j = cVar;
        this.f3970f = context;
        this.f3971g = i;
        this.f3972h = i2;
        this.f3973i = i3;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f3974j) {
            Log.d("PHAN", String.valueOf(false));
            Log.d("PHAN", "VAo day");
        }
    }
}
