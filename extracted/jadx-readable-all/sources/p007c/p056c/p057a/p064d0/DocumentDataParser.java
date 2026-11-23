package p007c.p056c.p057a.p064d0;

import java.io.IOException;
import p007c.p056c.p057a.p059b0.DocumentData;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;

/* JADX INFO: renamed from: c.c.a.d0.g, reason: use source file name */
/* JADX INFO: compiled from: DocumentDataParser.java */
/* JADX INFO: loaded from: classes.dex */
public class DocumentDataParser implements ValueParser<DocumentData> {

    /* JADX INFO: renamed from: a */
    public static final DocumentDataParser f2258a = new DocumentDataParser();

    /* JADX INFO: renamed from: b */
    public static final JsonReader.a f2259b = JsonReader.a.m1394a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    @Override // p007c.p056c.p057a.p064d0.ValueParser
    /* JADX INFO: renamed from: a */
    public DocumentData mo1374a(JsonReader jsonReader, float f) throws IOException {
        DocumentData.a aVar = DocumentData.a.CENTER;
        jsonReader.mo1384c();
        DocumentData.a aVar2 = aVar;
        String strMo1383b0 = null;
        String strMo1383b1 = null;
        float fMo1379H = 0.0f;
        int iMo1380O = 0;
        float fMo1379H2 = 0.0f;
        float fMo1379H3 = 0.0f;
        int iM1405a = 0;
        int iM1405a2 = 0;
        float fMo1379H4 = 0.0f;
        boolean zMo1378D = true;
        while (jsonReader.mo1377B()) {
            switch (jsonReader.mo1389n0(f2259b)) {
                case 0:
                    strMo1383b0 = jsonReader.mo1383b0();
                    break;
                case 1:
                    strMo1383b1 = jsonReader.mo1383b0();
                    break;
                case 2:
                    fMo1379H = (float) jsonReader.mo1379H();
                    break;
                case 3:
                    int iMo1380O2 = jsonReader.mo1380O();
                    aVar2 = (iMo1380O2 <= 2 && iMo1380O2 >= 0) ? DocumentData.a.values()[iMo1380O2] : aVar;
                    break;
                case 4:
                    iMo1380O = jsonReader.mo1380O();
                    break;
                case 5:
                    fMo1379H2 = (float) jsonReader.mo1379H();
                    break;
                case 6:
                    fMo1379H3 = (float) jsonReader.mo1379H();
                    break;
                case 7:
                    iM1405a = JsonUtils.m1405a(jsonReader);
                    break;
                case 8:
                    iM1405a2 = JsonUtils.m1405a(jsonReader);
                    break;
                case 9:
                    fMo1379H4 = (float) jsonReader.mo1379H();
                    break;
                case 10:
                    zMo1378D = jsonReader.mo1378D();
                    break;
                default:
                    jsonReader.mo1390t0();
                    jsonReader.mo1392u0();
                    break;
            }
        }
        jsonReader.mo1388h();
        return new DocumentData(strMo1383b0, strMo1383b1, fMo1379H, aVar2, iMo1380O, fMo1379H2, fMo1379H3, iM1405a, iM1405a2, fMo1379H4, zMo1378D);
    }
}
