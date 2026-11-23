package p007c.p190n.p194b.p209b.p243w1.p248w0.p249w;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p210a2.ParsingLoadable;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p218q1.DrmInitData;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p243w1.UnrecognizedInputFormatException;
import p007c.p190n.p194b.p209b.p243w1.p248w0.HlsTrackMetadataEntry;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.b.b.w1.w0.w.i, reason: use source file name */
/* JADX INFO: compiled from: HlsPlaylistParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class HlsPlaylistParser implements ParsingLoadable.a<HlsPlaylist> {

    /* JADX INFO: renamed from: Z */
    public final HlsMasterPlaylist f9665Z;

    /* JADX INFO: renamed from: a0 */
    public final HlsMediaPlaylist f9666a0;

    /* JADX INFO: renamed from: a */
    public static final Pattern f9639a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: b */
    public static final Pattern f9640b = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: c */
    public static final Pattern f9641c = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: d */
    public static final Pattern f9642d = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: e */
    public static final Pattern f9643e = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: f */
    public static final Pattern f9644f = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: g */
    public static final Pattern f9645g = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* JADX INFO: renamed from: h */
    public static final Pattern f9646h = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: i */
    public static final Pattern f9647i = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: j */
    public static final Pattern f9648j = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: k */
    public static final Pattern f9649k = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: l */
    public static final Pattern f9650l = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: m */
    public static final Pattern f9651m = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: n */
    public static final Pattern f9652n = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: o */
    public static final Pattern f9653o = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: p */
    public static final Pattern f9654p = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: q */
    public static final Pattern f9655q = m4347b("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: r */
    public static final Pattern f9656r = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: s */
    public static final Pattern f9657s = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: t */
    public static final Pattern f9658t = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: u */
    public static final Pattern f9659u = m4347b("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: v */
    public static final Pattern f9660v = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: w */
    public static final Pattern f9661w = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: x */
    public static final Pattern f9662x = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: y */
    public static final Pattern f9663y = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* JADX INFO: renamed from: z */
    public static final Pattern f9664z = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* JADX INFO: renamed from: A */
    public static final Pattern f9614A = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: B */
    public static final Pattern f9615B = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: C */
    public static final Pattern f9616C = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: D */
    public static final Pattern f9617D = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: E */
    public static final Pattern f9618E = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: F */
    public static final Pattern f9619F = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: G */
    public static final Pattern f9620G = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* JADX INFO: renamed from: H */
    public static final Pattern f9621H = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: I */
    public static final Pattern f9622I = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: J */
    public static final Pattern f9623J = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: K */
    public static final Pattern f9624K = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: L */
    public static final Pattern f9625L = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: M */
    public static final Pattern f9626M = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: N */
    public static final Pattern f9627N = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: O */
    public static final Pattern f9628O = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* JADX INFO: renamed from: P */
    public static final Pattern f9629P = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* JADX INFO: renamed from: Q */
    public static final Pattern f9630Q = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: R */
    public static final Pattern f9631R = m4347b("AUTOSELECT");

    /* JADX INFO: renamed from: S */
    public static final Pattern f9632S = m4347b("DEFAULT");

    /* JADX INFO: renamed from: T */
    public static final Pattern f9633T = m4347b("FORCED");

    /* JADX INFO: renamed from: U */
    public static final Pattern f9634U = m4347b("INDEPENDENT");

    /* JADX INFO: renamed from: V */
    public static final Pattern f9635V = m4347b("GAP");

    /* JADX INFO: renamed from: W */
    public static final Pattern f9636W = Pattern.compile("VALUE=\"(.+?)\"");

    /* JADX INFO: renamed from: X */
    public static final Pattern f9637X = Pattern.compile("IMPORT=\"(.+?)\"");

    /* JADX INFO: renamed from: Y */
    public static final Pattern f9638Y = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.w.i$a */
    /* JADX INFO: compiled from: HlsPlaylistParser.java */
    public static final class a extends IOException {
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.w.i$b */
    /* JADX INFO: compiled from: HlsPlaylistParser.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final BufferedReader f9667a;

        /* JADX INFO: renamed from: b */
        public final Queue<String> f9668b;

        /* JADX INFO: renamed from: c */
        public String f9669c;

        public b(Queue<String> queue, BufferedReader bufferedReader) {
            this.f9668b = queue;
            this.f9667a = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        /* JADX INFO: renamed from: a */
        public boolean m4365a() throws IOException {
            String strTrim;
            if (this.f9669c != null) {
                return true;
            }
            if (!this.f9668b.isEmpty()) {
                String strPoll = this.f9668b.poll();
                Objects.requireNonNull(strPoll);
                this.f9669c = strPoll;
                return true;
            }
            do {
                String line = this.f9667a.readLine();
                this.f9669c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f9669c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        /* JADX INFO: renamed from: b */
        public String m4366b() throws IOException {
            if (!m4365a()) {
                throw new NoSuchElementException();
            }
            String str = this.f9669c;
            this.f9669c = null;
            return str;
        }
    }

    public HlsPlaylistParser() {
        this(HlsMasterPlaylist.f9552d, null);
    }

    /* JADX INFO: renamed from: b */
    public static Pattern m4347b(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    /* JADX INFO: renamed from: c */
    public static DrmInitData m4348c(String str, DrmInitData.b[] bVarArr) {
        DrmInitData.b[] bVarArr2 = new DrmInitData.b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            DrmInitData.b bVar = bVarArr[i];
            bVarArr2[i] = new DrmInitData.b(bVar.f7433g, bVar.f7434h, bVar.f7435i, null);
        }
        return new DrmInitData(str, bVarArr2);
    }

    /* JADX INFO: renamed from: d */
    public static String m4349d(long j2, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j2);
    }

    /* JADX INFO: renamed from: e */
    public static double m4350e(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(m4362q(str, pattern, Collections.emptyMap()));
    }

    /* JADX INFO: renamed from: f */
    public static DrmInitData.b m4351f(String str, String str2, Map<String, String> map) throws ParserException {
        String strM4360o = m4360o(str, f9621H, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strM4362q = m4362q(str, f9622I, map);
            return new DrmInitData.b(C.f6406d, "video/mp4", Base64.decode(strM4362q.substring(strM4362q.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new DrmInitData.b(C.f6406d, "hls", Util6.m3093B(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strM4360o)) {
            return null;
        }
        String strM4362q2 = m4362q(str, f9622I, map);
        byte[] bArrDecode = Base64.decode(strM4362q2.substring(strM4362q2.indexOf(44)), 0);
        UUID uuid = C.f6407e;
        return new DrmInitData.b(uuid, "video/mp4", C1095a.m2391g(uuid, bArrDecode));
    }

    /* JADX INFO: renamed from: g */
    public static String m4352g(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    /* JADX INFO: renamed from: h */
    public static int m4353h(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(m4362q(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:116:0x0382  */
    /* JADX WARN: Code duplicated, block: B:135:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:198:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0143  */
    /* JADX WARN: Code duplicated, block: B:42:0x0148  */
    /* JADX WARN: Code duplicated, block: B:45:0x016c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0177  */
    /* JADX WARN: Code duplicated, block: B:48:0x017d  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX INFO: renamed from: i */
    public static HlsMasterPlaylist m4354i(b bVar, String str) throws IOException {
        ArrayList arrayList;
        ?? r12;
        int i;
        byte b2;
        Format format;
        ArrayList arrayList2;
        HlsMasterPlaylist.b bVar2;
        String strM3163e;
        ArrayList arrayList3;
        Format formatM3519a;
        int i2;
        String str2;
        HlsMasterPlaylist.b bVar3;
        String strM3163e2;
        ArrayList arrayList4;
        HlsMasterPlaylist.b bVar4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i3;
        int i4;
        int i5;
        String strM4361p;
        float f;
        Uri uriM4586v;
        HashMap map;
        ArrayList arrayList7;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            String str3 = "application/x-mpegURL";
            if (!bVar.m4365a()) {
                HashMap map4 = map2;
                ArrayList arrayList16 = arrayList13;
                ArrayList arrayList17 = arrayList9;
                ArrayList arrayList18 = arrayList10;
                ArrayList arrayList19 = arrayList11;
                ArrayList arrayList20 = arrayList12;
                ArrayList arrayList21 = arrayList15;
                boolean z3 = z2;
                ArrayList arrayList22 = arrayList14;
                ArrayList arrayList23 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i6 = 0;
                while (true) {
                    arrayList = null;
                    if (i6 >= arrayList8.size()) {
                        break;
                    }
                    HlsMasterPlaylist.b bVar5 = (HlsMasterPlaylist.b) arrayList8.get(i6);
                    if (hashSet.add(bVar5.f9566a)) {
                        C2096e.m4570f(bVar5.f9567b.f6932o == null);
                        ArrayList arrayList24 = (ArrayList) map4.get(bVar5.f9566a);
                        Objects.requireNonNull(arrayList24);
                        Metadata metadata = new Metadata(new HlsTrackMetadataEntry(null, null, arrayList24));
                        Format.b bVarM3515a = bVar5.f9567b.m3515a();
                        bVarM3515a.f6956i = metadata;
                        arrayList23.add(new HlsMasterPlaylist.b(bVar5.f9566a, bVarM3515a.m3519a(), bVar5.f9568c, bVar5.f9569d, bVar5.f9570e, bVar5.f9571f));
                    }
                    i6++;
                }
                int i7 = 0;
                Format format2 = null;
                while (i7 < arrayList16.size()) {
                    ArrayList arrayList25 = arrayList16;
                    String str4 = (String) arrayList25.get(i7);
                    String strM4362q = m4362q(str4, f9628O, map3);
                    String strM4362q2 = m4362q(str4, f9627N, map3);
                    Format.b bVar6 = new Format.b();
                    bVar6.f6948a = outline.m1600v(strM4362q, ":", strM4362q2);
                    bVar6.f6949b = strM4362q2;
                    bVar6.f6957j = str3;
                    boolean zM4356k = m4356k(str4, f9632S, false);
                    if (m4356k(str4, f9633T, false)) {
                        r12 = zM4356k;
                        r12 = (zM4356k ? 1 : 0) | 2;
                    }
                    r12 = zM4356k;
                    int i8 = r12;
                    if (m4356k(str4, f9631R, false)) {
                        i8 = (r12 == true ? 1 : 0) | 4;
                    }
                    bVar6.f6951d = i8;
                    String strM4361p2 = m4361p(str4, f9629P, map3);
                    if (TextUtils.isEmpty(strM4361p2)) {
                        i = 0;
                    } else {
                        String[] strArrM3106O = Util6.m3106O(strM4361p2, ",");
                        int i9 = Util6.m3123k(strArrM3106O, "public.accessibility.describes-video") ? 512 : 0;
                        if (Util6.m3123k(strArrM3106O, "public.accessibility.transcribes-spoken-dialog")) {
                            i9 |= 4096;
                        }
                        if (Util6.m3123k(strArrM3106O, "public.accessibility.describes-music-and-sound")) {
                            i9 |= 1024;
                        }
                        i = Util6.m3123k(strArrM3106O, "public.easy-to-read") ? i9 | 8192 : i9;
                    }
                    bVar6.f6952e = i;
                    bVar6.f6950c = m4361p(str4, f9626M, map3);
                    String strM4361p3 = m4361p(str4, f9622I, map3);
                    Uri uriM4586v2 = strM4361p3 == null ? null : C2096e.m4586v(str, strM4361p3);
                    arrayList16 = arrayList25;
                    String str5 = str3;
                    Metadata metadata2 = new Metadata(new HlsTrackMetadataEntry(strM4362q, strM4362q2, Collections.emptyList()));
                    switch (m4362q(str4, f9624K, map3)) {
                        case "SUBTITLES":
                            b2 = 0;
                            break;
                        case "CLOSED-CAPTIONS":
                            b2 = 1;
                            break;
                        case "AUDIO":
                            b2 = 2;
                            break;
                        case "VIDEO":
                            b2 = 3;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 != 0) {
                        if (b2 == 1) {
                            Format format3 = format2;
                            arrayList2 = arrayList18;
                            String strM4362q3 = m4362q(str4, f9630Q, map3);
                            if (strM4362q3.startsWith("CC")) {
                                i2 = Integer.parseInt(strM4362q3.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                i2 = Integer.parseInt(strM4362q3.substring(7));
                                str2 = "application/cea-708";
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            bVar6.f6958k = str2;
                            bVar6.f6946C = i2;
                            arrayList.add(bVar6.m3519a());
                            formatM3519a = format3;
                        } else if (b2 != 2) {
                            if (b2 != 3) {
                                arrayList4 = arrayList17;
                            } else {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < arrayList8.size()) {
                                        bVar4 = (HlsMasterPlaylist.b) arrayList8.get(i10);
                                        if (!strM4362q.equals(bVar4.f9568c)) {
                                            i10++;
                                        }
                                    } else {
                                        bVar4 = null;
                                    }
                                }
                                if (bVar4 != null) {
                                    Format format4 = bVar4.f9567b;
                                    String strM3131s = Util6.m3131s(format4.f6931n, 2);
                                    bVar6.f6955h = strM3131s;
                                    bVar6.f6958k = MimeTypes.m3163e(strM3131s);
                                    bVar6.f6963p = format4.f6939v;
                                    bVar6.f6964q = format4.f6940w;
                                    bVar6.f6965r = format4.f6941x;
                                }
                                if (uriM4586v2 == null) {
                                    arrayList4 = arrayList17;
                                } else {
                                    bVar6.f6956i = metadata2;
                                    arrayList4 = arrayList17;
                                    arrayList4.add(new HlsMasterPlaylist.a(uriM4586v2, bVar6.m3519a(), strM4362q, strM4362q2));
                                }
                            }
                            format = format2;
                            arrayList17 = arrayList4;
                            arrayList3 = arrayList19;
                            arrayList2 = arrayList18;
                        } else {
                            ArrayList arrayList26 = arrayList17;
                            int i11 = 0;
                            while (true) {
                                if (i11 < arrayList8.size()) {
                                    bVar3 = (HlsMasterPlaylist.b) arrayList8.get(i11);
                                    format = format2;
                                    if (!strM4362q.equals(bVar3.f9569d)) {
                                        i11++;
                                        format2 = format;
                                    }
                                } else {
                                    format = format2;
                                    bVar3 = null;
                                }
                            }
                            if (bVar3 != null) {
                                String strM3131s2 = Util6.m3131s(bVar3.f9567b.f6931n, 1);
                                bVar6.f6955h = strM3131s2;
                                strM3163e2 = MimeTypes.m3163e(strM3131s2);
                            } else {
                                strM3163e2 = null;
                            }
                            String strM4361p4 = m4361p(str4, f9645g, map3);
                            if (strM4361p4 != null) {
                                int i12 = Util6.f6307a;
                                arrayList17 = arrayList26;
                                bVar6.f6971x = Integer.parseInt(strM4361p4.split("/", 2)[0]);
                                if ("audio/eac3".equals(strM3163e2) && strM4361p4.endsWith("/JOC")) {
                                    strM3163e2 = "audio/eac3-joc";
                                }
                            } else {
                                arrayList17 = arrayList26;
                            }
                            bVar6.f6958k = strM3163e2;
                            if (uriM4586v2 != null) {
                                bVar6.f6956i = metadata2;
                                arrayList2 = arrayList18;
                                arrayList2.add(new HlsMasterPlaylist.a(uriM4586v2, bVar6.m3519a(), strM4362q, strM4362q2));
                            } else {
                                arrayList2 = arrayList18;
                                if (bVar3 != null) {
                                    formatM3519a = bVar6.m3519a();
                                }
                            }
                            arrayList3 = arrayList19;
                        }
                        arrayList3 = arrayList19;
                        i7++;
                        arrayList19 = arrayList3;
                        arrayList18 = arrayList2;
                        str3 = str5;
                        format2 = formatM3519a;
                    } else {
                        format = format2;
                        arrayList2 = arrayList18;
                        int i13 = 0;
                        while (true) {
                            if (i13 < arrayList8.size()) {
                                bVar2 = (HlsMasterPlaylist.b) arrayList8.get(i13);
                                if (!strM4362q.equals(bVar2.f9570e)) {
                                    i13++;
                                }
                            } else {
                                bVar2 = null;
                            }
                        }
                        if (bVar2 != null) {
                            String strM3131s3 = Util6.m3131s(bVar2.f9567b.f6931n, 3);
                            bVar6.f6955h = strM3131s3;
                            strM3163e = MimeTypes.m3163e(strM3131s3);
                        } else {
                            strM3163e = null;
                        }
                        if (strM3163e == null) {
                            strM3163e = "text/vtt";
                        }
                        bVar6.f6958k = strM3163e;
                        bVar6.f6956i = metadata2;
                        if (uriM4586v2 != null) {
                            HlsMasterPlaylist.a aVar = new HlsMasterPlaylist.a(uriM4586v2, bVar6.m3519a(), strM4362q, strM4362q2);
                            arrayList3 = arrayList19;
                            arrayList3.add(aVar);
                        } else {
                            arrayList3 = arrayList19;
                            Log.w("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                        }
                    }
                    formatM3519a = format;
                    i7++;
                    arrayList19 = arrayList3;
                    arrayList18 = arrayList2;
                    str3 = str5;
                    format2 = formatM3519a;
                }
                return new HlsMasterPlaylist(str, arrayList21, arrayList23, arrayList17, arrayList18, arrayList19, arrayList20, format2, z ? Collections.emptyList() : arrayList, z3, map3, arrayList22);
            }
            String strM4366b = bVar.m4366b();
            if (strM4366b.startsWith("#EXT")) {
                arrayList15.add(strM4366b);
            }
            boolean zStartsWith = strM4366b.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            boolean z4 = z2;
            if (strM4366b.startsWith("#EXT-X-DEFINE")) {
                map3.put(m4362q(strM4366b, f9627N, map3), m4362q(strM4366b, f9636W, map3));
            } else {
                if (strM4366b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    z2 = true;
                    map = map2;
                    arrayList5 = arrayList10;
                    arrayList6 = arrayList11;
                } else if (strM4366b.startsWith("#EXT-X-MEDIA")) {
                    arrayList13.add(strM4366b);
                } else if (strM4366b.startsWith("#EXT-X-SESSION-KEY")) {
                    DrmInitData.b bVarM4351f = m4351f(strM4366b, m4360o(strM4366b, f9620G, "identity", map3), map3);
                    if (bVarM4351f != null) {
                        arrayList14.add(new DrmInitData(m4352g(m4362q(strM4366b, f9619F, map3)), bVarM4351f));
                    }
                } else if (strM4366b.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                    boolean zContains = z | strM4366b.contains("CLOSED-CAPTIONS=NONE");
                    int i14 = zStartsWith ? 16384 : 0;
                    int iM4353h = m4353h(strM4366b, f9644f);
                    int iM4358m = m4358m(strM4366b, f9639a, -1);
                    String strM4361p5 = m4361p(strM4366b, f9646h, map3);
                    String strM4361p6 = m4361p(strM4366b, f9647i, map3);
                    if (strM4361p6 != null) {
                        int i15 = Util6.f6307a;
                        arrayList6 = arrayList11;
                        arrayList5 = arrayList10;
                        i3 = -1;
                        String[] strArrSplit = strM4361p6.split("x", -1);
                        i5 = Integer.parseInt(strArrSplit[0]);
                        i4 = Integer.parseInt(strArrSplit[1]);
                        if (i5 <= 0 || i4 <= 0) {
                        }
                        strM4361p = m4361p(strM4366b, f9648j, map3);
                        if (strM4361p != null) {
                            f = Float.parseFloat(strM4361p);
                        } else {
                            f = -1.0f;
                        }
                        String strM4361p7 = m4361p(strM4366b, f9640b, map3);
                        String strM4361p8 = m4361p(strM4366b, f9641c, map3);
                        HashMap map5 = map2;
                        String strM4361p9 = m4361p(strM4366b, f9642d, map3);
                        String strM4361p10 = m4361p(strM4366b, f9643e, map3);
                        if (zStartsWith) {
                            uriM4586v = C2096e.m4586v(str, m4362q(strM4366b, f9622I, map3));
                        } else {
                            if (bVar.m4365a()) {
                                throw new ParserException("#EXT-X-STREAM-INF must be followed by another line");
                            }
                            uriM4586v = C2096e.m4586v(str, m4363r(bVar.m4366b(), map3));
                        }
                        Format.b bVar7 = new Format.b();
                        bVar7.m3520b(arrayList8.size());
                        bVar7.f6957j = "application/x-mpegURL";
                        bVar7.f6955h = strM4361p5;
                        bVar7.f6953f = iM4358m;
                        bVar7.f6954g = iM4353h;
                        bVar7.f6963p = i5;
                        bVar7.f6964q = i4;
                        bVar7.f6965r = f;
                        bVar7.f6952e = i14;
                        arrayList8.add(new HlsMasterPlaylist.b(uriM4586v, bVar7.m3519a(), strM4361p7, strM4361p8, strM4361p9, strM4361p10));
                        map = map5;
                        arrayList7 = (ArrayList) map.get(uriM4586v);
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                            map.put(uriM4586v, arrayList7);
                        }
                        arrayList7.add(new HlsTrackMetadataEntry.b(iM4358m, iM4353h, strM4361p7, strM4361p8, strM4361p9, strM4361p10));
                        z2 = z4;
                        z = zContains;
                    } else {
                        arrayList5 = arrayList10;
                        arrayList6 = arrayList11;
                        i3 = -1;
                    }
                    i4 = -1;
                    i5 = i3;
                    strM4361p = m4361p(strM4366b, f9648j, map3);
                    if (strM4361p != null) {
                        f = Float.parseFloat(strM4361p);
                    } else {
                        f = -1.0f;
                    }
                    String strM4361p11 = m4361p(strM4366b, f9640b, map3);
                    String strM4361p12 = m4361p(strM4366b, f9641c, map3);
                    HashMap map6 = map2;
                    String strM4361p13 = m4361p(strM4366b, f9642d, map3);
                    String strM4361p14 = m4361p(strM4366b, f9643e, map3);
                    if (zStartsWith) {
                        uriM4586v = C2096e.m4586v(str, m4362q(strM4366b, f9622I, map3));
                    } else {
                        if (bVar.m4365a()) {
                            throw new ParserException("#EXT-X-STREAM-INF must be followed by another line");
                        }
                        uriM4586v = C2096e.m4586v(str, m4363r(bVar.m4366b(), map3));
                    }
                    Format.b bVar8 = new Format.b();
                    bVar8.m3520b(arrayList8.size());
                    bVar8.f6957j = "application/x-mpegURL";
                    bVar8.f6955h = strM4361p5;
                    bVar8.f6953f = iM4358m;
                    bVar8.f6954g = iM4353h;
                    bVar8.f6963p = i5;
                    bVar8.f6964q = i4;
                    bVar8.f6965r = f;
                    bVar8.f6952e = i14;
                    arrayList8.add(new HlsMasterPlaylist.b(uriM4586v, bVar8.m3519a(), strM4361p11, strM4361p12, strM4361p13, strM4361p14));
                    map = map6;
                    arrayList7 = (ArrayList) map.get(uriM4586v);
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                        map.put(uriM4586v, arrayList7);
                    }
                    arrayList7.add(new HlsTrackMetadataEntry.b(iM4358m, iM4353h, strM4361p11, strM4361p12, strM4361p13, strM4361p14));
                    z2 = z4;
                    z = zContains;
                }
                map2 = map;
                arrayList14 = arrayList14;
                arrayList12 = arrayList12;
                arrayList15 = arrayList15;
                arrayList11 = arrayList6;
                arrayList10 = arrayList5;
                arrayList9 = arrayList9;
                arrayList13 = arrayList13;
            }
            map = map2;
            arrayList5 = arrayList10;
            arrayList6 = arrayList11;
            z2 = z4;
            map2 = map;
            arrayList14 = arrayList14;
            arrayList12 = arrayList12;
            arrayList15 = arrayList15;
            arrayList11 = arrayList6;
            arrayList10 = arrayList5;
            arrayList9 = arrayList9;
            arrayList13 = arrayList13;
        }
    }

    /* JADX INFO: renamed from: j */
    public static HlsMediaPlaylist m4355j(HlsMasterPlaylist hlsMasterPlaylist, HlsMediaPlaylist hlsMediaPlaylist, b bVar, String str) throws IOException {
        ArrayList arrayList;
        HlsMasterPlaylist hlsMasterPlaylist2;
        long j2;
        HlsMediaPlaylist hlsMediaPlaylist2;
        boolean z;
        HashMap map;
        HlsMediaPlaylist.b bVar2;
        String str2;
        String strM4362q;
        HashMap map2;
        long j3;
        long j4;
        DrmInitData drmInitData;
        long j5;
        boolean z2 = hlsMasterPlaylist.f9613c;
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashMap map5 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        HlsMediaPlaylist.f fVar = new HlsMediaPlaylist.f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        boolean z3 = false;
        String str3 = "";
        HlsMediaPlaylist hlsMediaPlaylist3 = hlsMediaPlaylist;
        HlsMasterPlaylist hlsMasterPlaylist3 = hlsMasterPlaylist;
        boolean z4 = z2;
        ArrayList arrayList5 = arrayList3;
        HlsMediaPlaylist.f fVar2 = fVar;
        String strM4360o = "";
        long jM3236b = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        boolean z5 = false;
        HlsMediaPlaylist.b bVar3 = null;
        int i = 0;
        long jM4350e = -9223372036854775807L;
        int i2 = 0;
        int iM4353h = 1;
        long jM4353h = -9223372036854775807L;
        long jM4350e2 = -9223372036854775807L;
        boolean z6 = false;
        DrmInitData drmInitDataM4348c = null;
        DrmInitData drmInitData2 = null;
        boolean z7 = false;
        String str4 = null;
        String strM4361p = null;
        long j13 = -1;
        String strM4352g = null;
        int i3 = 0;
        boolean z8 = false;
        HlsMediaPlaylist.d dVar = null;
        while (bVar.m4365a()) {
            String strM4366b = bVar.m4366b();
            if (strM4366b.startsWith("#EXT")) {
                arrayList4.add(strM4366b);
            }
            if (strM4366b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strM4362q2 = m4362q(strM4366b, f9653o, map3);
                if ("VOD".equals(strM4362q2)) {
                    i = 1;
                } else if ("EVENT".equals(strM4362q2)) {
                    i = 2;
                }
            } else if (strM4366b.equals("#EXT-X-I-FRAMES-ONLY")) {
                z8 = true;
            } else if (strM4366b.startsWith("#EXT-X-START")) {
                jM4350e = (long) (m4350e(strM4366b, f9614A) * 1000000.0d);
            } else {
                if (strM4366b.startsWith("#EXT-X-SERVER-CONTROL")) {
                    arrayList = arrayList2;
                    double dM4357l = m4357l(strM4366b, f9654p, -9.223372036854776E18d);
                    long j14 = dM4357l == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM4357l * 1000000.0d);
                    boolean zM4356k = m4356k(strM4366b, f9655q, z3);
                    double dM4357l2 = m4357l(strM4366b, f9657s, -9.223372036854776E18d);
                    long j15 = dM4357l2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM4357l2 * 1000000.0d);
                    double dM4357l3 = m4357l(strM4366b, f9658t, -9.223372036854776E18d);
                    fVar2 = new HlsMediaPlaylist.f(j14, zM4356k, j15, dM4357l3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM4357l3 * 1000000.0d), m4356k(strM4366b, f9659u, false));
                } else {
                    arrayList = arrayList2;
                    if (strM4366b.startsWith("#EXT-X-PART-INF")) {
                        jM4350e2 = (long) (m4350e(strM4366b, f9651m) * 1000000.0d);
                    } else if (strM4366b.startsWith("#EXT-X-MAP")) {
                        String strM4362q3 = m4362q(strM4366b, f9622I, map3);
                        String strM4361p2 = m4361p(strM4366b, f9616C, map3);
                        if (strM4361p2 != null) {
                            int i4 = Util6.f6307a;
                            String[] strArrSplit = strM4361p2.split("@", -1);
                            j13 = Long.parseLong(strArrSplit[0]);
                            if (strArrSplit.length > 1) {
                                j7 = Long.parseLong(strArrSplit[1]);
                            }
                        }
                        if (j13 == -1) {
                            j7 = 0;
                        }
                        String str5 = str4;
                        String str6 = strM4361p;
                        if (str5 != null && str6 == null) {
                            throw new ParserException("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                        }
                        dVar = new HlsMediaPlaylist.d(strM4362q3, j7, j13, str5, str6);
                        if (j13 != -1) {
                            j7 += j13;
                        }
                        str4 = str5;
                        strM4361p = str6;
                        arrayList2 = arrayList;
                        z3 = false;
                        j13 = -1;
                    } else {
                        str4 = str4;
                        strM4361p = strM4361p;
                        if (strM4366b.startsWith("#EXT-X-TARGETDURATION")) {
                            jM4353h = 1000000 * ((long) m4353h(strM4366b, f9649k));
                        } else if (strM4366b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                            j6 = Long.parseLong(m4362q(strM4366b, f9660v, Collections.emptyMap()));
                            j9 = j6;
                            arrayList2 = arrayList;
                            hlsMasterPlaylist2 = hlsMasterPlaylist3;
                            str3 = str3;
                            arrayList2 = arrayList2;
                            map5 = map5;
                            arrayList4 = arrayList4;
                            i = i;
                            bVar3 = bVar3;
                            strM4352g = strM4352g;
                            strM4361p = strM4361p;
                            str4 = str4;
                            str3 = str3;
                            z3 = false;
                            hlsMasterPlaylist3 = hlsMasterPlaylist2;
                            z5 = z5;
                            hlsMediaPlaylist3 = hlsMediaPlaylist3;
                            map4 = map4;
                        } else if (strM4366b.startsWith("#EXT-X-VERSION")) {
                            iM4353h = m4353h(strM4366b, f9652n);
                        } else {
                            if (strM4366b.startsWith("#EXT-X-DEFINE")) {
                                String strM4361p3 = m4361p(strM4366b, f9637X, map3);
                                if (strM4361p3 != null) {
                                    String str7 = hlsMasterPlaylist3.f9561m.get(strM4361p3);
                                    if (str7 != null) {
                                        map3.put(strM4361p3, str7);
                                    }
                                } else {
                                    map3.put(m4362q(strM4366b, f9627N, map3), m4362q(strM4366b, f9636W, map3));
                                }
                                z5 = z5;
                                map4 = map4;
                                bVar3 = bVar3;
                                str3 = str3;
                                strM4352g = strM4352g;
                                arrayList2 = arrayList;
                            } else {
                                if (strM4366b.startsWith("#EXTINF")) {
                                    long jM4350e3 = (long) (m4350e(strM4366b, f9661w) * 1000000.0d);
                                    strM4360o = m4360o(strM4366b, f9662x, str3, map3);
                                    map4 = map4;
                                    bVar3 = bVar3;
                                    arrayList4 = arrayList4;
                                    str3 = str3;
                                    j11 = jM4350e3;
                                    map5 = map5;
                                    strM4352g = strM4352g;
                                    arrayList2 = arrayList;
                                    i = i;
                                    HlsMediaPlaylist hlsMediaPlaylist4 = hlsMediaPlaylist3;
                                    z5 = z5;
                                    hlsMediaPlaylist2 = hlsMediaPlaylist4;
                                } else if (strM4366b.startsWith("#EXT-X-SKIP")) {
                                    int iM4353h2 = m4353h(strM4366b, f9656r);
                                    HlsMediaPlaylist hlsMediaPlaylist5 = hlsMediaPlaylist3;
                                    C2096e.m4570f(hlsMediaPlaylist5 != null && arrayList.isEmpty());
                                    int i5 = Util6.f6307a;
                                    int i6 = (int) (j6 - hlsMediaPlaylist5.f9577i);
                                    int i7 = iM4353h2 + i6;
                                    if (i6 < 0 || i7 > hlsMediaPlaylist5.f9584p.size()) {
                                        throw new a();
                                    }
                                    String str8 = strM4361p;
                                    String str9 = str4;
                                    while (i6 < i7) {
                                        HlsMediaPlaylist.d dVar2 = hlsMediaPlaylist5.f9584p.get(i6);
                                        if (j6 != hlsMediaPlaylist5.f9577i) {
                                            int i8 = (hlsMediaPlaylist5.f9576h - i2) + dVar2.f9598i;
                                            ArrayList arrayList6 = new ArrayList();
                                            long j16 = j10;
                                            int i9 = 0;
                                            while (i9 < dVar2.f9594r.size()) {
                                                HlsMediaPlaylist.b bVar4 = dVar2.f9594r.get(i9);
                                                arrayList6.add(new HlsMediaPlaylist.b(bVar4.f9595f, bVar4.f9596g, bVar4.f9597h, i8, j16, bVar4.f9600k, bVar4.f9601l, bVar4.f9602m, bVar4.f9603n, bVar4.f9604o, bVar4.f9605p, bVar4.f9589q, bVar4.f9590r));
                                                j16 += bVar4.f9597h;
                                                i9++;
                                                map4 = map4;
                                                str3 = str3;
                                                z5 = z5;
                                                bVar3 = bVar3;
                                            }
                                            z = z5;
                                            map = map4;
                                            bVar2 = bVar3;
                                            str2 = str3;
                                            dVar2 = new HlsMediaPlaylist.d(dVar2.f9595f, dVar2.f9596g, dVar2.f9593q, dVar2.f9597h, i8, j10, dVar2.f9600k, dVar2.f9601l, dVar2.f9602m, dVar2.f9603n, dVar2.f9604o, dVar2.f9605p, arrayList6);
                                        } else {
                                            z = z5;
                                            map = map4;
                                            bVar2 = bVar3;
                                            str2 = str3;
                                        }
                                        ArrayList arrayList7 = arrayList;
                                        arrayList7.add(dVar2);
                                        j10 += dVar2.f9597h;
                                        long j17 = dVar2.f9604o;
                                        if (j17 != -1) {
                                            j7 = dVar2.f9603n + j17;
                                        }
                                        int i10 = dVar2.f9598i;
                                        HlsMediaPlaylist.d dVar3 = dVar2.f9596g;
                                        DrmInitData drmInitData3 = dVar2.f9600k;
                                        String str10 = dVar2.f9601l;
                                        String str11 = dVar2.f9602m;
                                        if (str11 == null || !str11.equals(Long.toHexString(j9))) {
                                            str8 = dVar2.f9602m;
                                        }
                                        j9++;
                                        i6++;
                                        arrayList = arrayList7;
                                        i3 = i10;
                                        dVar = dVar3;
                                        drmInitData2 = drmInitData3;
                                        str9 = str10;
                                        i7 = i7;
                                        str3 = str2;
                                        j8 = j10;
                                        bVar3 = bVar2;
                                        hlsMediaPlaylist5 = hlsMediaPlaylist;
                                        map4 = map;
                                        z5 = z;
                                    }
                                    z5 = z5;
                                    bVar3 = bVar3;
                                    str3 = str3;
                                    arrayList2 = arrayList;
                                    hlsMasterPlaylist2 = hlsMasterPlaylist;
                                    map4 = map4;
                                    str4 = str9;
                                    strM4361p = str8;
                                    hlsMediaPlaylist3 = hlsMediaPlaylist;
                                    arrayList4 = arrayList4;
                                    map5 = map5;
                                    arrayList2 = arrayList2;
                                    map5 = map5;
                                    arrayList4 = arrayList4;
                                    i = i;
                                    bVar3 = bVar3;
                                    strM4352g = strM4352g;
                                    strM4361p = strM4361p;
                                    str4 = str4;
                                    str3 = str3;
                                    z3 = false;
                                    hlsMasterPlaylist3 = hlsMasterPlaylist2;
                                    z5 = z5;
                                    hlsMediaPlaylist3 = hlsMediaPlaylist3;
                                    map4 = map4;
                                } else {
                                    z5 = z5;
                                    map4 = map4;
                                    bVar3 = bVar3;
                                    str3 = str3;
                                    arrayList2 = arrayList;
                                    if (strM4366b.startsWith("#EXT-X-KEY")) {
                                        String strM4362q4 = m4362q(strM4366b, f9619F, map3);
                                        String strM4360o2 = m4360o(strM4366b, f9620G, "identity", map3);
                                        if ("NONE".equals(strM4362q4)) {
                                            treeMap.clear();
                                            strM4362q = null;
                                            strM4361p = null;
                                            drmInitData2 = null;
                                        } else {
                                            strM4361p = m4361p(strM4366b, f9623J, map3);
                                            if (!"identity".equals(strM4360o2)) {
                                                String str12 = strM4352g;
                                                strM4352g = str12 == null ? m4352g(strM4362q4) : str12;
                                                DrmInitData.b bVarM4351f = m4351f(strM4366b, strM4360o2, map3);
                                                if (bVarM4351f != null) {
                                                    treeMap.put(strM4360o2, bVarM4351f);
                                                    drmInitData2 = null;
                                                }
                                            } else if ("AES-128".equals(strM4362q4)) {
                                                strM4362q = m4362q(strM4366b, f9622I, map3);
                                            }
                                            strM4362q = null;
                                        }
                                        str4 = strM4362q;
                                        arrayList4 = arrayList4;
                                        map2 = map5;
                                        j3 = j9;
                                        bVar3 = bVar3;
                                    } else {
                                        strM4352g = strM4352g;
                                        if (strM4366b.startsWith("#EXT-X-BYTERANGE")) {
                                            String strM4362q5 = m4362q(strM4366b, f9615B, map3);
                                            int i11 = Util6.f6307a;
                                            String[] strArrSplit2 = strM4362q5.split("@", -1);
                                            j13 = Long.parseLong(strArrSplit2[0]);
                                            if (strArrSplit2.length > 1) {
                                                j7 = Long.parseLong(strArrSplit2[1]);
                                            }
                                        } else if (strM4366b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i2 = Integer.parseInt(strM4366b.substring(strM4366b.indexOf(58) + 1));
                                            hlsMediaPlaylist3 = hlsMediaPlaylist;
                                            arrayList2 = arrayList2;
                                            map4 = map4;
                                            strM4352g = strM4352g;
                                            strM4361p = strM4361p;
                                            str4 = str4;
                                            str3 = str3;
                                            bVar3 = bVar3;
                                            z5 = true;
                                            z3 = false;
                                            hlsMasterPlaylist3 = hlsMasterPlaylist;
                                        } else if (strM4366b.equals("#EXT-X-DISCONTINUITY")) {
                                            i3++;
                                        } else if (!strM4366b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (strM4366b.equals("#EXT-X-GAP")) {
                                                z3 = false;
                                                z7 = true;
                                            } else if (strM4366b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                z3 = false;
                                                z4 = true;
                                            } else if (strM4366b.equals("#EXT-X-ENDLIST")) {
                                                z3 = false;
                                                z6 = true;
                                            } else {
                                                if (strM4366b.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                    long jM4359n = m4359n(strM4366b, f9663y, (j6 + ((long) arrayList2.size())) - (arrayList5.isEmpty() ? 1L : 0L));
                                                    int iM4358m = m4358m(strM4366b, f9664z, jM4350e2 != -9223372036854775807L ? (arrayList5.isEmpty() ? ((HlsMediaPlaylist.d) C4799a.m10965P(arrayList2)).f9594r : arrayList5).size() - 1 : -1);
                                                    Uri uri = Uri.parse(C2096e.m4584t(str, m4362q(strM4366b, f9622I, map3)));
                                                    map5.put(uri, new HlsMediaPlaylist.c(uri, jM4359n, iM4358m));
                                                } else if (!strM4366b.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                    arrayList4 = arrayList4;
                                                    map5 = map5;
                                                    j2 = j9;
                                                    if (strM4366b.startsWith("#EXT-X-PART")) {
                                                        String strM4349d = m4349d(j2, str4, strM4361p);
                                                        String strM4362q6 = m4362q(strM4366b, f9622I, map3);
                                                        long jM4350e4 = (long) (m4350e(strM4366b, f9650l) * 1000000.0d);
                                                        i = i;
                                                        boolean zM4356k2 = m4356k(strM4366b, f9634U, false) | (z4 && arrayList5.isEmpty());
                                                        boolean zM4356k3 = m4356k(strM4366b, f9635V, false);
                                                        String strM4361p4 = m4361p(strM4366b, f9616C, map3);
                                                        if (strM4361p4 != null) {
                                                            int i12 = Util6.f6307a;
                                                            String[] strArrSplit3 = strM4361p4.split("@", -1);
                                                            j5 = Long.parseLong(strArrSplit3[0]);
                                                            if (strArrSplit3.length > 1) {
                                                                j12 = Long.parseLong(strArrSplit3[1]);
                                                            }
                                                        } else {
                                                            j5 = -1;
                                                        }
                                                        if (j5 == -1) {
                                                            j12 = 0;
                                                        }
                                                        if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                            DrmInitData.b[] bVarArr = (DrmInitData.b[]) treeMap.values().toArray(new DrmInitData.b[0]);
                                                            DrmInitData drmInitData4 = new DrmInitData(strM4352g, bVarArr);
                                                            if (drmInitDataM4348c == null) {
                                                                drmInitDataM4348c = m4348c(strM4352g, bVarArr);
                                                            }
                                                            drmInitData2 = drmInitData4;
                                                        }
                                                        arrayList5.add(new HlsMediaPlaylist.b(strM4362q6, dVar, jM4350e4, i3, j8, drmInitData2, str4, strM4349d, j12, j5, zM4356k3, zM4356k2, false));
                                                        j8 += jM4350e4;
                                                        if (j5 != -1) {
                                                            j12 += j5;
                                                        }
                                                    } else {
                                                        i = i;
                                                        if (!strM4366b.startsWith("#")) {
                                                            String strM4349d2 = m4349d(j2, str4, strM4361p);
                                                            j9 = j2 + 1;
                                                            String strM4363r = m4363r(strM4366b, map3);
                                                            HlsMediaPlaylist.d dVar4 = (HlsMediaPlaylist.d) map4.get(strM4363r);
                                                            if (j13 == -1) {
                                                                j4 = 0;
                                                            } else {
                                                                if (z8 && dVar == null && dVar4 == null) {
                                                                    dVar4 = new HlsMediaPlaylist.d(strM4363r, 0L, j7, null, null);
                                                                    map4.put(strM4363r, dVar4);
                                                                }
                                                                j4 = j7;
                                                            }
                                                            if (drmInitData2 != null || treeMap.isEmpty()) {
                                                                map4 = map4;
                                                                drmInitData = drmInitData2;
                                                            } else {
                                                                map4 = map4;
                                                                DrmInitData.b[] bVarArr2 = (DrmInitData.b[]) treeMap.values().toArray(new DrmInitData.b[0]);
                                                                drmInitData = new DrmInitData(strM4352g, bVarArr2);
                                                                if (drmInitDataM4348c == null) {
                                                                    drmInitDataM4348c = m4348c(strM4352g, bVarArr2);
                                                                }
                                                            }
                                                            arrayList2.add(new HlsMediaPlaylist.d(strM4363r, dVar != null ? dVar : dVar4, strM4360o, j11, i3, j10, drmInitData, str4, strM4349d2, j4, j13, z7, arrayList5));
                                                            j10 += j11;
                                                            ArrayList arrayList8 = new ArrayList();
                                                            if (j13 != -1) {
                                                                j4 += j13;
                                                            }
                                                            arrayList5 = arrayList8;
                                                            j7 = j4;
                                                            drmInitData2 = drmInitData;
                                                            j11 = 0;
                                                            j13 = -1;
                                                            strM4360o = str3;
                                                            j8 = j10;
                                                            z7 = false;
                                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                        }
                                                    }
                                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                    j9 = j2;
                                                } else if (bVar3 == null && "PART".equals(m4362q(strM4366b, f9625L, map3))) {
                                                    String strM4362q7 = m4362q(strM4366b, f9622I, map3);
                                                    long jM4359n2 = m4359n(strM4366b, f9617D, -1L);
                                                    map2 = map5;
                                                    long jM4359n3 = m4359n(strM4366b, f9618E, -1L);
                                                    j3 = j9;
                                                    String strM4349d3 = m4349d(j3, str4, strM4361p);
                                                    if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                        DrmInitData.b[] bVarArr3 = (DrmInitData.b[]) treeMap.values().toArray(new DrmInitData.b[0]);
                                                        DrmInitData drmInitData5 = new DrmInitData(strM4352g, bVarArr3);
                                                        if (drmInitDataM4348c == null) {
                                                            drmInitDataM4348c = m4348c(strM4352g, bVarArr3);
                                                        }
                                                        drmInitData2 = drmInitData5;
                                                    }
                                                    if (jM4359n2 == -1 || jM4359n3 != -1) {
                                                        bVar3 = new HlsMediaPlaylist.b(strM4362q7, dVar, 0L, i3, j8, drmInitData2, str4, strM4349d3, jM4359n2 != -1 ? jM4359n2 : 0L, jM4359n3, false, false, true);
                                                    } else {
                                                        bVar3 = bVar3;
                                                    }
                                                    strM4352g = strM4352g;
                                                }
                                                i = i;
                                                arrayList4 = arrayList4;
                                                map5 = map5;
                                                j2 = j9;
                                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                j9 = j2;
                                            }
                                            hlsMasterPlaylist3 = hlsMasterPlaylist;
                                            hlsMediaPlaylist3 = hlsMediaPlaylist;
                                        } else if (jM3236b == 0) {
                                            jM3236b = C.m3236b(Util6.m3101J(strM4366b.substring(strM4366b.indexOf(58) + 1))) - j10;
                                        }
                                        arrayList4 = arrayList4;
                                        map2 = map5;
                                        j3 = j9;
                                        bVar3 = bVar3;
                                        strM4352g = strM4352g;
                                    }
                                    map4 = map4;
                                    j9 = j3;
                                    map5 = map2;
                                    arrayList4 = arrayList4;
                                    str3 = str3;
                                    z5 = z5;
                                    hlsMasterPlaylist3 = hlsMasterPlaylist;
                                    hlsMediaPlaylist3 = hlsMediaPlaylist;
                                    arrayList2 = arrayList2;
                                    strM4361p = strM4361p;
                                    str4 = str4;
                                    z3 = false;
                                }
                                hlsMediaPlaylist3 = hlsMediaPlaylist2;
                                hlsMasterPlaylist2 = hlsMasterPlaylist;
                                arrayList2 = arrayList2;
                                map5 = map5;
                                arrayList4 = arrayList4;
                                i = i;
                                bVar3 = bVar3;
                                strM4352g = strM4352g;
                                strM4361p = strM4361p;
                                str4 = str4;
                                str3 = str3;
                                z3 = false;
                                hlsMasterPlaylist3 = hlsMasterPlaylist2;
                                z5 = z5;
                                hlsMediaPlaylist3 = hlsMediaPlaylist3;
                                map4 = map4;
                            }
                            map4 = map4;
                            i = i;
                            arrayList4 = arrayList4;
                            map5 = map5;
                            j2 = j9;
                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                            j9 = j2;
                            hlsMediaPlaylist3 = hlsMediaPlaylist2;
                            hlsMasterPlaylist2 = hlsMasterPlaylist;
                            arrayList2 = arrayList2;
                            map5 = map5;
                            arrayList4 = arrayList4;
                            i = i;
                            bVar3 = bVar3;
                            strM4352g = strM4352g;
                            strM4361p = strM4361p;
                            str4 = str4;
                            str3 = str3;
                            z3 = false;
                            hlsMasterPlaylist3 = hlsMasterPlaylist2;
                            z5 = z5;
                            hlsMediaPlaylist3 = hlsMediaPlaylist3;
                            map4 = map4;
                        }
                        arrayList2 = arrayList;
                        hlsMasterPlaylist2 = hlsMasterPlaylist3;
                        str3 = str3;
                        arrayList2 = arrayList2;
                        map5 = map5;
                        arrayList4 = arrayList4;
                        i = i;
                        bVar3 = bVar3;
                        strM4352g = strM4352g;
                        strM4361p = strM4361p;
                        str4 = str4;
                        str3 = str3;
                        z3 = false;
                        hlsMasterPlaylist3 = hlsMasterPlaylist2;
                        z5 = z5;
                        hlsMediaPlaylist3 = hlsMediaPlaylist3;
                        map4 = map4;
                    }
                }
                str4 = str4;
                strM4361p = strM4361p;
                arrayList2 = arrayList;
                arrayList4 = arrayList4;
                map5 = map5;
                hlsMasterPlaylist2 = hlsMasterPlaylist3;
                str3 = str3;
                arrayList2 = arrayList2;
                map5 = map5;
                arrayList4 = arrayList4;
                i = i;
                bVar3 = bVar3;
                strM4352g = strM4352g;
                strM4361p = strM4361p;
                str4 = str4;
                str3 = str3;
                z3 = false;
                hlsMasterPlaylist3 = hlsMasterPlaylist2;
                z5 = z5;
                hlsMediaPlaylist3 = hlsMediaPlaylist3;
                map4 = map4;
            }
        }
        boolean z9 = z5;
        HlsMediaPlaylist.b bVar5 = bVar3;
        int i13 = i;
        ArrayList arrayList9 = arrayList4;
        ArrayList arrayList10 = arrayList2;
        HashMap map6 = map5;
        if (bVar5 != null) {
            arrayList5.add(bVar5);
        }
        return new HlsMediaPlaylist(i13, str, arrayList9, jM4350e, jM3236b, z9, i2, j6, iM4353h, jM4353h, jM4350e2, z4, z6, jM3236b != 0, drmInitDataM4348c, arrayList10, arrayList5, fVar2, map6);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m4356k(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z;
    }

    /* JADX INFO: renamed from: l */
    public static double m4357l(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d;
        }
        String strGroup = matcher.group(1);
        Objects.requireNonNull(strGroup);
        return Double.parseDouble(strGroup);
    }

    /* JADX INFO: renamed from: m */
    public static int m4358m(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return i;
        }
        String strGroup = matcher.group(1);
        Objects.requireNonNull(strGroup);
        return Integer.parseInt(strGroup);
    }

    /* JADX INFO: renamed from: n */
    public static long m4359n(String str, Pattern pattern, long j2) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return j2;
        }
        String strGroup = matcher.group(1);
        Objects.requireNonNull(strGroup);
        return Long.parseLong(strGroup);
    }

    /* JADX INFO: renamed from: o */
    public static String m4360o(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            Objects.requireNonNull(str2);
        }
        return (map.isEmpty() || str2 == null) ? str2 : m4363r(str2, map);
    }

    /* JADX INFO: renamed from: p */
    public static String m4361p(String str, Pattern pattern, Map<String, String> map) {
        return m4360o(str, pattern, null, map);
    }

    /* JADX INFO: renamed from: q */
    public static String m4362q(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String strM4360o = m4360o(str, pattern, null, map);
        if (strM4360o != null) {
            return strM4360o;
        }
        StringBuilder sbM1556G = outline.m1556G("Couldn't match ");
        sbM1556G.append(pattern.pattern());
        sbM1556G.append(" in ");
        sbM1556G.append(str);
        throw new ParserException(sbM1556G.toString());
    }

    /* JADX INFO: renamed from: r */
    public static String m4363r(String str, Map<String, String> map) {
        Matcher matcher = f9638Y.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: s */
    public static int m4364s(BufferedReader bufferedReader, boolean z, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i) && (z || !Util6.m3097F(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036 A[Catch: all -> 0x00ef, TryCatch #3 {all -> 0x00ef, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:19:0x0050, B:21:0x0056, B:24:0x0061, B:26:0x0069, B:30:0x007f, B:32:0x0087, B:34:0x008f, B:36:0x0097, B:38:0x009f, B:40:0x00a7, B:42:0x00af, B:44:0x00b7, B:47:0x00c0, B:48:0x00c4, B:55:0x00e7, B:56:0x00ee, B:11:0x002d, B:13:0x0036, B:16:0x003f, B:17:0x0046), top: B:70:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:16:0x003f A[Catch: all -> 0x00ef, LOOP:1: B:12:0x0034->B:16:0x003f, LOOP_END, TryCatch #3 {all -> 0x00ef, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:19:0x0050, B:21:0x0056, B:24:0x0061, B:26:0x0069, B:30:0x007f, B:32:0x0087, B:34:0x008f, B:36:0x0097, B:38:0x009f, B:40:0x00a7, B:42:0x00af, B:44:0x00b7, B:47:0x00c0, B:48:0x00c4, B:55:0x00e7, B:56:0x00ee, B:11:0x002d, B:13:0x0036, B:16:0x003f, B:17:0x0046), top: B:70:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x003e A[SYNTHETIC] */
    @Override // p007c.p190n.p194b.p209b.p210a2.ParsingLoadable.a
    /* JADX INFO: renamed from: a */
    public HlsPlaylist mo2912a(Uri uri, InputStream inputStream) throws IOException {
        int iM4364s;
        int i;
        HlsPlaylist hlsPlaylistM4354i;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int i2 = bufferedReader.read();
            boolean zM3097F = false;
            if (i2 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i2 = bufferedReader.read();
                    iM4364s = m4364s(bufferedReader, true, i2);
                    i = 0;
                    while (true) {
                        if (i < 7) {
                            zM3097F = Util6.m3097F(m4364s(bufferedReader, false, iM4364s));
                            break;
                        }
                        if (iM4364s != "#EXTM3U".charAt(i)) {
                            break;
                            break;
                        }
                        iM4364s = bufferedReader.read();
                        i++;
                    }
                }
            } else {
                iM4364s = m4364s(bufferedReader, true, i2);
                i = 0;
                while (true) {
                    if (i < 7) {
                        zM3097F = Util6.m3097F(m4364s(bufferedReader, false, iM4364s));
                        break;
                    }
                    if (iM4364s != "#EXTM3U".charAt(i)) {
                        break;
                    }
                    iM4364s = bufferedReader.read();
                    i++;
                }
            }
            if (!zM3097F) {
                throw new UnrecognizedInputFormatException("Input does not start with the #EXTM3U header.", uri);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    int i3 = Util6.f6307a;
                    try {
                        bufferedReader.close();
                    } catch (IOException unused) {
                    }
                    throw new ParserException("Failed to parse the playlist, could not identify any tags.");
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (!strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                            arrayDeque.add(strTrim);
                        }
                        arrayDeque.add(strTrim);
                        hlsPlaylistM4354i = m4355j(this.f9665Z, this.f9666a0, new b(arrayDeque, bufferedReader), uri.toString());
                        break;
                    }
                    arrayDeque.add(strTrim);
                    hlsPlaylistM4354i = m4354i(new b(arrayDeque, bufferedReader), uri.toString());
                    break;
                }
            }
            int i4 = Util6.f6307a;
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            return hlsPlaylistM4354i;
        } catch (Throwable th) {
            int i5 = Util6.f6307a;
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    public HlsPlaylistParser(HlsMasterPlaylist hlsMasterPlaylist, HlsMediaPlaylist hlsMediaPlaylist) {
        this.f9665Z = hlsMasterPlaylist;
        this.f9666a0 = hlsMediaPlaylist;
    }
}
