package p007c.p190n.p194b.p209b.p234u1;

import java.nio.ByteBuffer;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.u1.h, reason: use source file name */
/* JADX INFO: compiled from: SimpleMetadataDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleMetadataDecoder implements MetadataDecoder {
    @Override // p007c.p190n.p194b.p209b.p234u1.MetadataDecoder
    /* JADX INFO: renamed from: a */
    public final Metadata mo4014a(MetadataInputBuffer metadataInputBuffer) {
        ByteBuffer byteBuffer = metadataInputBuffer.f7287h;
        Objects.requireNonNull(byteBuffer);
        C2096e.m4566b(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (metadataInputBuffer.m3627u()) {
            return null;
        }
        return mo4018b(metadataInputBuffer, byteBuffer);
    }

    /* JADX INFO: renamed from: b */
    public abstract Metadata mo4018b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer);
}
