package p007c.p190n.p194b.p209b.p212b2;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.b.b2.y, reason: use source file name */
/* JADX INFO: compiled from: PriorityTaskManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class PriorityTaskManager {

    /* JADX INFO: renamed from: a */
    public final Object f6399a = new Object();

    /* JADX INFO: renamed from: b */
    public int f6400b;

    /* JADX INFO: renamed from: c.n.b.b.b2.y$a */
    /* JADX INFO: compiled from: PriorityTaskManager.java */
    public static class a extends IOException {
        public a(int i, int i2) {
            super(outline.m1593o("Priority too low [priority=", i, ", highest=", i2, "]"));
        }
    }

    public PriorityTaskManager() {
        new PriorityQueue(10, Collections.reverseOrder());
        this.f6400b = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public void m3233a(int i) throws a {
        synchronized (this.f6399a) {
            if (this.f6400b != i) {
                throw new a(i, this.f6400b);
            }
        }
    }
}
