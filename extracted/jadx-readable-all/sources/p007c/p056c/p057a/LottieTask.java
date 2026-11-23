package p007c.p056c.p057a;

import java.util.ArrayList;
import java.util.Iterator;
import p007c.p056c.p057a.p066e0.Logger2;

/* JADX INFO: renamed from: c.c.a.s, reason: use source file name */
/* JADX INFO: compiled from: LottieTask.java */
/* JADX INFO: loaded from: classes.dex */
public class LottieTask implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LottieTask2 f2481f;

    public LottieTask(LottieTask2 lottieTask2) {
        this.f2481f = lottieTask2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        if (this.f2481f.f2486e == null) {
            return;
        }
        LottieResult<T> lottieResult = this.f2481f.f2486e;
        V v = lottieResult.f2479a;
        if (v != 0) {
            LottieTask2 lottieTask2 = this.f2481f;
            synchronized (lottieTask2) {
                Iterator it = new ArrayList(lottieTask2.f2483b).iterator();
                while (it.hasNext()) {
                    ((LottieListener) it.next()).mo1461a(v);
                }
            }
            return;
        }
        LottieTask2 lottieTask3 = this.f2481f;
        Throwable th = lottieResult.f2480b;
        synchronized (lottieTask3) {
            ArrayList arrayList = new ArrayList(lottieTask3.f2484c);
            if (arrayList.isEmpty()) {
                Logger2.m1421c("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((LottieListener) it2.next()).mo1461a(th);
            }
        }
    }
}
