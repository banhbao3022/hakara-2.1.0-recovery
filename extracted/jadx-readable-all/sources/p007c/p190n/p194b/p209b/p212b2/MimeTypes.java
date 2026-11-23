package p007c.p190n.p194b.p209b.p212b2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p190n.p194b.p209b.p215n1.AacUtil;

/* JADX INFO: renamed from: c.n.b.b.b2.s, reason: use source file name */
/* JADX INFO: compiled from: MimeTypes.java */
/* JADX INFO: loaded from: classes.dex */
public final class MimeTypes {

    /* JADX INFO: renamed from: a */
    public static final ArrayList<a> f6360a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public static final Pattern f6361b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: c.n.b.b.b2.s$a */
    /* JADX INFO: compiled from: MimeTypes.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f6362a;

        /* JADX INFO: renamed from: b */
        public final String f6363b;

        /* JADX INFO: renamed from: c */
        public final int f6364c;

        public a(String str, String str2, int i) {
            this.f6362a = str;
            this.f6363b = str2;
            this.f6364c = i;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.b2.s$b */
    /* JADX INFO: compiled from: MimeTypes.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f6365a;

        /* JADX INFO: renamed from: b */
        public final int f6366b;

        public b(int i, int i2) {
            this.f6365a = i;
            this.f6366b = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3159a(String str, String str2) {
        b bVarM3165g;
        int iM3551b;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (bVarM3165g = m3165g(str2)) == null || (iM3551b = AacUtil.m3551b(bVarM3165g.f6366b)) == 0 || iM3551b == 16) ? false : true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m3160b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : Util6.m3108Q(str)) {
            String strM3163e = m3163e(str2);
            if (strM3163e != null && m3169k(strM3163e)) {
                return strM3163e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m3161c(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrM3108Q = Util6.m3108Q(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : strArrM3108Q) {
            if (str2.equals(m3163e(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static int m3162d(String str, String str2) {
        b bVarM3165g;
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (bVarM3165g = m3165g(str2)) == null) {
                    return 0;
                }
                return AacUtil.m3551b(bVarM3165g.f6366b);
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m3163e(String str) {
        b bVarM3165g;
        String strM3164f = null;
        if (str == null) {
            return null;
        }
        String strM3111T = Util6.m3111T(str.trim());
        if (strM3111T.startsWith("avc1") || strM3111T.startsWith("avc3")) {
            return "video/avc";
        }
        if (strM3111T.startsWith("hev1") || strM3111T.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strM3111T.startsWith("dvav") || strM3111T.startsWith("dva1") || strM3111T.startsWith("dvhe") || strM3111T.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strM3111T.startsWith("av01")) {
            return "video/av01";
        }
        if (strM3111T.startsWith("vp9") || strM3111T.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strM3111T.startsWith("vp8") || strM3111T.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strM3111T.startsWith("mp4a")) {
            if (strM3111T.startsWith("mp4a.") && (bVarM3165g = m3165g(strM3111T)) != null) {
                strM3164f = m3164f(bVarM3165g.f6365a);
            }
            return strM3164f == null ? "audio/mp4a-latm" : strM3164f;
        }
        if (strM3111T.startsWith("ac-3") || strM3111T.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strM3111T.startsWith("ec-3") || strM3111T.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strM3111T.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strM3111T.startsWith("ac-4") || strM3111T.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strM3111T.startsWith("dtsc") || strM3111T.startsWith("dtse")) {
            return "audio/vnd.dts";
        }
        if (strM3111T.startsWith("dtsh") || strM3111T.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strM3111T.startsWith("opus")) {
            return "audio/opus";
        }
        if (strM3111T.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strM3111T.startsWith("flac")) {
            return "audio/flac";
        }
        if (strM3111T.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strM3111T.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strM3111T.contains("cea708")) {
            return "application/cea-708";
        }
        if (strM3111T.contains("eia608") || strM3111T.contains("cea608")) {
            return "application/cea-608";
        }
        int size = f6360a.size();
        for (int i = 0; i < size; i++) {
            a aVar = f6360a.get(i);
            if (strM3111T.startsWith(aVar.f6363b)) {
                return aVar.f6362a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static String m3164f(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX INFO: renamed from: g */
    public static b m3165g(String str) {
        Matcher matcher = f6361b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        Objects.requireNonNull(strGroup);
        String strGroup2 = matcher.group(2);
        try {
            return new b(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m3166h(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: i */
    public static int m3167i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m3169k(str)) {
            return 1;
        }
        if (m3171m(str)) {
            return 2;
        }
        if (m3170l(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = f6360a.size();
        for (int i = 0; i < size; i++) {
            a aVar = f6360a.get(i);
            if (str.equals(aVar.f6362a)) {
                return aVar.f6364c;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public static String m3168j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : Util6.m3108Q(str)) {
            String strM3163e = m3163e(str2);
            if (strM3163e != null && m3171m(strM3163e)) {
                return strM3163e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m3169k(String str) {
        return "audio".equals(m3166h(str));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m3170l(String str) {
        return "text".equals(m3166h(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m3171m(String str) {
        return "video".equals(m3166h(str));
    }
}
