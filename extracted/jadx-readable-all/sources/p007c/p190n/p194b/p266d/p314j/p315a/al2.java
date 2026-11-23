package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
public final class al2 implements yk2 {

    /* JADX INFO: renamed from: a */
    public final int f12200a;

    /* JADX INFO: renamed from: b */
    public MediaCodecInfo[] f12201b;

    public al2(boolean z) {
        this.f12200a = z ? 1 : 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.yk2
    /* JADX INFO: renamed from: A */
    public final MediaCodecInfo mo5825A(int i) {
        if (this.f12201b == null) {
            this.f12201b = new MediaCodecList(this.f12200a).getCodecInfos();
        }
        return this.f12201b[i];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.yk2
    /* JADX INFO: renamed from: a */
    public final boolean mo5826a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.yk2
    /* JADX INFO: renamed from: b */
    public final boolean mo5827b() {
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.yk2
    public final int zza() {
        if (this.f12201b == null) {
            this.f12201b = new MediaCodecList(this.f12200a).getCodecInfos();
        }
        return this.f12201b.length;
    }
}
