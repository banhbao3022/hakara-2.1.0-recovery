package p007c.p190n.p194b.p209b.p243w1.p248w0;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.TimestampAdjuster;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p252x1.p261v.WebvttCueParser;
import p007c.p190n.p194b.p209b.p252x1.p261v.WebvttParserUtil;

/* JADX INFO: renamed from: c.n.b.b.w1.w0.v, reason: use source file name */
/* JADX INFO: compiled from: WebvttExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class WebvttExtractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public static final Pattern f9512a = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: b */
    public static final Pattern f9513b = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: c */
    public final String f9514c;

    /* JADX INFO: renamed from: d */
    public final TimestampAdjuster f9515d;

    /* JADX INFO: renamed from: f */
    public ExtractorOutput f9517f;

    /* JADX INFO: renamed from: h */
    public int f9519h;

    /* JADX INFO: renamed from: e */
    public final ParsableByteArray f9516e = new ParsableByteArray();

    /* JADX INFO: renamed from: g */
    public byte[] f9518g = new byte[1024];

    public WebvttExtractor(String str, TimestampAdjuster timestampAdjuster) {
        this.f9514c = str;
        this.f9515d = timestampAdjuster;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: a */
    public final TrackOutput2 m4331a(long j2) {
        TrackOutput2 trackOutput2Mo3774o = this.f9517f.mo3774o(0, 3);
        Format.b bVar = new Format.b();
        bVar.f6958k = "text/vtt";
        bVar.f6950c = this.f9514c;
        bVar.f6962o = j2;
        trackOutput2Mo3774o.mo3760e(bVar.m3519a());
        this.f9517f.mo3773j();
        return trackOutput2Mo3774o;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: c */
    public boolean mo3749c(ExtractorInput extractorInput) throws IOException {
        extractorInput.mo3731d(this.f9518g, 0, 6, false);
        this.f9516e.m3192B(this.f9518g, 6);
        if (WebvttParserUtil.m4491a(this.f9516e)) {
            return true;
        }
        extractorInput.mo3731d(this.f9518g, 6, 3, false);
        this.f9516e.m3192B(this.f9518g, 9);
        return WebvttParserUtil.m4491a(this.f9516e);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: e */
    public int mo3750e(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        Matcher matcher;
        String strM3202g;
        Objects.requireNonNull(this.f9517f);
        int iMo3729a = (int) extractorInput.mo3729a();
        int i = this.f9519h;
        byte[] bArr = this.f9518g;
        if (i == bArr.length) {
            this.f9518g = Arrays.copyOf(bArr, ((iMo3729a != -1 ? iMo3729a : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f9518g;
        int i2 = this.f9519h;
        int i3 = extractorInput.read(bArr2, i2, bArr2.length - i2);
        if (i3 != -1) {
            int i4 = this.f9519h + i3;
            this.f9519h = i4;
            if (iMo3729a == -1 || i4 != iMo3729a) {
                return 0;
            }
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(this.f9518g);
        WebvttParserUtil.m4494d(parsableByteArray);
        long j2 = 0;
        long jM4493c = 0;
        for (String strM3202g2 = parsableByteArray.m3202g(); !TextUtils.isEmpty(strM3202g2); strM3202g2 = parsableByteArray.m3202g()) {
            if (strM3202g2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher2 = f9512a.matcher(strM3202g2);
                if (!matcher2.find()) {
                    throw new ParserException(outline.m1599u("X-TIMESTAMP-MAP doesn't contain local timestamp: ", strM3202g2));
                }
                Matcher matcher3 = f9513b.matcher(strM3202g2);
                if (!matcher3.find()) {
                    throw new ParserException(outline.m1599u("X-TIMESTAMP-MAP doesn't contain media timestamp: ", strM3202g2));
                }
                String strGroup = matcher2.group(1);
                Objects.requireNonNull(strGroup);
                jM4493c = WebvttParserUtil.m4493c(strGroup);
                String strGroup2 = matcher3.group(1);
                Objects.requireNonNull(strGroup2);
                j2 = (Long.parseLong(strGroup2) * 1000000) / 90000;
            }
        }
        while (true) {
            String strM3202g3 = parsableByteArray.m3202g();
            if (strM3202g3 == null) {
                matcher = null;
                break;
            }
            if (!WebvttParserUtil.f10174a.matcher(strM3202g3).matches()) {
                matcher = WebvttCueParser.f10148a.matcher(strM3202g3);
                if (matcher.matches()) {
                    break;
                }
            } else {
                do {
                    strM3202g = parsableByteArray.m3202g();
                    if (strM3202g == null) {
                        break;
                    }
                } while (!strM3202g.isEmpty());
            }
        }
        if (matcher == null) {
            m4331a(0L);
        } else {
            String strGroup3 = matcher.group(1);
            Objects.requireNonNull(strGroup3);
            long jM4493c2 = WebvttParserUtil.m4493c(strGroup3);
            long jM3085b = this.f9515d.m3085b(((((j2 + jM4493c2) - jM4493c) * 90000) / 1000000) % 8589934592L);
            TrackOutput2 trackOutput2M4331a = m4331a(jM3085b - jM4493c2);
            this.f9516e.m3192B(this.f9518g, this.f9519h);
            trackOutput2M4331a.mo3758c(this.f9516e, this.f9519h);
            trackOutput2M4331a.mo3759d(jM3085b, 1, this.f9519h, 0, null);
        }
        return -1;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: f */
    public void mo3751f(ExtractorOutput extractorOutput) {
        this.f9517f = extractorOutput;
        extractorOutput.mo3772a(new SeekMap.b(-9223372036854775807L));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: g */
    public void mo3752g(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    public void release() {
    }
}
