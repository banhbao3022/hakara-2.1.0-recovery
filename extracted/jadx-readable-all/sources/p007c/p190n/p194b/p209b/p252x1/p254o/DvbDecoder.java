package p007c.p190n.p194b.p209b.p252x1.p254o;

import java.util.List;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p252x1.SimpleSubtitleDecoder;

/* JADX INFO: renamed from: c.n.b.b.x1.o.a, reason: use source file name */
/* JADX INFO: compiled from: DvbDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class DvbDecoder extends SimpleSubtitleDecoder {

    /* JADX INFO: renamed from: n */
    public final DvbParser f9936n;

    public DvbDecoder(List<byte[]> list) {
        super("DvbDecoder");
        ParsableByteArray parsableByteArray = new ParsableByteArray(list.get(0));
        this.f9936n = new DvbParser(parsableByteArray.m3219x(), parsableByteArray.m3219x());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 c.n.b.b.x1.o.c, still in use, count: 2, list:
          (r2v0 c.n.b.b.x1.o.c) from 0x027c: PHI (r2v1 c.n.b.b.x1.o.c) = (r2v0 c.n.b.b.x1.o.c), (r2v4 c.n.b.b.x1.o.c) binds: [B:84:0x0274, B:124:0x03b3] A[DONT_GENERATE, DONT_INLINE]
          (r2v0 c.n.b.b.x1.o.c) from 0x023e: MOVE (r26v6 c.n.b.b.x1.o.c) = (r2v0 c.n.b.b.x1.o.c)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // p007c.p190n.p194b.p209b.p252x1.SimpleSubtitleDecoder
    /* JADX INFO: renamed from: j */
    public p007c.p190n.p194b.p209b.p252x1.Subtitle mo4394j(byte[] r35, int r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p209b.p252x1.p254o.DvbDecoder.mo4394j(byte[], int, boolean):c.n.b.b.x1.f");
    }
}
