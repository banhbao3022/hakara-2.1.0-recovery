package p007c.p190n.p385d.p413o.p415j;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import p007c.p190n.p385d.p413o.DataEncoder;

/* JADX INFO: renamed from: c.n.d.o.j.d, reason: use source file name */
/* JADX INFO: compiled from: JsonDataEncoderBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class JsonDataEncoderBuilder4 implements DataEncoder {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ JsonDataEncoderBuilder5 f27020a;

    public JsonDataEncoderBuilder4(JsonDataEncoderBuilder5 jsonDataEncoderBuilder5) {
        this.f27020a = jsonDataEncoderBuilder5;
    }

    /* JADX INFO: renamed from: a */
    public String m12054a(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            m12055b(obj, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: b */
    public void m12055b(Object obj, Writer writer) throws IOException {
        JsonDataEncoderBuilder5 jsonDataEncoderBuilder5 = this.f27020a;
        JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(writer, jsonDataEncoderBuilder5.f27022b, jsonDataEncoderBuilder5.f27023c, jsonDataEncoderBuilder5.f27024d, jsonDataEncoderBuilder5.f27025e);
        jsonValueObjectEncoderContext.m12056i(obj, false);
        jsonValueObjectEncoderContext.m12058k();
        jsonValueObjectEncoderContext.f27028b.flush();
    }
}
