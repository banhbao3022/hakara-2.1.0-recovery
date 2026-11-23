package p007c.p190n.p194b.p266d.p314j.p315a;

import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.os.Build;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.util.HashMap;

/* JADX INFO: renamed from: c.n.b.d.j.a.vo */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3629vo implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MediaPlayer f20867f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC2963dp f20868g;

    public RunnableC3629vo(TextureViewSurfaceTextureListenerC2963dp textureViewSurfaceTextureListenerC2963dp, MediaPlayer mediaPlayer) {
        this.f20868g = textureViewSurfaceTextureListenerC2963dp;
        this.f20867f = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaPlayer.TrackInfo[] trackInfo;
        MediaFormat format;
        TextureViewSurfaceTextureListenerC2963dp textureViewSurfaceTextureListenerC2963dp = this.f20868g;
        MediaPlayer mediaPlayer = this.f20867f;
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14333d1)).booleanValue() && textureViewSurfaceTextureListenerC2963dp.f13344i != null && mediaPlayer != null && (trackInfo = mediaPlayer.getTrackInfo()) != null) {
            HashMap map = new HashMap();
            for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                if (trackInfo2 != null) {
                    int trackType = trackInfo2.getTrackType();
                    if (trackType == 1) {
                        MediaFormat format2 = trackInfo2.getFormat();
                        if (format2 != null) {
                            if (format2.containsKey("frame-rate")) {
                                try {
                                    map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                } catch (ClassCastException unused) {
                                    map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                }
                            }
                            if (format2.containsKey(CainMediaMetadataRetriever.METADATA_KEY_BITRATE)) {
                                Integer numValueOf = Integer.valueOf(format2.getInteger(CainMediaMetadataRetriever.METADATA_KEY_BITRATE));
                                textureViewSurfaceTextureListenerC2963dp.f13358w = numValueOf;
                                map.put("bitRate", String.valueOf(numValueOf));
                            }
                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                int integer = format2.getInteger("width");
                                int integer2 = format2.getInteger("height");
                                StringBuilder sb = new StringBuilder(23);
                                sb.append(integer);
                                sb.append("x");
                                sb.append(integer2);
                                map.put("resolution", sb.toString());
                            }
                            if (format2.containsKey("mime")) {
                                map.put("videoMime", format2.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                map.put("videoCodec", format2.getString("codecs-string"));
                            }
                        }
                    } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                        if (format.containsKey("mime")) {
                            map.put("audioMime", format.getString("mime"));
                        }
                        if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                            map.put("audioCodec", format.getString("codecs-string"));
                        }
                    }
                }
            }
            if (!map.isEmpty()) {
                textureViewSurfaceTextureListenerC2963dp.f13344i.mo6501r0("onMetadataEvent", map);
            }
        }
        InterfaceC3000ep interfaceC3000ep = this.f20868g.f13357v;
        if (interfaceC3000ep != null) {
            ((C3333np) interfaceC3000ep).m7902e();
        }
    }
}
