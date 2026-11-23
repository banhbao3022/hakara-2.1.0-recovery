package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(19)
public final class ci2 extends bi2 {

    /* JADX INFO: renamed from: j */
    public final AudioTimestamp f13033j = new AudioTimestamp();

    /* JADX INFO: renamed from: k */
    public long f13034k;

    /* JADX INFO: renamed from: l */
    public long f13035l;

    /* JADX INFO: renamed from: m */
    public long f13036m;

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bi2
    /* JADX INFO: renamed from: a */
    public final void mo6016a(AudioTrack audioTrack, boolean z) {
        super.mo6016a(audioTrack, z);
        this.f13034k = 0L;
        this.f13035l = 0L;
        this.f13036m = 0L;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bi2
    /* JADX INFO: renamed from: c */
    public final boolean mo6018c() {
        boolean timestamp = this.f12697a.getTimestamp(this.f13033j);
        if (timestamp) {
            long j2 = this.f13033j.framePosition;
            if (this.f13035l > j2) {
                this.f13034k++;
            }
            this.f13035l = j2;
            this.f13036m = j2 + (this.f13034k << 32);
        }
        return timestamp;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bi2
    /* JADX INFO: renamed from: d */
    public final long mo6019d() {
        return this.f13033j.nanoTime;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bi2
    /* JADX INFO: renamed from: e */
    public final long mo6020e() {
        return this.f13036m;
    }
}
