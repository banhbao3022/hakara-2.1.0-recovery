package p007c.p008a.p009a.p010a.p014h.p016e;

import android.content.Context;
import android.net.Uri;
import android.os.PowerManager;
import android.util.Log;
import java.util.Objects;
import p007c.p008a.p009a.p010a.p014h.ListenerMux;
import p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi;
import p007c.p008a.p009a.p010a.p014h.p018g.ExoMediaPlayer;
import p007c.p008a.p009a.p010a.p014h.p019h.MetadataListener;
import p007c.p008a.p009a.p010a.p027i.OnBufferUpdateListener;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p215n1.AudioAttributes;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.h.e.a, reason: use source file name */
/* JADX INFO: compiled from: ExoAudioPlayer.kt */
/* JADX INFO: loaded from: classes.dex */
public class ExoAudioPlayer implements AudioPlayerApi {

    /* JADX INFO: renamed from: a */
    public final ExoMediaPlayer f1519a;

    /* JADX INFO: renamed from: b */
    public ListenerMux f1520b;

    /* JADX INFO: renamed from: c */
    public a f1521c;

    /* JADX INFO: renamed from: d */
    public final Context f1522d;

    /* JADX INFO: renamed from: c.a.a.a.h.e.a$a */
    /* JADX INFO: compiled from: ExoAudioPlayer.kt */
    public final class a implements MetadataListener, OnBufferUpdateListener {
        public a() {
        }

        @Override // p007c.p008a.p009a.p010a.p014h.p019h.MetadataListener
        /* JADX INFO: renamed from: a */
        public void mo1054a(Metadata metadata) {
            Intrinsics2.m13089e(metadata, "metadata");
            ListenerMux listenerMux = ExoAudioPlayer.this.f1520b;
            if (listenerMux != null) {
                listenerMux.mo1054a(metadata);
            }
        }

        @Override // p007c.p008a.p009a.p010a.p027i.OnBufferUpdateListener
        /* JADX INFO: renamed from: e */
        public void mo1062e(int i) {
            ListenerMux listenerMux = ExoAudioPlayer.this.f1520b;
            if (listenerMux != null) {
                Objects.requireNonNull(listenerMux.f1516r);
                OnBufferUpdateListener onBufferUpdateListener = listenerMux.f1507i;
                if (onBufferUpdateListener != null) {
                    onBufferUpdateListener.mo1062e(i);
                }
            }
        }
    }

    public ExoAudioPlayer(Context context) {
        Intrinsics2.m13089e(context, "context");
        this.f1522d = context;
        ExoMediaPlayer exoMediaPlayer = new ExoMediaPlayer(context);
        this.f1519a = exoMediaPlayer;
        a aVar = new a();
        this.f1521c = aVar;
        exoMediaPlayer.f1546u = aVar;
        exoMediaPlayer.f1547v = aVar;
        exoMediaPlayer.m1116l(true);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    /* JADX INFO: renamed from: a */
    public void mo1003a() {
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    /* JADX INFO: renamed from: b */
    public void mo1004b(Uri uri, MediaSource2 mediaSource2) {
        ListenerMux listenerMux = this.f1520b;
        if (listenerMux != null) {
            listenerMux.f1513o = false;
            listenerMux.f1516r.mo1089d(true);
        }
        ExoMediaPlayer.m1097i(this.f1519a, 0L, false, 2);
        if (mediaSource2 != null) {
            this.f1519a.m1118n(mediaSource2);
            ListenerMux listenerMux2 = this.f1520b;
            if (listenerMux2 != null) {
                listenerMux2.f1514p = false;
                return;
            }
            return;
        }
        if (uri == null) {
            this.f1519a.m1118n(null);
            return;
        }
        this.f1519a.m1122r(uri);
        ListenerMux listenerMux3 = this.f1520b;
        if (listenerMux3 != null) {
            listenerMux3.f1514p = false;
        }
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    /* JADX INFO: renamed from: c */
    public void mo1005c() {
        this.f1519a.m1125u();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public long getCurrentPosition() {
        ListenerMux listenerMux = this.f1520b;
        Intrinsics2.m13087c(listenerMux);
        if (listenerMux.f1513o) {
            return this.f1519a.m1110e();
        }
        return 0L;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public long getDuration() {
        ListenerMux listenerMux = this.f1520b;
        Intrinsics2.m13087c(listenerMux);
        if (listenerMux.f1513o) {
            return this.f1519a.f1532g.getDuration();
        }
        return 0L;
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public boolean isPlaying() {
        return this.f1519a.f1532g.mo3334f();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void pause() {
        this.f1519a.m1120p(false);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void prepareAsync() {
        this.f1519a.m1111f();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void release() {
        this.f1519a.m1112g();
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void reset() {
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void setAudioStreamType(int i) {
        int i2;
        ExoMediaPlayer exoMediaPlayer = this.f1519a;
        Objects.requireNonNull(exoMediaPlayer);
        int i3 = Util6.f6307a;
        int i4 = 4;
        if (i == 0) {
            i2 = 2;
        } else if (i == 1) {
            i2 = 13;
        } else if (i == 2) {
            i2 = 6;
        } else if (i == 4) {
            i2 = 4;
        } else if (i != 5) {
            i2 = i != 8 ? 1 : 3;
        } else {
            i2 = 5;
        }
        if (i == 0) {
            i4 = 1;
        } else if (i != 1 && i != 2 && i != 4 && i != 5 && i != 8) {
            i4 = 2;
        }
        AudioAttributes.b bVar = new AudioAttributes.b();
        bVar.f7103b = i2;
        bVar.f7102a = i4;
        AudioAttributes audioAttributes = new AudioAttributes(bVar.f7102a, 0, bVar.f7103b, bVar.f7104c, null);
        Intrinsics2.m13088d(audioAttributes, "AudioAttributes.Builder(…entType)\n        .build()");
        exoMediaPlayer.m1115k(1, 3, audioAttributes, false);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void setListenerMux(ListenerMux listenerMux) {
        Intrinsics2.m13089e(listenerMux, "listenerMux");
        ListenerMux listenerMux2 = this.f1520b;
        if (listenerMux2 != null) {
            ExoMediaPlayer exoMediaPlayer = this.f1519a;
            Objects.requireNonNull(exoMediaPlayer);
            Intrinsics2.m13089e(listenerMux2, "listener");
            exoMediaPlayer.f1536k.remove(listenerMux2);
            ExoMediaPlayer exoMediaPlayer2 = this.f1519a;
            Objects.requireNonNull(exoMediaPlayer2);
            Intrinsics2.m13089e(listenerMux2, "listener");
            exoMediaPlayer2.f1550y.f6902k.m3151d(listenerMux2);
        }
        this.f1520b = listenerMux;
        ExoMediaPlayer exoMediaPlayer3 = this.f1519a;
        Objects.requireNonNull(exoMediaPlayer3);
        Intrinsics2.m13089e(listenerMux, "listener");
        exoMediaPlayer3.f1536k.add(listenerMux);
        this.f1519a.m1107b(listenerMux);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void setVolume(float f, float f2) {
        ExoMediaPlayer exoMediaPlayer = this.f1519a;
        float f3 = (f + f2) / 2;
        exoMediaPlayer.f1549x = f3;
        exoMediaPlayer.m1115k(1, 2, Float.valueOf(f3), false);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void setWakeMode(Context context, int i) {
        boolean z;
        Intrinsics2.m13089e(context, "context");
        ExoMediaPlayer exoMediaPlayer = this.f1519a;
        Objects.requireNonNull(exoMediaPlayer);
        Intrinsics2.m13089e(context, "context");
        PowerManager.WakeLock wakeLock = exoMediaPlayer.f1548w;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                z = true;
                wakeLock.release();
            } else {
                z = false;
            }
            exoMediaPlayer.f1548w = null;
        } else {
            z = false;
        }
        if (context.getPackageManager().checkPermission("android.permission.WAKE_LOCK", context.getPackageName()) == 0) {
            Object systemService = context.getSystemService("power");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(i | 536870912, ExoMediaPlayer.class.getName());
            wakeLockNewWakeLock.setReferenceCounted(false);
            exoMediaPlayer.f1548w = wakeLockNewWakeLock;
        } else {
            Log.w("ExoMediaPlayer", "Unable to acquire WAKE_LOCK due to missing manifest permission");
        }
        exoMediaPlayer.m1124t(z);
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    public void start() {
        this.f1519a.m1120p(true);
        ListenerMux listenerMux = this.f1520b;
        if (listenerMux != null) {
            listenerMux.f1514p = false;
        }
    }

    @Override // p007c.p008a.p009a.p010a.p014h.p015d.AudioPlayerApi
    /* JADX INFO: renamed from: x */
    public void mo1006x(long j2) {
        ExoMediaPlayer.m1097i(this.f1519a, j2, false, 2);
    }
}
