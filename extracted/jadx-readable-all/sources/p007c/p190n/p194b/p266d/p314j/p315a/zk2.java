package p007c.p190n.p194b.p266d.p314j.p315a;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zk2 implements yk2 {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.yk2
    /* JADX INFO: renamed from: A */
    public final MediaCodecInfo mo5825A(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.yk2
    /* JADX INFO: renamed from: a */
    public final boolean mo5826a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.yk2
    /* JADX INFO: renamed from: b */
    public final boolean mo5827b() {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.yk2
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }
}
