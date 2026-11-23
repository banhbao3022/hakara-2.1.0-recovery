package p007c.p190n.p194b.p209b.p252x1;

import java.nio.ByteBuffer;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p217p1.DecoderException;
import p007c.p190n.p194b.p209b.p217p1.DecoderInputBuffer;
import p007c.p190n.p194b.p209b.p217p1.OutputBuffer;
import p007c.p190n.p194b.p209b.p217p1.SimpleDecoder;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.x1.d, reason: use source file name */
/* JADX INFO: compiled from: SimpleSubtitleDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleSubtitleDecoder extends SimpleDecoder<SubtitleInputBuffer, SubtitleOutputBuffer, SubtitleDecoderException> implements SubtitleDecoder {
    public SimpleSubtitleDecoder(String str) {
        super(new SubtitleInputBuffer[2], new SubtitleOutputBuffer[2]);
        C2096e.m4570f(this.f7305g == this.f7303e.length);
        for (DecoderInputBuffer decoderInputBuffer : this.f7303e) {
            decoderInputBuffer.m3637z(1024);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.SubtitleDecoder
    /* JADX INFO: renamed from: a */
    public void mo4393a(long j2) {
    }

    @Override // p007c.p190n.p194b.p209b.p217p1.SimpleDecoder
    /* JADX INFO: renamed from: e */
    public DecoderException mo3640e(DecoderInputBuffer decoderInputBuffer, OutputBuffer outputBuffer, boolean z) {
        SubtitleInputBuffer subtitleInputBuffer = (SubtitleInputBuffer) decoderInputBuffer;
        SubtitleOutputBuffer subtitleOutputBuffer = (SubtitleOutputBuffer) outputBuffer;
        try {
            ByteBuffer byteBuffer = subtitleInputBuffer.f7287h;
            Objects.requireNonNull(byteBuffer);
            subtitleOutputBuffer.m4400z(subtitleInputBuffer.f7289j, mo4394j(byteBuffer.array(), byteBuffer.limit(), z), subtitleInputBuffer.f9821n);
            subtitleOutputBuffer.f7262f &= Integer.MAX_VALUE;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract Subtitle mo4394j(byte[] bArr, int i, boolean z) throws SubtitleDecoderException;
}
