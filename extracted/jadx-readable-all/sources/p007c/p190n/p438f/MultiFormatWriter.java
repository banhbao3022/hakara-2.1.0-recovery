package p007c.p190n.p438f;

import java.util.Map;
import p007c.p190n.p438f.p439i.AztecWriter;
import p007c.p190n.p438f.p441j.BitMatrix;
import p007c.p190n.p438f.p443k.DataMatrixWriter;
import p007c.p190n.p438f.p445l.CodaBarWriter;
import p007c.p190n.p438f.p445l.Code128Writer;
import p007c.p190n.p438f.p445l.Code39Writer;
import p007c.p190n.p438f.p445l.Code93Writer;
import p007c.p190n.p438f.p445l.EAN13Writer;
import p007c.p190n.p438f.p445l.EAN8Writer;
import p007c.p190n.p438f.p445l.ITFWriter;
import p007c.p190n.p438f.p445l.UPCAWriter;
import p007c.p190n.p438f.p445l.UPCEWriter;
import p007c.p190n.p438f.p446m.PDF417Writer;
import p007c.p190n.p438f.p448n.QRCodeWriter;

/* JADX INFO: renamed from: c.n.f.e, reason: use source file name */
/* JADX INFO: compiled from: MultiFormatWriter.java */
/* JADX INFO: loaded from: classes.dex */
public final class MultiFormatWriter implements Writer {
    @Override // p007c.p190n.p438f.Writer
    /* JADX INFO: renamed from: a */
    public BitMatrix mo12331a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        Writer eAN8Writer;
        switch (barcodeFormat) {
            case AZTEC:
                eAN8Writer = new AztecWriter();
                break;
            case CODABAR:
                eAN8Writer = new CodaBarWriter();
                break;
            case CODE_39:
                eAN8Writer = new Code39Writer();
                break;
            case CODE_93:
                eAN8Writer = new Code93Writer();
                break;
            case CODE_128:
                eAN8Writer = new Code128Writer();
                break;
            case DATA_MATRIX:
                eAN8Writer = new DataMatrixWriter();
                break;
            case EAN_8:
                eAN8Writer = new EAN8Writer();
                break;
            case EAN_13:
                eAN8Writer = new EAN13Writer();
                break;
            case ITF:
                eAN8Writer = new ITFWriter();
                break;
            case MAXICODE:
            case RSS_14:
            case RSS_EXPANDED:
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
            case PDF_417:
                eAN8Writer = new PDF417Writer();
                break;
            case QR_CODE:
                eAN8Writer = new QRCodeWriter();
                break;
            case UPC_A:
                eAN8Writer = new UPCAWriter();
                break;
            case UPC_E:
                eAN8Writer = new UPCEWriter();
                break;
        }
        return eAN8Writer.mo12331a(str, barcodeFormat, i, i2, map);
    }
}
