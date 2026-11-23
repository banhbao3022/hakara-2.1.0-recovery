package p007c.p190n.p194b.p209b.p233t1;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.t1.n, reason: use source file name */
/* JADX INFO: compiled from: MediaCodecUtil.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {

    /* JADX INFO: renamed from: a */
    public static final Pattern f8634a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b */
    public static final HashMap<b, List<MediaCodecInfo>> f8635b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static int f8636c = -1;

    /* JADX INFO: renamed from: c.n.b.b.t1.n$b */
    /* JADX INFO: compiled from: MediaCodecUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f8637a;

        /* JADX INFO: renamed from: b */
        public final boolean f8638b;

        /* JADX INFO: renamed from: c */
        public final boolean f8639c;

        public b(String str, boolean z, boolean z2) {
            this.f8637a = str;
            this.f8638b = z;
            this.f8639c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f8637a, bVar.f8637a) && this.f8638b == bVar.f8638b && this.f8639c == bVar.f8639c;
        }

        public int hashCode() {
            return ((outline.m1569T(this.f8637a, 31, 31) + (this.f8638b ? 1231 : 1237)) * 31) + (this.f8639c ? 1231 : 1237);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.t1.n$c */
    /* JADX INFO: compiled from: MediaCodecUtil.java */
    public static class c extends Exception {
        public c(Throwable th, a aVar) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.t1.n$d */
    /* JADX INFO: compiled from: MediaCodecUtil.java */
    public interface d {
        /* JADX INFO: renamed from: a */
        MediaCodecInfo mo3994a(int i);

        /* JADX INFO: renamed from: b */
        boolean mo3995b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* JADX INFO: renamed from: c */
        boolean mo3996c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* JADX INFO: renamed from: d */
        int mo3997d();

        /* JADX INFO: renamed from: e */
        boolean mo3998e();
    }

    /* JADX INFO: renamed from: c.n.b.b.t1.n$e */
    /* JADX INFO: compiled from: MediaCodecUtil.java */
    public static final class e implements d {
        public e(a aVar) {
        }

        @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecUtil.d
        /* JADX INFO: renamed from: a */
        public MediaCodecInfo mo3994a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecUtil.d
        /* JADX INFO: renamed from: b */
        public boolean mo3995b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecUtil.d
        /* JADX INFO: renamed from: c */
        public boolean mo3996c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecUtil.d
        /* JADX INFO: renamed from: d */
        public int mo3997d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecUtil.d
        /* JADX INFO: renamed from: e */
        public boolean mo3998e() {
            return false;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.t1.n$f */
    /* JADX INFO: compiled from: MediaCodecUtil.java */
    public static final class f implements d {

        /* JADX INFO: renamed from: a */
        public final int f8640a;

        /* JADX INFO: renamed from: b */
        public MediaCodecInfo[] f8641b;

        public f(boolean z, boolean z2) {
            this.f8640a = (z || z2) ? 1 : 0;
        }

        @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecUtil.d
        /* JADX INFO: renamed from: a */
        public MediaCodecInfo mo3994a(int i) {
            if (this.f8641b == null) {
                this.f8641b = new MediaCodecList(this.f8640a).getCodecInfos();
            }
            return this.f8641b[i];
        }

        @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecUtil.d
        /* JADX INFO: renamed from: b */
        public boolean mo3995b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecUtil.d
        /* JADX INFO: renamed from: c */
        public boolean mo3996c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecUtil.d
        /* JADX INFO: renamed from: d */
        public int mo3997d() {
            if (this.f8641b == null) {
                this.f8641b = new MediaCodecList(this.f8640a).getCodecInfos();
            }
            return this.f8641b.length;
        }

        @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecUtil.d
        /* JADX INFO: renamed from: e */
        public boolean mo3998e() {
            return true;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.t1.n$g */
    /* JADX INFO: compiled from: MediaCodecUtil.java */
    public interface g<T> {
        /* JADX INFO: renamed from: a */
        int mo3931a(T t);
    }

    /* JADX INFO: renamed from: a */
    public static void m3984a(String str, List<MediaCodecInfo> list) {
        if ("audio/raw".equals(str)) {
            if (Util6.f6307a < 26 && Util6.f6308b.equals("R9") && list.size() == 1 && list.get(0).f8552a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(MediaCodecInfo.m3952i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            m3993j(list, new g() { // from class: c.n.b.b.t1.a
                @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecUtil.g
                /* JADX INFO: renamed from: a */
                public final int mo3931a(Object obj) {
                    Pattern pattern = MediaCodecUtil.f8634a;
                    String str2 = ((MediaCodecInfo) obj).f8552a;
                    if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                        return 1;
                    }
                    return (Util6.f6307a >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                }
            });
        }
        int i = Util6.f6307a;
        if (i < 21 && list.size() > 1) {
            String str2 = list.get(0).f8552a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                m3993j(list, new g() { // from class: c.n.b.b.t1.b
                    @Override // p007c.p190n.p194b.p209b.p233t1.MediaCodecUtil.g
                    /* JADX INFO: renamed from: a */
                    public final int mo3931a(Object obj) {
                        Pattern pattern = MediaCodecUtil.f8634a;
                        return ((MediaCodecInfo) obj).f8552a.startsWith("OMX.google") ? 1 : 0;
                    }
                });
            }
        }
        if (i >= 30 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f8552a)) {
            return;
        }
        list.add(list.remove(0));
    }

    /* JADX INFO: renamed from: b */
    public static String m3985b(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:134:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:150:0x0204  */
    /* JADX WARN: Code duplicated, block: B:187:0x026f  */
    /* JADX WARN: Code duplicated, block: B:283:0x03a0 A[Catch: NumberFormatException -> 0x03b0, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x03b0, blocks: (B:253:0x0335, B:255:0x0349, B:267:0x0368, B:283:0x03a0), top: B:568:0x0335 }] */
    /* JADX WARN: Code duplicated, block: B:409:0x0551  */
    /* JADX WARN: Code duplicated, block: B:438:0x0610  */
    /* JADX WARN: Code duplicated, block: B:523:0x0764  */
    /* JADX WARN: Code duplicated, block: B:524:0x0766  */
    /* JADX WARN: Code duplicated, block: B:532:0x0777  */
    /* JADX WARN: Code duplicated, block: B:534:0x077b  */
    /* JADX WARN: Code duplicated, block: B:535:0x077d  */
    /* JADX WARN: Code duplicated, block: B:536:0x0780  */
    /* JADX WARN: Code duplicated, block: B:537:0x0783  */
    /* JADX WARN: Code duplicated, block: B:538:0x0786  */
    /* JADX WARN: Code duplicated, block: B:539:0x0789  */
    /* JADX WARN: Code duplicated, block: B:540:0x078c  */
    /* JADX WARN: Code duplicated, block: B:541:0x078f  */
    /* JADX WARN: Code duplicated, block: B:542:0x0792  */
    /* JADX WARN: Code duplicated, block: B:543:0x0795  */
    /* JADX WARN: Code duplicated, block: B:544:0x0799  */
    /* JADX WARN: Code duplicated, block: B:545:0x079c  */
    /* JADX WARN: Code duplicated, block: B:546:0x079f  */
    /* JADX WARN: Code duplicated, block: B:547:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:548:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:549:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:550:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:551:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:552:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:553:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:554:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:555:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:556:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:557:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:558:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:561:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:562:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:580:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x0104  */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0228, code lost:
    
        if (r1.equals("vp09") != true) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x022b, code lost:
    
        r1 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0233, code lost:
    
        if (r1.equals("mp4a") != true) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0236, code lost:
    
        r1 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x023e, code lost:
    
        if (r1.equals("hvc1") != true) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0241, code lost:
    
        r1 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0249, code lost:
    
        if (r1.equals("hev1") != true) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x024c, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0254, code lost:
    
        if (r1.equals("avc2") != true) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0257, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x025f, code lost:
    
        if (r1.equals("avc1") != true) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0262, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x026a, code lost:
    
        if (r1.equals("av01") != true) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x026d, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x026f, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0270, code lost:
    
        switch(r1) {
            case 0: goto L509;
            case 1: goto L444;
            case 2: goto L444;
            case 3: goto L287;
            case 4: goto L287;
            case 5: goto L249;
            case 6: goto L191;
            default: goto L189;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0403, code lost:
    
        if (r0.equals("L186") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0407, code lost:
    
        r6 = 25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0411, code lost:
    
        if (r0.equals("L183") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0415, code lost:
    
        r6 = 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x041f, code lost:
    
        if (r0.equals("L180") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0423, code lost:
    
        r6 = 23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x042d, code lost:
    
        if (r0.equals("L156") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0431, code lost:
    
        r6 = 22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x043b, code lost:
    
        if (r0.equals("L153") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x043f, code lost:
    
        r6 = 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0449, code lost:
    
        if (r0.equals("L150") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x044d, code lost:
    
        r6 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0457, code lost:
    
        if (r0.equals("L123") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x045b, code lost:
    
        r6 = 19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0465, code lost:
    
        if (r0.equals("L120") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0469, code lost:
    
        r6 = 18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0473, code lost:
    
        if (r0.equals("H186") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0477, code lost:
    
        r6 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0481, code lost:
    
        if (r0.equals("H183") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0485, code lost:
    
        r6 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x048f, code lost:
    
        if (r0.equals("H180") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0493, code lost:
    
        r6 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x049d, code lost:
    
        if (r0.equals("H156") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x04a1, code lost:
    
        r6 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x04ab, code lost:
    
        if (r0.equals("H153") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x04af, code lost:
    
        r6 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x04b9, code lost:
    
        if (r0.equals("H150") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x04bd, code lost:
    
        r6 = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x04c7, code lost:
    
        if (r0.equals("H123") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x04cb, code lost:
    
        r6 = 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x04d5, code lost:
    
        if (r0.equals("H120") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x04d9, code lost:
    
        r6 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x04e3, code lost:
    
        if (r0.equals("L93") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x04e7, code lost:
    
        r6 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x04f1, code lost:
    
        if (r0.equals("L90") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x04f5, code lost:
    
        r6 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x04ff, code lost:
    
        if (r0.equals("L63") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0502, code lost:
    
        r6 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x050a, code lost:
    
        if (r0.equals("L60") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x050d, code lost:
    
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0515, code lost:
    
        if (r0.equals("L30") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0518, code lost:
    
        r6 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0520, code lost:
    
        if (r0.equals("H93") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0523, code lost:
    
        r6 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x052b, code lost:
    
        if (r0.equals("H90") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x052e, code lost:
    
        r6 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0536, code lost:
    
        if (r0.equals("H63") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0539, code lost:
    
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0541, code lost:
    
        if (r0.equals("H60") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0544, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x054c, code lost:
    
        if (r0.equals("H30") != true) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x054f, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0551, code lost:
    
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0552, code lost:
    
        switch(r6) {
            case 0: goto L437;
            case 1: goto L436;
            case 2: goto L435;
            case 3: goto L434;
            case 4: goto L433;
            case 5: goto L432;
            case 6: goto L431;
            case 7: goto L430;
            case 8: goto L429;
            case 9: goto L428;
            case 10: goto L427;
            case 11: goto L426;
            case 12: goto L425;
            case 13: goto L424;
            case 14: goto L423;
            case 15: goto L422;
            case 16: goto L421;
            case 17: goto L420;
            case 18: goto L419;
            case 19: goto L418;
            case 20: goto L417;
            case 21: goto L416;
            case 22: goto L415;
            case 23: goto L414;
            case 24: goto L413;
            case 25: goto L412;
            default: goto L438;
        };
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v90 int, still in use, count: 1, list:
  (r0v90 int) from 0x0119: SWITCH (r0v90 int)
 case 1537: goto B:114:0x0174
 case 1538: goto B:110:0x016b
 case 1539: goto B:106:0x0162
 case 1540: goto B:102:0x0159
 case 1541: goto B:98:0x014e
 case 1542: goto B:94:0x0143
 case 1543: goto B:90:0x0138
 case 1544: goto B:86:0x012d
 case 1545: goto B:82:0x0121
 default: goto B:80:0x011c A[RegionRef:SW:79]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v90 int, still in use, count: 1, list:
  (r0v90 int) from 0x0119: SWITCH (r0v90 int)
 case 1537: goto B:114:0x0174
 case 1538: goto B:110:0x016b
 case 1539: goto B:106:0x0162
 case 1540: goto B:102:0x0159
 case 1541: goto B:98:0x014e
 case 1542: goto B:94:0x0143
 case 1543: goto B:90:0x0138
 case 1544: goto B:86:0x012d
 case 1545: goto B:82:0x0121
 default: goto B:80:0x011c A[RegionRef:SW:79]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m3986c(p007c.p190n.p194b.p209b.Format r15) {
        /*
            Method dump skipped, instruction units count: 2466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p209b.p233t1.MediaCodecUtil.m3986c(c.n.b.b.n0):android.util.Pair");
    }

    /* JADX INFO: renamed from: d */
    public static MediaCodecInfo m3987d(String str, boolean z, boolean z2) throws c {
        List<MediaCodecInfo> listM3988e = m3988e(str, z, z2);
        if (listM3988e.isEmpty()) {
            return null;
        }
        return listM3988e.get(0);
    }

    /* JADX INFO: renamed from: e */
    public static synchronized List<MediaCodecInfo> m3988e(String str, boolean z, boolean z2) throws c {
        b bVar = new b(str, z, z2);
        HashMap<b, List<MediaCodecInfo>> map = f8635b;
        List<MediaCodecInfo> list = map.get(bVar);
        if (list != null) {
            return list;
        }
        int i = Util6.f6307a;
        ArrayList<MediaCodecInfo> arrayListM3989f = m3989f(bVar, i >= 21 ? new f(z, z2) : new e(null));
        if (z && arrayListM3989f.isEmpty() && 21 <= i && i <= 23) {
            arrayListM3989f = m3989f(bVar, new e(null));
            if (!arrayListM3989f.isEmpty()) {
                Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListM3989f.get(0).f8552a);
            }
        }
        m3984a(str, arrayListM3989f);
        List<MediaCodecInfo> listUnmodifiableList = Collections.unmodifiableList(arrayListM3989f);
        map.put(bVar, listUnmodifiableList);
        return listUnmodifiableList;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0174 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x014b A[Catch: Exception -> 0x0199, TRY_ENTER, TryCatch #2 {Exception -> 0x0199, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:81:0x016a, B:13:0x0032, B:16:0x003d, B:75:0x0143, B:78:0x014b, B:80:0x0151, B:82:0x0174, B:83:0x0197), top: B:92:0x0008 }] */
    /* JADX INFO: renamed from: f */
    public static ArrayList<MediaCodecInfo> m3989f(b bVar, d dVar) throws c {
        String strM3985b;
        String str;
        String str2;
        int i;
        boolean z;
        int i2;
        boolean z2;
        boolean zIsHardwareAccelerated;
        boolean zIsVendor;
        String str3;
        b bVar2 = bVar;
        try {
            ArrayList<MediaCodecInfo> arrayList = new ArrayList<>();
            String str4 = bVar2.f8637a;
            int iMo3997d = dVar.mo3997d();
            boolean zMo3998e = dVar.mo3998e();
            int i3 = 0;
            while (i3 < iMo3997d) {
                MediaCodecInfo mediaCodecInfoMo3994a = dVar.mo3994a(i3);
                int i4 = Util6.f6307a;
                if (!(i4 >= 29 && mediaCodecInfoMo3994a.isAlias())) {
                    String name = mediaCodecInfoMo3994a.getName();
                    if (m3990g(mediaCodecInfoMo3994a, name, zMo3998e, str4) && (strM3985b = m3985b(mediaCodecInfoMo3994a, name, str4)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoMo3994a.getCapabilitiesForType(strM3985b);
                            boolean zMo3995b = dVar.mo3995b("tunneled-playback", strM3985b, capabilitiesForType);
                            boolean zMo3996c = dVar.mo3996c("tunneled-playback", strM3985b, capabilitiesForType);
                            boolean z3 = bVar2.f8639c;
                            if ((z3 || !zMo3996c) && (!z3 || zMo3995b)) {
                                boolean zMo3995b2 = dVar.mo3995b("secure-playback", strM3985b, capabilitiesForType);
                                boolean zMo3996c2 = dVar.mo3996c("secure-playback", strM3985b, capabilitiesForType);
                                boolean z4 = bVar2.f8638b;
                                if ((z4 || !zMo3996c2) && (!z4 || zMo3995b2)) {
                                    if (i4 >= 29) {
                                        zIsHardwareAccelerated = mediaCodecInfoMo3994a.isHardwareAccelerated();
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                        zIsHardwareAccelerated = !m3991h(mediaCodecInfoMo3994a);
                                    }
                                    boolean zM3991h = m3991h(mediaCodecInfoMo3994a);
                                    if (i4 >= 29) {
                                        zIsVendor = mediaCodecInfoMo3994a.isVendor();
                                    } else {
                                        String strM3111T = Util6.m3111T(mediaCodecInfoMo3994a.getName());
                                        if (strM3111T.startsWith("omx.google.") || strM3111T.startsWith("c2.android.") || strM3111T.startsWith("c2.google.")) {
                                            z2 = false;
                                        }
                                        zIsVendor = z2;
                                    }
                                    if (zMo3998e && bVar2.f8638b == zMo3995b2) {
                                        str = strM3985b;
                                        str3 = name;
                                        i = i3;
                                        z = zMo3998e;
                                        i2 = iMo3997d;
                                        arrayList.add(MediaCodecInfo.m3952i(name, str4, strM3985b, capabilitiesForType, zIsHardwareAccelerated, zM3991h, zIsVendor, false, false));
                                    } else {
                                        if (!zMo3998e) {
                                            try {
                                                if (!bVar2.f8638b) {
                                                    str = strM3985b;
                                                    str3 = name;
                                                    i = i3;
                                                    z = zMo3998e;
                                                    i2 = iMo3997d;
                                                    try {
                                                        arrayList.add(MediaCodecInfo.m3952i(name, str4, strM3985b, capabilitiesForType, zIsHardwareAccelerated, zM3991h, zIsVendor, false, false));
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        str2 = str3;
                                                        if (Util6.f6307a <= 23) {
                                                        }
                                                        Log.e("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                        throw e;
                                                    }
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                str = strM3985b;
                                                str3 = name;
                                                i = i3;
                                                z = zMo3998e;
                                                i2 = iMo3997d;
                                                str2 = str3;
                                                if (Util6.f6307a <= 23 || arrayList.isEmpty()) {
                                                    Log.e("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                                Log.e("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                i3 = i + 1;
                                                bVar2 = bVar;
                                                iMo3997d = i2;
                                                zMo3998e = z;
                                            }
                                        }
                                        str = strM3985b;
                                        str3 = name;
                                        i = i3;
                                        z = zMo3998e;
                                        i2 = iMo3997d;
                                        if (!z && zMo3995b2) {
                                            StringBuilder sb = new StringBuilder();
                                            try {
                                                sb.append(str3);
                                                sb.append(".secure");
                                                str2 = str3;
                                                try {
                                                    arrayList.add(MediaCodecInfo.m3952i(sb.toString(), str4, str, capabilitiesForType, zIsHardwareAccelerated, zM3991h, zIsVendor, false, true));
                                                    return arrayList;
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    if (Util6.f6307a <= 23) {
                                                    }
                                                    Log.e("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                                str2 = str3;
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Exception e6) {
                            e = e6;
                            str = strM3985b;
                            str2 = name;
                            i = i3;
                            z = zMo3998e;
                            i2 = iMo3997d;
                        }
                    }
                    i3 = i + 1;
                    bVar2 = bVar;
                    iMo3997d = i2;
                    zMo3998e = z;
                }
                i = i3;
                z = zMo3998e;
                i2 = iMo3997d;
                i3 = i + 1;
                bVar2 = bVar;
                iMo3997d = i2;
                zMo3998e = z;
            }
            return arrayList;
        } catch (Exception e7) {
            throw new c(e7, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m3990g(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = Util6.f6307a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = Util6.f6308b;
            if ("a70".equals(str3) || ("Xiaomi".equals(Util6.f6309c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = Util6.f6308b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = Util6.f6308b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Util6.f6309c))) {
            String str6 = Util6.f6308b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(Util6.f6309c)) {
            String str7 = Util6.f6308b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && Util6.f6308b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m3991h(MediaCodecInfo mediaCodecInfo) {
        if (Util6.f6307a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String strM3111T = Util6.m3111T(mediaCodecInfo.getName());
        if (strM3111T.startsWith("arc.")) {
            return false;
        }
        return strM3111T.startsWith("omx.google.") || strM3111T.startsWith("omx.ffmpeg.") || (strM3111T.startsWith("omx.sec.") && strM3111T.contains(".sw.")) || strM3111T.equals("omx.qcom.video.decoder.hevcswvdec") || strM3111T.startsWith("c2.android.") || strM3111T.startsWith("c2.google.") || !(strM3111T.startsWith("omx.") || strM3111T.startsWith("c2."));
    }

    /* JADX INFO: renamed from: i */
    public static int m3992i() throws c {
        int i;
        if (f8636c == -1) {
            int iMax = 0;
            MediaCodecInfo mediaCodecInfoM3987d = m3987d("video/avc", false, false);
            if (mediaCodecInfoM3987d != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrM3954d = mediaCodecInfoM3987d.m3954d();
                int length = codecProfileLevelArrM3954d.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i2 = codecProfileLevelArrM3954d[iMax].level;
                    if (i2 != 1 && i2 != 2) {
                        switch (i2) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    iMax2 = Math.max(i, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, Util6.f6307a >= 21 ? 345600 : 172800);
            }
            f8636c = iMax;
        }
        return f8636c;
    }

    /* JADX INFO: renamed from: j */
    public static <T> void m3993j(List<T> list, final g<T> gVar) {
        Collections.sort(list, new Comparator() { // from class: c.n.b.b.t1.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MediaCodecUtil.g gVar2 = gVar;
                return gVar2.mo3931a(obj2) - gVar2.mo3931a(obj);
            }
        });
    }
}
