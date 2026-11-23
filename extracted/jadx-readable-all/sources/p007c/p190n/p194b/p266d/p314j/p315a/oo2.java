package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(17)
public final class oo2 extends Surface {

    /* JADX INFO: renamed from: f */
    public static boolean f17705f;

    /* JADX INFO: renamed from: g */
    public static boolean f17706g;

    /* JADX INFO: renamed from: h */
    public final no2 f17707h;

    /* JADX INFO: renamed from: i */
    public boolean f17708i;

    public /* synthetic */ oo2(no2 no2Var, SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.f17707h = no2Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX INFO: renamed from: a */
    public static synchronized boolean m8048a(Context context) {
        if (!f17706g) {
            int i = jo2.f15673a;
            if (i >= 17) {
                boolean z = false;
                String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                if (strEglQueryString != null && strEglQueryString.contains("EGL_EXT_protected_content")) {
                    if (i == 24) {
                        String str = jo2.f15676d;
                        if ((!str.startsWith("SM-G950") && !str.startsWith("SM-G955")) || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                            z = true;
                        }
                    } else {
                        z = true;
                    }
                }
                f17705f = z;
            }
            f17706g = true;
        }
        return f17705f;
    }

    /* JADX INFO: renamed from: b */
    public static oo2 m8049b(Context context, boolean z) {
        if (jo2.f15673a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
        boolean z2 = false;
        C2622l.m5322V2(!z || m8048a(context));
        no2 no2Var = new no2();
        no2Var.start();
        no2Var.f17189g = new Handler(no2Var.getLooper(), no2Var);
        synchronized (no2Var) {
            no2Var.f17189g.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (no2Var.f17193k == null && no2Var.f17192j == null && no2Var.f17191i == null) {
                try {
                    no2Var.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = no2Var.f17192j;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = no2Var.f17191i;
        if (error == null) {
            return no2Var.f17193k;
        }
        throw error;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f17707h) {
            try {
                if (!this.f17708i) {
                    this.f17707h.f17189g.sendEmptyMessage(3);
                    this.f17708i = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
