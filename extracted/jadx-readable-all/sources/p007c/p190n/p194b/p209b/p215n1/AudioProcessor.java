package p007c.p190n.p194b.p209b.p215n1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.n1.p, reason: use source file name */
/* JADX INFO: compiled from: AudioProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public interface AudioProcessor {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f7109a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: renamed from: c.n.b.b.n1.p$a */
    /* JADX INFO: compiled from: AudioProcessor.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f7110a = new a(-1, -1, -1);

        /* JADX INFO: renamed from: b */
        public final int f7111b;

        /* JADX INFO: renamed from: c */
        public final int f7112c;

        /* JADX INFO: renamed from: d */
        public final int f7113d;

        /* JADX INFO: renamed from: e */
        public final int f7114e;

        public a(int i, int i2, int i3) {
            this.f7111b = i;
            this.f7112c = i2;
            this.f7113d = i3;
            this.f7114e = Util6.m3096E(i3) ? Util6.m3137y(i3, i2) : -1;
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("AudioFormat[sampleRate=");
            sbM1556G.append(this.f7111b);
            sbM1556G.append(", channelCount=");
            sbM1556G.append(this.f7112c);
            sbM1556G.append(", encoding=");
            sbM1556G.append(this.f7113d);
            sbM1556G.append(']');
            return sbM1556G.toString();
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.n1.p$b */
    /* JADX INFO: compiled from: AudioProcessor.java */
    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo3533a();

    /* JADX INFO: renamed from: b */
    ByteBuffer mo3546b();

    /* JADX INFO: renamed from: c */
    void mo3522c(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: d */
    a mo3547d(a aVar) throws b;

    /* JADX INFO: renamed from: e */
    void mo3548e();

    void flush();

    /* JADX INFO: renamed from: g */
    boolean mo3549g();

    void reset();
}
