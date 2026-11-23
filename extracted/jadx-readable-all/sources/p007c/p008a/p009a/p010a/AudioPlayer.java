package p007c.p008a.p009a.p010a;

import android.content.Context;
import android.net.Uri;
import p007c.p008a.p009a.p010a.p014h.ListenerMux;
import p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi;
import p007c.p008a.p009a.p010a.p014h.p016e.ExoAudioPlayer;
import p007c.p008a.p009a.p010a.p014h.p016e.NativeAudioPlayer;
import p007c.p008a.p009a.p010a.p014h.p018g.ExoMediaPlayer;
import p007c.p008a.p009a.p010a.p028j.DeviceUtil;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.b, reason: use source file name */
/* JADX INFO: compiled from: AudioPlayer.kt */
/* JADX INFO: loaded from: classes.dex */
public class AudioPlayer implements AudioPlayerApi {

    /* JADX INFO: renamed from: a */
    public final ListenerMux f1489a;

    /* JADX INFO: renamed from: b */
    public long f1490b;

    /* JADX INFO: renamed from: c */
    public final AudioPlayerApi f1491c;

    /* JADX INFO: renamed from: c.a.a.a.b$a */
    /* JADX INFO: compiled from: AudioPlayer.kt */
    public final class a extends ListenerMux.b {
        public a() {
        }

        @Override // p007c.p008a.p009a.p010a.p014h.ListenerMux.b
        /* JADX INFO: renamed from: a */
        public void mo1007a(ExoMediaPlayer exoMediaPlayer, Exception exc) {
            Intrinsics2.m13089e(exoMediaPlayer, "exoMediaPlayer");
            AudioPlayer.this.f1491c.mo1005c();
            exoMediaPlayer.f1538m = false;
        }

        @Override // p007c.p008a.p009a.p010a.p014h.ListenerMux.b
        /* JADX INFO: renamed from: b */
        public void mo1008b() {
            AudioPlayer.this.f1491c.pause();
        }

        @Override // p007c.p008a.p009a.p010a.p014h.ListenerMux.b
        /* JADX INFO: renamed from: c */
        public void mo1009c() {
            AudioPlayer.this.f1491c.mo1003a();
        }

        @Override // p007c.p008a.p009a.p010a.p014h.ListenerMux.b
        /* JADX INFO: renamed from: g */
        public boolean mo1010g(long j2) {
            return AudioPlayer.this.getCurrentPosition() > 0 && AudioPlayer.this.getDuration() > 0 && AudioPlayer.this.getCurrentPosition() + j2 >= AudioPlayer.this.getDuration();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioPlayer(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public AudioPlayer(AudioPlayerApi audioPlayerApi) {
        Intrinsics2.m13089e(audioPlayerApi, "audioPlayerImpl");
        this.f1491c = audioPlayerApi;
        ListenerMux listenerMux = new ListenerMux(new a());
        this.f1489a = listenerMux;
        this.f1490b = -1L;
        audioPlayerApi.setListenerMux(listenerMux);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    /* JADX INFO: renamed from: a */
    public void mo1003a() {
        this.f1491c.mo1003a();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    /* JADX INFO: renamed from: b */
    public void mo1004b(Uri uri, MediaSource2 mediaSource2) {
        this.f1491c.mo1004b(uri, mediaSource2);
        this.f1490b = -1L;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    /* JADX INFO: renamed from: c */
    public void mo1005c() {
        this.f1491c.mo1005c();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public long getCurrentPosition() {
        return this.f1491c.getCurrentPosition();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public long getDuration() {
        long j2 = this.f1490b;
        return j2 >= 0 ? j2 : this.f1491c.getDuration();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public boolean isPlaying() {
        return this.f1491c.isPlaying();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void pause() {
        this.f1491c.pause();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void prepareAsync() {
        this.f1491c.prepareAsync();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void release() {
        this.f1491c.release();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void reset() {
        this.f1491c.mo1005c();
        mo1004b(null, null);
        this.f1491c.reset();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void setAudioStreamType(int i) {
        this.f1491c.setAudioStreamType(i);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void setListenerMux(ListenerMux listenerMux) {
        Intrinsics2.m13089e(listenerMux, "listenerMux");
        this.f1491c.setListenerMux(listenerMux);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void setVolume(float f, float f2) {
        this.f1491c.setVolume(f, f2);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void setWakeMode(Context context, int i) {
        Intrinsics2.m13089e(context, "context");
        this.f1491c.setWakeMode(context, i);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void start() {
        this.f1491c.start();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    /* JADX INFO: renamed from: x */
    public void mo1006x(long j2) {
        this.f1491c.mo1006x(j2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioPlayer(Context context, DeviceUtil deviceUtil) {
        this(deviceUtil.m1211a(context) ? new ExoAudioPlayer(context) : new NativeAudioPlayer(context));
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(deviceUtil, "deviceUtil");
    }

    public /* synthetic */ AudioPlayer(Context context, DeviceUtil deviceUtil, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new DeviceUtil() : deviceUtil);
    }
}
