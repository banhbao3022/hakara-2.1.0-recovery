package p007c.p190n.p194b.p209b.p215n1;

import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;

/* JADX INFO: renamed from: c.n.b.b.n1.s, reason: use source file name */
/* JADX INFO: compiled from: AudioSink.java */
/* JADX INFO: loaded from: classes.dex */
public interface AudioSink {

    /* JADX INFO: renamed from: c.n.b.b.n1.s$b */
    /* JADX INFO: compiled from: AudioSink.java */
    public static final class b extends Exception {

        /* JADX INFO: renamed from: f */
        public final boolean f7118f;

        /* JADX INFO: renamed from: g */
        public final Format f7119g;

        public b(int i, int i2, int i3, int i4, Format format, boolean z, Exception exc) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack init failed ");
            sb.append(i);
            sb.append(" ");
            sb.append("Config(");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(")");
            sb.append(z ? " (recoverable)" : "");
            super(sb.toString(), exc);
            this.f7118f = z;
            this.f7119g = format;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.n1.s$c */
    /* JADX INFO: compiled from: AudioSink.java */
    public interface c {
    }

    /* JADX INFO: renamed from: c.n.b.b.n1.s$d */
    /* JADX INFO: compiled from: AudioSink.java */
    public static final class d extends Exception {

        /* JADX INFO: renamed from: f */
        public final boolean f7120f;

        /* JADX INFO: renamed from: g */
        public final Format f7121g;

        public d(int i, Format format, boolean z) {
            super(outline.m1590l("AudioTrack write failed: ", i));
            this.f7120f = z;
            this.f7121g = format;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.n1.s$a */
    /* JADX INFO: compiled from: AudioSink.java */
    public static final class a extends Exception {

        /* JADX INFO: renamed from: f */
        public final Format f7117f;

        public a(Throwable th, Format format) {
            super(th);
            this.f7117f = format;
        }

        public a(String str, Format format) {
            super(str);
            this.f7117f = format;
        }
    }
}
