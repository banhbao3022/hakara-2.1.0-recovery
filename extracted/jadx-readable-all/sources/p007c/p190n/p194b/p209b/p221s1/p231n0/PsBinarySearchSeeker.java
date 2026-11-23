package p007c.p190n.p194b.p209b.p221s1.p231n0;

import com.facebook.stetho.websocket.CloseCodes;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.TimestampAdjuster;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.BinarySearchSeeker;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.z, reason: use source file name */
/* JADX INFO: compiled from: PsBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class PsBinarySearchSeeker extends BinarySearchSeeker {

    /* JADX INFO: renamed from: c.n.b.b.s1.n0.z$b */
    /* JADX INFO: compiled from: PsBinarySearchSeeker.java */
    public static final class b implements BinarySearchSeeker.f {

        /* JADX INFO: renamed from: a */
        public final TimestampAdjuster f8451a;

        /* JADX INFO: renamed from: b */
        public final ParsableByteArray f8452b = new ParsableByteArray();

        public b(TimestampAdjuster timestampAdjuster, a aVar) {
            this.f8451a = timestampAdjuster;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.BinarySearchSeeker.f
        /* JADX INFO: renamed from: a */
        public void mo3724a() {
            this.f8452b.m3191A(Util6.f6312f);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:36:0x00d5
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        @Override // p007c.p190n.p194b.p209b.p221s1.BinarySearchSeeker.f
        /* JADX INFO: renamed from: b */
        public p007c.p190n.p194b.p209b.p221s1.BinarySearchSeeker.e mo3725b(p007c.p190n.p194b.p209b.p221s1.ExtractorInput r17, long r18) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 284
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p209b.p221s1.p231n0.PsBinarySearchSeeker.b.mo3725b(c.n.b.b.s1.i, long):c.n.b.b.s1.a$e");
        }
    }

    public PsBinarySearchSeeker(TimestampAdjuster timestampAdjuster, long j2, long j3) {
        super(new BinarySearchSeeker.b(), new b(timestampAdjuster, null), j2, 0L, j2 + 1, 0L, j3, 188L, CloseCodes.NORMAL_CLOSURE);
    }

    /* JADX INFO: renamed from: g */
    public static int m3906g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
