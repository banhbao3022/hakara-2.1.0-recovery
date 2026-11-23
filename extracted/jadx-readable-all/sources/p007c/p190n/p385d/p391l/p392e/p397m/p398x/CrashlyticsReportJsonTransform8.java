package p007c.p190n.p385d.p391l.p392e.p397m.p398x;

import android.util.Base64;
import android.util.JsonReader;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Objects;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoCrashlyticsReportEncoder;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_CustomAttribute;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_FilesPayload;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_FilesPayload_File;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Application;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Device;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event_Application;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event_Device;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event_Log;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_User;
import p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport;
import p007c.p190n.p385d.p391l.p392e.p397m.ImmutableList3;
import p007c.p190n.p385d.p413o.DataEncoder;
import p007c.p190n.p385d.p413o.p415j.JsonDataEncoderBuilder4;
import p007c.p190n.p385d.p413o.p415j.JsonDataEncoderBuilder5;

/* JADX INFO: renamed from: c.n.d.l.e.m.x.h, reason: use source file name */
/* JADX INFO: compiled from: CrashlyticsReportJsonTransform.java */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsReportJsonTransform8 {

    /* JADX INFO: renamed from: a */
    public static final DataEncoder f26877a;

    /* JADX INFO: renamed from: c.n.d.l.e.m.x.h$a */
    /* JADX INFO: compiled from: CrashlyticsReportJsonTransform.java */
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        T mo11960a(JsonReader jsonReader) throws IOException;
    }

    static {
        JsonDataEncoderBuilder5 jsonDataEncoderBuilder5 = new JsonDataEncoderBuilder5();
        ((AutoCrashlyticsReportEncoder) AutoCrashlyticsReportEncoder.f26676a).m11835a(jsonDataEncoderBuilder5);
        jsonDataEncoderBuilder5.f27025e = true;
        f26877a = new JsonDataEncoderBuilder4(jsonDataEncoderBuilder5);
    }

    /* JADX INFO: renamed from: a */
    public static <T> ImmutableList3<T> m11961a(JsonReader jsonReader, a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo11960a(jsonReader));
        }
        jsonReader.endArray();
        return new ImmutableList3<>(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:125:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:169:0x029c  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0101  */
    /* JADX WARN: Code duplicated, block: B:97:0x016b  */
    /* JADX INFO: renamed from: b */
    public static CrashlyticsReport.d.AbstractC8523d m11962b(JsonReader jsonReader) throws IOException {
        byte b;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        AutoValue_CrashlyticsReport_Session_Event.b bVar = new AutoValue_CrashlyticsReport_Session_Event.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "device":
                    b = 0;
                    break;
                case "app":
                    b = 1;
                    break;
                case "log":
                    b = 2;
                    break;
                case "type":
                    b = 3;
                    break;
                case "timestamp":
                    b = 4;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                AutoValue_CrashlyticsReport_Session_Event_Device.b bVar2 = new AutoValue_CrashlyticsReport_Session_Event_Device.b();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.hashCode();
                    switch (strNextName2) {
                        case "batteryLevel":
                            b5 = 0;
                            break;
                        case "batteryVelocity":
                            b5 = 1;
                            break;
                        case "orientation":
                            b5 = 2;
                            break;
                        case "diskUsed":
                            b5 = 3;
                            break;
                        case "ramUsed":
                            b5 = 4;
                            break;
                        case "proximityOn":
                            b5 = 5;
                            break;
                        default:
                            b5 = -1;
                            break;
                    }
                    if (b5 == 0) {
                        bVar2.f26850a = Double.valueOf(jsonReader.nextDouble());
                    } else if (b5 == 1) {
                        bVar2.f26851b = Integer.valueOf(jsonReader.nextInt());
                    } else if (b5 == 2) {
                        bVar2.f26853d = Integer.valueOf(jsonReader.nextInt());
                    } else if (b5 == 3) {
                        bVar2.f26855f = Long.valueOf(jsonReader.nextLong());
                    } else if (b5 == 4) {
                        bVar2.f26854e = Long.valueOf(jsonReader.nextLong());
                    } else if (b5 != 5) {
                        jsonReader.skipValue();
                    } else {
                        bVar2.f26852c = Boolean.valueOf(jsonReader.nextBoolean());
                    }
                }
                jsonReader.endObject();
                bVar.f26786d = bVar2.m11949a();
            } else if (b == 1) {
                AutoValue_CrashlyticsReport_Session_Event_Application.b bVar3 = new AutoValue_CrashlyticsReport_Session_Event_Application.b();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName3 = jsonReader.nextName();
                    strNextName3.hashCode();
                    switch (strNextName3) {
                        case "background":
                            b2 = 0;
                            break;
                        case "execution":
                            b2 = 1;
                            break;
                        case "customAttributes":
                            b2 = 2;
                            break;
                        case "uiOrientation":
                            b2 = 3;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 == 0) {
                        bVar3.f26794c = Boolean.valueOf(jsonReader.nextBoolean());
                    } else if (b2 == 1) {
                        AutoValue_CrashlyticsReport_Session_Event_Application_Execution.b bVar4 = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution.b();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName4 = jsonReader.nextName();
                            strNextName4.hashCode();
                            switch (strNextName4) {
                                case "threads":
                                    b3 = 0;
                                    break;
                                case "signal":
                                    b3 = 1;
                                    break;
                                case "binaries":
                                    b3 = 2;
                                    break;
                                case "exception":
                                    b3 = 3;
                                    break;
                                default:
                                    b3 = -1;
                                    break;
                            }
                            if (b3 == 0) {
                                bVar4.f26800a = m11961a(jsonReader, new a() { // from class: c.n.d.l.e.m.x.d
                                    @Override // p007c.p190n.p385d.p391l.p392e.p397m.p398x.CrashlyticsReportJsonTransform8.a
                                    /* JADX INFO: renamed from: a */
                                    public Object mo11960a(JsonReader jsonReader2) throws IOException {
                                        DataEncoder dataEncoder = CrashlyticsReportJsonTransform8.f26877a;
                                        AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.b bVar5 = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.b();
                                        jsonReader2.beginObject();
                                        while (jsonReader2.hasNext()) {
                                            String strNextName5 = jsonReader2.nextName();
                                            strNextName5.hashCode();
                                            switch (strNextName5) {
                                                case "frames":
                                                    bVar5.f26833c = CrashlyticsReportJsonTransform8.m11961a(jsonReader2, new CrashlyticsReportJsonTransform8.a() { // from class: c.n.d.l.e.m.x.g
                                                        @Override // p007c.p190n.p385d.p391l.p392e.p397m.p398x.CrashlyticsReportJsonTransform8.a
                                                        /* JADX INFO: renamed from: a */
                                                        public Object mo11960a(JsonReader jsonReader3) {
                                                            return CrashlyticsReportJsonTransform8.m11964d(jsonReader3);
                                                        }
                                                    });
                                                    break;
                                                case "name":
                                                    String strNextString = jsonReader2.nextString();
                                                    Objects.requireNonNull(strNextString, "Null name");
                                                    bVar5.f26831a = strNextString;
                                                    break;
                                                case "importance":
                                                    bVar5.f26832b = Integer.valueOf(jsonReader2.nextInt());
                                                    break;
                                                default:
                                                    jsonReader2.skipValue();
                                                    break;
                                            }
                                        }
                                        jsonReader2.endObject();
                                        return bVar5.m11933a();
                                    }
                                });
                            } else if (b3 == 1) {
                                AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.b bVar5 = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.b();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.hashCode();
                                    int iHashCode = strNextName5.hashCode();
                                    if (iHashCode != -1147692044) {
                                        if (iHashCode != 3059181) {
                                            if (iHashCode == 3373707 && strNextName5.equals("name")) {
                                                b4 = 2;
                                            } else {
                                                b4 = -1;
                                            }
                                        } else if (strNextName5.equals("code")) {
                                            b4 = 1;
                                        } else {
                                            b4 = -1;
                                        }
                                    } else if (strNextName5.equals("address")) {
                                        b4 = 0;
                                    } else {
                                        b4 = -1;
                                    }
                                    if (b4 == 0) {
                                        bVar5.f26827c = Long.valueOf(jsonReader.nextLong());
                                    } else if (b4 == 1) {
                                        String strNextString = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString, "Null code");
                                        bVar5.f26826b = strNextString;
                                    } else if (b4 != 2) {
                                        jsonReader.skipValue();
                                    } else {
                                        String strNextString2 = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString2, "Null name");
                                        bVar5.f26825a = strNextString2;
                                    }
                                }
                                jsonReader.endObject();
                                bVar4.f26802c = bVar5.m11929a();
                            } else if (b3 == 2) {
                                bVar4.f26803d = m11961a(jsonReader, new a() { // from class: c.n.d.l.e.m.x.e
                                    @Override // p007c.p190n.p385d.p391l.p392e.p397m.p398x.CrashlyticsReportJsonTransform8.a
                                    /* JADX INFO: renamed from: a */
                                    public Object mo11960a(JsonReader jsonReader2) throws IOException {
                                        DataEncoder dataEncoder = CrashlyticsReportJsonTransform8.f26877a;
                                        AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.b bVar6 = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.b();
                                        jsonReader2.beginObject();
                                        while (jsonReader2.hasNext()) {
                                            String strNextName6 = jsonReader2.nextName();
                                            strNextName6.hashCode();
                                            switch (strNextName6) {
                                                case "name":
                                                    String strNextString3 = jsonReader2.nextString();
                                                    Objects.requireNonNull(strNextString3, "Null name");
                                                    bVar6.f26810c = strNextString3;
                                                    break;
                                                case "size":
                                                    bVar6.f26809b = Long.valueOf(jsonReader2.nextLong());
                                                    break;
                                                case "uuid":
                                                    bVar6.f26811d = new String(Base64.decode(jsonReader2.nextString(), 2), CrashlyticsReport.f26868a);
                                                    break;
                                                case "baseAddress":
                                                    bVar6.f26808a = Long.valueOf(jsonReader2.nextLong());
                                                    break;
                                                default:
                                                    jsonReader2.skipValue();
                                                    break;
                                            }
                                        }
                                        jsonReader2.endObject();
                                        return bVar6.m11919a();
                                    }
                                });
                            } else if (b3 != 3) {
                                jsonReader.skipValue();
                            } else {
                                CrashlyticsReport.d.AbstractC8523d.a.b.c cVarM11963c = m11963c(jsonReader);
                                Objects.requireNonNull(cVarM11963c, "Null exception");
                                bVar4.f26801b = cVarM11963c;
                            }
                        }
                        jsonReader.endObject();
                        bVar3.f26792a = bVar4.m11914a();
                    } else if (b2 == 2) {
                        bVar3.f26793b = m11961a(jsonReader, new a() { // from class: c.n.d.l.e.m.x.c
                            @Override // p007c.p190n.p385d.p391l.p392e.p397m.p398x.CrashlyticsReportJsonTransform8.a
                            /* JADX INFO: renamed from: a */
                            public Object mo11960a(JsonReader jsonReader2) throws IOException {
                                DataEncoder dataEncoder = CrashlyticsReportJsonTransform8.f26877a;
                                AutoValue_CrashlyticsReport_CustomAttribute.b bVar6 = new AutoValue_CrashlyticsReport_CustomAttribute.b();
                                jsonReader2.beginObject();
                                while (jsonReader2.hasNext()) {
                                    String strNextName6 = jsonReader2.nextName();
                                    strNextName6.hashCode();
                                    if (strNextName6.equals("key")) {
                                        String strNextString3 = jsonReader2.nextString();
                                        Objects.requireNonNull(strNextString3, "Null key");
                                        bVar6.f26715a = strNextString3;
                                    } else if (strNextName6.equals("value")) {
                                        String strNextString4 = jsonReader2.nextString();
                                        Objects.requireNonNull(strNextString4, "Null value");
                                        bVar6.f26716b = strNextString4;
                                    } else {
                                        jsonReader2.skipValue();
                                    }
                                }
                                jsonReader2.endObject();
                                return bVar6.m11849a();
                            }
                        });
                    } else if (b2 != 3) {
                        jsonReader.skipValue();
                    } else {
                        bVar3.f26795d = Integer.valueOf(jsonReader.nextInt());
                    }
                }
                jsonReader.endObject();
                bVar.m11901b(bVar3.mo11908a());
            } else if (b == 2) {
                AutoValue_CrashlyticsReport_Session_Event_Log.b bVar6 = new AutoValue_CrashlyticsReport_Session_Event_Log.b();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName6 = jsonReader.nextName();
                    strNextName6.hashCode();
                    if (strNextName6.equals("content")) {
                        String strNextString3 = jsonReader.nextString();
                        Objects.requireNonNull(strNextString3, "Null content");
                        bVar6.f26857a = strNextString3;
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                bVar.f26787e = bVar6.m11951a();
            } else if (b == 3) {
                String strNextString4 = jsonReader.nextString();
                Objects.requireNonNull(strNextString4, "Null type");
                bVar.f26784b = strNextString4;
            } else if (b != 4) {
                jsonReader.skipValue();
            } else {
                bVar.f26783a = Long.valueOf(jsonReader.nextLong());
            }
        }
        jsonReader.endObject();
        return bVar.m11900a();
    }

    /* JADX INFO: renamed from: c */
    public static CrashlyticsReport.d.AbstractC8523d.a.b.c m11963c(JsonReader jsonReader) throws IOException {
        AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.b bVar = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    bVar.f26819c = m11961a(jsonReader, new a() { // from class: c.n.d.l.e.m.x.f
                        @Override // p007c.p190n.p385d.p391l.p392e.p397m.p398x.CrashlyticsReportJsonTransform8.a
                        /* JADX INFO: renamed from: a */
                        public Object mo11960a(JsonReader jsonReader2) {
                            return CrashlyticsReportJsonTransform8.m11964d(jsonReader2);
                        }
                    });
                    break;
                case "reason":
                    bVar.f26818b = jsonReader.nextString();
                    break;
                case "type":
                    String strNextString = jsonReader.nextString();
                    Objects.requireNonNull(strNextString, "Null type");
                    bVar.f26817a = strNextString;
                    break;
                case "causedBy":
                    bVar.f26820d = m11963c(jsonReader);
                    break;
                case "overflowCount":
                    bVar.f26821e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.m11925a();
    }

    /* JADX INFO: renamed from: d */
    public static CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b m11964d(JsonReader jsonReader) throws IOException {
        AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.b bVar = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "offset":
                    bVar.f26842d = Long.valueOf(jsonReader.nextLong());
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    Objects.requireNonNull(strNextString, "Null symbol");
                    bVar.f26840b = strNextString;
                    break;
                case "pc":
                    bVar.f26839a = Long.valueOf(jsonReader.nextLong());
                    break;
                case "file":
                    bVar.f26841c = jsonReader.nextString();
                    break;
                case "importance":
                    bVar.f26843e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.m11939a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:140:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:181:0x0288  */
    /* JADX WARN: Code duplicated, block: B:237:0x0362  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:94:0x012a  */
    /* JADX INFO: renamed from: e */
    public static CrashlyticsReport m11965e(JsonReader jsonReader) throws IOException {
        byte b;
        byte b2;
        Charset charset = CrashlyticsReport.f26868a;
        AutoValue_CrashlyticsReport.b bVar = new AutoValue_CrashlyticsReport.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "ndkPayload":
                    AutoValue_CrashlyticsReport_FilesPayload.b bVar2 = new AutoValue_CrashlyticsReport_FilesPayload.b();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.hashCode();
                        if (strNextName2.equals("files")) {
                            bVar2.f26719a = m11961a(jsonReader, new a() { // from class: c.n.d.l.e.m.x.b
                                @Override // p007c.p190n.p385d.p391l.p392e.p397m.p398x.CrashlyticsReportJsonTransform8.a
                                /* JADX INFO: renamed from: a */
                                public Object mo11960a(JsonReader jsonReader2) throws IOException {
                                    DataEncoder dataEncoder = CrashlyticsReportJsonTransform8.f26877a;
                                    AutoValue_CrashlyticsReport_FilesPayload_File.b bVar3 = new AutoValue_CrashlyticsReport_FilesPayload_File.b();
                                    jsonReader2.beginObject();
                                    while (jsonReader2.hasNext()) {
                                        String strNextName3 = jsonReader2.nextName();
                                        strNextName3.hashCode();
                                        if (strNextName3.equals(CainMediaMetadataRetriever.METADATA_KEY_FILENAME)) {
                                            bVar3.m11857c(jsonReader2.nextString());
                                        } else if (strNextName3.equals("contents")) {
                                            bVar3.m11856b(Base64.decode(jsonReader2.nextString(), 2));
                                        } else {
                                            jsonReader2.skipValue();
                                        }
                                    }
                                    jsonReader2.endObject();
                                    return bVar3.m11855a();
                                }
                            });
                        } else if (strNextName2.equals("orgId")) {
                            bVar2.f26720b = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    bVar.f26712h = bVar2.m11852a();
                    break;
                case "sdkVersion":
                    String strNextString = jsonReader.nextString();
                    Objects.requireNonNull(strNextString, "Null sdkVersion");
                    bVar.f26705a = strNextString;
                    break;
                case "buildVersion":
                    String strNextString2 = jsonReader.nextString();
                    Objects.requireNonNull(strNextString2, "Null buildVersion");
                    bVar.f26709e = strNextString2;
                    break;
                case "gmpAppId":
                    String strNextString3 = jsonReader.nextString();
                    Objects.requireNonNull(strNextString3, "Null gmpAppId");
                    bVar.f26706b = strNextString3;
                    break;
                case "installationUuid":
                    String strNextString4 = jsonReader.nextString();
                    Objects.requireNonNull(strNextString4, "Null installationUuid");
                    bVar.f26708d = strNextString4;
                    break;
                case "platform":
                    bVar.f26707c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    String strNextString5 = jsonReader.nextString();
                    Objects.requireNonNull(strNextString5, "Null displayVersion");
                    bVar.f26710f = strNextString5;
                    break;
                case "session":
                    AutoValue_CrashlyticsReport_Session.b bVar3 = new AutoValue_CrashlyticsReport_Session.b();
                    bVar3.mo11871b(false);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.hashCode();
                        switch (strNextName3) {
                            case "startedAt":
                                bVar3.f26738c = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "identifier":
                                bVar3.m11875f(new String(Base64.decode(jsonReader.nextString(), 2), CrashlyticsReport.f26868a));
                                break;
                            case "endedAt":
                                bVar3.f26739d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                AutoValue_CrashlyticsReport_Session_Device.b bVar4 = new AutoValue_CrashlyticsReport_Session_Device.b();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.hashCode();
                                    switch (strNextName4) {
                                        case "simulator":
                                            bVar4.f26774f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "manufacturer":
                                            String strNextString6 = jsonReader.nextString();
                                            Objects.requireNonNull(strNextString6, "Null manufacturer");
                                            bVar4.f26776h = strNextString6;
                                            break;
                                        case "ram":
                                            bVar4.f26772d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "arch":
                                            bVar4.f26769a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "diskSpace":
                                            bVar4.f26773e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "cores":
                                            bVar4.f26771c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "model":
                                            String strNextString7 = jsonReader.nextString();
                                            Objects.requireNonNull(strNextString7, "Null model");
                                            bVar4.f26770b = strNextString7;
                                            break;
                                        case "state":
                                            bVar4.f26775g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "modelClass":
                                            String strNextString8 = jsonReader.nextString();
                                            Objects.requireNonNull(strNextString8, "Null modelClass");
                                            bVar4.f26777i = strNextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                bVar3.f26744i = bVar4.m11894a();
                                break;
                            case "events":
                                bVar3.f26745j = m11961a(jsonReader, new a() { // from class: c.n.d.l.e.m.x.a
                                    @Override // p007c.p190n.p385d.p391l.p392e.p397m.p398x.CrashlyticsReportJsonTransform8.a
                                    /* JADX INFO: renamed from: a */
                                    public Object mo11960a(JsonReader jsonReader2) {
                                        return CrashlyticsReportJsonTransform8.m11962b(jsonReader2);
                                    }
                                });
                                break;
                            case "os":
                                AutoValue_CrashlyticsReport_Session_OperatingSystem.b bVar5 = new AutoValue_CrashlyticsReport_Session_OperatingSystem.b();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.hashCode();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            b = 0;
                                            break;
                                        case "jailbroken":
                                            b = 1;
                                            break;
                                        case "version":
                                            b = 2;
                                            break;
                                        case "platform":
                                            b = 3;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    if (b == 0) {
                                        String strNextString9 = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString9, "Null buildVersion");
                                        bVar5.f26864c = strNextString9;
                                    } else if (b == 1) {
                                        bVar5.f26865d = Boolean.valueOf(jsonReader.nextBoolean());
                                    } else if (b == 2) {
                                        String strNextString10 = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString10, "Null version");
                                        bVar5.f26863b = strNextString10;
                                    } else if (b != 3) {
                                        jsonReader.skipValue();
                                    } else {
                                        bVar5.f26862a = Integer.valueOf(jsonReader.nextInt());
                                    }
                                }
                                jsonReader.endObject();
                                bVar3.f26743h = bVar5.m11956a();
                                break;
                            case "app":
                                AutoValue_CrashlyticsReport_Session_Application.b bVar6 = new AutoValue_CrashlyticsReport_Session_Application.b();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.hashCode();
                                    switch (strNextName6) {
                                        case "identifier":
                                            b2 = 0;
                                            break;
                                        case "developmentPlatform":
                                            b2 = 1;
                                            break;
                                        case "developmentPlatformVersion":
                                            b2 = 2;
                                            break;
                                        case "version":
                                            b2 = 3;
                                            break;
                                        case "installationUuid":
                                            b2 = 4;
                                            break;
                                        case "displayVersion":
                                            b2 = 5;
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    if (b2 == 0) {
                                        String strNextString11 = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString11, "Null identifier");
                                        bVar6.f26754a = strNextString11;
                                    } else if (b2 == 1) {
                                        bVar6.f26758e = jsonReader.nextString();
                                    } else if (b2 == 2) {
                                        bVar6.f26759f = jsonReader.nextString();
                                    } else if (b2 == 3) {
                                        String strNextString12 = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString12, "Null version");
                                        bVar6.f26755b = strNextString12;
                                    } else if (b2 == 4) {
                                        bVar6.f26757d = jsonReader.nextString();
                                    } else if (b2 != 5) {
                                        jsonReader.skipValue();
                                    } else {
                                        bVar6.f26756c = jsonReader.nextString();
                                    }
                                }
                                jsonReader.endObject();
                                bVar3.f26741f = bVar6.m11883a();
                                break;
                            case "user":
                                AutoValue_CrashlyticsReport_Session_User.b bVar7 = new AutoValue_CrashlyticsReport_Session_User.b();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName7 = jsonReader.nextName();
                                    strNextName7.hashCode();
                                    if (strNextName7.equals("identifier")) {
                                        String strNextString13 = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString13, "Null identifier");
                                        bVar7.f26867a = strNextString13;
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                bVar3.f26742g = bVar7.m11958a();
                                break;
                            case "generator":
                                String strNextString14 = jsonReader.nextString();
                                Objects.requireNonNull(strNextString14, "Null generator");
                                bVar3.f26736a = strNextString14;
                                break;
                            case "crashed":
                                bVar3.mo11871b(jsonReader.nextBoolean());
                                break;
                            case "generatorType":
                                bVar3.f26746k = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    bVar.f26711g = bVar3.mo11870a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.mo11845a();
    }

    /* JADX INFO: renamed from: f */
    public CrashlyticsReport m11966f(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport crashlyticsReportM11965e = m11965e(jsonReader);
                jsonReader.close();
                return crashlyticsReportM11965e;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public String m11967g(CrashlyticsReport crashlyticsReport) {
        return ((JsonDataEncoderBuilder4) f26877a).m12054a(crashlyticsReport);
    }
}
