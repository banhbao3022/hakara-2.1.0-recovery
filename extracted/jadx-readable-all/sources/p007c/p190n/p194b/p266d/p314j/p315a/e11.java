package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class e11 implements eb0 {

    /* JADX INFO: renamed from: a */
    public final FileChannel f13448a;

    /* JADX INFO: renamed from: b */
    public final long f13449b;

    /* JADX INFO: renamed from: c */
    public final long f13450c;

    public e11(FileChannel fileChannel, long j2, long j3) {
        this.f13448a = fileChannel;
        this.f13449b = j2;
        this.f13450c = j3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.eb0
    /* JADX INFO: renamed from: a */
    public final void mo6579a(MessageDigest[] messageDigestArr, long j2, int i) throws IOException {
        MappedByteBuffer map = this.f13448a.map(FileChannel.MapMode.READ_ONLY, this.f13449b + j2, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.eb0
    public final long zza() {
        return this.f13450c;
    }
}
