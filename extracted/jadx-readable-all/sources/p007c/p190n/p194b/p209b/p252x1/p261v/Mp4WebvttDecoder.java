package p007c.p190n.p194b.p209b.p252x1.p261v;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.SimpleSubtitleDecoder;
import p007c.p190n.p194b.p209b.p252x1.Subtitle;
import p007c.p190n.p194b.p209b.p252x1.SubtitleDecoderException;

/* JADX INFO: renamed from: c.n.b.b.x1.v.d, reason: use source file name */
/* JADX INFO: compiled from: Mp4WebvttDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class Mp4WebvttDecoder extends SimpleSubtitleDecoder {

    /* JADX INFO: renamed from: n */
    public final ParsableByteArray f10127n;

    public Mp4WebvttDecoder() {
        super("Mp4WebvttDecoder");
        this.f10127n = new ParsableByteArray();
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.SimpleSubtitleDecoder
    /* JADX INFO: renamed from: j */
    public Subtitle mo4394j(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        Cue cueM4392a;
        ParsableByteArray parsableByteArray = this.f10127n;
        parsableByteArray.f6392a = bArr;
        parsableByteArray.f6394c = i;
        parsableByteArray.f6393b = 0;
        ArrayList arrayList = new ArrayList();
        while (this.f10127n.m3196a() > 0) {
            if (this.f10127n.m3196a() < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iM3201f = this.f10127n.m3201f();
            if (this.f10127n.m3201f() == 1987343459) {
                ParsableByteArray parsableByteArray2 = this.f10127n;
                int i2 = iM3201f - 8;
                CharSequence charSequenceM4487f = null;
                Cue.b bVarM4490a = null;
                while (i2 > 0) {
                    if (i2 < 8) {
                        throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
                    }
                    int iM3201f2 = parsableByteArray2.m3201f();
                    int iM3201f3 = parsableByteArray2.m3201f();
                    int i3 = iM3201f2 - 8;
                    String strM3128p = Util6.m3128p(parsableByteArray2.f6392a, parsableByteArray2.f6393b, i3);
                    parsableByteArray2.m3195E(i3);
                    i2 = (i2 - 8) - i3;
                    if (iM3201f3 == 1937011815) {
                        Pattern pattern = WebvttCueParser.f10148a;
                        WebvttCueParser.e eVar = new WebvttCueParser.e();
                        WebvttCueParser.m4486e(strM3128p, eVar);
                        bVarM4490a = eVar.m4490a();
                    } else if (iM3201f3 == 1885436268) {
                        charSequenceM4487f = WebvttCueParser.m4487f(null, strM3128p.trim(), Collections.emptyList());
                    }
                }
                if (charSequenceM4487f == null) {
                    charSequenceM4487f = "";
                }
                if (bVarM4490a != null) {
                    bVarM4490a.f9803a = charSequenceM4487f;
                    cueM4392a = bVarM4490a.m4392a();
                } else {
                    Pattern pattern2 = WebvttCueParser.f10148a;
                    WebvttCueParser.e eVar2 = new WebvttCueParser.e();
                    eVar2.f10163c = charSequenceM4487f;
                    cueM4392a = eVar2.m4490a().m4392a();
                }
                arrayList.add(cueM4392a);
            } else {
                this.f10127n.m3195E(iM3201f - 8);
            }
        }
        return new Mp4WebvttSubtitle(arrayList);
    }
}
