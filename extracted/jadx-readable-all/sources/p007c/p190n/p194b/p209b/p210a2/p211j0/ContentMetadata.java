package p007c.p190n.p194b.p209b.p210a2.p211j0;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: c.n.b.b.a2.j0.m, reason: use source file name */
/* JADX INFO: compiled from: ContentMetadata.java */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ContentMetadata {
    /* JADX INFO: renamed from: a */
    public static long m2982a(ContentMetadata2 contentMetadata2) {
        byte[] bArr = ((DefaultContentMetadata) contentMetadata2).f6109c.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }
}
