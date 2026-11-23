package p636z0.p725k.p726c;

import android.app.Activity;

/* JADX INFO: renamed from: z0.k.c.b, reason: use source file name */
/* JADX INFO: compiled from: ActivityCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class ActivityCompat2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Activity f37664f;

    public ActivityCompat2(Activity activity) {
        this.f37664f = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f37664f.isFinishing() || ActivityRecreator.m16085b(this.f37664f)) {
            return;
        }
        this.f37664f.recreate();
    }
}
