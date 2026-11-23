package p555j.p556a.p557a.p597g.p605e;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.stetho.common.Utf8Charset;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;
import p007c.p162k.p163a.JsEvaluator2;
import p007c.p162k.p163a.WebViewWrapper;
import p007c.p162k.p163a.p164f.JsCallback;

/* JADX INFO: renamed from: j.a.a.g.e.c, reason: use source file name */
/* JADX INFO: compiled from: YouTubeExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class YouTubeExtractor extends AsyncTask<String, Void, SparseArray<YtFile>> {

    /* JADX INFO: renamed from: a */
    public static String f32213a;

    /* JADX INFO: renamed from: b */
    public static String f32214b;

    /* JADX INFO: renamed from: c */
    public static String f32215c;

    /* JADX INFO: renamed from: d */
    public static final Pattern f32216d = Pattern.compile("(http|https)://(www\\.|m.|)youtube\\.com/watch\\?v=(.+?)( |\\z|&)");

    /* JADX INFO: renamed from: e */
    public static final Pattern f32217e = Pattern.compile("(http|https)://(www\\.|)youtu.be/(.+?)( |\\z|&)");

    /* JADX INFO: renamed from: f */
    public static final Pattern f32218f = Pattern.compile("\"title\"\\s*:\\s*\"(.*?)\"");

    /* JADX INFO: renamed from: g */
    public static final Pattern f32219g = Pattern.compile("\"author\"\\s*:\\s*\"(.+?)\"");

    /* JADX INFO: renamed from: h */
    public static final Pattern f32220h = Pattern.compile("\"channelId\"\\s*:\\s*\"(.+?)\"");

    /* JADX INFO: renamed from: i */
    public static final Pattern f32221i = Pattern.compile("\"lengthSeconds\"\\s*:\\s*\"(\\d+?)\"");

    /* JADX INFO: renamed from: j */
    public static final Pattern f32222j = Pattern.compile("\"viewCount\"\\s*:\\s*\"(\\d+?)\"");

    /* JADX INFO: renamed from: k */
    public static final Pattern f32223k = Pattern.compile("\"shortDescription\"\\s*:\\s*\"(.+?)\"");

    /* JADX INFO: renamed from: l */
    public static final Pattern f32224l = Pattern.compile("status=ok(&|,|\\z)");

    /* JADX INFO: renamed from: m */
    public static final Pattern f32225m = Pattern.compile("hlsvp=(.+?)(&|\\z)");

    /* JADX INFO: renamed from: n */
    public static final Pattern f32226n = Pattern.compile("/itag/(\\d+?)/");

    /* JADX INFO: renamed from: o */
    public static final Pattern f32227o = Pattern.compile("itag=([0-9]+?)(&|\\z)");

    /* JADX INFO: renamed from: p */
    public static final Pattern f32228p = Pattern.compile("s=(.{10,}?)(\\\\\\\\u0026|\\z)");

    /* JADX INFO: renamed from: q */
    public static final Pattern f32229q = Pattern.compile("\"url\"\\s*:\\s*\"(.+?)\"");

    /* JADX INFO: renamed from: r */
    public static final Pattern f32230r = Pattern.compile("\"signatureCipher\"\\s*:\\s*\"(.+?)\"");

    /* JADX INFO: renamed from: s */
    public static final Pattern f32231s = Pattern.compile("url=(.+?)(\\\\\\\\u0026|\\z)");

    /* JADX INFO: renamed from: t */
    public static final Pattern f32232t = Pattern.compile("([{; =])([a-zA-Z$][a-zA-Z0-9$]{0,2})\\.([a-zA-Z$][a-zA-Z0-9$]{0,2})\\(");

    /* JADX INFO: renamed from: u */
    public static final Pattern f32233u = Pattern.compile("([{; =])([a-zA-Z$_][a-zA-Z0-9$]{0,2})\\(");

    /* JADX INFO: renamed from: v */
    public static final Pattern f32234v = Pattern.compile("\\\\/s\\\\/player\\\\/([^\"]+?)\\.js");

    /* JADX INFO: renamed from: w */
    public static final Pattern f32235w = Pattern.compile("/s/player/([^\"]+?).js");

    /* JADX INFO: renamed from: x */
    public static final Pattern f32236x = Pattern.compile("(?:\\b|[^a-zA-Z0-9$])([a-zA-Z0-9$]{2})\\s*=\\s*function\\(\\s*a\\s*\\)\\s*\\{\\s*a\\s*=\\s*a\\.split\\(\\s*\"\"\\s*\\)");

    /* JADX INFO: renamed from: y */
    public static final SparseArray<Format2> f32237y;

    /* JADX INFO: renamed from: A */
    public String f32238A;

    /* JADX INFO: renamed from: B */
    public VideoMeta f32239B;

    /* JADX INFO: renamed from: C */
    public boolean f32240C = true;

    /* JADX INFO: renamed from: D */
    public volatile String f32241D;

    /* JADX INFO: renamed from: E */
    public volatile String f32242E;

    /* JADX INFO: renamed from: F */
    public final Lock f32243F;

    /* JADX INFO: renamed from: G */
    public final Condition f32244G;

    /* JADX INFO: renamed from: z */
    public WeakReference<Context> f32245z;

    /* JADX INFO: renamed from: j.a.a.g.e.c$a */
    /* JADX INFO: compiled from: YouTubeExtractor.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Context f32246f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ StringBuilder f32247g;

        /* JADX INFO: renamed from: j.a.a.g.e.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: YouTubeExtractor.java */
        public class C8550a implements JsCallback {
            public C8550a() {
            }

            @Override // p007c.p162k.p163a.p164f.JsCallback
            /* JADX INFO: renamed from: a */
            public void mo2245a(String str) {
                YouTubeExtractor.this.f32243F.lock();
                try {
                    YouTubeExtractor.this.f32241D = str;
                    YouTubeExtractor.this.f32244G.signal();
                } finally {
                    YouTubeExtractor.this.f32243F.unlock();
                }
            }

            @Override // p007c.p162k.p163a.p164f.JsCallback
            public void onError(String str) {
                YouTubeExtractor.this.f32243F.lock();
                try {
                    String str2 = YouTubeExtractor.f32213a;
                    YouTubeExtractor.this.f32244G.signal();
                } finally {
                    YouTubeExtractor.this.f32243F.unlock();
                }
            }
        }

        public a(Context context, StringBuilder sb) {
            this.f32246f = context;
            this.f32247g = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            JsEvaluator2 jsEvaluator2 = new JsEvaluator2(this.f32246f);
            String string = this.f32247g.toString();
            C8550a c8550a = new C8550a();
            String str = String.format("%s.returnResultToJava(eval('try{%s}catch(e){\"%s\"+e}'));", "evgeniiJsEvaluator", string.replace("\\", "\\\\").replace("'", "\\'").replace("</", "<\\/").replace("\n", "\\n").replace("\r", "\\r"), "evgeniiJsEvaluatorException");
            jsEvaluator2.f4488c.set(c8550a);
            if (jsEvaluator2.f4486a == null) {
                jsEvaluator2.f4486a = new WebViewWrapper(jsEvaluator2.f4487b, jsEvaluator2);
            }
            WebViewWrapper webViewWrapper = (WebViewWrapper) jsEvaluator2.f4486a;
            Objects.requireNonNull(webViewWrapper);
            try {
                String strEncodeToString = Base64.encodeToString(("<script>" + str + "</script>").getBytes(Utf8Charset.NAME), 0);
                webViewWrapper.f4490a.loadUrl("data:text/html;charset=utf-8;base64," + strEncodeToString);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    static {
        SparseArray<Format2> sparseArray = new SparseArray<>();
        f32237y = sparseArray;
        sparseArray.put(17, new Format2(17, "3gp", 144, 24, false));
        sparseArray.put(36, new Format2(36, "3gp", 240, 32, false));
        sparseArray.put(5, new Format2(5, "flv", 240, 64, false));
        sparseArray.put(43, new Format2(43, "webm", 360, 128, false));
        sparseArray.put(18, new Format2(18, "mp4", 360, 96, false));
        sparseArray.put(22, new Format2(22, "mp4", 720, 192, false));
        sparseArray.put(160, new Format2(160, "mp4", 144, true));
        sparseArray.put(133, new Format2(133, "mp4", 240, true));
        sparseArray.put(134, new Format2(134, "mp4", 360, true));
        sparseArray.put(135, new Format2(135, "mp4", 480, true));
        sparseArray.put(136, new Format2(136, "mp4", 720, true));
        sparseArray.put(137, new Format2(137, "mp4", 1080, true));
        sparseArray.put(264, new Format2(264, "mp4", 1440, true));
        sparseArray.put(266, new Format2(266, "mp4", 2160, true));
        sparseArray.put(298, new Format2(298, "mp4", 720, 2, 60, 5, true));
        sparseArray.put(299, new Format2(299, "mp4", 1080, 2, 60, 5, true));
        sparseArray.put(140, new Format2(140, "m4a", 6, 2, 128, true));
        sparseArray.put(141, new Format2(141, "m4a", 6, 2, 256, true));
        sparseArray.put(256, new Format2(256, "m4a", 6, 2, 192, true));
        sparseArray.put(258, new Format2(258, "m4a", 6, 2, 384, true));
        sparseArray.put(278, new Format2(278, "webm", 144, true));
        sparseArray.put(242, new Format2(242, "webm", 240, true));
        sparseArray.put(243, new Format2(243, "webm", 360, true));
        sparseArray.put(244, new Format2(244, "webm", 480, true));
        sparseArray.put(247, new Format2(247, "webm", 720, true));
        sparseArray.put(248, new Format2(248, "webm", 1080, true));
        sparseArray.put(271, new Format2(271, "webm", 1440, true));
        sparseArray.put(313, new Format2(313, "webm", 2160, true));
        sparseArray.put(302, new Format2(302, "webm", 720, 5, 60, 5, true));
        sparseArray.put(308, new Format2(308, "webm", 1440, 5, 60, 5, true));
        sparseArray.put(303, new Format2(303, "webm", 1080, 5, 60, 5, true));
        sparseArray.put(315, new Format2(315, "webm", 2160, 5, 60, 5, true));
        sparseArray.put(171, new Format2(171, "webm", 6, 3, 128, true));
        sparseArray.put(249, new Format2(249, "webm", 6, 4, 48, true));
        sparseArray.put(250, new Format2(250, "webm", 6, 4, 64, true));
        sparseArray.put(251, new Format2(251, "webm", 6, 4, 160, true));
        sparseArray.put(91, new Format2(91, "mp4", 144, 48, false, true));
        sparseArray.put(92, new Format2(92, "mp4", 240, 48, false, true));
        sparseArray.put(93, new Format2(93, "mp4", 360, 128, false, true));
        sparseArray.put(94, new Format2(94, "mp4", 480, 128, false, true));
        sparseArray.put(95, new Format2(95, "mp4", 720, 256, false, true));
        sparseArray.put(96, new Format2(96, "mp4", 1080, 256, false, true));
    }

    public YouTubeExtractor(Context context) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f32243F = reentrantLock;
        this.f32244G = reentrantLock.newCondition();
        this.f32245z = new WeakReference<>(context);
        context.getCacheDir().getAbsolutePath();
    }

    /* JADX INFO: renamed from: a */
    public final void m14029a(SparseArray<String> sparseArray) {
        Context context = this.f32245z.get();
        if (context == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(outline.m1550A(new StringBuilder(), f32214b, " function decipher("));
        sb.append("){return ");
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            if (i < sparseArray.size() - 1) {
                sb.append(f32215c);
                sb.append("('");
                sb.append(sparseArray.get(iKeyAt));
                sb.append("')+\"\\n\"+");
            } else {
                sb.append(f32215c);
                sb.append("('");
                sb.append(sparseArray.get(iKeyAt));
                sb.append("')");
            }
        }
        sb.append("};decipher();");
        new Handler(Looper.getMainLooper()).post(new a(context, sb));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:104:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:116:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:120:0x0315  */
    /* JADX WARN: Code duplicated, block: B:122:0x031c  */
    /* JADX WARN: Code duplicated, block: B:129:0x032e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0332  */
    /* JADX WARN: Code duplicated, block: B:132:0x0342  */
    /* JADX WARN: Code duplicated, block: B:138:0x036e A[Catch: all -> 0x059d, LOOP:3: B:136:0x0368->B:138:0x036e, LOOP_END, TryCatch #5 {all -> 0x059d, blocks: (B:135:0x0361, B:136:0x0368, B:138:0x036e, B:139:0x0377), top: B:258:0x0361 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x038d  */
    /* JADX WARN: Code duplicated, block: B:144:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:145:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:148:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:152:0x0424  */
    /* JADX WARN: Code duplicated, block: B:153:0x0426  */
    /* JADX WARN: Code duplicated, block: B:158:0x0443  */
    /* JADX WARN: Code duplicated, block: B:159:0x0446  */
    /* JADX WARN: Code duplicated, block: B:161:0x044c  */
    /* JADX WARN: Code duplicated, block: B:166:0x045f  */
    /* JADX WARN: Code duplicated, block: B:172:0x048d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:176:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:177:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:179:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:185:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:191:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:192:0x0500  */
    /* JADX WARN: Code duplicated, block: B:197:0x0528  */
    /* JADX WARN: Code duplicated, block: B:198:0x052b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0531  */
    /* JADX WARN: Code duplicated, block: B:206:0x053e  */
    /* JADX WARN: Code duplicated, block: B:214:0x055d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:216:0x055f  */
    /* JADX WARN: Code duplicated, block: B:219:0x056c  */
    /* JADX WARN: Code duplicated, block: B:232:0x05b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:234:0x05b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:276:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0377 A[EDGE_INSN: B:285:0x0377->B:139:0x0377 BREAK  A[LOOP:3: B:136:0x0368->B:138:0x036e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x044e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x047c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0459 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x048f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x04be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x04ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x04c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x0533 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0203 A[EDGE_INSN: B:311:0x0203->B:75:0x0203 BREAK  A[LOOP:9: B:72:0x01f1->B:74:0x01f7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f7 A[Catch: all -> 0x05b3, LOOP:9: B:72:0x01f1->B:74:0x01f7, LOOP_END, TryCatch #2 {all -> 0x05b3, blocks: (B:71:0x01ec, B:72:0x01f1, B:74:0x01f7, B:75:0x0203), top: B:252:0x01ec }] */
    /* JADX WARN: Code duplicated, block: B:78:0x021e  */
    /* JADX WARN: Code duplicated, block: B:81:0x022a  */
    /* JADX WARN: Code duplicated, block: B:83:0x023a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0240  */
    /* JADX WARN: Code duplicated, block: B:90:0x0253  */
    /* JADX WARN: Code duplicated, block: B:91:0x025a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0266 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0268  */
    /* JADX WARN: Code duplicated, block: B:97:0x0294  */
    /* JADX WARN: Code duplicated, block: B:99:0x02a8  */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x0268, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public final SparseArray<YtFile> m14030b() throws Throwable {
        BufferedReader bufferedReader;
        boolean z;
        boolean z2;
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader2;
        StringBuilder sb;
        String line;
        String string;
        Matcher matcher;
        SparseArray<String> sparseArray;
        String str;
        SparseArray<YtFile> sparseArray2;
        Matcher matcher2;
        String string2;
        HttpURLConnection httpURLConnection2;
        BufferedReader bufferedReader3;
        StringBuilder sb2;
        String line2;
        String string3;
        Matcher matcher3;
        boolean z3;
        Matcher matcher4;
        int i;
        String string4;
        int i2;
        int i3;
        Matcher matcher5;
        Matcher matcher6;
        String string5;
        int i4;
        int i5;
        String string6;
        int length;
        int i6;
        int i7;
        String str2;
        String[] strArrSplit;
        int i8;
        String strGroup;
        String str3;
        Matcher matcher7;
        int i9;
        SparseArray<Format2> sparseArray3;
        String strReplace;
        Matcher matcher8;
        Matcher matcher9;
        StringBuilder sbM1561L = outline.m1561L("https://", "www.youtube.com/get_video_info?video_id=");
        sbM1561L.append(this.f32238A);
        sbM1561L.append("&eurl=");
        sbM1561L.append(URLEncoder.encode("https://youtube.googleapis.com/v/" + this.f32238A, Utf8Charset.NAME));
        HttpURLConnection httpURLConnection3 = (HttpURLConnection) new URL(sbM1561L.toString()).openConnection();
        httpURLConnection3.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36");
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection3.getInputStream()));
            try {
                String line3 = bufferedReader.readLine();
                bufferedReader.close();
                httpURLConnection3.disconnect();
                String strReplace2 = URLDecoder.decode(line3, Utf8Charset.NAME).replace("\\u0026", "&");
                Matcher matcher10 = f32218f.matcher(strReplace2);
                String strGroup2 = matcher10.find() ? matcher10.group(1) : null;
                Pattern pattern = f32225m;
                boolean zFind = pattern.matcher(strReplace2).find();
                Matcher matcher11 = f32219g.matcher(strReplace2);
                String strGroup3 = matcher11.find() ? matcher11.group(1) : null;
                Matcher matcher12 = f32220h.matcher(strReplace2);
                String strGroup4 = matcher12.find() ? matcher12.group(1) : null;
                Matcher matcher13 = f32223k.matcher(strReplace2);
                String strGroup5 = matcher13.find() ? matcher13.group(1) : null;
                Matcher matcher14 = f32221i.matcher(strReplace2);
                long j2 = matcher14.find() ? Long.parseLong(matcher14.group(1)) : 0L;
                Matcher matcher15 = f32222j.matcher(strReplace2);
                this.f32239B = new VideoMeta(this.f32238A, strGroup2, strGroup3, strGroup4, j2, matcher15.find() ? Long.parseLong(matcher15.group(1)) : 0L, zFind, strGroup5);
                if (!zFind) {
                    int i10 = 1;
                    char c2 = 0;
                    if (!f32230r.matcher(strReplace2).find()) {
                        if (f32224l.matcher(strReplace2).find()) {
                            z = false;
                        } else {
                            z = false;
                            z2 = true;
                        }
                        if (!z || z2) {
                            StringBuilder sbM1556G = outline.m1556G("https://youtube.com/watch?v=");
                            sbM1556G.append(this.f32238A);
                            httpURLConnection = (HttpURLConnection) new URL(sbM1556G.toString()).openConnection();
                            httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36");
                            try {
                                bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                                try {
                                    sb = new StringBuilder();
                                    while (true) {
                                        line = bufferedReader2.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        sb.append(line.replace("\\\"", "\""));
                                    }
                                    string = sb.toString();
                                    bufferedReader2.close();
                                    httpURLConnection.disconnect();
                                    SparseArray<String> sparseArray4 = new SparseArray<>();
                                    matcher = f32234v.matcher(string);
                                    if (!matcher.find()) {
                                        matcher = f32235w.matcher(string);
                                    }
                                    if (matcher.find()) {
                                        String strReplace3 = matcher.group(0).replace("\\/", "/");
                                        str = f32213a;
                                        if (str != null || !str.equals(strReplace3)) {
                                            f32214b = null;
                                            f32215c = null;
                                        }
                                        f32213a = strReplace3;
                                    }
                                    sparseArray = sparseArray4;
                                    strReplace2 = string;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader = bufferedReader2;
                                    bufferedReader.close();
                                    httpURLConnection.disconnect();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            sparseArray = null;
                        }
                        sparseArray2 = new SparseArray<>();
                        if (z) {
                            matcher2 = f32230r.matcher(strReplace2);
                        } else {
                            matcher2 = f32229q.matcher(strReplace2);
                        }
                        while (matcher2.find()) {
                            if (z) {
                                strReplace = matcher2.group(i10).replace("&", "\\\\u0026");
                                Log.d("YouTubeExtractor", "Cipher:" + strReplace);
                                matcher8 = f32231s.matcher(strReplace);
                                if (matcher8.find()) {
                                    strGroup = URLDecoder.decode(matcher8.group(i10), Utf8Charset.NAME);
                                    matcher9 = f32228p.matcher(strReplace);
                                    if (matcher9.find()) {
                                        str3 = URLDecoder.decode(matcher9.group(i10), Utf8Charset.NAME).replace("\\u0026", "&").split("&")[c2];
                                    }
                                }
                                c2 = 0;
                                i10 = 1;
                            } else {
                                strGroup = matcher2.group(i10);
                                str3 = null;
                            }
                            matcher7 = f32227o.matcher(strGroup);
                            if (!matcher7.find()) {
                                i9 = Integer.parseInt(matcher7.group(i10));
                                sparseArray3 = f32237y;
                                if (sparseArray3.get(i9) != null && ((this.f32240C || !sparseArray3.get(i9).f32200b.equals("webm")) && !strGroup.contains("&source=yt_otf&"))) {
                                    if (str3 != null) {
                                        sparseArray.append(i9, str3);
                                    }
                                    sparseArray2.put(i9, new YtFile(sparseArray3.get(i9), strGroup));
                                }
                            }
                            c2 = 0;
                            i10 = 1;
                        }
                        if (sparseArray != null) {
                            this.f32241D = null;
                            if (this.f32242E != null) {
                                f32215c = null;
                                f32214b = null;
                            }
                            if (f32215c != null || f32214b == null) {
                                if (this.f32242E == null) {
                                    StringBuilder sbM1556G2 = outline.m1556G("https://youtube.com");
                                    sbM1556G2.append(f32213a);
                                    string2 = sbM1556G2.toString();
                                } else {
                                    string2 = this.f32242E;
                                }
                                httpURLConnection2 = (HttpURLConnection) new URL(string2).openConnection();
                                httpURLConnection2.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36");
                                try {
                                    bufferedReader3 = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream()));
                                    try {
                                        sb2 = new StringBuilder("");
                                        while (true) {
                                            line2 = bufferedReader3.readLine();
                                            if (line2 == null) {
                                                break;
                                            }
                                            sb2.append(line2);
                                            sb2.append(" ");
                                        }
                                        string3 = sb2.toString();
                                        bufferedReader3.close();
                                        httpURLConnection2.disconnect();
                                        matcher3 = f32236x.matcher(string3);
                                        if (matcher3.find()) {
                                            f32215c = matcher3.group(1);
                                            StringBuilder sbM1556G3 = outline.m1556G("(var |\\s|,|;)");
                                            sbM1556G3.append(f32215c.replace("$", "\\$"));
                                            sbM1556G3.append("(=function\\((.{1,3})\\)\\{)");
                                            matcher4 = Pattern.compile(sbM1556G3.toString()).matcher(string3);
                                            i = 2;
                                            if (matcher4.find()) {
                                                StringBuilder sbM1556G4 = outline.m1556G("var ");
                                                sbM1556G4.append(f32215c);
                                                sbM1556G4.append(matcher4.group(2));
                                                string4 = sbM1556G4.toString();
                                            } else {
                                                StringBuilder sbM1556G5 = outline.m1556G("function ");
                                                sbM1556G5.append(f32215c.replace("$", "\\$"));
                                                sbM1556G5.append("(\\((.{1,3})\\)\\{)");
                                                matcher4 = Pattern.compile(sbM1556G5.toString()).matcher(string3);
                                                if (matcher4.find()) {
                                                    StringBuilder sbM1556G6 = outline.m1556G("function ");
                                                    sbM1556G6.append(f32215c);
                                                    sbM1556G6.append(matcher4.group(2));
                                                    string4 = sbM1556G6.toString();
                                                }
                                                if (z3) {
                                                    this.f32243F.lock();
                                                    try {
                                                        this.f32244G.await(7L, TimeUnit.SECONDS);
                                                        this.f32243F.unlock();
                                                    } catch (Throwable th3) {
                                                        this.f32243F.unlock();
                                                        throw th3;
                                                    }
                                                }
                                                str2 = this.f32241D;
                                                if (str2 == null) {
                                                    return null;
                                                }
                                                strArrSplit = str2.split("\n");
                                                for (i8 = 0; i8 < sparseArray.size() && i8 < strArrSplit.length; i8++) {
                                                    int iKeyAt = sparseArray.keyAt(i8);
                                                    StringBuilder sbM1561L2 = outline.m1561L(sparseArray2.get(iKeyAt).f32251b, "&sig=");
                                                    sbM1561L2.append(strArrSplit[i8]);
                                                    sparseArray2.put(iKeyAt, new YtFile(f32237y.get(iKeyAt), sbM1561L2.toString()));
                                                }
                                            }
                                            int iEnd = matcher4.end();
                                            i2 = 1;
                                            for (i3 = iEnd; i3 < string3.length(); i3++) {
                                                if (i2 != 0 && iEnd + 5 < i3) {
                                                    StringBuilder sbM1556G7 = outline.m1556G(string4);
                                                    sbM1556G7.append(string3.substring(iEnd, i3));
                                                    sbM1556G7.append(";");
                                                    string4 = sbM1556G7.toString();
                                                    break;
                                                }
                                                if (string3.charAt(i3) == '{') {
                                                    i2++;
                                                } else if (string3.charAt(i3) == '}') {
                                                    i2--;
                                                }
                                            }
                                            f32214b = string4;
                                            matcher5 = f32232t.matcher(string4);
                                            while (matcher5.find()) {
                                                StringBuilder sbM1556G8 = outline.m1556G("var ");
                                                sbM1556G8.append(matcher5.group(i));
                                                sbM1556G8.append("={");
                                                string6 = sbM1556G8.toString();
                                                if (!f32214b.contains(string6)) {
                                                    length = string6.length() + string3.indexOf(string6);
                                                    i6 = 1;
                                                    for (i7 = length; i7 < string3.length(); i7++) {
                                                        if (i6 == 0) {
                                                            f32214b += string6 + string3.substring(length, i7) + ";";
                                                            break;
                                                        }
                                                        if (string3.charAt(i7) == '{') {
                                                            i6++;
                                                        } else if (string3.charAt(i7) == '}') {
                                                            i6--;
                                                        }
                                                    }
                                                    i = 2;
                                                }
                                            }
                                            matcher6 = f32233u.matcher(string4);
                                            while (matcher6.find()) {
                                                StringBuilder sbM1556G9 = outline.m1556G("function ");
                                                sbM1556G9.append(matcher6.group(2));
                                                sbM1556G9.append("(");
                                                string5 = sbM1556G9.toString();
                                                if (!f32214b.contains(string5)) {
                                                    int length2 = string5.length() + string3.indexOf(string5);
                                                    i4 = 0;
                                                    for (i5 = length2; i5 < string3.length(); i5++) {
                                                        if (i4 != 0 && length2 + 5 < i5) {
                                                            f32214b += string5 + string3.substring(length2, i5) + ";";
                                                            break;
                                                        }
                                                        if (string3.charAt(i5) == '{') {
                                                            i4++;
                                                        } else if (string3.charAt(i5) == '}') {
                                                            i4--;
                                                        }
                                                    }
                                                }
                                            }
                                            m14029a(sparseArray);
                                        }
                                        z3 = false;
                                        if (z3) {
                                            this.f32243F.lock();
                                            this.f32244G.await(7L, TimeUnit.SECONDS);
                                            this.f32243F.unlock();
                                        }
                                        str2 = this.f32241D;
                                        if (str2 == null) {
                                            return null;
                                        }
                                        strArrSplit = str2.split("\n");
                                        while (i8 < sparseArray.size()) {
                                            int iKeyAt2 = sparseArray.keyAt(i8);
                                            StringBuilder sbM1561L3 = outline.m1561L(sparseArray2.get(iKeyAt2).f32251b, "&sig=");
                                            sbM1561L3.append(strArrSplit[i8]);
                                            sparseArray2.put(iKeyAt2, new YtFile(f32237y.get(iKeyAt2), sbM1561L3.toString()));
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        if (bufferedReader3 != null) {
                                            bufferedReader3.close();
                                        }
                                        httpURLConnection2.disconnect();
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bufferedReader3 = null;
                                }
                            } else {
                                m14029a(sparseArray);
                            }
                            z3 = true;
                            if (z3) {
                                this.f32243F.lock();
                                this.f32244G.await(7L, TimeUnit.SECONDS);
                                this.f32243F.unlock();
                            }
                            str2 = this.f32241D;
                            if (str2 == null) {
                                return null;
                            }
                            strArrSplit = str2.split("\n");
                            while (i8 < sparseArray.size()) {
                                int iKeyAt3 = sparseArray.keyAt(i8);
                                StringBuilder sbM1561L4 = outline.m1561L(sparseArray2.get(iKeyAt3).f32251b, "&sig=");
                                sbM1561L4.append(strArrSplit[i8]);
                                sparseArray2.put(iKeyAt3, new YtFile(f32237y.get(iKeyAt3), sbM1561L4.toString()));
                            }
                        }
                        if (sparseArray2.size() == 0) {
                            return null;
                        }
                        return sparseArray2;
                    }
                    z = true;
                    z2 = false;
                    if (z) {
                        StringBuilder sbM1556G10 = outline.m1556G("https://youtube.com/watch?v=");
                        sbM1556G10.append(this.f32238A);
                        httpURLConnection = (HttpURLConnection) new URL(sbM1556G10.toString()).openConnection();
                        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36");
                        bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                        sb = new StringBuilder();
                        while (true) {
                            line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                                break;
                            }
                            sb.append(line.replace("\\\"", "\""));
                        }
                        string = sb.toString();
                        bufferedReader2.close();
                        httpURLConnection.disconnect();
                        SparseArray<String> sparseArray5 = new SparseArray<>();
                        matcher = f32234v.matcher(string);
                        if (!matcher.find()) {
                            matcher = f32235w.matcher(string);
                        }
                        if (matcher.find()) {
                            String strReplace4 = matcher.group(0).replace("\\/", "/");
                            str = f32213a;
                            if (str != null) {
                                f32214b = null;
                                f32215c = null;
                            } else {
                                f32214b = null;
                                f32215c = null;
                            }
                            f32213a = strReplace4;
                        }
                        sparseArray = sparseArray5;
                        strReplace2 = string;
                    } else {
                        StringBuilder sbM1556G11 = outline.m1556G("https://youtube.com/watch?v=");
                        sbM1556G11.append(this.f32238A);
                        httpURLConnection = (HttpURLConnection) new URL(sbM1556G11.toString()).openConnection();
                        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36");
                        bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                        sb = new StringBuilder();
                        while (true) {
                            line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                                break;
                            }
                            sb.append(line.replace("\\\"", "\""));
                        }
                        string = sb.toString();
                        bufferedReader2.close();
                        httpURLConnection.disconnect();
                        SparseArray<String> sparseArray6 = new SparseArray<>();
                        matcher = f32234v.matcher(string);
                        if (!matcher.find()) {
                            matcher = f32235w.matcher(string);
                        }
                        if (matcher.find()) {
                            String strReplace5 = matcher.group(0).replace("\\/", "/");
                            str = f32213a;
                            if (str != null) {
                                f32214b = null;
                                f32215c = null;
                            } else {
                                f32214b = null;
                                f32215c = null;
                            }
                            f32213a = strReplace5;
                        }
                        sparseArray = sparseArray6;
                        strReplace2 = string;
                    }
                    sparseArray2 = new SparseArray<>();
                    if (z) {
                        matcher2 = f32230r.matcher(strReplace2);
                    } else {
                        matcher2 = f32229q.matcher(strReplace2);
                    }
                    while (matcher2.find()) {
                        if (z) {
                            strReplace = matcher2.group(i10).replace("&", "\\\\u0026");
                            Log.d("YouTubeExtractor", "Cipher:" + strReplace);
                            matcher8 = f32231s.matcher(strReplace);
                            if (matcher8.find()) {
                                strGroup = URLDecoder.decode(matcher8.group(i10), Utf8Charset.NAME);
                                matcher9 = f32228p.matcher(strReplace);
                                if (matcher9.find()) {
                                    str3 = URLDecoder.decode(matcher9.group(i10), Utf8Charset.NAME).replace("\\u0026", "&").split("&")[c2];
                                }
                            }
                            c2 = 0;
                            i10 = 1;
                        } else {
                            strGroup = matcher2.group(i10);
                            str3 = null;
                        }
                        matcher7 = f32227o.matcher(strGroup);
                        if (!matcher7.find()) {
                            i9 = Integer.parseInt(matcher7.group(i10));
                            sparseArray3 = f32237y;
                            if (sparseArray3.get(i9) != null) {
                                if (str3 != null) {
                                    sparseArray.append(i9, str3);
                                }
                                sparseArray2.put(i9, new YtFile(sparseArray3.get(i9), strGroup));
                            }
                        }
                        c2 = 0;
                        i10 = 1;
                    }
                    if (sparseArray != null) {
                        this.f32241D = null;
                        if (this.f32242E != null) {
                            f32215c = null;
                            f32214b = null;
                        }
                        if (f32215c != null) {
                            if (this.f32242E == null) {
                                StringBuilder sbM1556G12 = outline.m1556G("https://youtube.com");
                                sbM1556G12.append(f32213a);
                                string2 = sbM1556G12.toString();
                            } else {
                                string2 = this.f32242E;
                            }
                            httpURLConnection2 = (HttpURLConnection) new URL(string2).openConnection();
                            httpURLConnection2.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36");
                            bufferedReader3 = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream()));
                            sb2 = new StringBuilder("");
                            while (true) {
                                line2 = bufferedReader3.readLine();
                                if (line2 == null) {
                                    break;
                                    break;
                                }
                                sb2.append(line2);
                                sb2.append(" ");
                            }
                            string3 = sb2.toString();
                            bufferedReader3.close();
                            httpURLConnection2.disconnect();
                            matcher3 = f32236x.matcher(string3);
                            if (matcher3.find()) {
                                f32215c = matcher3.group(1);
                                StringBuilder sbM1556G13 = outline.m1556G("(var |\\s|,|;)");
                                sbM1556G13.append(f32215c.replace("$", "\\$"));
                                sbM1556G13.append("(=function\\((.{1,3})\\)\\{)");
                                matcher4 = Pattern.compile(sbM1556G13.toString()).matcher(string3);
                                i = 2;
                                if (matcher4.find()) {
                                    StringBuilder sbM1556G14 = outline.m1556G("var ");
                                    sbM1556G14.append(f32215c);
                                    sbM1556G14.append(matcher4.group(2));
                                    string4 = sbM1556G14.toString();
                                } else {
                                    StringBuilder sbM1556G15 = outline.m1556G("function ");
                                    sbM1556G15.append(f32215c.replace("$", "\\$"));
                                    sbM1556G15.append("(\\((.{1,3})\\)\\{)");
                                    matcher4 = Pattern.compile(sbM1556G15.toString()).matcher(string3);
                                    if (matcher4.find()) {
                                        StringBuilder sbM1556G16 = outline.m1556G("function ");
                                        sbM1556G16.append(f32215c);
                                        sbM1556G16.append(matcher4.group(2));
                                        string4 = sbM1556G16.toString();
                                    }
                                }
                                int iEnd2 = matcher4.end();
                                i2 = 1;
                                while (i3 < string3.length()) {
                                    if (i2 != 0) {
                                    }
                                    if (string3.charAt(i3) == '{') {
                                        i2++;
                                    } else if (string3.charAt(i3) == '}') {
                                        i2--;
                                    }
                                }
                                f32214b = string4;
                                matcher5 = f32232t.matcher(string4);
                                while (matcher5.find()) {
                                    StringBuilder sbM1556G17 = outline.m1556G("var ");
                                    sbM1556G17.append(matcher5.group(i));
                                    sbM1556G17.append("={");
                                    string6 = sbM1556G17.toString();
                                    if (!f32214b.contains(string6)) {
                                        length = string6.length() + string3.indexOf(string6);
                                        i6 = 1;
                                        while (i7 < string3.length()) {
                                            if (i6 == 0) {
                                                f32214b += string6 + string3.substring(length, i7) + ";";
                                                break;
                                            }
                                            if (string3.charAt(i7) == '{') {
                                                i6++;
                                            } else if (string3.charAt(i7) == '}') {
                                                i6--;
                                            }
                                        }
                                        i = 2;
                                    }
                                }
                                matcher6 = f32233u.matcher(string4);
                                while (matcher6.find()) {
                                    StringBuilder sbM1556G18 = outline.m1556G("function ");
                                    sbM1556G18.append(matcher6.group(2));
                                    sbM1556G18.append("(");
                                    string5 = sbM1556G18.toString();
                                    if (!f32214b.contains(string5)) {
                                        int length3 = string5.length() + string3.indexOf(string5);
                                        i4 = 0;
                                        while (i5 < string3.length()) {
                                            if (i4 != 0) {
                                            }
                                            if (string3.charAt(i5) == '{') {
                                                i4++;
                                            } else if (string3.charAt(i5) == '}') {
                                                i4--;
                                            }
                                        }
                                    }
                                }
                                m14029a(sparseArray);
                                z3 = true;
                            }
                            z3 = false;
                        } else {
                            if (this.f32242E == null) {
                                StringBuilder sbM1556G19 = outline.m1556G("https://youtube.com");
                                sbM1556G19.append(f32213a);
                                string2 = sbM1556G19.toString();
                            } else {
                                string2 = this.f32242E;
                            }
                            httpURLConnection2 = (HttpURLConnection) new URL(string2).openConnection();
                            httpURLConnection2.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36");
                            bufferedReader3 = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream()));
                            sb2 = new StringBuilder("");
                            while (true) {
                                line2 = bufferedReader3.readLine();
                                if (line2 == null) {
                                    break;
                                    break;
                                }
                                sb2.append(line2);
                                sb2.append(" ");
                            }
                            string3 = sb2.toString();
                            bufferedReader3.close();
                            httpURLConnection2.disconnect();
                            matcher3 = f32236x.matcher(string3);
                            if (matcher3.find()) {
                                f32215c = matcher3.group(1);
                                StringBuilder sbM1556G110 = outline.m1556G("(var |\\s|,|;)");
                                sbM1556G110.append(f32215c.replace("$", "\\$"));
                                sbM1556G110.append("(=function\\((.{1,3})\\)\\{)");
                                matcher4 = Pattern.compile(sbM1556G110.toString()).matcher(string3);
                                i = 2;
                                if (matcher4.find()) {
                                    StringBuilder sbM1556G111 = outline.m1556G("var ");
                                    sbM1556G111.append(f32215c);
                                    sbM1556G111.append(matcher4.group(2));
                                    string4 = sbM1556G111.toString();
                                } else {
                                    StringBuilder sbM1556G112 = outline.m1556G("function ");
                                    sbM1556G112.append(f32215c.replace("$", "\\$"));
                                    sbM1556G112.append("(\\((.{1,3})\\)\\{)");
                                    matcher4 = Pattern.compile(sbM1556G112.toString()).matcher(string3);
                                    if (matcher4.find()) {
                                        StringBuilder sbM1556G113 = outline.m1556G("function ");
                                        sbM1556G113.append(f32215c);
                                        sbM1556G113.append(matcher4.group(2));
                                        string4 = sbM1556G113.toString();
                                    }
                                }
                                int iEnd3 = matcher4.end();
                                i2 = 1;
                                while (i3 < string3.length()) {
                                    if (i2 != 0) {
                                    }
                                    if (string3.charAt(i3) == '{') {
                                        i2++;
                                    } else if (string3.charAt(i3) == '}') {
                                        i2--;
                                    }
                                }
                                f32214b = string4;
                                matcher5 = f32232t.matcher(string4);
                                while (matcher5.find()) {
                                    StringBuilder sbM1556G114 = outline.m1556G("var ");
                                    sbM1556G114.append(matcher5.group(i));
                                    sbM1556G114.append("={");
                                    string6 = sbM1556G114.toString();
                                    if (!f32214b.contains(string6)) {
                                        length = string6.length() + string3.indexOf(string6);
                                        i6 = 1;
                                        while (i7 < string3.length()) {
                                            if (i6 == 0) {
                                                f32214b += string6 + string3.substring(length, i7) + ";";
                                                break;
                                            }
                                            if (string3.charAt(i7) == '{') {
                                                i6++;
                                            } else if (string3.charAt(i7) == '}') {
                                                i6--;
                                            }
                                        }
                                        i = 2;
                                    }
                                }
                                matcher6 = f32233u.matcher(string4);
                                while (matcher6.find()) {
                                    StringBuilder sbM1556G115 = outline.m1556G("function ");
                                    sbM1556G115.append(matcher6.group(2));
                                    sbM1556G115.append("(");
                                    string5 = sbM1556G115.toString();
                                    if (!f32214b.contains(string5)) {
                                        int length4 = string5.length() + string3.indexOf(string5);
                                        i4 = 0;
                                        while (i5 < string3.length()) {
                                            if (i4 != 0) {
                                            }
                                            if (string3.charAt(i5) == '{') {
                                                i4++;
                                            } else if (string3.charAt(i5) == '}') {
                                                i4--;
                                            }
                                        }
                                    }
                                }
                                m14029a(sparseArray);
                                z3 = true;
                            }
                            z3 = false;
                        }
                        if (z3) {
                            this.f32243F.lock();
                            this.f32244G.await(7L, TimeUnit.SECONDS);
                            this.f32243F.unlock();
                        }
                        str2 = this.f32241D;
                        if (str2 == null) {
                            return null;
                        }
                        strArrSplit = str2.split("\n");
                        while (i8 < sparseArray.size()) {
                            int iKeyAt4 = sparseArray.keyAt(i8);
                            StringBuilder sbM1561L5 = outline.m1561L(sparseArray2.get(iKeyAt4).f32251b, "&sig=");
                            sbM1561L5.append(strArrSplit[i8]);
                            sparseArray2.put(iKeyAt4, new YtFile(f32237y.get(iKeyAt4), sbM1561L5.toString()));
                        }
                    }
                    if (sparseArray2.size() == 0) {
                        return null;
                    }
                    return sparseArray2;
                }
                Matcher matcher16 = pattern.matcher(strReplace2);
                if (!matcher16.find()) {
                    return null;
                }
                String strDecode = URLDecoder.decode(matcher16.group(1), Utf8Charset.NAME);
                SparseArray<YtFile> sparseArray7 = new SparseArray<>();
                HttpURLConnection httpURLConnection4 = (HttpURLConnection) new URL(strDecode).openConnection();
                httpURLConnection4.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36");
                try {
                    BufferedReader bufferedReader4 = new BufferedReader(new InputStreamReader(httpURLConnection4.getInputStream()));
                    while (true) {
                        try {
                            String line4 = bufferedReader4.readLine();
                            if (line4 == null) {
                                break;
                            }
                            if (line4.startsWith("https://") || line4.startsWith("http://")) {
                                Matcher matcher17 = f32226n.matcher(line4);
                                if (matcher17.find()) {
                                    int i11 = Integer.parseInt(matcher17.group(1));
                                    sparseArray7.put(i11, new YtFile(f32237y.get(i11), line4));
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            bufferedReader = bufferedReader4;
                            bufferedReader.close();
                            httpURLConnection4.disconnect();
                            throw th;
                        }
                    }
                    bufferedReader4.close();
                    httpURLConnection4.disconnect();
                    if (sparseArray7.size() == 0) {
                        return null;
                    }
                    return sparseArray7;
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (Throwable th8) {
                th = th8;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                httpURLConnection3.disconnect();
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo14031c(SparseArray<YtFile> sparseArray, VideoMeta videoMeta);

    /* JADX INFO: renamed from: d */
    public abstract void mo14032d();

    @Override // android.os.AsyncTask
    public SparseArray<YtFile> doInBackground(String[] strArr) {
        this.f32238A = null;
        String str = strArr[0];
        if (str == null) {
            return null;
        }
        Matcher matcher = f32216d.matcher(str);
        if (matcher.find()) {
            this.f32238A = matcher.group(3);
        } else {
            Matcher matcher2 = f32217e.matcher(str);
            if (matcher2.find()) {
                this.f32238A = matcher2.group(3);
            } else if (str.matches("\\p{Graph}+?")) {
                this.f32238A = str;
            }
        }
        if (this.f32238A == null) {
            Log.e("YouTubeExtractor", "Wrong YouTube link format");
            return null;
        }
        try {
            return m14030b();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(SparseArray<YtFile> sparseArray) {
        try {
            mo14031c(sparseArray, this.f32239B);
        } catch (Exception unused) {
            mo14032d();
        }
    }
}
