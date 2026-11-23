package p007c.p190n.p194b.p209b.p217p1;

import java.util.ArrayDeque;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p217p1.DecoderException;
import p007c.p190n.p194b.p209b.p217p1.DecoderInputBuffer;
import p007c.p190n.p194b.p209b.p217p1.OutputBuffer;
import p007c.p190n.p194b.p209b.p252x1.SimpleSubtitleDecoder;
import p007c.p190n.p194b.p209b.p252x1.SimpleSubtitleOutputBuffer;
import p007c.p190n.p194b.p209b.p252x1.SubtitleDecoderException;
import p007c.p190n.p194b.p209b.p252x1.SubtitleInputBuffer;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.p1.i, reason: use source file name */
/* JADX INFO: compiled from: SimpleDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends OutputBuffer, E extends DecoderException> implements Decoder<I, O, E> {

    /* JADX INFO: renamed from: a */
    public final Thread f7299a;

    /* JADX INFO: renamed from: b */
    public final Object f7300b = new Object();

    /* JADX INFO: renamed from: c */
    public final ArrayDeque<I> f7301c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    public final ArrayDeque<O> f7302d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e */
    public final I[] f7303e;

    /* JADX INFO: renamed from: f */
    public final O[] f7304f;

    /* JADX INFO: renamed from: g */
    public int f7305g;

    /* JADX INFO: renamed from: h */
    public int f7306h;

    /* JADX INFO: renamed from: i */
    public I f7307i;

    /* JADX INFO: renamed from: j */
    public E f7308j;

    /* JADX INFO: renamed from: k */
    public boolean f7309k;

    /* JADX INFO: renamed from: l */
    public boolean f7310l;

    /* JADX INFO: renamed from: m */
    public int f7311m;

    /* JADX INFO: renamed from: c.n.b.b.p1.i$a */
    /* JADX INFO: compiled from: SimpleDecoder.java */
    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            SimpleDecoder simpleDecoder = SimpleDecoder.this;
            Objects.requireNonNull(simpleDecoder);
            do {
                try {
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            } while (simpleDecoder.m3641f());
        }
    }

    public SimpleDecoder(I[] iArr, O[] oArr) {
        this.f7303e = iArr;
        this.f7305g = iArr.length;
        for (int i = 0; i < this.f7305g; i++) {
            this.f7303e[i] = new SubtitleInputBuffer();
        }
        this.f7304f = oArr;
        this.f7306h = oArr.length;
        for (int i2 = 0; i2 < this.f7306h; i2++) {
            final SimpleSubtitleDecoder simpleSubtitleDecoder = (SimpleSubtitleDecoder) this;
            this.f7304f[i2] = new SimpleSubtitleOutputBuffer(new OutputBuffer.a() { // from class: c.n.b.b.x1.a
                @Override // p007c.p190n.p194b.p209b.p217p1.OutputBuffer.a
                /* JADX INFO: renamed from: a */
                public final void mo3639a(OutputBuffer outputBuffer) {
                    SimpleSubtitleDecoder simpleSubtitleDecoder2 = simpleSubtitleDecoder;
                    SubtitleOutputBuffer subtitleOutputBuffer = (SubtitleOutputBuffer) outputBuffer;
                    synchronized (simpleSubtitleDecoder2.f7300b) {
                        subtitleOutputBuffer.m4399y();
                        O[] oArr2 = simpleSubtitleDecoder2.f7304f;
                        int i3 = simpleSubtitleDecoder2.f7306h;
                        simpleSubtitleDecoder2.f7306h = i3 + 1;
                        oArr2[i3] = subtitleOutputBuffer;
                        simpleSubtitleDecoder2.m3642g();
                    }
                }
            });
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f7299a = aVar;
        aVar.start();
    }

    @Override // p007c.p190n.p194b.p209b.p217p1.Decoder
    /* JADX INFO: renamed from: b */
    public Object mo3630b() throws DecoderException {
        O oRemoveFirst;
        synchronized (this.f7300b) {
            m3643h();
            oRemoveFirst = this.f7302d.isEmpty() ? null : this.f7302d.removeFirst();
        }
        return oRemoveFirst;
    }

    @Override // p007c.p190n.p194b.p209b.p217p1.Decoder
    /* JADX INFO: renamed from: c */
    public Object mo3631c() throws DecoderException {
        I i;
        synchronized (this.f7300b) {
            m3643h();
            C2096e.m4570f(this.f7307i == null);
            int i2 = this.f7305g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f7303e;
                int i3 = i2 - 1;
                this.f7305g = i3;
                i = iArr[i3];
            }
            this.f7307i = i;
        }
        return i;
    }

    @Override // p007c.p190n.p194b.p209b.p217p1.Decoder
    /* JADX INFO: renamed from: d */
    public void mo3632d(Object obj) throws DecoderException {
        DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) obj;
        synchronized (this.f7300b) {
            m3643h();
            C2096e.m4566b(decoderInputBuffer == this.f7307i);
            this.f7301c.addLast((I) decoderInputBuffer);
            m3642g();
            this.f7307i = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract E mo3640e(I i, O o, boolean z);

    /* JADX INFO: renamed from: f */
    public final boolean m3641f() throws InterruptedException {
        SubtitleDecoderException subtitleDecoderException;
        SubtitleDecoderException subtitleDecoderException2;
        synchronized (this.f7300b) {
            while (!this.f7310l) {
                if (!this.f7301c.isEmpty() && this.f7306h > 0) {
                    break;
                }
                this.f7300b.wait();
            }
            if (this.f7310l) {
                return false;
            }
            I iRemoveFirst = this.f7301c.removeFirst();
            O[] oArr = this.f7304f;
            int i = this.f7306h - 1;
            this.f7306h = i;
            O o = oArr[i];
            boolean z = this.f7309k;
            this.f7309k = false;
            if (iRemoveFirst.m3628v()) {
                o.m3624m(4);
            } else {
                if (iRemoveFirst.m3627u()) {
                    o.m3624m(Integer.MIN_VALUE);
                }
                try {
                    subtitleDecoderException2 = (E) mo3640e(iRemoveFirst, o, z);
                } catch (OutOfMemoryError e) {
                    subtitleDecoderException = new SubtitleDecoderException("Unexpected decode error", e);
                    subtitleDecoderException2 = subtitleDecoderException;
                } catch (RuntimeException e2) {
                    subtitleDecoderException = new SubtitleDecoderException("Unexpected decode error", e2);
                    subtitleDecoderException2 = subtitleDecoderException;
                }
                if (subtitleDecoderException2 != null) {
                    synchronized (this.f7300b) {
                        this.f7308j = subtitleDecoderException2;
                    }
                    return false;
                }
            }
            synchronized (this.f7300b) {
                if (this.f7309k) {
                    o.mo3638x();
                } else if (o.m3627u()) {
                    this.f7311m++;
                    o.mo3638x();
                } else {
                    this.f7311m = 0;
                    this.f7302d.addLast(o);
                }
                m3644i(iRemoveFirst);
            }
            return true;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p217p1.Decoder
    public final void flush() {
        synchronized (this.f7300b) {
            this.f7309k = true;
            this.f7311m = 0;
            I i = this.f7307i;
            if (i != null) {
                m3644i(i);
                this.f7307i = null;
            }
            while (!this.f7301c.isEmpty()) {
                m3644i(this.f7301c.removeFirst());
            }
            while (!this.f7302d.isEmpty()) {
                this.f7302d.removeFirst().mo3638x();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3642g() {
        if (!this.f7301c.isEmpty() && this.f7306h > 0) {
            this.f7300b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends c.n.b.b.p1.e */
    /* JADX INFO: renamed from: h */
    public final void m3643h() throws E, DecoderException {
        E e = this.f7308j;
        if (e != null) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3644i(I i) {
        i.mo3635x();
        I[] iArr = this.f7303e;
        int i2 = this.f7305g;
        this.f7305g = i2 + 1;
        iArr[i2] = i;
    }

    @Override // p007c.p190n.p194b.p209b.p217p1.Decoder
    public void release() {
        synchronized (this.f7300b) {
            this.f7310l = true;
            this.f7300b.notify();
        }
        try {
            this.f7299a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
