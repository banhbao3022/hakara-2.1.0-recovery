package p007c.p190n.p385d.p391l.p392e.p397m;

import com.cgfay.media.CainMediaMetadataRetriever;
import java.io.IOException;
import p007c.p190n.p385d.p413o.ObjectEncoder;
import p007c.p190n.p385d.p413o.ObjectEncoderContext;
import p007c.p190n.p385d.p413o.p414i.Configurator;
import p007c.p190n.p385d.p413o.p414i.EncoderConfig;
import p007c.p190n.p385d.p413o.p415j.JsonDataEncoderBuilder5;

/* JADX INFO: renamed from: c.n.d.l.e.m.a, reason: use source file name */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoCrashlyticsReportEncoder implements Configurator {

    /* JADX INFO: renamed from: a */
    public static final Configurator f26676a = new AutoCrashlyticsReportEncoder();

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$a */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class a implements ObjectEncoder<CrashlyticsReport.b> {

        /* JADX INFO: renamed from: a */
        public static final a f26677a = new a();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.b bVar = (CrashlyticsReport.b) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12050g("key", bVar.mo11847a());
            objectEncoderContext2.mo12050g("value", bVar.mo11848b());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$b */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class b implements ObjectEncoder<CrashlyticsReport> {

        /* JADX INFO: renamed from: a */
        public static final b f26678a = new b();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12050g("sdkVersion", crashlyticsReport.mo11842g());
            objectEncoderContext2.mo12050g("gmpAppId", crashlyticsReport.mo11838c());
            objectEncoderContext2.mo12049d("platform", crashlyticsReport.mo11841f());
            objectEncoderContext2.mo12050g("installationUuid", crashlyticsReport.mo11839d());
            objectEncoderContext2.mo12050g("buildVersion", crashlyticsReport.mo11836a());
            objectEncoderContext2.mo12050g("displayVersion", crashlyticsReport.mo11837b());
            objectEncoderContext2.mo12050g("session", crashlyticsReport.mo11843h());
            objectEncoderContext2.mo12050g("ndkPayload", crashlyticsReport.mo11840e());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$c */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class c implements ObjectEncoder<CrashlyticsReport.c> {

        /* JADX INFO: renamed from: a */
        public static final c f26679a = new c();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.c cVar = (CrashlyticsReport.c) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12050g("files", cVar.mo11850a());
            objectEncoderContext2.mo12050g("orgId", cVar.mo11851b());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$d */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class d implements ObjectEncoder<CrashlyticsReport.c.b> {

        /* JADX INFO: renamed from: a */
        public static final d f26680a = new d();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.c.b bVar = (CrashlyticsReport.c.b) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12050g(CainMediaMetadataRetriever.METADATA_KEY_FILENAME, bVar.mo11854b());
            objectEncoderContext2.mo12050g("contents", bVar.mo11853a());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$e */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class e implements ObjectEncoder<CrashlyticsReport.d.a> {

        /* JADX INFO: renamed from: a */
        public static final e f26681a = new e();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.d.a aVar = (CrashlyticsReport.d.a) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12050g("identifier", aVar.mo11879d());
            objectEncoderContext2.mo12050g("version", aVar.mo11882g());
            objectEncoderContext2.mo12050g("displayVersion", aVar.mo11878c());
            objectEncoderContext2.mo12050g("organization", aVar.mo11881f());
            objectEncoderContext2.mo12050g("installationUuid", aVar.mo11880e());
            objectEncoderContext2.mo12050g("developmentPlatform", aVar.mo11876a());
            objectEncoderContext2.mo12050g("developmentPlatformVersion", aVar.mo11877b());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$f */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class f implements ObjectEncoder<CrashlyticsReport.d.a.b> {

        /* JADX INFO: renamed from: a */
        public static final f f26682a = new f();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo12050g("clsId", ((CrashlyticsReport.d.a.b) obj).mo11884a());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$g */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class g implements ObjectEncoder<CrashlyticsReport.d.c> {

        /* JADX INFO: renamed from: a */
        public static final g f26683a = new g();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.d.c cVar = (CrashlyticsReport.d.c) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12049d("arch", cVar.mo11885a());
            objectEncoderContext2.mo12050g("model", cVar.mo11889e());
            objectEncoderContext2.mo12049d("cores", cVar.mo11886b());
            objectEncoderContext2.mo12048c("ram", cVar.mo11891g());
            objectEncoderContext2.mo12048c("diskSpace", cVar.mo11887c());
            objectEncoderContext2.mo12047b("simulator", cVar.mo11893i());
            objectEncoderContext2.mo12049d("state", cVar.mo11892h());
            objectEncoderContext2.mo12050g("manufacturer", cVar.mo11888d());
            objectEncoderContext2.mo12050g("modelClass", cVar.mo11890f());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$h */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class h implements ObjectEncoder<CrashlyticsReport.d> {

        /* JADX INFO: renamed from: a */
        public static final h f26684a = new h();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.d dVar = (CrashlyticsReport.d) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12050g("generator", dVar.mo11862e());
            objectEncoderContext2.mo12050g("identifier", dVar.mo11864g().getBytes(CrashlyticsReport.f26868a));
            objectEncoderContext2.mo12048c("startedAt", dVar.mo11866i());
            objectEncoderContext2.mo12050g("endedAt", dVar.mo11860c());
            objectEncoderContext2.mo12047b("crashed", dVar.mo11868k());
            objectEncoderContext2.mo12050g("app", dVar.mo11858a());
            objectEncoderContext2.mo12050g("user", dVar.mo11867j());
            objectEncoderContext2.mo12050g("os", dVar.mo11865h());
            objectEncoderContext2.mo12050g("device", dVar.mo11859b());
            objectEncoderContext2.mo12050g("events", dVar.mo11861d());
            objectEncoderContext2.mo12049d("generatorType", dVar.mo11863f());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$i */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class i implements ObjectEncoder<CrashlyticsReport.d.AbstractC8523d.a> {

        /* JADX INFO: renamed from: a */
        public static final i f26685a = new i();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.d.AbstractC8523d.a aVar = (CrashlyticsReport.d.AbstractC8523d.a) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12050g("execution", aVar.mo11905c());
            objectEncoderContext2.mo12050g("customAttributes", aVar.mo11904b());
            objectEncoderContext2.mo12050g("background", aVar.mo11903a());
            objectEncoderContext2.mo12049d("uiOrientation", aVar.mo11906d());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$j */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class j implements ObjectEncoder<CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8525a> {

        /* JADX INFO: renamed from: a */
        public static final j f26686a = new j();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8525a abstractC8525a = (CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8525a) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12048c("baseAddress", abstractC8525a.mo11915a());
            objectEncoderContext2.mo12048c("size", abstractC8525a.mo11917c());
            objectEncoderContext2.mo12050g("name", abstractC8525a.mo11916b());
            String strMo11918d = abstractC8525a.mo11918d();
            objectEncoderContext2.mo12050g("uuid", strMo11918d != null ? strMo11918d.getBytes(CrashlyticsReport.f26868a) : null);
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$k */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class k implements ObjectEncoder<CrashlyticsReport.d.AbstractC8523d.a.b> {

        /* JADX INFO: renamed from: a */
        public static final k f26687a = new k();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.d.AbstractC8523d.a.b bVar = (CrashlyticsReport.d.AbstractC8523d.a.b) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12050g("threads", bVar.mo11913d());
            objectEncoderContext2.mo12050g("exception", bVar.mo11911b());
            objectEncoderContext2.mo12050g("signal", bVar.mo11912c());
            objectEncoderContext2.mo12050g("binaries", bVar.mo11910a());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$l */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class l implements ObjectEncoder<CrashlyticsReport.d.AbstractC8523d.a.b.c> {

        /* JADX INFO: renamed from: a */
        public static final l f26688a = new l();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.d.AbstractC8523d.a.b.c cVar = (CrashlyticsReport.d.AbstractC8523d.a.b.c) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12050g("type", cVar.mo11924e());
            objectEncoderContext2.mo12050g("reason", cVar.mo11923d());
            objectEncoderContext2.mo12050g("frames", cVar.mo11921b());
            objectEncoderContext2.mo12050g("causedBy", cVar.mo11920a());
            objectEncoderContext2.mo12049d("overflowCount", cVar.mo11922c());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$m */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class m implements ObjectEncoder<CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8529d> {

        /* JADX INFO: renamed from: a */
        public static final m f26689a = new m();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8529d abstractC8529d = (CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8529d) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12050g("name", abstractC8529d.mo11928c());
            objectEncoderContext2.mo12050g("code", abstractC8529d.mo11927b());
            objectEncoderContext2.mo12048c("address", abstractC8529d.mo11926a());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$n */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class n implements ObjectEncoder<CrashlyticsReport.d.AbstractC8523d.a.b.e> {

        /* JADX INFO: renamed from: a */
        public static final n f26690a = new n();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.d.AbstractC8523d.a.b.e eVar = (CrashlyticsReport.d.AbstractC8523d.a.b.e) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12050g("name", eVar.mo11932c());
            objectEncoderContext2.mo12049d("importance", eVar.mo11931b());
            objectEncoderContext2.mo12050g("frames", eVar.mo11930a());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$o */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class o implements ObjectEncoder<CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b> {

        /* JADX INFO: renamed from: a */
        public static final o f26691a = new o();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b abstractC8532b = (CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12048c("pc", abstractC8532b.mo11937d());
            objectEncoderContext2.mo12050g("symbol", abstractC8532b.mo11938e());
            objectEncoderContext2.mo12050g("file", abstractC8532b.mo11934a());
            objectEncoderContext2.mo12048c("offset", abstractC8532b.mo11936c());
            objectEncoderContext2.mo12049d("importance", abstractC8532b.mo11935b());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$p */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class p implements ObjectEncoder<CrashlyticsReport.d.AbstractC8523d.c> {

        /* JADX INFO: renamed from: a */
        public static final p f26692a = new p();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.d.AbstractC8523d.c cVar = (CrashlyticsReport.d.AbstractC8523d.c) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12050g("batteryLevel", cVar.mo11943a());
            objectEncoderContext2.mo12049d("batteryVelocity", cVar.mo11944b());
            objectEncoderContext2.mo12047b("proximityOn", cVar.mo11948f());
            objectEncoderContext2.mo12049d("orientation", cVar.mo11946d());
            objectEncoderContext2.mo12048c("ramUsed", cVar.mo11947e());
            objectEncoderContext2.mo12048c("diskUsed", cVar.mo11945c());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$q */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class q implements ObjectEncoder<CrashlyticsReport.d.AbstractC8523d> {

        /* JADX INFO: renamed from: a */
        public static final q f26693a = new q();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.d.AbstractC8523d abstractC8523d = (CrashlyticsReport.d.AbstractC8523d) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12048c("timestamp", abstractC8523d.mo11898d());
            objectEncoderContext2.mo12050g("type", abstractC8523d.mo11899e());
            objectEncoderContext2.mo12050g("app", abstractC8523d.mo11895a());
            objectEncoderContext2.mo12050g("device", abstractC8523d.mo11896b());
            objectEncoderContext2.mo12050g("log", abstractC8523d.mo11897c());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$r */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class r implements ObjectEncoder<CrashlyticsReport.d.AbstractC8523d.AbstractC8534d> {

        /* JADX INFO: renamed from: a */
        public static final r f26694a = new r();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo12050g("content", ((CrashlyticsReport.d.AbstractC8523d.AbstractC8534d) obj).mo11950a());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$s */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class s implements ObjectEncoder<CrashlyticsReport.d.e> {

        /* JADX INFO: renamed from: a */
        public static final s f26695a = new s();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.d.e eVar = (CrashlyticsReport.d.e) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12049d("platform", eVar.mo11953b());
            objectEncoderContext2.mo12050g("version", eVar.mo11954c());
            objectEncoderContext2.mo12050g("buildVersion", eVar.mo11952a());
            objectEncoderContext2.mo12047b("jailbroken", eVar.mo11955d());
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.m.a$t */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    public static final class t implements ObjectEncoder<CrashlyticsReport.d.f> {

        /* JADX INFO: renamed from: a */
        public static final t f26696a = new t();

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo12050g("identifier", ((CrashlyticsReport.d.f) obj).mo11957a());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m11835a(EncoderConfig<?> encoderConfig) {
        b bVar = b.f26678a;
        JsonDataEncoderBuilder5 jsonDataEncoderBuilder5 = (JsonDataEncoderBuilder5) encoderConfig;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.class, bVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport.class, bVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport.class);
        h hVar = h.f26684a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.d.class, hVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.d.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_Session.class, hVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_Session.class);
        e eVar = e.f26681a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.d.a.class, eVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.d.a.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_Session_Application.class, eVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_Session_Application.class);
        f fVar = f.f26682a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.d.a.b.class, fVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.d.a.b.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_Session_Application_Organization.class, fVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_Session_Application_Organization.class);
        t tVar = t.f26696a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.d.f.class, tVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.d.f.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_Session_User.class, tVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_Session_User.class);
        s sVar = s.f26695a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.d.e.class, sVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.d.e.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_Session_OperatingSystem.class, sVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_Session_OperatingSystem.class);
        g gVar = g.f26683a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.d.c.class, gVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.d.c.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_Session_Device.class, gVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_Session_Device.class);
        q qVar = q.f26693a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.d.AbstractC8523d.class, qVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.d.AbstractC8523d.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_Session_Event.class, qVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_Session_Event.class);
        i iVar = i.f26685a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.d.AbstractC8523d.a.class, iVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.d.AbstractC8523d.a.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_Session_Event_Application.class, iVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_Session_Event_Application.class);
        k kVar = k.f26687a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.d.AbstractC8523d.a.b.class, kVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.d.AbstractC8523d.a.b.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.class, kVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.class);
        n nVar = n.f26690a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.d.AbstractC8523d.a.b.e.class, nVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.d.AbstractC8523d.a.b.e.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.class, nVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.class);
        o oVar = o.f26691a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b.class, oVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.class, oVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.class);
        l lVar = l.f26688a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.d.AbstractC8523d.a.b.c.class, lVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.d.AbstractC8523d.a.b.c.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.class, lVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.class);
        m mVar = m.f26689a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8529d.class, mVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8529d.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.class, mVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.class);
        j jVar = j.f26686a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8525a.class, jVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.d.AbstractC8523d.a.b.AbstractC8525a.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.class, jVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.class);
        a aVar = a.f26677a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.b.class, aVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.b.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_CustomAttribute.class, aVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_CustomAttribute.class);
        p pVar = p.f26692a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.d.AbstractC8523d.c.class, pVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.d.AbstractC8523d.c.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_Session_Event_Device.class, pVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_Session_Event_Device.class);
        r rVar = r.f26694a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.d.AbstractC8523d.AbstractC8534d.class, rVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.d.AbstractC8523d.AbstractC8534d.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_Session_Event_Log.class, rVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_Session_Event_Log.class);
        c cVar = c.f26679a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.c.class, cVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.c.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_FilesPayload.class, cVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_FilesPayload.class);
        d dVar = d.f26680a;
        jsonDataEncoderBuilder5.f27022b.put(CrashlyticsReport.c.b.class, dVar);
        jsonDataEncoderBuilder5.f27023c.remove(CrashlyticsReport.c.b.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_CrashlyticsReport_FilesPayload_File.class, dVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_CrashlyticsReport_FilesPayload_File.class);
    }
}
