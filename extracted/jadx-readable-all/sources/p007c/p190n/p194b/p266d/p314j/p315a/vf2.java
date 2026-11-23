package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vf2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ wf2 f20761f;

    public vf2(wf2 wf2Var) {
        this.f20761f = wf2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        wf2 wf2Var = this.f20761f;
        try {
            try {
                pe2 pe2Var = wf2Var.f21071a;
                Class clsLoadClass = pe2Var.f17949d.loadClass(wf2Var.m8640a(pe2Var.f17951f, wf2Var.f21072b));
                if (clsLoadClass == null) {
                    countDownLatch = wf2Var.f21076f;
                } else {
                    wf2Var.f21074d = clsLoadClass.getMethod(wf2Var.m8640a(wf2Var.f21071a.f17951f, wf2Var.f21073c), wf2Var.f21075e);
                    countDownLatch = wf2Var.f21074d == null ? wf2Var.f21076f : wf2Var.f21076f;
                }
            } catch (td2 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
            }
        } catch (NullPointerException unused2) {
            countDownLatch = wf2Var.f21076f;
        } catch (Throwable th) {
            wf2Var.f21076f.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
