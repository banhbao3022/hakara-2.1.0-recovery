package p007c.p190n.p194b.p195a.p196i.p197f;

import java.io.IOException;
import p007c.p190n.p385d.p413o.FieldDescriptor;
import p007c.p190n.p385d.p413o.ObjectEncoder;
import p007c.p190n.p385d.p413o.ObjectEncoderContext;
import p007c.p190n.p385d.p413o.p414i.Configurator;
import p007c.p190n.p385d.p413o.p414i.EncoderConfig;
import p007c.p190n.p385d.p413o.p415j.JsonDataEncoderBuilder5;

/* JADX INFO: renamed from: c.n.b.a.i.f.b, reason: use source file name */
/* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoBatchedLogRequestEncoder implements Configurator {

    /* JADX INFO: renamed from: a */
    public static final Configurator f5543a = new AutoBatchedLogRequestEncoder();

    /* JADX INFO: renamed from: c.n.b.a.i.f.b$a */
    /* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class a implements ObjectEncoder<AndroidClientInfo> {

        /* JADX INFO: renamed from: a */
        public static final a f5544a = new a();

        /* JADX INFO: renamed from: b */
        public static final FieldDescriptor f5545b = FieldDescriptor.m12045a("sdkVersion");

        /* JADX INFO: renamed from: c */
        public static final FieldDescriptor f5546c = FieldDescriptor.m12045a("model");

        /* JADX INFO: renamed from: d */
        public static final FieldDescriptor f5547d = FieldDescriptor.m12045a("hardware");

        /* JADX INFO: renamed from: e */
        public static final FieldDescriptor f5548e = FieldDescriptor.m12045a("device");

        /* JADX INFO: renamed from: f */
        public static final FieldDescriptor f5549f = FieldDescriptor.m12045a("product");

        /* JADX INFO: renamed from: g */
        public static final FieldDescriptor f5550g = FieldDescriptor.m12045a("osBuild");

        /* JADX INFO: renamed from: h */
        public static final FieldDescriptor f5551h = FieldDescriptor.m12045a("manufacturer");

        /* JADX INFO: renamed from: i */
        public static final FieldDescriptor f5552i = FieldDescriptor.m12045a("fingerprint");

        /* JADX INFO: renamed from: j */
        public static final FieldDescriptor f5553j = FieldDescriptor.m12045a("locale");

        /* JADX INFO: renamed from: k */
        public static final FieldDescriptor f5554k = FieldDescriptor.m12045a("country");

        /* JADX INFO: renamed from: l */
        public static final FieldDescriptor f5555l = FieldDescriptor.m12045a("mccMnc");

        /* JADX INFO: renamed from: m */
        public static final FieldDescriptor f5556m = FieldDescriptor.m12045a("applicationBuild");

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            AndroidClientInfo androidClientInfo = (AndroidClientInfo) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12051h(f5545b, androidClientInfo.mo2770l());
            objectEncoderContext2.mo12051h(f5546c, androidClientInfo.mo2767i());
            objectEncoderContext2.mo12051h(f5547d, androidClientInfo.mo2763e());
            objectEncoderContext2.mo12051h(f5548e, androidClientInfo.mo2761c());
            objectEncoderContext2.mo12051h(f5549f, androidClientInfo.mo2769k());
            objectEncoderContext2.mo12051h(f5550g, androidClientInfo.mo2768j());
            objectEncoderContext2.mo12051h(f5551h, androidClientInfo.mo2765g());
            objectEncoderContext2.mo12051h(f5552i, androidClientInfo.mo2762d());
            objectEncoderContext2.mo12051h(f5553j, androidClientInfo.mo2764f());
            objectEncoderContext2.mo12051h(f5554k, androidClientInfo.mo2760b());
            objectEncoderContext2.mo12051h(f5555l, androidClientInfo.mo2766h());
            objectEncoderContext2.mo12051h(f5556m, androidClientInfo.mo2759a());
        }
    }

    /* JADX INFO: renamed from: c.n.b.a.i.f.b$b */
    /* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class b implements ObjectEncoder<BatchedLogRequest> {

        /* JADX INFO: renamed from: a */
        public static final b f5557a = new b();

        /* JADX INFO: renamed from: b */
        public static final FieldDescriptor f5558b = FieldDescriptor.m12045a("logRequest");

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo12051h(f5558b, ((BatchedLogRequest) obj).mo2773a());
        }
    }

    /* JADX INFO: renamed from: c.n.b.a.i.f.b$c */
    /* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class c implements ObjectEncoder<ClientInfo> {

        /* JADX INFO: renamed from: a */
        public static final c f5559a = new c();

        /* JADX INFO: renamed from: b */
        public static final FieldDescriptor f5560b = FieldDescriptor.m12045a("clientType");

        /* JADX INFO: renamed from: c */
        public static final FieldDescriptor f5561c = FieldDescriptor.m12045a("androidClientInfo");

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            ClientInfo clientInfo = (ClientInfo) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12051h(f5560b, clientInfo.mo2775b());
            objectEncoderContext2.mo12051h(f5561c, clientInfo.mo2774a());
        }
    }

    /* JADX INFO: renamed from: c.n.b.a.i.f.b$d */
    /* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class d implements ObjectEncoder<LogEvent> {

        /* JADX INFO: renamed from: a */
        public static final d f5562a = new d();

        /* JADX INFO: renamed from: b */
        public static final FieldDescriptor f5563b = FieldDescriptor.m12045a("eventTimeMs");

        /* JADX INFO: renamed from: c */
        public static final FieldDescriptor f5564c = FieldDescriptor.m12045a("eventCode");

        /* JADX INFO: renamed from: d */
        public static final FieldDescriptor f5565d = FieldDescriptor.m12045a("eventUptimeMs");

        /* JADX INFO: renamed from: e */
        public static final FieldDescriptor f5566e = FieldDescriptor.m12045a("sourceExtension");

        /* JADX INFO: renamed from: f */
        public static final FieldDescriptor f5567f = FieldDescriptor.m12045a("sourceExtensionJsonProto3");

        /* JADX INFO: renamed from: g */
        public static final FieldDescriptor f5568g = FieldDescriptor.m12045a("timezoneOffsetSeconds");

        /* JADX INFO: renamed from: h */
        public static final FieldDescriptor f5569h = FieldDescriptor.m12045a("networkConnectionInfo");

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            LogEvent logEvent = (LogEvent) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12046a(f5563b, logEvent.mo2777b());
            objectEncoderContext2.mo12051h(f5564c, logEvent.mo2776a());
            objectEncoderContext2.mo12046a(f5565d, logEvent.mo2778c());
            objectEncoderContext2.mo12051h(f5566e, logEvent.mo2780e());
            objectEncoderContext2.mo12051h(f5567f, logEvent.mo2781f());
            objectEncoderContext2.mo12046a(f5568g, logEvent.mo2782g());
            objectEncoderContext2.mo12051h(f5569h, logEvent.mo2779d());
        }
    }

    /* JADX INFO: renamed from: c.n.b.a.i.f.b$e */
    /* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class e implements ObjectEncoder<LogRequest> {

        /* JADX INFO: renamed from: a */
        public static final e f5570a = new e();

        /* JADX INFO: renamed from: b */
        public static final FieldDescriptor f5571b = FieldDescriptor.m12045a("requestTimeMs");

        /* JADX INFO: renamed from: c */
        public static final FieldDescriptor f5572c = FieldDescriptor.m12045a("requestUptimeMs");

        /* JADX INFO: renamed from: d */
        public static final FieldDescriptor f5573d = FieldDescriptor.m12045a("clientInfo");

        /* JADX INFO: renamed from: e */
        public static final FieldDescriptor f5574e = FieldDescriptor.m12045a("logSource");

        /* JADX INFO: renamed from: f */
        public static final FieldDescriptor f5575f = FieldDescriptor.m12045a("logSourceName");

        /* JADX INFO: renamed from: g */
        public static final FieldDescriptor f5576g = FieldDescriptor.m12045a("logEvent");

        /* JADX INFO: renamed from: h */
        public static final FieldDescriptor f5577h = FieldDescriptor.m12045a("qosTier");

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            LogRequest logRequest = (LogRequest) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12046a(f5571b, logRequest.mo2788f());
            objectEncoderContext2.mo12046a(f5572c, logRequest.mo2789g());
            objectEncoderContext2.mo12051h(f5573d, logRequest.mo2783a());
            objectEncoderContext2.mo12051h(f5574e, logRequest.mo2785c());
            objectEncoderContext2.mo12051h(f5575f, logRequest.mo2786d());
            objectEncoderContext2.mo12051h(f5576g, logRequest.mo2784b());
            objectEncoderContext2.mo12051h(f5577h, logRequest.mo2787e());
        }
    }

    /* JADX INFO: renamed from: c.n.b.a.i.f.b$f */
    /* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class f implements ObjectEncoder<NetworkConnectionInfo> {

        /* JADX INFO: renamed from: a */
        public static final f f5578a = new f();

        /* JADX INFO: renamed from: b */
        public static final FieldDescriptor f5579b = FieldDescriptor.m12045a("networkType");

        /* JADX INFO: renamed from: c */
        public static final FieldDescriptor f5580c = FieldDescriptor.m12045a("mobileSubtype");

        @Override // p007c.p190n.p385d.p413o.Encoder2
        /* JADX INFO: renamed from: a */
        public void mo2772a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.mo12051h(f5579b, networkConnectionInfo.mo2792b());
            objectEncoderContext2.mo12051h(f5580c, networkConnectionInfo.mo2791a());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2771a(EncoderConfig<?> encoderConfig) {
        b bVar = b.f5557a;
        JsonDataEncoderBuilder5 jsonDataEncoderBuilder5 = (JsonDataEncoderBuilder5) encoderConfig;
        jsonDataEncoderBuilder5.f27022b.put(BatchedLogRequest.class, bVar);
        jsonDataEncoderBuilder5.f27023c.remove(BatchedLogRequest.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_BatchedLogRequest.class, bVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_BatchedLogRequest.class);
        e eVar = e.f5570a;
        jsonDataEncoderBuilder5.f27022b.put(LogRequest.class, eVar);
        jsonDataEncoderBuilder5.f27023c.remove(LogRequest.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_LogRequest.class, eVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_LogRequest.class);
        c cVar = c.f5559a;
        jsonDataEncoderBuilder5.f27022b.put(ClientInfo.class, cVar);
        jsonDataEncoderBuilder5.f27023c.remove(ClientInfo.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_ClientInfo.class, cVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_ClientInfo.class);
        a aVar = a.f5544a;
        jsonDataEncoderBuilder5.f27022b.put(AndroidClientInfo.class, aVar);
        jsonDataEncoderBuilder5.f27023c.remove(AndroidClientInfo.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_AndroidClientInfo.class, aVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_AndroidClientInfo.class);
        d dVar = d.f5562a;
        jsonDataEncoderBuilder5.f27022b.put(LogEvent.class, dVar);
        jsonDataEncoderBuilder5.f27023c.remove(LogEvent.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_LogEvent.class, dVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_LogEvent.class);
        f fVar = f.f5578a;
        jsonDataEncoderBuilder5.f27022b.put(NetworkConnectionInfo.class, fVar);
        jsonDataEncoderBuilder5.f27023c.remove(NetworkConnectionInfo.class);
        jsonDataEncoderBuilder5.f27022b.put(AutoValue_NetworkConnectionInfo.class, fVar);
        jsonDataEncoderBuilder5.f27023c.remove(AutoValue_NetworkConnectionInfo.class);
    }
}
