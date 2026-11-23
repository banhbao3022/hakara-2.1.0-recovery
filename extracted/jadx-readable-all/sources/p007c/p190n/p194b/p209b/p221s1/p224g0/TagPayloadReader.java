package p007c.p190n.p194b.p209b.p221s1.p224g0;

import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;

/* JADX INFO: renamed from: c.n.b.b.s1.g0.e, reason: use source file name */
/* JADX INFO: compiled from: TagPayloadReader.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class TagPayloadReader {

    /* JADX INFO: renamed from: a */
    public final TrackOutput2 f7646a;

    /* JADX INFO: renamed from: c.n.b.b.s1.g0.e$a */
    /* JADX INFO: compiled from: TagPayloadReader.java */
    public static final class a extends ParserException {
        public a(String str) {
            super(str);
        }
    }

    public TagPayloadReader(TrackOutput2 trackOutput2) {
        this.f7646a = trackOutput2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3768a(ParsableByteArray parsableByteArray, long j2) throws ParserException {
        return mo3762b(parsableByteArray) && mo3763c(parsableByteArray, j2);
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo3762b(ParsableByteArray parsableByteArray) throws ParserException;

    /* JADX INFO: renamed from: c */
    public abstract boolean mo3763c(ParsableByteArray parsableByteArray, long j2) throws ParserException;
}
