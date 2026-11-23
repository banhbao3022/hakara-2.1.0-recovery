package p007c.p190n.p194b.p209b.p221s1.p225h0;

import android.util.Log;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p221s1.p228k0.Mp4Extractor;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.p240n.MotionPhotoMetadata;

/* JADX INFO: renamed from: c.n.b.b.s1.h0.a, reason: use source file name */
/* JADX INFO: compiled from: JpegExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class JpegExtractor implements Extractor {

    /* JADX INFO: renamed from: b */
    public ExtractorOutput f7654b;

    /* JADX INFO: renamed from: c */
    public int f7655c;

    /* JADX INFO: renamed from: d */
    public int f7656d;

    /* JADX INFO: renamed from: e */
    public int f7657e;

    /* JADX INFO: renamed from: g */
    public MotionPhotoMetadata f7659g;

    /* JADX INFO: renamed from: h */
    public ExtractorInput f7660h;

    /* JADX INFO: renamed from: i */
    public StartOffsetExtractorInput f7661i;

    /* JADX INFO: renamed from: j */
    public Mp4Extractor f7662j;

    /* JADX INFO: renamed from: a */
    public final ParsableByteArray f7653a = new ParsableByteArray(6);

    /* JADX INFO: renamed from: f */
    public long f7658f = -1;

    /* JADX INFO: renamed from: a */
    public final void m3769a() {
        m3770b(new Metadata.b[0]);
        ExtractorOutput extractorOutput = this.f7654b;
        Objects.requireNonNull(extractorOutput);
        extractorOutput.mo3773j();
        this.f7654b.mo3772a(new SeekMap.b(-9223372036854775807L));
        this.f7655c = 6;
    }

    /* JADX INFO: renamed from: b */
    public final void m3770b(Metadata.b... bVarArr) {
        ExtractorOutput extractorOutput = this.f7654b;
        Objects.requireNonNull(extractorOutput);
        TrackOutput2 trackOutput2Mo3774o = extractorOutput.mo3774o(1024, 4);
        Format.b bVar = new Format.b();
        bVar.f6956i = new Metadata(bVarArr);
        trackOutput2Mo3774o.mo3760e(bVar.m3519a());
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: c */
    public boolean mo3749c(ExtractorInput extractorInput) throws IOException {
        if (m3771d(extractorInput) != 65496) {
            return false;
        }
        int iM3771d = m3771d(extractorInput);
        this.f7656d = iM3771d;
        if (iM3771d == 65504) {
            this.f7653a.m3221z(2);
            extractorInput.mo3739o(this.f7653a.f6392a, 0, 2);
            extractorInput.mo3733f(this.f7653a.m3219x() - 2);
            this.f7656d = m3771d(extractorInput);
        }
        if (this.f7656d != 65505) {
            return false;
        }
        extractorInput.mo3733f(2);
        this.f7653a.m3221z(6);
        extractorInput.mo3739o(this.f7653a.f6392a, 0, 6);
        return this.f7653a.m3215t() == 1165519206 && this.f7653a.m3219x() == 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m3771d(ExtractorInput extractorInput) throws IOException {
        this.f7653a.m3221z(2);
        extractorInput.mo3739o(this.f7653a.f6392a, 0, 2);
        return this.f7653a.m3219x();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: e */
    public int mo3750e(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        String strM3209n;
        MotionPhotoDescription motionPhotoDescriptionM3775a;
        long j2;
        int i = this.f7655c;
        if (i == 0) {
            this.f7653a.m3221z(2);
            extractorInput.readFully(this.f7653a.f6392a, 0, 2);
            int iM3219x = this.f7653a.m3219x();
            this.f7656d = iM3219x;
            if (iM3219x == 65498) {
                if (this.f7658f != -1) {
                    this.f7655c = 4;
                } else {
                    m3769a();
                }
            } else if ((iM3219x < 65488 || iM3219x > 65497) && iM3219x != 65281) {
                this.f7655c = 1;
            }
            return 0;
        }
        if (i == 1) {
            this.f7653a.m3221z(2);
            extractorInput.readFully(this.f7653a.f6392a, 0, 2);
            this.f7657e = this.f7653a.m3219x() - 2;
            this.f7655c = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f7661i == null || extractorInput != this.f7660h) {
                    this.f7660h = extractorInput;
                    this.f7661i = new StartOffsetExtractorInput(extractorInput, this.f7658f);
                }
                Mp4Extractor mp4Extractor = this.f7662j;
                Objects.requireNonNull(mp4Extractor);
                int iMo3750e = mp4Extractor.mo3750e(this.f7661i, positionHolder);
                if (iMo3750e == 1) {
                    positionHolder.f8519a += this.f7658f;
                }
                return iMo3750e;
            }
            long jMo3740p = extractorInput.mo3740p();
            long j3 = this.f7658f;
            if (jMo3740p != j3) {
                positionHolder.f8519a = j3;
                return 1;
            }
            if (extractorInput.mo3731d(this.f7653a.f6392a, 0, 1, true)) {
                extractorInput.mo3736k();
                if (this.f7662j == null) {
                    this.f7662j = new Mp4Extractor();
                }
                StartOffsetExtractorInput startOffsetExtractorInput = new StartOffsetExtractorInput(extractorInput, this.f7658f);
                this.f7661i = startOffsetExtractorInput;
                if (this.f7662j.mo3749c(startOffsetExtractorInput)) {
                    Mp4Extractor mp4Extractor2 = this.f7662j;
                    long j4 = this.f7658f;
                    ExtractorOutput extractorOutput = this.f7654b;
                    Objects.requireNonNull(extractorOutput);
                    mp4Extractor2.f7956s = new StartOffsetExtractorOutput(j4, extractorOutput);
                    MotionPhotoMetadata motionPhotoMetadata = this.f7659g;
                    Objects.requireNonNull(motionPhotoMetadata);
                    m3770b(motionPhotoMetadata);
                    this.f7655c = 5;
                } else {
                    m3769a();
                }
            } else {
                m3769a();
            }
            return 0;
        }
        if (this.f7656d == 65505) {
            ParsableByteArray parsableByteArray = new ParsableByteArray(this.f7657e);
            extractorInput.readFully(parsableByteArray.f6392a, 0, this.f7657e);
            if (this.f7659g == null && "http://ns.adobe.com/xap/1.0/".equals(parsableByteArray.m3209n()) && (strM3209n = parsableByteArray.m3209n()) != null) {
                long jMo3729a = extractorInput.mo3729a();
                MotionPhotoMetadata motionPhotoMetadata2 = null;
                if (jMo3729a != -1) {
                    try {
                        motionPhotoDescriptionM3775a = XmpMotionPhotoDescriptionParser.m3775a(strM3209n);
                    } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                        Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        motionPhotoDescriptionM3775a = null;
                    }
                    if (motionPhotoDescriptionM3775a != null && motionPhotoDescriptionM3775a.f7664b.size() >= 2) {
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        boolean zEquals = false;
                        for (int size = motionPhotoDescriptionM3775a.f7664b.size() - 1; size >= 0; size--) {
                            MotionPhotoDescription.a aVar = motionPhotoDescriptionM3775a.f7664b.get(size);
                            zEquals |= "video/mp4".equals(aVar.f7665a);
                            if (size == 0) {
                                j2 = jMo3729a - aVar.f7667c;
                                jMo3729a = 0;
                            } else {
                                long j9 = jMo3729a - aVar.f7666b;
                                j2 = jMo3729a;
                                jMo3729a = j9;
                            }
                            if (zEquals && jMo3729a != j2) {
                                j8 = j2 - jMo3729a;
                                j7 = jMo3729a;
                                zEquals = false;
                            }
                            if (size == 0) {
                                j6 = j2;
                                j5 = jMo3729a;
                            }
                        }
                        if (j7 != -1 && j8 != -1 && j5 != -1 && j6 != -1) {
                            motionPhotoMetadata2 = new MotionPhotoMetadata(j5, j6, motionPhotoDescriptionM3775a.f7663a, j7, j8);
                        }
                    }
                }
                this.f7659g = motionPhotoMetadata2;
                if (motionPhotoMetadata2 != null) {
                    this.f7658f = motionPhotoMetadata2.f8761i;
                }
            }
        } else {
            extractorInput.mo3737l(this.f7657e);
        }
        this.f7655c = 0;
        return 0;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: f */
    public void mo3751f(ExtractorOutput extractorOutput) {
        this.f7654b = extractorOutput;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: g */
    public void mo3752g(long j2, long j3) {
        if (j2 == 0) {
            this.f7655c = 0;
            this.f7662j = null;
        } else if (this.f7655c == 5) {
            Mp4Extractor mp4Extractor = this.f7662j;
            Objects.requireNonNull(mp4Extractor);
            mp4Extractor.mo3752g(j2, j3);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    public void release() {
        Mp4Extractor mp4Extractor = this.f7662j;
        if (mp4Extractor != null) {
            Objects.requireNonNull(mp4Extractor);
        }
    }
}
