package p007c.p190n.p194b.p209b.p252x1.p253n;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p217p1.DecoderException;
import p007c.p190n.p194b.p209b.p217p1.OutputBuffer;
import p007c.p190n.p194b.p209b.p252x1.Subtitle;
import p007c.p190n.p194b.p209b.p252x1.SubtitleDecoder;
import p007c.p190n.p194b.p209b.p252x1.SubtitleDecoderException;
import p007c.p190n.p194b.p209b.p252x1.SubtitleInputBuffer;
import p007c.p190n.p194b.p209b.p252x1.SubtitleOutputBuffer;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.x1.n.e, reason: use source file name */
/* JADX INFO: compiled from: CeaDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class CeaDecoder implements SubtitleDecoder {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque<b> f9927a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<SubtitleOutputBuffer> f9928b;

    /* JADX INFO: renamed from: c */
    public final PriorityQueue<b> f9929c;

    /* JADX INFO: renamed from: d */
    public b f9930d;

    /* JADX INFO: renamed from: e */
    public long f9931e;

    /* JADX INFO: renamed from: f */
    public long f9932f;

    /* JADX INFO: renamed from: c.n.b.b.x1.n.e$b */
    /* JADX INFO: compiled from: CeaDecoder.java */
    public static final class b extends SubtitleInputBuffer implements Comparable<b> {

        /* JADX INFO: renamed from: o */
        public long f9933o;

        public b() {
        }

        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            b bVar2 = bVar;
            if (m3628v() == bVar2.m3628v()) {
                long j2 = this.f7289j - bVar2.f7289j;
                if (j2 == 0) {
                    j2 = this.f9933o - bVar2.f9933o;
                    if (j2 == 0) {
                        return 0;
                    }
                }
                if (j2 > 0) {
                    return 1;
                }
            } else if (m3628v()) {
                return 1;
            }
            return -1;
        }

        public b(a aVar) {
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.x1.n.e$c */
    /* JADX INFO: compiled from: CeaDecoder.java */
    public static final class c extends SubtitleOutputBuffer {

        /* JADX INFO: renamed from: j */
        public OutputBuffer.a<c> f9934j;

        public c(OutputBuffer.a<c> aVar) {
            this.f9934j = aVar;
        }

        @Override // p007c.p190n.p194b.p209b.p217p1.OutputBuffer
        /* JADX INFO: renamed from: x */
        public final void mo3638x() {
            this.f9934j.mo3639a(this);
        }
    }

    public CeaDecoder() {
        for (int i = 0; i < 10; i++) {
            this.f9927a.add(new b(null));
        }
        this.f9928b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f9928b.add(new c(new OutputBuffer.a() { // from class: c.n.b.b.x1.n.b
                @Override // p007c.p190n.p194b.p209b.p217p1.OutputBuffer.a
                /* JADX INFO: renamed from: a */
                public final void mo3639a(OutputBuffer outputBuffer) {
                    CeaDecoder ceaDecoder = this.f9840a;
                    CeaDecoder.c cVar = (CeaDecoder.c) outputBuffer;
                    Objects.requireNonNull(ceaDecoder);
                    cVar.f7262f = 0;
                    cVar.f9822h = null;
                    ceaDecoder.f9928b.add(cVar);
                }
            }));
        }
        this.f9929c = new PriorityQueue<>();
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.SubtitleDecoder
    /* JADX INFO: renamed from: a */
    public void mo4393a(long j2) {
        this.f9931e = j2;
    }

    @Override // p007c.p190n.p194b.p209b.p217p1.Decoder
    /* JADX INFO: renamed from: c */
    public SubtitleInputBuffer mo3631c() throws DecoderException {
        C2096e.m4570f(this.f9930d == null);
        if (this.f9927a.isEmpty()) {
            return null;
        }
        b bVarPollFirst = this.f9927a.pollFirst();
        this.f9930d = bVarPollFirst;
        return bVarPollFirst;
    }

    @Override // p007c.p190n.p194b.p209b.p217p1.Decoder
    /* JADX INFO: renamed from: d */
    public void mo3632d(SubtitleInputBuffer subtitleInputBuffer) throws DecoderException {
        SubtitleInputBuffer subtitleInputBuffer2 = subtitleInputBuffer;
        C2096e.m4566b(subtitleInputBuffer2 == this.f9930d);
        b bVar = (b) subtitleInputBuffer2;
        if (bVar.m3627u()) {
            m4432i(bVar);
        } else {
            long j2 = this.f9932f;
            this.f9932f = 1 + j2;
            bVar.f9933o = j2;
            this.f9929c.add(bVar);
        }
        this.f9930d = null;
    }

    /* JADX INFO: renamed from: e */
    public abstract Subtitle mo4407e();

    /* JADX INFO: renamed from: f */
    public abstract void mo4408f(SubtitleInputBuffer subtitleInputBuffer);

    @Override // p007c.p190n.p194b.p209b.p217p1.Decoder
    public void flush() {
        this.f9932f = 0L;
        this.f9931e = 0L;
        while (!this.f9929c.isEmpty()) {
            b bVarPoll = this.f9929c.poll();
            int i = Util6.f6307a;
            m4432i(bVarPoll);
        }
        b bVar = this.f9930d;
        if (bVar != null) {
            m4432i(bVar);
            this.f9930d = null;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p217p1.Decoder
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public SubtitleOutputBuffer mo3630b() throws SubtitleDecoderException {
        if (this.f9928b.isEmpty()) {
            return null;
        }
        while (!this.f9929c.isEmpty()) {
            b bVarPeek = this.f9929c.peek();
            int i = Util6.f6307a;
            if (bVarPeek.f7289j > this.f9931e) {
                break;
            }
            b bVarPoll = this.f9929c.poll();
            if (bVarPoll.m3628v()) {
                SubtitleOutputBuffer subtitleOutputBufferPollFirst = this.f9928b.pollFirst();
                subtitleOutputBufferPollFirst.m3624m(4);
                m4432i(bVarPoll);
                return subtitleOutputBufferPollFirst;
            }
            mo4408f(bVarPoll);
            if (mo4410h()) {
                Subtitle subtitleMo4407e = mo4407e();
                SubtitleOutputBuffer subtitleOutputBufferPollFirst2 = this.f9928b.pollFirst();
                subtitleOutputBufferPollFirst2.m4400z(bVarPoll.f7289j, subtitleMo4407e, Long.MAX_VALUE);
                m4432i(bVarPoll);
                return subtitleOutputBufferPollFirst2;
            }
            m4432i(bVarPoll);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo4410h();

    /* JADX INFO: renamed from: i */
    public final void m4432i(b bVar) {
        bVar.mo3635x();
        this.f9927a.add(bVar);
    }

    @Override // p007c.p190n.p194b.p209b.p217p1.Decoder
    public void release() {
    }
}
