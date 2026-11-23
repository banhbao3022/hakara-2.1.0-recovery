package p007c.p190n.p194b.p209b.p234u1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p209b.BaseRenderer;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.FormatHolder;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.u1.g, reason: use source file name */
/* JADX INFO: compiled from: MetadataRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public final class MetadataRenderer extends BaseRenderer implements Handler.Callback {

    /* JADX INFO: renamed from: A */
    public boolean f8664A;

    /* JADX INFO: renamed from: B */
    public long f8665B;

    /* JADX INFO: renamed from: q */
    public final MetadataDecoderFactory f8666q;

    /* JADX INFO: renamed from: r */
    public final MetadataOutput f8667r;

    /* JADX INFO: renamed from: s */
    public final Handler f8668s;

    /* JADX INFO: renamed from: t */
    public final MetadataInputBuffer f8669t;

    /* JADX INFO: renamed from: u */
    public final Metadata[] f8670u;

    /* JADX INFO: renamed from: v */
    public final long[] f8671v;

    /* JADX INFO: renamed from: w */
    public int f8672w;

    /* JADX INFO: renamed from: x */
    public int f8673x;

    /* JADX INFO: renamed from: y */
    public MetadataDecoder f8674y;

    /* JADX INFO: renamed from: z */
    public boolean f8675z;

    public MetadataRenderer(MetadataOutput metadataOutput, Looper looper) {
        this(metadataOutput, looper, MetadataDecoderFactory.f8662a);
    }

    @Override // p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: B */
    public void mo3030B() {
        Arrays.fill(this.f8670u, (Object) null);
        this.f8672w = 0;
        this.f8673x = 0;
        this.f8674y = null;
    }

    @Override // p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: D */
    public void mo3032D(long j2, boolean z) {
        Arrays.fill(this.f8670u, (Object) null);
        this.f8672w = 0;
        this.f8673x = 0;
        this.f8675z = false;
        this.f8664A = false;
    }

    @Override // p007c.p190n.p194b.p209b.BaseRenderer
    /* JADX INFO: renamed from: H */
    public void mo3036H(Format[] formatArr, long j2, long j3) {
        this.f8674y = this.f8666q.mo4016b(formatArr[0]);
    }

    /* JADX INFO: renamed from: J */
    public final void m4017J(Metadata metadata, List<Metadata.b> list) {
        int i = 0;
        while (true) {
            Metadata.b[] bVarArr = metadata.f8661f;
            if (i >= bVarArr.length) {
                return;
            }
            Format formatMo4011q = bVarArr[i].mo4011q();
            if (formatMo4011q == null || !this.f8666q.mo4015a(formatMo4011q)) {
                list.add(metadata.f8661f[i]);
            } else {
                MetadataDecoder metadataDecoderMo4016b = this.f8666q.mo4016b(formatMo4011q);
                byte[] bArrMo4010F = metadata.f8661f[i].mo4010F();
                Objects.requireNonNull(bArrMo4010F);
                this.f8669t.mo3635x();
                this.f8669t.m3637z(bArrMo4010F.length);
                ByteBuffer byteBuffer = this.f8669t.f7287h;
                int i2 = Util6.f6307a;
                byteBuffer.put(bArrMo4010F);
                this.f8669t.m3633A();
                Metadata metadataMo4014a = metadataDecoderMo4016b.mo4014a(this.f8669t);
                if (metadataMo4014a != null) {
                    m4017J(metadataMo4014a, list);
                }
            }
            i++;
        }
    }

    @Override // p007c.p190n.p194b.p209b.RendererCapabilities
    /* JADX INFO: renamed from: a */
    public int mo3383a(Format format) {
        if (this.f8666q.mo4015a(format)) {
            return (format.f6921J == null ? 4 : 2) | 0 | 0;
        }
        return 0;
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: c */
    public boolean mo3297c() {
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: g */
    public boolean mo3368g() {
        return this.f8664A;
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2, p007c.p190n.p194b.p209b.RendererCapabilities
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.f8667r.mo1145a((Metadata) message.obj);
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.Renderer2
    /* JADX INFO: renamed from: o */
    public void mo3369o(long j2, long j3) {
        if (!this.f8675z && this.f8673x < 5) {
            this.f8669t.mo3635x();
            FormatHolder formatHolderM3029A = m3029A();
            int iM3037I = m3037I(formatHolderM3029A, this.f8669t, false);
            if (iM3037I == -4) {
                if (this.f8669t.m3628v()) {
                    this.f8675z = true;
                } else {
                    MetadataInputBuffer metadataInputBuffer = this.f8669t;
                    metadataInputBuffer.f8663n = this.f8665B;
                    metadataInputBuffer.m3633A();
                    MetadataDecoder metadataDecoder = this.f8674y;
                    int i = Util6.f6307a;
                    Metadata metadataMo4014a = metadataDecoder.mo4014a(this.f8669t);
                    if (metadataMo4014a != null) {
                        ArrayList arrayList = new ArrayList(metadataMo4014a.f8661f.length);
                        m4017J(metadataMo4014a, arrayList);
                        if (!arrayList.isEmpty()) {
                            Metadata metadata = new Metadata(arrayList);
                            int i2 = this.f8672w;
                            int i3 = this.f8673x;
                            int i4 = (i2 + i3) % 5;
                            this.f8670u[i4] = metadata;
                            this.f8671v[i4] = this.f8669t.f7289j;
                            this.f8673x = i3 + 1;
                        }
                    }
                }
            } else if (iM3037I == -5) {
                Format format = formatHolderM3029A.f7259b;
                Objects.requireNonNull(format);
                this.f8665B = format.f6938u;
            }
        }
        if (this.f8673x > 0) {
            long[] jArr = this.f8671v;
            int i5 = this.f8672w;
            if (jArr[i5] <= j2) {
                Metadata metadata2 = this.f8670u[i5];
                int i6 = Util6.f6307a;
                Handler handler = this.f8668s;
                if (handler != null) {
                    handler.obtainMessage(0, metadata2).sendToTarget();
                } else {
                    this.f8667r.mo1145a(metadata2);
                }
                Metadata[] metadataArr = this.f8670u;
                int i7 = this.f8672w;
                metadataArr[i7] = null;
                this.f8672w = (i7 + 1) % 5;
                this.f8673x--;
            }
        }
        if (this.f8675z && this.f8673x == 0) {
            this.f8664A = true;
        }
    }

    public MetadataRenderer(MetadataOutput metadataOutput, Looper looper, MetadataDecoderFactory metadataDecoderFactory) {
        Handler handler;
        super(5);
        Objects.requireNonNull(metadataOutput);
        this.f8667r = metadataOutput;
        if (looper == null) {
            handler = null;
        } else {
            int i = Util6.f6307a;
            handler = new Handler(looper, this);
        }
        this.f8668s = handler;
        Objects.requireNonNull(metadataDecoderFactory);
        this.f8666q = metadataDecoderFactory;
        this.f8669t = new MetadataInputBuffer();
        this.f8670u = new Metadata[5];
        this.f8671v = new long[5];
    }
}
