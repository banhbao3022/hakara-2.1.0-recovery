package p007c.p190n.p194b.p209b.p252x1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.BaseRenderer;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.FormatHolder;
import p007c.p190n.p194b.p209b.p212b2.Log;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p217p1.DecoderException;
import p007c.p190n.p194b.p209b.p252x1.p253n.Cea608Decoder;
import p007c.p190n.p194b.p209b.p252x1.p253n.Cea708Decoder;
import p007c.p190n.p194b.p209b.p252x1.p254o.DvbDecoder;
import p007c.p190n.p194b.p209b.p252x1.p255p.PgsDecoder;
import p007c.p190n.p194b.p209b.p252x1.p257r.SsaDecoder;
import p007c.p190n.p194b.p209b.p252x1.p258s.SubripDecoder;
import p007c.p190n.p194b.p209b.p252x1.p259t.TtmlDecoder;
import p007c.p190n.p194b.p209b.p252x1.p260u.Tx3gDecoder;
import p007c.p190n.p194b.p209b.p252x1.p261v.Mp4WebvttDecoder;
import p007c.p190n.p194b.p209b.p252x1.p261v.WebvttDecoder;

/* JADX INFO: renamed from: c.n.b.b.x1.m, reason: use source file name */
/* JADX INFO: compiled from: TextRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public final class TextRenderer extends BaseRenderer implements Handler.Callback {

    /* JADX INFO: renamed from: A */
    public SubtitleInputBuffer f9824A;

    /* JADX INFO: renamed from: B */
    public SubtitleOutputBuffer f9825B;

    /* JADX INFO: renamed from: C */
    public SubtitleOutputBuffer f9826C;

    /* JADX INFO: renamed from: D */
    public int f9827D;

    /* JADX INFO: renamed from: E */
    public long f9828E;

    /* JADX INFO: renamed from: q */
    public final Handler f9829q;

    /* JADX INFO: renamed from: r */
    public final TextOutput f9830r;

    /* JADX INFO: renamed from: s */
    public final SubtitleDecoderFactory f9831s;

    /* JADX INFO: renamed from: t */
    public final FormatHolder f9832t;

    /* JADX INFO: renamed from: u */
    public boolean f9833u;

    /* JADX INFO: renamed from: v */
    public boolean f9834v;

    /* JADX INFO: renamed from: w */
    public boolean f9835w;

    /* JADX INFO: renamed from: x */
    public int f9836x;

    /* JADX INFO: renamed from: y */
    public Format f9837y;

    /* JADX INFO: renamed from: z */
    public SubtitleDecoder f9838z;

    public TextRenderer(TextOutput textOutput, Looper looper) {
        this(textOutput, looper, SubtitleDecoderFactory.f9820a);
    }

    @Override // p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: B */
    public void mo3030B() {
        this.f9837y = null;
        this.f9828E = -9223372036854775807L;
        m4401J();
        m4405N();
        SubtitleDecoder subtitleDecoder = this.f9838z;
        Objects.requireNonNull(subtitleDecoder);
        subtitleDecoder.release();
        this.f9838z = null;
        this.f9836x = 0;
    }

    @Override // p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: D */
    public void mo3032D(long j2, boolean z) {
        m4401J();
        this.f9833u = false;
        this.f9834v = false;
        this.f9828E = -9223372036854775807L;
        if (this.f9836x != 0) {
            m4406O();
            return;
        }
        m4405N();
        SubtitleDecoder subtitleDecoder = this.f9838z;
        Objects.requireNonNull(subtitleDecoder);
        subtitleDecoder.flush();
    }

    @Override // p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: H */
    public void mo3036H(Format[] formatArr, long j2, long j3) {
        this.f9837y = formatArr[0];
        if (this.f9838z != null) {
            this.f9836x = 1;
        } else {
            m4404M();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m4401J() {
        List<Cue> listEmptyList = Collections.emptyList();
        Handler handler = this.f9829q;
        if (handler != null) {
            handler.obtainMessage(0, listEmptyList).sendToTarget();
        } else {
            this.f9830r.mo1147c(listEmptyList);
        }
    }

    /* JADX INFO: renamed from: K */
    public final long m4402K() {
        if (this.f9827D == -1) {
            return Long.MAX_VALUE;
        }
        Objects.requireNonNull(this.f9825B);
        int i = this.f9827D;
        Subtitle subtitle = this.f9825B.f9822h;
        Objects.requireNonNull(subtitle);
        if (i >= subtitle.mo4398l()) {
            return Long.MAX_VALUE;
        }
        SubtitleOutputBuffer subtitleOutputBuffer = this.f9825B;
        int i2 = this.f9827D;
        Subtitle subtitle2 = subtitleOutputBuffer.f9822h;
        Objects.requireNonNull(subtitle2);
        return subtitle2.mo4396h(i2) + subtitleOutputBuffer.f9823i;
    }

    /* JADX INFO: renamed from: L */
    public final void m4403L(SubtitleDecoderException subtitleDecoderException) {
        StringBuilder sbM1556G = outline.m1556G("Subtitle decoding failed. streamFormat=");
        sbM1556G.append(this.f9837y);
        Log.m3154b("TextRenderer", sbM1556G.toString(), subtitleDecoderException);
        m4401J();
        m4406O();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX INFO: renamed from: M */
    public final void m4404M() {
        SubtitleDecoder dvbDecoder;
        byte b = 1;
        this.f9835w = true;
        SubtitleDecoderFactory subtitleDecoderFactory = this.f9831s;
        Format format = this.f9837y;
        Objects.requireNonNull(format);
        Objects.requireNonNull((SubtitleDecoderFactory.a) subtitleDecoderFactory);
        String str = format.f6934q;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (!str.equals("application/dvbsubs")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -1248334819:
                    if (!str.equals("application/pgs")) {
                        b = -1;
                    }
                    break;
                case -1026075066:
                    if (!str.equals("application/x-mp4-vtt")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -1004728940:
                    if (!str.equals("text/vtt")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 691401887:
                    if (!str.equals("application/x-quicktime-tx3g")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 822864842:
                    if (!str.equals("text/x-ssa")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 930165504:
                    if (!str.equals("application/x-mp4-cea-608")) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 1566016562:
                    if (!str.equals("application/cea-708")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case 1668750253:
                    if (!str.equals("application/x-subrip")) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 1693976202:
                    if (!str.equals("application/ttml+xml")) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    dvbDecoder = new DvbDecoder(format.f6936s);
                    break;
                case 1:
                    dvbDecoder = new PgsDecoder();
                    break;
                case 2:
                    dvbDecoder = new Mp4WebvttDecoder();
                    break;
                case 3:
                    dvbDecoder = new WebvttDecoder();
                    break;
                case 4:
                    dvbDecoder = new Tx3gDecoder(format.f6936s);
                    break;
                case 5:
                    dvbDecoder = new SsaDecoder(format.f6936s);
                    break;
                case 6:
                case 7:
                    dvbDecoder = new Cea608Decoder(str, format.f6920I, 16000L);
                    break;
                case 8:
                    dvbDecoder = new Cea708Decoder(format.f6920I, format.f6936s);
                    break;
                case 9:
                    dvbDecoder = new SubripDecoder();
                    break;
                case 10:
                    dvbDecoder = new TtmlDecoder();
                    break;
            }
            this.f9838z = dvbDecoder;
            return;
        }
        throw new IllegalArgumentException(outline.m1599u("Attempted to create decoder for unsupported MIME type: ", str));
    }

    /* JADX INFO: renamed from: N */
    public final void m4405N() {
        this.f9824A = null;
        this.f9827D = -1;
        SubtitleOutputBuffer subtitleOutputBuffer = this.f9825B;
        if (subtitleOutputBuffer != null) {
            subtitleOutputBuffer.mo3638x();
            this.f9825B = null;
        }
        SubtitleOutputBuffer subtitleOutputBuffer2 = this.f9826C;
        if (subtitleOutputBuffer2 != null) {
            subtitleOutputBuffer2.mo3638x();
            this.f9826C = null;
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m4406O() {
        m4405N();
        SubtitleDecoder subtitleDecoder = this.f9838z;
        Objects.requireNonNull(subtitleDecoder);
        subtitleDecoder.release();
        this.f9838z = null;
        this.f9836x = 0;
        m4404M();
    }

    @Override // p007c.p190n.p194b.p209b.RendererCapabilities
    /* JADX INFO: renamed from: a */
    public int mo3383a(Format format) {
        Objects.requireNonNull((SubtitleDecoderFactory.a) this.f9831s);
        String str = format.f6934q;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str)) {
            return (format.f6921J == null ? 4 : 2) | 0 | 0;
        }
        return MimeTypes.m3170l(format.f6934q) ? 1 : 0;
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: c */
    public boolean mo3297c() {
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: g */
    public boolean mo3368g() {
        return this.f9834v;
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2, p007c.p190n.p194b.p209b.RendererCapabilities
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.f9830r.mo1147c((List) message.obj);
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: o */
    public void mo3369o(long j2, long j3) throws DecoderException {
        boolean z;
        if (this.f6257o) {
            long j4 = this.f9828E;
            if (j4 != -9223372036854775807L && j2 >= j4) {
                m4405N();
                this.f9834v = true;
            }
        }
        if (this.f9834v) {
            return;
        }
        if (this.f9826C == null) {
            SubtitleDecoder subtitleDecoder = this.f9838z;
            Objects.requireNonNull(subtitleDecoder);
            subtitleDecoder.mo4393a(j2);
            try {
                SubtitleDecoder subtitleDecoder2 = this.f9838z;
                Objects.requireNonNull(subtitleDecoder2);
                this.f9826C = subtitleDecoder2.mo3630b();
            } catch (SubtitleDecoderException e) {
                m4403L(e);
                return;
            }
        }
        if (this.f6252j != 2) {
            return;
        }
        if (this.f9825B != null) {
            long jM4402K = m4402K();
            z = false;
            while (jM4402K <= j2) {
                this.f9827D++;
                jM4402K = m4402K();
                z = true;
            }
        } else {
            z = false;
        }
        SubtitleOutputBuffer subtitleOutputBuffer = this.f9826C;
        if (subtitleOutputBuffer != null) {
            if (subtitleOutputBuffer.m3628v()) {
                if (!z && m4402K() == Long.MAX_VALUE) {
                    if (this.f9836x == 2) {
                        m4406O();
                    } else {
                        m4405N();
                        this.f9834v = true;
                    }
                }
            } else if (subtitleOutputBuffer.f7298g <= j2) {
                SubtitleOutputBuffer subtitleOutputBuffer2 = this.f9825B;
                if (subtitleOutputBuffer2 != null) {
                    subtitleOutputBuffer2.mo3638x();
                }
                Subtitle subtitle = subtitleOutputBuffer.f9822h;
                Objects.requireNonNull(subtitle);
                this.f9827D = subtitle.mo4395f(j2 - subtitleOutputBuffer.f9823i);
                this.f9825B = subtitleOutputBuffer;
                this.f9826C = null;
                z = true;
            }
        }
        if (z) {
            Objects.requireNonNull(this.f9825B);
            SubtitleOutputBuffer subtitleOutputBuffer3 = this.f9825B;
            Subtitle subtitle2 = subtitleOutputBuffer3.f9822h;
            Objects.requireNonNull(subtitle2);
            List<Cue> listMo4397j = subtitle2.mo4397j(j2 - subtitleOutputBuffer3.f9823i);
            Handler handler = this.f9829q;
            if (handler != null) {
                handler.obtainMessage(0, listMo4397j).sendToTarget();
            } else {
                this.f9830r.mo1147c(listMo4397j);
            }
        }
        if (this.f9836x == 2) {
            return;
        }
        while (!this.f9833u) {
            try {
                SubtitleInputBuffer subtitleInputBufferMo3631c = this.f9824A;
                if (subtitleInputBufferMo3631c == null) {
                    SubtitleDecoder subtitleDecoder3 = this.f9838z;
                    Objects.requireNonNull(subtitleDecoder3);
                    subtitleInputBufferMo3631c = subtitleDecoder3.mo3631c();
                    if (subtitleInputBufferMo3631c == null) {
                        return;
                    } else {
                        this.f9824A = subtitleInputBufferMo3631c;
                    }
                }
                if (this.f9836x == 1) {
                    subtitleInputBufferMo3631c.f7262f = 4;
                    SubtitleDecoder subtitleDecoder4 = this.f9838z;
                    Objects.requireNonNull(subtitleDecoder4);
                    subtitleDecoder4.mo3632d(subtitleInputBufferMo3631c);
                    this.f9824A = null;
                    this.f9836x = 2;
                    return;
                }
                int iM3037I = m3037I(this.f9832t, subtitleInputBufferMo3631c, false);
                if (iM3037I == -4) {
                    if (subtitleInputBufferMo3631c.m3628v()) {
                        this.f9833u = true;
                        this.f9835w = false;
                    } else {
                        Format format = this.f9832t.f7259b;
                        if (format == null) {
                            return;
                        }
                        subtitleInputBufferMo3631c.f9821n = format.f6938u;
                        subtitleInputBufferMo3631c.m3633A();
                        this.f9835w &= !subtitleInputBufferMo3631c.m3629w();
                    }
                    if (!this.f9835w) {
                        SubtitleDecoder subtitleDecoder5 = this.f9838z;
                        Objects.requireNonNull(subtitleDecoder5);
                        subtitleDecoder5.mo3632d(subtitleInputBufferMo3631c);
                        this.f9824A = null;
                    }
                } else if (iM3037I == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                m4403L(e2);
                return;
            }
        }
    }

    public TextRenderer(TextOutput textOutput, Looper looper, SubtitleDecoderFactory subtitleDecoderFactory) {
        Handler handler;
        super(3);
        Objects.requireNonNull(textOutput);
        this.f9830r = textOutput;
        if (looper == null) {
            handler = null;
        } else {
            int i = Util6.f6307a;
            handler = new Handler(looper, this);
        }
        this.f9829q = handler;
        this.f9831s = subtitleDecoderFactory;
        this.f9832t = new FormatHolder();
        this.f9828E = -9223372036854775807L;
    }
}
