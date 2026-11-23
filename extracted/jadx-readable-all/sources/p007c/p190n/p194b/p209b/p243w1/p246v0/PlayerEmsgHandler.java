package p007c.p190n.p194b.p209b.p243w1.p246v0;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import java.io.IOException;
import java.util.TreeMap;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.FormatHolder;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p210a2.DataReader;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.MetadataInputBuffer;
import p007c.p190n.p194b.p209b.p234u1.p236j.EventMessage;
import p007c.p190n.p194b.p209b.p234u1.p236j.EventMessageDecoder;
import p007c.p190n.p194b.p209b.p243w1.SampleDataQueue;
import p007c.p190n.p194b.p209b.p243w1.SampleQueue;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.DashManifest;

/* JADX INFO: renamed from: c.n.b.b.w1.v0.k, reason: use source file name */
/* JADX INFO: compiled from: PlayerEmsgHandler.java */
/* JADX INFO: loaded from: classes.dex */
public final class PlayerEmsgHandler implements Handler.Callback {

    /* JADX INFO: renamed from: f */
    public final Allocator f9231f;

    /* JADX INFO: renamed from: g */
    public final b f9232g;

    /* JADX INFO: renamed from: k */
    public DashManifest f9236k;

    /* JADX INFO: renamed from: l */
    public long f9237l;

    /* JADX INFO: renamed from: m */
    public boolean f9238m;

    /* JADX INFO: renamed from: n */
    public boolean f9239n;

    /* JADX INFO: renamed from: o */
    public boolean f9240o;

    /* JADX INFO: renamed from: j */
    public final TreeMap<Long, Long> f9235j = new TreeMap<>();

    /* JADX INFO: renamed from: i */
    public final Handler f9234i = Util6.m3125m(this);

    /* JADX INFO: renamed from: h */
    public final EventMessageDecoder f9233h = new EventMessageDecoder();

    /* JADX INFO: renamed from: c.n.b.b.w1.v0.k$a */
    /* JADX INFO: compiled from: PlayerEmsgHandler.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f9241a;

        /* JADX INFO: renamed from: b */
        public final long f9242b;

        public a(long j2, long j3) {
            this.f9241a = j2;
            this.f9242b = j3;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.v0.k$b */
    /* JADX INFO: compiled from: PlayerEmsgHandler.java */
    public interface b {
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.v0.k$c */
    /* JADX INFO: compiled from: PlayerEmsgHandler.java */
    public final class c implements TrackOutput2 {

        /* JADX INFO: renamed from: a */
        public final SampleQueue f9243a;

        /* JADX INFO: renamed from: b */
        public final FormatHolder f9244b = new FormatHolder();

        /* JADX INFO: renamed from: c */
        public final MetadataInputBuffer f9245c = new MetadataInputBuffer();

        /* JADX INFO: renamed from: d */
        public long f9246d = -9223372036854775807L;

        public c(Allocator allocator) {
            this.f9243a = new SampleQueue(allocator, null, null, null);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: a */
        public int mo3756a(DataReader dataReader, int i, boolean z, int i2) throws IOException {
            return this.f9243a.mo3757b(dataReader, i, z);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: b */
        public /* synthetic */ int mo3757b(DataReader dataReader, int i, boolean z) {
            return TrackOutput.m3926a(this, dataReader, i, z);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: c */
        public /* synthetic */ void mo3758c(ParsableByteArray parsableByteArray, int i) {
            TrackOutput.m3927b(this, parsableByteArray, i);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: d */
        public void mo3759d(long j2, int i, int i2, int i3, TrackOutput2.a aVar) {
            long jM4156g;
            MetadataInputBuffer metadataInputBuffer;
            long jM3101J;
            this.f9243a.mo3759d(j2, i, i2, i3, aVar);
            while (true) {
                boolean z = false;
                if (!this.f9243a.m4171v(false)) {
                    break;
                }
                this.f9245c.mo3635x();
                if (this.f9243a.m4149B(this.f9244b, this.f9245c, false, false) == -4) {
                    this.f9245c.m3633A();
                    metadataInputBuffer = this.f9245c;
                } else {
                    metadataInputBuffer = null;
                }
                if (metadataInputBuffer != null) {
                    long j3 = metadataInputBuffer.f7289j;
                    Metadata metadataMo4014a = PlayerEmsgHandler.this.f9233h.mo4014a(metadataInputBuffer);
                    if (metadataMo4014a != null) {
                        EventMessage eventMessage = (EventMessage) metadataMo4014a.f8661f[0];
                        String str = eventMessage.f8680h;
                        String str2 = eventMessage.f8681i;
                        if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                            z = true;
                        }
                        if (z) {
                            try {
                                jM3101J = Util6.m3101J(Util6.m3127o(eventMessage.f8684l));
                            } catch (ParserException unused) {
                                jM3101J = -9223372036854775807L;
                            }
                            if (jM3101J != -9223372036854775807L) {
                                a aVar2 = new a(j3, jM3101J);
                                Handler handler = PlayerEmsgHandler.this.f9234i;
                                handler.sendMessage(handler.obtainMessage(1, aVar2));
                            }
                        }
                    }
                }
            }
            SampleQueue sampleQueue = this.f9243a;
            SampleDataQueue sampleDataQueue = sampleQueue.f8995a;
            synchronized (sampleQueue) {
                int i4 = sampleQueue.f9014t;
                jM4156g = i4 == 0 ? -1L : sampleQueue.m4156g(i4);
            }
            sampleDataQueue.m4139b(jM4156g);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: e */
        public void mo3760e(Format format) {
            this.f9243a.mo3760e(format);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: f */
        public void mo3761f(ParsableByteArray parsableByteArray, int i, int i2) {
            this.f9243a.mo3758c(parsableByteArray, i);
        }
    }

    public PlayerEmsgHandler(DashManifest dashManifest, b bVar, Allocator allocator) {
        this.f9236k = dashManifest;
        this.f9232g = bVar;
        this.f9231f = allocator;
    }

    /* JADX INFO: renamed from: a */
    public final void m4252a() {
        if (this.f9238m) {
            this.f9239n = true;
            this.f9238m = false;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.f28318G.removeCallbacks(dashMediaSource.f28344z);
            dashMediaSource.m12624F();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f9240o) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        long j2 = aVar.f9241a;
        long j3 = aVar.f9242b;
        Long l = this.f9235j.get(Long.valueOf(j3));
        if (l == null || l.longValue() > j2) {
            this.f9235j.put(Long.valueOf(j3), Long.valueOf(j2));
        }
        return true;
    }
}
