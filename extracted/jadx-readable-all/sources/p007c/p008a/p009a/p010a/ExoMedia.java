package p007c.p008a.p009a.p010a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p007c.p008a.p009a.p010a.p014h.p021j.MediaSourceProvider;
import p007c.p008a.p009a.p010a.p014h.p021j.p022b.DashMediaSourceBuilder;
import p007c.p008a.p009a.p010a.p014h.p021j.p022b.HlsMediaSourceBuilder;
import p007c.p008a.p009a.p010a.p014h.p021j.p022b.SsMediaSourceBuilder;

/* JADX INFO: renamed from: c.a.a.a.c, reason: use source file name */
/* JADX INFO: compiled from: ExoMedia.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ExoMedia {

    /* JADX INFO: renamed from: a */
    public static final Map<ExoMedia3, List<String>> f1493a;

    /* JADX INFO: renamed from: b */
    public static final List<MediaSourceProvider.b> f1494b;

    /* JADX INFO: renamed from: c */
    public static volatile ExoMedia2 f1495c;

    /* JADX INFO: renamed from: d */
    public static volatile MediaSourceProvider f1496d;

    /* JADX INFO: renamed from: e */
    public static final ExoMedia f1497e = null;

    static {
        HashMap map = new HashMap();
        f1493a = map;
        ArrayList arrayList = new ArrayList();
        f1494b = arrayList;
        f1496d = new MediaSourceProvider();
        ExoMedia3 exoMedia3 = ExoMedia3.AUDIO;
        map.put(exoMedia3, new LinkedList());
        ExoMedia3 exoMedia4 = ExoMedia3.VIDEO;
        map.put(exoMedia4, new LinkedList());
        map.put(ExoMedia3.CLOSED_CAPTION, new LinkedList());
        map.put(ExoMedia3.METADATA, new LinkedList());
        List list = (List) map.get(exoMedia3);
        if (list != null) {
            list.add("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer");
            list.add("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer");
            list.add("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer");
        }
        List list2 = (List) map.get(exoMedia4);
        if (list2 != null) {
            list2.add("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer");
        }
        arrayList.add(new MediaSourceProvider.b(new HlsMediaSourceBuilder(), null, ".m3u8", ".*\\.m3u8.*"));
        arrayList.add(new MediaSourceProvider.b(new DashMediaSourceBuilder(), null, ".mpd", ".*\\.mpd.*"));
        arrayList.add(new MediaSourceProvider.b(new SsMediaSourceBuilder(), null, ".ism", ".*\\.ism.*"));
    }
}
