package p007c.p190n.p194b.p209b.p234u1.p236j;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.MetadataInputBuffer;
import p007c.p190n.p194b.p209b.p234u1.SimpleMetadataDecoder;

/* JADX INFO: renamed from: c.n.b.b.u1.j.b, reason: use source file name */
/* JADX INFO: compiled from: EventMessageDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class EventMessageDecoder extends SimpleMetadataDecoder {
    @Override // p007c.p190n.p194b.p209b.p234u1.SimpleMetadataDecoder
    /* JADX INFO: renamed from: b */
    public Metadata mo4018b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return new Metadata(m4019c(new ParsableByteArray(byteBuffer.array(), byteBuffer.limit())));
    }

    /* JADX INFO: renamed from: c */
    public EventMessage m4019c(ParsableByteArray parsableByteArray) {
        String strM3209n = parsableByteArray.m3209n();
        Objects.requireNonNull(strM3209n);
        String strM3209n2 = parsableByteArray.m3209n();
        Objects.requireNonNull(strM3209n2);
        return new EventMessage(strM3209n, strM3209n2, parsableByteArray.m3215t(), parsableByteArray.m3215t(), Arrays.copyOfRange(parsableByteArray.f6392a, parsableByteArray.f6393b, parsableByteArray.f6394c));
    }
}
