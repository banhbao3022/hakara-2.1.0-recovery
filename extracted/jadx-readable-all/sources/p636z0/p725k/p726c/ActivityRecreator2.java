package p636z0.p725k.p726c;

import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: z0.k.c.e, reason: use source file name */
/* JADX INFO: compiled from: ActivityRecreator.java */
/* JADX INFO: loaded from: classes.dex */
public class ActivityRecreator2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f37682f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f37683g;

    public ActivityRecreator2(Object obj, Object obj2) {
        this.f37682f = obj;
        this.f37683g = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Method method = ActivityRecreator.f37668d;
            if (method != null) {
                method.invoke(this.f37682f, this.f37683g, Boolean.FALSE, "AppCompat recreation");
            } else {
                ActivityRecreator.f37669e.invoke(this.f37682f, this.f37683g, Boolean.FALSE);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
