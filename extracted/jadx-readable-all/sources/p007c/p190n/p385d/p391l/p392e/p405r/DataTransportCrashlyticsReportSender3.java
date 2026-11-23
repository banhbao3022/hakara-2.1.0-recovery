package p007c.p190n.p385d.p391l.p392e.p405r;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.charset.Charset;
import p007c.p190n.p194b.p195a.Transformer;
import p007c.p190n.p194b.p195a.Transport;
import p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport;
import p007c.p190n.p385d.p391l.p392e.p397m.p398x.CrashlyticsReportJsonTransform8;

/* JADX INFO: renamed from: c.n.d.l.e.r.c, reason: use source file name */
/* JADX INFO: compiled from: DataTransportCrashlyticsReportSender.java */
/* JADX INFO: loaded from: classes.dex */
public class DataTransportCrashlyticsReportSender3 {

    /* JADX INFO: renamed from: a */
    public static final CrashlyticsReportJsonTransform8 f26949a = new CrashlyticsReportJsonTransform8();

    /* JADX INFO: renamed from: b */
    public static final String f26950b = m12026a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: c */
    public static final String f26951c = m12026a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: d */
    public static final Transformer<CrashlyticsReport, byte[]> f26952d = new Transformer() { // from class: c.n.d.l.e.r.b
        @Override // p007c.p190n.p194b.p195a.Transformer
        public Object apply(Object obj) {
            return DataTransportCrashlyticsReportSender3.f26949a.m11967g((CrashlyticsReport) obj).getBytes(Charset.forName(Utf8Charset.NAME));
        }
    };

    /* JADX INFO: renamed from: e */
    public final Transport<CrashlyticsReport> f26953e;

    public DataTransportCrashlyticsReportSender3(Transport<CrashlyticsReport> transport, Transformer<CrashlyticsReport, byte[]> transformer) {
        this.f26953e = transport;
    }

    /* JADX INFO: renamed from: a */
    public static String m12026a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
