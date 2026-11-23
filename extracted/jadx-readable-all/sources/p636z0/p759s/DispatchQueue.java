package p636z0.p759s;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: z0.s.e, reason: use source file name */
/* JADX INFO: compiled from: DispatchQueue.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DispatchQueue {

    /* JADX INFO: renamed from: b */
    public boolean f38699b;

    /* JADX INFO: renamed from: c */
    public boolean f38700c;

    /* JADX INFO: renamed from: a */
    public boolean f38698a = true;

    /* JADX INFO: renamed from: d */
    public final Queue<Runnable> f38701d = new ArrayDeque();

    /* JADX INFO: renamed from: a */
    public final void m16724a() {
        if (this.f38700c) {
            return;
        }
        try {
            this.f38700c = true;
            while (!this.f38701d.isEmpty()) {
                if (!(this.f38699b || !this.f38698a)) {
                    break;
                }
                Runnable runnablePoll = this.f38701d.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
        } finally {
            this.f38700c = false;
        }
    }
}
