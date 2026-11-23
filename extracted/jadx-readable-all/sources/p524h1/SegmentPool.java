package p524h1;

import java.util.concurrent.atomic.AtomicReference;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: h1.v, reason: use source file name */
/* JADX INFO: compiled from: SegmentPool.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SegmentPool {

    /* JADX INFO: renamed from: b */
    public static final int f30750b;

    /* JADX INFO: renamed from: c */
    public static final AtomicReference<Segment>[] f30751c;

    /* JADX INFO: renamed from: d */
    public static final SegmentPool f30752d = new SegmentPool();

    /* JADX INFO: renamed from: a */
    public static final Segment f30749a = new Segment(new byte[0], 0, 0, false, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f30750b = iHighestOneBit;
        AtomicReference<Segment>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f30751c = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: a */
    public static final void m13790a(Segment segment) {
        Intrinsics2.m13090f(segment, "segment");
        if (!(segment.f30747f == null && segment.f30748g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.f30745d) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics2.m13086b(threadCurrentThread, "Thread.currentThread()");
        AtomicReference<Segment> atomicReference = f30751c[(int) (threadCurrentThread.getId() & (((long) f30750b) - 1))];
        Segment segment2 = atomicReference.get();
        if (segment2 == f30749a) {
            return;
        }
        int i = segment2 != null ? segment2.f30744c : 0;
        if (i >= 65536) {
            return;
        }
        segment.f30747f = segment2;
        segment.f30743b = 0;
        segment.f30744c = i + 8192;
        if (atomicReference.compareAndSet(segment2, segment)) {
            return;
        }
        segment.f30747f = null;
    }

    /* JADX INFO: renamed from: b */
    public static final Segment m13791b() {
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics2.m13086b(threadCurrentThread, "Thread.currentThread()");
        AtomicReference<Segment> atomicReference = f30751c[(int) (threadCurrentThread.getId() & (((long) f30750b) - 1))];
        Segment segment = f30749a;
        Segment andSet = atomicReference.getAndSet(segment);
        if (andSet == segment) {
            return new Segment();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new Segment();
        }
        atomicReference.set(andSet.f30747f);
        andSet.f30747f = null;
        andSet.f30744c = 0;
        return andSet;
    }
}
