package p007c.p190n.p194b.p209b.p243w1;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p210a2.DataReader;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.DefaultExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.n, reason: use source file name */
/* JADX INFO: compiled from: BundledExtractorsAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class BundledExtractorsAdapter implements ProgressiveMediaExtractor {

    /* JADX INFO: renamed from: a */
    public final ExtractorsFactory2 f9024a;

    /* JADX INFO: renamed from: b */
    public Extractor f9025b;

    /* JADX INFO: renamed from: c */
    public ExtractorInput f9026c;

    public BundledExtractorsAdapter(ExtractorsFactory2 extractorsFactory2) {
        this.f9024a = extractorsFactory2;
    }

    /* JADX INFO: renamed from: a */
    public long m4176a() {
        ExtractorInput extractorInput = this.f9026c;
        if (extractorInput != null) {
            return extractorInput.mo3740p();
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX INFO: renamed from: b */
    public void m4177b(DataReader dataReader, Uri uri, Map<String, List<String>> map, long j2, long j3, ExtractorOutput extractorOutput) throws IOException {
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataReader, j2, j3);
        this.f9026c = defaultExtractorInput;
        if (this.f9025b != null) {
            return;
        }
        Extractor[] extractorArrMo3746b = this.f9024a.mo3746b(uri, map);
        boolean z = true;
        if (extractorArrMo3746b.length == 1) {
            this.f9025b = extractorArrMo3746b[0];
        } else {
            for (Extractor extractor : extractorArrMo3746b) {
                try {
                    if (extractor.mo3749c(defaultExtractorInput)) {
                        this.f9025b = extractor;
                        C2096e.m4570f(true);
                        defaultExtractorInput.f7575f = 0;
                        break;
                    } else {
                        boolean z2 = this.f9025b != null || defaultExtractorInput.f7573d == j2;
                        C2096e.m4570f(z2);
                        defaultExtractorInput.f7575f = 0;
                    }
                } catch (EOFException unused) {
                    if (this.f9025b != null || defaultExtractorInput.f7573d == j2) {
                    }
                } catch (Throwable th) {
                    if (this.f9025b == null && defaultExtractorInput.f7573d != j2) {
                        z = false;
                    }
                    C2096e.m4570f(z);
                    defaultExtractorInput.f7575f = 0;
                    throw th;
                }
                C2096e.m4570f(z2);
                defaultExtractorInput.f7575f = 0;
            }
            if (this.f9025b == null) {
                StringBuilder sbM1556G = outline.m1556G("None of the available extractors (");
                int i = Util6.f6307a;
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < extractorArrMo3746b.length; i2++) {
                    sb.append(extractorArrMo3746b[i2].getClass().getSimpleName());
                    if (i2 < extractorArrMo3746b.length - 1) {
                        sb.append(", ");
                    }
                }
                sbM1556G.append(sb.toString());
                sbM1556G.append(") could read the stream.");
                String string = sbM1556G.toString();
                Objects.requireNonNull(uri);
                throw new UnrecognizedInputFormatException(string, uri);
            }
        }
        this.f9025b.mo3751f(extractorOutput);
    }
}
