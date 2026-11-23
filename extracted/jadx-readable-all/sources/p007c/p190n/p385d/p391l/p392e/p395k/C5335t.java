package p007c.p190n.p385d.p391l.p392e.p395k;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p195a.Encoding;
import p007c.p190n.p194b.p195a.Transformer;
import p007c.p190n.p194b.p195a.TransportFactory;
import p007c.p190n.p194b.p195a.p196i.CCTDestination;
import p007c.p190n.p194b.p195a.p198j.TransportFactoryImpl;
import p007c.p190n.p194b.p195a.p198j.TransportRuntime;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.C4778g0;
import p007c.p190n.p194b.p266d.p333n.C4782j;
import p007c.p190n.p194b.p266d.p333n.C4783k;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4779h;
import p007c.p190n.p385d.p391l.p392e.CrashlyticsNativeComponent;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p393i.AnalyticsEventLogger;
import p007c.p190n.p385d.p391l.p392e.p396l.LogFileManager;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Application;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Device;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport;
import p007c.p190n.p385d.p391l.p392e.p397m.ImmutableList3;
import p007c.p190n.p385d.p391l.p392e.p397m.p398x.CrashlyticsReportJsonTransform8;
import p007c.p190n.p385d.p391l.p392e.p399n.HttpRequestFactory;
import p007c.p190n.p385d.p391l.p392e.p400o.CrashlyticsReportPersistence7;
import p007c.p190n.p385d.p391l.p392e.p400o.FileStore;
import p007c.p190n.p385d.p391l.p392e.p400o.FileStoreImpl;
import p007c.p190n.p385d.p391l.p392e.p401p.ByteString;
import p007c.p190n.p385d.p391l.p392e.p401p.ClsFileOutputStream;
import p007c.p190n.p385d.p391l.p392e.p401p.CodedOutputStream;
import p007c.p190n.p385d.p391l.p392e.p401p.SessionProtobufHelper;
import p007c.p190n.p385d.p391l.p392e.p402q.ReportManager;
import p007c.p190n.p385d.p391l.p392e.p402q.ReportUploader;
import p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report;
import p007c.p190n.p385d.p391l.p392e.p405r.DataTransportCrashlyticsReportSender3;
import p007c.p190n.p385d.p391l.p392e.p406s.SettingsController;
import p007c.p190n.p385d.p391l.p392e.p406s.SettingsDataProvider;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.AppSettingsData;
import p007c.p190n.p385d.p391l.p392e.p409t.MiddleOutFallbackStrategy;
import p007c.p190n.p385d.p391l.p392e.p409t.RemoveRepeatsStrategy;
import p007c.p190n.p385d.p391l.p392e.p409t.StackTraceTrimmingStrategy;
import p007c.p190n.p385d.p391l.p392e.p409t.TrimmedThrowableData;
import p007c.p190n.p385d.p391l.p392e.p410u.ResourceUnityVersionProvider;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: c.n.d.l.e.k.t */
/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes.dex */
public class C5335t {

    /* JADX INFO: renamed from: a */
    public static final FilenameFilter f26579a = new a("BeginSession");

    /* JADX INFO: renamed from: b */
    public static final FilenameFilter f26580b = new FilenameFilter() { // from class: c.n.d.l.e.k.l
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            FilenameFilter filenameFilter = C5335t.f26579a;
            return str.startsWith(".ae");
        }
    };

    /* JADX INFO: renamed from: c */
    public static final FilenameFilter f26581c = new b();

    /* JADX INFO: renamed from: d */
    public static final Comparator<File> f26582d = new c();

    /* JADX INFO: renamed from: e */
    public static final Comparator<File> f26583e = new d();

    /* JADX INFO: renamed from: f */
    public static final Pattern f26584f = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");

    /* JADX INFO: renamed from: g */
    public static final Map<String, String> f26585g = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");

    /* JADX INFO: renamed from: h */
    public static final String[] f26586h = {"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};

    /* JADX INFO: renamed from: A */
    public final SessionReportingCoordinator3 f26587A;

    /* JADX INFO: renamed from: B */
    public CrashlyticsUncaughtExceptionHandler f26588B;

    /* JADX INFO: renamed from: C */
    public C4782j<Boolean> f26589C;

    /* JADX INFO: renamed from: D */
    public C4782j<Boolean> f26590D;

    /* JADX INFO: renamed from: E */
    public C4782j<Void> f26591E;

    /* JADX INFO: renamed from: i */
    public final Context f26592i;

    /* JADX INFO: renamed from: j */
    public final DataCollectionArbiter f26593j;

    /* JADX INFO: renamed from: k */
    public final CrashlyticsFileMarker f26594k;

    /* JADX INFO: renamed from: l */
    public final UserMetadata f26595l;

    /* JADX INFO: renamed from: m */
    public final CrashlyticsBackgroundWorker f26596m;

    /* JADX INFO: renamed from: n */
    public final HttpRequestFactory f26597n;

    /* JADX INFO: renamed from: o */
    public final IdManager f26598o;

    /* JADX INFO: renamed from: p */
    public final FileStore f26599p;

    /* JADX INFO: renamed from: q */
    public final AppData f26600q;

    /* JADX INFO: renamed from: r */
    public final ReportUploader.b f26601r;

    /* JADX INFO: renamed from: s */
    public final j f26602s;

    /* JADX INFO: renamed from: t */
    public final LogFileManager f26603t;

    /* JADX INFO: renamed from: u */
    public final ReportManager f26604u;

    /* JADX INFO: renamed from: v */
    public final ReportUploader.a f26605v;

    /* JADX INFO: renamed from: w */
    public final CrashlyticsNativeComponent f26606w;

    /* JADX INFO: renamed from: x */
    public final StackTraceTrimmingStrategy f26607x;

    /* JADX INFO: renamed from: y */
    public final String f26608y;

    /* JADX INFO: renamed from: z */
    public final AnalyticsEventLogger f26609z;

    /* JADX INFO: renamed from: c.n.d.l.e.k.t$a */
    /* JADX INFO: compiled from: CrashlyticsController.java */
    public class a extends h {
        public a(String str) {
            super(str);
        }

        @Override // p007c.p190n.p385d.p391l.p392e.p395k.C5335t.h, java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(".cls");
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.k.t$b */
    /* JADX INFO: compiled from: CrashlyticsController.java */
    public class b implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.length() == 39 && str.endsWith(".cls");
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.k.t$c */
    /* JADX INFO: compiled from: CrashlyticsController.java */
    public class c implements Comparator<File> {
        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.k.t$d */
    /* JADX INFO: compiled from: CrashlyticsController.java */
    public class d implements Comparator<File> {
        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.k.t$e */
    /* JADX INFO: compiled from: CrashlyticsController.java */
    public class e implements InterfaceC4779h<Boolean, Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC4781i f26610a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f26611b;

        public e(AbstractC4781i abstractC4781i, float f) {
            this.f26610a = abstractC4781i;
            this.f26611b = f;
        }

        @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4779h
        /* JADX INFO: renamed from: a */
        public AbstractC4781i<Void> mo5192a(Boolean bool) throws Exception {
            return C5335t.this.f26596m.m11764c(new CallableC5300c0(this, bool));
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.k.t$f */
    /* JADX INFO: compiled from: CrashlyticsController.java */
    public static class f implements FilenameFilter {
        public f(a aVar) {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return !C5335t.f26581c.accept(file, str) && C5335t.f26584f.matcher(str).matches();
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.k.t$g */
    /* JADX INFO: compiled from: CrashlyticsController.java */
    public interface g {
        /* JADX INFO: renamed from: a */
        void mo11773a(CodedOutputStream codedOutputStream) throws Exception;
    }

    /* JADX INFO: renamed from: c.n.d.l.e.k.t$h */
    /* JADX INFO: compiled from: CrashlyticsController.java */
    public static class h implements FilenameFilter {

        /* JADX INFO: renamed from: a */
        public final String f26613a;

        public h(String str) {
            this.f26613a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.contains(this.f26613a) && !str.endsWith(".cls_temp");
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.k.t$i */
    /* JADX INFO: compiled from: CrashlyticsController.java */
    public static class i implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return ((ClsFileOutputStream.a) ClsFileOutputStream.f26912f).accept(file, str) || str.contains("SessionMissingBinaryImages");
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.k.t$j */
    /* JADX INFO: compiled from: CrashlyticsController.java */
    public static final class j implements LogFileManager.b {

        /* JADX INFO: renamed from: a */
        public final FileStore f26614a;

        public j(FileStore fileStore) {
            this.f26614a = fileStore;
        }

        /* JADX INFO: renamed from: a */
        public File m11806a() {
            File file = new File(((FileStoreImpl) this.f26614a).m11983a(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.k.t$k */
    /* JADX INFO: compiled from: CrashlyticsController.java */
    public final class k implements ReportUploader.c {
        public k(a aVar) {
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.k.t$l */
    /* JADX INFO: compiled from: CrashlyticsController.java */
    public final class l implements ReportUploader.a {
        public l(a aVar) {
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.k.t$m */
    /* JADX INFO: compiled from: CrashlyticsController.java */
    public static final class m implements Runnable {

        /* JADX INFO: renamed from: f */
        public final Context f26617f;

        /* JADX INFO: renamed from: g */
        public final Report f26618g;

        /* JADX INFO: renamed from: h */
        public final ReportUploader f26619h;

        /* JADX INFO: renamed from: i */
        public final boolean f26620i;

        public m(Context context, Report report, ReportUploader reportUploader, boolean z) {
            this.f26617f = context;
            this.f26618g = report;
            this.f26619h = reportUploader;
            this.f26620i = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CommonUtils.m11739b(this.f26617f)) {
                Logger4.f26421a.m11713b("Attempting to send crash report at time of crash...");
                this.f26619h.m12017a(this.f26618g, this.f26620i);
            }
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.k.t$n */
    /* JADX INFO: compiled from: CrashlyticsController.java */
    public static class n implements FilenameFilter {

        /* JADX INFO: renamed from: a */
        public final String f26621a;

        public n(String str) {
            this.f26621a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f26621a);
            sb.append(".cls");
            return (str.equals(sb.toString()) || !str.contains(this.f26621a) || str.endsWith(".cls_temp")) ? false : true;
        }
    }

    public C5335t(Context context, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, HttpRequestFactory httpRequestFactory, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, CrashlyticsFileMarker crashlyticsFileMarker, AppData appData, ReportManager reportManager, ReportUploader.b bVar, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger, SettingsDataProvider settingsDataProvider) {
        new AtomicInteger(0);
        this.f26589C = new C4782j<>();
        this.f26590D = new C4782j<>();
        this.f26591E = new C4782j<>();
        new AtomicBoolean(false);
        this.f26592i = context;
        this.f26596m = crashlyticsBackgroundWorker;
        this.f26597n = httpRequestFactory;
        this.f26598o = idManager;
        this.f26593j = dataCollectionArbiter;
        this.f26599p = fileStore;
        this.f26594k = crashlyticsFileMarker;
        this.f26600q = appData;
        this.f26601r = new C5303d0(this);
        this.f26606w = crashlyticsNativeComponent;
        this.f26608y = ((ResourceUnityVersionProvider) appData.f26462g).m12044a();
        this.f26609z = analyticsEventLogger;
        UserMetadata userMetadata = new UserMetadata();
        this.f26595l = userMetadata;
        j jVar = new j(fileStore);
        this.f26602s = jVar;
        LogFileManager logFileManager = new LogFileManager(context, jVar);
        this.f26603t = logFileManager;
        this.f26604u = new ReportManager(new k(null));
        this.f26605v = new l(null);
        MiddleOutFallbackStrategy middleOutFallbackStrategy = new MiddleOutFallbackStrategy(1024, new RemoveRepeatsStrategy(10));
        this.f26607x = middleOutFallbackStrategy;
        File file = new File(new File(((FileStoreImpl) fileStore).f26909a.getFilesDir(), ".com.google.firebase.crashlytics").getPath());
        CrashlyticsReportDataCapture crashlyticsReportDataCapture = new CrashlyticsReportDataCapture(context, idManager, appData, middleOutFallbackStrategy);
        CrashlyticsReportPersistence7 crashlyticsReportPersistence7 = new CrashlyticsReportPersistence7(file, settingsDataProvider);
        CrashlyticsReportJsonTransform8 crashlyticsReportJsonTransform8 = DataTransportCrashlyticsReportSender3.f26949a;
        TransportRuntime.m2821b(context);
        TransportFactory transportFactoryM2822c = TransportRuntime.m2820a().m2822c(new CCTDestination(DataTransportCrashlyticsReportSender3.f26950b, DataTransportCrashlyticsReportSender3.f26951c));
        Encoding encoding = new Encoding("json");
        Transformer<CrashlyticsReport, byte[]> transformer = DataTransportCrashlyticsReportSender3.f26952d;
        this.f26587A = new SessionReportingCoordinator3(crashlyticsReportDataCapture, crashlyticsReportPersistence7, new DataTransportCrashlyticsReportSender3(((TransportFactoryImpl) transportFactoryM2822c).mo2750a("FIREBASE_CRASHLYTICS_REPORT", CrashlyticsReport.class, encoding, transformer), transformer), logFileManager, userMetadata);
    }

    /* JADX INFO: renamed from: A */
    public static void m11779A(CodedOutputStream codedOutputStream, File file) throws Throwable {
        if (!file.exists()) {
            Logger4 logger4 = Logger4.f26421a;
            StringBuilder sbM1556G = outline.m1556G("Tried to include a file that doesn't exist: ");
            sbM1556G.append(file.getName());
            logger4.m11715d(sbM1556G.toString());
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                m11783e(fileInputStream2, codedOutputStream, (int) file.length());
                CommonUtils.m11740c(fileInputStream2, "Failed to close file input stream.");
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                CommonUtils.m11740c(fileInputStream, "Failed to close file input stream.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11780a(C5335t c5335t) throws Exception {
        Integer num;
        Objects.requireNonNull(c5335t);
        long jM11784j = m11784j();
        new CLSUUID(c5335t.f26598o);
        String str = CLSUUID.f26482b;
        Logger4 logger4 = Logger4.f26421a;
        outline.m1566Q("Opening a new session with ID ", str, logger4);
        c5335t.f26606w.mo11711h(str);
        Locale locale = Locale.US;
        String str2 = String.format(locale, "Crashlytics Android SDK/%s", "17.3.0");
        c5335t.m11805z(str, "BeginSession", new C5329q(c5335t, str, str2, jM11784j));
        c5335t.f26606w.mo11707d(str, str2, jM11784j);
        IdManager idManager = c5335t.f26598o;
        String str3 = idManager.f26568e;
        AppData appData = c5335t.f26600q;
        String str4 = appData.f26460e;
        String str5 = appData.f26461f;
        String strM11775b = idManager.m11775b();
        int iM15333v = C7804v0.m15333v(C7804v0.m15321j(c5335t.f26600q.f26458c));
        c5335t.m11805z(str, "SessionApp", new C5331r(c5335t, str3, str4, str5, strM11775b, iM15333v));
        c5335t.f26606w.mo11709f(str, str3, str4, str5, strM11775b, iM15333v, c5335t.f26608y);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        boolean zM11756s = CommonUtils.m11756s(c5335t.f26592i);
        c5335t.m11805z(str, "SessionOS", new C5333s(c5335t, str6, str7, zM11756s));
        c5335t.f26606w.mo11710g(str, str6, str7, zM11756s);
        Context context = c5335t.f26592i;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        CommonUtils.b bVar = CommonUtils.b.UNKNOWN;
        String str8 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str8)) {
            logger4.m11713b("Architecture#getValue()::Build.CPU_ABI returned null or empty");
        } else {
            CommonUtils.b bVar2 = CommonUtils.b.f26498p.get(str8.toLowerCase(locale));
            if (bVar2 != null) {
                bVar = bVar2;
            }
        }
        int iOrdinal = bVar.ordinal();
        String str9 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jM11752o = CommonUtils.m11752o();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zM11754q = CommonUtils.m11754q(context);
        int iM11747j = CommonUtils.m11747j(context);
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        c5335t.m11805z(str, "SessionDevice", new C5337u(c5335t, iOrdinal, str9, iAvailableProcessors, jM11752o, blockCount, zM11754q, iM11747j, str10, str11));
        c5335t.f26606w.mo11706c(str, iOrdinal, str9, iAvailableProcessors, jM11752o, blockCount, zM11754q, iM11747j, str10, str11);
        c5335t.f26603t.m11817a(str);
        SessionReportingCoordinator3 sessionReportingCoordinator3 = c5335t.f26587A;
        String strM11787u = m11787u(str);
        CrashlyticsReportDataCapture crashlyticsReportDataCapture = sessionReportingCoordinator3.f26635a;
        Objects.requireNonNull(crashlyticsReportDataCapture);
        Charset charset = CrashlyticsReport.f26868a;
        AutoValue_CrashlyticsReport.b bVar3 = new AutoValue_CrashlyticsReport.b();
        bVar3.f26705a = "17.3.0";
        String str12 = crashlyticsReportDataCapture.f26530e.f26456a;
        Objects.requireNonNull(str12, "Null gmpAppId");
        bVar3.f26706b = str12;
        String strM11775b2 = crashlyticsReportDataCapture.f26529d.m11775b();
        Objects.requireNonNull(strM11775b2, "Null installationUuid");
        bVar3.f26708d = strM11775b2;
        String str13 = crashlyticsReportDataCapture.f26530e.f26460e;
        Objects.requireNonNull(str13, "Null buildVersion");
        bVar3.f26709e = str13;
        String str14 = crashlyticsReportDataCapture.f26530e.f26461f;
        Objects.requireNonNull(str14, "Null displayVersion");
        bVar3.f26710f = str14;
        bVar3.f26707c = 4;
        AutoValue_CrashlyticsReport_Session.b bVar4 = new AutoValue_CrashlyticsReport_Session.b();
        bVar4.mo11871b(false);
        bVar4.f26738c = Long.valueOf(jM11784j);
        Objects.requireNonNull(strM11787u, "Null identifier");
        bVar4.f26737b = strM11787u;
        String str15 = CrashlyticsReportDataCapture.f26526a;
        Objects.requireNonNull(str15, "Null generator");
        bVar4.f26736a = str15;
        AutoValue_CrashlyticsReport_Session_Application.b bVar5 = new AutoValue_CrashlyticsReport_Session_Application.b();
        String str16 = crashlyticsReportDataCapture.f26529d.f26568e;
        Objects.requireNonNull(str16, "Null identifier");
        bVar5.f26754a = str16;
        String str17 = crashlyticsReportDataCapture.f26530e.f26460e;
        Objects.requireNonNull(str17, "Null version");
        bVar5.f26755b = str17;
        bVar5.f26756c = crashlyticsReportDataCapture.f26530e.f26461f;
        bVar5.f26757d = crashlyticsReportDataCapture.f26529d.m11775b();
        String strM12044a = ((ResourceUnityVersionProvider) crashlyticsReportDataCapture.f26530e.f26462g).m12044a();
        if (strM12044a != null) {
            bVar5.f26758e = "Unity";
            bVar5.f26759f = strM12044a;
        }
        bVar4.f26741f = bVar5.m11883a();
        AutoValue_CrashlyticsReport_Session_OperatingSystem.b bVar6 = new AutoValue_CrashlyticsReport_Session_OperatingSystem.b();
        bVar6.f26862a = 3;
        Objects.requireNonNull(str6, "Null version");
        bVar6.f26863b = str6;
        Objects.requireNonNull(str7, "Null buildVersion");
        bVar6.f26864c = str7;
        bVar6.f26865d = Boolean.valueOf(CommonUtils.m11756s(crashlyticsReportDataCapture.f26528c));
        bVar4.f26743h = bVar6.m11956a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str8) && (num = CrashlyticsReportDataCapture.f26527b.get(str8.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jM11752o2 = CommonUtils.m11752o();
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zM11754q2 = CommonUtils.m11754q(crashlyticsReportDataCapture.f26528c);
        int iM11747j2 = CommonUtils.m11747j(crashlyticsReportDataCapture.f26528c);
        AutoValue_CrashlyticsReport_Session_Device.b bVar7 = new AutoValue_CrashlyticsReport_Session_Device.b();
        bVar7.f26769a = Integer.valueOf(iIntValue);
        Objects.requireNonNull(str9, "Null model");
        bVar7.f26770b = str9;
        bVar7.f26771c = Integer.valueOf(iAvailableProcessors2);
        bVar7.f26772d = Long.valueOf(jM11752o2);
        bVar7.f26773e = Long.valueOf(blockCount2);
        bVar7.f26774f = Boolean.valueOf(zM11754q2);
        bVar7.f26775g = Integer.valueOf(iM11747j2);
        Objects.requireNonNull(str10, "Null manufacturer");
        bVar7.f26776h = str10;
        Objects.requireNonNull(str11, "Null modelClass");
        bVar7.f26777i = str11;
        bVar4.f26744i = bVar7.m11894a();
        bVar4.f26746k = 3;
        bVar3.f26711g = bVar4.mo11870a();
        CrashlyticsReport crashlyticsReportMo11845a = bVar3.mo11845a();
        CrashlyticsReportPersistence7 crashlyticsReportPersistence7 = sessionReportingCoordinator3.f26636b;
        Objects.requireNonNull(crashlyticsReportPersistence7);
        CrashlyticsReport.d dVar = ((AutoValue_CrashlyticsReport) crashlyticsReportMo11845a).f26703h;
        if (dVar == null) {
            logger4.m11713b("Could not get session for report");
            return;
        }
        String strMo11864g = dVar.mo11864g();
        try {
            File fileM11982h = crashlyticsReportPersistence7.m11982h(strMo11864g);
            CrashlyticsReportPersistence7.m11975i(fileM11982h);
            CrashlyticsReportPersistence7.m11978l(new File(fileM11982h, "report"), CrashlyticsReportPersistence7.f26900c.m11967g(crashlyticsReportMo11845a));
        } catch (IOException e2) {
            Logger4.f26421a.m11714c("Could not persist report for session " + strMo11864g, e2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC4781i m11781b(C5335t c5335t) {
        boolean z;
        AbstractC4781i abstractC4781iM10206c;
        Objects.requireNonNull(c5335t);
        ArrayList arrayList = new ArrayList();
        for (File file : c5335t.m11800s(f26580b)) {
            try {
                long j2 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z = true;
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    Logger4.f26421a.m11713b("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
                    abstractC4781iM10206c = C4340s8.m10208e(null);
                } else {
                    abstractC4781iM10206c = C4340s8.m10206c(new ScheduledThreadPoolExecutor(1), new CallableC5341w(c5335t, j2));
                }
                arrayList.add(abstractC4781iM10206c);
            } catch (NumberFormatException unused2) {
                Logger4 logger4 = Logger4.f26421a;
                StringBuilder sbM1556G = outline.m1556G("Could not parse timestamp from file ");
                sbM1556G.append(file.getName());
                logger4.m11713b(sbM1556G.toString());
            }
            file.delete();
        }
        return C4340s8.m10209f(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static void m11782c(String str, File file) throws Exception {
        FileOutputStream fileOutputStream;
        if (str == null) {
            return;
        }
        CodedOutputStream codedOutputStreamM11993k = null;
        try {
            fileOutputStream = new FileOutputStream(file, true);
            try {
                codedOutputStreamM11993k = CodedOutputStream.m11993k(fileOutputStream);
                ByteString byteString = SessionProtobufHelper.f26920a;
                ByteString byteStringM11984a = ByteString.m11984a(str);
                codedOutputStreamM11993k.m12001u(7, 2);
                int iM11987c = CodedOutputStream.m11987c(2, byteStringM11984a);
                codedOutputStreamM11993k.m11999r(CodedOutputStream.m11989f(iM11987c) + CodedOutputStream.m11990h(5) + iM11987c);
                codedOutputStreamM11993k.m12001u(5, 2);
                codedOutputStreamM11993k.m11999r(iM11987c);
                codedOutputStreamM11993k.m11996n(2, byteStringM11984a);
                StringBuilder sbM1556G = outline.m1556G("Failed to flush to append to ");
                sbM1556G.append(file.getPath());
                CommonUtils.m11744g(codedOutputStreamM11993k, sbM1556G.toString());
                CommonUtils.m11740c(fileOutputStream, "Failed to close " + file.getPath());
            } catch (Throwable th) {
                th = th;
                StringBuilder sbM1556G2 = outline.m1556G("Failed to flush to append to ");
                sbM1556G2.append(file.getPath());
                CommonUtils.m11744g(codedOutputStreamM11993k, sbM1556G2.toString());
                CommonUtils.m11740c(fileOutputStream, "Failed to close " + file.getPath());
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m11783e(InputStream inputStream, CodedOutputStream codedOutputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                break;
            } else {
                i3 += i4;
            }
        }
        Objects.requireNonNull(codedOutputStream);
        int i5 = codedOutputStream.f26917g;
        int i6 = codedOutputStream.f26918h;
        int i7 = i5 - i6;
        if (i7 >= i2) {
            System.arraycopy(bArr, 0, codedOutputStream.f26916f, i6, i2);
            codedOutputStream.f26918h += i2;
            return;
        }
        System.arraycopy(bArr, 0, codedOutputStream.f26916f, i6, i7);
        int i8 = i7 + 0;
        int i9 = i2 - i7;
        codedOutputStream.f26918h = codedOutputStream.f26917g;
        codedOutputStream.m11994l();
        if (i9 > codedOutputStream.f26917g) {
            codedOutputStream.f26919i.write(bArr, i8, i9);
        } else {
            System.arraycopy(bArr, i8, codedOutputStream.f26916f, 0, i9);
            codedOutputStream.f26918h = i9;
        }
    }

    /* JADX INFO: renamed from: j */
    public static long m11784j() {
        return new Date().getTime() / 1000;
    }

    /* JADX INFO: renamed from: o */
    public static String m11785o(File file) {
        return file.getName().substring(0, 35);
    }

    /* JADX INFO: renamed from: r */
    public static File[] m11786r(File file, FilenameFilter filenameFilter) {
        File[] fileArrListFiles = file.listFiles(filenameFilter);
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* JADX INFO: renamed from: u */
    public static String m11787u(String str) {
        return str.replaceAll("-", "");
    }

    /* JADX INFO: renamed from: x */
    public static void m11788x(CodedOutputStream codedOutputStream, File[] fileArr, String str) throws Throwable {
        Arrays.sort(fileArr, CommonUtils.f26487c);
        for (File file : fileArr) {
            try {
                Logger4.f26421a.m11713b(String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", str, file.getName()));
                m11779A(codedOutputStream, file);
            } catch (Exception e2) {
                Logger4 logger4 = Logger4.f26421a;
                if (logger4.m11712a(6)) {
                    Log.e(logger4.f26422b, "Error writting non-fatal to session.", e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11789d(ClsFileOutputStream clsFileOutputStream) {
        if (clsFileOutputStream == null) {
            return;
        }
        try {
            clsFileOutputStream.m11985a();
        } catch (IOException e2) {
            Logger4 logger4 = Logger4.f26421a;
            if (logger4.m11712a(6)) {
                Log.e(logger4.f26422b, "Error closing session file stream in the presence of an exception", e2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final void m11790f(int i2, boolean z) throws Exception {
        char c2;
        FileInputStream fileInputStream;
        UserMetadata userMetadata;
        String strM11976j;
        CodedOutputStream codedOutputStream;
        ClsFileOutputStream clsFileOutputStream;
        CodedOutputStream codedOutputStreamM11993k;
        int i3 = (z ? 1 : 0) + 8;
        HashSet hashSet = new HashSet();
        File[] fileArrM11801t = m11801t();
        int iMin = Math.min(i3, fileArrM11801t.length);
        char c3 = 0;
        for (int i4 = 0; i4 < iMin; i4++) {
            hashSet.add(m11785o(fileArrM11801t[i4]));
        }
        File[] fileArrListFiles = ((j) this.f26603t.f26651c).m11806a().listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                String name = file.getName();
                int iLastIndexOf = name.lastIndexOf(".temp");
                if (iLastIndexOf != -1) {
                    name = name.substring(20, iLastIndexOf);
                }
                if (!hashSet.contains(name)) {
                    file.delete();
                }
            }
        }
        FileInputStream fileInputStream2 = null;
        File[] fileArrM11786r = m11786r(m11795l(), new f(null));
        int length = fileArrM11786r.length;
        int i5 = 0;
        while (true) {
            c2 = 1;
            if (i5 >= length) {
                break;
            }
            File file2 = fileArrM11786r[i5];
            String name2 = file2.getName();
            Matcher matcher = f26584f.matcher(name2);
            if (!matcher.matches()) {
                Logger4.f26421a.m11713b("Deleting unknown file: " + name2);
                file2.delete();
            } else if (!hashSet.contains(matcher.group(1))) {
                Logger4.f26421a.m11713b("Trimming session file: " + name2);
                file2.delete();
            }
            i5++;
        }
        File[] fileArrM11801t2 = m11801t();
        if (fileArrM11801t2.length <= z) {
            Logger4.f26421a.m11713b("No open sessions to be closed.");
            return;
        }
        String strM11785o = m11785o(fileArrM11801t2[z ? 1 : 0]);
        if (m11798p()) {
            userMetadata = this.f26595l;
        } else {
            File fileM11808a = new MetaDataStore(m11795l()).m11808a(strM11785o);
            if (fileM11808a.exists()) {
                try {
                    try {
                        fileInputStream = new FileInputStream(fileM11808a);
                        try {
                            userMetadata = MetaDataStore.m11807b(CommonUtils.m11758u(fileInputStream));
                            CommonUtils.m11740c(fileInputStream, "Failed to close user metadata file.");
                        } catch (Exception e2) {
                            e = e2;
                            fileInputStream2 = fileInputStream;
                            Logger4 logger4 = Logger4.f26421a;
                            if (logger4.m11712a(6)) {
                                Log.e(logger4.f26422b, "Error deserializing user metadata.", e);
                            }
                            CommonUtils.m11740c(fileInputStream2, "Failed to close user metadata file.");
                            userMetadata = new UserMetadata();
                        } catch (Throwable th) {
                            th = th;
                            CommonUtils.m11740c(fileInputStream, "Failed to close user metadata file.");
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                }
            } else {
                userMetadata = new UserMetadata();
            }
        }
        m11805z(strM11785o, "SessionUser", new C5339v(this, userMetadata));
        if (this.f26606w.mo11708e(strM11785o)) {
            Logger4 logger5 = Logger4.f26421a;
            outline.m1566Q("Finalizing native report for session ", strM11785o, logger5);
            Objects.requireNonNull(this.f26606w.mo11705b(strM11785o));
            logger5.m11717f("No minidump data found for session " + strM11785o);
            if (!this.f26606w.mo11704a(strM11785o)) {
                outline.m1566Q("Could not finalize native session: ", strM11785o, logger5);
            }
        }
        Logger4.f26421a.m11713b("Closing open sessions.");
        int i6 = z ? 1 : 0;
        while (i6 < fileArrM11801t2.length) {
            File file3 = fileArrM11801t2[i6];
            String strM11785o2 = m11785o(file3);
            Logger4 logger6 = Logger4.f26421a;
            logger6.m11713b("Closing session: " + strM11785o2);
            logger6.m11713b("Collecting session parts for ID " + strM11785o2);
            File[] fileArrM11786r2 = m11786r(m11795l(), new h(outline.m1599u(strM11785o2, "SessionCrash")));
            boolean z2 = fileArrM11786r2.length > 0;
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            objArr[c3] = strM11785o2;
            objArr[c2] = Boolean.valueOf(z2);
            logger6.m11713b(String.format(locale, "Session %s has fatal exception: %s", objArr));
            File[] fileArrM11786r3 = m11786r(m11795l(), new h(outline.m1599u(strM11785o2, "SessionEvent")));
            boolean z3 = fileArrM11786r3.length > 0;
            Object[] objArr2 = new Object[2];
            objArr2[c3] = strM11785o2;
            objArr2[1] = Boolean.valueOf(z3);
            logger6.m11713b(String.format(locale, "Session %s has non-fatal exceptions: %s", objArr2));
            if (z2 || z3) {
                if (fileArrM11786r3.length > i2) {
                    logger6.m11713b(String.format(locale, "Trimming down to %d logged exceptions.", Integer.valueOf(i2)));
                    Utils3.m11728b(m11795l(), new h(outline.m1599u(strM11785o2, "SessionEvent")), i2, f26583e);
                    fileArrM11786r3 = m11786r(m11795l(), new h(outline.m1599u(strM11785o2, "SessionEvent")));
                }
                File file4 = z2 ? fileArrM11786r2[0] : null;
                boolean z4 = file4 != null;
                File fileM11794k = z4 ? m11794k() : m11797n();
                if (!fileM11794k.exists()) {
                    fileM11794k.mkdirs();
                }
                try {
                    clsFileOutputStream = new ClsFileOutputStream(fileM11794k, strM11785o2);
                    try {
                        codedOutputStreamM11993k = CodedOutputStream.m11993k(clsFileOutputStream);
                        try {
                            try {
                                logger6.m11713b("Collecting SessionStart data for session ID " + strM11785o2);
                                m11779A(codedOutputStreamM11993k, file3);
                                codedOutputStreamM11993k.m12003w(4, m11784j());
                                codedOutputStreamM11993k.m11995m(5, z4);
                                codedOutputStreamM11993k.m12002v(11, 1);
                                codedOutputStreamM11993k.m11997o(12, 3);
                                m11803w(codedOutputStreamM11993k, strM11785o2);
                                m11788x(codedOutputStreamM11993k, fileArrM11786r3, strM11785o2);
                                if (z4) {
                                    m11779A(codedOutputStreamM11993k, file4);
                                }
                                CommonUtils.m11744g(codedOutputStreamM11993k, "Error flushing session file stream");
                                CommonUtils.m11740c(clsFileOutputStream, "Failed to close CLS file");
                            } catch (Exception e4) {
                                e = e4;
                                Logger4.f26421a.m11716e("Failed to write session file for session ID: " + strM11785o2, e);
                                CommonUtils.m11744g(codedOutputStreamM11993k, "Error flushing session file stream");
                                m11789d(clsFileOutputStream);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            codedOutputStream = codedOutputStreamM11993k;
                            CommonUtils.m11744g(codedOutputStream, "Error flushing session file stream");
                            CommonUtils.m11740c(clsFileOutputStream, "Failed to close CLS file");
                            throw th;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        codedOutputStreamM11993k = null;
                    } catch (Throwable th4) {
                        th = th4;
                        codedOutputStream = null;
                    }
                } catch (Exception e6) {
                    e = e6;
                    codedOutputStreamM11993k = null;
                    clsFileOutputStream = null;
                } catch (Throwable th5) {
                    th = th5;
                    codedOutputStream = null;
                    clsFileOutputStream = null;
                }
            } else {
                outline.m1566Q("No events present for session ID ", strM11785o2, logger6);
            }
            Logger4.f26421a.m11713b("Removing session part files for ID " + strM11785o2);
            for (File file5 : m11786r(m11795l(), new n(strM11785o2))) {
                file5.delete();
            }
            i6++;
            c3 = 0;
            c2 = 1;
        }
        final String strM11787u = z != 0 ? m11787u(m11785o(fileArrM11801t2[0])) : null;
        SessionReportingCoordinator3 sessionReportingCoordinator3 = this.f26587A;
        long jM11784j = m11784j();
        CrashlyticsReportPersistence7 crashlyticsReportPersistence7 = sessionReportingCoordinator3.f26636b;
        List<File> listM11973f = CrashlyticsReportPersistence7.m11973f(crashlyticsReportPersistence7.f26904g, new FileFilter(strM11787u) { // from class: c.n.d.l.e.o.b

            /* JADX INFO: renamed from: a */
            public final String f26893a;

            {
                this.f26893a = strM11787u;
            }

            @Override // java.io.FileFilter
            public boolean accept(File file6) {
                String str = this.f26893a;
                Charset charset = CrashlyticsReportPersistence7.f26898a;
                return file6.isDirectory() && !file6.getName().equals(str);
            }
        });
        Collections.sort(listM11973f, CrashlyticsReportPersistence7.f26901d);
        if (listM11973f.size() > 8) {
            Iterator<File> it = listM11973f.subList(8, listM11973f.size()).iterator();
            while (it.hasNext()) {
                CrashlyticsReportPersistence7.m11977k(it.next());
            }
            listM11973f = listM11973f.subList(0, 8);
        }
        for (File file6 : listM11973f) {
            Logger4 logger7 = Logger4.f26421a;
            StringBuilder sbM1556G = outline.m1556G("Finalizing report for session ");
            sbM1556G.append(file6.getName());
            logger7.m11713b(sbM1556G.toString());
            List<File> listM11974g = CrashlyticsReportPersistence7.m11974g(file6, CrashlyticsReportPersistence7.f26902e);
            if (!listM11974g.isEmpty()) {
                Collections.sort(listM11974g);
                ArrayList arrayList = new ArrayList();
                Iterator<File> it2 = listM11974g.iterator();
                while (true) {
                    boolean z5 = false;
                    while (true) {
                        if (!it2.hasNext()) {
                            if (!arrayList.isEmpty()) {
                                File file7 = new File(file6, "user");
                                if (file7.isFile()) {
                                    try {
                                        strM11976j = CrashlyticsReportPersistence7.m11976j(file7);
                                    } catch (IOException e7) {
                                        Logger4 logger8 = Logger4.f26421a;
                                        StringBuilder sbM1556G2 = outline.m1556G("Could not read user ID file in ");
                                        sbM1556G2.append(file6.getName());
                                        logger8.m11714c(sbM1556G2.toString(), e7);
                                        strM11976j = null;
                                    }
                                } else {
                                    strM11976j = null;
                                }
                                File file8 = new File(file6, "report");
                                File file9 = z5 ? crashlyticsReportPersistence7.f26905h : crashlyticsReportPersistence7.f26906i;
                                try {
                                    CrashlyticsReportJsonTransform8 crashlyticsReportJsonTransform8 = CrashlyticsReportPersistence7.f26900c;
                                    CrashlyticsReport crashlyticsReportM11959j = crashlyticsReportJsonTransform8.m11966f(CrashlyticsReportPersistence7.m11976j(file8)).m11959j(jM11784j, z5, strM11976j);
                                    ImmutableList3<CrashlyticsReport.d.AbstractC8523d> immutableList3 = new ImmutableList3<>(arrayList);
                                    if (crashlyticsReportM11959j.mo11843h() == null) {
                                        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                    }
                                    CrashlyticsReport crashlyticsReportMo11845a = crashlyticsReportM11959j.mo11844i().mo11846b(crashlyticsReportM11959j.mo11843h().mo11869l().mo11873d(immutableList3).mo11870a()).mo11845a();
                                    CrashlyticsReport.d dVarMo11843h = crashlyticsReportMo11845a.mo11843h();
                                    if (dVarMo11843h != null) {
                                        CrashlyticsReportPersistence7.m11975i(file9);
                                        CrashlyticsReportPersistence7.m11978l(new File(file9, dVarMo11843h.mo11864g()), crashlyticsReportJsonTransform8.m11967g(crashlyticsReportMo11845a));
                                        break;
                                    }
                                    break;
                                } catch (IOException e8) {
                                    Logger4.f26421a.m11714c("Could not synthesize final report file for " + file8, e8);
                                    break;
                                }
                            }
                            Logger4 logger9 = Logger4.f26421a;
                            StringBuilder sbM1556G3 = outline.m1556G("Could not parse event files for session ");
                            sbM1556G3.append(file6.getName());
                            logger9.m11713b(sbM1556G3.toString());
                            break;
                        }
                        File next = it2.next();
                        try {
                            CrashlyticsReportJsonTransform8 crashlyticsReportJsonTransform9 = CrashlyticsReportPersistence7.f26900c;
                            String strM11976j2 = CrashlyticsReportPersistence7.m11976j(next);
                            Objects.requireNonNull(crashlyticsReportJsonTransform9);
                            try {
                                JsonReader jsonReader = new JsonReader(new StringReader(strM11976j2));
                                try {
                                    CrashlyticsReport.d.AbstractC8523d abstractC8523dM11962b = CrashlyticsReportJsonTransform8.m11962b(jsonReader);
                                    jsonReader.close();
                                    arrayList.add(abstractC8523dM11962b);
                                    if (!z5) {
                                        String name3 = next.getName();
                                        if (!(name3.startsWith("event") && name3.endsWith("_"))) {
                                            break;
                                        }
                                    }
                                    z5 = true;
                                } catch (Throwable th6) {
                                    try {
                                        jsonReader.close();
                                    } catch (Throwable unused) {
                                    }
                                    throw th6;
                                }
                            } catch (IllegalStateException e9) {
                                throw new IOException(e9);
                            }
                        } catch (IOException e10) {
                            Logger4.f26421a.m11714c("Could not add event to report for " + next, e10);
                        }
                    }
                }
            } else {
                StringBuilder sbM1556G4 = outline.m1556G("Session ");
                sbM1556G4.append(file6.getName());
                sbM1556G4.append(" has no events.");
                logger7.m11713b(sbM1556G4.toString());
            }
            CrashlyticsReportPersistence7.m11977k(file6);
        }
        int i7 = ((SettingsController) crashlyticsReportPersistence7.f26908k).m12032c().mo12037b().f26986b;
        ArrayList arrayList2 = (ArrayList) crashlyticsReportPersistence7.m11981e();
        int size = arrayList2.size();
        if (size <= i7) {
            return;
        }
        Iterator it3 = arrayList2.subList(i7, size).iterator();
        while (it3.hasNext()) {
            ((File) it3.next()).delete();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m11791g(long j2) {
        try {
            new File(m11795l(), ".ae" + j2).createNewFile();
        } catch (IOException unused) {
            Logger4.f26421a.m11713b("Could not write app exception marker.");
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m11792h(int i2) {
        this.f26596m.m11762a();
        if (m11798p()) {
            Logger4.f26421a.m11713b("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        Logger4 logger4 = Logger4.f26421a;
        logger4.m11713b("Finalizing previously open sessions.");
        try {
            m11790f(i2, true);
            logger4.m11713b("Closed all previously open sessions");
            return true;
        } catch (Exception e2) {
            Logger4 logger5 = Logger4.f26421a;
            if (logger5.m11712a(6)) {
                Log.e(logger5.f26422b, "Unable to finalize previously open sessions.", e2);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final String m11793i() {
        File[] fileArrM11801t = m11801t();
        if (fileArrM11801t.length > 0) {
            return m11785o(fileArrM11801t[0]);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public File m11794k() {
        return new File(m11795l(), "fatal-sessions");
    }

    /* JADX INFO: renamed from: l */
    public File m11795l() {
        return ((FileStoreImpl) this.f26599p).m11983a();
    }

    /* JADX INFO: renamed from: m */
    public File m11796m() {
        return new File(m11795l(), "native-sessions");
    }

    /* JADX INFO: renamed from: n */
    public File m11797n() {
        return new File(m11795l(), "nonfatal-sessions");
    }

    /* JADX INFO: renamed from: p */
    public boolean m11798p() {
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.f26588B;
        return crashlyticsUncaughtExceptionHandler != null && crashlyticsUncaughtExceptionHandler.f26536d.get();
    }

    /* JADX INFO: renamed from: q */
    public File[] m11799q() {
        LinkedList linkedList = new LinkedList();
        File fileM11794k = m11794k();
        FilenameFilter filenameFilter = f26581c;
        File[] fileArrListFiles = fileM11794k.listFiles(filenameFilter);
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        Collections.addAll(linkedList, fileArrListFiles);
        File[] fileArrListFiles2 = m11797n().listFiles(filenameFilter);
        if (fileArrListFiles2 == null) {
            fileArrListFiles2 = new File[0];
        }
        Collections.addAll(linkedList, fileArrListFiles2);
        Collections.addAll(linkedList, m11786r(m11795l(), filenameFilter));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* JADX INFO: renamed from: s */
    public final File[] m11800s(FilenameFilter filenameFilter) {
        return m11786r(m11795l(), filenameFilter);
    }

    /* JADX INFO: renamed from: t */
    public final File[] m11801t() {
        File[] fileArrM11800s = m11800s(f26579a);
        Arrays.sort(fileArrM11800s, f26582d);
        return fileArrM11800s;
    }

    /* JADX INFO: renamed from: v */
    public AbstractC4781i<Void> m11802v(float f2, AbstractC4781i<AppSettingsData> abstractC4781i) {
        C4778g0<Void> c4778g0;
        AbstractC4781i abstractC4781iM10208e;
        ReportManager reportManager = this.f26604u;
        File[] fileArrM11799q = C5335t.this.m11799q();
        File[] fileArrListFiles = C5335t.this.m11796m().listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        if (!((fileArrM11799q != null && fileArrM11799q.length > 0) || fileArrListFiles.length > 0)) {
            Logger4.f26421a.m11713b("No reports are available.");
            this.f26589C.m10948b(Boolean.FALSE);
            return C4340s8.m10208e(null);
        }
        Logger4 logger4 = Logger4.f26421a;
        logger4.m11713b("Unsent reports are available.");
        if (this.f26593j.m11770a()) {
            logger4.m11713b("Automatic data collection is enabled. Allowing upload.");
            this.f26589C.m10948b(Boolean.FALSE);
            abstractC4781iM10208e = C4340s8.m10208e(Boolean.TRUE);
        } else {
            logger4.m11713b("Automatic data collection is disabled.");
            logger4.m11713b("Notifying that unsent reports are available.");
            this.f26589C.m10948b(Boolean.TRUE);
            DataCollectionArbiter dataCollectionArbiter = this.f26593j;
            synchronized (dataCollectionArbiter.f26542c) {
                c4778g0 = dataCollectionArbiter.f26543d.f24683a;
            }
            C5294a0 c5294a0 = new C5294a0(this);
            Objects.requireNonNull(c4778g0);
            AbstractC4781i<TContinuationResult> abstractC4781iMo10942o = c4778g0.mo10942o(C4783k.f24684a, c5294a0);
            logger4.m11713b("Waiting for send/deleteUnsentReports to be called.");
            C4778g0<Boolean> c4778g1 = this.f26590D.f24683a;
            FilenameFilter filenameFilter = Utils3.f26467a;
            C4782j c4782j = new C4782j();
            Utils4 utils4 = new Utils4(c4782j);
            abstractC4781iMo10942o.mo10933f(utils4);
            c4778g1.mo10933f(utils4);
            abstractC4781iM10208e = c4782j.f24683a;
        }
        e eVar = new e(abstractC4781i, f2);
        C4778g0 c4778g2 = (C4778g0) abstractC4781iM10208e;
        Objects.requireNonNull(c4778g2);
        return c4778g2.mo10942o(C4783k.f24684a, eVar);
    }

    /* JADX INFO: renamed from: w */
    public final void m11803w(CodedOutputStream codedOutputStream, String str) throws Throwable {
        for (String str2 : f26586h) {
            File[] fileArrM11786r = m11786r(m11795l(), new h(outline.m1600v(str, str2, ".cls")));
            if (fileArrM11786r.length == 0) {
                Logger4.f26421a.m11713b("Can't find " + str2 + " data for session ID " + str);
            } else {
                Logger4.f26421a.m11713b("Collecting " + str2 + " data for session ID " + str);
                m11779A(codedOutputStream, fileArrM11786r[0]);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:22:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:24:0x0101  */
    /* JADX WARN: Code duplicated, block: B:25:0x0113  */
    /* JADX WARN: Code duplicated, block: B:28:0x019b  */
    /* JADX WARN: Code duplicated, block: B:31:0x01f3 A[LOOP:1: B:30:0x01f1->B:31:0x01f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x023d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0256  */
    /* JADX WARN: Code duplicated, block: B:43:0x0288  */
    /* JADX WARN: Code duplicated, block: B:47:0x0297  */
    /* JADX WARN: Code duplicated, block: B:49:0x029d  */
    /* JADX WARN: Code duplicated, block: B:50:0x029f  */
    /* JADX WARN: Code duplicated, block: B:54:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:57:0x030a  */
    /* JADX WARN: Code duplicated, block: B:64:0x028a A[SYNTHETIC] */
    /* JADX INFO: renamed from: y */
    public final void m11804y(CodedOutputStream codedOutputStream, Thread thread, Throwable th, long j2, String str, boolean z) throws Exception {
        Thread[] threadArr;
        Map mapUnmodifiableMap;
        Map treeMap;
        byte[] bArrMo11814c;
        ByteString byteStringM11984a;
        ByteString byteString;
        ByteString byteString2;
        Thread[] threadArr2;
        int iM11989f;
        int length;
        int i2;
        ByteString byteString3;
        boolean z2;
        String str2;
        TrimmedThrowableData trimmedThrowableData = new TrimmedThrowableData(th, this.f26607x);
        Context context = this.f26592i;
        BatteryState batteryStateM11735a = BatteryState.m11735a(context);
        Float f2 = batteryStateM11735a.f26478a;
        int iM11736b = batteryStateM11735a.m11736b();
        boolean zM11749l = CommonUtils.m11749l(context);
        int i3 = context.getResources().getConfiguration().orientation;
        long jM11752o = CommonUtils.m11752o();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j3 = jM11752o - memoryInfo.availMem;
        long jM11738a = CommonUtils.m11738a(Environment.getDataDirectory().getPath());
        ActivityManager.RunningAppProcessInfo runningAppProcessInfoM11745h = CommonUtils.m11745h(context.getPackageName(), context);
        LinkedList linkedList = new LinkedList();
        StackTraceElement[] stackTraceElementArr = trimmedThrowableData.f27009c;
        String str3 = this.f26600q.f26457b;
        String str4 = this.f26598o.f26568e;
        if (z) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            threadArr = new Thread[allStackTraces.size()];
            int i4 = 0;
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                threadArr[i4] = entry.getKey();
                linkedList.add(this.f26607x.mo12043a(entry.getValue()));
                i4++;
                threadArr = threadArr;
            }
        } else {
            threadArr = new Thread[0];
        }
        if (CommonUtils.m11746i(context, "com.crashlytics.CollectCustomKeys", true)) {
            mapUnmodifiableMap = Collections.unmodifiableMap(this.f26595l.f26648b);
            if (mapUnmodifiableMap != null && mapUnmodifiableMap.size() > 1) {
                treeMap = new TreeMap(mapUnmodifiableMap);
            }
            bArrMo11814c = this.f26603t.f26652d.mo11814c();
            ByteString byteString4 = SessionProtobufHelper.f26920a;
            ByteString byteStringM11984a2 = ByteString.m11984a(str4);
            if (str3 == null) {
                byteStringM11984a = null;
            } else {
                byteStringM11984a = ByteString.m11984a(str3.replace("-", ""));
            }
            if (bArrMo11814c != null) {
                int length2 = bArrMo11814c.length;
                byte[] bArr = new byte[length2];
                System.arraycopy(bArrMo11814c, 0, bArr, 0, length2);
                byteString = new ByteString(bArr);
            } else {
                Logger4.f26421a.m11713b("No log data to include with this event.");
                byteString = null;
            }
            codedOutputStream.m12001u(10, 2);
            int iM11987c = CodedOutputStream.m11987c(2, ByteString.m11984a(str)) + CodedOutputStream.m11992j(1, j2) + 0;
            byteString2 = byteString;
            threadArr2 = threadArr;
            int iM12009f = SessionProtobufHelper.m12009f(trimmedThrowableData, thread, stackTraceElementArr, threadArr, linkedList, 8, byteStringM11984a2, byteStringM11984a, treeMap, runningAppProcessInfoM11745h, i3);
            int iM11989f2 = CodedOutputStream.m11989f(iM12009f) + CodedOutputStream.m11990h(3) + iM12009f + iM11987c;
            int iM12010g = SessionProtobufHelper.m12010g(f2, iM11736b, zM11749l, i3, j3, jM11738a);
            iM11989f = CodedOutputStream.m11989f(iM12010g) + CodedOutputStream.m11990h(5) + iM12010g + iM11989f2;
            if (byteString2 != null) {
                int iM11987c2 = CodedOutputStream.m11987c(1, byteString2);
                iM11989f += CodedOutputStream.m11989f(iM11987c2) + CodedOutputStream.m11990h(6) + iM11987c2;
            }
            codedOutputStream.m11999r(iM11989f);
            codedOutputStream.m12003w(1, j2);
            codedOutputStream.m11996n(2, ByteString.m11984a(str));
            codedOutputStream.m12001u(3, 2);
            ByteString byteString5 = byteStringM11984a;
            codedOutputStream.m11999r(SessionProtobufHelper.m12009f(trimmedThrowableData, thread, stackTraceElementArr, threadArr2, linkedList, 8, byteStringM11984a2, byteString5, treeMap, runningAppProcessInfoM11745h, i3));
            codedOutputStream.m12001u(1, 2);
            codedOutputStream.m11999r(SessionProtobufHelper.m12008e(trimmedThrowableData, thread, stackTraceElementArr, threadArr2, linkedList, 8, byteStringM11984a2, byteString5));
            SessionProtobufHelper.m12016m(codedOutputStream, thread, stackTraceElementArr, 4, true);
            length = threadArr2.length;
            for (i2 = 0; i2 < length; i2++) {
                SessionProtobufHelper.m12016m(codedOutputStream, threadArr2[i2], (StackTraceElement[]) linkedList.get(i2), 0, false);
            }
            SessionProtobufHelper.m12015l(codedOutputStream, trimmedThrowableData, 1, 8, 2);
            codedOutputStream.m12001u(3, 2);
            codedOutputStream.m11999r(SessionProtobufHelper.m12007d());
            ByteString byteString6 = SessionProtobufHelper.f26920a;
            codedOutputStream.m11996n(1, byteString6);
            codedOutputStream.m11996n(2, byteString6);
            codedOutputStream.m12003w(3, 0L);
            codedOutputStream.m12001u(4, 2);
            byteString3 = byteStringM11984a;
            codedOutputStream.m11999r(SessionProtobufHelper.m12004a(byteStringM11984a2, byteString3));
            codedOutputStream.m12003w(1, 0L);
            codedOutputStream.m12003w(2, 0L);
            codedOutputStream.m11996n(3, byteStringM11984a2);
            if (byteString3 != null) {
                codedOutputStream.m11996n(4, byteString3);
            }
            if (treeMap != null && !treeMap.isEmpty()) {
                for (Map.Entry entry2 : treeMap.entrySet()) {
                    codedOutputStream.m12001u(2, 2);
                    codedOutputStream.m11999r(SessionProtobufHelper.m12005b((String) entry2.getKey(), (String) entry2.getValue()));
                    codedOutputStream.m11996n(1, ByteString.m11984a((String) entry2.getKey()));
                    str2 = (String) entry2.getValue();
                    if (str2 == null) {
                        str2 = "";
                    }
                    codedOutputStream.m11996n(2, ByteString.m11984a(str2));
                }
            }
            if (runningAppProcessInfoM11745h != null) {
                if (runningAppProcessInfoM11745h.importance != 100) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                codedOutputStream.m11995m(3, z2);
            }
            codedOutputStream.m12002v(4, i3);
            codedOutputStream.m12001u(5, 2);
            codedOutputStream.m11999r(SessionProtobufHelper.m12010g(f2, iM11736b, zM11749l, i3, j3, jM11738a));
            if (f2 != null) {
                float fFloatValue = f2.floatValue();
                codedOutputStream.m11999r(13);
                int iFloatToRawIntBits = Float.floatToRawIntBits(fFloatValue);
                codedOutputStream.m11998q(iFloatToRawIntBits & 255);
                codedOutputStream.m11998q((iFloatToRawIntBits >> 8) & 255);
                codedOutputStream.m11998q((iFloatToRawIntBits >> 16) & 255);
                codedOutputStream.m11998q((iFloatToRawIntBits >> 24) & 255);
            }
            codedOutputStream.m11999r(16);
            codedOutputStream.m11999r((iM11736b << 1) ^ (iM11736b >> 31));
            codedOutputStream.m11995m(3, zM11749l);
            codedOutputStream.m12002v(4, i3);
            codedOutputStream.m12003w(5, j3);
            codedOutputStream.m12003w(6, jM11738a);
            if (byteString2 != null) {
                codedOutputStream.m12001u(6, 2);
                codedOutputStream.m11999r(CodedOutputStream.m11987c(1, byteString2));
                codedOutputStream.m11996n(1, byteString2);
            }
            this.f26603t.f26652d.mo11815d();
        }
        mapUnmodifiableMap = new TreeMap();
        treeMap = mapUnmodifiableMap;
        bArrMo11814c = this.f26603t.f26652d.mo11814c();
        ByteString byteString7 = SessionProtobufHelper.f26920a;
        ByteString byteStringM11984a3 = ByteString.m11984a(str4);
        if (str3 == null) {
            byteStringM11984a = null;
        } else {
            byteStringM11984a = ByteString.m11984a(str3.replace("-", ""));
        }
        if (bArrMo11814c != null) {
            int length3 = bArrMo11814c.length;
            byte[] bArr2 = new byte[length3];
            System.arraycopy(bArrMo11814c, 0, bArr2, 0, length3);
            byteString = new ByteString(bArr2);
        } else {
            Logger4.f26421a.m11713b("No log data to include with this event.");
            byteString = null;
        }
        codedOutputStream.m12001u(10, 2);
        int iM11987c3 = CodedOutputStream.m11987c(2, ByteString.m11984a(str)) + CodedOutputStream.m11992j(1, j2) + 0;
        byteString2 = byteString;
        threadArr2 = threadArr;
        int iM12009f2 = SessionProtobufHelper.m12009f(trimmedThrowableData, thread, stackTraceElementArr, threadArr, linkedList, 8, byteStringM11984a3, byteStringM11984a, treeMap, runningAppProcessInfoM11745h, i3);
        int iM11989f3 = CodedOutputStream.m11989f(iM12009f2) + CodedOutputStream.m11990h(3) + iM12009f2 + iM11987c3;
        int iM12010g2 = SessionProtobufHelper.m12010g(f2, iM11736b, zM11749l, i3, j3, jM11738a);
        iM11989f = CodedOutputStream.m11989f(iM12010g2) + CodedOutputStream.m11990h(5) + iM12010g2 + iM11989f3;
        if (byteString2 != null) {
            int iM11987c4 = CodedOutputStream.m11987c(1, byteString2);
            iM11989f += CodedOutputStream.m11989f(iM11987c4) + CodedOutputStream.m11990h(6) + iM11987c4;
        }
        codedOutputStream.m11999r(iM11989f);
        codedOutputStream.m12003w(1, j2);
        codedOutputStream.m11996n(2, ByteString.m11984a(str));
        codedOutputStream.m12001u(3, 2);
        ByteString byteString8 = byteStringM11984a;
        codedOutputStream.m11999r(SessionProtobufHelper.m12009f(trimmedThrowableData, thread, stackTraceElementArr, threadArr2, linkedList, 8, byteStringM11984a3, byteString8, treeMap, runningAppProcessInfoM11745h, i3));
        codedOutputStream.m12001u(1, 2);
        codedOutputStream.m11999r(SessionProtobufHelper.m12008e(trimmedThrowableData, thread, stackTraceElementArr, threadArr2, linkedList, 8, byteStringM11984a3, byteString8));
        SessionProtobufHelper.m12016m(codedOutputStream, thread, stackTraceElementArr, 4, true);
        length = threadArr2.length;
        while (i2 < length) {
            SessionProtobufHelper.m12016m(codedOutputStream, threadArr2[i2], (StackTraceElement[]) linkedList.get(i2), 0, false);
        }
        SessionProtobufHelper.m12015l(codedOutputStream, trimmedThrowableData, 1, 8, 2);
        codedOutputStream.m12001u(3, 2);
        codedOutputStream.m11999r(SessionProtobufHelper.m12007d());
        ByteString byteString9 = SessionProtobufHelper.f26920a;
        codedOutputStream.m11996n(1, byteString9);
        codedOutputStream.m11996n(2, byteString9);
        codedOutputStream.m12003w(3, 0L);
        codedOutputStream.m12001u(4, 2);
        byteString3 = byteStringM11984a;
        codedOutputStream.m11999r(SessionProtobufHelper.m12004a(byteStringM11984a3, byteString3));
        codedOutputStream.m12003w(1, 0L);
        codedOutputStream.m12003w(2, 0L);
        codedOutputStream.m11996n(3, byteStringM11984a3);
        if (byteString3 != null) {
            codedOutputStream.m11996n(4, byteString3);
        }
        if (treeMap != null) {
            while (r3.hasNext()) {
                codedOutputStream.m12001u(2, 2);
                codedOutputStream.m11999r(SessionProtobufHelper.m12005b((String) entry2.getKey(), (String) entry2.getValue()));
                codedOutputStream.m11996n(1, ByteString.m11984a((String) entry2.getKey()));
                str2 = (String) entry2.getValue();
                if (str2 == null) {
                    str2 = "";
                }
                codedOutputStream.m11996n(2, ByteString.m11984a(str2));
            }
        }
        if (runningAppProcessInfoM11745h != null) {
            if (runningAppProcessInfoM11745h.importance != 100) {
                z2 = true;
            } else {
                z2 = false;
            }
            codedOutputStream.m11995m(3, z2);
        }
        codedOutputStream.m12002v(4, i3);
        codedOutputStream.m12001u(5, 2);
        codedOutputStream.m11999r(SessionProtobufHelper.m12010g(f2, iM11736b, zM11749l, i3, j3, jM11738a));
        if (f2 != null) {
            float fFloatValue2 = f2.floatValue();
            codedOutputStream.m11999r(13);
            int iFloatToRawIntBits2 = Float.floatToRawIntBits(fFloatValue2);
            codedOutputStream.m11998q(iFloatToRawIntBits2 & 255);
            codedOutputStream.m11998q((iFloatToRawIntBits2 >> 8) & 255);
            codedOutputStream.m11998q((iFloatToRawIntBits2 >> 16) & 255);
            codedOutputStream.m11998q((iFloatToRawIntBits2 >> 24) & 255);
        }
        codedOutputStream.m11999r(16);
        codedOutputStream.m11999r((iM11736b << 1) ^ (iM11736b >> 31));
        codedOutputStream.m11995m(3, zM11749l);
        codedOutputStream.m12002v(4, i3);
        codedOutputStream.m12003w(5, j3);
        codedOutputStream.m12003w(6, jM11738a);
        if (byteString2 != null) {
            codedOutputStream.m12001u(6, 2);
            codedOutputStream.m11999r(CodedOutputStream.m11987c(1, byteString2));
            codedOutputStream.m11996n(1, byteString2);
        }
        this.f26603t.f26652d.mo11815d();
    }

    /* JADX INFO: renamed from: z */
    public final void m11805z(String str, String str2, g gVar) throws Exception {
        Throwable th;
        ClsFileOutputStream clsFileOutputStream;
        CodedOutputStream codedOutputStream = null;
        try {
            clsFileOutputStream = new ClsFileOutputStream(m11795l(), str + str2);
            try {
                CodedOutputStream codedOutputStreamM11993k = CodedOutputStream.m11993k(clsFileOutputStream);
                try {
                    gVar.mo11773a(codedOutputStreamM11993k);
                    CommonUtils.m11744g(codedOutputStreamM11993k, "Failed to flush to session " + str2 + " file.");
                    CommonUtils.m11740c(clsFileOutputStream, "Failed to close session " + str2 + " file.");
                } catch (Throwable th2) {
                    th = th2;
                    codedOutputStream = codedOutputStreamM11993k;
                    CommonUtils.m11744g(codedOutputStream, "Failed to flush to session " + str2 + " file.");
                    CommonUtils.m11740c(clsFileOutputStream, "Failed to close session " + str2 + " file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            clsFileOutputStream = null;
        }
    }
}
